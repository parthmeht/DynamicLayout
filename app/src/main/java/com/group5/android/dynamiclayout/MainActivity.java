package com.group5.android.dynamiclayout;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String avatarString;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this.getApplicationContext();

        final Intent i1 = new Intent(this, SelectAvatarActivity.class);
        ImageView avatarImage = findViewById(R.id.imageView);
        avatarImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(i1,1);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if(resultCode == Activity.RESULT_OK){

                avatarString = data.getExtras().get("result").toString();
                ImageView r = findViewById(R.id.imageView);
//                r.setImageDrawable(getDrawable());


                Log.d("result",data.getExtras().get("result").toString());
            }
        }
    }

}
