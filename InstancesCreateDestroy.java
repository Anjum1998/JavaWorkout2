public class InstancesCreateDestroy {
   static int count;
   static int id;
   public InstancesCreateDestroy()
   {
       count++;
   }

    public static void main(String[] args) {
        InstancesCreateDestroy i1=new InstancesCreateDestroy();
        InstancesCreateDestroy i2=new InstancesCreateDestroy();
        InstancesCreateDestroy i3=new InstancesCreateDestroy();
        i1=null;
        i2=null;
        Runtime.getRuntime().gc();
        System.out.println("Object created = "+count);
        System.out.println("Object destroyed = "+id);
        System.out.println("Object alive = "+(count-id));
    }
    protected void finalize()
    {
        id++;
    }

}
