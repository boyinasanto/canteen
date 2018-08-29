import javax.swing.*;
public class supplier {
JFrame f = new JFrame();
supplier()
{
String data[][]={ {"600","stationery","hyderabad"},
                  {"601","drinks","visakhapatnam"},
                  {"602","cosmetics","vijayawada"},
                  {"603","ice-creams","visakhapatnam"},
                  {"604","biscuits","hyderabad"}};
String column[]={"supplier_id","supplier_product","supplier_location"};
JTable jt=new JTable(data,column);
jt.setBounds(150,150,400,600);
JScrollPane sp=new JScrollPane(jt);
JButton b1=new JButton("ADD");
 b1.setBounds(400,300,95,30);
 JButton b2=new JButton("EDIT");
  b2.setBounds(600,300,95,30);
 f.add(b1);
 JButton b3=new JButton("DELETE");
   b3.setBounds(800,300,95,30);
 f.add(b3);
 f.add(b2);
f.add(sp);
f.setSize(300,400);
f.setVisible(true);
}
public static void main(String[] args) {
    new supplier();
}
}