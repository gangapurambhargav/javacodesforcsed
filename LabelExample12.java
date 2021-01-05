import java.awt.*;  
import java.awt.event.*;
class LabelExample12{  
public static void main(String args[]){  
    Frame f= new Frame("Label Example");  
    //new Close(f);
    Label l1=new Label("First Label.");  
    l1.setBounds(50,100, 100,30);  
    Label l2=new Label("Second Label.");  
    l2.setBounds(50,150, 100,30);  
    f.add(l1); 
	f.add(l2);  
    f.setSize(400,400);  
    f.setVisible(true);  
}  
}  
class Close extends WindowAdapter
{
	Frame f;
	Close(Frame f1)
	{
		f=f1;
		f.addWindowListener(this);
	}
	public void windowClosing(WindowEvent e) {  
    f.dispose();  
}  
}	

		