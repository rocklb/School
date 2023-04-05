package edu.utsa.cs3443.ebookreader2.model;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TxtBook extends EBook{

    public TxtBook(String title, String filename){
        super(title, filename);
    }


    @Override
    public String readBook(AssetManager manager) {
        // TODO: implement this method to read from the file, given the filename
        // return "Enjoy reading!\n\n" + getTitle();

        String page = "";
        Scanner scan;

        try{
            InputStream in = manager.open(getPath());
            System.out.println(in);
            scan = new Scanner(in);
            String line;
            while(scan.hasNextLine()){
                line = scan.nextLine();
                page = page + line;
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return page;
    }


}
