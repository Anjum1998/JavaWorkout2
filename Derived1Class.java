class OneBHK
{
    float roomArea;
    float hallArea;
    float price;
    OneBHK()
    {
        System.out.println("default constructor");
    }
    OneBHK(float roomArea,float hallArea,float price)
    {
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;

    }
    void show(String x)
    {
        System.out.println(x);
        System.out.println("Room Area is"+roomArea);
        System.out.println("Hall Area is"+hallArea);
        System.out.println("Price is"+price);
    }
}
class TwoBHK extends OneBHK
{
    float room2Area;
    TwoBHK()
    {
        System.out.println("TwoBHK constructor");
    }
    TwoBHK(float roomArea,float hallArea,float price,float room2Area)
    {
        super(roomArea,hallArea,price);
        //this.roomArea=roomArea;
        //this.hallArea=hallArea;
        //this.price=price;
        this.room2Area=room2Area;
    }

    @Override
    void show(String x) {
        super.show(x);
        System.out.println("Room2 Area is"+room2Area);
    }
}
public class Derived1Class {
    public static void main(String[] args) {
        TwoBHK t1=new TwoBHK(2,3,4,5);
        TwoBHK t2=new TwoBHK(4,8,90,5);
        TwoBHK t3=new TwoBHK(20,39,49,59);
       /* OneBHK o1=new OneBHK();
        TwoBHK t1=new TwoBHK();
        t1.show("f");
       o1.show("f1");*/

        t1.show("flat1");
        System.out.println("\n");

        t2.show("flat2");
        System.out.println("\n");

        t3.show("flat3");
        System.out.println("\n");

        System.out.println("Total Price:"+(t1.price+t2.price+ t3.price));
    }
}
