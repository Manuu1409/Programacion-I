import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_5_actividad13_ejemplo2 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int[]arr;
		arr=new int [MAX];
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			cargar_arreglo_aleatorio_int(arr);
			insercionDecreciente(arr);
			imprimir_arreglo_int(arr);
			System.out.println("Ingrese un numero que quiera insertar en el arreglo");
			numero = Integer.valueOf(entrada.readLine());
			ingresar_ordenado_decreciente(arr, numero);
			imprimir_arreglo_int(arr);
		}
		catch(Exception Exc){
			System.out.println(Exc);
		}
	}
	public static void ingresar_ordenado_decreciente(int []arr, int numero){
		boolean insertado = false;
		int pos = 0;
		while((pos<MAX)&&(insertado == false)){   //Le pongo un flag para que frene si lo inserto.
			if(numero >=arr[pos]){
				corrimiento_derecha(arr,pos);
				arr[pos] = numero;					//No olvidar insertar.
				insertado = true;
			}
			pos++;
		}
	}
	
	public static void corrimiento_derecha(int[]arr,int pos){
		int indice = MAX-1;
		while(indice>pos){
			arr[indice] = arr[indice-1];
			indice--;
		}
	}
	
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}}

	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}

	public static void insercionDecreciente(int arr[]){
		for (int i = 1; i < MAX; i++) {
			int aux = arr[i];
			int j = i - 1;
			while ((j >= 0) && (arr[j] < aux)){ //Solo tengo que cambiar un menor por un mayor (diferencia con el insercion creciente).
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = aux;
		}
	}

}
