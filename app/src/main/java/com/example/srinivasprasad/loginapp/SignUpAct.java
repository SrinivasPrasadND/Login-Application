package com.example.srinivasprasad.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpAct extends AppCompatActivity {

    Animation frombottom, fromtop;
    Button btnjoin;
    TextView textView2 , titleHead;
    EditText editText2, editText5, editText3, editText7;
    ImageView logoImage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        btnjoin = (Button) findViewById(R.id.btnjoin);
        textView2 = (TextView) findViewById(R.id.textView2);
        titleHead = findViewById(R.id.title_txt);


        editText2 = (EditText) findViewById(R.id.editText2);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText7 = (EditText) findViewById(R.id.editText7);
        logoImage = findViewById(R.id.logo_image);

        btnjoin.startAnimation(frombottom);


        textView2.startAnimation(fromtop);
        titleHead.startAnimation(fromtop);
        logoImage.startAnimation(fromtop);
        editText2.startAnimation(frombottom);
        editText5.startAnimation(fromtop);
        editText3.startAnimation(frombottom);
        editText7.startAnimation(fromtop);





    }
}
