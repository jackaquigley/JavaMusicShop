package instruments;

public class InstrumentClass {

    private String name;
    private String description;
    private double sellPrice;
    private double buyPrice;
    private boolean forSale;
    private boolean secondHand;

    public InstrumentClass(String name, String description, double sellPrice, double buyPrice, boolean forSale, boolean secondHand){
        this.name = name;
        this.description = description;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.forSale = forSale;
        this.secondHand = secondHand;
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

    public boolean getForSale(){
        return this.forSale;
    }

    public boolean getSecondHand(){
        return this.secondHand;
    }


}
