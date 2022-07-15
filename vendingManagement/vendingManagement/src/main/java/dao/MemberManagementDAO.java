package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.VendingMemberVO;

public class MemberManagementDAO {
	
	public int loginCheck(VendingMemberVO memberVO) throws Exception{
		String sql = "select COUNT(ID) from vending_machine_member where id = ? and pw = ?";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, memberVO.getId());
		pstmt.setString(2, memberVO.getPw());
		ResultSet rs = pstmt.executeQuery();
		int result = 0;
		while(rs.next()) {
			result = rs.getInt(1);
		}
		pstmt.close();
		return result;
	}
	
	public int idOverlap(VendingMemberVO memberVO) throws Exception{
		String sql = "select COUNT(ID) from vending_machine_member where id = ?";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, memberVO.getId());
		ResultSet rs = pstmt.executeQuery();
		int result = 0;
		while(rs.next()) {
			result = rs.getInt(1);
		}
		pstmt.close();
		return result;
	}
	
	public int registMember(VendingMemberVO memberVO) throws Exception{
		String sql = "insert into vending_machine_member values (seq_vending_member.nextval, ?, ?, ?, ?, ?, sysdate)";
		Connection conn = DBcon.getConnection();
		System.out.println(memberVO.getPw());
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, memberVO.getId());
		pstmt.setString(2, memberVO.getPw());
		pstmt.setString(3, memberVO.getName());
		pstmt.setString(4, memberVO.getAdress());
		pstmt.setString(5, memberVO.getTel());
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
	}
	
	public ArrayList<VendingMemberVO> getList() throws Exception{
		ArrayList<VendingMemberVO> memberList = new ArrayList<VendingMemberVO>();
		String sql = "select * from vending_machine_member";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			VendingMemberVO member = new VendingMemberVO();
			member.setMember_num(rs.getInt(1));
			member.setId(rs.getString(2));
			member.setPw(rs.getString(3));
			member.setName(rs.getString(4));
			member.setAdress(rs.getString(5));
			member.setTel(rs.getString(6));
			member.setSign_day(rs.getDate(7));
			
			memberList.add(member);
		}
		pstmt.close();
		return memberList;
	}

	
	
}
