package ejercicio01;

import java.util.ArrayList;

import javax.swing.text.Position;

public class Grupo {
	
	private String nombre;
	private ArrayList<String> integrantes;
	
	
	public Grupo(String nombre) {
		// TODO Auto-generated constructor stub
		setNombre(nombre);
		this.integrantes = new ArrayList<>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		String nombreAux = nombreIntegrante;
		String integranteBuscado = buscarIntegrante(nombreAux);
		
		if (integranteBuscado == null) {
			this.integrantes.add(nombreAux);
			
			System.out.println(nombreAux.toString()+" fue asignado al grupo "+getNombre());
	
		}
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		
		return this.integrantes.indexOf(nombreIntegrante);
	}
	
	public String obtenerIntegrante(int posicion) {
		String resultado = null;
		if (posicion >= 1) {
			
			resultado = this.integrantes.get(posicion);

		}
		return resultado;
	}
	
	public String buscarIntegrante(String nombre) {
		int pos = 0;
		int topeArray = this.integrantes.size();
		String resultado = null;
		
		while (resultado == null && pos < topeArray) {
			String nombreAux = this.integrantes.get(pos);
			if (nombreAux.equals(nombre)) {
				resultado = nombreAux;
			}else {
				pos++;
			}
		}
		
		return resultado;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		String resultado = null;
		int pos = obtenerPosicionIntegrante(nombreIntegrante);
		if (pos > 0) {
			resultado = this.integrantes.remove(pos);
		}
		
		return resultado;
		
	}
	
	private void mostrarIntegrantes() {
		int cantIntegrantes = this.integrantes.size();
		System.out.println("Cantidad de integrantes: "+cantIntegrantes);
		for (String string : integrantes) {
			System.out.println(string);
		}
		
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("Nombre grupo: "+getNombre());
		mostrarIntegrantes();
		
	}
	
	public void vaciar() {
		this.integrantes.clear();
	}
	
	
	
}
