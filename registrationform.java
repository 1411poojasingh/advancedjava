import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
class MyRegistrationForm
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Registration Form");
        f.setLayout(null);
        f.setSize(400,300);
        f.setVisible(true);
        Label l1=new Label("Student Id");
        l1.setBounds(50,100,80,30);
        f.add(l1);
        Label l2=new Label(" Student Password");
        l2.setBounds(50,150,150,30);
        f.add(l2);
        Label l3=new Label("Retype Password");
        l3.setBounds(50,200,120,30);
        f.add(l3);
        Label l4=new Label("Student Name");
        l4.setBounds(50,250,80,30);
        f.add(l4);
        Label l5=new Label("Student Mobile no");
        l5.setBounds(50,300,150,30);
        f.add(l5);
        Label l6=new Label("Student Email");
        l6.setBounds(50,350,80,30);
        f.add(l6);
        TextField t1=new TextField();
        t1.setBounds(200,100,150,30);
        f.add(t1);
        TextField t2=new TextField();
        t2.setBounds(200,150,150,30);
        t2.setEchoChar('@');
        f.add(t2);
        TextField t3=new TextField(10);
        t3.setBounds(200,200,150,30);
        t3.setEchoChar('@');
        f.add(t3);
        TextField t4=new TextField();
        t4.setBounds(200,250,150,30);
        f.add(t4);
        TextField t5=new TextField();
        t5.setBounds(200,300,150,30);
        f.add(t5);
        TextField t6=new TextField();
        t6.setBounds(200,350,150,30);
        f.add(t6);
        Button b= new Button("Registration");
        b.setBounds(100,400,200,50);
        f.add(b);

    
     
     
    
       



        

    }
}