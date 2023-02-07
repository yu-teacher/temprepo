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
public class Favorites {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //pk, nn, ai
	private int favoritesNum; //즐겨찾기번호
	
	@Column(nullable = false) //fk, nn | 회원번호(멤버):즐찾 누른사람 = 1:n
	private int bookmarker; //즐겨찾기 누른 사람
	
	@Column(nullable = false) //fk, nn | 회원번호(멤버):즐찾 추가된사람 = 1:n
	private int bookmarked; //즐겨찾기 추가된 사람
	
}
