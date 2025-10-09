package decoratorpattern;
import decoratorpattern.abstractclasses.Beverages;

public class Lattte extends Beverages{
    public int cost(){
        System.out.println("Hey this is the cose of Latte");
        return 3;
    }
};
