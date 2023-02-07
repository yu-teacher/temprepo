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
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ViewMember { //보기권한

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //pk, nn, ai	
	private int viewMemberNum; //보기권한번호
	
	@Column(nullable = false) //fk, nn | 회원번호(멤버):권한회원 = 1:n
	private int memberNum; //보기권한 회원번호

	@Column(length = 30)
	private String viewId; //보기권한 아이디
}
