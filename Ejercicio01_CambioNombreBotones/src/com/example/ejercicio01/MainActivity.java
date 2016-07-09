package com.example.ejercicio01;

import com.example.ejercicio01.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Cambia el texto en tiempo de ejecución

		// Si en vez de hacer una variable botón,hicieramos un casting a
		// TextView,
		// no nos daría error,porque la clase Button hereda de TextView.

		// final Button boton1 = (Button) findViewById(R.id.boton_1);
		// final Button boton2 = (Button) findViewById(R.id.boton_2);
		// final Button boton3 = (Button) findViewById(R.id.boton_3);

		// Button[] botones = { boton1, boton2, boton3 };
		//
		// for (int i = 0; i < botones.length; i++) {
		// if (botones[i].equals(boton1)) {
		// boton1.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		// TextView texto = (TextView) findViewById(R.id.textView1);
		// texto.setText(boton1.getText());
		// }
		// });
		// } else if (botones[i].equals(boton2)) {
		// boton2.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		// TextView texto = (TextView) findViewById(R.id.textView1);
		// texto.setText(boton2.getText());
		// }
		// });
		// } else {
		// boton3.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		// TextView texto = (TextView) findViewById(R.id.textView1);
		// texto.setText(boton3.getText());
		// }
		// });
		// }
		// }
		// Correccion del ejercicio
		OnClickListener escuchador = new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView texto = (TextView) findViewById(R.id.textView1);
				texto.setText(((Button) v).getText());
				Toast.makeText(getApplicationContext(), "Hola",
						Toast.LENGTH_LONG).show();

			}

		};

		View bot1 = (Button) findViewById(R.id.boton_1);
		bot1.setOnClickListener(escuchador);
		View bot2 = (Button) findViewById(R.id.boton_2);
		bot2.setOnClickListener(escuchador);
		View bot3 = (Button) findViewById(R.id.boton_3);
		bot3.setOnClickListener(escuchador);

		// Este metodo se ejecutará cuando hagamos click sobre el botón
		// boton1.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View arg0) {
		// // TODO Auto-generated method stub
		// TextView texto = (TextView) findViewById(R.id.textView1);
		// texto.setText(boton1.getText());
		//
		// }
		// });
		// boton2.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View arg0) {
		// // TODO Auto-generated method stub
		// TextView texto = (TextView) findViewById(R.id.textView1);
		// texto.setText(boton2.getText());
		// }
		// });
		// boton3.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View arg0) {
		// // TODO Auto-generated method stub
		// TextView texto = (TextView) findViewById(R.id.textView1);
		// texto.setText(boton3.getText());
		// }
		// });

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

	}
}
