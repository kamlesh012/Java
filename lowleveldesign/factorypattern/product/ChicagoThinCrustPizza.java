package factorypattern.product;

public class ChicagoThinCrustPizza extends Pizza{
    public ChicagoThinCrustPizza(){
        name="Chicago Thin Crust Pizza";
        dough="Thin ";
        sauce="Sweet";
    }
    // Not necessary just custom implementation
    @Override
    public void bake(){
        System.out.println("Bake for 50 minutes at 200");
    }
    public String getName(){
        return name;
    }    
};
