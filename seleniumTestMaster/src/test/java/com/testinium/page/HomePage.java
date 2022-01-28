package com.testinium.page;

import com.testinium.base.BasePage;
import com.testinium.constants.Constants;
import org.openqa.selenium.*;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;


public class HomePage extends BasePage {

    Logger logger = Logger.getLogger("com.testinium.page.HomePage");
    WebDriver webDriver = null;

    public HomePage(WebDriver driver) {
        super(driver);
        webDriver = driver;
    }

    public HomePage account(String email, String password) throws InterruptedException {
        logger.info("Login yapılarak hesabım sayfası kontrol edildi.");
        findElement(Constants.ACC).click();
        findElement(Constants.EMAİL).sendKeys(email);
        findElement(Constants.PASSWORD).sendKeys(password);
        findElement(Constants.BTN_LOGIN).click();
        Thread.sleep(6000);
        return this;
    }

    public HomePage searchProduct(String product) throws InterruptedException {
        logger.info("Oyuncak ürünü aratılır.");
        findElement(Constants.SEARCH).sendKeys(product);
        findElement(Constants.SEARCH).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        return this;
    }

    public HomePage asd() throws InterruptedException {
        logger.info("Sayfada yer alan 7.ürüne scroll yapılır ve 4 ürün favorilerime eklenir");
        List<WebElement> wList = webDriver.findElements(Constants.ASD);
        scrollDown(wList.get(6));
        for (int i = 6; i < wList.size(); i++) {

            WebElement element = wList.get(i)
                    .findElement(By.className("grid_2"))
                    .findElement(By.className("hover-menu"))
                    .findElement(By.className("add-to-favorites"));

            JavascriptExecutor executor = (JavascriptExecutor) webDriver;
            executor.executeScript("arguments[0].click();", element);

            if (i == 9) {
                break;
            }
        }
        Thread.sleep(4000);
        return this;
    }


    public HomePage homeLogin() throws InterruptedException {
        logger.info("Favoriler kontrol edildikten sonra anasayfaya geri dönülür.");
        findElement(Constants.LOGO_HOME).click();
        Thread.sleep(4000);
        return this;
    }

    public HomePage pointsCatalog() throws InterruptedException {
        logger.info("Puan Kataloguna gidilir.");
        findElement(Constants.POINTS).click();
        Thread.sleep(4000);
        return this;
    }

