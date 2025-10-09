package revisedecoratorpattern;

public class coffee extends Ibeverage{

    public int cost(){
        return 20;
    }

    @Override
    public void prepare(){
        System.out.println("Bring a Cup");
        System.out.println("Add Hot Water!");
        System.out.println("Add Coffee!");
        System.out.println("Stir Properly!");
    }
}
