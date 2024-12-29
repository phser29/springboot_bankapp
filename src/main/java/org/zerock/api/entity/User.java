package org.zerock.api.entity;

import java.math.BigDecimal;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Entity;

@Entity
public class User {
	
	@Comment("아이디")
	private Long id;
	
	@Comment("이름")
	private String name;
	
	@Comment("성별")
	private String gender;
	
	@Comment("주소")
	private String address;
	
	@Comment("국적")
	private String stateOfOringin;
	
	@Comment("계좌 번호")
	private String accountNumber;
	
	@Comment("계좌 잔액")
	private BigDecimal accountBalance; // 계정 잔액
	
	@Comment("이메일")
	private String email;
	
	@Comment("전화번호")
	private String phoneNumber;
	
	@Comment("신분")
	private String status;
	
}
