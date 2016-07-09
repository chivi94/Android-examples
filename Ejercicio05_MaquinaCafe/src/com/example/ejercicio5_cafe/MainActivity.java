package com.example.ejercicio5_cafe;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	private int cont = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

		Button servir = (Button) findViewById(R.id.bot_servir);
		servir.setOnClickListener(this);

		ToggleButton encendido = (ToggleButton) findViewById(R.id.tb_encender);
		encendido.setChecked(true);
		encendido.setOnCheckedChangeListener(this);

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
		// TODO Auto-generated method stub
		Button boton = (Button) v;
		TextView servido = (TextView) findViewById(R.id.tv_servido);
		servido.setTextColor(Color.WHITE);
		TextView recaudado = (TextView) findViewById(R.id.tv_recaudado);
		recaudado.setTextColor(Color.WHITE);
		CheckBox caja = (CheckBox) findViewById(R.id.cb_azucar);
		Spinner cafes = (Spinner) findViewById(R.id.sp_cafes);
		if (boton.getId() == R.id.bot_servir) {
			String eleccion = cafes.getSelectedItem().toString();
			if (caja.isChecked() == true) {
				if (cafes.getSelectedItem().equals("Colacao")) {
					servido.setText("Servido Nesquik");
					recaudado.setText("Lleva recaudado:" + cont++ + "€");
				} else {
					servido.setText("Servido " + eleccion
							+ " con Extra de Azucar");
					recaudado.setText("Lleva recaudado:" + cont++ + "€");
				}
			} else {
				servido.setText("Servido " + eleccion);
				recaudado.setText("Lleva recaudado:" + cont++ + "€");
			}
		}

	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		ToggleButton boton = (ToggleButton) buttonView;
		Button serv = (Button) findViewById(R.id.bot_servir);
		CheckBox caja = (CheckBox) findViewById(R.id.cb_azucar);
		if (!boton.isChecked()) {
			serv.setEnabled(false);
			caja.setEnabled(false);
		} else {
			serv.setEnabled(true);
			caja.setEnabled(true);
		}

	}
}
