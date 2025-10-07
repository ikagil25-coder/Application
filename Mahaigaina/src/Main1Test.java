import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Main1Test {
    @Test
    public void testAgurra() {
        Main1 main1  = new Main1();
        String agurra = main1.agurra();
        assertEquals("Kaixo eta ongietorri Zine Usurbilera!",agurra);
    }
}
