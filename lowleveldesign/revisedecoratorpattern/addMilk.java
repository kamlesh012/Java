package revisedecoratorpattern;

public class addMilk extends Iadditives{
    public Ibeverage ibeverage;

    public addMilk(Ibeverage ibeverage){
        this.ibeverage=ibeverage;
    }

    @Override
    public void prepare(){
        ibeverage.prepare();
        System.out.println("Add Hot Milk!");
        System.out.println("Stir!");
    }
    
}
