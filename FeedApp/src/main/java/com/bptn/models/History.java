package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"History\"")

public class History {
    @Id
    @Column(name = "\"postID\"")
    private String postID;


    @Column(name = "\"usernameKey\"")
    private String usernameKey;

    @Column(name = "\"date\"")
    private String date;

    @Column(name = "\"postType\"")
    private String postType;

    @Column(name = "\"postUpload\"")
    private String postUpload;


    //  constructors
    public History() {
        super();
    }

    //  parameterized constructors
    public History(String postID, String usernameKey, String date, String postType, String postUpload) {
        this.postID = postID;
        this.usernameKey = usernameKey;
        this.date = date;
        this.postType = postType;
        this.postUpload = postUpload;
    }


    //        getters
    public String getPostID() {
        return postID;
    }

    public String getUsernameKey() {
        return usernameKey;
    }

    public String getDate() {
        return date;
    }

    public String getPostType() {
        return postType;
    }

    public String getPostUpload() {
        return postUpload;
    }

    //    setters
    public void setPostID(String postID) {
        this.postID = postID;
    }

    public void setUsernameKey(String usernameKey) {
        this.usernameKey = usernameKey;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public void setPostUpload(String postUpload) {
        this.postUpload = postUpload;
    }

}
