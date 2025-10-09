package decoratorpattern;
import decoratorpattern.abstractclasses.Beverages;

public class Espresso extends Beverages{
    public int cost(){
        System.out.println("Espresso costs: "+2);
        return 2;
    }
    
}
