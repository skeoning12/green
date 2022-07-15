package vo;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberNotcieVO {
	private int notice_num;
	private int notice_rnum;
	private String notice_title;
	private String notice_contents;
	private String notice_writer;
	private Date notice_day;	
}
