import java.util.*;
import java.util.Scanner;
public class Stud{
    
    static int answ;
    static Scanner input = new Scanner(System.in);
    public static void queStud() {    
    System.out.println("If you have tested positive press 1 or else 0");
        answ = input.nextInt();
    }
    public static void main(String[] args) {
        queStud();
    }
}//End class 