import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int n = scanner.nextInt();
       int[] array = new int[n];

       for (int i = 0; i < n; i++){
           array[i] = scanner.nextInt();
       }
       int k = scanner.nextInt();

       System.out.println();
       for (int i = 0; i < k; i++){
           int key = scanner.nextInt();
           System.out.print(Search(array, key, n) + " ");
       }
    }

    public static int Search(int[] array, int key, int n){
        int l = 0;
        int r = n - 1;

        while (l <= r){
            int m = (l + r) / 2;

            if (array[m] == key) {
                return m + 1;
            }
            else if(array[m] < key){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }

        return -1;
    }
}
