package com.example.taruc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main() function
        super.onCreate(savedInstanceState);

        //To display
        //R = resources class
        //layout = folder name
        setContentView(R.layout.activity_main);
        textViewMsg = findViewById(R.id.textViewMessage);
    }

    public void showMessage(View v){
        //Linking UI to program
        textViewMsg.setText("Hello, <Your Name Here>");
    }

    public void clearScreen(View v){
        textViewMsg.setText("");
    }
}
