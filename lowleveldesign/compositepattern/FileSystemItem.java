public interface FileSystemItem{
    int getSize();
    void listAll(int indent);
    String getName();
};