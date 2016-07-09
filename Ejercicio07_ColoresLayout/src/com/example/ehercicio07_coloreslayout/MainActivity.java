package com.example.ehercicio07_coloreslayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnTouchListener {
	LinearLayout ly_padre;
	LinearLayout ly_hijo;
	LinearLayout ly_nieto;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ly_padre = (LinearLayout) findViewById(R.id.padre);
		ly_hijo = (LinearLayout) findViewById(R.id.hijo);
		ly_nieto = (LinearLayout) findViewById(R.id.nieto);

		ly_padre.setOnTouchListener(this);
		ly_hijo.setOnTouchListener(this);
		ly_nieto.setOnTouchListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.hijo:
			ly_padre.setBackgroundDrawable(v.getBackground());
			break;
		default:
			ly_padre.setBackgroundDrawable(v.getBackground());
			break;
		}

		return true;
	}
}
