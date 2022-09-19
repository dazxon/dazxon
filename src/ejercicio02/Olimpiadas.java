package ejercicio02;

import java.util.ArrayList;

public class Olimpiadas {

	private ArrayList<Atleta> atletas = new ArrayList<>();
	private ArrayList<Atleta> ganadores = new ArrayList<>();
	
	
	public void agregarAtleta(String nombre,double tiempo) {
		Atleta atleta = new Atleta(nombre,tiempo);
		this.atletas.add(atleta);
	}
	
	public void quienGano() {
		double aux = Integer.MAX_VALUE;
		
		for (Atleta atleta : atletas) {
			
			if (atleta.getTiempo() < aux) {
				this.ganadores.clear();
				aux = atleta.getTiempo();
				this.ganadores.add(atleta);
				
				
			}else if (atleta.getTiempo() == aux) {
				
				this.ganadores.add(atleta);
				
			}
			
		}
		
		System.out.println(this.ganadores);
	}
	
	
}
