
/**
 * Write a description of class Movies here.
 *
 * @author (Kyle Burton)
 * @version (2/8/19)
 */
public class Movies
{
    private int rating;
    private String title;
    private boolean favorite;
    private double price;
    private static int numMoviesInLibrary;
    private String runTime;
    public Movies()
    {    
        rating = 0;
        title = "";
        price = 0.0;
    }
     public Movies(String title, double price) 
     {
      this.title = title;
      this.price = price;
      this.rating = rating;
      this.runTime = runTime;
      numMoviesInLibrary = numMoviesInLibrary + 1;
    }
      public Movies(String title, double price, int rating){
      this.title = title;
      this.price = price;
      numMoviesInLibrary = numMoviesInLibrary + 1;
    }
    public Movies(String runTime){
        this.runTime = runTime;
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
