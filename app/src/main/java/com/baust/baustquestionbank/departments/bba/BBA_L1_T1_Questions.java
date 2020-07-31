package com.baust.baustquestionbank.departments.bba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.baust.baustquestionbank.OpenPdf;
import com.baust.baustquestionbank.PdfView;
import com.baust.baustquestionbank.R;
import com.baust.baustquestionbank.departments.cse.L1_T1_Questions;

public class BBA_L1_T1_Questions extends AppCompatActivity implements View.OnClickListener {

    LinearLayout Bangla;
    ImageView Banglad;
    private String year="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("Level-1 Term I Questions");

        setContentView(R.layout.activity_b_b_a__l1__t1__questions);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }
    }

    private void findAndOnClickSet() {
        Bangla=findViewById(R.id.banglaid);
        Banglad=findViewById(R.id.bangladownload);
        Bangla.setOnClickListener(this);
        Banglad.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (year.equals("Fall -2017")) {
            downloadFall17(view);
        }
        if (year.equals("Spring -2017")) {
            downloadSpring17(view);

        }
        if (year.equals("Fall -2018")) {
            downloadFall18(view);
        }
        if (year.equals("Spring -2018")) {
            downloadSpring18(view);
        }
        if (year.equals("Fall -2019")) {
            downloadFall19(view);
        }
        if (year.equals("Spring -2019")) {

            downloadSpring19(view);
        }
    }

    private void downloadFall17(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId()==R.id.banglaid)
        {
            String pdfName = "BBAF17_bangla";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(BBA_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.bangladownload)
        {

            String link = "";
            String pdfName = "BBAF17_bangla";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }


    }
    private void downloadSpring17(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId()==R.id.banglaid)
        {
            String pdfName = "BBAS17_bangla";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(BBA_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.bangladownload)
        {

            String link = "";
            String pdfName = "F1Scse_ics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

    }
    private void downloadFall18(View view) {


    }
    private void downloadSpring18(View view) {


    }
    private void downloadFall19(View view) {


    }
    private void downloadSpring19(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId()==R.id.banglaid)
        {
            String pdfName = "BBAS19_bangla";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(BBA_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.bangladownload)
        {

            String link = "";
            String pdfName = "BBAS19_bangla";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    //for download a pdf...
    public void download(String url, String pdfName) {

        try {

            if (isNetworkAvailable()) {
                DownloadManager downloadmanager;
                Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        .mkdirs();
                downloadmanager = (DownloadManager) getApplication().getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse(url);
                DownloadManager.Request request = new DownloadManager.Request(uri)
                        .setTitle("Downloading")
                        .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,
                                pdfName + ".pdf")
                        .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                downloadmanager.enqueue(request);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"No internet connection!",Toast.LENGTH_LONG).show();
            }
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Can't download this pdf!",Toast.LENGTH_SHORT).show();
        }
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

