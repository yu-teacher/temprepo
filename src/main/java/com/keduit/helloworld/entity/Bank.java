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
public class Bank extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //pk, nn, ai
	private int bankNum; //충전번호
	
	@Column(nullable = false) //fk | 회원번호(멤버):거래내역 = 1:n
	private int accountNum; //거래번호
	
	@Column
	private int bankCashPoint; //충전금액
	
	@Column(nullable = false) //nn
	private int bankPoint; //잔액
	
	@Column
	private int bankPointCash; //환전금액
	
}
