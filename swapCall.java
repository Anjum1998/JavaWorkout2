class  swapping
{
    //int a,b,temp;
    int x,y,temp;
    swapping(int a,int b)
    {
        x=a;
        y=b;
    }
    void swap(int x,int y)
    {
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping by call by value");
        System.out.println("value of x is "+ x);
        System.out.println("value of y is " + y);
    }
    void swap(swapping s)
    {
        int k=s.x;
        s.x=s.y;
        s.y=k;
        System.out.println("After Swapping by call by reference");
        System.out.println("value of x is " + s.x);
        System.out.println("value of y is " + s.y);
    }
}

public class swapCall {
    public static void main(String[] args) {
        swapping c=new swapping(4,6);
        System.out.println("before swapping by call by value x is: "+c.x+"y is : "+c.y);
        c.swap(4,6);
        System.out.println("\n");

        swapping  c1=new swapping(5,8);
        System.out.println("before swapping by call by reference x is: "+c1.x+"y is : "+c1.y);
        c1.swap(c1);

    }


}
