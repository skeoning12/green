package vo;

import lombok.Data;

@Data
public class LoginMember {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String job;
	private String hobby;
	private String signupword;
}
