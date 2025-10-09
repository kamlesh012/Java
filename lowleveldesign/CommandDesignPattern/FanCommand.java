package CommandDesignPattern;

public class FanCommand implements Icommand{

    Fan fan;
    public FanCommand(){
        System.out.println("Fan Command Created!");
        this.fan=new Fan();
    }

    public void execute(){
        fan.turnOn();
    }
    public void undo(){
        fan.turnOff();
    }
}
