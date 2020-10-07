import java.util.Scanner;
/**
 * A program that goes through 1 to 10 and print a line under it
 * @author David
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a count variable
    int count = 1;
    // create a loop that goes up to 10 with a line
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number between 1 to 10")
    ;
    int num = input.nextInt();
    while(count <= num){
      // now what ever number they enter will be print in lines
      count = count + 1;
      int count2 = 1;
    while(count2 <= num){
      System.out.print("*");
      count2 = count2 + 1;
    }
     System.out.println();
    }
   

    
  }
}
