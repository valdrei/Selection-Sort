

public class selectionSort {

	public int[] fazerSelecao( int[] lista ){
		for (int i = 0; i < lista.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < lista.length; j++)
                if (lista[j] < lista[index])
                    index = j;
      
            int menorValor = lista[index]; 
            lista[index] = lista[i];
            lista[i] = menorValor;
        }

		return lista;
	}
}
