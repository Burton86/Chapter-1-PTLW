
/**
 * Write a description of class Books here.
 *
 * @author (Kyle Burton)
 * @version (2/8/19)
 */
public class Books
{
    private int rating;
    private String title;
    private boolean favorite;
    private double price;
    private static int numBooksInLibrary;
    public Books()
    {    
      rating = 0;
      title = "";
      price = 0.0;
    }
    public Books(String title, double price) 
    {
      this.title = title;
      this.price = price;
      this.rating = rating;
      numBooksInLibrary = numBooksInLibrary + 1;
    }
    public Books(String title, double price, int rating){
      this.title = title;
      this.price = price;
      numBooksInLibrary = numBooksInLibrary + 1;
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
