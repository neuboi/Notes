//(c) A+ Computer Science
// www.apluscompsci.com

//comparable sort example

import static java.lang.System.*;
import java.util.Arrays;

public class SortTwo
{
 public static void main ( String[] args )
 {
  Comparable[] list =  {3,8,7,6,5,4,9};
  
  Arrays.sort(list); //uses the compareTo() method of each object
  
  for(Comparable num : list)
  {
   out.println(num);
  }

  out.println("\n\n");

  list = new String[]{"a","x","e","w","q"};
  
  Arrays.sort(list);
  
  for(Comparable let : list)
  {
   out.println(let);
  }
    out.println("\n\n");
  
  Word n = new Word("HDK");
    Word d = new Word("Thing");
      Word s = new Word("Two");
        Word g = new Word("You");
          Word h = new Word("JJJ");
            Word j = new Word("Io");
              Word k = new Word("sad");
  
  list = new Word[]{n, d, s, g, h, j, k};
  
  Arrays.sort(list);
  
  for(Comparable let : list)
  {
   out.println(let);
  }
  }
}