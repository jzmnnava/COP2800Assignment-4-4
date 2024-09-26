//This program calculates the area of a hexagon

import java.util.Scanner;

public class ComputeAreaOfHexagon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//Input number of sides
    System.out.print("Enter the side: ");
    double s = input.nextDouble();

//Calculate area
    double area = (6*Math.pow(s,2))/(4*Math.tan(Math.PI/6));

//Output
    System.out.printf("The area of the hexagon is %4.2f\n", area);
  }  
}