import java.util.Arrays;
import java.util.ArrayList;

//practice using Java Arrays and ArrayList to customize a music playlist 

class Playlist {
  public static void main(String[] args){
    String[] favoriteSongs = {
            "Coldplay - Viva la Vida",
            "Imagine Dragons - Believer",
            "Ed Sheeran - Shape of You",
            "Adele - Hello",
            "Maroon 5 - Sugar",
            "Taylor Swift - Shake It Off",
            "Bruno Mars - Just the Way You Are",
            "Rihanna - Don't Stop the Music",
            "Katy Perry - Firework",
            "Lady Gaga - Bad Romance"
    };
    System.out.println(favoriteSongs[0]);
    System.out.println(favoriteSongs[1]);
    System.out.println(favoriteSongs[2]);

    ArrayList<String> desertIslandPlaylist = new ArrayList<>();
    desertIslandPlaylist.add("Lauv - Drugs and the Internet");
    desertIslandPlaylist.add("Chainsmokers - Closer");
    desertIslandPlaylist.add("Salem Ilese - Mad at Disney");
    desertIslandPlaylist.add("Bella Poarch- Build a Bitch");
    desertIslandPlaylist.add("The Kid LAROI - STAY");

    System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
    
    System.out.println(desertIslandPlaylist);

    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("Coldplay - Viva la Vida");
    desertIslandPlaylist.remove("Imagine Dragons - Believer");
    desertIslandPlaylist.remove("Ed Sheeran - Shape of You");
    desertIslandPlaylist.remove("Adele - Hello");
    desertIslandPlaylist.remove("Maroon 5 - Sugar");
    desertIslandPlaylist.remove("Taylor Swift - Shake It Off");
    desertIslandPlaylist.remove("Bruno Mars - Just the Way You Are");
    desertIslandPlaylist.remove("Rihanna - Don't Stop the Music");
    desertIslandPlaylist.remove("Katy Perry - Firework");
    desertIslandPlaylist.remove("Lady Gaga - Bad Romance");

    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);
    
    int songA = desertIslandPlaylist.indexOf("Lauv - Drugs and the Internet");
    int songB = desertIslandPlaylist.indexOf("Chainsmokers - Closer");

    String tempA = "Lauv - Drugs and the Internet";

    desertIslandPlaylist.set(songA, "Chainsmokers - Closer");

    System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.set(songB, tempA);

    System.out.println(desertIslandPlaylist);


  }
    
}
