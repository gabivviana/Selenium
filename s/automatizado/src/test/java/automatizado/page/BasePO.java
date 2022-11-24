package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/**
 * - Classe base para criação de novas PagesObjects
 * - Todas as pages devem ser herdadas desta classe
 */

public abstract class BasePO {
    /** Driver base que será usado pelas pages */
    protected WebDriver driver;

    /** 
     * Contrutor base para criação da fábrica de elementos (PageFactory)
     * @param driver Driver da página atual.
     */
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
}
