package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.MemberNotcieVO;

public class NoticeDAO {
	
	public ArrayList<MemberNotcieVO> getNoticeList() throws Exception{
		ArrayList<MemberNotcieVO> noticeList = new ArrayList<MemberNotcieVO>();
		String sql = "select * from member_notice";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			MemberNotcieVO notice = new MemberNotcieVO();
			notice.setNum(rs.getInt(1));
			notice.setTitle(rs.getString(2));
			notice.setContents(rs.getString(3));
			notice.setWriter(rs.getString(4));
			noticeList.add(notice);
		}
		return noticeList;
	}
	
	public int registNotice(MemberNotcieVO nvo) throws Exception{
		String sql = "insert into member_notice values (seq_notice.nextval, ?, ?, ?, sysdate)";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.println(nvo.getWriter());
		pstmt.setString(1, nvo.getTitle());
		pstmt.setString(2, nvo.getContents());
		pstmt.setString(3, nvo.getWriter());
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			return result;
		} else {
			return 0;
		}
	}
}
