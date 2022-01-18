package com.rubypaper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.controller.BoardController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=BoardController.class,
			properties= {"author.name=Gurum",
						"author.age=45",
						"author.nation=Korea"})
public class PropertiesTest {
	@Autowired //application.propeties에 추가한 프로퍼티스들을 사용하기 위해서 Environment 객체를 의존성 주입하였다.
	Environment environment;
	
	@Test
	public void testMethod() {
		//Environment 객체를 이용하여 이름, 나이, 국가에 해다하는 프로퍼티 값을 출력하도록 테스트 케이스 작성.
		System.out.println("이름 : " + environment.getProperty("author.name"));
		System.out.println("나이 : " + environment.getProperty("author.age"));
		System.out.println("국가 : " + environment.getProperty("author.nation"));
		
	}
}
