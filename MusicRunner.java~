import java.util.Arrays;

public class MusicRunner
{
  public static void main (String[] args)
  {
    int count = 0;
    MusicReader mr = new MusicReader();
    
    ArrayList<Songs> list = new ArrayList<Songs>();
    list.add(Song1);
    list.add(Song2);
    list.add(Song3);
    list.add(Song4);
    list.add(Song5);
    list.add(Song6);
    list.add(Song7);
    list.add(Song8);
    list.add(Song9);
    list.add(Song10);
    
    mr.open("musiclist.csv");
    
    String[] data = mr.getSongData();
    
    // First line contains all the fields - We don't want to save this anywhere but we can
    // print it for now to see what information we have.
    System.out.println(Arrays.toString(data));
    
    data = mr.getSongData();  // Get next line of song data
    
    // if data is null then we were unable to read a line of song data, so
    // this loop will continue to read lines of song data as long as there
    // IS song data available
    while (data != null)
    {
      // You probably will comment this out but for now print out the line so you can see what is there
      System.out.println(Arrays.toString(data));
      
      int year = Integer.parseInt(Song.Clean(data[3]));
      double score = Double.parseDouble(Song.Clean(data[4]));
        
      // Let's try to create a Song object
      Song song = new Song(Song.Clean(data[0]), Song.Clean(data[1]), year, score, Song.Clean(data[16]));  // data[0] is the artist and data[1] is the name
      
      System.out.println(song.score);
      
      count++;
      
      if (count == 1)  // For now only read ONE song
        break;
      
      data = mr.getSongData();  // Get next line of song data
    }
    
    mr.close();
  }
}