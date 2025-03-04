import java.awt.*;
class Arrlistex{
    public static void main(String a[])
    {
    Frame f= new Frame("Programming language list");
    f.setLayout(null);
    List l1 = new List();
    l1.add("C");
    l1.add("C++");
    l1.add("JAVA");
    l1.add("Python");
    l1.add("PHP");
    l1.add(".NET");
    f.add(l1);
    l1.setBounds(100, 100, 80, 100);
    f.setSize(400,400);
    f.setVisible(true);

    }
}
