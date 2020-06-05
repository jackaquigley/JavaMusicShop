import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Fender FA-125 Dreadnought WN")
    }

    @Test
    public void testGuitarHasName() {
        assertEquals("Fender FA-125 Dreadnought WN", guitar.getName());
    }

}