package com.example.ejem06_listview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Persona ivan = new Persona("Ivan", 20, 654321987);
		Persona marcos = new Persona("Marcos", 21, 699452132);
		Persona marcos2 = new Persona("Marcos", 21, 699452132);

		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(ivan);
		personas.add(marcos);
		personas.add(marcos2);

//		ArrayAdapter<Persona> adaptador = new ArrayAdapter<Persona>(
//				this.getApplicationContext(),
//				android.R.layout.simple_list_item_1, personas);
//		adaptador.getView(position, convertView, parent)
//		ListView lv = (ListView) findViewById(R.id.lv_datos);
//		lv.setAdapter(adaptador);	
		MiArrayAdapter adaptador = new MiArrayAdapter(
		this,
		android.R.layout.simple_list_item_1, personas);
		//En este caso hay que pasar this,no this.getApplicationContext
		ListView lv = (ListView) findViewById(R.id.lv_datos);
		lv.setAdapter(adaptador);	
		
		


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
