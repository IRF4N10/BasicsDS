import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner I= new Scanner(System.in);
        System.out.printf("\n\t*****\tWelcome to the program of Queue.\t*****\n");

        loop1:
        while (true) {
            int front=0,rear=0;
            char queue[] = new char[200];
            loop2:
            while (true) {
                System.out.printf("\n\t***Select the operation***\nPress 1 for Insertion\n" +
                        "Press 2 for Deletion\nPress 3 for Enter new Queue\nPress 0 to Exit\n");

                int op = I.nextInt();
                switch (op) {
                    case 0: {
                        System.out.printf("\nExiting the Program");
                        exit(0);
                    }
                    case 1: {
                        System.out.printf("\nEnter the element to insert:\t");
                        queue[rear]=I.next().charAt(0);
                        rear++;

                        System.out.printf("The queue elements are:\n");
                        for (int i = 0; i < rear ; i++) {
                            System.out.printf("%c\t",queue[i]);

                        }
                        break;
                    }
                    case 2: {
                        if(front!=rear) {
                            System.out.printf("\nDeleting the front element:\n");
                            char ITEM = queue[front];
                            front++;
                            System.out.printf("\nThe queue elements are:\n");
                            for (int i = front; i < rear; i++) {
                                System.out.printf("%c\t", queue[i]);
                            }
                        }
                        else{
                            System.out.printf("\nThere is no item to delete.\n");
                        }
                        break;
                    }
                    case 3: {
                        System.out.printf("\nQueue is deleted\n");
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
