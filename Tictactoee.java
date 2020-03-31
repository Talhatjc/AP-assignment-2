package tictactoee;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.awt.*;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


class box extends JFrame
{

   
    JPanel[][] jp;
    Button buttons[][][][] = new Button[3][3][3][3];
    
    
    
    public box()
    {
        int counter=0;
        this.jp = new JPanel[3][3];
        JFrame f=new JFrame("ULTIMATE TIC TAC TOE");
        setSize(600,600);
        //setSize(505,540);
        //setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
//        for(int i=0;i<3;i++)
//        {
//        for(int j=0;j<3;j++)
//        {
//        jp[i][j]=new JPanel();
//        }
//        }
        
//        for(int i=0;i<3;i++)
//        {
//        for(int j=0;j<3;j++)
//        {
//       buttons[i][j]=new Button[3][3];
//        }
//        }
        
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                
                jp[i][j] = new JPanel();
                jp[i][j].setLayout(new GridLayout(3,3,0,0));
                //int h = 500/3;
                //int w = 500/3;
               int w= this.getWidth()/3;
               int h= this.getHeight()/3;
                jp[i][j].setBounds(j * w, i * h , w, h);
                jp[i][j].setBackground(Color.yellow);
                jp[i][j].setBorder(BorderFactory.createMatteBorder( 5, 5, 5, 5, Color.red));
                buttons[i][j] = new Button[3][3];
                
                for(int k = 0; k<3; k++)
                {
                    for(int l = 0; l <3; l++)
                    {
                       if(i==2 && j==2)
                       {
                       counter++;
                       System.out.println(counter);
                       }
                        buttons[i][j][k][l] = new Button();
                        
                        int hh = jp[i][j].getHeight()/3;
                        int ww = jp[i][j].getWidth()/3;
                        //buttons[i][j][k][l].setBounds(i, i, i, i);
                        buttons[i][j][k][l].setPreferredSize(new Dimension(ww-5, hh-5));
                        //buttons[i][j][k][l].set//setPreferredSize(new Dimension(ww-50, hh-50));
                        jp[i][j].add(buttons[i][j][k][l]);
                        
                    }
                    
                     }
                this.add(jp[i][j]);
            }
        }
    }
}
class Tictactoee
{
    public static void main(String[] args) 
    {
        
        NewJFrame b=new NewJFrame();
        b.setVisible(true);
    }
}

/*public class Tictactoee {

    

    
}*/