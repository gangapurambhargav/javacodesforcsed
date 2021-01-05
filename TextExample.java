import java.awt.*;  
class TextExample{  
public static void main(String args[]){  
    Frame f= new Frame("TextField Example");  
    TextField t1=new TextField("Welcome to Java.");  
    t1.setBounds(50,100, 200,30);  
    TextField t2=new TextField("AWT Text field");  
    t2.setBounds(50,150, 200,30);  
	TextField t3=new TextField("");
	t3.setEchoChar('*'); //passwords
	t3.setBounds(50,200,200,30);
	f.add(t1); f.add(t2);f.add(t3); 
	f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
}  