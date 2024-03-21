package br.com.rafael.automatizado.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    private static final String chDriver = "src//test//java//br//com//rafael//resource//chromedriver.exe";

    private static final String urlCaminho = "https://www.google.com.br/";

    protected static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", chDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(urlCaminho);
    }
    @AfterAll 
    public static void close(){
        driver.quit();
    }


}
