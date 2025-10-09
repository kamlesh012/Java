
import decoratorpattern.Espresso;
import decoratorpattern.Lattte;
import decoratorpattern.Milk;
import decoratorpattern.Mocha;
import decoratorpattern.abstractclasses.Beverages;
import decoratorpattern.abstractclasses.Condiments;
import factorypattern.*;

import factorypattern.creator.ChicagoPizzaStore;
import factorypattern.creator.MexicoPizzaStore;
import factorypattern.creator.PizzaStore;
import singletonpattern.Singleton;

import revisedecoratorpattern.*;

public class Main {
    public static void main(String [] args){

        //Revised Decorator Pattern (Simplified Example)
        
        Ibeverage hotChocolateSweetCoffee=new addChocolate(new addMilk(new addSugar(new coffee())));
        hotChocolateSweetCoffee.prepare();
        System.out.println("----Coffee is Ready!----");

        Ibeverage normalTea=new addSugar(new addSugar(new addMilk(new tea())));
        normalTea.prepare();
        System.out.println("----Tea is Ready!----");


        // Singleton Design Pattern;
        /*
         * A Singleton Class is a class whose only one object can be created.
         * It can be useful in case of logging, database connection or configuration management.
         * in cases where only a single instance to a class can be used throught the application.
         */

        /* 
        // All references will point to a sinlge instance of the Singleton Class.
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();
        */


        // Factory Design Pattern;
        /*
        PizzaStore pizzaStore=new MexicoPizzaStore();
        pizzaStore.orderPizza("Thin");
        pizzaStore.orderPizza("Thick");
    
        pizzaStore=new ChicagoPizzaStore();
        pizzaStore.orderPizza("Thick");
        pizzaStore.orderPizza("Thin"); 
        */
        
        // Decorator Design Pattern:
        /*
         * In decorator design pattern, we add extra functionalities to our classes
         * without subclassing them, or modifying them.
         * our classes are open to extension but closed for modification.
         * we can add extra functionalities during runtime as per our requirement.
        */
        
        // Beverages beverages=new Lattte();
        // System.out.println(beverages.cost());

        // Condiments LatteWithMilk=new Milk(beverages);
        // System.out.println(LatteWithMilk.cost());

        // Beverages espresso=new Espresso();
        // Condiments DoubleMochaEspresso=new Mocha(new Mocha(espresso));
        // System.out.println(DoubleMochaEspresso.cost());

    }
}
