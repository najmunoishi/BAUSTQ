package com.baust.baustquestionbank.departments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import com.baust.baustquestionbank.R;
import com.baust.baustquestionbank.adapter.LevelTermAdapter;

public class CIVIL extends AppCompatActivity {

    ListView listView;
    String[] name;
    int[] flags = {R.drawable.baustlogo, R.drawable.baustlogo,
            R.drawable.baustlogo, R.drawable.baustlogo,
            R.drawable.baustlogo, R.drawable.baustlogo,
            R.drawable.baustlogo, R.drawable.baustlogo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("DEPARTMENT OF CIVIL");
        setContentView(R.layout.activity_c_i_v_i_l);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        name = getResources().getStringArray(R.array.lvelterm);

        listView = findViewById(R.id.g_1_bookslistviewid);
        LevelTermAdapter adapter = new LevelTermAdapter(this, name, flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String x = name[i];
                if (x.equals("")) {

                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
