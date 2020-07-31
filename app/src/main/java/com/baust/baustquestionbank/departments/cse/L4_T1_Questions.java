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

public class L4_T1_Questions extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout AL, SEI, IM, AA, BGT, FTS, BMT, DNS, OOSE, ANNFS, DA, Bioinformatics, Robotics, ML, ASQT, CG, DSD, PIES, MCA, WA, PPDS;
    private ImageView ALd, SEId, IMd, AAd, BGTd, FTSd, BMTd, DNSd, OOSEd, ANNFSd, DAd, Bioinformaticsd, Roboticsd, MLd, ASQTd, CGd, DSDd, PIESd, MCAd, WAd, PPDSd;
    private String year = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("Level-4 Term I Questions");
        setContentView(R.layout.activity_l4__t1__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }
    }

    private void findAndOnClickSet() {
        AL = findViewById(R.id.alid);
        SEI = findViewById(R.id.seisid);
        IM = findViewById(R.id.imid);
        AA = findViewById(R.id.aaid);
        BGT = findViewById(R.id.bgtid);
        FTS = findViewById(R.id.ftsid);
        BMT = findViewById(R.id.bmtid);
        DNS = findViewById(R.id.dnsid);
        OOSE = findViewById(R.id.ooseid);
        ANNFS = findViewById(R.id.annfsid);
        DA = findViewById(R.id.daid);
        Bioinformatics = findViewById(R.id.bioinformaticsid);
        Robotics = findViewById(R.id.roboticsid);
        ML = findViewById(R.id.mlid);
        ASQT = findViewById(R.id.asqtid);
        CG = findViewById(R.id.cgid);
        DSD = findViewById(R.id.dsdid);
        PIES = findViewById(R.id.piesid);
        MCA = findViewById(R.id.mcaid);
        WA = findViewById(R.id.waid);
        PPDS = findViewById(R.id.ppdsid);

        AL.setOnClickListener(this);
        SEI.setOnClickListener(this);
        IM.setOnClickListener(this);
        AA.setOnClickListener(this);
        BGT.setOnClickListener(this);
        FTS.setOnClickListener(this);
        BMT.setOnClickListener(this);
        DNS.setOnClickListener(this);
        OOSE.setOnClickListener(this);
        ANNFS.setOnClickListener(this);
        DA.setOnClickListener(this);
        Bioinformatics.setOnClickListener(this);
        Robotics.setOnClickListener(this);
        ML.setOnClickListener(this);
        ASQT.setOnClickListener(this);
        CG.setOnClickListener(this);
        DSD.setOnClickListener(this);
        PIES.setOnClickListener(this);
        MCA.setOnClickListener(this);
        WA.setOnClickListener(this);
        PPDS.setOnClickListener(this);


        ALd = findViewById(R.id.aldownload);
        SEId = findViewById(R.id.seisdownload);
        IMd = findViewById(R.id.imdownload);
        AAd = findViewById(R.id.aadownload);
        BGTd = findViewById(R.id.bgtdownload);
        FTSd = findViewById(R.id.ftsdownload);
        BMTd = findViewById(R.id.bmtdownload);
        DNSd = findViewById(R.id.dnsdownload);
        OOSEd = findViewById(R.id.oosedownload);
        ANNFSd = findViewById(R.id.annfsdownload);
        DAd = findViewById(R.id.dadownload);
        Bioinformaticsd = findViewById(R.id.bioinformaticsdownload);
        Roboticsd = findViewById(R.id.roboticsdownload);
        MLd = findViewById(R.id.mldownload);
        ASQTd = findViewById(R.id.asqtdownload);
        CGd = findViewById(R.id.cgdownload);
        DSDd = findViewById(R.id.dsddownload);
        PIESd = findViewById(R.id.piesdownload);
        MCAd = findViewById(R.id.mcadownload);
        WAd = findViewById(R.id.wadownload);
        PPDSd = findViewById(R.id.ppdsdownload);

        ALd.setOnClickListener(this);
        SEId.setOnClickListener(this);
        IMd.setOnClickListener(this);
        AAd.setOnClickListener(this);
        BGTd.setOnClickListener(this);
        FTSd.setOnClickListener(this);
        BMTd.setOnClickListener(this);
        DNSd.setOnClickListener(this);
        OOSEd.setOnClickListener(this);
        ANNFSd.setOnClickListener(this);
        DAd.setOnClickListener(this);
        Bioinformaticsd.setOnClickListener(this);
        Roboticsd.setOnClickListener(this);
        MLd.setOnClickListener(this);
        ASQTd.setOnClickListener(this);
        CGd.setOnClickListener(this);
        DSDd.setOnClickListener(this);
        PIESd.setOnClickListener(this);
        MCAd.setOnClickListener(this);
        WAd.setOnClickListener(this);
        PPDSd.setOnClickListener(this);

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

        if (view.getId() == R.id.alid) {

            String pdfName = "F17cse_al";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aldownload) {
            String link = "";
            String pdfName = "F17cse_al";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.seisid) {
            String pdfName = "F17cse_seis";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.seisdownload) {
            String link = "";
            String pdfName = "F17cse_seis";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.imid) {
            String pdfName = "F17cse_im";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.imdownload) {
            String link = "";
            String pdfName = "F17cse_im";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.aaid) {
            String pdfName = "F17cse_aa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aadownload) {
            String link = "";
            String pdfName = "F17cse_aa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtid) {
            String pdfName = "F17cse_bgt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtdownload) {
            String link = "";
            String pdfName = "F17cse_bgt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ftsid) {
            String pdfName = "F17cse_fts";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ftsdownload) {
            String link = "";
            String pdfName = "F17cse_fts";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.bmtid) {
            String pdfName = "F17cse_bmt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bmtdownload) {
            String link = "";
            String pdfName = "F17cse_bmt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsid) {
            String pdfName = "F17cse_dns";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsdownload) {
            String link = "";
            String pdfName = "F17cse_dns";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ooseid) {
            String pdfName = "F17cse_oose";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oosedownload)
        {    String link = "";
            String pdfName = "F17cse_oose";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }

        }
        if (view.getId() == R.id.annfsid) {
            String pdfName = "F17cse_annfs";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.annfsdownload) {
            String link = "";
            String pdfName = "F17cse_annfs";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.daid) {
            String pdfName = "F17cse_da";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dadownload) {
            String link = "";
            String pdfName = "F17cse_da";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsid) {
            String pdfName = "F17cse_bioinformatics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsdownload) {
            String link = "";
            String pdfName = "F17cse_bioinformatics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsid) {
            String pdfName = "F17cse_robotics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsdownload) {
            String link = "";
            String pdfName = "F17cse_robotics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mlid) {
            String pdfName = "F17cse_ml";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mldownload) {
            String link = "";
            String pdfName = "F17cse_ml";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtid) {
            String pdfName = "F17cse_asqt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtdownload) {
            String link = "";
            String pdfName = "F17cse_asqt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgid) {
            String pdfName = "F17cse_cg";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgdownload) {
            String link = "";
            String pdfName = "F17cse_cg";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsdid) {
            String pdfName = "F17cse_dsd";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsddownload) {
            String link = "";
            String pdfName = "F17cse_dsd";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesid) {
            String pdfName = "F17cse_pies";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesdownload) {
            String link = "";
            String pdfName = "F17cse_pies";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcaid) {
            String pdfName = "F17cse_mca";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcadownload) {
            String link = "";
            String pdfName = "F17cse_mca";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.waid) {
            String pdfName = "F17cse_wa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.wadownload) {
            String link = "";
            String pdfName = "F17cse_wa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsid) {
            String pdfName = "F17cse_ppds";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsdownload) {
            String link = "";
            String pdfName = "F17cse_ppds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }


    }

