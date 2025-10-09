package Desktop;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main3test{
     @Test
     public void testAgurra(){
        String agurra = Main3.agurra();
        assertEquals("Eskerrik asko!! Agurr!!",agurra);
     }
}