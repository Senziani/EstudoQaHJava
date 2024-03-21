package br.com.rafael.automatizado.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * Classse base para criação das novas pages Objects.
 * Todas as pages devem ser herdadas dessa classe
 */

public abstract class BasePo {

    /** driver base que sera usado nas pages */
    protected WebDriver driver;


    /**
     * Contrutor base para criação da fabrica de elementos(PageFactory)
     * @param driver Driver da pagina atual
     */
    protected BasePo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
