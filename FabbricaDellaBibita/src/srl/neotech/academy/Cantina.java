package srl.neotech.academy;

import java.util.ArrayList;

public class Cantina {

	private ArrayList<Cisterna> cisterne=new ArrayList<Cisterna>();
	
	public ArrayList<Cisterna> getCisterne() {
		return cisterne;
	}

	public void setCisterne(ArrayList<Cisterna> cisterne) {
		this.cisterne = cisterne;
	}

	public Cantina() {
		 cisterne=new ArrayList<Cisterna>();	 
	}
}
