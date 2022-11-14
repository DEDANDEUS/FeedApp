package com.bptn.repository;
import com.bptn.models.Post;

public interface FeedPostRepository extends FeedRepository {
	Post save(Post feed);

}
