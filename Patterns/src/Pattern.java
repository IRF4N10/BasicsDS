public class Pattern {
    int N;

    Pattern(int N) {
        this.N = N;
    }
     void Rectangle(){
        for(int i = 1;i<=N-1 ;i++){
            for(int j = 1;j<=N;j++){
                System.out.printf("\t*");
            }
            System.out.println();
        }
     }

    void LowerTriangle() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d\t", j);
            }
            System.out.println();
        }
    }

    void UpperTriangle() {
        for (int i = N; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d\t", j);
            }
            System.out.println();
        }
    }

    void LowertangularBinary() {
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.printf("%d\t", 0);
                } else {
                    System.out.printf("%d\t", 1);
                }
            }
            System.out.println();
        }
    }

    void UpperTriangleBinary() {
        for (int i = N; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.printf("%d\t", 0);
                } else {
                    System.out.printf("%d\t", 1);
                }
            }
            System.out.println();
        }
    }

    void UpperTriangleRow() {
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
    }

    void pattern6() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= N; j++) {
                System.out.printf("%d", j);
            }
            System.out.println();
        }
    }

    void pattern7() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j <= N;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
    void pattern8(){
        for(int i = N; i>=1;i--){
            for(int j= 1 ; j<i;j++){
                System.out.print(" ");
            }
            for(int j = i; j<= N;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    void pattern9(){
        for(int i = 1; i<=N;i++){
            for(int j= 1 ; j<=N-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    void pattern10(){
        for(int i = 1 ; i<= N; i++){
            for(int j = 1;j<i;j++){
                System.out.print(" ");
            }
            for(int j = i ; j<=N ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = N-1; i>= 1;i--){
            for(int j = 1;j<i;j++){
                System.out.print(" ");
            }
            for(int j = i ; j<=N;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    void pattern11(){
        for(int i = N; i>=1;i--){
            for(int j = 1; j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=N;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 2; i<=N;i++){
            for(int j =1;j<i;j++){
                System.out.print(" ");
            }
            for(int j = i ;j<=N;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

     void pattern12(){
             for(int i = 1;i<=N ;i++){
                 for(int j = 1;j<=N;j++){
                     if(i==1||i==N||j==1 || j==N){
                         System.out.printf("\t*");
                     }
                     else{
                         System.out.printf("\t");
                     }
                 }
                 System.out.println();
             }
     }
    void pattern13(){
        for(int i = 1;i<=N ;i++){
            for(int j = 1;j<=N;j++){
                if(i==1||i==N||j==1 || j==N){
                    System.out.printf("\t*");
                }
                else{
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }
    }
}

