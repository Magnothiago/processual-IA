package estrutura.dados;

import java.util.LinkedList;

public class Grafo {
	
	protected LinkedList<Vertice> cidades;
	
	public Grafo() {
		this.cidades = new LinkedList<Vertice>();
	}
	
	public void adicioneRota(Vertice origem, Vertice destino, int custo) {
		origem.Arestas.add(new Aresta(destino, custo));
		destino.Arestas.add(new Aresta(origem, custo));
	}
	
	public void imprimaRotas() {
		for (Vertice vertice : cidades) {
			System.out.println("N� pai "+vertice.Nome);
			for (Aresta aresta : vertice.Arestas) {
				System.out.println("    N� filho: "+aresta.destino.Nome);
			}
		}
	}
}
