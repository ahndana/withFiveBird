package study.spring.withfivebird.service;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.slf4j.Slf4j;
import study.spring.withfivebird.model.User;

/** Lombok의 log4j 객체 */
// import lombok.extern.slf4j.Slf4j;
@Slf4j
/** JUnit에 의한 테스트 클래스로 정의 */
@RunWith(SpringJUnit4ClassRunner.class)
/** Spring의 설정 파일들을 읽어들이도록 설정 (**은 '모든'이라는 의미) */
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
/** 웹 어플리케이션임을 명시 */
@WebAppConfiguration
/** 메서드 이름순서로 실행하도록 설정 (설정하지 않을 경우 무작위 순서로 실행됨) */
@FixMethodOrder

public class UserServiceTest {
	/** Service 객체 주입 설정 */
	@Autowired
	private UserService userService;
	
	/** 단일행 조회 테스트 */
//	@Test
//	public void testA() {
//		// 검색조건으로 사용될 POJO 클래스 객체 
//		User input = new User();
//		input.setUser_no(4);
//		
//		User output = null;
//		
//		try {
//			output = userService.getUserItem(input);
//			log.debug(output.toString());
//		}catch(Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
	
	/** 다중행 조회 테스트 */
//	@Test
//	public void testB() {
//		// 검색조건으로 사용될 POJO 클래스 객체 
//		User input = new User();
//		input.setUser_addr1("서초");
//		
//		List<User> output = null;
//		
//		try {
//			output = userService.getUserList(input);
//			
//			for(User item : output) {
//				log.debug(item.toString());
//			}
//		}catch(Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
	
	/** 전체 데이터 수 조회 */
//	@Test
//	public void testC() {
//		int count = 0;
//		
//		try {
//			count = userService.getUserCount(null);
//			log.debug("전체 데이터 수 : " + count);
//		}catch(Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
	
	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testD() {
//		int count = 0;
//		
//		User input = new User();
//		input.setUser_addr1("서초");
//		
//		try {
//			count = userService.getUserCount(input);
//			log.debug("서초 포함하는 데이터 수 : " + count);
//		}catch(Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
	
	/** 데이터 저장 테스트 */
//	@Test
//	public void testE() {
//		User input = new User();
//		input.setUser_id("user_id");
//		input.setUser_pw("user_pw1");
//		input.setUser_name("유저이름");
//		input.setUser_tel("01012345667");
//		input.setUser_email("test@naver.com");
//		input.setUser_postcode("01924");
//		input.setUser_addr1("서울특별시 무슨구 무슨동 29-1");
//		input.setUser_addr2("이젠");
//		input.setUser_out("N");
//		input.setLevel_no(4);
//		
//		int output = 0;
//		
//		try {
//			output = userService.addUser(input);
//			log.debug("저장된 데이터 수 : " + output);
//			// [중요] 생성된 PK값은 MyBatis에 의해 입력 파라미터의 해당 멤버변수에  셋팅된다.
//			log.debug("생성된 PK값 : "+ input.getUser_no());
//		}catch(Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
	
	/** 데이터 수정 테스트 */
//	@Test
//	public void testF() {
//		User input = new User();
//		input.setUser_no(6);
//		input.setUser_id("purplerose");
//		input.setUser_pw("EnaEoadl!@#");
//		input.setUser_name("야옹이");
//		input.setUser_tel("01012345667");
//		input.setUser_email("j.purplerose@gmail.com");
//		input.setUser_postcode("06611");
//		input.setUser_addr1("서울특별시 서초구 서초 4 서초대로77길 55동");
//		input.setUser_addr2("3층 이젠IT");
//		input.setUser_out("N");
//		input.setLevel_no(1);
//		
//		int output = 0;
//		
//		try {
//			output = userService.editUser(input);
//			log.debug("수정된 데이터 수 : " + output);
//		}catch(Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
	
	/** 데이터 삭제 테스트 */
//	@Test
//	public void testG() {
//		User input = new User();
//		input.setUser_no(7);
//		
//		int output = 0;
//		
//		try {
//			output = userService.deleteUser(input);
//			log.debug("삭제된 데이터 수 : " + output);
//		}catch(Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
}
