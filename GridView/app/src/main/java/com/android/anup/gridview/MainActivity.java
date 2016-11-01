package com.android.anup.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;

    private ArrayList<Integer> image;
    //private TextView contactName1, contactNumber1;
    //private ImageView imageView;
    private Adapter gadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridvu);

        image = new ArrayList<>();


        image.add(R.mipmap.cupcake);
        image.add(R.mipmap.donut);
        image.add(R.mipmap.eclair);
        image.add(R.mipmap.froyo);
        image.add(R.mipmap.gingerbread);
        image.add(R.mipmap.honeycomb);
        image.add(R.mipmap.icecreamsandwich);
        image.add(R.mipmap.jellybean);
        image.add(R.mipmap.kitkat);
        image.add(R.mipmap.lollipop);
        image.add(R.mipmap.marshmallow);
        image.add(R.mipmap.nougat);


        gadapter = new Adapter(this, image);
        gridView.setAdapter(gadapter);

    }
}
