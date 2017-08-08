package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {

    ImageView imageView,imageView1,imageView2,imageView3,imageView4;
    TextView tx_name,tx_amount,offer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details_layout);
        imageView = (ImageView) findViewById(R.id.image);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        offer = (TextView) findViewById(R.id.txt2);
        tx_name = (TextView) findViewById(R.id.name);
        tx_amount = (TextView) findViewById(R.id.m_amount);
        imageView.setImageResource(getIntent().getIntExtra("img_id", 00));
        imageView1.setImageResource(getIntent().getIntExtra("image1", 00));
        imageView2.setImageResource(getIntent().getIntExtra("image2", 00));
        imageView3.setImageResource(getIntent().getIntExtra("image3", 00));
        imageView4.setImageResource(getIntent().getIntExtra("image4", 00));
        tx_name.setText(getIntent().getStringExtra("name"));
        tx_amount.setText(getIntent().getStringExtra("amount"));
        offer.setText(getIntent().getStringExtra("offer"));
    }
}
