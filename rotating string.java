import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();
        if (s.length() != goal.length()) {
            System.out.println(false);
        } else {
            String concatenated = s + s;
            System.out.println(concatenated.contains(goal));
        }
    }
}
