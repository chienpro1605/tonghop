import java.util.Scanner;

class Phuongtrinh {
    double a, b, c;

    public Phuongtrinh(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta(){
        return b*b  - 4*a*c;
    }
    public double Ngiem1(){
        return ((-b + Math.sqrt(this.getDelta()))/(2*a));
    }
    public double Ngiem2(){
        return ((-b - Math.sqrt(this.getDelta()))/(2*a));
    }
}
class chien{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập a:");
        double a = scanner.nextDouble();
        System.out.println("nhập b:");
        double b = scanner.nextDouble();
        System.out.println("nhập c");
        double c = scanner.nextDouble();

        Phuongtrinh pt = new Phuongtrinh(a,b,c);

       if (pt.getDelta()<0){
           System.out.println("pt vô nghiệm");
       }else if (pt.getDelta()==0){
           System.out.println("pt có 1 nghiệm là"+ pt.Ngiem1());
       }else {
           System.out.println("pt có 2 nghiệm là nghiệm 1"+ pt.Ngiem1()+"có nghiệm 2 là:"+ pt.Ngiem2() );
       }
    }
}
