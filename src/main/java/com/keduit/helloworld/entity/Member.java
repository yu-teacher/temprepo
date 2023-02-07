package com.keduit.helloworld.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memberNum;
	
	@Column(length =30, nullable = false, unique = true)
	private String id;
	
	@Column(length = 30, nullable = false)
	private String pw;
	
	@Column(length = 10, nullable = false)
	private String memberName;
	
	@Column(columnDefinition = "INT DEFAULT 0") //columnDefinition = "DATE DEFAULT SYSDATE"
	private Long point;
	
	@Column(columnDefinition = "INT DEFAULT 0")
	private Integer purview;
	
	@Column(length = 30, nullable = false, unique = true)
	private String nickname;
	
	@Column(length = 1000)
	private String introduce;
	
	@Column(length = 300)
	private String email;
	
	@Column(columnDefinition = "INT DEFAULT 0")
	private Long value;
	
	@Column(length = 100)
	private String url;
	
	
}
