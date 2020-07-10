package com.increpas.cls.vo;

import java.sql.*;
import java.text.*;
import javax.sql.*;

public class BoardVO {
	private int bno, bid, click;
	private String title, body;
	private Date bdate;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public void setBdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy년MM월dd일");
	}
	
}
