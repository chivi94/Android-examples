package com.example.ejem05_spinnerpersonalizado;

import java.util.ArrayList;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Spinner desplegable = (Spinner) findViewById(R.id.desplegable);
		Persona p1 = new Persona("ivan", 19, "654987321");
		Persona p2 = new Persona("edel", 19, "654987321");
		Persona p3 = new Persona("juan", 19, "654987321");
		ArrayList<Persona> personas = new ArrayList<Persona>();
		// String datosString[]={"Valladolid","Burgos","Soria","Zamora"};
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		// Esta clase nos devuelve todos los recursos de la aplicación
		// Resources res = getResources();
		// datosString = res.getStringArray(R.array.datosString);

		// ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
		// this.getApplicationContext(),
		// android.R.layout.simple_spinner_item, datosString);
		ArrayAdapter<Persona> adaptador = new ArrayAdapter<Persona>(
				this.getApplicationContext(),
				android.R.layout.simple_spinner_item, personas);
		desplegable.setAdapter(adaptador);

		((Spinner) findViewById(R.id.desplegable))
				.setOnItemSelectedListener(new OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {
						// TODO Auto-generated method stub
						// El view que recibe este evento es un TextView,no el
						// Spinner.
						// Para acceder a los elementos del Spinner,tenemos que
						// acceder
						// al objeto mediante la ID.
						Spinner desple = (Spinner) findViewById(R.id.desplegable);
						TextView texto = (TextView) findViewById(R.id.tv_seleccionado);
						Persona p = (Persona) desple.getSelectedItem();
						texto.setText(p.toString());

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						TextView text = (TextView) findViewById(R.id.tv_seleccionado);
						text.setText("Selecciona un elemento");

					}
				});
		Button boton1 = (Button) findViewById(R.id.button1);
		boton1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nombre = ((EditText) findViewById(R.id.et_nombre))
						.getText().toString();
				int edad = Integer
						.parseInt(((EditText) findViewById(R.id.et_eda))
								.getText().toString());
				String tlf = ((EditText) findViewById(R.id.et_telefono))
						.getText().toString();
				Persona p = new Persona(nombre, edad, tlf);
				ArrayAdapter<Persona> adapter = ((ArrayAdapter<Persona>) ((Spinner) findViewById(R.id.desplegable))
						.getAdapter());
				adapter.add(p);
			}
		});
		Button boton2 = (Button) findViewById(R.id.button2);
		boton2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView texto = (TextView) findViewById(R.id.tv_seleccionado);
				String nombre = ((EditText) findViewById(R.id.et_nombre))
						.getText().toString();
				ArrayAdapter<Persona> adapter = ((ArrayAdapter<Persona>) ((Spinner) findViewById(R.id.desplegable))
						.getAdapter());

				if (!adapter.isEmpty()) {
					for (int i = 0; i < adapter.getCount(); i++) {
						if (nombre.equals(adapter.getItem(i).getNombre())) {
							adapter.remove(adapter.getItem(i));
						} else {
							texto.setText("Persona no encontrada");
						}
					}
				}

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
