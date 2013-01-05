package com.sakamoto.ehiehiehi.activities;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.sakamoto.ehiehiehi.R;

public class EhiActivity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        setContentView(R.layout.activity_ehi);
        Button but = (Button)findViewById(R.id.button);
        but.setOnClickListener(this);
        PreferenceManager.setDefaultValues(this, R.xml.preference, false);
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_ehi, menu);
        return true;
    }    

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
	        case R.id.menu_settings:
	        	Intent intent = new Intent(this, SettingsActivity.class);
	            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	            startActivity(intent);
	            return true;
	        default:
	            return super.onMenuItemSelected(featureId, item);
		}
	}

	@Override
	public void onClick(View v) {		
		MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.ehiehiehi);

    	mp.start();
    	while(mp.isPlaying()){
    		//donothing 
    	}
    	mp.release();
	}
}
