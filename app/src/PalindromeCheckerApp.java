import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
/**
 MAIN CLASS UseCase1Palindrome App
 Use Case 6: Queue + Stack Based Palindrome Check
 Description:
 This class represents the entry point of the
 Palindrome Checker Management System.
 At this stage, the application:
 * Starts execution from the main() method
 -Displays a welcome message
 Shows application version

 The goal is to establish a clear startup flow.
 @author PratikDhand
 @version 3.0
 **/
public static void main(String[] args) {
    System.out.println("Welcome to Palindrome Checker App");
    System.out.println("Version: 6.0");
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
        Queue<Character> que = new LinkedList<>();
        Stac k<Character> stc = new Stack<>();
        for (char c: s.toCharArray()) {
            stc.push(c);
            que.add(c);
        }
        for (char c: s.toCharArray()){
            if (que.remove() == stc.pop())
                continue;
            else
                return false;
        }
        return true;
    }
}



