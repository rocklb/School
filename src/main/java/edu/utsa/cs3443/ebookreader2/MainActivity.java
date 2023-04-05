package edu.utsa.cs3443.ebookreader2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.ebookreader2.controller.MainController;

public class MainActivity extends AppCompatActivity {

    private MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] buttonIDs = {R.id.book1, R.id.book2};
        controller = new MainController(this);

        for(int i = 0; i < buttonIDs.length; i++){
            findViewById(buttonIDs[i]).setOnClickListener(controller);
            controller.updateButton(buttonIDs[i],i);
        }
    }
}