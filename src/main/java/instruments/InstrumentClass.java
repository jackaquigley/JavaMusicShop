package instruments;

public class InstrumentClass {

    private String name;
    private String description;

    public InstrumentClass(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

}
