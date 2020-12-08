import java.util.Scanner;

public class Poly {
    public static double x;
    public static double y;
    public static double h;
    public static double o;
    public static double p;
    private double k;
    Scanner in = new Scanner(System.in);
    public double getK() {
        return k;
    }

    public Poly(double x,double y,double h, double o,double p) {
        System.out.println("Введите первый  аргумент");
        x= in.nextDouble();
        this.x=x;
        System.out.println("Введите второй аргумент");
        y= in.nextDouble();
        this.y=y;
        System.out.println("Введите третий аргумент");
        h= in.nextDouble();
        this.h=h;
        System.out.println("Введите четвертый аргумент");
        o= in.nextDouble();
        this.o=o;
        System.out.println("Введите пятый аргумент");
        p= in.nextDouble();
        this.p=p;
        in.close();
    }

    public double createPoly(double x,double y,double h, double o,double p) {

         k=1/x*3+1/y*3+1/h*3+1/o*3+1/p*3;
        System.out.println(getK());
        return getK();
    }
    public static void main(String[]args) {
        Poly l=new Poly(x,y,h,o,p);
        l.createPoly(x,y,h,o,p);
    }

}
