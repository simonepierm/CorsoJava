package srl.neotech.model;

import java.util.ArrayList;

public class DatiRosticceria {

	private static DatiRosticceria instance;
	private ArrayList<Ordine> ordini=new ArrayList<Ordine>();
	private ArrayList<Prodotto> prodotto=new ArrayList<Prodotto>();
	
	private DatiRosticceria() {
		
	}
		
		public static DatiRosticceria getInstance () {
			if(instance==null) instance=new DatiRosticceria();
			return instance;
		}

		public ArrayList<Ordine> getOrdini() {
			return ordini;
		}

		public void setOrdini(ArrayList<Ordine> ordini) {
			this.ordini = ordini;
		}

		public ArrayList<Prodotto> getProdotto() {
			return prodotto;
		}

		public void setProdotto(ArrayList<Prodotto> prodotto) {
			this.prodotto = prodotto;
		}

		public static void setInstance(DatiRosticceria instance) {
			DatiRosticceria.instance = instance;
		}
}
