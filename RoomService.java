package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import vo.RoomVO;
import vo.SignUpVO;

public class RoomService {
	final String url = "jdbc:mariadb://localhost:3306/green";
	final String uid = "green01";
	final String upw = "1234";

	Scanner sc = new Scanner(System.in);

	public Connection dbConn() throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, uid, upw);
		if (conn != null) {
			System.out.println("db 연결됨");
		}
		return conn;
	}

	public void loginMenu() {
		System.out.println("---- 팬션 예약시스템 입니다. ----");
		System.out.println("1. 로그인하기");
		System.out.println("2. 회원가입하기");
		System.out.println("3. 종료");
	}

	// 로그인
	public void login() throws Exception {
		String sql = "select * from signup";
		Connection conn = dbConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ArrayList<SignUpVO> list = new ArrayList<SignUpVO>();
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			SignUpVO sv = new SignUpVO();
			int number = rs.getInt(1);
			String id = rs.getString(2);
			String pw = rs.getString(3);
			String name = rs.getString(4);

			sv.setNum(number);
			sv.setId(id);
			sv.setPw(pw);
			sv.setName(name);

			list.add(sv);
		}

		System.out.println("아이디를 입력해주세요.");
		
		String loginId = sc.next();
		System.out.println("비밀번호를 입력해주세요.");
		String loginPw = sc.next();

		if (loginId.equals("admin") && loginPw.equals("1234")) {
			adminPage();

		} else {

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getId());
				if (list.get(i).getId().equals(loginId) && list.get(i).getPw().equals(loginPw)) {
					System.out.println("로그인 성공");
					userPage(list.get(i));
				} else if (list.size() - 1 == i) {
					System.out.println("로그인 실패");
					return;
				}
			}
		}
		conn.close();
		pstmt.close();
	}

	// 회원가입
	public void signUp() throws Exception {

		String sql = "insert into signup (id, pw, name) values (?, ?, ?)";
		Connection conn = dbConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);

		System.out.println("---- 회원가입 페이지 입니다. ----");
		System.out.println("1. 아이디를 입력해주세요");
		String id = sc.nextLine();
		System.out.println("2. 비밀번호를 입력해주세요");
		String pw = sc.nextLine();
		System.out.println("3. 이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("회원가입 완료");

		if (id.equals("admin")) {
			System.out.println("만들수 없는 아이디 입니다.");
			return;
		} else {
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);

			int result = pstmt.executeUpdate();

			if (result == 0) {
				System.out.println("회원가입 실패~");
			} else {
				System.out.println("회원가입 성공~");
			}
		}

		conn.close();
		pstmt.close();
	}

	public void adminPage() throws Exception {
		System.out.println("---- 관리자 페이지 입니다 ----");
		System.out.println("1. 예약 현황");
		System.out.println("2. 예약 불가능방 설정");
		System.out.println("3. 기간동안 제일 많은 예약방");
		System.out.println("4. 나가기");
		int key = 0;
		while (true) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				return;
			}
		}
	}

	public void userPage(SignUpVO s) throws Exception {
		System.out.println("---- 유저 페이지 입니다. ----");
		System.out.println("                  " + s.getId() + "님 환영합니다.");
		System.out.println("1. 방 예약하기");
		System.out.println("2. 예약 변경하기");
		System.out.println("3. 예약 취소하기");
		System.out.println("4. 나가기");
		int key = 0;
		while (true) {
			key = sc.nextInt();
			switch (key) {
			case 1: 
				int r = roomList();
				System.out.println("예약 날짜 입력 \n 월(month), 일(day)만 입력");
				System.out.println("월(month)...");
				sc.nextLine();
				String month = sc.nextLine();
				System.out.println("일(day)...");
			
				String day = sc.next();
				reservation(changeDay(month, day), r, s);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				return;
			}
		}
	}
	public int roomList() {
		int num = 0;	
		System.out.println("방 번호");
		System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
		System.out.println("방번호를 입력하세요.");
		num = sc.nextInt();
		
		return num;
	}
	public Date changeDay(String month, String day) {
		String date = "2022" + "-" + month + "-" + day;
		System.out.println(date + "날짜");
		Date d = Date.valueOf(date);
		System.out.println(d);
		return d;
	}
	
	public void reservation(Date day, int r, SignUpVO s) throws Exception {
		RoomVO room = new RoomVO();
		Date days = day;
		ArrayList<RoomVO> list = new ArrayList<RoomVO>();
		String sql = "select * from room";
		Connection conn = dbConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Date d = rs.getDate(1);
			String name = rs.getString(2);
			int num = rs.getInt(3);
			String id = rs.getString(4);
			
			room.setDate(d);
			room.setName(name);
			room.setRoomNumber(num);
			room.setId(id);
			
			list.add(room);
		}
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getDate().equals(days) && list.get(i).getRoomNumber() == r) {
				System.out.println("예약 되어 있는 방입니다.");
				return;
			} 
		}
		
		System.out.println("예약 되었습니다.");
		String sql2 = "insert into room values (?, ?, ?, ?)";
		PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		pstmt2.setDate(1, days);
		pstmt2.setString(2, s.getName());
		pstmt2.setInt(3, r);
		pstmt2.setString(4, s.getId());
		
		int result = pstmt2.executeUpdate();
		if (result == 0) {
			System.out.println("예약 실패!");
		} else {
			System.out.println("예약 성공!");
		}
		
		
	}

}
