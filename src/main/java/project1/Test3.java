package project1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {
    @Test
    public static void t3() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        List<WebElement> pic = driver.findElements(By.xpath("//a[@itemprop='url' ] //img[@alt='Faded Short Sleeve T-shirts'] "));
        Actions actions = new Actions(driver);
        List<WebElement> uniquePicture = new ArrayList<>();
        for (WebElement picture : pic) {
            if (picture.isDisplayed()) {
                uniquePicture.add(picture);
                actions.moveToElement(uniquePicture.get(0)).perform();


                List<WebElement> button = driver.findElements(By.xpath("//a[@title='Add to cart' and @data-id-product='1']"));
                //div[@class='button-container']//a[@data-id-product='1']
                //button.click();

                List<WebElement> uniqueButton = new ArrayList<>();
                for (WebElement addCart : button) {
                    if (addCart.isDisplayed()) {
                        uniqueButton.add(addCart);
                    }
                }

                boolean actualAddCart = uniqueButton.get(0).isDisplayed();
                Assert.assertTrue(actualAddCart);
                uniqueButton.get(0).click();
                WebElement textValid = driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2"));
                String expectedText = "Product successfully added to your shopping cart";
                Thread.sleep(1000);
                String actualText = textValid.getText().trim();
                Assert.assertEquals(actualText, expectedText);
                String actualColor = textValid.getCssValue("color");
                String expextedColor = "rgba(70, 167, 78, 1)";
                Assert.assertEquals(actualColor, expextedColor);

            }
        }
    }

    @Test
    public void t1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement shopCart = driver.findElement(By.xpath("//div[@class='shopping_cart']//*[.='(empty)']"));
        String actualShopping = shopCart.getText();
        String expectedShopping = "(empty)";
        Assert.assertEquals(actualShopping, expectedShopping);
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='right-block']//span[@itemprop='price']"));
        System.out.println(allProducts);
        List<Double> listDouble = new ArrayList<>();

        double total = 196.38;
        double actualTotal = 0;

        for (WebElement price : allProducts) {
            if (price.isDisplayed()) {
                actualTotal += Double.parseDouble(price.getText().replace("$", " ").trim());
            }

        }
        System.out.println(actualTotal);
        Assert.assertEquals(actualTotal, total);

    }

    @Test
    public static void t2() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement shopCart = driver.findElement(By.xpath("//div[@class='shopping_cart']//*[.='(empty)']"));
        String actualShopping = shopCart.getText();
        String expectedShopping = "(empty)";
        Assert.assertEquals(actualShopping, expectedShopping);
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='right-block']//span[@itemprop='price']"));
        System.out.println(allProducts);
        List<Double> listDouble = new ArrayList<>();

        double total = 196.38;
        double actualTotal = 0;

        for (WebElement price : allProducts) {
            if (price.isDisplayed()) {
                listDouble.add(Double.parseDouble(price.getText().replace("$", " ").trim()));
            }

        }
        System.out.println(listDouble.get(0));
    }

    @Test
    public static void t4() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
        Actions actions= new Actions(driver);
        actions.moveToElement(women).perform();
        List <WebElement> dresses=driver.findElements(By.xpath("//a[.='Summer Dresses']"));
        for(WebElement d:dresses){
            Thread.sleep(3000);
            if(d.isDisplayed()){
                d.click();
                break;

            }
        }



        List<WebElement> pic = driver.findElements(By.xpath("//a[@itemprop='url' ] //img[@alt='Printed Summer Dress'] "));

        List<WebElement> uniquePicture = new ArrayList<>();
        for (WebElement picture : pic) {
            if (picture.isDisplayed()) {
                uniquePicture.add(picture);
                actions.moveToElement(uniquePicture.get(0)).perform();
            }
        }


                List<WebElement> button = driver.findElements(By.xpath("//a[@title='Add to cart' and @data-id-product='5']"));
                //div[@class='button-container']//a[@data-id-product='1']
                //button.click();

                List<WebElement> uniqueButton = new ArrayList<>();
                for (WebElement addCart : button) {
                    if (addCart.isDisplayed()) {
                        uniqueButton.add(addCart);
                    }
                }

                boolean actualAddCart = uniqueButton.get(0).isDisplayed();
                Assert.assertTrue(actualAddCart);
                uniqueButton.get(0).click();
                WebElement textValid = driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2"));
                String expectedText = "Product successfully added to your shopping cart";
                Thread.sleep(1000);
                String actualText = textValid.getText().trim();
                Assert.assertEquals(actualText, expectedText);
                String actualColor = textValid.getCssValue("color");
                String expextedColor = "rgba(70, 167, 78, 1)";
                Assert.assertEquals(actualColor, expextedColor);

    }
    @Test
    public static void t5() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
        Actions actions= new Actions(driver);
        actions.moveToElement(women).perform();
        List <WebElement> dresses=driver.findElements(By.xpath("//a[.='Summer Dresses']"));
        for(WebElement d:dresses){
            Thread.sleep(3000);
            if(d.isDisplayed()){
                d.click();
                break;

            }
        }



        List<WebElement> pic = driver.findElements(By.xpath("//a[@itemprop='url' ] //img[@alt='Printed Summer Dress'] "));

        List<WebElement> uniquePicture = new ArrayList<>();
        for (WebElement picture : pic) {
            if (picture.isDisplayed()) {
                uniquePicture.add(picture);
                actions.moveToElement(uniquePicture.get(0)).perform();
            }
        }


        List<WebElement> button = driver.findElements(By.xpath("//a[@title='Add to cart' and @data-id-product='5']"));
        //div[@class='button-container']//a[@data-id-product='1']
        //button.click();

        List<WebElement> uniqueButton = new ArrayList<>();
        for (WebElement addCart : button) {
            if (addCart.isDisplayed()) {
                uniqueButton.add(addCart);
            }
        }

        boolean actualAddCart = uniqueButton.get(0).isDisplayed();
        Assert.assertTrue(actualAddCart);
        uniqueButton.get(0).click();
        WebElement close = driver.findElement(By.xpath("//span[@title='Close window']"));
       Thread.sleep(2000);
        close.click();
        WebElement arrowShoppingCart=driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
        actions.moveToElement(arrowShoppingCart).perform();
        WebElement itemInShoppingCart = driver.findElement(By.xpath("//a[@class='cart-images']"));
        itemInShoppingCart.click();
        WebElement plusIcon = driver.findElement(By.xpath("//i[@class='icon-plus']"));
        plusIcon.click();
        Thread.sleep(2000);
        WebElement addButton2 = driver.findElement(By.xpath("//button[@class='exclusive']"));
        addButton2.click();
        Thread.sleep(2000);
        close = driver.findElement(By.xpath("//span[@title='Close window']"));

        WebElement totalProducts = driver.findElement(By.xpath("//span[@class='ajax_block_products_total']"));
        WebElement totalAll = driver.findElement(By.xpath("//span[@class='ajax_block_cart_total']"));
        WebElement shipping = driver.findElement(By.xpath("//span[@class='ajax_cart_shipping_cost']"));

        String expecTotalALL="$88.94";
        String expexTotalProducts="$86.94";
        String expectShipping="$2.00";

        Assert.assertEquals(totalProducts.getText(), expexTotalProducts);
        Assert.assertEquals(totalAll.getText(), expecTotalALL);
        Assert.assertEquals(shipping.getText(), expectShipping);
        close.click();
        Thread.sleep(2000);
       WebElement ShoppingCart=driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
       ShoppingCart.click();
        Thread.sleep(2000);
        WebElement  minusIcon= driver.findElement(By.xpath("//i[@class='icon-minus']"));
       minusIcon.click();
        Thread.sleep(2000);
        WebElement totalInsideCart=driver.findElement(By.xpath("//td[@class='cart_total']"));
        String updatedTotal="$57.96";
        Assert.assertEquals(totalInsideCart.getText(), updatedTotal);


    }

    @Test
    public static void t6() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
        Actions actions= new Actions(driver);
        actions.moveToElement(women).perform();
        List <WebElement> summerdresses=driver.findElements(By.xpath("//a[.='Summer Dresses']"));
        for(WebElement d:summerdresses){
            Thread.sleep(2000);
            if(d.isDisplayed()){
                d.click();
                break;

            }
        }

        List <WebElement> dresses=driver.findElements(By.xpath("//a[@class='product_img_link']"));
        Thread.sleep(2000);
        int expecDresses=3;
       Assert.assertEquals(dresses.size(), expecDresses);
       WebElement productCount=driver.findElement(By.xpath("//div[@class='product-count']"));
       String expectedproductCount="Showing 1 - 3 of 3 items";
       Assert.assertEquals(productCount.getText(), expectedproductCount);
       WebElement slider=driver.findElement(By.id("layered_price_slider"));

       actions.clickAndHold(slider);


    }
    }