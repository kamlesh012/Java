package CommandDesignPattern;

public class Start {
    public static void main(String [] args){

     RemoteController myremote=new RemoteController(2);

     myremote.setCommand(0,new LightCommand());
     myremote.setCommand(1,new FanCommand());

     myremote.pressButton(1);
     myremote.pressButton(0);
     myremote.pressButton(1);
     myremote.unpressButton(0);
     myremote.pressButton(0);
     myremote.unpressButton(1);
     myremote.pressButton(2);
     myremote.unpressButton(-1);

    }
    
}
