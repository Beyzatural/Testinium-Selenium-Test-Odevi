package com.testinium.constants;

import org.openqa.selenium.By;

public class Constants {

    public static final By ACC = By.xpath("//div[@class='menu-top-button login']");
    public static final By EMAİL = By.id("login-email");
    public static final By PASSWORD = By.id("login-password");
    public static final By BTN_LOGIN = By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn");
    public static final By SEARCH = By.id("search-input");
    public static final By ASD = By.className("product-cr");
    public static final By LOGO_HOME = By.cssSelector(".logo-text>a>img");
    public static final By POINTS = By.className("lvl1catalog");
    public static final By FILTER = By.className("sort");
    public static final By LISTS_FAV = By.className("my-list");
    public static final By FAV_LIST_ADD = By.xpath("//*[@id=\"content\"]/div[1]/div[3]/div[2]/div");
    public static final By PRODUCT_LIST = By.className("mg-b-10");
    public static final By SIZE = By.xpath("//*[@id=\"cart_module\"]/div[1]/table/tbody/tr/td[4]/form/input[1]");
    public static final By BTN_REFRESH = By.xpath("//*[@id=\"cart_module\"]/div[1]/table/tbody/tr/td[4]/form/i");
    public static final By NAME = By.xpath("//*[@id=\"address-firstname-companyname\"]");
    public static final By LASTNAME = By.xpath("//*[@id=\"address-lastname-title\"]");
    public static final By CITY = By.xpath("//*[@id=\"address-zone-id\"]");
    public static final By DISTRICT = By.xpath("//*[@id=\"address-county-id\"]");
    public static final By STREET = By.xpath("//*[@id=\"district\"]");
    public static final By ADRESS = By.xpath("//*[@id=\"address-address-text\"]");
    public static final By POST_CODE  = By.xpath("//*[@id=\"address-postcode\"]");
    public static final By LAND_PHONE = By.xpath("//*[@id=\"address-telephone\"]");
    public static final By MOBILE_PHONE = By.xpath("//*[@id=\"address-mobile-telephone\"]");
    public static final By CONTINUE = By.xpath("//*[@id=\"button-checkout-continue\"]");
    public static final By NEW_ADD = By.xpath("//*[@id=\"shipping-tabs\"]/a[2]");
    public static final By CARGO = By.xpath("//*[@id=\"tab-shipping-companies-non\"]/table/tbody/tr[6]/td[2]/label");
    public static final By CARDOWNER  = By.xpath("//*[@id=\"credit-card-owner\"]");
    public static final By CARDNUMBERONE = By.xpath("//*[@id=\"credit_card_number_1\"]");
    public static final By CARDNUMBERTWO = By.xpath("//*[@id=\"credit_card_number_2\"]");
    public static final By CARDNUMBERTHREE = By.xpath("//*[@id=\"credit_card_number_3\"]");
    public static final By CARDNUMBERFOUR = By.xpath("//*[@id=\"credit_card_number_4\"]");
    public static final By CVV  = By.xpath("//*[@id=\"credit-card-security-code\"]");

}
