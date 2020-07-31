package com.baust.baustquestionbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Selection;
import android.util.Log;
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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SignUpPage extends AppCompatActivity {
    Button button;
    private FirebaseAuth mAuth;
    private DatabaseReference databaseReference;
    private Dialog dialog=null;

    private TextView textView, username, email, password, stdid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));

        setContentView(R.layout.activity_sign_up_page);

        button = findViewById(R.id.signupid);
        textView = findViewById(R.id.alreadyaccountid);
        username = findViewById(R.id.usernameid);
        username.requestFocus();
        email = findViewById(R.id.emailid);
        password = findViewById(R.id.passwordid);
        stdid = findViewById(R.id.studentid);


        mAuth = FirebaseAuth.getInstance();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(SignUpPage.this, LoginPage.class));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = username.getText().toString();
                String emailaddress = email.getText().toString();
                String userpassword = password.getText().toString();
                String st = stdid.getText().toString();
                if (name.isEmpty()) {
                    username.setError("please enter your name");
                    username.requestFocus();
                    return;
                }
                if (emailaddress.isEmpty()) {
                    email.setError("please enter email address");
                    email.requestFocus();
                    return;
                }
                if (st.isEmpty()) {
                    stdid.setError("please enter student id");
                    stdid.requestFocus();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(emailaddress).matches()) {
                    email.setError("please enter valid email address");
                    email.requestFocus();
                    return;
                }
                if (userpassword.isEmpty() || userpassword.length() < 6) {
                    if (userpassword.isEmpty()) {
                        password.setError("please enter your password");
                        password.requestFocus();
                        return;
                    } else {
                        password.setError("password at last 6 character long");
                        password.requestFocus();
                        return;
                    }
                } else {

                    createAccount(emailaddress, userpassword, name);
                    show();
                }

            }
        });
    }

    public void createAccount(String e, String p, final String n) {
        mAuth.createUserWithEmailAndPassword(e, p).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                Log.e("conformation:","On complete task");

                if (task.isSuccessful()) {
                    Log.e("conformation:","successful on complite");

                    String studentId = stdid.getText().toString();

                    databaseReference = FirebaseDatabase.getInstance().getReference("studentInformation");
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("id", studentId);
                    hashMap.put("username", n);

                    databaseReference.setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            finish();
                            startActivity(new Intent(SignUpPage.this, MainActivity.class));

                            if (dialog!=null)
                            {
                                dialog.cancel();
                            }
                        }
                    });

                } else {

                    Log.e("conformation","unsuccess");
                    Toast.makeText(getApplicationContext(), "login failed", Toast.LENGTH_SHORT).show();

                    if (dialog!=null)
                    {
                        dialog.cancel();
                    }
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
