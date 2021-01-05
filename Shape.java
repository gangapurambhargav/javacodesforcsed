

//<applet code=Shape.class height=400 width=400></applet>

import java.applet.*;

import java.awt.*;

public class Shape extends Applet

{

public void paint(Graphics g)

{

Color c;

c=Color.black;

g.setColor(c);

g.fillRect(237,114,10,500);

c=Color.red;

g.setColor(c);

g.fillRect(248,125,200,25);

c=Color.white;

g.setColor(c);

g.fillRect(248,150,200,25);

c=Color.green;

g.setColor(c);

g.fillRect(248,175,200,25);

c=Color.blue;

g.setColor(c);

g.drawOval(342,149,25,25);
int l=0;
int x=355,y=162;
double x1,y1;
double d;

c=Color.black;

g.setColor(c);
for(int i=1;i<=24;i++)
{
d=(double)l*3.14/180.0;
x1=x+(double)10*Math.cos(d);
y1=y+(double)10*Math.sin(d);
g.drawLine(x,y,(int)x1,(int)y1);
l=l+(360/24);
}

}

}