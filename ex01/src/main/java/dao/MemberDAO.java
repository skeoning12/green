package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.MemberVO;

public class MemberDAO {
	
	public int idCheck(String id) throws Exception {
		String sql = "select * from member where id = ?";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.println("값이 있따.");
			return 1;
		} else {
			System.out.println("값이 없다.");
			return 0;
		}
	}
	
}
