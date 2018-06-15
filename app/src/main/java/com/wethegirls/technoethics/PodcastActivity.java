package com.wethegirls.technoethics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PodcastActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_home:
                    Intent homeActivity = new Intent(PodcastActivity.this, MainActivity.class);
                    startActivity(homeActivity);
                    return true;
                case R.id.action_trends:
                    Intent trendActivity = new Intent(PodcastActivity.this, MainActivity.class);
                    startActivity(trendActivity);
                    return true;
                case R.id.action_news:
                    Intent newsActivity = new Intent(PodcastActivity.this, MainActivity.class);
                    startActivity(newsActivity);
                    return true;
                case R.id.action_podcast:
                    Intent podcastActivity = new Intent(PodcastActivity.this, MainActivity.class);
                    startActivity(podcastActivity);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Podcast");
        //getSupportActionBar().setSubtitle("Home");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.default_bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
