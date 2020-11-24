package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Teacher;

public class LoginDAO {
	//データベースへ接続
    final String DSN="jdbc:mysql://localhost:3306/check_db?useUnicode=true&characterEncoding=UTF-8";
	final String user="root";
	final String password="earth";

	public Teacher userOut (String userId,String pass) {
		Connection conn =null;
		Teacher account =null;

		//JDBCドライバを読み込み
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			try {
				conn=DriverManager.getConnection(DSN,user,password);


			//SELECT文を準備
		String sql="SELECT SenseID,loginPass,yakuwari "
				+ " FROM teacher_tbl "
				+ " where teacher_tbl.SenseID='" + userId + "'"
				+ " and teacher_tbl.loginPass='" + pass +"'";
		PreparedStatement pStmt=conn.prepareStatement(sql);
		//SELECTを実行し、結果表を取得
		ResultSet rs =pStmt.executeQuery();

		//一致したユーザが存在した場合
		//そのユーザを表すAccountインスタンスを作成
		if (rs.next()) {
			//結果表からデータを取得
			String userIdw=rs.getString("SenseID");
			int yakuwariw=rs.getInt("yakuwari");
			account = new Teacher(userIdw,yakuwariw);
		}
	  }catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		//見つかったユーザまたはnullを返す
		return account;
}
}
