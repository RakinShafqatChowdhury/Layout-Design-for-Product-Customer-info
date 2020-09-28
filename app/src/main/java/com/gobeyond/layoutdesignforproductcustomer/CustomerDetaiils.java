package com.gobeyond.layoutdesignforproductcustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CustomerDetaiils extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_detaiils);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
    }
}