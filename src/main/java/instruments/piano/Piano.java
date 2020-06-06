package instruments.piano;

import behaviours.IPlay;
import instruments.InstrumentClass;

public class Piano extends InstrumentClass implements IPlay {

    PianoType pianoType;

    public Piano(String name, String description, double sellPrice, double buyPrice, boolean forSale, boolean secondHand, PianoType pianoType) {
    super(name, description, sellPrice, buyPrice, forSale, secondHand);
    this.pianoType = pianoType;
    }

    public PianoType getPianoType(){
        return this.pianoType;
    }

    public String play(){
        return "piano_music.mp3";
    }
}
