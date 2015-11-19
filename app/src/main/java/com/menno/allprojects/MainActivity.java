package com.menno.allprojects;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = (Button) findViewById(R.id.btn_spotify);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "This button will launch my spotify streamer app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        final Button button2 = (Button) findViewById(R.id.btn_scores);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "This button will launch my scores app app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        final Button button3 = (Button) findViewById(R.id.btn_library);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "This button will launch my library app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        final Button button4 = (Button) findViewById(R.id.btn_build_bigger);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "This button will launch my build it bigger app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        final Button button5 = (Button) findViewById(R.id.btn_xyz_reader);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "This button will launch my xyz reader app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        final Button button6 = (Button) findViewById(R.id.btn_capstone);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "This button will launch my capstone app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
