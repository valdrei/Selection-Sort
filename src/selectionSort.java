

public class selectionSort {

	public static int[] fazerSelecao( int[] lista ){
		
		//Laço responsavel pela comparação entre os numeros
		for (int i = 0; i < lista.length - 1; i++)
        {
            int index = i;
            
            //for responsavel por percorrer todo vetor comparando um numero
            for (int j = i + 1; j < lista.length; j++)
            	//verifica se o um item do vetor é menor que o outro
                if (lista[j] < lista[index])
                    index = j;
            //Adiciona o valor do indice com menor valor a respectiva variavel
            int menorValor = lista[index]; 
            //Troca de posições
            lista[index] = lista[i];
            //Troca de posições
            lista[i] = menorValor;
            
        }

		return lista;
	}
	
	public static void main(String[] args) {
		
		//Inicia uma lista desordenada
		int[] lista1={18,1,6,8,4,10,2,3,7};
		//Recebe o vetor ordenado
		int[] lista2= fazerSelecao(lista1); 
		
		//Imprime o Vetor
		for(int i:lista2){
			 System.out.print(i);
	         System.out.print(", ");
	
		}
	}
	
}
