package srl.neotech.requestresponse;

public class ResponseBase {

	private Object simpleData;
	private String code;
	private String descr;
	private String ListaProdotti;
	
	

	
	public String getListaProdotti() {
		return ListaProdotti;
	}
	public void setListaProdotti(String listaProdotti) {
		ListaProdotti = listaProdotti;
	}
	public Object getSimpleData() {
		return simpleData;
	}
	public void setSimpleData(Object simpleData) {
		this.simpleData = simpleData;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	
}
