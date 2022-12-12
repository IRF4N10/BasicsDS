import java.util.Scanner;

public class LAString {
    public int size;
    Scanner I = new Scanner(System.in);

    void Traversing(char[] array,int n){
        System.out.printf("\nPrinting every element of the array by traversing\n");
        for(int i=0;i<=n-1;i++){
            System.out.printf("%c\n",array[i]);
        }
    }

    void Insertion(char[] array,int n){
        System.out.printf("\nEnter the position of insertion : ");
        int k = I.nextInt();
        if(n<k-1){
            while(n<k-1){
                System.out.println("\nInvalid position selected!!!");
                System.out.printf("\nEnter the position of insertion : ");
                k = I.nextInt();
            }
        }

        System.out.printf("\nEnter the element to insert : ");
        char ITEM = I.next().charAt(0);
        for(int j=n;j>=k-1;j--){
            array[j+1]= array[j];
        }
        n=n+1;
        size = n;
        array[k-1] =ITEM;
        System.out.printf("\nNow the array is :");
        for(int i=0;i<n;i++)
        {
            System.out.printf("\n%c\n",array[i]);
        }
    }
    void Deletion(char[] array,int n) {
        System.out.printf("\nEnter the position of deletion :\n");
        int k = I.nextInt();
        if(n<k){
            while(n<k){
                System.out.println("\nInvalid position selected!!!");
                System.out.printf("\nEnter the position of Deletion : ");
                k = I.nextInt();
            }
        }
        char ITEM = array[k - 1];
        n = n - 1;
        size = n;
        for (int i = k - 1; i < n; i++) {
            array[i] = array[i + 1];
        }
        System.out.printf("Item %c has been deleted\n", ITEM);
        System.out.printf("Now the array elements are :\n");
        {
            for (int i = 0; i < n; i++) {
                System.out.printf("%c\n", array[i]);
            }
        }
    }

    void Searching (char[] array,int n){
        System.out.printf("\nEnter the value to search :\n");
        char ITEM = I.next().charAt(0);
        int f=0,l=0;
        for(int i=0;i<n;i++) {
            if(array[i]==ITEM) {
                l = i +1;
                f = 1;
                break;
            }
        }
        if(f==1) {
            System.out.printf("\nThe value %c is found in the %d number position of the array.\n",ITEM,l);
        }
        else {
            System.out.printf("The value could not be found.\n");
        }
}
}
