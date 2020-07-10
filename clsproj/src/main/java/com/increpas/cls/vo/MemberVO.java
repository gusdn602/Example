package com.increpas.cls.vo;

import java.sql.*;
import java.text.*;

public class MemberVO {
	private int mno, ano;
	private String oriname, id, pw, mail, gen, tel, sdate, avatar;
	private Date jDate, Bdate;
	private Time jTime;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return oriname;
	}
	public void setName(String name) {
		this.oriname = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		this.sdate = form1.format(jDate) + " " + form2.format(jTime);
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Date getjDate() {
		return jDate;
	}
	public void setjDate(Date jDate) {
		this.jDate = jDate;
	}
	public Time getjTime() {
		return jTime;
	}
	public void setjTime(Time jTime) {
		this.jTime = jTime;
	}

	public Date getBdate() {
		return Bdate;
	}
	public void setBdate(Date bdate) {
		Bdate = bdate;
	}
	public String toString() {
		return "MemberVO [mno=" + mno + ", ano=" + ano + ", name=" + oriname + ", id=" + id + ", pw=" + pw + ", mail="
				+ mail + ", gen=" + gen + ", tel=" + tel + ", avatar=" + avatar + ", jDate=" + jDate + ", jTime="
				+ jTime + "]";
	}
}
