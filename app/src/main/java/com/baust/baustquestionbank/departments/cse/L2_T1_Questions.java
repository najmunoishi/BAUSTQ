package com.baust.baustquestionbank.departments.cse;

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

public class L2_T1_Questions extends AppCompatActivity implements View.OnClickListener {
String year="";
private LinearLayout DLD,DS,OOP,EDI,Mathiii;
private ImageView DLDd,DSd,OOPd,EDId,Mathiiid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("Level-2 Term I Questions");
        setContentView(R.layout.activity_l2__t1__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }
    }

    private void findAndOnClickSet()
    {
        DLD=findViewById(R.id.dldid);
        DS=findViewById(R.id.dsid);
        OOP=findViewById(R.id.oopid);
        EDI=findViewById(R.id.ediid);
        Mathiii=findViewById(R.id.mathiiiid);
        DLDd=findViewById(R.id.dlddownlaod);
        DSd=findViewById(R.id.dsdownload);
        OOPd=findViewById(R.id.oopdownload);
        EDId=findViewById(R.id.edidownload);
        Mathiiid=findViewById(R.id.mathiiidownload);

        DLD.setOnClickListener(this);
        DS.setOnClickListener(this);
        OOP.setOnClickListener(this);
        EDI.setOnClickListener(this);
        Mathiii.setOnClickListener(this);
        DLDd.setOnClickListener(this);
        DSd.setOnClickListener(this);
        OOPd.setOnClickListener(this);
        EDId.setOnClickListener(this);
        Mathiiid.setOnClickListener(this);
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

        if (view.getId()==R.id.dldid)
        {
            String pdfName = "F17cse_dld";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dlddownlaod)
        {
            String link = "";
            String pdfName = "F17cse_dld";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.dsid)
        {
            String pdfName = "F17cse_ds";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dsdownload)
        {
            String link = "";
            String pdfName = "F17cse_ds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oopid)
        {
            String pdfName = "F17cse_oopi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.oopdownload)
        {
            String link = "";
            String pdfName = "F17cse_oopi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.mathiiiid)
        {
            String pdfName = "F17cse_mathiii";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.mathiidownload)
        {
            String link = "";
            String pdfName = "F17cse_mathiii";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.ediid)
        {
            String pdfName = "F17cse_edi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.edidownload)
        {
            String link = "";
            String pdfName = "F17cse_edi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
    }



    private void downloadSpring17(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId()==R.id.dldid)
        {
            String pdfName = "S17cse_dld";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dlddownlaod)
        {
            String link = "";
            String pdfName = "S17cse_dld";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.dsid)
        {
            String pdfName = "S17cse_ds";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dsdownload)
        {
            String link = "";
            String pdfName = "S17cse_ds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oopid)
        {
            String pdfName = "S17cse_oopi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.oopdownload)
        {
            String link = "";
            String pdfName = "S17cse_oopi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.mathiiiid)
        {
            String pdfName = "S17cse_mathiii";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.mathiidownload)
        {
            String link = "";
            String pdfName = "S17cse_mathiii";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.ediid)
        {
            String pdfName = "S17cse_edi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.edidownload)
        {
            String link = "";
            String pdfName = "S17cse_edi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
    }



    private void downloadFall18(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId()==R.id.dldid)
        {
            String pdfName = "F18cse_dld";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dlddownlaod)
        {
            String link = "";
            String pdfName = "F18cse_dld";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.dsid)
        {
            String pdfName = "F18cse_ds";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dsdownload)
        {
            String link = "";
            String pdfName = "F18cse_ds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oopid)
        {
            String pdfName = "F18cse_oopi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.oopdownload)
        {
            String link = "";
            String pdfName = "F18cse_oopi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.mathiiiid)
        {
            String pdfName = "F18cse_mathiii";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.mathiidownload)
        {
            String link = "";
            String pdfName = "F18cse_mathiii";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.ediid)
        {
            String pdfName = "F18cse_edi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.edidownload)
        {
            String link = "";
            String pdfName = "F18cse_edi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
    }



    private void downloadSpring18(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId()==R.id.dldid)
        {
            String pdfName = "S18cse_dld";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dlddownlaod)
        {
            String link = "";
            String pdfName = "S18cse_dld";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.dsid)
        {
            String pdfName = "S18cse_ds";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dsdownload)
        {
            String link = "";
            String pdfName = "S18cse_ds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oopid)
        {
            String pdfName = "S18cse_oopi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.oopdownload)
        {
            String link = "";
            String pdfName = "S18cse_oopi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.mathiiiid)
        {
            String pdfName = "S18cse_mathiii";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.mathiidownload)
        {
            String link = "";
            String pdfName = "S18cse_mathiii";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.ediid)
        {
            String pdfName = "S18cse_edi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.edidownload)
        {
            String link = "";
            String pdfName = "S18cse_edi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

    }



    private void downloadFall19(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId()==R.id.dldid)
        {
            String pdfName = "F19cse_dld";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dlddownlaod)
        {
            String link = "";
            String pdfName = "F19cse_dld";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.dsid)
        {
            String pdfName = "F19cse_ds";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dsdownload)
        {
            String link = "";
            String pdfName = "F19cse_ds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oopid)
        {
            String pdfName = "F19cse_oopi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.oopdownload)
        {
            String link = "";
            String pdfName = "F19cse_oopi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.mathiiiid)
        {
            String pdfName = "F19cse_mathiii";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.mathiidownload)
        {
            String link = "";
            String pdfName = "F19cse_mathiii";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.ediid)
        {
            String pdfName = "F19cse_edi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.edidownload)
        {
            String link = "";
            String pdfName = "F19cse_edi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
    }



    private void downloadSpring19(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId()==R.id.dldid)
        {
            String pdfName = "S19cse_dld";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dlddownlaod)
        {
            String link = "";
            String pdfName = "S19cse_dld";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.dsid)
        {
            String pdfName = "S19cse_ds";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.dsdownload)
        {
            String link = "";
            String pdfName = "S19cse_ds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oopid)
        {
            String pdfName = "S19cse_oopi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.oopdownload)
        {
            String link = "";
            String pdfName = "S19cse_oopi";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.mathiiiid)
        {
            String pdfName = "S19cse_mathiii";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.mathiidownload)
        {
            String link = "";
            String pdfName = "S19cse_mathiii";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.ediid)
        {
            String pdfName = "S19cse_edi";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.edidownload)
        {
            String link = "";
            String pdfName = "S19cse_edi";
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
