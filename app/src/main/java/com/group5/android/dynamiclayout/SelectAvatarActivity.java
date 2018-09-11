package com.group5.android.dynamiclayout;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.Image;
import android.net.Uri;
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
        final ImageButton b1 = findViewById(R.id.avatar1);

        final ImageButton b2 = findViewById(R.id.avatar2);
        final ImageButton b3 = findViewById(R.id.avatar3);
        final ImageButton b4 = findViewById(R.id.avatar4);
        final ImageButton b5 = findViewById(R.id.avatar5);
        final ImageButton b6 = findViewById(R.id.avatar6);

        setResult(Activity.RESULT_OK,returnIntent);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",b1.getId());
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",b2.getId());
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",b3.getId());
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",b4.getId());
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",b5.getId());
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnIntent.putExtra("result",b6.getId());
                finish();
            }
        });



    }
}
