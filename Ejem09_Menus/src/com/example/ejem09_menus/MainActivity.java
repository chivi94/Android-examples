package com.example.ejem09_menus;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LinearLayout padre = (LinearLayout) findViewById(R.id.ly_padre);
		TextView tv_coso=(TextView)findViewById(R.id.tv_texto);
		registerForContextMenu(tv_coso);// Es la view que va a soportar el menú
		//Donde mantenemos pulsado y se ejecuta el menú.
		/*
		 * Para crear un menú contextual tenemos que desarrollar los métodos
		 * análogos a onCreateOptionsMenu y a onOptionsItemSelectedpero para
		 * menús contextuales.El menú se lanza cuando mantenemos pulsado 
		 * Source->Override/Implement
		 * Methods->onCreateContextMenu y onContextItemSelected
		 */
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		getMenuInflater().inflate(R.menu.mimenu, menu);

	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		TextView tv = new TextView(MainActivity.this.getApplicationContext());
		LinearLayout padre = (LinearLayout) findViewById(R.id.ly_padre);
		padre.addView(tv);
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		// Toast.makeText(MainActivity.this.getApplicationContext(),
		// item.getTitle(), Toast.LENGTH_SHORT).show();
		// if (id == R.id.action_settings) {
		// return true;
		// }
		switch (id) {
		case R.id.item1:
			tv.setText(item.getTitle());
			tv.setTextColor(Color.BLACK);
			break;
		case R.id.item2:
			Toast.makeText(getApplicationContext(), item.getTitle(),
					Toast.LENGTH_SHORT).show();
			tv.setText("Hola");
			break;
		case R.id.item3:
			Toast.makeText(getApplicationContext(), item.getTitle(),
					Toast.LENGTH_SHORT).show();
			tv.setText(item.getTitle());
			break;
		case R.id.item4:
			Toast.makeText(getApplicationContext(), item.getTitle(),
					Toast.LENGTH_SHORT).show();
			tv.setText(item.getTitle());
			break;
		case R.id.item5:
			Toast.makeText(getApplicationContext(), item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;
		default:
			Toast.makeText(getApplicationContext(), "Finalizado",
					Toast.LENGTH_SHORT).show();
			finish();
			break;
		}
		// if (id == R.id.item1) {
		// Toast.makeText(getApplicationContext(), item.getTitle(),
		// Toast.LENGTH_SHORT).show();
		// }
		return super.onContextItemSelected(item);
	}

	@Override
	// Se implementa con la clase Activity
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		getMenuInflater().inflate(R.menu.mimenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		TextView tv = new TextView(MainActivity.this.getApplicationContext());
		LinearLayout padre = (LinearLayout) findViewById(R.id.ly_padre);
		padre.addView(tv);
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		// Toast.makeText(MainActivity.this.getApplicationContext(),
		// item.getTitle(), Toast.LENGTH_SHORT).show();
		// if (id == R.id.action_settings) {
		// return true;
		// }
		switch (id) {
		case R.id.item1:
			tv.setText(item.getTitle());
			tv.setTextColor(Color.BLACK);
			break;
		case R.id.item2:
			Toast.makeText(getApplicationContext(), item.getTitle(),
					Toast.LENGTH_SHORT).show();
			tv.setText("Hola");
			break;
		case R.id.item3:
			Toast.makeText(getApplicationContext(), item.getTitle(),
					Toast.LENGTH_SHORT).show();
			tv.setText(item.getTitle());
			break;
		case R.id.item4:
			Toast.makeText(getApplicationContext(), item.getTitle(),
					Toast.LENGTH_SHORT).show();
			tv.setText(item.getTitle());
			break;
		case R.id.item5:
			Toast.makeText(getApplicationContext(), item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;
		default:
			Toast.makeText(getApplicationContext(), "Finalizado",
					Toast.LENGTH_SHORT).show();
			finish();
			break;
		}
		// if (id == R.id.item1) {
		// Toast.makeText(getApplicationContext(), item.getTitle(),
		// Toast.LENGTH_SHORT).show();
		// }
		return super.onOptionsItemSelected(item);
	}
}
