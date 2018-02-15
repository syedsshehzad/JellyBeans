//*************************************************
// Syed Shehzad
// CMSC 255-001 Spring 2018
// Project 2 - Jelly Bean Jar
//*************************************************

/*
 This program calculates the number of jelly beans in a jar
 based on user's inputs of jelly bean's length, diameter, and jar size.
 */

import java.util.Scanner;

 public class JellyBeans {

  private static void printHeading() {
   System.out.println("Syed Shehzad");
   System.out.println("CMSC 255-001 Spring 2018");
   System.out.println("Programming Project 2");
   System.out.println("JellyBeans \n");
  } // End printHeading

  public static void main(String [] args)
  {
   printHeading();
   
   // Create scanner object
   Scanner in = new Scanner(System.in);
   
   // Prompt for an input, then accept input
   System.out.println("Enter the jelly bean length (cm): ");
   double length = in.nextDouble();
   
   System.out.println("Enter the jelly bean diameter (cm): ");
   double diameter = in.nextDouble();
   
   System.out.println("Enter the jar size (mL): ");
   double jarSize = in.nextDouble();
   
   final double LOAD_FACTOR = 69.8/100.0;
   
   double usable = jarSize * LOAD_FACTOR;
   
   double beanVolume = Math.PI / 6.0 * Math.pow(diameter, 2) * length;
   
   double numberOfBeans = usable / beanVolume;
   
   System.out.print("\n There are approximately ");
   System.out.printf("%.0f", numberOfBeans);
   System.out.print(" beans in the jar.");
  
  } // End main
 }
