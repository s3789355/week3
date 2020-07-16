
import java.util.Scanner;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    double getA(){
        return this.a;
    }
    double getB(){
        return this.b;
    }
    double getC(){
        return this.c;
    }
    double getD(){
        return this.d;
    }
    double getE(){
        return this.e;
    }
    double getF(){
        return this.f;
    }

    boolean isSolvable(double a, double b, double c, double d){
        boolean calculation;
        if ((a*d - b*c) != 0){
            calculation = true;
        }else {
            calculation = false;
        }
            return calculation;
    }

    double getX(double a, double b, double c, double d, double e, double f){
            double x = (e*d - b*f)/(a*d - b*c);
            return  x;
    }
    double getY(double a, double b, double c, double d, double e, double f){
            double y = (a*f - e*c)/(a*d -b*c);
            return y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number a: ");
        double a = input.nextDouble();
        System.out.println("number b: ");
        double b = input.nextDouble();
        System.out.println("number c: ");
        double c = input.nextDouble();
        System.out.println("number d: ");
        double d = input.nextDouble();
        System.out.println("number e: ");
        double e = input.nextDouble();
        System.out.println("number f: ");
        double f = input.nextDouble();
        if ((a*d - b*c) == 0){
            System.out.println("the equation have no solution");
        }else {

            LinearEquation myObj = new LinearEquation(a, b, c, d, e, f);
            System.out.println(myObj.isSolvable(a, b, c, d));
            System.out.println(myObj.getX(a, b, c, d, e, f));
            System.out.println(myObj.getY(a, b, c, d, e, f));

        }
    }
}
