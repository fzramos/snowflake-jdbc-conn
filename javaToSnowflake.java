import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;
import java.sql.*;

public class javaToSnowflake{
public static void main(String args[]){
  Properties properties = new Properties();
  properties.put("user", "username");
  properties.put("password", "******");
  properties.put("account", "xx00000.region.cloud_provider");
  properties.put("warehouse", "COMPUTE_WH");
  properties.put("db", "DEMO_DB");
  properties.put("schema", "public");
  properties.put("role","ACCOUNTADMIN");

  String url = "jdbc:snowflake://xx00000.region.cloud_provider.snowflakecomputing.com";

  Connection con=DriverManager.getConnection(url,properties);
  System.out.println(con);
  Statement stmt=con.createStatement();
  ResultSet rs=stmt.executeQuery("select * from SIMULATED_TEMPS;");
  stmt.close();
  con.close();
}
}