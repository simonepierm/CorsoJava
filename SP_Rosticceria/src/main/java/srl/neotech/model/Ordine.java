package srl.neotech.model;

import java.security.Timestamp;
import java.util.ArrayList;

public class Ordine {

	private String id;
	private Timestamp dataOra;
	private ArrayList<Prodotto> prodotti=new ArrayList<Prodotto>();	
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Timestamp getDataOra() {
		return dataOra;
	}
	public void setDataOra(Timestamp dataOra) {
		this.dataOra = dataOra;
	}
	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}
	public void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}}
