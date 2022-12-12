import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);

        loop1:
        while (true) {
            Node TOP = null;
            loop2:
            while (true) {
                System.out.printf("\n\t***Select the operation***\nPress 1 for Insertion\n" +
                        "Press 2 for Deletion\nPress 3 for Enter new array\nPress 0 to Exit\n");

                int op = I.nextInt();
                switch (op) {
                    case 0: {
                        System.out.printf("\nExiting the Program");
                        exit(0);
                    }
                    case 1: {
                        System.out.printf("\nEnter the element to insert:\t");
                        int item = I.nextInt();
                        Node temp = new Node(item);
                        temp.next = TOP;
                        TOP = temp;
                        System.out.printf("The stack elements are:\n");

                        if (TOP == null) {
                            System.out.printf("\nStack Underflow");
                            exit(1);
                        } else {
                            while (temp != null) {
                                System.out.printf("%d\t", temp.data);
                                temp = temp.next;
                            }
                        }
                        break;
                    }
                    case 2: {
                        if (TOP == null) {
                            System.out.print("\nStack Underflow");
                            return;
                        }
                        TOP = (TOP).next;
                        break;
                    }
                    case 3: {
                        System.out.printf("\nStack is deleted\n");
                        break loop2;
                    }
                    default: {
                        System.out.printf("\tError!!!\nInvalid Operation selected");
                    }
                }
            }
        }
    }
}

