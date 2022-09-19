package ejercicio03;

import java.util.ArrayList;


public class Olimpiadas {

	private ArrayList<Atleta> atletas = new ArrayList<>();
	private ArrayList<Atleta> primeros = new ArrayList<>();
	private ArrayList<Atleta> segundos = new ArrayList<>();
	private ArrayList<Atleta> terceros = new ArrayList<>();
	
	public void agregarAtleta(String nombre,double tiempo) {
		Atleta atleta = new Atleta(nombre,tiempo);
		this.atletas.add(atleta);
	}
	
	public void quienGano() {
		
		ArrayList<Atleta> arrayAux = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {

			double aux = Integer.MAX_VALUE;
			
				for (Atleta atleta : atletas) {
					
					if (atleta.getTiempo() < aux && !EstaEnTerna(atleta)) {
						
						arrayAux.clear();
						arrayAux.add(atleta);
						aux = atleta.getTiempo();
					}
					
					if (!arrayAux.contains(atleta)  && !EstaEnTerna(atleta) && atleta.getTiempo() == aux) {
						arrayAux.add(atleta);
					}
				}
				switch (i) {
					case 0:
						this.primeros.addAll(arrayAux);
						break;

					case 1:
						this.segundos.addAll(arrayAux);
						break;
						
					case 2:
						this.terceros.addAll(arrayAux);
						break;
				}
		}
		String mensaje = null;
		
		mensaje = "primero";
		
		if (this.primeros.size() > 1) {
			mensaje +="s";
		}
		System.out.println(mensaje);
		System.out.println(this.primeros);
		System.out.println();
		
		mensaje = "Segundo";
		
		if (this.segundos.size() > 1) {
			mensaje +="s";
		}
		System.out.println(mensaje);
		System.out.println(this.segundos);
		System.out.println();
		
		mensaje = "Tercero";
		
		if (this.terceros.size() > 1) {
			mensaje +="s";
		}
		System.out.println(mensaje);
		System.out.println(this.terceros);
		System.out.println();
	}
	private boolean EstaEnTerna(Atleta atleta) {
		
		boolean resultado = false;

			if (primeros.contains(atleta) || segundos.contains(atleta) || terceros.contains(atleta)) {
				resultado = true;
			}
		
		return resultado;
	}
	
}
