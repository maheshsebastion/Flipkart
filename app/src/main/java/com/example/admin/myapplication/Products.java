package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;

public class Products extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] M_name,Amount,offer;
    int[] img_res= {R.drawable.iphone,R.drawable.lenovo,R.drawable.moto,R.drawable.sgalaxy};
    int[] image1= {R.drawable.iphone,R.drawable.lenovo,R.drawable.moto,R.drawable.sgalaxy};
    int[] image2= {R.drawable.iphoneback,R.drawable.lenovoback,R.drawable.motoback,R.drawable.galaxyback};
    int[] image3= {R.drawable.iphoneside,R.drawable.lenovoside,R.drawable.motoside,R.drawable.galaxyside};
    int[] image4= {R.drawable.iphoneview,R.drawable.lenovoview,R.drawable.motoview,R.drawable.galaxyview};
    ArrayList<Dataprovider> arrayList=new ArrayList<Dataprovider>();

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        M_name=getResources().getStringArray(R.array.names);
        Amount=getResources().getStringArray(R.array.amount);
        offer=getResources().getStringArray(R.array.offer);
        int i=0;
        for(String name:M_name)
        {
            Dataprovider dataprovider=new Dataprovider(img_res[i],image1[i], image2[i], image3[i], image4[i],name,Amount[i],  offer[i]);
            arrayList.add(dataprovider);
            i++;
        }
        recyclerView=(RecyclerView) findViewById(R.id.rv);
        layoutManager = new GridLayoutManager(Products.this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(arrayList,this);
        recyclerView.setAdapter(adapter);

        mToolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Mobile Devices");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.product_buttons, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
