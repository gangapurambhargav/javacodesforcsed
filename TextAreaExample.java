import java.awt.*;  
class TextAreaExample{  
public static void main(String args[]){  
    Frame f= new Frame("TextArea Example");
	Font f1=new Font("TimesNewRoman",Font.BOLD,20);
	f.setFont(f1);
	f.setForeground(Color.red);
	f.setBackground(Color.pink);
    TextArea ta=new TextArea("this is text area");
    ta.setBounds(50,150, 500,70);  
	Label l1=new Label("");
	l1.setBounds(200,350,300,170);
	String s=ta.getText();
	l1.setText(s);
	
	f.add(ta); 
	f.add(l1);
	f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
	
}  
}  