import java.awt.*;  
public class ListExample  
{  
public static void main(String args[])  
{
      
        Frame f= new Frame();  
        List l1=new List(5);  
        l1.setBounds(100,100, 75,75);  
        l1.add("Item 1");  
        l1.add("Item 2");  
        l1.add("Item 3");  
        l1.add("Item 4");  
        l1.add("Item 5"); 
		//l1.setMultipleMode(true);
        f.add(l1);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
  
   
}  