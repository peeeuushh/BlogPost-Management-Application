package com.blog.model;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comment {
    public Comment(int id, int cblogid, int cuserid, String cdesc, Date date) {
		super();
		this.id = id;
		this.cblogid = cblogid;
		this.cuserid = cuserid;
		this.cdesc = cdesc;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", cblogid=" + cblogid + ", cuserid=" + cuserid + ", cdesc=" + cdesc + ", date="
				+ date + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCblogid() {
		return cblogid;
	}

	public void setCblogid(int cblogid) {
		this.cblogid = cblogid;
	}

	public int getCuserid() {
		return cuserid;
	}

	public void setCuserid(int cuserid) {
		this.cuserid = cuserid;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public Comment()
	{
		
	}

	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="comment_id")
    private int id;
    
	@Column(name="c_blogid")
    private int cblogid;
    
	@Column(name="c_userid")
    private int cuserid;
    
	@Column(name="c_desc")
    private String cdesc;
    
	@Column(name="c_date")
    private Date date;
    
    
}