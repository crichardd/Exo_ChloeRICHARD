import org.example.App;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AppTest {

    @Test
    public void testCompute_Assiette_Petite_Normal_NoCoffee(){
        App app = new App();
        int result = app.Compute("assiette", "couscous", "ice-tea", "petit", "baba","normal", "no");
        assertEquals(19, result);
    }

    @Test
    public void testCompute_Assiette_Moyen_Normal_Coffee() {
        App app = new App();
        int result = app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "yes");
        assertEquals(18, result);
    }

    @Test
    public void testCompute_Assiette_Grand_Special_NoCoffee() {
        App app = new App();
        int result = app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "no");
        assertEquals(18, result);
    }

    @Test
    public void testCompute_Sandwich_Petit_Special_NoCoffee() {
        App app = new App();
        int result = app.Compute("sandwich", "couscous", "coca", "petit", "baba", "special", "no");
        assertEquals(16, result);
    }

    @Test
    public void testCompute_Sandwich_Moyen_Normal_Coffee() {
        App app = new App();
        int result = app.Compute("sandwich", "couscous", "coca", "moyen", "baba", "normal", "yes");
        assertEquals(14, result);
    }

    @Test
    public void testCompute_Sandwich_Grand_Special_NoCoffee() {
        App app = new App();
        int result = app.Compute("sandwich", "couscous", "coca", "grand", "baba", "special", "no");
        assertEquals(18, result);
    }

    @Test
    public void testCompute_Sandwich_Grand_Normal_NoCoffee() {
        App app = new App();
        int result = app.Compute("sandwich", "couscous", "coca", "grand", "baba", "normal", "no");
        assertEquals(16, result);
    }

}
