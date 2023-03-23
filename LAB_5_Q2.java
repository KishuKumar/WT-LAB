interface Motor{
    int capacity = 0;
    abstract void run();
     abstract void consume();
}
 class washing_machine implements Motor{


     @Override
     public void run() {
         System.out.println("Washing machine is running");
     }

     @Override
     public void consume() {
         System.out.println("Washing machine is consuming electricity");
     }

 }
public class LAB_5_Q2 {
    public static void main(String[] args) {
        Motor obj=new washing_machine();
        System.out.println(obj.capacity);
        if(obj.capacity>=0)
        {
            System.out.println("Positive Number");
        }
        else {
            System.out.println("Negative Number");
        }
    }
}
