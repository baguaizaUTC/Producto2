package controllers;

import java.util.List;

import com.avaje.ebean.Model.Find;

public class Pedido {
	
	
	public static Find<Long,Pedido> find =new Find<Long,Pedido>(){};

	public static List<Pedido> listadobebidas() {
		// TODO Auto-generated method stub
		return find.all();
	}

}
