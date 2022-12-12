import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static int TOP = -1;
    static void PUSH(int []STACK,int N,int ITEM){
        if(TOP==N){
            System.out.println("OVERFLOW");
            exit(0);
        }
        TOP = TOP+1;
        STACK[TOP] = ITEM;
        System.out.println("\nThe Stack elements are:");
        for(int i = 0; i<=TOP;i++){
            System.out.printf("\t%d\t",STACK[i]);
        }
    }

    static void POP(int [] STACK, int N) {
        if (TOP == -1) {
            System.out.println("UNDERFLOW");
            exit(0);
        }
        int ITEM = STACK[TOP];
        TOP = TOP - 1;
        if (TOP == -1) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("\nThe Stack elements are:");
            for (int i = 0; i <= TOP; i++) {
                System.out.printf("\t%d\t", STACK[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.printf("\n\t*****\tWelcome to the program of Stack.\t*****\n");
        int STACK[] = new int[200];
        while (true) {
            System.out.printf("\n\t***Select the operation***\nPress 1 for PUSH\n" +
                        "Press 2 for POP\nPress 0 to Exit\n");
            int op = I.nextInt();
            switch (op) {
                case 0: {
                    System.out.printf("\nExiting the Program");
                    exit(0);
                }
                case 1:{
                    System.out.println("PUSH is selected");
                    System.out.printf("\nEnter the element to insert:\t");
                    int ITEM = I.nextInt();
                    PUSH(STACK,100,ITEM);
                    break;
                    }
                case 2:{
                    System.out.println("POP is selected");
                    POP(STACK, 100);
                    break;
                    }
                default:{
                    System.out.println("Invalid Operation selected");
                    }
                }
            }
    }
}