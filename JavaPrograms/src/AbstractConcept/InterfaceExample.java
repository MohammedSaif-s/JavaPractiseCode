package AbstractConcept;
public class InterfaceExample implements MyInterface1, MyInterface2
{
   public void display() 
   {
      System.out.println("This is the implementation of the display method");
   }
   public void show() 
   {
      MyInterface1.super.display();
      MyInterface2.super.display();
   }

   public static void main(String args[]) 
   {
      InterfaceExample obj = new InterfaceExample();
      obj.show();
   }
}