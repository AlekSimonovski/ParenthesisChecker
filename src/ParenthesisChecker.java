import java.util.Scanner;
public class ParenthesisChecker {
    public boolean isValid(String s) {
        char chars[] = new char[s.length()];
        int index = -1;
        for (char current : s.toCharArray()) {
            if (current == '(')
                chars[++index] = ')';
            else if (current == '[')
                chars[++index] = ']';
            else if (current == '{')
                chars[++index] = '}';
            else if (index == -1 || chars[index--] != current)
                return false;
        }
        return index == -1;
    }

    public static void main(String[] args) {
        ParenthesisChecker checker = new ParenthesisChecker();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any type of parenthesis: ");
        String s = input.nextLine();
        if (checker.isValid(s)) {
            System.out.println(s + " is a valid string of parentheses.");
        } else {
            System.out.println(s + " is NOT a valid string of parentheses.");
        }
    }
}
