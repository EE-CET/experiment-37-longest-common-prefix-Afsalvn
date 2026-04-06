import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("-1");
                return;
            }
            
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            
            String prefix = arr[0];
            for (int i = 1; i < n; i++) {
                // Keep trimming the prefix until the next string starts with it
                while (arr[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        System.out.println("-1");
                        return;
                    }
                }
            }
            System.out.println(prefix.isEmpty() ? "-1" : prefix);
        }
        sc.close();
    }
}
