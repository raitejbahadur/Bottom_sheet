package com.example.bottom_sheet_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    Button display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=(Button) findViewById(R.id.display);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(MainActivity.this);
                View view1= LayoutInflater.from(MainActivity.this).inflate(R.layout.bottom_sheet,null);

                bottomSheetDialog.setContentView(view1);
                bottomSheetDialog.show();
            }
        });
    }
}