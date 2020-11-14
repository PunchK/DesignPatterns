package CoffeeGod;

public abstract class CoffeeGodMom {
    protected String description = "Unknow Coffee";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
