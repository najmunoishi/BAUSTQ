package com.baust.baustquestionbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginPage extends AppCompatActivity {

    Button button;
    TextView textView, email, password;
    private FirebaseAuth mAuth;
    private Dialog dialog=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));

        setContentView(R.layout.activity_login_page);


        button = findViewById(R.id.loginbuttonid);
        textView = findViewById(R.id.dontaccountid);

        mAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.loginemailid);
        password = findViewById(R.id.loginpasswordid);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(LoginPage.this, SignUpPage.class));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailaddress = email.getText().toString();
                String userpassword = password.getText().toString();

                if (emailaddress.isEmpty()) {
                    email.setError("please enter your email");
                    email.requestFocus();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(emailaddress).matches()) {
                    email.setError("enter valid email address");
                    email.requestFocus();
                    return;
                }
                if (userpassword.isEmpty()) {
                    password.setError("please enter your password");
                    password.requestFocus();
                    return;
                } else {

                    show();
                    mAuth.signInWithEmailAndPassword(emailaddress, userpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {
                                finish();
                                startActivity(new Intent(LoginPage.this, MainActivity.class));

                            } else {
                                finish();
                                Toast.makeText(getApplicationContext(), "wrong email or password", Toast.LENGTH_SHORT).show();
                            }
                            if (dialog!=null)
                            {
                                dialog.cancel();
                            }
                        }
                    });

                }

            }
        });
    }

    public void show() {
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.loadinglayout);
        dialog.setCancelable(false);
        dialog.show();
    }
}
