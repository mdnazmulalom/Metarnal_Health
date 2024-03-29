package com.nazmul.metarnalhealth.mothers.firstaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.nazmul.metarnalhealth.R;

public class FirstaidShishuRogActivity extends AppCompatActivity {
    CardView shishusordikasi,shishuniumonia,shishudiariya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstaid_shishu_rog);

        shishusordikasi=findViewById(R.id.shishu_sordi_kasi);
        shishuniumonia=findViewById(R.id.shishu_niumonia);
        shishudiariya=findViewById(R.id.shishu_diariya);

        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("শিশুর রোগ");

        shishusordikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstaidShishuRogActivity.this, Firstaid_Shishu_Sordikasi.class);
                startActivity(intent);
            }
        });

        shishuniumonia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstaidShishuRogActivity.this, Firstaid_Shishu_Niumonia.class);
                startActivity(intent);
            }
        });

        shishudiariya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstaidShishuRogActivity.this, Firstaid_shishu_Diariya.class);
                startActivity(intent);
            }
        });
    }

    //for back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}