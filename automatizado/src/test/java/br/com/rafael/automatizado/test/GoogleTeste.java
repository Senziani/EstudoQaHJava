package br.com.rafael.automatizado.test;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTeste {

    private final String chDriver = "src//test//java//br//com//rafael//resource//chromedriver.exe";

    private final String urlCaminho = "https://www.google.com.br/";

    private WebDriver driver;

    private void init() {
        System.setProperty("webdriver.chrome.driver", chDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(urlCaminho);
    }

    @Test
    public void deveAbrirGoogle() {
        init();

        WebElement inputpesquisa = driver.findElement(By.name("q"));
        inputpesquisa.sendKeys("Batata-Frita" + Keys.ENTER);

        String verificaElemento = driver.findElement(By.id("result-stats")).getText();
        assertTrue(verificaElemento.contains("Aproximadamente"),verificaElemento);


        driver.close();
    }

}
