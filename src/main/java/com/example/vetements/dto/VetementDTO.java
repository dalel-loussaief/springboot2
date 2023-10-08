package com.example.vetements.dto;

import java.util.Date;

import com.example.vetements.entities.Genre;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VetementDTO {
	private Long idvetement;
	private String nomvetement;
	private Double prixvetement;
	private Date dateprod;
	private Genre genre;
	
	private String nom;


	
}
