package com.epicquotes;

public class Quote {
    private String content;
    private String author;

    public Quote() {}
    
    public Quote(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public String getContent() {
        return this.content;
    }

    public Quote setContent(String content) {
        this.content = content;
        return this;
    }

    public String getAuthor() {
        return this.author;
    }

    public Quote setAuthor(String author) {
        this.author = author;
        return this;
    }
    
    public String toString() {
    	return this.content + " -" + this.author;
    }
}
