import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        LAString OP = new LAString();
        int op, n;
        System.out.printf("\n\t\t*****\tWelcome to the Linear array operation\t*****\n");
        loop1:
        while (true) {

            System.out.printf("\nEnter the maximum size of the array\t");
            n = I.nextInt();
            System.out.printf("\nEnter the elements of the array\t");
            char array[] = new char[200];
            for (int i = 0; i < n ; i++) {
                array[i] = I.next().charAt(0);
            }

            loop2:
            while (true) {
                System.out.printf("\n\t***Select the operation***\nPress 1 for Traversing\nPress 2 for Insertion\n" +
                        "Press 3 for Deletion\nPress 4 for searching\nPress 5 for Enter new array\nPress 0 to Exit\n");

                op = I.nextInt();
                switch (op) {
                    case 0: {
                        System.out.printf("\nExiting the Program");
                        exit(0);
                    }
                    case 1: {
                        System.out.printf("\nTraversing Operation is Selected");
                        OP.Traversing(array, n);
                        break;
                    }
                    case 2: {
                        System.out.printf("\nInsertion Operation is Selected");
                        OP.Insertion(array,n);
                        n= OP.size;
                        break;
                    }
                    case 3: {
                        System.out.printf("\nDeletion Operation is Selected");
                        OP.Deletion(array,n);
                        n= OP.size;
                        break;
                    }
                    case 4: {
                        System.out.printf("\nSearching Operation is Selected");
                        OP.Searching(array,n);
                        break;
                    }
                    case 5: {
                        System.out.printf("\nInsert the elements");
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
