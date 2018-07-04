import java.util.Scanner;

public class Exercise {

    public static void main(String[] args){

        int speed = 1100;
        float b;
        float c;

        System.out.print("Enter the number of seconds after the flash: ");
        Scanner scn = new Scanner(System.in);

        c = scn.nextInt();
        b = speed * c;

        System.out.println("The distance is: " + b + "ft");
        System.out.println("\n Have a nice day! \n 06.30.18.MikeMoll" );

    }

}
