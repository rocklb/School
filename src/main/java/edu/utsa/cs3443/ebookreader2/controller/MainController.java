package edu.utsa.cs3443.ebookreader2.controller;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import edu.utsa.cs3443.ebookreader2.BookActivity;
import edu.utsa.cs3443.ebookreader2.model.Library;

public class MainController implements View.OnClickListener {

    private final Activity activity;
    private static String key = "book name";

    public MainController(Activity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        // based on the button clicked we want to display a book!
        // TODO: pass book name
        Button clickedButton = (Button) view;
        Intent intent = new Intent(activity, BookActivity.class);
        intent.putExtra(key, clickedButton.getText().toString().toLowerCase());
        activity.startActivity(intent);
    }

    public void updateButton(int buttonID, int buttonNumber){
        Library.setDir("my_library");
        Library.loadBooks(activity.getAssets(), Library.getDir());
        Button button = activity.findViewById(buttonID);
        button.setText(getBookTitle(buttonNumber));
    }

    private String getBookTitle(int index){
        return Library.getBook(index).getTitle().toUpperCase();
    }

    public static String getBookTitle(Intent intent){
        return intent.getStringExtra(key);
    }

}
