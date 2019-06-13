package com.example.lastfirebase;


import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static android.app.ProgressDialog.show;


public class MainActivity<julia> extends AppCompatActivity {
EditText emaill,passwordd;
Button loginn,registerr;
String email,password;
private FirebaseAuth mAuth;
    private int text;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth=FirebaseAuth.getInstance();
        emaill=findViewById(R.id.emaill);
    passwordd=findViewById(R.id.passwordd);
        loginn=findViewById(R.id.loginn);
        registerr=findViewById(R.id.registerr);
        loginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               login();
            }
        });
        registerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
        public void validation(julia){
            email=emaill.getText().toString();
            password=passwordd.getText().toString();
            if (TextUtils.isEmpty(email));
            Toast.makeText(getApplicationContext(), text: "please try again later" ,Toast.LENGTH_LONG).show();
            return;

        }
        if (TextUtils.isEmpty(password));
        Toast.makeText(getApplicationContext(), text: "please try again later" ,Toast.LENGTH_LONG).show();
        return;
        }
        public void login(){
    login();
    mAuth.signInWithEmailAndPassword(email ,password)
            .addOnCompleteListener(activity:this ,new OnCompleteListener<AuthResult>() {


                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                }

                @Override
                public <julia> void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Intent in = new Intent((getApplicationContext( ),julia.class);
                    }
                    else
                    {Toast.makeText(getApplicationContext() ,text:"failed",
                        Toast.LENGTH_LONG).show();
                }
            }
        };
        }
        private void register(){
            validation();
            mAuth.signInWithEmailAndPassword(email ,password)
                    .addOnCompleteListener(activity:this ,new OnCompleteListener<AuthResult>(){


                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Intent in =new Intent((getApplicationContext( ),julia.class);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext() ,text: "failed",
                            Toast.LENGTH_LONG).show();
                    }
                }
            });


}

    private void validation() {
    }
}
