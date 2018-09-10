package com.group5.android.dynamiclayout;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SelectAvatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_avatar);
        final Intent returnIntent = new Intent();

        setResult(Activity.RESULT_OK,returnIntent);
        findViewById(R.id.avatar1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",1);
                finish();
            }
        });
        findViewById(R.id.avatar2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",2);
                finish();
            }
        });
        findViewById(R.id.avatar3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",3);
                finish();
            }
        });
        findViewById(R.id.avatar4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",4);
                finish();
            }
        });
        findViewById(R.id.avatar5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",5);
                finish();
            }
        });
        findViewById(R.id.avatar6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",6);
                finish();
            }
        });



    }
}
