package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Entity.IPLPLayer;

public class Dao {

	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3307/batch1194db";
	String uname = "root";
	String pwd = "root";

	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	String query = "SELECT * FROM batch1194db.player";
	String insertquery = "INSERT INTO batch1194db.player VALUES(555,'Bravo',6000,61,'CSK')";
	String updatequery = "UPDATE player ";
	List<IPLPLayer> allplayerlist = null;

	public List<IPLPLayer> getAllPlayer() {
		allplayerlist = new ArrayList<IPLPLayer>();
//		System.out.println("we are in getAllPlayer Dao -> getAllPlayer");

//		System.err.println("*************************************ALL Player of IPL*******************************");
		try {
			Class.forName(path);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, uname, pwd);

			st = conn.createStatement();

			rs = st.executeQuery(query);

			while (rs.next()) {
				int jn = rs.getInt("jersn");
				String nm = rs.getString("name");
				int runs = rs.getInt("runs");
				int wickets = rs.getInt("wickets");
				String tnm = rs.getString("tname");

				IPLPLayer p1 = new IPLPLayer(jn, nm, runs, wickets, tnm);

				allplayerlist.add(p1);
//				System.out.println(jn + nm + runs + wickets + tnm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allplayerlist;
	}

	public void InsertIPLPLayer() {
		try {
			Class.forName(path);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, uname, pwd);

			st = conn.createStatement();
			int ack = st.executeUpdate(insertquery);
			if (ack == 1) {
				System.out.println("One Reacord inserted...");
			} else {
				System.out.println("Something Went wrong....");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Updatequery() {
		try {
			Class.forName(path);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, uname, pwd);
			PreparedStatement st = conn.prepareStatement(insertquery);

			st.setInt(1, 17);
			st.setString(2, "bhumra");
			
			st.setInt(3, 565);
			st.setInt(4, 88);
			st.setString(5, "MI");
			st.setInt(6, 17);
			 int rowsAffected = st.executeUpdate(query);  // Executes the update query
		        System.out.println(rowsAffected + " row(s) updated.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}