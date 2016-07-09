package com.example.ejer10_tablamultiplicar_listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MiArrayAdapter extends ArrayAdapter<Tabla> {
	Context contexto;
	ArrayList<Tabla>datos;
	public MiArrayAdapter(Context context, int textViewResourceId,
			List<Tabla> objects) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		contexto=context;
		datos = (ArrayList<Tabla>) objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		
		LayoutInflater constructor = ((Activity) contexto).getLayoutInflater();
		View item = constructor.inflate(R.layout.midistribucion,null);
		
		TextView tv_n1 = (TextView) item.findViewById(R.id.tv_n1);
		tv_n1.setText(String.valueOf(((Tabla)datos.get(position)).getNum1()));		
		
		TextView tv_x = (TextView) item.findViewById(R.id.tv_x);
		tv_x.setText("X");	
		
		TextView tv_n2 = (TextView) item.findViewById(R.id.tv_n2);
		tv_n2.setText(String.valueOf(datos.get(position).getNum2()));
		
		datos.get(position).multiplicar();
		
		TextView tv_res = (TextView) item.findViewById(R.id.tv_res);
		tv_res.setText(String.valueOf(datos.get(position).getResultado()));		
			
		return item;
		
	}
	
	

	

}
