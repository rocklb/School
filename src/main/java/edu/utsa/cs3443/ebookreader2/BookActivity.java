package edu.utsa.cs3443.ebookreader2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.ebookreader2.controller.BookController;
import edu.utsa.cs3443.ebookreader2.controller.MainController;

public class BookActivity extends AppCompatActivity {

    private BookController controller;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        controller = new BookController(this);

        // String key = "book name";
        // String title = getIntent().getStringExtra(key);

        controller.fetchBook(MainController.getBookTitle(getIntent()));
    }
}
