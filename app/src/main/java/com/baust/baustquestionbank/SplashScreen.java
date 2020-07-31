package com.baust.baustquestionbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashScreen extends AppCompatActivity {
    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.commonColor));

        setContentView(R.layout.activity_splash_screen);
        currentUser= FirebaseAuth.getInstance().getCurrentUser();

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

                work();

                if(currentUser!=null)
                {
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }
                else {
                    startActivity(new Intent(SplashScreen.this,LoginPage.class));
                    finish();
                }

            }

        });

        thread.start();

    }

    void work()
    {
        for(int p=10; p<=100; p+=10)
        {
            try{
                Thread.sleep(120);
            }
            catch (InterruptedException e)
            {
                Toast.makeText(getApplicationContext(),"Not fit on your device",Toast.LENGTH_LONG).show();
            }
        }
    }
}
