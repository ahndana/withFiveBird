package study.spring.withfivebird.service;

import java.util.List;

import study.spring.withfivebird.model.Level;

public interface LevelService {
	/**
	 * 등급 데이터 상세 조회
	 * @param Level 조회할 등급의 일련번호를 담고 있는 Beans
	 * @return 조회된 데이터가 저장된 Beans
	 * @throws Exception
	 */
	public Level getLevelItem(Level input) throws Exception;
	
	/**
	 * 등급 데이터 목록 조회
	 * @return 조회 결과에 대한 컬렉션 
	 * @throws Exception
	 */
	public List<Level> getLevelList(Level input) throws Exception;
	
	/**
	 * 등급 데이터가 저장되어 있는 갯수 조회
	 * @return int
	 * @throws Exception
	 */
	public int getLevelCount(Level input) throws Exception;
	
	/**
	 * 등급 데이터 등록하기
	 * @param Level 저장할 정보를 담고 있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int addLevel(Level input) throws Exception;
	
	/**
	 * 등급 데이터 수정하기
	 * @param Level 수정할 정보를 담고 있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int editLevel(Level input) throws Exception;
	
	/**
	 * 등급 데이터 삭제하기? 필요한가?
	 * @param Level 삭제할 등급의 일련번호를 담고 있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int deleteLevel(Level input) throws Exception;
}
