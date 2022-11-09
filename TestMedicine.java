import java.util.Random;

class Medicine
{
    String drug,companyName,address;
    void displayLabel(String drug,String companyName,String address)
    {
        System.out.println("company name is " + companyName);
        System.out.println("Address is "+ address);
    }
}
class Tablet extends Medicine
{
    String type;

    @Override
    void displayLabel(String drug, String companyName, String address) {
        super.displayLabel(drug, companyName, address);
        System.out.println("Store in a cool dry place.");
    }
}
class Syrup extends Medicine
{
    String type;

    @Override
    void displayLabel(String drug, String companyName, String address) {
        super.displayLabel(drug, companyName, address);
        System.out.println("consume 5 to 15ml every day.");
    }
}
class Ointment extends Medicine {
    String Type;

    @Override
    void displayLabel(String drug, String companyName, String address) {
        super.displayLabel(drug, companyName, address);
        System.out.println("For external use only.");
    }
}
class TestMedicine
{
    public static void main(String[] args) {
    
        double i=Math.random()*4;
        System.out.println(i);
        int j=(int)i;
        System.out.println(j);
      
        switch (j)
        {
            case 1:
                Medicine m1=new Medicine();
                Tablet t1=new Tablet();
                m1.displayLabel("dolo","microlabs","banglore");

                t1.displayLabel("dolo","microlabs","banglore");
                break;
            case 2:
                Medicine m2=new Medicine();
                Syrup s2=new Syrup();
                m2.displayLabel("dry cough syrup","Medico remedies","mumbai");

                s2.displayLabel("dry cough syrup","Medico remedies","mumbai");
                break;
            case 3:
                Medicine m3=new Medicine();
                Ointment o3=new Ointment();
                m3.displayLabel("bacitracin","safetec","America");

                o3.displayLabel("bacitracin","safetec","America");
                break;
            default:
                System.out.println("Invalid");

        }

    }
}
