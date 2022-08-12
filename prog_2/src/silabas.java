import java.util.Scanner;

public class silabas{

    public static char[] letter;
    public static char[] silaba= new char[100];
    public static char[] silaba2= new char[100];
    public static char[] silaba3= new char[100];
    public static char[] silaba4= new char[100];
    public static int aux;
    public static int i;

    public static void una_consonante(){
        silaba[0] = letter[0];
        int aux = 1;
        for(int  i =1;i < letter.length; i++){
            if(i ==letter.length-1 ){
                silaba[aux]=letter[i];
            }else{
                if((letter[i-1]=='a' || letter[i-1]=='e' || letter[i-1]=='i' || letter[i-1]=='o' || letter[i-1]=='u') && (letter[i+1]=='a' || letter[i+1]=='e' || letter[i+1]=='i' || letter[i+1]=='o' || letter[i+1]=='u')){
                    silaba[aux]='-';
                    silaba[aux+1]=letter[i];
                    silaba[aux+2]=letter[i+1];
                    aux=aux+3;
                    i++;
                }else{
                    silaba[aux] = letter[i];
                    aux++;
                }
            }
        }
        silaba[aux+1]='.';
    }
    
    public static void dos_consonantes(){
        //dos consonantes entre dos vocales
        silaba2[0] = silaba[0];
        i =1;
        aux = 1;
        while(i < silaba.length && silaba[i] != '.'){
            if( silaba2[i+1] == '.' ){
                silaba2[aux]=silaba[i];
            }else{
                //2 - dos consonantes entre 2 vocales
                if((silaba[i] > 96 && silaba[i] < 123 &&  silaba[i]!='a' &&  silaba[i]!='e' &&  silaba[i]!='i' &&  silaba[i]!='o' &&  silaba[i]!='u' ) &&
                (silaba[i+1] > 96 && silaba[i+1] < 123 &&  silaba[i+1]!='a' &&  silaba[i+1]!='e' &&  silaba[i+1]!='i' &&  silaba[i+1]!='o' &&  silaba[i+1]!='u' ) && 
                (silaba[i-1]=='a' || silaba[i-1]=='e' || silaba[i-1]=='i' || silaba[i-1]=='o' || silaba[i-1]=='u') && 
                (silaba[i+2]=='a' || silaba[i+2]=='e' || silaba[i+2]=='i' || silaba[i+2]=='o' || silaba[i+2]=='u')){
                    if(silaba[i] == 'p' && silaba[i+1] == 'r' || 
                    silaba[i] == 'p' && silaba[i+1] == 'l' || 
                    silaba[i] == 'b' && silaba[i+1] == 'r' || 
                    silaba[i] == 'b' && silaba[i+1] == 'l' ||
                    silaba[i] == 'f' && silaba[i+1] == 'r' ||
                    silaba[i] == 'f' && silaba[i+1] == 'l' ||
                    silaba[i] == 't' && silaba[i+1] == 'r' ||
                    silaba[i] == 't' && silaba[i+1] == 'l' ||
                    silaba[i] == 'd' && silaba[i+1] == 'r' ||
                    silaba[i] == 'd' && silaba[i+1] == 'l' ||
                    silaba[i] == 'c' && silaba[i+1] == 'r' ||
                    silaba[i] == 'c' && silaba[i+1] == 'l' ||
                    silaba[i] == 'g' && silaba[i+1] == 'r' ||
                    silaba[i] == 'g' && silaba[i+1] == 'l' ||
                    silaba[i] == 'c' && silaba[i+1] == 'h' ||
                    silaba[i] == 'l' && silaba[i+1] == 'l' ||
                    silaba[i] == 'r' && silaba[i+1] == 'r'){
                        silaba2[aux] = '-';
                        silaba2[aux+1]=silaba[i];
                        silaba2[aux+2]=silaba[i+1];
                        silaba2[aux+3]=silaba[i+2];
                    }else{    
                        silaba2[aux] = silaba[i];
                        silaba2[aux+1]='-';
                        silaba2[aux+2]=silaba[i+1];
                        silaba2[aux+3]=silaba[i+2];
                    }
                    aux=aux+4;
                    i=i+2;
                }else{
                    silaba2[aux] = silaba[i];
                    aux++;
                }
            }
            i++;
        }
        silaba2[aux+1] ='.';
    }

