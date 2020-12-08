package JavaBasics;

import java.sql.*;

public class jdbcConnection {

	public static void main(String[] args) {
		Connection con;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "devdata", "oracle123");
			Statement statement = con.createStatement();
			System.out.println("Connection Established!");
			String createSql = "insert INTO students(name,email) values ('yogesh','yogesh@gmail.com')";
			int rows=statement.executeUpdate(createSql);
			if(rows>0){
				System.out.println("Row has been Inserted.");
			}
			String fetchSql = "Select * from students";
			ResultSet rs = statement.executeQuery(fetchSql);
			System.out.println("Data has been Fetched:");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2)+"  " + rs.getString(3));
				
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
