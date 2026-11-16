import java.util.scanner;
public class StackProgram {
    static int size = 5;
    static int[] stack = new int[size];
    static int Top = -1;

    static void push(int value) {
        if (Top == size - 1) {
            System.out.println("Stack Overflow! Stack Dak de!");
            return;
        }
        Top++;
        stack[Top] = value;
        System.out.println(value + " Push sho!");
        display();
    }

    static void pop() {
        if (Top == -1) {
            System.out.println("Stack Underflow! Stack Khali de!");
            return;
        }
        System.out.println(stack[Top] + " Pop sho!");
        Top--;
        display();
    }

    static void peek() {
        if (Top == -1) {
            System.out.println("Stack Khali de!");
            return;
        }
        System.out.println("Top element: " + stack[Top]);
    }

    static void display() {
        if (Top == -1) {
            System.out.println("Stack Khali de!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= Top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println(" <- Top");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;
        do {
            System.out.println("\n1. Push  2. Pop  3. Peek  4. Display  5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Value Enter ka: ");
                value = sc.nextInt();
                push(value);
            } else if (choice == 2) {
                pop();
            } else if (choice == 3) {
                peek();
            } else if (choice == 4) {
                display();
            }
        } while (choice != 5);
    }
}
