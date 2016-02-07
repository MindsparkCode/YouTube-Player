package com.example.omarfarooq.youtubeplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {

    private String YOUTUBE_VIDEO_ID = "laLlWlHKmI8";
    private String GOOGLE_API_KEY = "AIzaSyBiSH5HiFwcGuw-sjqVivaCxgnPopjQmFU";
    private String YOUTUBE_PLAYLIST = "TBA";
    private Button btnPlayVideo;
    private Button btnPlayVideoPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        btnPlayVideoPlaylist=(Button) findViewById(R.id.btnPlaylist);

        btnPlayVideo.setOnClickListener(this);
        btnPlayVideoPlaylist.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()){
            case R.id.btnPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
                break;
            case R.id.btnPlaylist:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST);
                break;
            default:
        }

    }
}
