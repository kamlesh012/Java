package decoratorpattern;
import decoratorpattern.abstractclasses.Beverages;
import decoratorpattern.abstractclasses.Condiments;

public class Milk extends Condiments{
    public Beverages beverage;
    public Milk(Beverages beverage){
        this.beverage=beverage;
        System.out.println("Added Milk");
    }
    public int cost(){
        System.out.println("One Addition of Milk Costs: "+10);
        return beverage.cost()+10;
    }
}
