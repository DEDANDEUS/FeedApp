package com.bptn.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.bptn.models.History;

public interface FeedHistoryRepository {

	List<History> findByUsernameKey(String usernamekey);
	
	History findByPostID(String postID);
	
	List<History> findByPostType(String postType);
	
	@Transactional
	void deleteByPostType(String postType);
}
