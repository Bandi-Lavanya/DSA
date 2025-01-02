public class pattern1 {
    public static void main(String[] args) {
        int n = 4;
        pattern1(n);
        pattern2(n); 
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* "); // Use print instead of println to stay on the same line
            }
            System.out.println(); // Move to the next line after completing a row
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <n; col++) {
                System.out.print("* "); // Use print instead of println to stay on the same line
            }
            System.out.println(); // Move to the next line after completing a row
        }}

        static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("* "); // Use print instead of println to stay on the same line
            }
            System.out.println(); // Move to the next line after completing a row
        }}

        static void pattern4(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(col+1+" "); // Use print instead of println to stay on the same line
            }
            System.out.println(); // Move to the next line after completing a row
        }}

       static void pattern5(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow= row>n ? 2*n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* "); // Use print instead of println to stay on the same line
            }
            System.out.println(); // Move to the next line after completing a row
        }}


         static void pattern6(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow= row>n ? 2*n - row : row;
            int noOfSpaces = n-totalColsInRow;
            for(int s=0;s< noOfSpaces; s++){
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* "); 
            }
            System.out.println(); // Move to the next line after completing a row
        }}
}
