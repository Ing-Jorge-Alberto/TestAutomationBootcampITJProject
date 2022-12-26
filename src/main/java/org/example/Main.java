package org.example;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/jxc0622/Documents/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String browserTitle = driver.getTitle();
        System.out.println(browserTitle);
        String browserURL= driver.getCurrentUrl();
        System.out.println(browserURL);
        /* Locators
        *Categories = //a[@id='cat'] - Xpath
        *Phones = driver.findElement(By.linkText("Phones")) - By link
        * //a[@class='list-group-item'][2]
        *Laptops = driver.findElement(By.linkText("Laptops")) - By link
        * //a[@class='list-group-item'][3]
        *Monitors = driver.findElement(By.linkText("Monitors")) - By link
        * //a[@class='list-group-item'][4]
        */
        //Valido el texto CATEGORIES
        //String categoriesText = driver.findElement(By.id("cat")).getText();
/*        String categoriesText = driver.findElement(By.xpath("//a[@id='cat']")).getText();
        System.out.println(categoriesText);
        //Valido el texto Phones
        //String phonesText = driver.findElement(By.linkText("Phones")).getText();
        String phonesText = driver.findElement(By.xpath("//a[@class='list-group-item'][2]")).getText();
        System.out.println("Xpath "+phonesText);
        //Valido el texto Laptops
        String laptopsText = driver.findElement(By.linkText("Laptops")).getText();
        System.out.println("Link Text "+laptopsText);
        //Valido el texto Monitors
        String monitorsText = driver.findElement(By.xpath("//a[@class='list-group-item'][4]")).getText();
        System.out.println("Xpath "+monitorsText);
        Thread.sleep(2000);
        driver.close();
    }
}
*/