package p2;
import p1.*;
public class C2 extends C1 implements T1{
    public int mult(int a,int b)
    {
        int m = a*b;
        return m;
    }
    public static void main(String args[])
    {
       C2 d = new C2();
       int a = d.sum(2,4);
       System.out.println(a);
       float b = d.div(2.1f,1.1f);
       System.out.println(b);
       int c = d.mult(2,3);
       System.out.println(c);
    }
}
