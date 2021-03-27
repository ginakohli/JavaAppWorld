import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class ExamSystem extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    ExamSystem(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Bookmark");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);  
        set();  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,130,20);  
        jb[1].setBounds(50,110,150,20);  
        jb[2].setBounds(50,140,180,20);  
        jb[3].setBounds(50,170,180,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,150,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==4)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Bookmark"))  
        {  
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            m[x]=current;  
            x++;  
            current++;  
            set();    
            if(current==9)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++)  
        {  
        if(e.getActionCommand().equals("Bookmark"+y))  
        {  
            if(check())  
                count=count+1;  
            now=current;  
            current=m[y];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            current=now;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("Que1: Who invented Java Language?");  
            jb[0].setText("James Gosling");jb[1].setText("Dennis Ritchie");jb[2].setText("Bjarne Stroustrup");jb[3].setText("Guido Van Rossum");   
        }  
        if(current==1)  
        {  
            l.setText("Que2: How many bytes int contains?? ");  
            jb[0].setText("1");jb[1].setText("2");jb[2].setText("4");jb[3].setText("8");  
        }  
        if(current==2)  
        {  
            l.setText("Que3: Which package  contains String class?");  
            jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");  
        }  
        if(current==3)  
        {  
            l.setText("Que4: Which of the following is a string method in java?");  
            jb[0].setText("split()");jb[1].setText("charAt()");jb[2].setText("contains()");jb[3].setText("All");  
        }  
        if(current==4)  
        {  
            l.setText("Que5: Which one among these is not a keyword?");  
            jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");  
        }  
 
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[0].isSelected());  
        if(current==1)  
            return(jb[2].isSelected());  
        if(current==2)  
            return(jb[0].isSelected());  
        if(current==3)  
            return(jb[3].isSelected());  
        if(current==4)  
            return(jb[2].isSelected());      
        return false;  
    }  
    public static void main(String s[])  
    {  
        new ExamSystem("Online Test Of Java");  
    }  
}  