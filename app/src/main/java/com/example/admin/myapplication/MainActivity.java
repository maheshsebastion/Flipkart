package com.example.admin.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private android.support.v7.app.ActionBarDrawerToggle mToggle;

    private Toolbar mToolbar;

    Button btn;
    /*RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] M_name,Amount,offer,rating;
    int[] img_res= {R.drawable.iphone,R.drawable.lenovo,R.drawable.moto,R.drawable.sgalaxy,};
    int[] image1= {R.drawable.iphone,R.drawable.lenovo,R.drawable.moto,R.drawable.sgalaxy};
    int[] image2= {R.drawable.iphoneback,R.drawable.lenovoback,R.drawable.motoback,R.drawable.galaxyback};
    int[] image3= {R.drawable.iphoneside,R.drawable.lenovoside,R.drawable.motoside,R.drawable.galaxyside};
    int[] image4= {R.drawable.iphoneview,R.drawable.lenovoview,R.drawable.motoview,R.drawable.galaxyview};
    ArrayList<Dataprovider> arrayList=new ArrayList<Dataprovider>();*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new android.support.v7.app.ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Flipkart");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0066ff")));

        /*recyclerView=(RecyclerView) findViewById(R.id.rv);
        M_name=getResources().getStringArray(R.array.names);
        Amount=getResources().getStringArray(R.array.amount);
        offer=getResources().getStringArray(R.array.offer);
        rating=getResources().getStringArray(R.array.rating);
        int i=0;
        for(String name:M_name)
        {
            Dataprovider dataprovider=new Dataprovider(img_res[i],name,Amount[i], image1[i], image2[i], image3[i], image4[i], offer[i], rating[i]);
            arrayList.add(dataprovider);
            i++;
        }

        adapter = new RecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(MainActivity.this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);*/

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Products.class);
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.buttons, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
