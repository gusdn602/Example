package com.increpas.cls.controller.member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.increpas.cls.dao.*;
import com.increpas.cls.home.*;
import com.increpas.cls.service.BoardService;
import com.increpas.cls.util.PageUtil;
import com.increpas.cls.vo.*;

@Controller
@RequestMapping("/board")
public class Board {

	@Autowired
	BoardDAO bDAO;
	
	@Autowired
	BoardVO bvo;
	
	@Autowired
	BoardService bSrvc;
	
	@RequestMapping("/boardList.cls")
	public ModelAndView boardList(HttpServletRequest req,ModelAndView mv, PageUtil page) {
		/*String sid = (String)session.getAttribute("SID");
		if(sid == null || sid.length() == 0) {
			RedirectView rv = new RedirectView("/clsproj/member/login.cls");
			mv.setView(rv);
		}else {
			int nowPage = 1;
			if(page.getNowPage() == 0) {
				nowPage = 1;
				page.setNowPage(1);
			}else {
				nowPage = page.getNowPage();
			}
			
			int totalCount = bDAO.getCnt();
			page.setPage(totalCount);
			ArrayList<BoardVO> list = (ArrayList<BoardVO>)bDAO.getList(page);
			
			mv.addObject("LIST", list);
			mv.addObject("PAGE" ,page);
			mv.setViewName("board/boardList");
		}
		*/
		bSrvc.getBrdList(req, mv, page);
		return mv;
	}
	@RequestMapping("/boardWrite.cls")
	public ModelAndView writeForm(HttpServletRequest req, ModelAndView mv, BoardVO bVo) {
		bSrvc.writeSrvc(req, mv, bVo);
		return mv;
	}
	
	@RequestMapping("/boardDetail.cls")
	public ModelAndView boardDetail(HttpServletRequest req, ModelAndView mv, BoardVO bVo) {
		
		return mv;
	}
	
	
	
}
