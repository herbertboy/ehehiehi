package com.sakamoto.ehiehiehi;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EhiActivity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ehi);
        Button but = (Button)findViewById(R.id.button);
        but.setOnClickListener(this);
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_ehi, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		getApplicationContext();
		AudioManager amanager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
		int maxVolume = amanager.getStreamMaxVolume(AudioManager.STREAM_ALARM);
		amanager.setStreamVolume(AudioManager.STREAM_ALARM, maxVolume, 0);
		
		MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.ehiehiehi);
		mp.setAudioStreamType(AudioManager.STREAM_ALARM); // this is important.

//		mp.setVolume(1, 1);
    	mp.start();
    	while(mp.isPlaying()){
    		//donothing 
    	}
    	mp.release();
	}
}
