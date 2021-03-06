package srl.neotech.model;

import java.util.ArrayList;

public class BaseDati {
	
	
	private static BaseDati instance;
	
	
	private ArrayList<Video>  listaVideo=new ArrayList<Video>();
	private ArrayList<Utente> listaUtenti=new ArrayList<Utente>();
	
	
	
	private BaseDati() {
		
	}
	
	
	public static BaseDati getInstance() {
		if(instance==null) instance =new BaseDati();
	return instance;
	}

	public ArrayList<Video> getListaVideo() {
		return listaVideo;
	}

	public void setListaVideo(ArrayList<Video> listaVideo) {
		this.listaVideo = listaVideo;
	}

	public ArrayList<Utente> getListaUtenti() {
		return listaUtenti;
	}

	public void setListaUtenti(ArrayList<Utente> listaUtenti) {
		this.listaUtenti = listaUtenti;
	}
	
	
	

}
