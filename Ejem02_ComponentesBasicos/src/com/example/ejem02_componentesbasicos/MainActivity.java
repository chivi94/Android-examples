package com.example.ejem02_componentesbasicos;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		CheckBox cb_estado = (CheckBox) findViewById(R.id.cb_estado);
		cb_estado.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				// En este caso,this se refiere al objeto
				// OnCheckedChangeListener
				// Poniendo MainActivity delante,el contexto se aplica a toda la
				// clase
				Toast.makeText(MainActivity.this.getApplicationContext(),
						"Pulsó " + isChecked, Toast.LENGTH_LONG).show();
				Log.d("Mi depuración", "Ahora se: " + isChecked);
				CheckBox cb = (CheckBox) buttonView;

			}
		});
		CheckedTextView ctv_textoActivado = (CheckedTextView) findViewById(R.id.ctv_textoActivado);
		ctv_textoActivado.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Log.d("Mi depuración", ((CheckedTextView) v).getText()
						.toString() + ((CheckedTextView) v).isActivated());
			}
		});
		ToggleButton tb_encender = (ToggleButton) findViewById(R.id.tb_encender);
		tb_encender.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				Log.d("Mi depuración", String.valueOf(isChecked));

			}
		});
		TextView tv_texto = (TextView) findViewById(R.id.tv_texto);
		// No ponemos nada porque ya está explicado

		Switch sw_encender = (Switch) findViewById(R.id.sw_encender);
		sw_encender.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub

			}
		});
		Spinner sp_desplegable = (Spinner) findViewById(R.id.sp_desplegable);
		// sp_desplegable.setOnItemClickListener(new OnItemClickListener() {
		// //Un AdapterView es un componente personalizado,que se puede
		// //incluir en el Spinner
		// @Override
		// public void onItemClick(AdapterView<?> parent, View view,
		// int position, long id) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// });
		sp_desplegable.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Log.d("Mi depuración", view.toString());

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});
		RadioGroup rg_opciones = (RadioGroup) findViewById(R.id.rg_opciones);
		rg_opciones
				.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

					@Override
					public void onCheckedChanged(RadioGroup group, int checkedId) {
						// TODO Auto-generated method stub
						String cadena;
						cadena=((RadioButton)findViewById(checkedId)).getText().toString();		
								
						Toast.makeText(
								MainActivity.this.getApplicationContext(), cadena,
								Toast.LENGTH_SHORT).show();
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
