abstract class student{
    int roll_no;
    int reg_no;
    abstract void course(String a);
    abstract void branch(String b,String c,String d,String e,String f);
}
class generic extends student{
     public void course(String a)
    {
        System.out.println(a);
    }
    void branch(String b,String c,String d,String e,String f)
    {
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
public class LAB_5_Q1 {
    public static void main(String[] args) {
        student obj=new generic();
        obj.course("Btech");
        obj.branch("Computer Science","Electrical Engineer","Mechanical Engineer","Chemical Engineer","Civil Engineer");




    }
}
