import java.util.Scanner;

class Faculty{
    int facultyId;
    float salary;
    void show()
    {
        System.out.println("Faculty id is :"+facultyId);
        System.out.println("Salary is:"+salary);
    }
}
class FullTimeFaculty extends Faculty
{
    float basic;
    float allowance;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the facultyId");
        facultyId= sc.nextInt();

        System.out.println("enter the allowance");
        allowance= sc.nextFloat();

        System.out.println("enter the basic");
        basic=sc.nextFloat();
        salary=basic+allowance;
    }

    @Override
    void show() {
        super.show();
        System.out.println("allowance is:"+allowance);
        System.out.println("basic is:"+basic);
    }
}
class PartTimeFaculty extends Faculty
{
    float hour;
    float rate;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the facultyId");
        facultyId= sc.nextInt();
        System.out.println("enter the hour");
        hour= sc.nextFloat();
        System.out.println("enter the rate");
        rate= sc.nextFloat();
        salary=hour*rate;
    }

    @Override
    void show() {
        super.show();
        System.out.println("hour is:"+hour);
        System.out.println("rate is:"+rate);
    }
}
public class DerivedClass {
    public static void main(String[] args) {
        FullTimeFaculty f1=new FullTimeFaculty();
        FullTimeFaculty f2=new FullTimeFaculty();
        PartTimeFaculty p1=new PartTimeFaculty();
        PartTimeFaculty p2=new PartTimeFaculty();
        f1.input();
        f1.show();
        f2.input();
        f2.show();
        p1.input();
        p1.show();
        p2.input();
        p2.show();
    }
}
