package com.example.marteesmart.tee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button myProfile = (Button) findViewById(R.id.myProfile);

        Button aboutAlc = (Button) findViewById(R.id.aboutAlc);

        myProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), profile.class);
                startActivity(activity2Intent);
            }
        });

        aboutAlc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), aboutAlc.class);
                startActivity(activity2Intent);
            }
        });
    }
}
