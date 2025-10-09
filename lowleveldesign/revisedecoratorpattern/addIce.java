package revisedecoratorpattern;

public class addIce extends Iadditives{
    public Ibeverage ibeverage;

    public addIce(Ibeverage ibeverage){
        this.ibeverage=ibeverage;
    }

    @Override
    public void prepare(){
        ibeverage.prepare();
        System.out.println("Add Ice!");
    }

    public int cost(){
        return 7+ibeverage.cost();
    }
}
