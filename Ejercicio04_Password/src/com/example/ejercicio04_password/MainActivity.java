package com.example.ejercicio04_password;

import java.util.ArrayList;
import java.util.Collections;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Accedemos a todos los componentes que vamos a usar
		final Button bot0 = (Button) findViewById(R.id.bot0);
		bot0.setOnClickListener(this);
		final Button bot1 = (Button) findViewById(R.id.bot1);
		bot1.setOnClickListener(this);
		final Button bot2 = (Button) findViewById(R.id.bot2);
		bot2.setOnClickListener(this);
		final Button bot3 = (Button) findViewById(R.id.bot3);
		bot3.setOnClickListener(this);
		final Button bot4 = (Button) findViewById(R.id.bot4);
		bot4.setOnClickListener(this);
		final Button bot5 = (Button) findViewById(R.id.bot5);
		bot5.setOnClickListener(this);
		final Button bot6 = (Button) findViewById(R.id.bot6);
		bot6.setOnClickListener(this);
		final Button bot7 = (Button) findViewById(R.id.bot7);
		bot7.setOnClickListener(this);
		final Button bot8 = (Button) findViewById(R.id.bot8);
		bot8.setOnClickListener(this);
		final Button bot9 = (Button) findViewById(R.id.bot9);
		bot9.setOnClickListener(this);
		Button limpiar = (Button) findViewById(R.id.bot_vaciar);
		limpiar.setOnClickListener(this);
		// Método específico para el botón de desordenar
		ImageButton imagen = (ImageButton) findViewById(R.id.imageButton1);
		imagen.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				// TODO Auto-generated method stub
				ArrayList <String> numeros = new ArrayList <String>();
				for (int i = 0; i < 10; i++) {
					numeros.add(String.valueOf(i));
				}
				Collections.shuffle(numeros);
				bot0.setText(numeros.get(0));
				bot1.setText(numeros.get(1));
				bot2.setText(numeros.get(2));
				bot3.setText(numeros.get(3));
				bot4.setText(numeros.get(4));
				bot5.setText(numeros.get(5));
				bot6.setText(numeros.get(6));
				bot7.setText(numeros.get(7));
				bot8.setText(numeros.get(8));
				bot9.setText(numeros.get(9));
//				// Creamos el ArrayList
//				ArrayList<Button> botones = new ArrayList<Button>();
//				// Añadimos los botones
//				botones.add(bot0);
//				botones.add(bot1);
//				botones.add(bot2);
//				botones.add(bot3);
//				botones.add(bot4);
//				botones.add(bot5);
//				botones.add(bot6);
//				botones.add(bot7);
//				botones.add(bot8);
//				botones.add(bot9);
//				// Desordenación de los botones
//				ImageButton desordenar = (ImageButton) v;
//				int[] numeros = new int[10];
//				int aleatorio = (int) (Math.random() * 10);// números aleatorios
//															// de los botones
//				if (desordenar.getId() == R.id.imageButton1) {
//					for (int i = 0; i < numeros.length; i++) {
//						if (numeros[i] == aleatorio) {
//							aleatorio = (int) (Math.random() * 10);
//						} else {
//							numeros[i] = aleatorio;
//						}
//					}
//					for (Button b : botones) {
//						for (int i = 0; i < numeros.length; i++) {
//							b.setText(String.valueOf(i));
//						}
//					}
//				}

		}
		});

		Button val = (Button) findViewById(R.id.botValidar);
		val.setOnClickListener(this);
		final CheckBox mostrar = (CheckBox) findViewById(R.id.cb_mostrar);
		mostrar.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				EditText pass = (EditText) findViewById(R.id.et_password);
				if (! isChecked) {
					pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
					pass.setSelection(pass.length());
				} else {
					pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);

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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Button boton = (Button) v;
		EditText pass = (EditText) findViewById(R.id.et_password);
		TextView valido = (TextView) findViewById(R.id.tv_valido);
		String dato = boton.getText().toString();
		String contrasenia = pass.getText().toString();
		if (dato.equalsIgnoreCase("Validar")) {
			if (contrasenia.equalsIgnoreCase("1234")) {
				valido.setText("Contraseña válida");
			} else {
				valido.setText("Contraseña inválida");
			}
		} else if (boton.getId() == R.id.bot_vaciar) {
			pass.setText("");
		} else {
			pass.setText(pass.getText() + dato);
		}

	}
	
}
