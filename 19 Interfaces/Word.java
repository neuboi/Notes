//(c) A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;

  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {

     int y = orig.compareTo(other.toString());

     return y; 
  }

  public String toString() { return orig; }
}
