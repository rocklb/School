package edu.utsa.cs3443.ebookreader2.model;

import android.content.res.AssetManager;

public class PDFBook extends EBook{

    public PDFBook(String title, String filename){
        super(title, filename);
    }

    @Override
    public String readBook(AssetManager manager){
        return "";
    }
}
