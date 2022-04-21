
package za.ac.wsu.driver.s213036657;
import za.ac.wsu.s213036657.Circle;
//author Yongama Didi
 
public class CircleMain {
  public static void main(String[] args) {
                // Creating the three Circle objects
                Circle ca = new Circle();
                Circle cb = new Circle();
                Circle cc = new Circle();
                
                // Setting the values to each circle objects
                ca.setRadius(8);
                ca.setX(4);
                ca.setY(5);
                
                cb.setRadius(5);
                cb.setX(10);
                cb.setY(15);
                
                cc.setRadius(6);
                cc.setX(12);
                cc.setY(18);
                
                // displays the information of these circles
                System.out.println("\nCircle a Information");
                displayInformation(ca);
                System.out.println("\nCircle b Information");
                displayInformation(cb);
                System.out.println("\nCircle c Information");
                displayInformation(cc);
        }
        
        // Display the information of the Circle C
        public static void displayInformation(Circle c) {
                System.out.println("Radius: "+c.getRadius() +", Center: (" +c.getX() + ", " + c.getY() +")");
                System.out.printf("Area: %.2f",c.calculateArea());
                System.out.printf("\nCircumference: %.2f",c.calculateCircumference());
                System.out.printf("\nDiameter: %.2f",c.calculateDiameter());
                System.out.println();
        }
  
}
