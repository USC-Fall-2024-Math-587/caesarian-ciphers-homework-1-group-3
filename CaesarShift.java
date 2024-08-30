//Caleb Martin
import java.io.*;
import java.util.Scanner;

public class CaesarShift
{
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter message to shift");
        String message = in.nextLine().toLowerCase();
        char[] messageAsArray = message.toCharArray();
        //System.out.println("Enter the shift amount");
        //int shift = in.nextInt();

        for(int s=1; s<26; s++)
        {
            for(int i=0; i<message.length(); i++)
            {
                int newIndex = (alpha.indexOf(messageAsArray[i]) + 1) % 26;
                messageAsArray[i] = alpha.charAt(newIndex);
            }

            message = new String(messageAsArray);
            System.out.println(message + " With Shift " + s);
        }

        in.close();
    }
}
