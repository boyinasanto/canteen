import javax.swing.*;
public class employee {
JFrame f = new JFrame();
employee()
{
String data[][]={ {"200","santosh","owner","7737659017"},
                  {"201","sasank","owner","9166496573"},
                  {"202","giri","owner","9494744997"},
                  {"203","revanth","owner","9672271673"},
                  {"204","rahul","owner","9876543210"},
                  {"205","mahesh","staff","8897150223"},
                  {"206","rahul","owner","9441569338"}};
String column[]={"emp_id","emp_name","emp_designation","emp_contact"};
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
    new employee();
}
}