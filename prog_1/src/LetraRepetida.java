
import java.util.Scanner;

public class LetraRepetida{
    public static char[] letter;
    public static char[] orderWord;
    public static char[] repetidas;
    public static int count,ban =0,j;
    public static String word;

    public static void repeticionLetras(){
        System.out.print(word+" ->  [ ");
        for(int i = 0; i < letter.length; i++){
            ban = 0;
            j=0;
            while(j < repetidas.length){ // enciende una bandera en caso de que ya se haya contado esa letra
               if(letter[i] == repetidas[j]) ban = 1; 
               j++;
            } 
            if(ban== 0){
                count = 0;
                for(int a= i; a < letter.length; a++ ){
                    if(letter[i] == letter[a]){
                        count++;
                    }
                }
                System.out.print(letter[i]+" -> "+count+", ");
                repetidas[i]  = letter[i];
              
            }
            
        }
        System.out.print(" ]  ");
    }

    public static void ordenarAlfabeticamente(){
        for (int i = word.length() - 1; i > 0; i--) {
			for (int k = 0; k < i; k++) {
				if (letter[i] < letter[k]) {
					char a = letter[i];
                    orderWord[i] =  letter[k];
                    orderWord[k] = a;
				}
			}
		}
        System.out.print("[");
        for (int k = 0; k < orderWord.length; k++) {
            System.out.print(orderWord[k]);
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        word = sc.nextLine();
        letter = word.toCharArray();
        orderWord = letter;
        repetidas=new char[letter.length];

        // contar cuantas veces aparece cada letra 
        repeticionLetras();

        //ordenar alfabeticamente
        ordenarAlfabeticamente();
        
    }
}

