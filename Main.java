import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("What is your gender (M or F): ");
    String gender = kb.nextLine();
    System.out.print("What is your first name: ");
    String firstName = kb.nextLine();
    System.out.print("What is your last name: ");
    String lastName = kb.nextLine();
    System.out.print("What is your age: ");
    int age = kb.nextInt();
  if(age <= 20) {
    System.out.print("Then I shall call you " + firstName + " " + lastName);
  }
  if(gender.equals("M") && age >= 20) {
    System.out.print("Then I shall call you Mr. " + lastName);
  }
  if(gender.equals("F") && age >= 20) {
    System.out.print("Are you married, " + firstName + " (y or n)?");
    String marriage = kb.nextLine();
    
    if(marriage.equals("y")) {
    System.out.print("Then I shall call you Mrs. " + lastName);

  } else if(marriage.equals("n")) {
    System.out.print("Then I shall call you Ms. " + lastName);
  }
  
  }
  }
}