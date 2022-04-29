package srl.neotech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.ProdottoDao;
import srl.neotech.model.Prodotto;

@Service
public class ProdottoService {
	
	@Autowired
	ProdottoDao prodottoDao;
	
	public void addProdotto(Prodotto prodotto)  {
		
		prodottoDao.addProdotto(prodotto);
	}

	public ArrayList<Prodotto> getListaProdotti() {
		
		
	}
	
}
