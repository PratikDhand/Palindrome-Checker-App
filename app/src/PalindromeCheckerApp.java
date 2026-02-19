import java.util.Scanner;

public class PalindromeCheckerApp {
/**
 MAIN CLASS UseCase1Palindrome App
 Use Case 1: Application Entry & Welcome Message
 Description:
 This class represents the entry point of the
 Palindrome Checker Management System.
 At this stage, the application:
 * Starts execution from the main() method
 -Displays a welcome message
 Shows application version

 The goal is to establish a clear startup flow.
 @author PratikDhand
 @version 2.0
 **/
public static void main(String[] args) {
    System.out.println("Welcome to Palindrome Checker App");
    System.out.println("Version: 2.0");
    System.out.println("System initialised successfully.");
    System.out.println("--------------------------------------------");
    System.out.println("Enter string to check if palindrome: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(checkPalindrome(s))
        System.out.println(s+" is a palindrome");
    else
        System.out.println(s+" is not a palindrome");
}
    public static boolean checkPalindrome(String s){
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        for (int i = 0; i < s.length()/2; i++) {
            if (arr[i] == arr[s.length()-i-1])
                continue;
            else
                return false;
        }
        return true;
    }
}



