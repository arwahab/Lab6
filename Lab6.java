package demo;

import java.util.Scanner;
 
public class Lab6
{
   public static void main (String[] args)
   {
      int userNumber;               //user entered number
      int largestSoFar = 0;         //Keeps track of largest number entered
      int smallestSoFar = 500;      //Keeps track of smallest number entered
      final int SENTINEL = -99;  
 
      Scanner keyboard =  new Scanner(System.in);
 
      //Get number from user
      System.out.print("Enter a positive whole number(enter -99 to terminate): ");
      userNumber = keyboard.nextInt();
 
      while (userNumber != SENTINEL)
      {
         if (userNumber > largestSoFar)
            largestSoFar = userNumber;
 
         if (userNumber < smallestSoFar)
            smallestSoFar = userNumber;
 
         System.out.print("Enter a positive whole number(enter -99 to terminate): ");
         userNumber = keyboard.nextInt();
      }  
 
      System.out.println();
      System.out.println("Largest number entered: " + largestSoFar);
      System.out.println("Smallest number entered: " + smallestSoFar);
   }
}
