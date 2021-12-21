 
 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;

public class flower extends Applet implements ActionListener
 {
Button b =new Button("enlarge");
Button b1 =new Button("shrink");
 
 
int size =100;
int x=100,y=100;

 
 
 public void init()
{
                     add(b1);
                     add(b);
b.addActionListener(this);
b1.addActionListener(this);
}               
 
 

public void actionPerformed(ActionEvent e)

{
if(e.getSource()==b1)
{
size=size-20;
 
 
}

if(e.getSource()==b){
size=size+20;
 


}
repaint();
}
   

public void paint(Graphics g)
{

 

g.setColor(Color.PINK);
// void drawOval(int x1,int y1, int width, int height)


g.fillOval(x,y,size/2,size/2);                                     //upper left


g.setColor(Color.PINK);
g.fillOval(x ,y+size/2,size/2,size/2);                             //lower left

g.setColor(Color.PINK);
g.fillOval(x+size/2,y,size/2,size/2);                              //upper right

g.setColor(Color.PINK);
g.fillOval(x+size/2,y+size/2,size/2,size/2);                       //lower right


g.setColor(Color.BLUE);
g.fillOval(x+size/4,y+size/4,size/2,size/2);                       // center

}





}

/*<applet code="flower.class" height ="1000" width="1000">
</applet>*/








