//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix search example 

import static java.lang.System.*;

public class MatrixSearch
{
  


 public static int searchMat( int[][] mat, int toFind)
 {
      int s = 0;
   for(int[] arr : mat){
     for(int num : arr){
       if(num == toFind){
         s++;
       }
     }
   }
  return s;
 }

 public static void main(String args[])
 {
  int[][] twoDRay = {{5,7,7,8,7,8},{5,3,4,6},{0,8,9,1,2,3,4,5}};
  System.out.println( searchMat( twoDRay, 7) );
 }
}