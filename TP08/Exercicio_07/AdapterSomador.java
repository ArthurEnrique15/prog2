package Exercicio_07;

import java.util.ArrayList;
import java.util.List;

public class AdapterSomador implements SomadorEsperado {
	private SomadorExistente somadorExistente;

	public AdapterSomador() {
		this.somadorExistente = new SomadorExistente();
	}

	public int somaVetor(int[] vetor) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < vetor.length; i++) list.add(vetor[i]);

		return somadorExistente.somaLista(list);
	}
}
