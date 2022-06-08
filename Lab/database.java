//to establish connection
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
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false","root","gehu");
System.out.println("Connection established");
}
 catch(Exception e)
{
 System.out.println("connection not established");
}
}
}
