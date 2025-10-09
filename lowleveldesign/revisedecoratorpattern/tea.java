package revisedecoratorpattern;

public class tea extends Ibeverage{
    @Override
    public void prepare(){
        System.out.println("Put a Pan on the Stove!");
        System.out.println("Add Hot Water!");
        System.out.println("Add Tea Leaves!");
        System.out.println("Let it Boil!");
    }
}
