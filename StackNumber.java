import java.util.Scanner;
import java.util.Stack;

public class StackNumber {
    public static void main(String[] args) {
        int size;
        int[] arrayNumber;
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20 || size < 1)
                System.out.println("Size does not exceed 20");
        } while (size > 20 || size < 1);
        arrayNumber = new int[size];
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arrayNumber[i] = input.nextInt();
            stack.push(arrayNumber[i]);
        }
        System.out.printf("%-20s%s", "Before reverse is: ", "");
        for (int j = 0; j < arrayNumber.length; j++) {
            System.out.print(arrayNumber[j] + "\t");
        }
        System.out.print("After reverse number is:");
        while (!stack.isEmpty()) {
            System.out.print("\t" + stack.pop());
        }
    }
}
