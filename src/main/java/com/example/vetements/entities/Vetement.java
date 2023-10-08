package com.example.vetements.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;



@Entity
public class Vetement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVetement;
	private String nomVetement;
	private Double prixVetement;
	private Date dateprod;
	
	@ManyToOne
	private Genre genre;
	
	
	public Vetement(String nomVetement, Double prixVetement, Date dateprod) {
		super();
		this.nomVetement = nomVetement;
		this.prixVetement = prixVetement;
		this.dateprod = dateprod;
	}
	public Vetement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdVetement() {
		return idVetement;
	}
	public void setIdVetement(Long idVetement) {
		this.idVetement = idVetement;
	}
	public String getNomVetement() {
		return nomVetement;
	}
	public void setNomVetement(String nomVetement) {
		this.nomVetement = nomVetement;
	}
	public Double getPrixVetement() {
		return prixVetement;
	}
	public void setPrixVetement(Double prixVetement) {
		this.prixVetement = prixVetement;
	}
	public Date getDateprod() {
		return dateprod;
	}
	public void setDateprod(Date dateprod) {
		this.dateprod = dateprod;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Vetement [idVetement=" + idVetement + ", nomVetement=" + nomVetement + ", prixVetement=" + prixVetement
				+ ", dateprod=" + dateprod + "]";
	}
	
	
	
	
	
	
}
