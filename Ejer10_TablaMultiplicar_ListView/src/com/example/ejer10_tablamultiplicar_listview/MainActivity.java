package com.example.ejer10_tablamultiplicar_listview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity implements OnClickListener{
private ArrayList<Tabla>ListaTablas;
private MiArrayAdapter adaptador;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ListaTablas = new ArrayList<Tabla>();
		adaptador = new MiArrayAdapter(MainActivity.this,
				android.R.layout.simple_list_item_1, ListaTablas);
		((ListView) findViewById(R.id.lv_datos)).setAdapter(adaptador);
		
		
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
	public void onClick(View v) {
		EditText ed_numero= (EditText)findViewById(R.id.ed_numero);
		String num = ed_numero.getText().toString();
		for (int i=0;i<10;i++)
		{
			Tabla t1 = new Tabla(Integer.parseInt(num),i);
			((MiArrayAdapter)((ListView) findViewById(R.id.lv_datos)).getAdapter()).add(t1);
		}

		
	}
}
