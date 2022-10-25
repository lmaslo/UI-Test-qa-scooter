package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
    WebDriver driver = new ChromeDriver();

    @Before
    public void openURL() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    //@After
    public void closeBrowser() {
        driver.quit();
    }


}
