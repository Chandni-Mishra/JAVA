//to establish connection
//to insert data in database
import java.sql.*;
class A{
 public static void main(String args[])
{
  Connection con = null;
  try
{
  Class.forName("com.mysql.jdbc.Driver");
  System.out.println("Sucess");
  }
  catch(Exception e) 
{
 System.out.println(e);
}
 try
{
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse?autoReconnect=true&useSSL=false","root","gehu");
System.out.println("Connection established");
}
 catch(Exception e)
{
 System.out.println("connection not established");
}
try 
{
Statement st = con.createStatement();
//st.executeUpdate("insert into emp (id,name)values(15,'CHANDNI')");
ResultSet rs = st.executeQuery("select * from emp");
while(rs.next())
{
 System.out.println(rs.getInt(1));
 System.out.println(rs.getString(2));
}
}
  catch(Exception e)
{
System.out.println("Statement related issues");
 }
}
}
