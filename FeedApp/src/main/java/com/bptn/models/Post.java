package com.bptn.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Post\"")
public class Post {
    @Id
    @Column(name = "\"postID\"")
    private String postID;

    @Column(name = "\"postType\"")
    private String postType;

    @Column(name = "\"post\"")
    private String post;


    @Column(name = "\"usernameKey\"")
    private String username;

//    constructors

    public Post() {
        super();
    }

//    parameterized constructors

    public Post(String postID, String postType, String post, String username) {
        this.postID = postID;
        this.postType = postType;
        this.post = post;
        this.username = username;
    }

    //    getter for postID
    public String getPostID() {
        return this.postID;
    }

    //    setter for postID
    public void setPostID(String postID) {
        this.postID = postID;
    }

    //    getter for postType
    public String getPostType() {
        return this.postType;
    }

    //    setter for postType
    public void setPostType(String postType) {
        this.postType = postType;
    }

    //    getter for post
    public String getPost() {
        return this.post;
    }

    //    setter for post
    public void setPost(String post) {
        this.post = post;
    }

    //    getter for usernameKey
    public String getUsername() {
        return this.username;
    }

    //    setter for usernameKey
    public void setUsername(String username) {
        this.username = username;
    }


}