package decoratorpattern;
import decoratorpattern.abstractclasses.Beverages;
import decoratorpattern.abstractclasses.Condiments;

public class Mocha extends Condiments{
    public Beverages beverage;
    public Mocha(Beverages beverage){
        System.out.println("Added Mocha to your drink");
        this.beverage=beverage;
    }

    public int cost(){
        System.out.println("One Mocha Costs: "+20);
        return beverage.cost()+20;
    }
}