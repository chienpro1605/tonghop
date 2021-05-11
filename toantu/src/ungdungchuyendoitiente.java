import java.text.DecimalFormat;
import java.util.Scanner;

public class ungdungchuyendoitiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền usd:  ");
        usd = sc.nextDouble();
        double quydoi = usd*23000;
        System.out.println("Gía trị VND: "+ quydoi);
    }

}
