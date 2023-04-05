package edu.utsa.cs3443.ebookreader2.model;

import android.content.res.AssetManager;

public abstract class EBook {

    private String title;
    private String filename;
    private String path;
    private String bookCover;

    public EBook(String title, String filename){
        this.title = title;
        this.filename = filename;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(){
        this.title = title;
    }

    public String getFilename(){
        return this.filename;
    }

    public void setFilename(String filename){
        this.filename = filename;
    }

    public String getPath(){
        return this.path;
    }

    public void setPath(String path){
        this.path = path + "/" + this.filename;
    }

    public String getBookCover(){
        return this.bookCover;
    }

    public void setBookCover(){
        this.bookCover = this.title;
    }

    public String toString(){
        return title;
    }

    public abstract String readBook(AssetManager manager);

}
