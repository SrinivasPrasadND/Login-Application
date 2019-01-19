package com.example.srinivasprasad.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Animation fromTop , fromBottom;
    TextView loginTxt,challengeTxt, createAccount;
    EditText email , password;
    ImageView logoImage;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        fromTop =  AnimationUtils.loadAnimation(this,R.anim.fromtop);
        fromBottom =  AnimationUtils.loadAnimation(this,R.anim.frombottom);

        loginTxt = findViewById(R.id.login_head);
        challengeTxt = findViewById(R.id.login_title_txt);
        email = findViewById(R.id.login_email);
        password =findViewById(R.id.login_password);
        logoImage = findViewById(R.id.login_logo_img);
        loginBtn = findViewById(R.id.login_btn);
        createAccount = findViewById(R.id.create_account);

        loginBtn.startAnimation(fromBottom);
        createAccount.startAnimation(fromBottom);

        logoImage.startAnimation(fromTop);
        loginTxt.startAnimation(fromTop);
        challengeTxt.startAnimation(fromTop);
        password.startAnimation(fromBottom);
        email.startAnimation(fromBottom);

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignUpAct.class);
                startActivity(intent);
            }
        });

    }
}
