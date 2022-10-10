import java.applet.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
public class lab8pro2 extends Applet implements ActionListener{
    Button b1,b2,b3;
    int i,j,k;
    @Override
        public void init() {
            // TODO start asynchronous download of heavy resources
            b1=new Button("Sun");
            b2=new Button("House");
            b3=new Button("Ball");
            add(b1);
            add(b2);
            add(b3);      
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);     
            }
    @Override
    public void actionPerformed(ActionEvent ae)
    {   
        if(ae.getSource()==b1)
        {
            i=1;
            j=0;
            k=0;
            repaint();
        }
        else if(ae.getSource()==b2)
        {
            i=0;
            j=1;
            k=0;
            repaint();
        }
        else if(ae.getSource()==b3)
        {
            i=0;
            j=0;
            k=1;
            repaint();
        }           
    }
    @Override
        public void paint(Graphics draw) {          
                if(i==1){
                    draw.setColor (Color.yellow);
                    draw.fillArc (110,60,80,80,0,360);
                    draw.drawLine (105,95,85,95);
                    draw.drawLine (150,145,150,165);
                    draw.drawLine (150,55,150,40);
                    draw.drawLine (195,100,215,100);
                    draw.drawLine (115,75,95,65);
                    draw.drawLine (130,60,115,45);
                    draw.drawLine (110,120,90,130);
                    draw.drawLine (125,140,110,160);
                    draw.drawLine (195,45,170,60);
                    draw.drawLine (215,65,185,75);
                    draw.drawLine (215,130,185,120);
                    draw.drawLine (185,160,170,140);
                }
                else if(j==1){
                    draw.setColor(Color.green);
                    int xs[] = {100,160,220};
                    int ys[] = {100,50,100};
                    Polygon poly=new Polygon(xs,ys,3);
                    draw.fillPolygon(poly);
                    // Draw the body of house
                    draw.setColor(Color.red);
                    draw.fillRect(100,100,120,120);
                    // draw the door
                    draw.setColor(Color.yellow);
                    draw.fillRect(145,160,30,60);
                    //draw chimney
                    draw.setColor(Color.black);
                    draw.fillRect(120,55,10,30);
                }
                    // g.drawRect(100, 300, 100, 70);
                else if (k==1){
                     draw.setColor (Color.blue);
                     draw.fillArc (110,60,80,80,0,360);      
                }
        }
}