///....................................
    private void downloadSpring17(View view) {


        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.alid) {

            String pdfName = "S17cse_al";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aldownload) {
            String link = "";
            String pdfName = "S17cse_al";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.seisid) {
            String pdfName = "S17cse_seis";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.seisdownload) {
            String link = "";
            String pdfName = "S17cse_seis";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.imid) {
            String pdfName = "S17cse_im";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.imdownload) {
            String link = "";
            String pdfName = "S17cse_im";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.aaid) {
            String pdfName = "S17cse_aa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aadownload) {
            String link = "";
            String pdfName = "S17cse_aa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtid) {
            String pdfName = "S17cse_bgt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtdownload) {
            String link = "";
            String pdfName = "S17cse_bgt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ftsid) {
            String pdfName = "S17cse_fts";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ftsdownload) {
            String link = "";
            String pdfName = "S17cse_fts";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.bmtid) {
            String pdfName = "S17cse_bmt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bmtdownload) {
            String link = "";
            String pdfName = "S17cse_bmt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsid) {
            String pdfName = "S17cse_dns";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsdownload) {
            String link = "";
            String pdfName = "S17cse_dns";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ooseid) {
            String pdfName = "S17cse_oose";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oosedownload)
        {    String link = "";
            String pdfName = "S17cse_oose";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }

        }
        if (view.getId() == R.id.annfsid) {
            String pdfName = "S17cse_annfs";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.annfsdownload) {
            String link = "";
            String pdfName = "S17cse_annfs";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.daid) {
            String pdfName = "S17cse_da";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dadownload) {
            String link = "";
            String pdfName = "S17cse_da";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsid) {
            String pdfName = "S17cse_bioinformatics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsdownload) {
            String link = "";
            String pdfName = "S17cse_bioinformatics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsid) {
            String pdfName = "S17cse_robotics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsdownload) {
            String link = "";
            String pdfName = "S17cse_robotics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mlid) {
            String pdfName = "S17cse_ml";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mldownload) {
            String link = "";
            String pdfName = "S17cse_ml";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtid) {
            String pdfName = "S17cse_asqt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtdownload) {
            String link = "";
            String pdfName = "S17cse_asqt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgid) {
            String pdfName = "S17cse_cg";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgdownload) {
            String link = "";
            String pdfName = "S17cse_cg";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsdid) {
            String pdfName = "S17cse_dsd";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsddownload) {
            String link = "";
            String pdfName = "S17cse_dsd";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesid) {
            String pdfName = "S17cse_pies";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesdownload) {
            String link = "";
            String pdfName = "S17cse_pies";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcaid) {
            String pdfName = "S17cse_mca";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcadownload) {
            String link = "";
            String pdfName = "S17cse_mca";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.waid) {
            String pdfName = "S17cse_wa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.wadownload) {
            String link = "";
            String pdfName = "S17cse_wa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsid) {
            String pdfName = "S17cse_ppds";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsdownload) {
            String link = "";
            String pdfName = "S17cse_ppds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

    }

