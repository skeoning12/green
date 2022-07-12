package vo;

import java.sql.Date;

import lombok.Data;

@Data
public class VendingMachineVO {
	private int vending_num;
	private String vending_menu;
	private int vending_count;
	private int vending_price;
	private Date vending_date;
}
