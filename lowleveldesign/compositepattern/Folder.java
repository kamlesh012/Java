import java.util.*;
public class Folder implements FileSystemItem{
    String name;
    int size=64;
    int indent;
    ArrayList<FileSystemItem> contents;
    public Folder(String name,ArrayList<FileSystemItem> contents){
        this.indent=1;
        this.name=name;
        this.contents=contents;
    }

    public String getName(){
        return this.name;
    }

    public void addContent(FileSystemItem content){
        contents.add(content);
        System.out.println("Added :"+content.getName());
    }

    public void removeContent(FileSystemItem content){
        if(contents.remove(content))System.out.println("Removed: "+content.getName());
        else System.out.println(content.getName() +" not found inside folder named : "+this.getName());
    }

    public int getSize(){
        int mysize=this.size;
        for(FileSystemItem content:this.contents){
            mysize+=content.getSize();
        }
        return mysize;
    }

    public void listAll(int indent){
        // System.out.println("Contents of "+this.getName()+" are: ");
        for(FileSystemItem content: this.contents){
            content.listAll(this.indent+indent);
        }
        System.out.println(" ".repeat(this.indent+indent)+this.getName());
    }
    
}