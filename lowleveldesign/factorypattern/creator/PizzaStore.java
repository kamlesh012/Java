package factorypattern.creator;

import factorypattern.product.Pizza;

// This is the creater interface.
// That will delegate the object creation to it's subclasses.
public abstract class PizzaStore {

    public void orderPizza(String type){

        Pizza myPizza=createPizza(type);
        System.out.println("Ordered Pizza is"+myPizza.getName());
        myPizza.bake();
        myPizza.prepare();
        myPizza.cut();
        myPizza.box();
    }

    // This is the factory method, that is responsible for creation of objects in subclasses.
    abstract Pizza createPizza(String name);
}
