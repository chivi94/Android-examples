package com.example.ejercicio03_formulario;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Hay que intentar no usar final.
		// Se puede instanciar cada vez que lo usemos en cada uno de los métodos.
		// Se puede instanciar el objeto a nivel de clase,pero se define en
		// onCreate.
		// Lo más cómodo es crearlo cada vez que lo usemos,por comodidad en el
		// futuro.
		final TextView tv_nombre = (TextView) findViewById(R.id.tv_nombre);
		final TextView tv_ciudad = (TextView) findViewById(R.id.tv_ciudad);
		final EditText et_nombre = (EditText) findViewById(R.id.tf_nombre);
		final ToggleButton tb_activar = (ToggleButton) findViewById(R.id.tb_activar);
		final Spinner sp_ciudades = (Spinner) findViewById(R.id.sp_ciudades);
		final EditText datos = (EditText) findViewById(R.id.ed_datos);
		final Button b_enviar = (Button) findViewById(R.id.b_enviar);

		tb_activar.setChecked(true);
		tb_activar.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				ToggleButton tb = (ToggleButton) buttonView;
				if (!tb.isChecked()) {
					et_nombre.setEnabled(false);
					sp_ciudades.setEnabled(false);
					b_enviar.setEnabled(false);
					datos.setEnabled(false);
					datos.setVisibility(TRIM_MEMORY_UI_HIDDEN);
				} else {
					et_nombre.setEnabled(true);
					sp_ciudades.setEnabled(true);
					b_enviar.setEnabled(true);
					datos.setEnabled(true);
					datos.setVisibility(TRIM_MEMORY_COMPLETE);
				}
			}
		});

		b_enviar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nombre= tv_nombre.getText().toString();
				String nombre_introducido= et_nombre.getText().toString();
				String ciudad = tv_ciudad.getText().toString();
				String ciudad_seleccionada = sp_ciudades.getSelectedItem().toString();
				datos.setText(nombre + " "
						+ nombre_introducido + "\n"
						+ ciudad + " "
						+ ciudad_seleccionada);
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
