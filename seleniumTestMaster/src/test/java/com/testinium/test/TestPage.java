package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPage extends BaseTest {

    HomePage homePage;

    @Before
    public void before() {
        homePage = new HomePage(getWebDriver());
    }

    @Test
    public void test() {
        try{
            homePage
                    .account("testdenemesiselenium@gmail.com", "024689beyza")
                    .searchProduct("oyuncak")
                    .asd()
                    .homeLogin()
                    .pointsCatalog()
                    .selectCart()
                    .filtering()
                    .hobbyAllBooks()
                    .selectProduct()
                    .favControl()
                    .favDel()
                    .goToCart()
                    .productIncreases("4")
                    .buyProduct()
                    .newAddress("beyzanur",
                            "Tural",
                            "FEVZİÇAKMAK MAH",
                            "Fevziçakmak Mahallesi, Dr. Zeki Acar Cd. No:62,",
                            "41700",
                            "2626558399" ,
                            "5553661332")
                    .productPurchase("beyzanur tural",
                            "4111" ,
                            "1111" ,
                            "1111" ,
                            "1129" ,
                            "077")
                    .backToPage()
                    .logout();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @After
    public void after(){
        //down();
    }
}
