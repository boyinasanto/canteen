import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.JTable;

 class canteen 
{
  public canteen()
  {
    JFrame jfrm = new JFrame("Canteen");
    jfrm.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
    jfrm.setSize(450,600);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JFrame frme = new JFrame("Employee Info");
    frme.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
    frme.setSize(550,700);
    frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    String [] col2 = {"Employee ID","Employee name","Designation","Contact"};
    Object [] [] data2 = {{" "," "," "," "},{" "," "," "," "},{" "," "," "," "},{" "," "," "," "},{" "," "," "," "},{" "," "," "," "},{" "," "," "," "}};//EMPLOYEE INFO

    JTable employ = new JTable(data2,col2);
     
    JButton bk = new JButton("Back");
    JButton de = new JButton("Delete");    
    JScrollPane j = new JScrollPane(employ);
    j.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
     
    frme.add(bk);        
    frme.add(j);
    frme.add(de);    

     JFrame s_frme = new JFrame("Supplier Info");
    s_frme.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
    s_frme.setSize(550,700);
    s_frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    String [] col3 = {"Supplier ID","Product","Location"};
    Object [] [] data3 = {{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "}};

    JTable supply = new JTable(data3,col3);
     
    JButton s_bk = new JButton("Back");
    JButton s_up = new JButton("Add");
    JButton s_de = new JButton("Delete");    
    JScrollPane s_j = new JScrollPane(supply);
    s_j.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
     
    s_frme.add(s_bk);        
    s_frme.add(s_j);
    s_frme.add(s_up);
    s_frme.add(s_de);

  //INVENTORY FRAME	
    JFrame i_frme = new JFrame("Product Info");
    i_frme.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
    i_frme.setSize(550,700);
    i_frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    String [] col4 = {"Product ID","Product","Category","Quantity","Price"};
    Object [] [] data4 = {{" "," "," "," "," "},{" "," "," "," "," "},{" "," "," "," "," "},
                         {" "," "," "," "," "},{" "," "," "," "," "},{" "," "," "," "," "},
                         {" "," "," "," "," "},{" "," "," "," "," "},{" "," "," "," "," "},
                         {" "," "," "," "," "},{" "," "," "," "," "},{" "," "," "," "," "},
                         {" "," "," "," "," "},{" "," "," "," "," "},{" "," "," "," "," "},
                         {" "," "," "," "," "},{" "," "," "," "," "}};

    JTable invent = new JTable(data4,col4);
     
    JButton i_bk = new JButton("Back");
    JButton i_up = new JButton("Add");
    JButton i_dte = new JButton("Update");
    JButton i_de = new JButton("Delete");    
    JScrollPane i_j = new JScrollPane(invent);
    i_j.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
     
    i_frme.add(i_bk);        
    i_frme.add(i_j);
    i_frme.add(i_up);
    i_frme.add(i_de);
    i_frme.add(i_dte);

    JLabel us = new JLabel("Username :");
    JLabel pd = new JLabel("Password :");
    JTextField usn = new JTextField(20);
    JPasswordField psd = new JPasswordField(20);
    usn.setEditable(true);
    psd.setEditable(true);
   
    JDialog jd = new JDialog(jfrm,"Manage your canteen",false);
    jd.setLayout(new FlowLayout(FlowLayout.LEADING,50,50));
     jd.setSize(800,600);

   JDialog rd = new JDialog(jfrm,"Registration form",false);
   rd.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
   rd.setSize(390,600);

   String [] col1 = {"Product ID","Product","Category","Price","Quantity"};
    String [] [] data = {{" "," "," "," "," "},{" "," "," ","0","0"},{" "," "," ","0","0"},
                         {" "," "," ","0","0"},{" "," "," ","0","0"},{" "," "," ","0","0"},
                         {" "," "," ","0","0"},{" "," "," ","0","0"},{" "," "," ","0","0"},
                         {" "," "," ","0","0"},{" "," "," ","0","0"},{" "," "," ","0","0"},
                         {" "," "," ","0","0"},{" "," "," ","0","0"},{" "," "," ","0","0"},
                         {" "," "," ","0","0"},{" "," "," ","0","0"}};

   JDialog bd = new JDialog(jd,"Billing",false);
    bd.setLayout(new FlowLayout(FlowLayout.LEADING,30,30));
    bd.setSize(550,700);

   JTable bt = new JTable(data,col1);
  
  JButton tot = new JButton("total");
  JTextField t = new JTextField(20);
  t.setEditable(true);
  JScrollPane jsb = new JScrollPane(bt);
  jsb.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
  JLabel e = new JLabel("Billing done during this employee's session :");
  JTextField t1 = new JTextField(15);
  JButton ad = new JButton("Tally");
  bd.add(jsb);
  bd.add(tot);
  bd.add(t);
  bd.add(e);
  bd.add(t1);
  bd.add(ad);

    JButton lgn = new JButton("Login"); 
    JButton reg = new JButton("Register");
    ImageIcon bill = new ImageIcon("bill.png");
    ImageIcon inv = new ImageIcon("inventory.png");
    ImageIcon supp = new ImageIcon("supply.png");
    ImageIcon empl = new ImageIcon("employee.png");
    JButton bl = new JButton(bill);
    JButton invt = new JButton(inv);
    JButton sup = new JButton(supp);
    JButton emp = new JButton(empl);
    JButton lg_out = new JButton("log out");

     jd.add(bl);
     jd.add(invt);
     jd.add(sup);
     jd.add(emp);
     jd.add(lg_out);
    
    JLabel r_id = new JLabel("Desired ID:");
    JLabel usr = new JLabel("Username:");
    JLabel pss = new JLabel("Password:");
    JLabel rpss = new JLabel("Re-enter Pwd:");
    JLabel ca = new JLabel("Canteen area:");
     
    JTextField rid = new JTextField(20);
    JTextField unm = new JTextField(20);
    JPasswordField pwd = new JPasswordField(20);
    JPasswordField rpwd = new JPasswordField(20);
    JComboBox<String> jcb = new JComboBox<String>();
    jcb.addItem("NIIT univ");
    jcb.addItem("Raffles univ");
    jcb.addItem("other clg");
     
    JButton re = new JButton("REGISTER");     
    
    rd.add(r_id);
    rd.add(rid);
    rd.add(usr);
    rd.add(unm);
    rd.add(pss);
    rd.add(pwd);
    rd.add(rpss);
    rd.add(rpwd);
    rd.add(ca);
    rd.add(jcb);   
    rd.add(re);  

   
      jfrm.add(us);
      jfrm.add(usn);
      jfrm.add(lgn);
      jfrm.add(pd);
      jfrm.add(psd);
      jfrm.add(reg);
 

 JDialog p_updte = new JDialog(i_frme,"Update a product",false);
 p_updte.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
 p_updte.setSize(400,400);
 
 JButton p_up = new JButton("Change");
 JComboBox jcb_p = new JComboBox();
 JTextField p_jtf = new JTextField(20);
 JLabel p_jl = new JLabel("Quantity of the Item :");
 p_updte.add(jcb_p);
 p_updte.add(p_jl);
 p_updte.add(p_jtf);
 p_updte.add(p_up);

 JDialog error = new JDialog(jfrm,"ERROR",false);
 error.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));  
 error.setSize(200,200);
 JLabel ero = new JLabel("INVALID CREDENTIALS!!");
 error.add(ero);

 JDialog s_add = new JDialog(s_frme,"Add a supplier",false);
 s_add.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
 s_add.setSize(400,400);

 JDialog s_del = new JDialog(s_frme,"Remove a supplier",false);
 s_del.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
 s_del.setSize(200,200);

 JButton sb_del = new JButton("Remove");
 JComboBox jcb2 = new JComboBox(); 
 s_del.add(jcb2);
 s_del.add(sb_del);
 
 JLabel l1 = new JLabel("Supplier ID :");
 JTextField s1 = new JTextField(20);
  JLabel l2 = new JLabel("Product supplied:");
 JTextField s2 = new JTextField(20);
 JLabel l3 = new JLabel("Location :");
 JTextField s3 = new JTextField(20);
 JButton sad = new JButton("Add supplier"); 

 s_add.add(l1);
 s_add.add(s1);
 s_add.add(l2);
 s_add.add(s2);
 s_add.add(l3);
 s_add.add(s3);
 s_add.add(sad);

JDialog pro_del = new JDialog(i_frme,"Remove a product",false);
 pro_del.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
 pro_del.setSize(200,200);

 JButton pr_del = new JButton("Remove");
 JComboBox jcb4 = new JComboBox(); 
 pro_del.add(jcb4);
 pro_del.add(pr_del);


JDialog emp_del = new JDialog(frme,"Remove an employee",false);
 emp_del.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
 emp_del.setSize(200,200);

 JButton ep_del = new JButton("Remove");
 JComboBox jcb3 = new JComboBox(); 
 emp_del.add(jcb3);
 emp_del.add(ep_del);

JDialog i_add = new JDialog(i_frme,"Add a product",false);
 i_add.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
 i_add.setSize(400,400);

 JLabel l_1 = new JLabel("Product ID :");
 JTextField s_1 = new JTextField(20);
  JLabel l_2 = new JLabel("Product name:");
 JTextField s_2 = new JTextField(20);
 JLabel l_3 = new JLabel("Category:");
 JTextField s_3 = new JTextField(20);
 JLabel l_4 = new JLabel("Quantity:");
 JTextField s_4 = new JTextField(20);
 JLabel l_5 = new JLabel("Price of one unit:");
 JTextField s_5 = new JTextField(20);
 JButton i_ad = new JButton("Add Product"); 

 i_add.add(l_1);
 i_add.add(s_1);
 i_add.add(l_2);
 i_add.add(s_2);
 i_add.add(l_3);
 i_add.add(s_3);
 i_add.add(l_4);
 i_add.add(s_4);
 i_add.add(l_5);
 i_add.add(s_5);
 i_add.add(i_ad);
 
    ad.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae){
     try{
        int p = 0;
        int q = 0;
        int j = 0;
        int amount = 0;
        int total = 0;
        for(j=1; j<=16 ;j++)
         {
          p =  Integer.valueOf(data[j][3]);
          q =   Integer.valueOf(data[j][4]);
        data[j][3] = String.valueOf(p*q);
        amount = Integer.parseInt(data[j][3]);
         total = total + amount;
         t.setText(Integer.toString(total));
       }
      }
      catch(Exception e1)
        {
         e1.printStackTrace();
          }
    }
   });


   invt.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     i_frme.setVisible(true);
     jd.setVisible(false);
     int i = 0;
     try{
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089"); //PRODUCT
       Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from product");
      while(rs.next())
      {
        for(i=0; i<=4; i++){
        data4[rs.getRow()][i]=rs.getString(i+1);
        }
       }
      }
      catch(Exception e1)
        {
         e1.printStackTrace();
          }  
     }
   });   

   i_bk.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     i_frme.setVisible(false);
     jd.setVisible(true);  
     }
   });    

    i_up.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     i_add.setVisible(true);  
     }
   });

   i_de.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     pro_del.setVisible(true);
       try{
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select product_id from product");
      while(rs.next())
      {
        jcb4.addItem(rs.getInt("product_id"));
       }
      }
      catch(Exception e1)
        {
         e1.printStackTrace();
          }
     }
   });

   i_ad.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     try{
        int i_in = Integer.parseInt(s_1.getText());
        String i2 = s_2.getText();
        String i3 = s_3.getText();
        String i1 = s_4.getText();
        int i_n = Integer.parseInt(s_5.getText());       
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
       st.executeUpdate("insert into product values(" + "'" + i_in + "'" + "," + "'" + i2 + "'" + "," + "'" + i3 + "'" + "," + "'" + i1 + "'" + "," + "'" + i_n + "'" + ")");
        }
        catch(Exception e1)
        {
         e1.printStackTrace();
           }
     }
   });

   i_dte.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     p_updte.setVisible(true);
       try{
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select product_id from product");
      while(rs.next())
      {
        jcb_p.addItem(rs.getInt("product_id"));
       }
      }
      catch(Exception e1)
        {
         e1.printStackTrace();
          }
     }
   });

   p_up.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
       try{
        Object n = jcb_p.getSelectedItem();
        int n1 = Integer.parseInt(p_jtf.getText());
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
       st.executeUpdate("UPDATE product SET product_quantity = product_quantity +  " + "'" + n1 + "'" + "WHERE product_id = " + "'" + n + "'");
      }
      catch(Exception e1)
        {
         e1.printStackTrace();
          }
     }
   });   

   s_de.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae){
     s_del.setVisible(true);
     try{
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select supplier_id from supplier");
      while(rs.next())
      {
        jcb2.addItem(rs.getInt("supplier_id"));
       }
      }
      catch(Exception e1)
        {
         e1.printStackTrace();
          }
    }
   });  

   sup.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     s_frme.setVisible(true);
     jd.setVisible(false);
     int i = 0;
     try{
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089"); //EMPLOYEE
       Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from supplier");
      while(rs.next())
      {
        for(i=0; i<=2; i++){
        data3[rs.getRow()][i]=rs.getString(i+1);
        }
       }
      }
      catch(Exception e1)
        {
         e1.printStackTrace();
          }  
     }
   });
   
    s_bk.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     s_frme.setVisible(false);
     jd.setVisible(true);  
     }
   });   
   
    s_up.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     s_add.setVisible(true);  
     }
   });
    
    
    sad.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae){
     try{
        String s_1 = s1.getText();
        int s_in = Integer.parseInt(s_1);
        String s_2 = s2.getText();
        String s_3 = s3.getText();       
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
       st.executeUpdate("insert into supplier values(" + "'" + s_in + "'" + "," + "'" + s_2 + "'" + "," + "'" + s_3 + "'" + ")");
        }
        catch(Exception e1)
        {
         e1.printStackTrace();
           }
         }  
   });

   lg_out.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae)
   {
    jd.setVisible(false);
    jfrm.setVisible(true);
     usn.setText("");
     psd.setText("");
    }
   });

   lgn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
       jfrm.setVisible(false);
       String str1 = usn.getText();
       String str2 = new String(psd.getPassword());
       try{
       Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT EXISTS(" + "SELECT * FROM  login WHERE username = " + "'" + str1 + "'" + "AND" + " " + "password =" + "'" + str2 + "'" + ")");
        rs.next(); 
        int val = Integer.parseInt(rs.getObject(1).toString());
         if(val==1)
         {
          jd.setVisible(true);
          }
          else
          {
          jd.setVisible(false);
          error.setVisible(true);
          }
        }
        catch(Exception e1)
        {
         e1.printStackTrace();
          }
        }
      });
  reg.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
     rd.setVisible(true); 
    }
     });
  
  re.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent ae) {
  try{
        int r_0 = Integer.parseInt(rid.getText());
        String r_1 = unm.getText();
        String r_2 = pwd.getText();       
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
       st.executeUpdate("insert into login values(" + "'" + r_0 + "'" + "," + "'" + r_1 + "'" + "," + "'" + r_2 + "'" + ")");
        }
        catch(Exception e1)
        {
         e1.printStackTrace();
           }
   }
  });

  sb_del.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
    try{
        Object r_1 = jcb2.getSelectedItem();       
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
       st.executeUpdate("DELETE FROM supplier WHERE supplier_id=" + "'" + r_1 + "'");
        }
        catch(Exception e1)
        {
         e1.printStackTrace();
           }
   }
  });

    ep_del.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
    try{
        Object r_1 = jcb3.getSelectedItem();       
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089"); //DEL INSIDE DIALOG
       Statement st = con.createStatement();
       st.executeUpdate("DELETE FROM employee WHERE emp_id=" + "'" + r_1 + "'");
        }
        catch(Exception e1)
        {
         e1.printStackTrace();
           }
   }
  });

  de.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
     emp_del.setVisible(true);
     try{
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089"); //EMPLOYEE
       Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select emp_id from employee");
      while(rs.next())
      {
        jcb3.addItem(rs.getInt("emp_id"));
       }
      }
      catch(Exception e1)
        {
         e1.printStackTrace();
          }
   } 
  });  

  
  emp.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
     int i = 0;
     jd.setVisible(false);
     frme.setVisible(true);
      try{
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089"); //EMPLOYEE
       Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from employee");
      while(rs.next())
      {
        for(i=0; i<=3; i++){
        data2[rs.getRow()][i]=rs.getString(i+1);
        }
       }
      }
      catch(Exception e1)
        {
         e1.printStackTrace();
          }
   } 
  });

    bk.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
     jd.setVisible(true);
     frme.setVisible(false);
   } 
  });

  bl.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent ae) {
  bd.setVisible(true);
  t1.setText(usn.getText());
  int i=0;
   try{
   Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089");
       Statement st = con.createStatement();
      ResultSet rs1 = st.executeQuery("SELECT product_id,product_name,product_category,product_price FROM product");
        while(rs1.next())
        {
        for(i=0; i<=3; i++)
       {
        data[rs1.getRow()][i]=rs1.getString(i+1);
       }
       }
     }
   catch(Exception e1)
        {
         e1.printStackTrace();
       }
  }   
});



pr_del.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
    try{
        Object r_1 = jcb4.getSelectedItem();       
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_management","root","pandu1089"); //DEL INSIDE P_DIALOG
       Statement st = con.createStatement();
       st.executeUpdate("DELETE FROM product WHERE product_id=" + "'" + r_1 + "'");
        }
        catch(Exception e1)
        {
         e1.printStackTrace();
           }
   }
  });
   
     jfrm.setVisible(true);
   }

   public static void main(String [] args) 
  {
     SwingUtilities.invokeLater(new Runnable() {
           public void run() {
             new canteen();
           }
        });
   }

}
  