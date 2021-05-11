import java.util.Scanner;

public class hienthicacsonguyentonhohon100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("nhập n: ");
        n = scan.nextInt();
        for (int i = 1; i<n; i++){
            int count = 0;
            for (int j = 1; j<=i; j++){
                if (i%j==0){
                    count++;

                }

            }
            if (count==2){
                System.out.println(" "+i);
            }
        }


    }
}
