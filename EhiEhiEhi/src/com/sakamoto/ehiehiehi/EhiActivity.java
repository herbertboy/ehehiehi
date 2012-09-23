package com.sakamoto.ehiehiehi;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class EhiActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ehi);
        Button but = (Button)findViewById(R.id.button);
        //commento
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_ehi, menu);
        return true;
    }
    
    public void playMusic(){
//    	MediaPlayer mp = MediaPlayer.create(getApplicationContext(), )
    }
}
