public class Song {
  
  public String artist;
  public String name;
  public int year;
  public double score;
  public String notes;
  // More fields here
  
  // Default constructor.. you'll need to modify this
  public Song(String artist, String name, int year, double score, String notes) { 
    this.artist = artist;
    this.name = name;
    this.year = year;
    this.score = score;
    this.notes = notes;
  }
  
  /* ADD YOUR CODE HERE */
  public static String Clean(String str)
  {
    return str.substring(1, str.length() - 1).trim();
  }
}

// ArrayList<Song> Songs = newArrayList<Song>();