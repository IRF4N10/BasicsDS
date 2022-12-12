import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner I= new Scanner(System.in);

        loop1:
        while (true) {
            int top=0;
            char stack[] = new char[200];
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
                        stack[top]=I.next().charAt(0);
                        top++;

                        System.out.printf("The stack elements are:\n");
                        for (int i = 0; i < top ; i++) {
                            System.out.printf("%c\t",stack[i]);

                        }
                        break;
                    }
                    case 2: {
                        if(top!=0) {
                            System.out.printf("\nDeleting the TOP element:\n");
                            char ITEM = stack[top - 1];
                            top--;
                            System.out.printf("\nThe stack elements are:\n");
                            for (int i = 0; i < top; i++) {
                                System.out.printf("%c\t", stack[i]);
                            }
                        }
                        else{
                            System.out.printf("\nThere is no item to delete.\n");
                        }
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
