import java.util.Scanner;
/**
* This program allows ther user to input a mass in (kg). 
* and outputs its energy in (joules).
*  @author Christian Briglio 
*  @version 1.0 
*  @since 2020-02-19
*/
  
public class Albert {
  /**
   * This program finds the e(joules) in e=mc^2 in a given mass(kg).
   */
  public static void main(String[] args) {
    System.out.println("input a mass in kg to see how many joules of energy it comes out to be");
    final double speedoflight = 2.998 * Math.pow(10,8);
    Scanner wordScanner = new Scanner(System.in);
    
    final double mass = wordScanner.nextDouble();
    final double energy = (mass * Math.pow(speedoflight,2));
    
    System.out.println("that comes out to be" + energy + "joules");
      
  }
  
}