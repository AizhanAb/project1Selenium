package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {


    @Test
    public void one() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
        String actualURL = driver.getTitle();
        String expectedURL = "Web Orders Login";
        Assert.assertEquals(actualURL, expectedURL, "test failed");
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        WebElement button = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        Thread.sleep(1000);
        button.click();

        String newTitle = driver.getTitle();
        String expectedNewTitle = "Web Orders";
        Assert.assertEquals(newTitle, expectedNewTitle);
        String header = driver.findElement(By.tagName("h2")).getText();
        String expectedHeader = "List of All Orders";
        Assert.assertEquals(header, expectedHeader);
    }

    @Test
    public void two() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
        String actualURL = driver.getTitle();
        String expectedURL = "Web Orders Login";
        Assert.assertEquals(actualURL, expectedURL, "test failed");
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        WebElement button = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        Thread.sleep(1000);
        button.click();

        WebElement link = driver.findElement(By.xpath("//a[@href='Products.aspx']"));
        link.click();

        String newURL = driver.getCurrentUrl();
        boolean checkURL = newURL.contains("Products");
        Assert.assertEquals(checkURL, true);
        String header2 = driver.findElement(By.tagName("h2")).getText();
        String expectedHeader2 = "List of Products";
        Assert.assertEquals(header2, expectedHeader2);

//Assert.assertEquals(link.isSelected(), true);
    }

    @Test
    public void three() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
        String actualURL = driver.getTitle();
        String expectedURL = "Web Orders Login";
        Assert.assertEquals(actualURL, expectedURL, "test failed");
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        WebElement button = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        Thread.sleep(1000);
        button.click();

        WebElement link1 = driver.findElement(By.xpath("//a[@href='Default.aspx']"));
        WebElement link2 = driver.findElement(By.xpath("//a[@href='Products.aspx']"));
        WebElement link3 = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        //System.out.println(link1.getAccessibleName());
        System.out.println(link1.getDomAttribute("href"));

        Assert.assertEquals(link1.getDomAttribute("href"), "Default.aspx");
        Assert.assertEquals(link2.getDomAttribute("href"), "Products.aspx");
        Assert.assertEquals(link3.getDomAttribute("href"), "Process.aspx");

    }

    @Test
    public void four() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
        String actualURL = driver.getTitle();
        String expectedURL = "Web Orders Login";
        Assert.assertEquals(actualURL, expectedURL, "test failed");
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        WebElement button = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        Thread.sleep(1000);
        button.click();

        WebElement link1 = driver.findElement(By.xpath("//a[@href='Default.aspx']"));
        WebElement link2 = driver.findElement(By.xpath("//a[@href='Products.aspx']"));
        WebElement order = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        Thread.sleep(1000);
        order.click();
        WebElement product = driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']"));
        product.click();
        WebElement screenSaver = driver.findElement(By.xpath("//option[@value='ScreenSaver']"));
        screenSaver.click();
        WebElement input = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
        input.sendKeys("5");
        WebElement name = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
        name.sendKeys("Techtorial Academy");
        WebElement address = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
        address.sendKeys("2200 E devon");
        WebElement city = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
        city.sendKeys("Des Plaines");
        WebElement state = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
        state.sendKeys("Illinois");
        WebElement zipСode = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
        zipСode.sendKeys("60018");
        WebElement radio = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$cardList']"));
        radio.click();
        WebElement cardNumber = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
        cardNumber.sendKeys("444993876233");
        WebElement expDate = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
        expDate.sendKeys("03/21");

        WebElement button1 = driver.findElement(By.xpath("//a[.='Process']"));
       button1.click();
       WebElement strong = driver.findElement(By.tagName("strong"));
       Assert.assertEquals(strong.getText(),"New order has been successfully added.");
       link1 = driver.findElement(By.xpath("//a[@href='Default.aspx']"));
       link1.click();
       List<WebElement> ourInput= driver.findElements(By.xpath("//tbody[1]//tr[2]//td"));

       String exresult=", Techtorial Academy, ScreenSaver, 5, 02/13/2022, 2200 E devon," +
               " Des Plaines, Illinois, 60018, Visa, 444993876233, 03/21, ";
       List <String> expectedInput= Arrays.asList((exresult.split(",")));
       for(int i=0; i<ourInput.size(); i++){
           System.out.println(ourInput.get(i).getText());
           Assert.assertEquals(ourInput.get(i).getText(),expectedInput.get(i).trim());
       }


    }
}
