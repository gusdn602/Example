package com.increpas.cls.dao;

import java.util.*;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.*;

import com.increpas.cls.vo.*;

public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public void testDAO() {
		System.out.println("######### testDAO() 실행 ############# ");
	}
	
	public int idCheck(String id) {
		return sqlSession.selectOne("mSQL.idCount", id);
	}
	
	// 로그인 질의명령 전담 처리함수
	public int login(MemberVO mVO) {
		return sqlSession.selectOne("mSQL.Login", mVO);
	}
	
	// 회원 버튼 리스트 가져오기 전담 처리 함수
	public List getList() {
		return sqlSession.selectList("mSQL.nameList");
	}
	
	//회원 상세 정보 데이터베이스 조회 전담 처리 함수
	public MemberVO getDetail(int mno) {
		return sqlSession.selectOne("mSQL.mDetail", mno);
	}
}
