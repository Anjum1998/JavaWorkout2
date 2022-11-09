//import java.math.*;
public class MathFunction {
    void multiply(int a,int b)
    {
        int c=a*b;
        System.out.println("Multiplication of integer "+ a +" and integer "+ b +" is= "+ c);
    }
    void multiply(float a,float b)
    {
        float c=a*b;
        System.out.println("Multiplication of float "+ a + " and float " + b +" is= "+ c);

    }
    void multiply(float a,int b)
    {


        float c=a*b;
        System.out.println("Multiplication of float "+ a +" and integer "+ b + " is= "+ c);
    }

    public static void main(String[] args) {
        MathFunction m=new MathFunction();
       m.multiply(3,4);
       m.multiply(2.0f,2.7f);
       m.multiply(2.9f,2);
    }
}
