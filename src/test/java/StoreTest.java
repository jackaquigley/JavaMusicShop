import instruments.piano.Piano;
import org.junit.Before;
import org.junit.Test;
import store.Store;

import static org.junit.Assert.assertEquals;

public class StoreTest {

    Piano piano;
    Store store;

    @Before
    public void setUp(){
        piano = new Piano("Alesis Recital 61", "Everything you love about Alesis. Now in a 61 key body! The Alesis Recital 61 digital piano is ideal for beginners. Boasting 61 full-size semi-weighted keys with an adjustable touch response, the Alesis Recital 61 feels comfortable under your fingers.", 200.00, 125.00, true, false, instruments.piano.PianoType.ELECTRONIC);
        store = new Store();
    }

    @Test
    public void testStockIsEmpty(){
        assertEquals(0, store.doStockCount());
    }

    @Test
    public void canAddStock(){
        store.addInstrument(piano);
        assertEquals(1, store.doStockCount());
    }

    @Test
    public void canRemoveStock(){
        store.addInstrument(piano);
        store.removeInstrument();
        assertEquals(0, store.doStockCount());
    }

}
