package tests;

import dataprovider.LoginData;
import helpers.BrowserSetup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageoperations.LoginOperations;
import pageoperations.ProductsOperations;

public class AddToCartTest {


    @BeforeClass
    public static void BrowserLaunch(){
        BrowserSetup.setup();
    }
    @Test(dataProvider ="LoginCredentials", dataProviderClass = LoginData.class)
    public static void addItemToCart(String username,String password){
        LoginOperations.login(username,password);
        ProductsOperations.addToCart();

    }

}