    public HomePage selectCart() throws InterruptedException {
        logger.info("Türk klasikleri seçilir.");
        WebElement element = findElement(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        scrollDown(element);
        Thread.sleep(4000);
        element.click();
        return this;
    }

    public HomePage filtering() throws InterruptedException {
        logger.info("Açılan sayfada filtreleme alanından “Yüksek Oylama” seçimi yapılır.");
        WebElement element1 = findElement(Constants.FILTER);
        element1.findElement(By.xpath("//div[@class='sort']//select[@onchange='location = this.value;']")).click();
        element1.findElement(By.xpath("//div[@class='sort']//select//option[contains(text(),'Yüksek Oylama')]")).click();
        Thread.sleep(4000);
        return this;
    }

    public HomePage hobbyAllBooks() throws InterruptedException {
        logger.info("Tüm kitaplar>Hobi tıklanır.");
        findElement(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/span")).click();
        WebElement element = findElement(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(4000);
        return this;
    }

    public HomePage selectProduct() throws InterruptedException {
        logger.info("Sayfadan random ürün seçimi yapılır sepete eklenir.");
        WebElement p = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div"));
        List<WebElement> pList = p.findElements(Constants.PRODUCT_LIST);
        Random r = new Random();
        int randomValue = r.nextInt(30);
        WebElement element = pList.get(randomValue)
                .findElement(By.className("hover-menu"))
                .findElement(By.className("add-to-cart"));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(4000);
        return this;
    }

    public HomePage favControl() throws InterruptedException {
        logger.info("Listelerim>Favorilerim gidilir.");
        WebElement element1 = findElement(Constants.LISTS_FAV);
        element1.findElement(By.className("common-sprite")).click();
        element1.findElement(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a")).click();
        Thread.sleep(4000);
        return this;
    }

    public HomePage favDel() throws InterruptedException {
        logger.info("Favori Listesinde yer alan , 3.ürün silinir.");
        findElement(Constants.FAV_LIST_ADD).click();
        findElement(By.xpath("//div[@class='product-cr'][3]//a[@data-title='Favorilerimden Sil']")).click();
        Thread.sleep(4000);
        return this;
    }

    public HomePage goToCart() throws InterruptedException {
        logger.info("Sepetime gidilir.");
        findElement(By.xpath("//*[@id=\"cart\"]/div[1]")).click();
        WebElement element = findElement(By.xpath("//*[@id=\"js-cart\"]"));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(4000);
        return this;
    }

    public HomePage productIncreases(String size) throws InterruptedException {
        logger.info("Sepette ürün adedinde artırımı gerçekleştirilir.");
        webDriver.findElement(Constants.SIZE).clear(); // Kutucukta yazılı olan adeti silerek kendi istediğim adeti yazdırdım ve güncelleme işlemini yaptım.
        findElement(Constants.SIZE).sendKeys(size);
        WebElement element = findElement(Constants.BTN_REFRESH);
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(6000);
        return this;
    }

    public HomePage buyProduct() throws InterruptedException {
        logger.info("Ürün satın al tıklanır.");
        findElement(By.xpath("//*[@id=\"cart_module\"]/div[1]/table/thead/tr/td[8]")).click();
        Thread.sleep(4000);
        return this;
    }

    public HomePage newAddress(String name, String lastname, String street, String adress, String postacode, String landphone, String mobılephone) throws InterruptedException {
        logger.info("Yeni adres bilgileri kaydedilir.");
        findElement(Constants.NEW_ADD).click();
        findElement(Constants.NAME).sendKeys(name);
        findElement(Constants.LASTNAME).sendKeys(lastname);
        findElement(Constants.CITY).click();
        findElement(By.xpath("//*[@id=\"address-zone-id\"]/option[53]")).click();
        findElement(Constants.DISTRICT).click();
        findElement(By.xpath("//*[@id=\"address-county-id\"]/option[4]")).click();
        findElement(Constants.STREET).sendKeys(street);
        findElement(Constants.ADRESS).sendKeys(adress);
        findElement(Constants.POST_CODE).sendKeys(postacode);
        findElement(Constants.LAND_PHONE).sendKeys(landphone);
        findElement(Constants.MOBILE_PHONE).sendKeys(mobılephone);
        WebElement element = findElement(Constants.CONTINUE);
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
        findElement(Constants.CARGO).click();
        findElement(By.xpath("//*[@id=\"button-checkout-continue\"]")).click();
        Thread.sleep(6000);
        return this;
    }

    public HomePage productPurchase(String cardowner, String cardnumberone, String cardnumbertwo , String cardnumberthree, String cardnumberfour, String cvv) throws InterruptedException {
        logger.info("Bakiyesiz kart ile ürün alımı gerçekleştirilir.");
        findElement(Constants.CARDOWNER).sendKeys(cardowner);
        findElement(Constants.CARDNUMBERONE).sendKeys(cardnumberone);
        findElement(Constants.CARDNUMBERTWO).sendKeys(cardnumbertwo);
        findElement(Constants.CARDNUMBERTHREE).sendKeys(cardnumberthree);
        findElement(Constants.CARDNUMBERFOUR).sendKeys(cardnumberfour);
        findElement(By.xpath("//*[@id=\"credit-card-expire-date-month\"]")).click();
        findElement(By.xpath("//*[@id=\"credit-card-expire-date-month\"]/option[8]")).click();
        findElement(By.xpath("//*[@id=\"credit-card-expire-date-year\"]")).click();
        findElement(By.xpath("//*[@id=\"credit-card-expire-date-year\"]/option[7]")).click();
        findElement(Constants.CVV).sendKeys(cvv);
        Thread.sleep(4000);
        WebElement element = findElement(Constants.CONTINUE);
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(4000);
        logger.info("Sipariş onay.");
        findElement(By.xpath("//*[@id=\"terms-and-conditions-form\"]/div/input")).click();
        findElement(By.xpath("//*[@id=\"checkout-payment-form\"]/form/div/div/input")).click();
        logger.info("yetersiz bakiye olduğu için ödeme sayfasına yönlendirilir.");
        Thread.sleep(5000);
        return this;
    }

    public HomePage backToPage() throws InterruptedException {
        logger.info("Logout olabilmek için anasayfaya geri dönülür.");
        WebElement element = findElement(By.xpath("//*[@id=\"logo\"]/a"));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(6000);
        return this;
    }

    public HomePage logout() throws InterruptedException {
        logger.info("Logout olunur.");
      findElement(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/a")).click();
        WebElement element =  findElement(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(4000);
        return this;
    }

}


