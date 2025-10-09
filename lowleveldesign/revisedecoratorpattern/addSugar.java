package revisedecoratorpattern;

public class addSugar extends Iadditives{
    public Ibeverage ibeverage;

    public addSugar(Ibeverage ibeverage){
        this.ibeverage=ibeverage;
    }

    @Override
    public void prepare(){
        ibeverage.prepare();
        System.out.println("Add Sugar on top!");
        System.out.println("Stir Properly!");
    }
    
    public int cost(){
        return 3 + ibeverage.cost();
    }
    
}
