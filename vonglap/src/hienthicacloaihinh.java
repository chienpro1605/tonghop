import java.util.Scanner;

public class hienthicacloaihinh {
      public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i< 3; i++){
//            for (int j = 0;j<7;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//          Scanner sc = new Scanner(System.in);
//          for (int i = 1; i<= 5; i++){
//              for (int j = 1; j<=i; j++){
//                  System.out.print("*");
//
//              }
//              System.out.println("");
//          }
//          Scanner sc = new Scanner(System.in);
//          for (int i = 1; i<=5; i++){
//              for (int j = 5;j>=i;j--){
//                  System.out.print("*");
//              }
//              System.out.println("");
//          }
          for (int i = 1; i<= 5; i++){
              for (int j = 5;j> i;j--) {
                  System.out.print(" ");
              }
              for (int k = 1; k<= i;k++){
                  System.out.print("* ");
              }
              System.out.println();
          }

    }
}
