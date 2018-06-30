import java.util.Scanner;

public class Exercise {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter some text with the word 'fuck': " );
        String s1 = input.nextLine();
        String s2 = s1.replaceAll("fuck", "*CENSORED*");
        System.out.println( '\n' + "Your text: " + s2 );
        System.out.println("\n Have a nice day! \n 06.30.18.MikeMoll" );
    }
}
