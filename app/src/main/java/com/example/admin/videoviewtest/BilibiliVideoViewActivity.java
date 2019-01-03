/*
package com.example.admin.videoviewtest;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.VideoView;

import cn.jzvd.Jzvd;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class BilibiliVideoViewActivity extends AppCompatActivity {
    VideoView videoView;
    private AndroidMediaController mMediaController;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle("RecyclerView");
        setContentView(R.layout.activity_video);
        IjkMediaPlayer.loadLibrariesOnce(null);
        IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        //这里使用的是Demo中提供的AndroidMediaController类控制播放相关操作
        mMediaController = new AndroidMediaController(this, false);
        mMediaController.setSupportActionBar(actionBar);
        mVideoView = (IjkVideoView) findViewById(R.id.video_view);
        mVideoView.setMediaController(mMediaController);

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
*/
