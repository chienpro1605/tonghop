import java.util.Scanner;

public class hienthi20songuyento {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố");

        number = sc.nextInt();
        System.out.printf("%s sô nguyên tố đầu tiên là",number);
        int count = 0;
        int N = 2;
        while (count<number){
            boolean result = true;
            for (int i = 2; i<N; i++){
                if (N%i==0){
                   result = false;
                }


            }
            if (result){
                count++;
                System.out.println(N);
            }
            N++;
        }

    }
}
