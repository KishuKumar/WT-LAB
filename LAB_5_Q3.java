import java.util.Scanner;

interface Method{
    void earnings();
    void deductions();
    void bonus();
}
abstract class Manager implements Method{
    float basic;
    float DA;
    float HRA;
    float earnings;
    @Override
    public void earnings() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic");
        basic=sc.nextInt();
        System.out.println("ENter the DA");
        DA=sc.nextInt();
        System.out.println("Enter the HRA");
        HRA=sc.nextInt();
        earnings=basic+DA*(0.8f*basic)+HRA*(0.15f*basic);
        System.out.println("Earnings = "+earnings);


    }

    @Override
    public void deductions() {
        float deduction;
//        float basic;
//        Scanner sc=new Scanner(System.in);
//        basic=sc.nextInt();
        deduction=0.12f*basic;
        System.out.println("Deduction = "+deduction);
    }


}
class Substaff extends Manager {
    public void bonus(){
        float bonus;
        bonus=0.5f*basic;
        System.out.println("Bonus = "+bonus);
    }
}
public class LAB_5_Q3 {
    public static void main(String[] args) {
        Substaff obj=new Substaff();
        obj.earnings();
        obj.deductions();
        obj.bonus();
    }
}
