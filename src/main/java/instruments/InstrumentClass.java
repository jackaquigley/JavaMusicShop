package instruments;

public class InstrumentClass {

    private String name;
    private String description;
    private double sellPrice;
    private double buyPrice;

    public InstrumentClass(String name, String description, double sellPrice, double buyPrice){
        this.name = name;
        this.description = description;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
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

    public double getBuyPrice(){
        return this.buyPrice;
    }


}
