package vo;

import java.sql.Date;

import lombok.Data;

@Data
public class VendingMemberVO {
	
	private int member_num;
	private String id;
	private String pw;
	private String name;
	private String adress;
	private String tel;
	private Date sign_day;
}
