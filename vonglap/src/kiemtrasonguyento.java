import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number<2)
            System.out.println(number+ "is not a prime");
        else {
            boolean check = true;
               for (int i =2; i<number; i++){
                   if (number%i ==0){
                       check = false;
                       break;
                   }else {
                       check = true;
                   }
               }
               if (check == true){
                   System.out.println(number+ "is a prime");
               }else {
                   System.out.println(number+"is not a prime");
               }
        }

    }
}
