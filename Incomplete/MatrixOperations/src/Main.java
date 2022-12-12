import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner I= new Scanner(System.in);
        int sw;
        System.out.printf("Enter the operation :\nPress 1 for Transpose Matrix.\nPress 2 for Matrix Summation\nPress 3 for Matrix Multiplication\n\nPress 0 to Exit the program\n");
        sw=I.nextInt();
        switch(sw)
        {
            case 0:
            {
                System.out.printf("\nExit");
                exit(0);
            }
            case 1:
            {
                int m,n,i,j;
                System.out.printf("Enter the number of row and column of a matrix  :\n");
                m=I.nextInt();
                n=I.nextInt();

                int array[][] = new int[m][n];
                int trans[][] = new int[n][m];
                System.out.printf("Enter the elements of the matrix : \n");
                for(i=1;i<=m;i++)
                {
                    System.out.printf("\n");
                    for(j=1;j<=n;j++)
                    {
                        array[i][j]=I.nextInt();
                    }
                }
                System.out.printf("The matrix is: \n");
                for(i=1;i<=m;i++)
                {
                    System.out.printf("\n");
                    for(j=1;j<=n;j++)
                    {
                        System.out.printf("\t%d\t",array[i][j]);
                    }
                }
                for(i=1;i<=m;i++)
                {
                    System.out.printf("\n");
                    for(j=1;j<=n;j++)
                    {
                        trans[j][i] = array[i][j];
                    }
                }
                System.out.printf("\nThe transpose matrix  is :\n");
                for(i=1;i<=n;i++)
                {
                    System.out.printf("\n");
                    for(j=1;j<=m;j++)
                    {
                        System.out.printf("\t%d\t",trans[i][j]);
                    }
                }
            }
            break;
            case 2:
            {
                System.out.printf("Enter the number of row and column of first matrix :\n");
                int a,b,m,n,i,j,k,su=0;
                a=I.nextInt();
                b=I.nextInt();

                System.out.printf("Enter the number of row and column of second matrix :\n");
                m=I.nextInt();
                n=I.nextInt();

                if(a!=m || b!=n)
                {
                    System.out.printf("Error!\n The row & column of both matrix must be same.");
                    break;
                }
                else
                {
                    int array1[][] = new int[a][b];
                    int array2[][] = new int[m][n];
                    int sum[][] = new int[m][n];
                    System.out.printf("\nEnter the element of the first matrix :\n");
                    for(i=1;i<=m;i++)
                    {
                        for(j=1;j<=n;j++)
                        {
                            array1[i][j]=I.nextInt();
                        }
                    }
                    System.out.printf("\nEnter the element of the second matrix :\n");
                    for(i=1;i<=m;i++)
                    {
                        for(j=1;j<=n;j++)
                        {
                            array2[i][j]=I.nextInt();
                        }
                    }
                    System.out.printf("\nThe summation of two matrices is :\n");
                    for(i=1;i<=m;i++)
                    {
                        System.out.printf("\n");
                        for(j=1;j<=n;j++)
                        {
                            su =array1[i][j] +array2[i][j];
                            sum[i][j] = su;
                            System.out.printf("\t%d\t",sum[i][j]);
                        }
                    }
                }
                break;
            }
            case 3:
            {
                int a,b,m,n,i,j,k,sum=0;
                System.out.printf("Enter the number  of row and column of the first matrix :\n");
                a=I.nextInt();
                b=I.nextInt();
                System.out.printf("Enter the number  of row and column of the second matrix :\n");
                m=I.nextInt();
                n=I.nextInt();
                int array1[][] = new int[a][b];
                int array2[][] = new int[m][n];
                int product[][]= new int[a][n];
                if(b!=m)
                {
                    System.out.printf("ERROR!!!\nThe number of column in first matrix and the row in second matrix must be same.");
                }
                else
                {
                    System.out.printf("Enter the elements of first matrix :\n");
                    for(i=1;i<=a;i++)
                    {
                        System.out.printf("\n");
                        for(j=1;j<=b;j++)
                        {
                            array1[i][j]=I.nextInt();
                        }
                    }
                    System.out.printf("Enter the elements of second matrix :");
                    for(i=1;i<=m;i++)
                    {
                        System.out.printf("\n");
                        for(j=1;j<=n;j++)
                        {
                            array2[i][j]=I.nextInt();
                        }
                    }
                    System.out.printf("\nThe first matrix is:\n");
                    for(i=1;i<=a;i++)
                    {
                        System.out.printf("\n");
                        for(j=1;j<=b;j++)
                        {
                            System.out.printf("\t%d\t",array1[i][j]);
                        }
                    }
                    System.out.printf("\nThe second matrix is:\n");
                    for(i=1;i<=m;i++)
                    {
                        System.out.printf("\n");
                        for(j=1;j<=n;j++)
                        {
                            System.out.printf("\t%d\t",array2[i][j]);
                        }
                    }
                    System.out.printf("\nThe product of the two matrices are :");
                    for(i=1;i<=a;i++)
                    {
                        System.out.printf("\n");
                        for(j=1;j<=n;j++)
                        {
                            for(k=1;k<=b;k++)
                            {
                                sum = sum + array1[i][k]*array2[k][j];
                            }
                            product[i][j] = sum;
                            System.out.printf("\t%d\t",product[i][j]);
                            sum=0;
                        }
                    }
                }
                break;
            }
            default :
            {
                System.out.printf("\nYou have entered a wrong key.");
            }
        }
        System.out.printf("\n\n");
    }
}