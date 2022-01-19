package com.rubypaper;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.rubypaper.service.BoardService;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.MOCK)
////@WebMvcTest //컨트롤러와 @Controller, @RestController 가 지정된 클래스를 찾아 메모리 생성한다. MockMvc를 모킹하기 때문에 @SpringBootTest와 충돌이 발생하여 같이사용 할 수 없다.
//@AutoConfigureMockMvc //WebMvcTest와 가장 큰 차이점은 컨트롤러뿐만아니라 테스트대상이아닌 @Service나 @Repository가 붙은 모든 객체를 메모리에 올린다. @SpringBootTest와 함께 사용한다.
//public class BoardControllerTest {
////	@Autowired
////	private TestRestTemplate restTemplate;
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@MockBean
//	private BoardService boardService;
//	
////	@Test
////	public void testHello() throws Exception {
////		mockMvc.perform(get("/hello").param("name", "둘리"))
////		.andExpect(status().isOk())
////		.andExpect((ResultMatcher) content()
////		.string("Hello : 둘리"))
////		.andDo(print());
////	}
//	
////	@Test
////	public void testHello() throws Exception {
////		String result = restTemplate.getForObject("/hello?name=둘리", String.class);
////		assertEquals("Hello : 둘리", result);
////	}
//	
////	@Test
////	public void testGetBoard() throws Exception{
////		BoardVO board = restTemplate.getForObject("/getBoard", BoardVO.class);
////		assertEquals("테스터", board.getWriter());
////	}
//	
//	@Test
//	public void testHello() throws Exception{
//		when(boardService.hello("둘리")).thenReturn("Hello : 둘리");
//		
//		mockMvc.perform(get("/hello").param("name", "둘리")).andExpect(status().isOk()).andExpect((ResultMatcher) content().string("Hello : 둘리")).andDo(print());
//	}
//}

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class BoardControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private BoardService boardService;
	
	@Test
	public void testHello() throws Exception {
		when(boardService.hello("둘리")).thenReturn("Hello : 둘리");
		
		mockMvc.perform(get("/hello").param("name", "둘리"))
		.andExpect(status().isOk())
		.andExpect((ResultMatcher) content().string("Hello : 둘리"))
		.andDo(print());	
	}
}