//.....................................
    private void downloadFall18(View view) {


        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.alid) {

            String pdfName = "F18cse_al";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aldownload) {
            String link = "";
            String pdfName = "F18cse_al";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.seisid) {
            String pdfName = "F18cse_seis";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.seisdownload) {
            String link = "";
            String pdfName = "F18cse_seis";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.imid) {
            String pdfName = "F18cse_im";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.imdownload) {
            String link = "";
            String pdfName = "F18cse_im";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.aaid) {
            String pdfName = "F18cse_aa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aadownload) {
            String link = "";
            String pdfName = "F18cse_aa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtid) {
            String pdfName = "F18cse_bgt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtdownload) {
            String link = "";
            String pdfName = "F18cse_bgt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ftsid) {
            String pdfName = "F18cse_fts";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ftsdownload) {
            String link = "";
            String pdfName = "F18cse_fts";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.bmtid) {
            String pdfName = "F18cse_bmt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bmtdownload) {
            String link = "";
            String pdfName = "F18cse_bmt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsid) {
            String pdfName = "F18cse_dns";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsdownload) {
            String link = "";
            String pdfName = "F18cse_dns";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ooseid) {
            String pdfName = "F18cse_oose";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oosedownload)
        {    String link = "";
            String pdfName = "F18cse_oose";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }

        }
        if (view.getId() == R.id.annfsid) {
            String pdfName = "F18cse_annfs";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.annfsdownload) {
            String link = "";
            String pdfName = "F18cse_annfs";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.daid) {
            String pdfName = "F18cse_da";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dadownload) {
            String link = "";
            String pdfName = "F18cse_da";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsid) {
            String pdfName = "F18cse_bioinformatics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsdownload) {
            String link = "";
            String pdfName = "F18cse_bioinformatics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsid) {
            String pdfName = "F18cse_robotics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsdownload) {
            String link = "";
            String pdfName = "F18cse_robotics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mlid) {
            String pdfName = "F18cse_ml";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mldownload) {
            String link = "";
            String pdfName = "F18cse_ml";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtid) {
            String pdfName = "F18cse_asqt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtdownload) {
            String link = "";
            String pdfName = "F18cse_asqt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgid) {
            String pdfName = "F18cse_cg";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgdownload) {
            String link = "";
            String pdfName = "F18cse_cg";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsdid) {
            String pdfName = "F18cse_dsd";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsddownload) {
            String link = "";
            String pdfName = "F18cse_dsd";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesid) {
            String pdfName = "F18cse_pies";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesdownload) {
            String link = "";
            String pdfName = "F18cse_pies";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcaid) {
            String pdfName = "F18cse_mca";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcadownload) {
            String link = "";
            String pdfName = "F18cse_mca";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.waid) {
            String pdfName = "F18cse_wa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.wadownload) {
            String link = "";
            String pdfName = "F18cse_wa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsid) {
            String pdfName = "F18cse_ppds";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsdownload) {
            String link = "";
            String pdfName = "F18cse_ppds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
    }

