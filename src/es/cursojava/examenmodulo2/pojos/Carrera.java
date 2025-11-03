package es.cursojava.examenmodulo2.pojos;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
	 private String nombre;
	 private double distanciaObjetivo;
	 private List<Caballo> caballosParticipantes; 
	 private List<Apuesta> apuestas;
	 
	 public Carrera(String nombre, double distanciaObjetivo, List<Caballo> caballosParticipantes) {
		super();
		this.nombre = nombre;
		this.distanciaObjetivo = distanciaObjetivo;
		this.caballosParticipantes = caballosParticipantes;
		this.apuestas = new ArrayList<>();
	 }
	 

	 public Carrera(String nombre, double distanciaObjetivo) {
		super();
		this.nombre = nombre;
		this.distanciaObjetivo = distanciaObjetivo;
		this.caballosParticipantes = new ArrayList<>();
		this.apuestas = new ArrayList<>();
	 }


	 public String getNombre() {
		 return nombre;
	 }


	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }


	 public double getDistanciaObjetivo() {
		 return distanciaObjetivo;
	 }


	 public void setDistanciaObjetivo(double distanciaObjetivo) {
		 this.distanciaObjetivo = distanciaObjetivo;
	 }


	 public List<Caballo> getCaballosParticipantes() {
		 return caballosParticipantes;
	 }


	 public void setCaballosParticipantes(List<Caballo> caballosParticipantes) {
		 this.caballosParticipantes = caballosParticipantes;
	 }


	 public List<Apuesta> getApuestas() {
		 return apuestas;
	 }


	 public void setApuestas(List<Apuesta> apuestas) {
		 this.apuestas = apuestas;
	 }

	 public void addCaballo (Caballo caballo) {
		 this.caballosParticipantes.add(caballo);
	 }
	 
	 public void addApuesta (Apuesta apuesta) {
		 this.apuestas.add(apuesta);
	 }

	 @Override
	 public String toString() {
		return "Carrera [nombre=" + nombre + ", distanciaObjetivo=" + distanciaObjetivo + ", caballosParticipantes="
				+ caballosParticipantes + ", apuestas=" + apuestas + "]";
	 }
	 
	 
	 


}
