package com.baust.baustquestionbank;

import android.net.Uri;
import android.os.Environment;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class OpenPdf {


    public Uri open(String pdfName) {

        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + File.separator +
                pdfName+".pdf");
        Uri path = Uri.fromFile(file);
        return path;
    }

    public boolean notDownload(String pdfName)
    {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + File.separator +
                pdfName+".pdf");

        if (file.exists())
        {
            return false;
        }
        return true;
    }

    public boolean isDownload(String pdfName)
    {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + File.separator +
                pdfName+".pdf");

        if (file.exists())
        {
            return true;
        }
        return false;
    }


}
