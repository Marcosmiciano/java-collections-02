package br.fai.projeto2;

import java.util.HashMap;
import java.util.Map;;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private Map<String, String> mapa = new HashMap<String, String>();

	private void start() {
		AdicionarItensNoMapa();
		ExibirValorDoMapaPelaChave("SRS");
		iterarMapa();
	}

	private void AdicionarItensNoMapa() {
		try {
			mapa.put("SRS", "Santa Rita Do Sapucaí");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajuba");
			mapa.put("ZORO", "Conceição dos ouros");
			mapa.put("CAXU", "Cachoeira de Minas");

			System.out.println("Cheguei no fim do try");
		} catch (Exception e) {
			System.out.println("Erro : " + e);
		} finally {
			System.out.println("Cheguei no finally");
		}

	}

	private void ExibirValorDoMapaPelaChave(String chave) {
		String valorDoItemDoMapa = mapa.get(chave);
		if (valorDoItemDoMapa == null || valorDoItemDoMapa.isEmpty()) {
			System.out.println("Esta chave não esta no mapa " + chave);
		} else {
			System.out.println("O valor dessa chave eh: " + mapa.get(chave));
			System.out.println("----------------");
		}
	}

	private void iterarMapa() {
		for (String chave : mapa.keySet()) {

			System.out.println("Chave: " + chave + "| Valor: " + mapa.get(chave));
		}
	}

}
