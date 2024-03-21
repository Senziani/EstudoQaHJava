package br.com.rafael.automatizado.test;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class GoogleTeste extends BaseTest {

    @Test
    public void deveAbrirGoogle() {

        WebElement inputpesquisa = driver.findElement(By.name("q"));
        inputpesquisa.sendKeys("Batata-Frita" + Keys.ENTER);

        String verificaElemento = driver.findElement(By.id("result-stats")).getText();
        assertTrue(verificaElemento.contains("Aproximadamente"),verificaElemento);

    }

}
