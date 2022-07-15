package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.MemberNotcieVO;

public class NoticeDAO {
	
	
	public ArrayList<MemberNotcieVO> getNoticeList() throws Exception{
		ArrayList<MemberNotcieVO> noticeList = new ArrayList<MemberNotcieVO>();
		String sql = "select * from member_notice order by notice_num asc";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			MemberNotcieVO notice = new MemberNotcieVO();
			notice.setNotice_num(rs.getInt(1));
			notice.setNotice_title(rs.getString(2));
			notice.setNotice_contents(rs.getString(3));
			notice.setNotice_writer(rs.getString(4));
			notice.setNotice_day(rs.getDate(5));
			noticeList.add(notice);
		}
		pstmt.close();
		return noticeList;
	}
	
	public ArrayList<MemberNotcieVO> getNoticePageList(int start, int end) throws Exception{
		ArrayList<MemberNotcieVO> noticeList = new ArrayList<MemberNotcieVO>();
		String sql = "select * from " +  
				"(select rownum rnum, A.* from member_notice A) " +
				"where rnum >= ? and rnum <= ? order by notice_num desc";
				
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, start);
		pstmt.setInt(2, end);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			MemberNotcieVO notice = new MemberNotcieVO();
			notice.setNotice_rnum(rs.getInt("rnum"));
			notice.setNotice_num(rs.getInt("notice_num"));
			notice.setNotice_title(rs.getString("notice_title"));
			notice.setNotice_contents(rs.getString("notice_contents"));
			notice.setNotice_writer(rs.getString("notice_writer"));
			notice.setNotice_day(rs.getDate("notice_day"));
			noticeList.add(notice);
		}
		pstmt.close();
		return noticeList;
	}
	
	
	public int getListCount() throws Exception{
		String sql = "select count(*) from member_notice";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		
		int result = rs.getInt(1);
		
		return result;
	}
	
	public int searchTitleCount(String str) throws Exception{
		String sql = "select count(*) from member_notice where notice_title LIKE ?";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		String title = "%" + str + "%";
		pstmt.setString(1, title);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		
		int result = rs.getInt(1);
		
		return result;
	}
	
	public int searchWriterCount(String str) throws Exception{
		String sql = "select count(*) from member_notice where notice_writer LIKE ?";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		String writer = "%"+str+"%";
		pstmt.setString(1, writer);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		
		int result = rs.getInt(1);
		
		return result;
	}
	
	public ArrayList<MemberNotcieVO> searchTitle(String title, int start, int end) throws Exception{
		String sql = "select * from " +  
				"(select rownum rnum, A.* from member_notice A) " +
				"where rnum >= ? and rnum <= ? and notice_title like ? ";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, start);
		pstmt.setInt(2, end);
		String str = "%"+ title +"%";
		pstmt.setString(3, str);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<MemberNotcieVO> noticeList = new ArrayList<MemberNotcieVO>();
		
		while(rs.next()) {
			MemberNotcieVO nvo = new MemberNotcieVO();
			nvo.setNotice_rnum(rs.getInt("rnum"));
			nvo.setNotice_num(rs.getInt("notice_num"));
			nvo.setNotice_title(rs.getString("notice_title"));
			nvo.setNotice_contents(rs.getString("notice_contents"));
			nvo.setNotice_writer(rs.getString("notice_writer"));
			nvo.setNotice_day(rs.getDate("notice_day"));
			
			noticeList.add(nvo);
		}
		
		return noticeList;
	}
	
	public ArrayList<MemberNotcieVO> searchWriter(String writer, int start, int end) throws Exception{
		String sql = "select * from " +  
				"(select rownum rnum, A.* from member_notice A) " +
				"where rnum >= ? and rnum <= ? and notice_writer like ?";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, start);
		pstmt.setInt(2, end);
		String str = "%"+ writer +"%";
		pstmt.setString(3, str);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<MemberNotcieVO> noticeList = new ArrayList<MemberNotcieVO>();
		
		while(rs.next()) {
			MemberNotcieVO nvo = new MemberNotcieVO();
			nvo.setNotice_rnum(rs.getInt("rnum"));
			nvo.setNotice_num(rs.getInt("notice_num"));
			nvo.setNotice_contents(rs.getString("notice_contents"));
			nvo.setNotice_writer(rs.getString("notice_writer"));
			nvo.setNotice_day(rs.getDate("notice_day"));
			
			noticeList.add(nvo);
		}
		
		return noticeList;
	}
	
	public int registNotice(MemberNotcieVO nvo) throws Exception{
		String sql = "insert into member_notice values (seq_notice.nextval, ?, ?, ?, sysdate)";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nvo.getNotice_title());
		pstmt.setString(2, nvo.getNotice_contents());
		pstmt.setString(3, nvo.getNotice_writer());
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		if(result == 1) {
			return result;
		} else {
			return 0;
		}
	}
	
	public int updateNotice(MemberNotcieVO nvo) throws Exception{
		String sql = "update member_notice set notice_title=?, notice_contents=? where notice_num=?";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nvo.getNotice_title());
		pstmt.setString(2, nvo.getNotice_contents());
		pstmt.setInt(3, nvo.getNotice_num());
		
		int result = pstmt.executeUpdate();
		pstmt.close();
		if(result == 1) {
			return result;
		} else {
			return 0;
		}
	}
	
	public int deleteNotice(MemberNotcieVO nvo) throws Exception{	
		String sql = "delete from member_notice where num = ?";
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, nvo.getNotice_num());
		int result = pstmt.executeUpdate();
		
		
		pstmt.close();
		if(result == 1) {
			return result;
		} else {
			return 0;
		}
		
	}
}
