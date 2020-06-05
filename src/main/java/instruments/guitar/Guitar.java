package instruments.guitar;

import instruments.InstrumentClass;

public class Guitar extends InstrumentClass {

    GuitarType guitarType;

    public Guitar(String name, String description, double sellPrice, double buyPrice, boolean forSale, boolean secondHand, GuitarType guitarType) {
        super(name, description, sellPrice, buyPrice, forSale, secondHand);
        this.guitarType = guitarType;
    }

    public GuitarType getType(){
        return this.guitarType;
    }

}
