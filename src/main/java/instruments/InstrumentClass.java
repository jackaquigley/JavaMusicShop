package instruments;

public class InstrumentClass {

    private String name;
    private String description;
    private double sellPrice;

    public InstrumentClass(String name, String description, double sellPrice){
        this.name = name;
        this.description = description;
        this.sellPrice = sellPrice;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }


}
