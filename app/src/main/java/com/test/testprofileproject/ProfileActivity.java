package com.test.testprofileproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        RecyclerView rvImages = (RecyclerView) findViewById(R.id.rv_images);
        rvImages.setLayoutManager(new GridLayoutManager(this, 3));
        rvImages.setHasFixedSize(true);

        ImagesAdapter rcAdapter = new ImagesAdapter(this, getImagesList());
        rvImages.setAdapter(rcAdapter);
    }

    private List<Image> getImagesList() {
        List<Image> images = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            images.add(new Image("12", R.drawable.best_resorts_bali));
        }
        return images;
    }
}