//..................................
    private void downloadSpring18(View view) {


        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.alid) {

            String pdfName = "S18cse_al";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aldownload) {
            String link = "";
            String pdfName = "S18cse_al";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.seisid) {
            String pdfName = "S18cse_seis";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.seisdownload) {
            String link = "";
            String pdfName = "S18cse_seis";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.imid) {
            String pdfName = "S18cse_im";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.imdownload) {
            String link = "";
            String pdfName = "S18cse_im";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.aaid) {
            String pdfName = "S18cse_aa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aadownload) {
            String link = "";
            String pdfName = "S18cse_aa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtid) {
            String pdfName = "S18cse_bgt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtdownload) {
            String link = "";
            String pdfName = "S18cse_bgt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ftsid) {
            String pdfName = "S18cse_fts";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ftsdownload) {
            String link = "";
            String pdfName = "S18cse_fts";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.bmtid) {
            String pdfName = "S18cse_bmt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bmtdownload) {
            String link = "";
            String pdfName = "S18cse_bmt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsid) {
            String pdfName = "S18cse_dns";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsdownload) {
            String link = "";
            String pdfName = "S18cse_dns";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ooseid) {
            String pdfName = "S18cse_oose";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oosedownload)
        {    String link = "";
            String pdfName = "S18cse_oose";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }

        }
        if (view.getId() == R.id.annfsid) {
            String pdfName = "S18cse_annfs";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.annfsdownload) {
            String link = "";
            String pdfName = "S18cse_annfs";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.daid) {
            String pdfName = "S18cse_da";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dadownload) {
            String link = "";
            String pdfName = "S18cse_da";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsid) {
            String pdfName = "S18cse_bioinformatics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsdownload) {
            String link = "";
            String pdfName = "S18cse_bioinformatics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsid) {
            String pdfName = "S18cse_robotics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsdownload) {
            String link = "";
            String pdfName = "S18cse_robotics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mlid) {
            String pdfName = "S18cse_ml";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mldownload) {
            String link = "";
            String pdfName = "S18cse_ml";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtid) {
            String pdfName = "S18cse_asqt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtdownload) {
            String link = "";
            String pdfName = "S18cse_asqt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgid) {
            String pdfName = "S18cse_cg";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgdownload) {
            String link = "";
            String pdfName = "S18cse_cg";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsdid) {
            String pdfName = "S18cse_dsd";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsddownload) {
            String link = "";
            String pdfName = "S18cse_dsd";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesid) {
            String pdfName = "S18cse_pies";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesdownload) {
            String link = "";
            String pdfName = "S18cse_pies";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcaid) {
            String pdfName = "S18cse_mca";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcadownload) {
            String link = "";
            String pdfName = "S18cse_mca";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.waid) {
            String pdfName = "S18cse_wa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.wadownload) {
            String link = "";
            String pdfName = "S18cse_wa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsid) {
            String pdfName = "S18cse_ppds";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsdownload) {
            String link = "";
            String pdfName = "S18cse_ppds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
    }

//...............................
    private void downloadFall19(View view) {


        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.alid) {

            String pdfName = "F19cse_al";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aldownload) {
            String link = "";
            String pdfName = "F19cse_al";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.seisid) {
            String pdfName = "F19cse_seis";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.seisdownload) {
            String link = "";
            String pdfName = "F19cse_seis";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.imid) {
            String pdfName = "F19cse_im";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.imdownload) {
            String link = "";
            String pdfName = "F19cse_im";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.aaid) {
            String pdfName = "F19cse_aa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aadownload) {
            String link = "";
            String pdfName = "F19cse_aa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtid) {
            String pdfName = "F19cse_bgt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtdownload) {
            String link = "";
            String pdfName = "F19cse_bgt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ftsid) {
            String pdfName = "F19cse_fts";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ftsdownload) {
            String link = "";
            String pdfName = "F19cse_fts";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.bmtid) {
            String pdfName = "F19cse_bmt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bmtdownload) {
            String link = "";
            String pdfName = "F19cse_bmt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsid) {
            String pdfName = "F19cse_dns";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsdownload) {
            String link = "";
            String pdfName = "F19cse_dns";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ooseid) {
            String pdfName = "F19cse_oose";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oosedownload)
        {    String link = "";
            String pdfName = "F19cse_oose";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }

        }
        if (view.getId() == R.id.annfsid) {
            String pdfName = "F19cse_annfs";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.annfsdownload) {
            String link = "";
            String pdfName = "F19cse_annfs";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.daid) {
            String pdfName = "F19cse_da";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dadownload) {
            String link = "";
            String pdfName = "F19cse_da";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsid) {
            String pdfName = "F19cse_bioinformatics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsdownload) {
            String link = "";
            String pdfName = "F19cse_bioinformatics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsid) {
            String pdfName = "F19cse_robotics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsdownload) {
            String link = "";
            String pdfName = "F19cse_robotics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mlid) {
            String pdfName = "F19cse_ml";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mldownload) {
            String link = "";
            String pdfName = "F19cse_ml";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtid) {
            String pdfName = "F19cse_asqt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtdownload) {
            String link = "";
            String pdfName = "F19cse_asqt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgid) {
            String pdfName = "F19cse_cg";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgdownload) {
            String link = "";
            String pdfName = "F19cse_cg";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsdid) {
            String pdfName = "F19cse_dsd";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsddownload) {
            String link = "";
            String pdfName = "F19cse_dsd";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesid) {
            String pdfName = "F19cse_pies";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesdownload) {
            String link = "";
            String pdfName = "F19cse_pies";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcaid) {
            String pdfName = "F19cse_mca";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcadownload) {
            String link = "";
            String pdfName = "F19cse_mca";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.waid) {
            String pdfName = "F19cse_wa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.wadownload) {
            String link = "";
            String pdfName = "F19cse_wa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsid) {
            String pdfName = "F19cse_ppds";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsdownload) {
            String link = "";
            String pdfName = "F19cse_ppds";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
    }

