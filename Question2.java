/* Activity 1.2 - Question 2 */



import java.util.*;  
class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    List names = new ArrayList();
    System.out.print("Please enter 3 names: "); 
    for (int i = 0; i < 3; i++){
      names.add(sc.nextLine());
    }
    for (int i = 0; i < 3; i++){
      System.out.print(names.get(2-i) + " ");
    }
  }
}
