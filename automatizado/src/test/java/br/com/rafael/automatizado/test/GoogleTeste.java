package br.com.rafael.automatizado.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.Keys;

import br.com.rafael.automatizado.page.GooglePO;

public class GoogleTeste extends BaseTest {

    private static GooglePO googlePage;

    @BeforeAll
    public static void prepararTeste() {
        googlePage = new GooglePO(driver);
    }

    @Test
    public void deveAbrirGoogle() {

        // WebElement inputpesquisa = driver.findElement(By.name("q"));
        // googlePage.inputpesquisa.sendKeys("Batata-Frita" + Keys.ENTER);

        googlePage.pesquisar("Batata-Frita");

        String verificaElemento = googlePage.obterResultadoPesquisa();

        assertTrue(verificaElemento.contains("Aproximadamente"), verificaElemento);

    }

    @Test
    public void deveAbrirGoogle2() {

        // WebElement inputpesquisa = driver.findElement(By.name("q"));
        googlePage.pesquisar("Batata-Frita");

        String verificaElemento = googlePage.divVerificaElemento.getText();
        assertTrue(verificaElemento.contains("resultados"), verificaElemento);

    }

}