    public static void tres_consonantes(){
        silaba3[0] = silaba2[0];
        i =1;
        aux = 1;
        while(i < silaba2.length && silaba2[i] != '.'){
            if( silaba2[i+1] == '.' ){
                silaba3[aux]=silaba2[i];
            }else{
                //tres consonantes entre 2 vocales
                if((silaba2[i] > 96 && silaba2[i] < 123 &&  silaba2[i]!='a' &&  silaba2[i]!='e' &&  silaba2[i]!='i' &&  silaba2[i]!='o' &&  silaba2[i]!='u' ) &&
                (silaba2[i+1] > 96 && silaba2[i+1] < 123 &&  silaba2[i+1]!='a' &&  silaba2[i+1]!='e' &&  silaba2[i+1]!='i' &&  silaba2[i+1]!='o' &&  silaba2[i+1]!='u' ) && 
                (silaba2[i+2] > 96 && silaba2[i+2] < 123 &&  silaba2[i+2]!='a' &&  silaba2[i+2]!='e' &&  silaba2[i+2]!='i' &&  silaba2[i+2]!='o' &&  silaba2[i+2]!='u' ) && 
                (silaba2[i-1]=='a' || silaba2[i-1]=='e' || silaba2[i-1]=='i' || silaba2[i-1]=='o' || silaba2[i-1]=='u') && 
                (silaba2[i+3]=='a' || silaba2[i+3]=='e' || silaba2[i+3]=='i' || silaba2[i+3]=='o' || silaba2[i+3]=='u')){
                    if(silaba2[i+1] == 'p' && silaba2[i+2] == 'r' || 
                        silaba2[i+1] == 'p' && silaba2[i+2] == 'l' || 
                        silaba2[i+1] == 'b' && silaba2[i+2] == 'r' || 
                        silaba2[i+1] == 'b' && silaba2[i+2] == 'l' ||
                        silaba2[i+1] == 'f' && silaba2[i+2] == 'r' ||
                        silaba2[i+1] == 'f' && silaba2[i+2] == 'l' ||
                        silaba2[i+1] == 't' && silaba2[i+2] == 'r' ||
                        silaba2[i+1] == 't' && silaba2[i+2] == 'l' ||
                        silaba2[i+1] == 'd' && silaba2[i+2] == 'r' ||
                        silaba2[i+1] == 'd' && silaba2[i+2] == 'l' ||
                        silaba2[i+1] == 'c' && silaba2[i+2] == 'r' ||
                        silaba2[i+1] == 'c' && silaba2[i+2] == 'l' ||
                        silaba2[i+1] == 'g' && silaba2[i+2] == 'r' ||
                        silaba2[i+1] == 'g' && silaba2[i+2] == 'l' ||
                        silaba2[i+1] == 'c' && silaba2[i+2] == 'h' ||
                        silaba2[i+1] == silaba2[i+2]){
                            silaba3[aux]=silaba2[i];
                            silaba3[aux+1] = '-';
                            silaba3[aux+2]=silaba2[i+1];
                            silaba3[aux+3]=silaba2[i+2];
                            silaba3[aux+4]=silaba2[i+3];
                    }else{    
                        silaba3[aux] = silaba2[i];
                        silaba3[aux+1]=silaba2[i+1];
                        silaba3[aux+2]='-';
                        silaba3[aux+3]=silaba2[i+2];
                        silaba3[aux+4]=silaba2[i+3];
                    }
                    aux=aux+5;
                    i+=3;   
                }else{
                    silaba3[aux] = silaba2[i];
                    aux++;
                }
            }
            i++;
        }
        silaba3[aux+1] ='.';
        
    }

    
    public static void cuatro_consonantes( ){
        silaba4[0] = silaba3[0];
        i =1;
        aux = 1;
        while(i < silaba3.length && silaba3[i] != '.'){
            if( silaba3[i+1] == '.' ){
                silaba4[aux]=silaba3[i];
            }else{
                //cuatro consonantes entre 2 vocales
                if((silaba3[i] > 96 && silaba3[i] < 123 &&  silaba3[i]!='a' &&  silaba3[i]!='e' &&  silaba3[i]!='i' &&  silaba3[i]!='o' &&  silaba3[i]!='u' ) &&
                (silaba3[i+1] > 96 && silaba3[i+1] < 123 &&  silaba3[i+1]!='a' &&  silaba3[i+1]!='e' &&  silaba3[i+1]!='i' &&  silaba3[i+1]!='o' &&  silaba3[i+1]!='u' ) && 
                (silaba3[i+2] > 96 && silaba3[i+2] < 123 &&  silaba3[i+2]!='a' &&  silaba3[i+2]!='e' &&  silaba3[i+2]!='i' &&  silaba3[i+2]!='o' &&  silaba3[i+2]!='u' ) && 
                (silaba3[i+3] > 96 && silaba3[i+3] < 123 &&  silaba3[i+3]!='a' &&  silaba3[i+3]!='e' &&  silaba3[i+3]!='i' &&  silaba3[i+3]!='o' &&  silaba3[i+3]!='u' ) && 
                (silaba3[i-1]=='a' || silaba3[i-1]=='e' || silaba3[i-1]=='i' || silaba3[i-1]=='o' || silaba3[i-1]=='u') && 
                (silaba3[i+4]=='a' || silaba3[i+4]=='e' || silaba3[i+4]=='i' || silaba3[i+4]=='o' || silaba3[i+4]=='u')){
                    silaba4[aux] = silaba3[i];
                    silaba4[aux+1]=silaba3[i+1];
                    silaba4[aux+2]='-';
                    silaba4[aux+3]=silaba3[i+2];
                    silaba4[aux+4]=silaba3[i+3];
                    silaba4[aux+5]=silaba3[i+4];
                   // System.out.println("consonant -> "+ silaba2[aux]);
                    aux=aux+6;
                    i+=4;   
                }else{
                    silaba4[aux] = silaba3[i];
                    aux++;
                }
            }
            i++;
        }
        

    }
    
    public static void imprimir(){
        System.out.print("Palabra separada en silabas:  [");
        for(int k = 0; k < silaba4.length ; k++) {
            System.out.print(silaba4[k]);
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String word = sc.nextLine();
        letter = word.toCharArray();
        
        una_consonante();
        dos_consonantes();
        tres_consonantes();
        cuatro_consonantes();
        imprimir();
    }

    
}