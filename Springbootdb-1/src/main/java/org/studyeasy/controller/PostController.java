package org.studyeasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.entity.Post;
import org.studyeasy.services.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService service;
	
	@RequestMapping("/posts")
	public List<Post>getPosts(){
		return service.getPosts();
	}
	
	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable int id) {
		return service.getPost(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/posts")
	public void addPost(@RequestBody Post ele) {
		 service.addPost(ele);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/posts/{id}")
	public void updatePost(@RequestBody Post post) {
		service.updatePost(post);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/posts/{id}")
	public void deletePost(@PathVariable int id) {
		service.deletePost(id);
	} 
}
