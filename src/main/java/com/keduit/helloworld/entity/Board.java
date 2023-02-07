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
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Board extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** Board 고유 pk */
	private Integer boardNum;
	
	@Column(length = 100, nullable = false)
	/** Board 제목 */
	private String title;
	
	@Column(length = 3000, nullable = false)
	/** Board 내용 */
	private String content;
	
	/** member테이블과 fk */
	private Integer memberNum;	// 맴버테이블과 fk
	
	@Column(length = 100)
	/** Board 사진 */
	private String url;
	
	@Column(columnDefinition = "INT DEFAULT 0")
	/** Board 조회수 */
	private Integer views;
	
	@Column(columnDefinition = "INT DEFAULT 0")
	/** Board 댓글수 */
	private Integer cnt;
	
	@Column(length = 100)
	/** Board 해시태그 */
	private String tag;
	
}
