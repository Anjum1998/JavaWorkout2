import java.util.Scanner;

public class Employee {
    String Name;
    int EmpId;
    int ass1,ass2,ass3;
    String result="Demoted";
    Employee(int EmpId,String Name)
    {
        this.EmpId=EmpId;
        this.Name=Name;


    }
    int total(int ass1,int ass2,int ass3) {
        this.ass1=ass1;
        this.ass2=ass2;
        this.ass3=ass3;
        return ass1 + ass2 + ass3;
    }
    double TotalPercentage(double total)
    {

        return total/300*100;

    }
    void display()
    {
        if(ass1 >=75&& ass2>=75 && ass3 >=75)
        {
            result="Promoted";
            System.out.println(result);
        }
        else
        {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in) ;
       Employee e=new Employee(1,"aa");
        System.out.println("Enter the assessment values");
        e.ass1= sc.nextInt();
        e.ass2= sc.nextInt();
        e.ass3= sc.nextInt();
        System.out.println("Emp ID: "+e.EmpId);
        System.out.println("Name of Employee :" + e.Name);
        int total=e.total(e.ass1, e.ass2, e.ass3);
        double percentage= e.TotalPercentage(total);
        e.display();
        System.out.println("Total is=" + total);
        System.out.println("Percentage = " + percentage);

    }
}
