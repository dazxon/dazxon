package ejercicio01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grupo grupo = new Grupo("Boca");
		
		grupo.agregarIntegrante("Agustin Donalisio");
		grupo.agregarIntegrante("Juancito Perez");
		
		System.out.println(comprobarIntegrante(grupo,"Agustin Donalisio"));
		System.out.println(comprobarIntegrante(grupo,"BOCA JUNIORS"));
		
		grupo.mostrar();
		
		System.out.println("Integrante removido: "+grupo.removerIntegrante("Juancito Perez"));
		
		grupo.removerIntegrante("Juancito Perez");
		
		grupo.mostrar();
		
		grupo.vaciar();
		
		grupo.mostrar();
		
	}

	private static boolean comprobarIntegrante(Grupo grupo,String nombre) {
		boolean resultado = false;
		
		if (grupo.buscarIntegrante(nombre) != null) {
			resultado = true;
		}
		
		return resultado;
	}

}
