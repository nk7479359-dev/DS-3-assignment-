import java.util.Scanner;

public class QueueProgram {
    static int size = 5;
    static int[] queue = new int[size];
    static int Front = -1;
    static int Rear = -1;

    static void enqueue(int value) {
        if (Rear == size - 1) {
            System.out.println("Queue Overflow! Queue Dak de!");
            return;
        }
        if (Front == -1) Front = 0;
        Rear++;
        queue[Rear] = value;
        System.out.println(value + " Enqueue sho!");
        display();
    }

    static void dequeue() {
        if (Front == -1 || Front > Rear) {
            System.out.println("Queue Underflow! Queue Khali de!");
            return;
        }
        System.out.println(queue[Front] + " Dequeue sho!");
        Front++;
        display();
    }

    static void front() {
        if (Front == -1 || Front > Rear) {
            System.out.println("Queue Khali de!");
            return;
        }
        System.out.println("Front element: " + queue[Front]);
    }

    static void display() {
        if (Front == -1 || Front > Rear) {
            System.out.println("Queue Khali de!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = Front; i <= Rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println(" <- Rear");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;
        do {
            System.out.println("\n1. Enqueue  2. Dequeue  3. Front  4. Display  5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Value Enter ka: ");
                value = sc.nextInt();
                enqueue(value);
            } else if (choice == 2) {
                dequeue();
            } else if (choice == 3) {
                front();
            } else if (choice == 4) {
                display();
            }
        } while (choice != 5);
    }
}
