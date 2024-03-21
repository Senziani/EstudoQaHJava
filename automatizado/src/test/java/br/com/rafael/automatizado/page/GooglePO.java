package br.com.rafael.automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePo {

    @FindBy(name = "q")
    public WebElement inputpesquisa;

    @FindBy(id = "result-stats")
    public WebElement divVerificaElemento;

    /**
     * Contrutor para crianção da pagina do Google
     * 
     * @param driver Driver da pagina do Google
     */
    public GooglePO(WebDriver driver) {
        super(driver);

    }

    /**
     * Metodo que ira efetuar uma pesquisa no google, basesando no texto informado e
     * concluindo com enter
     * 
     * @param texto a ser pesquisado
     */
    public void pesquisar(String texto) {
        inputpesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Metodo que retorna o resultado aproximado da pesquisa
     * 
     * @return o resultado da pesquisa
     */
    public String obterResultadoPesquisa() {
        return divVerificaElemento.getText();
    }

}
