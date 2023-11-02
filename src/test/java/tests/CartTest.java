package tests;

import dataprovider.LoginData;
import helpers.BrowserSetup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageoperations.CartOperations;
import pageoperations.LoginOperations;
import pageoperations.ProductsOperations;


public class CartTest {


    @BeforeTest
    public static void login(){
        BrowserSetup.setup();
    }

    @Test(dataProvider ="LoginCredentials", dataProviderClass = LoginData.class, priority=1)
    public static void loginPage(String username,String password){
        LoginOperations.login(username,password);
        ProductsOperations.addToCart();
        CartOperations.clickCart();

    }

}
