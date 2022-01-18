package com.rubypaper.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//Lombok이 제공하는 어노테이션 :
/*
 * @Getter : Getter 메소드를 만들어준다.
 * 
 * @Setter : Setter 메소드를 만들어준다.
 * 
 * @RequiredArgsConstructor : 모든 멤버 변수를 초기화하는 생성자를 만들어준다.
 * 
 * @ToString : 모든 멤버 변수의 값을 문자열로 연결하여 리턴하는 toString() 메소드를 만들어준다.
 * 
 * @EqualsAndHashCode : equals(), hashCode() 메소드를 만들어준다.
 * 
 * @Data
 * : @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
 * 모두를 포함한다.
 */
public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date createDate = new Date();
	private int cnt = 0;
	
}
