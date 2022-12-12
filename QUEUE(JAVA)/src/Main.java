import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static int FRONT = -1, REAR = -1,i =0;

    static void QINSERT(int[] QUEUE,int N,int ITEM) {
        if (FRONT == REAR + 1) {
            System.out.println("OVERFLOW");
            exit(0);
        }
        if (FRONT == -1) {
            FRONT = 0;
            REAR = 0;
        } else if (REAR == N - 1) {
            REAR = 0;
        } else {
            REAR = REAR + 1;
        }
        QUEUE[REAR] = ITEM;
        System.out.printf("The queue elements are:\n");
        for (i = FRONT; i <= REAR; i++) {
            System.out.printf("\t%d\t", QUEUE[i]);
        }
    }
    static void QDELETE(int[] QUEUE, int N) {
        if (FRONT == -1) {
            System.out.println("UNDERFLOW");
            exit(0);
        }
        int ITEM = QUEUE[FRONT];
        if (FRONT == REAR) {
            FRONT = -1;
            REAR = -1;
        } else if (FRONT == N) {
            FRONT = 0;
        } else {
            FRONT = FRONT + 1;
        }
        if (FRONT == -1 || REAR == -1) {
            System.out.println("Queue is Empty.");
        }
        else{
            System.out.printf("The queue elements are:\n");
            for (i = FRONT; i <= REAR; i++) {
                System.out.printf("\t%d\t", QUEUE[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.printf("\n\t*****\tWelcome to the program of Queue.\t*****\n");
            int queue[] = new int[200];
            while (true) {
                System.out.printf("\n\t***Select the operation***\nPress 1 for Insertion\n" +
                        "Press 2 for Deletion\nPress 0 to Exit\n");
                int op = I.nextInt();
                switch (op) {
                    case 0: {
                        System.out.printf("\nExiting the Program");
                        exit(0);
                    }
                    case 1:{
                        System.out.println("Insertion is selected");
                        System.out.printf("\nEnter the element to insert:\t");
                        int ITEM = I.nextInt();
                        QINSERT(queue,100,ITEM);
                        break;
                    }
                    case 2:{
                        System.out.println("Deletion is selected");
                        QDELETE(queue, 100);
                        break;
                    }
                    default:{
                        System.out.println("Invalid Operation selected");
                    }
                }
            }

    }
}