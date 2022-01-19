package com.rubypaper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //JUnit에서 기본적으로 제공하는 러너가 아닌 스프링 러너를 사용하기 위해 추가함.
@SpringBootTest //메인 클래스에 선언된 @SpringBootApplication과 비슷한 어노테이션, 테스트 케이스가 실행될 떄 테스트에 필요한 모든 설정과 빈들을 자동으로 초기화하는 역활을 수행한다.
class Chapter03ApplicationTests {

	@Test
	void contextLoads() {
	}

}
