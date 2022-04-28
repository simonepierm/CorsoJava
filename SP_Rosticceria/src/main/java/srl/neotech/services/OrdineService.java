package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.OrdineDAO;
import srl.neotech.model.Ordine;


@Service
public class OrdineService {

	@Autowired
		OrdineDAO ordineDao;
		
		public void addOrdine(Ordine ordine)  {
			
			ordineDao.addordine(ordine);
		}

	}


