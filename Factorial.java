import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Factorial.class" width=500 height=200></applet>*/

public class Factorial extends Applet implements ActionListener
{
    Button compute;
    int fact=0;
    TextField input,output;
    public void init()
    {
		compute=new Button("Compute");
		Label inp=new Label("Enter any number :");
		Label opt=new Label("Factorial of number is : ");
        input=new TextField(5);
        output=new TextField(10);
		add(inp);
        add(input);
        add(opt);
        add(output);
        add(compute);
        output.setText("0");
        output.setEditable(false);
        compute.addActionListener(this);
    }
        public void actionPerformed(ActionEvent ae)
        {         
            String str=ae.getActionCommand(); 
            if(str.equals("Compute"))
			{
				fact=1;
				int n=Integer.parseInt(input.getText());
                if(n<=12)
                {
					for(int i=n;i>=2;i--)
					fact=fact*i;
                    output.setText(""+fact);
                }
				else
					fact=-1;
            }
            repaint();                                   
            }
            public void paint(Graphics g)
            {         
                if(fact==-1)
				{
					output.setText("0");
					g.drawString("Sorry number exceeds greater than 12",100,100); 
				}
            }
}

