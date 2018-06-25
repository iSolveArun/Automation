package Demosele;

 import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.ResultSet;
  import java.sql.SQLException;
  import java.sql.Statement;

  public class testdb {
  	@SuppressWarnings({ "null", "resource" })
	public static void main(String[] args) {
  		Connection con = null;
  		Statement stmt = null;

  		ResultSet rs = null;

  		try {
  			Class.forName("oracle.jdbc.driver.OracleDriver");
  			con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.3.200:1521:FRS","IFLOWKVB","isolve");
  			stmt = con.createStatement();
  			rs = stmt.executeQuery("Select * from if_usermaster");
  		
  			while(rs.next()) {
//  				System.out.println(rs.getString("UM_USERNAME") +" "+ rs.getString("UM_PASSWORD"));
  				System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+" "+ rs.getString(4));
  				
  				//System.out.println(rs.getString("UM_USERNAME").concat(" ").concat(rs.getString("UM_PASSWORD")));
//  				System.out.print(rs.getInt(1) + "\t");
//  				System.out.println(rs.getInt("if_usermaster"));
//  				System.out.println(rs.getString(2));
  			}
  			rs = stmt.executeQuery("Select * from if_Customermaster");
  			while(rs.next()) {	
  				System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+" "+ rs.getString(4));
  			}
  		}	catch (ClassNotFoundException e) {
  			e.printStackTrace();
  		} catch (SQLException e) {
  			e.printStackTrace();
  		} finally {
  			try {
  				rs.close();
  				stmt.close();
  				con.close();
  			} catch (SQLException e) {
  				e.printStackTrace();
  			}
  		}
  	}
  }
  
 
   
