package com.example.ejem08_multiple;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LinearLayout ly_tocar = (LinearLayout) findViewById(R.id.ly_tocar);
		ly_tocar.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				event.getActionIndex();
				TextView texto = (TextView) findViewById(R.id.tv_coordenadas);
				for (int i = 0; i < event.getPointerCount(); i++) {
					texto.setText(event.getPointerId(i)+ "Coordenada X: "
							+ event.getX() + "Coordenada Y: " + event.getY());
				}
				// texto.setText("Coordenada X: " + event.getX()
				// + "\nCoordenada Y: " + event.getY());

				return true;
			}
		});

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
}
