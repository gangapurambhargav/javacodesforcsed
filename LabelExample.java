import java.awt.*; 
import java.awt.event.*; 
class LabelExample extends Frame{  
  LabelExample(String s){  
		super(s);
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
				//System.exit(0);
            }  
        });  
        setSize(400,400);  
        setVisible(true);  
    }  

public static void main(String args[]){  
    LabelExample f= new LabelExample("Label Example");  
    Label l1,l2;  
    l1=new Label("First Label.");  
    l1.setBounds(50,100, 100,30);  
    l2=new Label("Second Label.");  
    l2.setBounds(50,150, 100,30);  
    f.add(l1); f.add(l2);  
    f.setSize(400,400);  
    f.setVisible(true);  
}  
}  