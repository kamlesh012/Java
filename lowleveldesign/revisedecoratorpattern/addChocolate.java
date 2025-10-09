package revisedecoratorpattern;

public class addChocolate extends Iadditives{
    public Ibeverage ibeverage;

    public addChocolate(Ibeverage ibeverage){
        this.ibeverage=ibeverage;
    }

    @Override
    public void prepare(){
        ibeverage.prepare();
        System.out.println("Add Chocolate!");
        System.out.println("Stir!");
    }
    
    public int cost(){
        return 10+ibeverage.cost();
    }
}
