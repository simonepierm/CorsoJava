package srl.neotech.controllers;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import srl.neotech.requestresponse.ResponseBase;

public class ProdottoApiController {
	
	@ResponseBody
	@PostMapping(value = "/api/addProdotto",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addProdotto(@RequestBody RequestAddProdotto prodotto) {
		ResponseBase response=new ResponseBase();
		
		try {
		prodottoService.addProdotto(Request.getProdotto());
		}
		
		return response;
}
}