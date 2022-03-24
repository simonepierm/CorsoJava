package srl.neotech.academy;

public class Cisterna {
	
	private Integer threshold;
	private Integer evapXDay;
	private Integer content;
	private Tipologiac tipologia;
	
	public Integer getThreshold() {
		return threshold;
	}
	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}
	public Integer getEvapXDay() {
		return evapXDay;
	}
	public void setEvapXDay(Integer evapXDay) {
		this.evapXDay = evapXDay;
	}
	public Integer getContent() {
		return content;
	}
	public void setContent(Integer content) {
		this.content = content;
	}
	public Tipologiac getTipologiac() {
		return tipologia;
	}
	public void setTipologia(Tipologiac tipologia) {
		this.tipologia = tipologia;
	}
	
	@Override
	public String toString() {
		return this.getTipologiac()+"--"+this.getContent()+"--"+this.getEvapXDay()+"--"+this.getThreshold();
		
	}
	
	
	 
	
	
	

}
