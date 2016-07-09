package com.example.ejercicio06_formularioexamen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	double ingles;
	double mate;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button calif = (Button) findViewById(R.id.b_cal);
		calif.setOnClickListener(this);// Se implementará en el método onClick
		

		ImageView imagen = (ImageView) findViewById(R.id.imageView1);
		imagen.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				// ImageView bt = (ImageView) v;
				EditText nombre = (EditText) findViewById(R.id.et_nombres);
				String nom = nombre.getText().toString();
				if(nom.equals(null)){
					Toast.makeText(getApplicationContext(), "Alumno",
							Toast.LENGTH_SHORT).show();
				}else{
				Toast.makeText(getApplicationContext(), "Alumno "+nom,
						Toast.LENGTH_SHORT).show();
				}
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		menu.addSubMenu("Reclamar la nota");
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
		// Button boton = (Button) v;

		Spinner notaMates = (Spinner) findViewById(R.id.sp_notas);
		String eleccion = notaMates.getSelectedItem().toString();
		mate = Double.parseDouble(eleccion);

		TextView resultado = (TextView) findViewById(R.id.tv_resultado);
		resultado.setText("Resultado:");
		
		EditText nombre = (EditText) findViewById(R.id.et_nombres);
		String nom = nombre.getText().toString();
		
		RadioGroup grupo = (RadioGroup) findViewById(R.id.rg_grupo);
		int seleccion = grupo.getCheckedRadioButtonId();

		if (seleccion == R.id.rb_aprobado) {
			ingles = 5;
		}
		if (seleccion == R.id.rb_suspenso) {
			ingles = 0;
		}

		double media = (mate + ingles) / 2;

		if(!nom.equals("")){
		resultado.setText(resultado.getText() + "\n" + nom
				+ " tiene de media un " + String.valueOf(media));
		}else{
			resultado.setText(resultado.getText()+"\n"
					+"¡ERROR!Introduce nombre de alumno");
		}

	}
}
