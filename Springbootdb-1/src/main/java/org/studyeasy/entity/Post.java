package org.studyeasy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	@Id
	@Column(name="id")
	int postid;
	@Column(name="title")
	String title;
	@Column(name="body")
	String body;
	public Post(){}
	public Post(int postid, String title, String desc) {
		super();
		this.postid = postid;
		this.title = title;
		this.body = desc;
	}
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
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
	@Override
	public String toString() {
		return "Post [postid=" + postid + ", title=" + title + ", desc=" + body + "]";
	}
	

}

