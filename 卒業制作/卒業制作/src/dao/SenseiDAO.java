package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SenseiDAO {
	public void newTeacher(String SenseID,String SenseName,String yakuwari){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			final String JDBC_URL = "jdbc:mysql://localhost:3306/check_db?useUnicode=true&characterEncoding=UTF-8";
			final String DB_USER = "root";
			final String DB_PASS = "earth";

			//データベース接続
			try(Connection conn=DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){

			//INSERT文の準備
			String sql = "INSERT INTO teacher_tbl(SenseID,SenseName,yakuwari) "
				+ "VALUES(?,?,?)";

			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.setString(1, SenseID);
			pStmt.setString(2, SenseName);
			pStmt.setString(3, yakuwari);

			//INSERT文の実行
			pStmt.executeUpdate();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		}
	}

