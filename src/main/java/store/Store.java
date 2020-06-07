package store;

import instruments.InstrumentClass;

import java.util.ArrayList;

public class Store {

    private ArrayList<InstrumentClass> stock;

    public Store(){
        stock = new ArrayList();
    }

    public int doStockCount(){
        return stock.size();
    }

    public void addInstrument(InstrumentClass instrument){
        stock.add(instrument);
    }

}
