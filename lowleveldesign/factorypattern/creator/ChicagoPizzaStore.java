package factorypattern.creator;

import factorypattern.product.ChicagoThickCrustPizza;
import factorypattern.product.ChicagoThinCrustPizza;

import factorypattern.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    // These are concrete creators, only they have direct access to concrete products.
    Pizza createPizza(String name){
        if(name=="Thick"){
            return new ChicagoThickCrustPizza();
        }
        else if(name=="Thin"){
            return new ChicagoThinCrustPizza();
        }
        else return null;
    };
}