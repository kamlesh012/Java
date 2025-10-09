package decoratorpattern;
import decoratorpattern.abstractclasses.Beverages;

public class Cappucino extends Beverages{
    public int cost(){
        System.out.println("Latte costs just:"+1);
        return 1;
    }
};
