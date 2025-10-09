import java.util.*;
public class Client{
    public static void main(String [] args)
    {
        FileSystemItem game1=new File("GTA5",60000);
        FileSystemItem game2=new File("RDR2",100000);

        FileSystemItem game3=new File("GTAIV",14000);
        FileSystemItem game4=new File("RDR",10000);

        ArrayList<FileSystemItem> listOfOldGames=new ArrayList<>();
        listOfOldGames.add(game3);
        listOfOldGames.add(game4);

        FileSystemItem gamesOld=new Folder("OldGames",listOfOldGames);

        ArrayList<FileSystemItem> listOfGames=new ArrayList<>();
        listOfGames.add(gamesOld);
        listOfGames.add(game1);
        listOfGames.add(game2);

        FileSystemItem games=new Folder("Games",listOfGames);

        games.listAll(0);
        System.out.println(games.getSize());
    }
}