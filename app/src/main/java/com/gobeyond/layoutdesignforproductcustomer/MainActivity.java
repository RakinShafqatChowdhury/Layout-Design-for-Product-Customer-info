package com.gobeyond.layoutdesignforproductcustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private Spinner packageTypeSP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        packageTypeSP = findViewById(R.id.packageSpinner);

        String[] packageType = getResources().getStringArray(R.array.package_details);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1,
                packageType);
        packageTypeSP.setAdapter(adapter);
    }

    public void gotoCustomerDetails(View view) {
        startActivity(new Intent(this,CustomerDetaiils.class));
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
    }
}