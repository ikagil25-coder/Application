import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Main1Test {
    @Test
    public void testAgurra() {
        String agurra = Main1.agurra();
        assertEquals("Kaixo eta ongietorri Zine Usurbilera!",agurra);
    }
}
