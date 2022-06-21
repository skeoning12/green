package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	private Connection conn = DBcon.getConnection();
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public int loginCheck(String id, String pw) {
		String sql = "SELECT COUNT(ID) FROM MEMBER WHERE ID = ? AND PW = ?";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
