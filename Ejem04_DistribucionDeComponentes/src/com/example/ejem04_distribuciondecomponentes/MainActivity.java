package com.example.ejem04_distribuciondecomponentes;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tv_coordenadas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tv_coordenadas = (TextView) findViewById(R.id.tv_coordenadas);
		tv_coordenadas.setText("");

		ImageView imagen = (ImageView) findViewById(R.id.imagen);
		imagen.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				//Importante:se debe de cambiar el return del metodo a true
				
		//Si esta puesto en false,el evento solo entra en una opcion
		//y no propaga el evento.Si lo pones en true,se propaga.		
			
				String x = String.valueOf((int) event.getX());
				String y = String.valueOf((int) event.getY());

				tv_coordenadas.setText("Coordenadas X:" + x
						+ "\nCoordenadas Y:" + y);
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					Log.d("Seguimiento", "ACTION_DOWN");
					tv_coordenadas.setText(tv_coordenadas.getText()
							+"\nHas pulsado");
					break;
				case MotionEvent.ACTION_MOVE:
					Log.d("Seguimiento", "ACTION_MOVE");
					tv_coordenadas.setText(tv_coordenadas.getText()
							+"\nHas movido");
					break;
				case MotionEvent.ACTION_UP:
					Log.d("Seguimiento", "ACTION_UP");
					tv_coordenadas.setText(tv_coordenadas.getText()
							+"\nHas soltado");
					break;

				default:
					break;
				}
				;
				return true;
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		menu.addSubMenu("Hola");
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