//.........................................
    private void downloadSpring19(View view) {


        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.alid) {

            String pdfName = "S19cse_al";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aldownload) {
            String link = "";
            String pdfName = "S19cse_al";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.seisid) {
            String pdfName = "S19cse_seis";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.seisdownload) {
            String link = "";
            String pdfName = "S19cse_seis";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.imid) {
            String pdfName = "S19cse_im";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.imdownload) {
            String link = "";
            String pdfName = "S19cse_im";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.aaid) {
            String pdfName = "S19cse_aa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.aadownload) {
            String link = "";
            String pdfName = "S19cse_aa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtid) {
            String pdfName = "S19cse_bgt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bgtdownload) {
            String link = "";
            String pdfName = "S19cse_bgt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ftsid) {
            String pdfName = "S19cse_fts";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ftsdownload) {
            String link = "";
            String pdfName = "S19cse_fts";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.bmtid) {
            String pdfName = "S19cse_bmt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bmtdownload) {
            String link = "";
            String pdfName = "S19cse_bmt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsid) {
            String pdfName = "S19cse_dns";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dnsdownload) {
            String link = "";
            String pdfName = "S19cse_dns";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ooseid) {
            String pdfName = "S19cse_oose";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId()==R.id.oosedownload)
        {    String link = "";
            String pdfName = "S19cse_oose";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }

        }
        if (view.getId() == R.id.annfsid) {
            String pdfName = "S19cse_annfs";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.annfsdownload) {
            String link = "";
            String pdfName = "S19cse_annfs";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.daid) {
            String pdfName = "S19cse_da";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dadownload) {
            String link = "";
            String pdfName = "S19cse_da";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsid) {
            String pdfName = "S19cse_bioinformatics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.bioinformaticsdownload) {
            String link = "";
            String pdfName = "S19cse_bioinformatics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsid) {
            String pdfName = "S19cse_robotics";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.roboticsdownload) {
            String link = "";
            String pdfName = "S19cse_robotics";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mlid) {
            String pdfName = "S19cse_ml";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mldownload) {
            String link = "";
            String pdfName = "S19cse_ml";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtid) {
            String pdfName = "S19cse_asqt";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.asqtdownload) {
            String link = "";
            String pdfName = "S19cse_asqt";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgid) {
            String pdfName = "S19cse_cg";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.cgdownload) {
            String link = "";
            String pdfName = "S19cse_cg";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsdid) {
            String pdfName = "S19cse_dsd";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.dsddownload) {
            String link = "";
            String pdfName = "S19cse_dsd";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesid) {
            String pdfName = "S19cse_pies";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.piesdownload) {
            String link = "";
            String pdfName = "S19cse_pies";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcaid) {
            String pdfName = "S19cse_mca";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.mcadownload) {
            String link = "";
            String pdfName = "S19cse_mca";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.waid) {
            String pdfName = "S19cse_wa";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.wadownload) {
            String link = "";
            String pdfName = "S19cse_wa";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsid) {
            String pdfName = "S19cse_ppds";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ppdsdownload) {
            String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
            String pdfName = "S19cse_ppds";
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
            } else {
                Toast.makeText(getApplicationContext(), "No internet connection!", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Can't download this pdf!", Toast.LENGTH_SHORT).show();
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
