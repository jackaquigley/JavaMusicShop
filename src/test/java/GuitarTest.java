import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Fender FA-125 Dreadnought WN", "This is truly an artist's guitar. Authentic tones pour out of the dreadnought-shaped body. The Fender FA-125CE Dreadnought Electro Acoustic's nato carved neck provides a warmth to your resonance, complementing any genre you're in to. This is the perfect instrument to captivate your audience."
        );
    }

    @Test
    public void testGuitarHasName() {
        assertEquals("Fender FA-125 Dreadnought WN", guitar.getName());
    }

    @Test
    public void testGuitarHasDescription() {
        assertEquals("This is truly an artist's guitar. Authentic tones pour out of the dreadnought-shaped body. The Fender FA-125CE Dreadnought Electro Acoustic's nato carved neck provides a warmth to your resonance, complementing any genre you're in to. This is the perfect instrument to captivate your audience.", guitar.getDescription());
    }
}