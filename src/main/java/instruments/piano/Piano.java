package instruments.piano;

import instruments.InstrumentClass;

public class Piano extends InstrumentClass {

    PianoType pianoType;

    public Piano(String name, String description, double sellPrice, double buyPrice, boolean forSale, boolean secondHand, PianoType pianoType) {
    super(name, description, sellPrice, buyPrice, forSale, secondHand);
    this.pianoType = pianoType;
    }

    public PianoType getPianoType(){
        return this.pianoType;
    }
}
