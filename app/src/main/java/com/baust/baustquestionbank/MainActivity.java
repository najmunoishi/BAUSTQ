package com.baust.baustquestionbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaSync;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.baust.baustquestionbank.departments.BBA;
import com.baust.baustquestionbank.departments.CIVIL;
import com.baust.baustquestionbank.departments.CSE;
import com.baust.baustquestionbank.departments.EEE;
import com.baust.baustquestionbank.departments.ENGLISH;
import com.baust.baustquestionbank.departments.IPE;
import com.baust.baustquestionbank.departments.ME;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cse,eee,me,ipe,civil,bba,english,mba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));

        setContentView(R.layout.activity_main);
        cse=findViewById(R.id.cseid);
        eee=findViewById(R.id.eeeid);
        me=findViewById(R.id.meid);
        ipe=findViewById(R.id.ipeid);
        civil=findViewById(R.id.civilid);
        bba=findViewById(R.id.bbaid);
        english=findViewById(R.id.englishid);
        mba=findViewById(R.id.mbaid);

        cse.setOnClickListener(this);
        eee.setOnClickListener(this);
        me.setOnClickListener(this);
        ipe.setOnClickListener(this);
        civil.setOnClickListener(this);
        bba.setOnClickListener(this);
        english.setOnClickListener(this);
        mba.setOnClickListener(this);
        haveStoragePermission();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        if (item.getItemId()==R.id.signoutid)
        {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(MainActivity.this,SplashScreen.class));
            finish();
            Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.cseid)
        {
            startActivity(new Intent(MainActivity.this, CSE.class));
        }
        if (view.getId()==R.id.eeeid)
        {
            startActivity(new Intent(MainActivity.this, EEE.class));
        }

        if (view.getId()==R.id.bbaid)
        {
            startActivity(new Intent(MainActivity.this, BBA.class));
        }
        if (view.getId()==R.id.civilid)
        {
            startActivity(new Intent(MainActivity.this, CIVIL.class));
        }
        if (view.getId()==R.id.englishid)
        {
            startActivity(new Intent(MainActivity.this, ENGLISH.class));
        }
        if (view.getId()==R.id.ipeid)
        {
            startActivity(new Intent(MainActivity.this, IPE.class));
        }  if (view.getId()==R.id.meid)
        {
            startActivity(new Intent(MainActivity.this, ME.class));
        }
        if (view.getId()==R.id.mbaid)
        {
            Toast.makeText(getApplicationContext(),"coming soon",Toast.LENGTH_SHORT).show();
           // startActivity(new Intent(MainActivity.this, EEE.class));
        }


    }

    //storage permission dialog
    public boolean haveStoragePermission() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                return true;
            } else {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        } else {
            return true;
        }
    }
}
