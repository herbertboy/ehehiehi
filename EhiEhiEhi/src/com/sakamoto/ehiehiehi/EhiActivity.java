package com.sakamoto.ehiehiehi;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
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
		MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.baggytrousers);
    	mp.start();
    	while(mp.isPlaying()){
    		//donothing
    	}
    	mp.release();
	}
}
