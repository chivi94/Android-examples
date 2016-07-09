package com.example.ejercicio02_calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	// Lo que está comentado es la otra forma de hacer el ejercicio
	// Con 2 tipos de OnClickListener
	// Uno de ellos es con la interfaz para que la propia clase haga de
	// escuchador
	// Y la segunda forma es creando un objeto tipo OnClickListener que haga esa
	// función
	int sum1 = 0;
	int sum2 = 0;
	int total = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//
		// OnClickListener listener = new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// Button boton = (Button) v;
		// TextView texto;
		//
		// if (boton.getId() == R.id.botonsumar) {
		// texto=(TextView) findViewById(R.id.textView1);
		// sum1 = Integer.parseInt((String) texto.getText());
		// texto.setText(boton.getText());
		// }
		// if (boton.getId() == R.id.boton_igual) {
		// texto=(TextView) findViewById(R.id.textView1);
		// sum2 = Integer.parseInt((String) texto.getText());
		// total = sum1 + sum2;
		// texto.setText(String.valueOf(total));
		// }
		// }
		// };
		// View bot0 = (Button) findViewById(R.id.boton_0);
		// bot0.setOnClickListener(listener);
		// View bot1 = (Button) findViewById(R.id.button1);
		// bot1.setOnClickListener(listener);
		// View bot2 = (Button) findViewById(R.id.boton2);
		// bot2.setOnClickListener(listener);
		// View bot3 = (Button) findViewById(R.id.boton3);
		// bot3.setOnClickListener(listener);
		// View bot4 = (Button) findViewById(R.id.boton4);
		// bot4.setOnClickListener(listener);
		// View bot5 = (Button) findViewById(R.id.boton5);
		// bot5.setOnClickListener(listener);
		// View bot6 = (Button) findViewById(R.id.boton6);
		// bot6.setOnClickListener(listener);
		// View bot7 = (Button) findViewById(R.id.boton7);
		// bot7.setOnClickListener(listener);
		// View bot8 = (Button) findViewById(R.id.boton8);
		// bot8.setOnClickListener(listener);
		// View bot9 = (Button) findViewById(R.id.boton9);
		// bot9.setOnClickListener(listener);
		// View sumar = (Button) findViewById(R.id.botonsumar);
		// sumar.setOnClickListener(listener);
		// View igual = (Button) findViewById(R.id.boton_igual);
		// igual.setOnClickListener(listener);

		View bot0 = (Button) findViewById(R.id.boton_0);
		bot0.setOnClickListener(this);
		View bot1 = (Button) findViewById(R.id.button1);
		bot1.setOnClickListener(this);
		View bot2 = (Button) findViewById(R.id.boton2);
		bot2.setOnClickListener(this);
		View bot3 = (Button) findViewById(R.id.boton3);
		bot3.setOnClickListener(this);
		View bot4 = (Button) findViewById(R.id.boton4);
		bot4.setOnClickListener(this);
		View bot5 = (Button) findViewById(R.id.boton5);
		bot5.setOnClickListener(this);
		View bot6 = (Button) findViewById(R.id.boton6);
		bot6.setOnClickListener(this);
		View bot7 = (Button) findViewById(R.id.boton7);
		bot7.setOnClickListener(this);
		View bot8 = (Button) findViewById(R.id.boton8);
		bot8.setOnClickListener(this);
		View bot9 = (Button) findViewById(R.id.boton9);
		bot9.setOnClickListener(this);
		View sumar = (Button) findViewById(R.id.botonsumar);
		sumar.setOnClickListener(this);
		View igual = (Button) findViewById(R.id.boton_igual);
		igual.setOnClickListener(this);
		View letra_c = (Button) findViewById(R.id.boton_c);
		letra_c.setOnClickListener(this);

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
		Button boton = ((Button) v);
		TextView texto_calculadora = (TextView) findViewById(R.id.textView1);

		if (boton.getId() == (R.id.botonsumar)) {
			sum1 = Integer.parseInt((String) texto_calculadora.getText());

			texto_calculadora.setText("");

		}

		if (boton.getId() == (R.id.boton_igual)) {
			sum2 = Integer.parseInt((String) texto_calculadora.getText());
			total = sum1 + sum2;
			texto_calculadora.setText(String.valueOf(total));

		}
		if (boton.getId() != (R.id.boton_igual)
				&& boton.getId() != (R.id.botonsumar)
				&& boton.getId() != (R.id.boton_c)) {
			Toast.makeText(getApplicationContext(),
					"Vas a sumar " + boton.getText(), Toast.LENGTH_LONG).show();
			texto_calculadora.setText(((Button) v).getText());
		}
		if (boton.getId() == (R.id.boton_c)) {
			texto_calculadora.setText("");
		}

	}
}
