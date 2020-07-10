package com.increpas.cls.vo;

import java.sql.*;
public class ProfileVO {
	private int pno, p_mno, len;
	private String pcode, Oriname, dir;
	private Date pdate;
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getP_mno() {
		return p_mno;
	}
	public void setP_mno(int p_mno) {
		this.p_mno = p_mno;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getOriname() {
		return Oriname;
	}
	public void setOriname(String oriname) {
		this.Oriname = oriname;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	
}
