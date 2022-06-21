package vo;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberVO {
	private int custno;
	private String custname;
	private String phone;
	private String adress;
	private Date joindate;
	private String grade;
	private String city;
}
