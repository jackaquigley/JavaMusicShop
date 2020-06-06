import instruments.piano.Piano;
import instruments.piano.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;
    PianoTest pianoType;

    @Before
    public void setUp(){
        piano = new Piano("Alesis Recital 61", "Everything you love about Alesis. Now in a 61 key body! The Alesis Recital 61 digital piano is ideal for beginners. Boasting 61 full-size semi-weighted keys with an adjustable touch response, the Alesis Recital 61 feels comfortable under your fingers.", 200.00, 125.00, true, false, instruments.piano.PianoType.ELECTRONIC);
    }

    @Test
    public void testPianoHasName() {
        assertEquals("Alesis Recital 61", piano.getName());
    }

    @Test
    public void testPianoHasDescription(){
        assertEquals("Everything you love about Alesis. Now in a 61 key body! The Alesis Recital 61 digital piano is ideal for beginners. Boasting 61 full-size semi-weighted keys with an adjustable touch response, the Alesis Recital 61 feels comfortable under your fingers.", piano.getDescription());
    }

    @Test
    public void testPianoHasSellPrice(){
        assertEquals(200.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void testPianoHasBuyPrice(){
        assertEquals(125.00, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void testPianoForSale(){
        assertEquals(true,piano.getForSale());
    }

    @Test
    public void testPianoSecondHand(){
        assertEquals(false, piano.getSecondHand());
    }

    @Test
    public void testPianoHasType(){
        assertEquals(PianoType.ELECTRONIC, piano.getPianoType());
    }

    @Test
    public void testPianoCanBePlayed(){
        assertEquals("piano_music.mp3", piano.play());
    }

}
