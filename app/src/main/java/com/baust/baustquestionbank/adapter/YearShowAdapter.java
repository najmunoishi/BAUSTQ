package com.baust.baustquestionbank.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.baust.baustquestionbank.R;

public class YearShowAdapter extends BaseAdapter {

    Context context;
    String[] bookName;
    LayoutInflater inflater;

    public YearShowAdapter(Context context, String[] bookName) {
        this.context = context;
        this.bookName = bookName;
    }

    @Override
    public int getCount() {
        return bookName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        try {

            if (convertView == null) {
                inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.levelterm_view, parent, false);
            }
            TextView textView = convertView.findViewById(R.id.yearnameid);

            textView.setText(bookName[position]);

        }
        catch (Exception e)
        {

        }
        return convertView;
    }
}
