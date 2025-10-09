package CommandDesignPattern;

public class RemoteController{
    int size;
    Icommand command[];
    boolean buttonPressed[];

    public RemoteController(int n){
        size=n;
        command=new Icommand[n];
        buttonPressed=new boolean[n];
        for(int i=0;i<n;i++){
            command[i]=null;
            buttonPressed[i]=false;
        }
    }

    public void pressButton(int index){
        if(index<0 || index>=size){
            System.out.println("Invalid Button!");
            return;
        }
        if(buttonPressed[index]==false){
            buttonPressed[index]=true;
            command[index].execute();
        }
        else System.out.println("Button Already Pressesd");
    }

    public void unpressButton(int index){
        if(index<0 || index>=size){
            System.out.println("Invalid Button!");
            return;
        }
        if(buttonPressed[index]==true){
            command[index].undo();
            buttonPressed[index]=false;
        }
        else System.out.println("Button Not Pressed.");
    }

    public void setCommand(int index,Icommand command){
        if(index<0 || index>=size){
            System.out.println("Invalid Button!");
            return;
        }

        if(this.command[index]==null){
            System.out.println("Command set!");
            this.command[index]=command;
        }
        else System.out.println("Command at this button already set!");
    }
}