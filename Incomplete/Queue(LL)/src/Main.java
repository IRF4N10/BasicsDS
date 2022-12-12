import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static Node Header = null;
    public static Node Tail = null;

    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.printf("\t*****\tWelcome to the queue\t*****\t\n");


        loop1: while(true){
            System.out.printf("\nPress 1 to Push Value\tPress 2 to POP value\tPress 3 to Create new list\n" +
                    "Press 4 to display the list\tPress 0 to exit\n");
            System.out.printf("\nChoose the operation:\t");
            int op = I.nextInt();
            switch(op){
                case 1:{
                    System.out.printf("\nEnter an element to insert:\t");
                    int data = I.nextInt();
                    push(data);
                    break;
                }
                case 2:{
                    System.out.printf("\nDeleting an element from the queue:\n");
                    pop();
                    break ;
                }
                case 3:{
                    Header = null;
                    Tail = null;
                    break loop1;

                }
                case 4:{
                    System.out.printf("\nThe List elements are :\n");
                    display();
                    break;
                }
                case 0:{
                    exit(0);
                }
                default:{
                    System.out.printf("\nERROR!\nInvalid Operation Selected.");

                }
            }
        }
    }
    public static void push(int data){
        Node newNode = new Node(data);
        if(Header==null){
            Header = newNode;
            Tail = newNode;
            //newNode.next = Header;
        }
        else{
            Tail.next= newNode;
            Tail = newNode;
            //Tail.next=Header;
        }
    }
    public static void pop(){



    }
    public static void display() {
        Node current = Header;

        if(Header == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
            do{
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current !=null);
            System.out.println();
        }
    }
}
