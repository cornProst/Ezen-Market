package com.ezen.ezenmarket.user.dto;

import java.sql.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private Integer user_number;
	private String user_name;
	private String user_id;
	private String user_pw;
	private String nickname;
	private String phoneNumber;
	private String email;
	private String user_address;
	private String user_image;
	private String user_intro;
	private Integer banned;
	private String user_pw_confirm;
	

}
