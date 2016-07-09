package com.example.ejem06_listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MiArrayAdapter extends ArrayAdapter<Persona> {

	private Context contexto;
	private ArrayList<Persona> personas;

	public MiArrayAdapter(Context context, int textViewResourceId,
			ArrayList<Persona> personas) {
		super(context, textViewResourceId, personas);
		this.contexto = context;
		this.personas = (ArrayList<Persona>)personas;
		
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.ArrayAdapter#getView(int, android.view.View,
	 * android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Persona p = personas.get(position);
		LayoutInflater constructor = ((Activity)contexto).getLayoutInflater();
		View item = constructor.inflate(R.layout.midistribucion, null);

		TextView tv_nombre = (TextView) item.findViewById(R.id.tv_nombre);
		tv_nombre.setText(p.getNombre());
		
		TextView tv_edad = (TextView) item.findViewById(R.id.tv_edad);
		tv_edad.setText(String.valueOf(p.getEdad()));
		
		TextView tv_tlf = (TextView) item.findViewById(R.id.tv_tlf);
		tv_tlf.setText(String.valueOf(p.getTlf()));
		
		return item;
		
	}

}
