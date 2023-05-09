package org.studyeasy.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.Repository.PostRepository;
import org.studyeasy.entity.Post;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;

	public List<Post> getPosts() {
		List<Post>list=new ArrayList<>();
		for(Post post:repo.findAll()) {
			list.add(post);
		}
		return list;
	}

	public Post getPost(int id) {
		return repo.findById(id).get();
	}

	public void addPost(Post ele) {
		repo.save(ele);
	}

	public void updatePost(Post post) {
		repo.save(post);
		
	}
	
	public void deletePost(int id) {
		repo.deleteById(id);
		
	} 

}
