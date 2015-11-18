

public class selectionSort {

	public static int[] fazerSelecao( int[] lista ){
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
	
	public static void main(String[] args) {
		
		int[] lista1={18,1,6,8,4,10,2,3,7};
		int[] lista2= fazerSelecao(lista1); 
		
		for(int i:lista2){
			 System.out.print(i);
	         System.out.print(", ");
	
		}
	}
}
