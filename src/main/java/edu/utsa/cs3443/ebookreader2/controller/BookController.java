package edu.utsa.cs3443.ebookreader2.controller;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import edu.utsa.cs3443.ebookreader2.R;
import edu.utsa.cs3443.ebookreader2.model.Library;

public class BookController implements View.OnClickListener{

    private final Activity activity;

    public BookController(Activity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {

        // TODO: Based on the button clicked we want to advance/go-back to a book page.

    }

    public void fetchBook(String title){
        displayTitle(title);
        displayBook(title);
        displayCover(title);
    }

    private void displayTitle(String title){
        TextView tvTitle = (TextView) activity.findViewById(R.id.book_title);
        tvTitle.setText(title.toUpperCase());
        // TextView tvTitle = (TextView) activity.findViewById(R.id.book_title);
        // tvTitle.setText("Book Title Based on Click");
    }

    private void displayBook(String title){
        TextView tvText = (TextView) activity.findViewById(R.id.book_text);
        tvText.setText(Library.getBook(title).readBook(activity.getAssets()));
        // tvBook.setText = ("read this from txt file!");
        // tvText.setText(Library.getBook(0).readBook());
    }

    private void displayCover(String title){
        ImageView ivBookCover = (ImageView) activity.findViewById(R.id.book_cover);
        int imageResource = activity.getResources().getIdentifier(title,"drawable", activity.getPackageName());
        ivBookCover.setImageResource(imageResource);
        // int imageResource = activity.getResources().getIdentifier("sample_image", "drawable", activity.getPackageName());
    }

}
