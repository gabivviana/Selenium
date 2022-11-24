package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import automatizado.page.GooglePO;

public class GoogleTest extends BaseTest{
    private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePO(driver);
    }

    @Test
    public void TC001_devSerPossívelPesquisarNoGoogletTextoBatataFrita(){       
        googlePage.pesquisar("Batata Frita");

        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("Aproximadamente"));
    }
}