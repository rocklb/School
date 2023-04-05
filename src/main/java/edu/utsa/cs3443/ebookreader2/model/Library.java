package edu.utsa.cs3443.ebookreader2.model;

import android.content.res.AssetManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Library {

    private static String dir;
    private static ArrayList<EBook> books = new ArrayList();


    public static void loadBooks(AssetManager manager, String dir) {

        String[] libBooks;
        String bookTitle;
        try {
           libBooks = manager.list(dir);
            //System.out.println("length of arrayList: ");
            for(String bookFilename : libBooks){
                bookTitle = bookFilename.substring(0, bookFilename.length() -4);
                EBook book = new TxtBook(bookTitle, bookFilename);
                book.setBookCover();
                book.setPath(dir);
                addBook(book);
            }

        } catch (IOException var9) {
            throw new RuntimeException(var9);
        }
    }

    public static String getDir() {
        return dir;
    }

    public static void setDir(String dir) {
        Library.dir = dir;
    }

    public static ArrayList<EBook> getBooks() {
        return books;
    }

    public static void addBook(EBook book) {
        books.add(book);
    }

    public static EBook getBook(int index) {
        return (EBook)books.get(index);
    }

    public static EBook getBook(String title){
        for(EBook book : books){
            if(book.getTitle().equals(title))
                return book;
        }
        return null;
    }

}
