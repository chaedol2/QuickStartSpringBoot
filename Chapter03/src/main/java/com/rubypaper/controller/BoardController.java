package com.rubypaper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;
import com.rubypaper.service.BoardService;

@RestController //스프링부트에서 지원하는 어노테이션으로 REST방식의 응답처리를 하는 컨트롤러구현이 가능하다. 별도로 view화면을 만들 필요가 없고 return되는 문자열이 그대로 화면에 보여진다.
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	//RestController 1번 리턴값이 스트링인경우 브라우저는 응답 프로토콜 보디에 세팅된 문자열을 그대로 출력한다.
	@GetMapping("/hello")
	public String hello(String name) {
		return boardService.hello(name);
	}
	
	//RestController 2번 리턴값이 VO인경우 브라우저에 JSON으로 변환된 결과를 출력한다.
	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		return boardService.getBoard();
	}
	
	//RestController 3번 리턴값이 컬렉션인경우 브라우저에 JSON으로 변환된 결과를 출력한다.
	@GetMapping("/getBoardList")
	public List<BoardVO> getBoardList(){
		return boardService.getBoardList();
	}
}
