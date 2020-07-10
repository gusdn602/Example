package com.increpas.cls.dao;

import java.util.*;

import org.mybatis.spring.SqlSessionTemplate;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.increpas.cls.util.PageUtil;
import com.increpas.cls.vo.*;

public class BoardDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int board(BoardVO bVO) {
		return sqlSession.selectOne("bSQL.gBoard", bVO);
	}
	
	//게시판 게시물 갯수 조회 전담 처리함수
	public int getCnt() {
		return sqlSession.selectOne("bSQL.selCnt");
	}
	
	public List getList(PageUtil page) {
		return sqlSession.selectList("bSQL.getList", page);
	}
	
	public int addList(BoardVO bVO) {
		return sqlSession.insert("bSQL.addList", bVO);
	}
	
	public int addImg(ProfileVO fVO) {
		return sqlSession.insert("bSQL.addImg", fVO);
	}
	
	public List getDetail(BoardVO bVO) {
		return sqlSession.selectList("bSQL.selDetail", bVO);
	}
}
