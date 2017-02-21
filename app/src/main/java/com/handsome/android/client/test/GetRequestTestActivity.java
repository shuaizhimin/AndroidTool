package com.handsome.android.client.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.handsome.android.client.R;


public class GetRequestTestActivity extends AppCompatActivity {
    TextView mGetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_request_test);
        mGetText=(TextView)findViewById(R.id.mGetText);
        mGetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GetRequestTestActivity.this,GetRequestDetailActivity.class));
            }
        });
    }


}
