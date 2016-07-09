package com.example.ejem07_pestanas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TabHost pestañas = (TabHost) findViewById(R.id.pestanias);
		pestañas.setup();

		// Creación de las pestañas.
		TabSpec tab1 = pestañas.newTabSpec("Pestaña 1");
		tab1.setContent(R.id.tab1);// La forma que se le asigna
		tab1.setIndicator("",
				getResources().getDrawable(android.R.drawable.ic_menu_agenda));
		TabSpec tab2 = pestañas.newTabSpec("Pestaña 2");
		tab2.setContent(R.id.tab2);
		tab2.setIndicator("",
				getResources().getDrawable(android.R.drawable.ic_menu_add));
		TabSpec tab3 = pestañas.newTabSpec("Pestaña 3");
		tab3.setContent(R.id.tab3);
		tab3.setIndicator("",
				getResources().getDrawable(android.R.drawable.ic_delete));
		// Añadimos las ventanas
		pestañas.addTab(tab1);
		pestañas.addTab(tab2);
		pestañas.addTab(tab3);
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
