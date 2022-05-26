package pkgimport;
import sub.Sub;
import add.Add;
import div.Div;
import mult.Mult;

public class lab6pro1{
    public static void main(String[] args) {
        Add a = new Add();
        Sub s = new Sub();
        Div d = new Div();
        Mult m = new Mult();
        System.out.println("Sum: "+a.addition(1,2));
        System.out.println("Difference: "+s.subtraction(1,2));
        System.out.println("Quotient: "+d.division(1,2));
        System.out.println("Product: "+m.multiplication(1,2));
    }
}
