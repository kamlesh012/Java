package singletonpattern;

public class Singleton {
    // Volatile instance is required for thread saftey.
    private volatile static Singleton instance;
    
    private Singleton(){
        System.out.println("Private Constructor! Singleton Object Created Once!");
    }

    //1. One More way of avoiding thread saftey.
    //Eager iniliziation.
    private static Singleton eagerInstance=new Singleton();

    public static Singleton getEagerInilitiazedInstance(){
        return eagerInstance;
    }

    //2. Basic Thread-Safe  Implementation using Synchronized method.
    //Performance slow.
    public static synchronized Singleton getInstanceThreadUnsafe(){
        if(instance==null)   {
            instance=new Singleton();
        }
        return instance;
    }

    //3. Double Locking Thread Safe Implementation
    public static Singleton getInstance(){
        // Lock
        //only one thread can enter this part now.
        //here we would once again check if the instance is still null, 
        //for the case when one thread already created a instance() and
        //the other thread already entered the previous null check, so it will 
        //again create a new instance when current thread unlocks this 
        //critical section
        //to avoid that we would again do a null check on the Singleton instance.
        //so that only one instance can be created.
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null)
                    instance=new Singleton();
            }
        }
        return instance;
    }

    //4. Static Holder Class Implementation (Lazy-Loading)
    // A nested static class is loaded by JVM only when it is first referenced.
    //that's why it's called lazy loading,
    //quiet opposite of eager initilization, in which a Singletion  field memeber is
    //instantiated in Singleton class, which is loaded when the class is first loaded by JVM.
    public static class Holder{
        public static Singleton instance=new Singleton();
    }

    public static Singleton getStaticInstance(){
        return Holder.instance;
    }
}
