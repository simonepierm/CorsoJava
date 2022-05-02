package srl.neotech.model;

import java.time.LocalDate;

public class Video {
	   private String id;
	   private TipoStato stato;
	   private String titolo;
	   private TipoGenere genere;
	   private Integer durata;
	   private Integer pegi;
	   private LocalDate annoUscita;
	   private String sinossi;
	   private Double prezzoAcquistoGestore;
	   private Double prezzoNoleggioGiornaliero;
	   private Double prezzoVendita;
	   private Integer numeroNeoleggi;
	   private Integer copieDisponibili;
	   private String urlImmagine;
	   
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TipoStato getStato() {
		return stato;
	}
	public void setStato(TipoStato stato) {
		this.stato = stato;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public TipoGenere getGenere() {
		return genere;
	}
	public void setGenere(TipoGenere genere) {
		this.genere = genere;
	}
	public Integer getDurata() {
		return durata;
	}
	public void setDurata(Integer durata) {
		this.durata = durata;
	}
	public Integer getPegi() {
		return pegi;
	}
	public void setPegi(Integer pegi) {
		this.pegi = pegi;
	}
	public LocalDate getAnnoUscita() {
		return annoUscita;
	}
	public void setAnnoUscita(LocalDate annoUscita) {
		this.annoUscita = annoUscita;
	}
	public String getSinossi() {
		return sinossi;
	}
	public void setSinossi(String sinossi) {
		this.sinossi = sinossi;
	}
	public Double getPrezzoAcquistoGestore() {
		return prezzoAcquistoGestore;
	}
	public void setPrezzoAcquistoGestore(Double prezzoAcquistoGestore) {
		this.prezzoAcquistoGestore = prezzoAcquistoGestore;
	}
	public Double getPrezzoNoleggioGiornaliero() {
		return prezzoNoleggioGiornaliero;
	}
	public void setPrezzoNoleggioGiornaliero(Double prezzoNoleggioGiornaliero) {
		this.prezzoNoleggioGiornaliero = prezzoNoleggioGiornaliero;
	}
	public Double getPrezzoVendita() {
		return prezzoVendita;
	}
	public void setPrezzoVendita(Double prezzoVendita) {
		this.prezzoVendita = prezzoVendita;
	}
	public Integer getNumeroNeoleggi() {
		return numeroNeoleggi;
	}
	public void setNumeroNeoleggi(Integer numeroNeoleggi) {
		this.numeroNeoleggi = numeroNeoleggi;
	}
	public Integer getCopieDisponibili() {
		return copieDisponibili;
	}
	public void setCopieDisponibili(Integer copieDisponibili) {
		this.copieDisponibili = copieDisponibili;
	}
	public String getUrlImmagine() {
		return urlImmagine;
	}
	public void setUrlImmagine(String urlImmagine) {
		this.urlImmagine = urlImmagine;
	}

	   
	   
	   
}
