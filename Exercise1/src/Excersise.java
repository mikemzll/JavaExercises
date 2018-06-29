import java.util.Scanner;

public class Excersise {
      public static void main(String[] args){

            System.out.println("Enter your Earth weight to find out your weight on the Moon..");
            Scanner keyboard = new Scanner(System.in);

            double weightPeopleEarth = keyboard.nextInt();
            double weightPeopleMoon = weightPeopleEarth * 0.17;

            System.out.println("Your weight on Earth is: " + weightPeopleEarth + " kg" + "\n" + "So on Moon will be: " + weightPeopleMoon + " kg");
            System.out.println("\n Have a nice day! \n 06.30.18.MikeMoll" );

      }
}
