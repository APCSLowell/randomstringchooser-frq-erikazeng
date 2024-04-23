import java.util.*;
public class RandomStringChooser
{
 private ArrayList <String> words; 
  public RandomStringChooser(String[]wordArray){
    words = new ArrayList <String> ();
    for(String w: wordArray){
      words.add(w);
    }
}
