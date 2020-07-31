package com.baust.baustquestionbank.departments.eee;

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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.baust.baustquestionbank.OpenPdf;
import com.baust.baustquestionbank.PdfView;
import com.baust.baustquestionbank.R;

public class EEE_L2_T1_Questions extends AppCompatActivity implements View.OnClickListener {
    LinearLayout eee2105,eee2107,cse2109,math2111,hum2177;
    ImageView eee2105d,eee2107d,cse2109d,math2111d,hum2177d;
    String year = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("Level-2 Term I Questions");
        setContentView(R.layout.activity_e_e_e__l2__t1__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");

        }
    }

    private void findAndOnClickSet() {
        eee2105 = findViewById(R.id.EEE2105id);
        eee2105d = findViewById(R.id.EEE2105download);
        eee2107 = findViewById(R.id.EEE2107id);
        eee2107d = findViewById(R.id.EEE2107download);
        cse2109 = findViewById(R.id.CES2109id);
        cse2109d= findViewById(R.id.CSE2109download);
        math2111 = findViewById(R.id.MATH2111id);
        math2111d = findViewById(R.id.MATH2111download);
        hum2177 = findViewById(R.id.HUM2177id);
        hum2177d = findViewById(R.id.HUM2177download);


        eee2105.setOnClickListener(this);
        eee2105d.setOnClickListener(this);
        eee2107.setOnClickListener(this);
        eee2107d.setOnClickListener(this);
        cse2109.setOnClickListener(this);
        cse2109d.setOnClickListener(this);
        math2111.setOnClickListener(this);
        math2111d.setOnClickListener(this);
        hum2177.setOnClickListener(this);
        hum2177d.setOnClickListener(this);

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

        if (view.getId() == R.id.EEE2105id) {

            String pdfName = "F17eee_EEE2105";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2105download) {

            String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
            String pdfName = "F17eee_EEE2105";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.EEE2107id) {

            String pdfName = "F17eee_EEE2107";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2107download) {


            String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
            String pdfName = "F17eee_EEE2107";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CES2109id) {
            String pdfName = "F17eee_CSE2109";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE2109download) {
            String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
            String pdfName = "F17eee_CSE2109";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111id) {
            String pdfName = "F17eee_MATH2111i";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111download) {

            String link = "";
            String pdfName = "F17eee_MATH2111i";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177id) {
            String pdfName = "F17eee_HUM2177";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177download) {
            String link = "";
            String pdfName = "F17eee_HUM2177";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }



    }

    private void downloadSpring17(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.EEE2105id) {

            String pdfName = "S17eee_EEE2105";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2105download) {

            String link = "";
            String pdfName = "S17eee_EEE2105";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.EEE2107id) {

            String pdfName = "S17eee_EEE2107";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2107download) {


            String link = "";
            String pdfName = "S17eee_EEE2107";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CES2109id) {
            String pdfName = "S17eee_CSE2109";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE2109download) {
            String link = "";
            String pdfName = "S17eee_CSE2109";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111id) {
            String pdfName = "S17eee_MATH2111";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111download) {

            String link = "";
            String pdfName = "S17eee_MATH2109";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177id) {
            String pdfName = "S17eee_HUM2177";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177download) {
            String link = "";
            String pdfName = "S17eee_HUM2177";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }



    }

    private void downloadFall18(View view) {


        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.EEE2105id) {

            String pdfName = "F18eee_EEE2105";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2105download) {

            String link = "";
            String pdfName = "F18eee_EEE2105";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.EEE2107id) {

            String pdfName = "F18eee_EEE2107";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2107download) {


            String link = "";
            String pdfName = "F18eee_EEE2107";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CES2109id) {
            String pdfName = "F18eee_CSE2109";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE2109download) {
            String link = "";
            String pdfName = "F18eee_CSE2109";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111id) {
            String pdfName = "F18eee_MATH2111";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111download) {

            String link = "";
            String pdfName = "F18eee_MATH2111";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177id) {
            String pdfName = "F18eee_HUM2177";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177download) {
            String link = "";
            String pdfName = "F18eee_HUM2177";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    private void downloadSpring18(View view) {
        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.EEE2105id) {

            String pdfName = "S18eee_EEE2105";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2105download) {

            String link = "";
            String pdfName = "S18eee_EEE2105";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.EEE2107id) {

            String pdfName = "S18eee_EEE2107";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2107download) {


            String link = "";
            String pdfName = "S18eee_EEE2107";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CES2109id) {
            String pdfName = "S18eee_CSE2109";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE2109download) {
            String link = "";
            String pdfName = "S18eee_CSE2109";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111id) {
            String pdfName = "S18eee_MATH2111";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111download) {

            String link = "";
            String pdfName = "S18eee_MATH2111";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177id) {
            String pdfName = "S18eee_HUM2177";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177download) {
            String link = "";
            String pdfName = "S18eee_HUM2177";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    private void downloadFall19(View view) {
        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.EEE2105id) {

            String pdfName = "F19eee_EEE2105";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2105download) {

            String link = "";
            String pdfName = "F19eee_EEE2105";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.EEE2107id) {

            String pdfName = "F19eee_EEE2107";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2107download) {


            String link = "";
            String pdfName = "F19eee_EEE2107";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CES2109id) {
            String pdfName = "F19eee_CSE2109";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE2109download) {
            String link = "";
            String pdfName = "F19eee_CSE2109";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111id) {
            String pdfName = "F19eee_MATH2111";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111download) {

            String link = "";
            String pdfName = "F19eee_MATH2109";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177id) {
            String pdfName = "F19eee_HUM2177";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177download) {
            String link = "";
            String pdfName = "F19eee_HUM2177";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void downloadSpring19(View view) {
        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.EEE2105id) {

            String pdfName = "S19eee_EEE2105";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2105download) {

            String link = "";
            String pdfName = "S19eee_EEE2105";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.EEE2107id) {

            String pdfName = "S19eee_EEE2107";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.EEE2107download) {


            String link = "";
            String pdfName = "S19eee_EEE2107";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CES2109id) {
            String pdfName = "S19eee_CSE2109";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE2109download) {
            String link = "";
            String pdfName = "S19eee_CSE2109";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111id) {
            String pdfName = "S19eee_MATH2111";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.MATH2111download) {

            String link = "";
            String pdfName = "S19eee_MATH2111";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177id) {
            String pdfName = "S19eee_HUM2111";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.HUM2177download) {
            String link = "";
            String pdfName = "S19eee_ME2177";
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

