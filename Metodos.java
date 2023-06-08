//COSAS IMPORTANTES!!

//Declarar constantes  para el arreglo

//Arreglo con una longitud de 20 caracteres o numeros
public static final int MAX = 20;

//el valor maximo que puede tomar el arreglo
public static final int MAX_VALOR = 9;

//el valor minimo que puede tomar el arreglo
public static final int MIN_VALOR = 1;

//probabilidad  de numeros en el arreglo
public static final double probabilidad_numero = 0.4;



//Declarar arreglo aleoatorio

int [] arrenteros = new int [MAX];

// arreglo ya hardcodeado
int arrenteros [] = {5, 6 ,18 ,2 ,4 ,9 ,7 ,1 ,10, 0};










//METODOS IMPORTANTES (para mi)

public static int obtener_inicio_secuencias(int []arr, int pos){
    while((pos<MAX)&&(arr[pos]==0)){
        pos++;
    }
    return pos;
}

public static int obtener_fin_secuencias(int []arr, int pos){
    while((pos<MAX)&&(arr[pos]!=0)){
        pos++;
    }
    return pos - 1;
}

public static void corrimiento_derecha(int [] arr){
    for (int i = MAX-1; i > 0; i--){
        arr[i] = arr[i-1];
    }
}

public static void corrimiento_derecha(int[] arr, int pos) {
    int i = MAX - 1;
    while (pos <= i) {
        arr[i] = arr[i - 1];
        i--;
    }
}


public static void corrimiento_izquierda(int[] arr, int pos) {
    while (pos < MAX - 1) {
        arr[pos] = arr[pos + 1];
        pos++;
    }
}


public static int obtener_numero_usuario (int []arr) {
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    int numero = 0;

    try {

        System.out.println("Ingrese el tamaño de una secuencia, 0 y 19 inclusive");
        numero = Integer.valueOf(entrada.readLine());
        
    } catch (Exception exc) {
        System.out.println(exc);
    }

    return numero;
}

public static void invertirArr (char [] arr) {
    char aux;
    for(int pos=0; pos<MAX/2; pos++){
        aux = arr[pos];
        arr[pos] = arr[MAX-1-pos];
        arr[MAX-1-pos] = aux;
    }

}


public static int numeroParesArr(int[] arr) {
    int contador = 0;

    for (int pos = 0; pos < MAX; pos++ ) {
        if (arr[pos] % 2==0) {
        contador++;
      }
    }

    return contador;

}



public static void eliminar_todas_ocurrencias (int [] arr, int numero)  {

    int pos = 0;

    while (pos < MAX_VALOR) {
        if (numero == arr[pos]) {
            corr_izq_usuario(arr, pos);
        }
        pos++;
    }
}



public static void eliminar_valores_pares(int[] arr) {
    int pos = 0;
   while (pos < MAX) {
       if (arr[pos] % 2 == 0) {
           corr_izq(arr, pos);
          arr[pos] = MAX--; // achica el arreglo
       } else {
           pos++; // si no es divisible por 2 , avanza otra pos
       }
   }


public static int sumatoria_secuencias(int[] arr, int inicio, int fin) {
    int suma = 0;
    for (int i = inicio; i <= fin; i++) {
        suma += arr[i];
    }
     return suma;
    }


public static void eliminar_secuencia(int[] arr, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            arr[i] = 0;
        }
    }

public static void Invertir_orden_ultima_secuencia (int [] arr, int inicio, int fin) {

        while(inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }

    }

    public static void eliminar_primer_ocurrencia (int [] arr, int numero)  {
        
        for(int pos = 0; pos < MAX; pos++) {
            if (numero == arr[pos]) {
                corr_izq_usuario(arr, pos);;
                break; //break para cortar el if , se podria hacer otra cosa como un else :}
            }
        }
       
    }

public static int numeroParesArr(int[] arr) {
        int contador = 0;

        for (int pos = 0; pos < MAX; pos++ ) {
            if (arr[pos] % 2==0) {
            contador++;
          }
        }

        return contador;

    }



public static void burbujeo(int[] arr){
        int temp;
        for(int i = 1;i < MAX;i++){
        for (int j = 0 ; j < MAX - 1; j++){
        if (arr[j] > arr[j+1]){
        temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        }
        }
        }
        }