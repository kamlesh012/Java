package factorypattern.product;

public class ChicagoThickCrustPizza extends Pizza{
    public ChicagoThickCrustPizza(){
        name="Chicago Thick Crust Pizza";
        dough="Thick ";
        sauce="Salty";
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
