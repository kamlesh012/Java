public class File implements FileSystemItem{

    String name;
    int size;
    int indent;

    public File(String name,int size){
        this.name=name;
        this.size=size;
        this.indent=1;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return size;
    }

    public void listAll(int indent){
        System.out.println(" ".repeat(this.indent+indent)+this.getName());
    }
};