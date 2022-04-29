package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.OrdineService;

@RestController
public class OrdineApiController {
	
	@Autowired
	OrdineService ordineService;
	
	
	@ResponseBody
	@PostMapping(value = "/api/addOrdine",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addOrdine (@RequestBody RequestAddOrdine request) {
		
		
		ResponseBase response=new ResponseBase();
		
		ordineService.addOrdine(request.getOrdine());
		
				
		
		
		
		return response;
}
}
