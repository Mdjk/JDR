import java.sql.*;


public class ConnexionDB {
	
	public void connexion(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdr","root", "");
			System.out.print("Database is connected !");
			conn.close();
		}
		catch(Exception e){
			System.out.print("Do not connect to DB - Error:"+e);
		}
	}
	
	public ConnexionDB(){
		
	}
}
