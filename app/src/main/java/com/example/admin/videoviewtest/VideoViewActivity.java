package com.example.admin.videoviewtest;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.VideoView;

import cn.jzvd.Jzvd;

public class VideoViewActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle("RecyclerView");
        setContentView(R.layout.activity_video);
        this.videoView = findViewById(R.id.videoview);
        String videourl = "http://v.heitouyang.cn/018542ca2d69488cba15e8807e12b992/ce6e00dbd67446529a1e12a447badb73-97cc75f77269b58925754dde5ceffefd-ld.mp4";
        Uri i = Uri.parse(videourl);
        videoView.setVideoURI(i);
        videoView.start();

    }

    public void clickVideoView(final View view) {

    }

    @Override
    protected void onStart() {
        super.onStart();
//        String videourl = "http://v.heitouyang.cn/018542ca2d69488cba15e8807e12b992/ce6e00dbd67446529a1e12a447badb73-97cc75f77269b58925754dde5ceffefd-ld.mp4";
//        Uri i = Uri.parse(videourl);
//        videoView.setVideoURI(i);
//        videoView.start();
    }

    @Override
    public void onBackPressed() {
        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
