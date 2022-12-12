import java.util.Scanner;
import static java.lang.System.exit;
public class Main {
    public static void main(String args[]) {
        int n, i, item, op, pos, it;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of elements");
        n = s.nextInt();
        System.out.println("Enter the elements");
        item = s.nextInt();
        Node start = new Node(item);
        Node p = start;
        for (i = 1; i < n; i++) {
            item = s.nextInt();
            p = p.next = new Node(item);
        }
        System.out.println("Now,the elements are");
        for (p = start; p != null; p = p.next) {
            System.out.println(p.data);
        }
        System.out.println("\tA linked list is created Successfully\n");
        System.out.println("Select the operation for the Linked list\n");
        while(true) {
            System.out.println("Press 1 to Insert any element" + "\nPress 2 to Delete any element" + "\nPress 0 to Exit the program");
            op = s.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Enter the item you want to insert");
                    it = s.nextInt();
                    Insert op1 = new Insert(start, it);
                    for (p = start; p != null; p = p.next) {
                        System.out.println(p.data);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter the item you want to delete");
                    it = s.nextInt();
                    Delete op2 = new Delete();
                    op2.del(start, it);
                    for (p = start; p != null; p = p.next) {
                        System.out.println(p.data);
                    }
                    break;
                }
                case 0: {
                    exit(0);
                }
                default:{
                    System.out.println("Invalid operation!!!");
                }
            }
        }
    }
}