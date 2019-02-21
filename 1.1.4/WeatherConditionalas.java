
/**
 * Write a description of class WeatherConditionalas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionalas
{
   public static String getWeatherAdvice(int temperature, String description){
       boolean windy = false;
       
       if(description.indexOf("windy") >= 0){
           windy = true;
       }
       if((temperature > 100) && (description.indexOf("snow") >= 0)){
           return("Fake News");
       }
       else if(!windy&& (temperature > 30)){
           return("It's safe to go outside:" + temperature + " degrees and " +
           description + ".");
       }
       else
           return"To windy or cold! Enjoy watching TV or playing video games";
   }
}
