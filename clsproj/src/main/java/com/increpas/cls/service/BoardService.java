package com.increpas.cls.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;

import org.aspectj.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.increpas.cls.util.*;
import com.increpas.cls.vo.*;
import com.increpas.cls.dao.*;

@Service
public class BoardService {
	@Autowired
	BoardDAO bDAO;
	@Autowired
	FileUtil futil;
	@Autowired
	ProfileVO fVO;

	
	//게시판 리스트 요청처리 서비스 함수
	public void getBrdList(HttpServletRequest req, ModelAndView mv, PageUtil page) {
		if((Boolean)mv.getModel().get("isLogin")){
		if(page.getNowPage() == 0) {
			page.setNowPage(1);
		}
		
		int totalCount = bDAO.getCnt();
		page.setPage(totalCount);
		ArrayList<BoardVO> list = (ArrayList<BoardVO>)bDAO.getList(page);
		
		mv.addObject("LIST", list);
		mv.addObject("PAGE" ,page);
		mv.setViewName("board/boardList");
		} else {
			mv.setView(new RedirectView("/clsproj/member/login.cls"));
		}
	}
	
	//게시판 글 작성 데이터베이스 입력 처리 서비스 함수
	@Transactional
	public void writeSrvc(HttpServletRequest req, ModelAndView mv, PageUtil page, BoardVO bVO) throws Exception{
		if((Boolean)mv.getModel().get("isLogin")){
				bVO.setId((String)req.getSession().getAttribute("SID"));
				bDAO.addList(bVO);
				bVO.setBno(bVO.getBno());
				System.out.println("add board");
				
				MultipartFile[] file = fVO.getFile();
				if(file.length > 1 || file[0].getOriginalFilename() != null) {
					String savename = futil.getSaveName(req.getSession(), file, "upload");
					for (int if((Boolean)mv.getModel().get("isLogin")){ = 0; i < savename.length; i++) {
						fVO.setOriname(file[i].getOriginalFilename());
						fVO.setSavename(savename[i]);
						fVO.setLen(file[i].getSize());
						
						bDAO.addImg(bVO.getfVO());
					}
					System.out.println("add Image");
				}
				mv.setView(new RedirectView("/clsproj/boardList.cls"));
			} else {
				mv.setView(new RedirectView("/clsproj/member/login.cls"));
			}
		}
	}
	//게시글 가져오기 서비스 함수
	public void getDetail(HttpServletRequest req, ModelAndView mv, BoardVO bVO, PageUtil page) {
		if((Boolean)mv.getModel().get("isLogin")){
			//로그인 된 상태
			 List list = bDAO.getDetail(bVO);
			 mv.setViewName("/board/boardDetail");
			 
		}else {
			//로그인 아노딘 사ㅏㅇ태
		}
	}
}
