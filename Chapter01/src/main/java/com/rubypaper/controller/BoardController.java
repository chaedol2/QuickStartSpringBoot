package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;

@RestController //스프링부트에서 지원하는 어노테이션으로 REST방식의 응답처리를 하는 컨트롤러구현이 가능하다. 별도로 view화면을 만들 필요가 없고 return되는 문자열이 그대로 화면에 보여진다.
public class BoardController {
	
	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	//RestController 1번 리턴값이 스트링인경우 브라우저는 응답 프로토콜 보디에 세팅된 문자열을 그대로 출력한다.
	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello : " + name;
	}
	
	//RestController 2번 리턴값이 VO인경우 브라우저에 JSON으로 변환된 결과를 출력한다.
	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitle("테스트 제목...");
		board.setWriter("테스터");
		board.setContent("테스트 내용입니다.......");
		board.setCreateDate(new Date());
		board.setCnt(0);
		return board;
	}
	
	//RestController 3번 리턴값이 컬렉션인경우 브라우저에 JSON으로 변환된 결과를 출력한다.
	@GetMapping("/getBoardList")
	public List<BoardVO> getBoardList(){
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		for (int i = 1; i <= 10; i++) {
			BoardVO board = new BoardVO();
			board.setSeq(i);
			board.setTitle("제목" + i);
			board.setWriter("테스터");
			board.setContent(i + "번 내용입니다");
			board.setCreateDate(new Date());
			board.setCnt(0);
			boardList.add(board);
		}
		return boardList;
	}
}
