/* Activity 1.2 - Question 3 */



import java.util.*;  
class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Hi there. What is your name?"); 
    String name = sc.nextLine();
    System.out.println("What adjective describes you?"); 
    String adj = sc.nextLine();
    System.out.println("My name is " + name + ". I am " + adj + ".");
  }
}
