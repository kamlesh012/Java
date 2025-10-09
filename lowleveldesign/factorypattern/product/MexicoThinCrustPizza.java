package factorypattern.product;

public class MexicoThinCrustPizza extends Pizza{
    public MexicoThinCrustPizza(){
        name="Mexico Thin Crust Pizza";
        dough="Thin";
        sauce="Salty";
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