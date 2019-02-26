    
    /**
 * Write a description of class Song here.
 *
 * @author (Kyle Burton)
 * @version (2/8/19)
 */
public class Song
{
    private int rating;
    private String title;
    private boolean favorite;
    private double price;
    private static int numSongsInLibrary;
    
    public Song(){
      title = "";
      price = 0.0; 
      rating = 0;
    }
     public Song(String title, double price) 
     {
      this.title = title;
      this.price = price;
      numSongsInLibrary = numSongsInLibrary + 1;
    }
    public Song(String title, double price, int rating){
      this.title = title;
      this.price = price;
      this.rating = rating;
      numSongsInLibrary = numSongsInLibrary + 1;
    }
     public String getTitle(){
      return title;
    }
    public void setTitle(String t){
      title = t;
    }
    public Integer getRating(){
      return rating;
    }
    public void setRating(int r){
      rating = r;
    }
    public Double getPrice(){
      return price;
    } 
    public void setPrice(double p){
      price = p;
    }
    public void addToFavorites(){
      favorite = true;
    }
}
