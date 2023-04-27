import java.util.Scanner;

class Main {

   public static void main(String[] args) {
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 0;
      int gallonsNeeded;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);

      while (quartsNeeded == 0) {
         try {
            System.out.print("Enter quarts needed >> ");
            quartsNeeded = input.nextInt();
         } catch (Exception e) {
            System.out.println("Not a valid input please input a number");
            quartsNeeded = 0;
         }
      }
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
            " quarts requires " + gallonsNeeded + " gallons plus " +
            extraQuartsNeeded + " quarts.");
   }
}
