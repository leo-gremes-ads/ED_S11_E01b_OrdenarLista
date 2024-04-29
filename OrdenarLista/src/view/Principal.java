package view;

import lib.model.Lista;

public class Principal
{
	public static void main(String[] args)
	{
		Lista<Integer> L = new Lista<>();
		
		//POPULAR LISTA
		popularLista(L);
		mostrarLista(L);
		
		//ORDENAR LISTA
		//BUBBLE SORT
		try {
			int tamanho = L.size();
			for (int i = 0; i < tamanho - 1; i++) {
				for (int j = i + 1; j < tamanho; j++) {
					int esq = L.get(i);
					int	dir = L.get(j);
					if (dir < esq) {
						L.remove(j);
						L.add(esq, j);
						L.remove(i);
						L.add(dir, i);
					}
				}
				mostrarLista(L);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		//MOSTRAR LISTA
		mostrarLista(L);
	}
	
	private static void popularLista(Lista<Integer> L)
	{
		L.addFirst(	6	);
		L.addFirst(	3	);
		L.addFirst(	7	);
		L.addFirst(	4	);
		L.addFirst(	2	);
		L.addFirst(	9	);
		L.addFirst(	1	);
		L.addFirst(	8	);
		L.addFirst(	5	);
		L.addFirst(	10	);
	}
	
	private static void mostrarLista(Lista<Integer> L)
	{
		try {
			int tamanho = L.size();
			for (int i = 0; i < tamanho; i++)
			{
				int num = L.get(0);
				L.remove(0);
				L.addLast(num);
				System.out.print(num + " -> ");
			}
			System.out.println("Fim!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
