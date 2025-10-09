import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main2test{
    @Test
    public void testAgurra(){
        String agurra = Main2.agurra();
        assertEquals("Ongi etorri zine aretora!",agurra);
    }
}