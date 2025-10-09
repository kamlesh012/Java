package factorypattern.creator;

import factorypattern.product.MexicoThickCrustPizza;
import factorypattern.product.MexicoThinCrustPizza;
import factorypattern.product.Pizza;

public class MexicoPizzaStore extends PizzaStore{

    // These are concrete creators, only they have direct access to concrete products.
    Pizza createPizza(String name){
        if(name=="Thin"){
            return new MexicoThinCrustPizza();
        }
        else if(name=="Thick"){
            return new MexicoThickCrustPizza();
        }
        else return null;
    }
}
