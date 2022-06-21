package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import vo.MemberVO;

public class MemberDAO {
	
	public int insertMember(MemberVO m) throws Exception {
		String sql = "insert into member_tbl_02 values (?, ?, ?, ?, ?, ?, ?)";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, m.getCustno());
		pstmt.setString(2, m.getCustname());
		pstmt.setString(3, m.getPhone());
		pstmt.setString(4, m.getAdress());
		pstmt.setDate(5, m.getJoindate());
		pstmt.setString(6, m.getGrade());
		pstmt.setString(7, m.getCity());
		
		int result = pstmt.executeUpdate();
		
		if(result == 0) {
			System.out.println("입력실패");
			return result;
		} else {
			System.out.println("입력성공");
			return result;
		}
		
	}
	
	public Date changeDay(String day) {
		Date d = Date.valueOf(day);
		System.out.println(d);
		return d;
	}
	
	public int updateMember(MemberVO member) throws Exception {
		//0. 쿼리준비
		String sql = "UPDATE member_tbl_02 SET custno = ?, custname = ?, phone = ?, adress = ?, joindate = ?, grade = ?, city = ? WHERE custno = ?";
		//1. db 접속
		Connection conn = DBcon.getConnection();
		//2) 쿼리 실행준비, 실행
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, member.getCustno());
		pstmt.setString(2, member.getCustname());
		pstmt.setString(3, member.getPhone());
		pstmt.setString(4, member.getAdress());
		pstmt.setDate(5, member.getJoindate());
		pstmt.setString(6, member.getGrade());
		pstmt.setString(7, member.getCity());
		pstmt.setInt(8, member.getCustno());
		int result = pstmt.executeUpdate();
		if(result == 0) {
			System.out.println("입력실패");
			return result;
		} else {
			System.out.println("입력성공");
			return result;
		}
		
	}
	
	public int deleteMember(MemberVO member) throws Exception{
		String sql = "delete from member_tbl_02 where custno = ?";
		Connection conn = DBcon.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, member.getCustno());
		int result = pstmt.executeUpdate();
		
		if(result == 0) {
			System.out.println("입력실패");
			return result;
		} else {
			System.out.println("입력성공");
			return result;
		}
	}
}
