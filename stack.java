import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to push an element, 2 to pop an element, 3 to peek, or 4 to exit:");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter an integer to push:");
                int item = scanner.nextInt();
                stack.push(item);
            } else if (choice == 2) {
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Popped item: " + stack.pop());
                }
            } else if (choice == 3) {
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Top item: " + stack.peek());
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
