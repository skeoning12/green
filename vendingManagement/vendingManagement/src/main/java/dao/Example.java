package dao;

public class Example {

	public static void main(String[] args) {
		NoticeDAO dao = new NoticeDAO();
		try {
			dao.getListCount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
