
/**
 * Write a description of class MediaLib here.
 *
 * @author (Kyle Burton)
 * @version (2/8/19)
 */
public class MediaLib
{
   public static void main(){
   double totalCost = 0.0;
   double totalRating = 0;
   int numSongs = 0;
   int numMovies = 0;
   int numBooks = 0;
   double aveCost;
   double aveRating;
   double runTimeHour2, runTimeHour3, runTimeHour4, runTimeHour5;
   double runTimeMin2, runTimeMin3, runTimeMin4, runTimeMin5;
   double chapter2, chapter3;
   double page2, page3;
   
   System.out.println("Welcome to your Media Library");
   
   Song song1 = new Song("Calling My Spirit" , 1.29, 8);
   numSongs = numSongs + 1;
   totalCost = totalCost + song1.getPrice();
   totalRating = totalRating + song1.getRating();
  
   Song song2 = new Song("Middle Child" , .99, 10);
   numSongs = numSongs + 1;
   totalCost = totalCost + song2.getPrice();
   totalRating = totalRating + song2.getRating();
  
   Song song3 = new Song("Envy Me" , 1.29, 8);
   numSongs = numSongs + 1;
   totalCost = totalCost + song3.getPrice();
   totalRating = totalRating + song3.getRating();
  
   Song song4 = new Song("" , 1.29, 8);
   numSongs = numSongs + 1;
   totalCost = totalCost + song4.getPrice();
   totalRating = totalRating + song4.getRating();
 
   Song song5 = new Song("Rover 2.0" , .99, 10);
   numSongs = numSongs + 1;
   totalCost = totalCost + song5.getPrice();
   totalRating = totalRating + song5.getRating();
  
   Song song6 = new Song("Never Recover" , 1.29, 10);
   numSongs = numSongs + 1;
   totalCost = totalCost + song6.getPrice();
   totalRating = totalRating + song6.getRating();
  
   Song song7 = new Song("Thotiana" , 1.29, 10);
   numSongs = numSongs + 1;
   totalCost = totalCost + song7.getPrice();
   totalRating = totalRating + song7.getRating();
   
   System.out.println("Number of Songs");
   System.out.println(numSongs);
   System.out.println("Total cost" + totalCost);
   
   aveCost = totalCost / numSongs;
   System.out.println("Average Cost" + aveCost);
   aveRating = totalCost / numSongs;
   System.out.println("Average Rating" + aveRating);
   
   
  
   Movies movie1 = new Movies();
   System.out.println(movie1);
   movie1.setTitle("Movie Title" + movie1.getTitle());
   System.out.println(movie1.getTitle());
   movie1.setRating(10);
   System.out.println("Movie Rating" + movie1.getRating());
   movie1.setPrice(5.50);
   System.out.println("Movie Price" + movie1.getPrice());
   
   Movies movie2 = new Movies("The Avengers" , 15.00, 10);
   numMovies = numMovies + 1;
   totalCost = totalCost + movie2.getPrice();
   totalRating = totalRating + movie2.getRating();
   runTimeHour2 = 144/60;
   runTimeMin2 = 144/60;
   System.out.println("The Run Time of The Avengers is " + runTimeHour2 + " Hours and " + runTimeMin2 + " Minuetes ");
   
   Movies movie3 = new Movies("Civil War" , 15.00, 10);
   numMovies = numMovies + 1;
   totalCost = totalCost + movie3.getPrice();
   totalRating = totalRating + movie3.getRating();
   runTimeHour3 = 147/60;
   runTimeMin3 = 147/60;
   System.out.println("The Run Time of Civil War is " + runTimeHour3 + " Hours and " + runTimeMin3 + " Minuetes ");
   
   Movies movie4 = new Movies("Ant Man" , 15.00, 10);
   numMovies = numMovies + 1;
   totalCost = totalCost + movie4.getPrice();
   totalRating = totalRating + movie4.getRating();
   runTimeHour4 = 118/60;
   runTimeMin4 = 118/60;
   System.out.println("The Run Time of Ant Man is " + runTimeHour4 + " Hours and " + runTimeMin4 + " Minuetes ");
   
   Movies movie5 = new Movies("Venom" , 15.00, 8);
   totalCost = totalCost + movie5.getPrice();
   totalRating = totalRating + movie3.getRating();
   runTimeHour5 = 140/60;
   runTimeMin5 = 140/60;
   System.out.println("The Run Time of Venom is " + runTimeHour5 + " Hours and " + runTimeMin5 + " Minuetes ");
   
   Books book1 = new Books();
   System.out.println(book1);
   book1.setTitle("Book Title" + book1.getTitle());
   System.out.println(book1.getTitle());
   book1.setRating(10);
   System.out.println("Book Rating" + book1.getRating());
   book1.setPrice(5.50);
   System.out.println("Book Price" + book1.getPrice());
   
   Books book2 = new Books("Lord of the Rings", 5.00, 10);
   numMovies = numSongs + 1;
   totalCost = totalCost + book2.getPrice();
   totalRating = totalRating + book2.getRating();
   chapter2 = 12;
   page2 = 304;
   System.out.println("The book The Lord of the Rings has " + chapter2 + " and " + page2 + " pages.");
   
   Books book3 = new Books("The Hunger Games", 5.00, 10);
   numMovies = numSongs + 1;
   totalCost = totalCost + book3.getPrice();
   totalRating = totalRating + book3.getRating();
   chapter3 = 27;
   page3 = 374;
   System.out.println("The Hunger Games " + chapter3 + " and " + page3 + " pages.");
   }
}
  
