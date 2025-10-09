package CommandDesignPattern;

public class LightCommand implements Icommand{
    Light light;
    public LightCommand(){
        System.out.println("Light Command Created!");
        this.light=new Light();
    }

    public void execute(){
        light.on();
    }
    public void undo(){
        light.off();
    }
    
}
