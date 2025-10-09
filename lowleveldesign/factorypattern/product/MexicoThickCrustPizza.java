package factorypattern.product;

public class MexicoThickCrustPizza extends Pizza{
    public MexicoThickCrustPizza(){
        name="Mexico Thick Crust Pizza";
        dough="Thick";
        sauce="Sweet";
    }
    
    // Not necessary just custom implementation
    @Override
    public void cut() {
        System.out.println("Not Cutting the pizza, keeping it as it is");
    }

    public String getName(){
        return name;
    }    
};