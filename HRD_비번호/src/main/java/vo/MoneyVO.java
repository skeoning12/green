package vo;

import java.sql.Date;

import lombok.Data;

@Data
public class MoneyVO {
	private int custno;
	private int salenol;
	private int pcost;
	private int amount;
	private int price;
	private String pcode;
	private Date sdate;
}
