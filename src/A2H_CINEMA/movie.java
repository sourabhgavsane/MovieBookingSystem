package A2H_CINEMA;
import java.sql.*;
public class movie
{
static String movienm;
static String rating;
static int screen;
static String rdate;
static Statement st;
static Connection con;
static ResultSet rs;
static String sc;
static int sht;
static String sdt;
static int ic;
public static void conn()
{
  try
  {
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
     st=con.createStatement();
  }
  catch(Exception e){System.out.print(e.getMessage());}
}
movie(String mnm,String rat,int scr, String rdt)
{
  movienm=mnm;
  rating=rat;
  screen=scr;
  rdate=rdt;
}
}
