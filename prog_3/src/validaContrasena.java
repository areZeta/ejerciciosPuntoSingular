
import java.util.Scanner;
public class validaContrasena {
    public static boolean validarMayus(char[] pass){
        //al menos 2 letras MAYUSCULAS
        int i = 0, cont = 0;
        boolean val = false;
        while( i < pass.length && cont < 3){
            if(pass[i] > 64 && pass[i] < 91){
                cont++;
            }
            i++;
        }
        if(cont < 2) System.out.println("Error la contraseña debe tener al menos dos mayusculas");
        else val =true;
        return val;
    }
    public static boolean validarNumeros(char[] pass){
        //al menos 3 numeros no repetidos
        int i = 0, j = 0, cont = 0;
        boolean val = false;
        boolean repetido = false;
        char[] repetidos = new char[pass.length];
        while( i < pass.length && cont < 3){
            if(pass[i] > 47 && pass[i] < 58){
                int k = 0;
                while( k < repetidos.length){
                    //System.out.println(pass[i]+" rep: "+repetidos[k]);
                    if(pass[i] == repetidos[k]){
                        repetido=true;
                        System.out.println("Error la contraseña no puede contener numeros repetidos");
                    }
                    else repetido = false;
                    k++;
                }
                repetidos[j] = pass[i];
                cont++;

            }
            i++;
        }
        if(cont < 3) System.out.println("Error la contraseña debe contener al menos 3 numeros"); 
        else if(!repetido && cont >= 3) val= true;
        else val = false;
        return val;
    }

    public static boolean validarCaracter(char[] pass){
        boolean val = false;
        boolean blanco = false;
        int cont =0, i = 0;
        while( i < pass.length && cont < 1){
            if(pass[i] == '*' || 
            pass[i] == '-' || 
            pass[i] == '_' || 
            pass[i] == '¿' || 
            pass[i] == '?' ||
            pass[i] == '¡' ||
            pass[i] == '#' ||
            pass[i] == '$') {
                cont++;
                val = true;
            }
            //validar espacio en blanco
            if(pass[i] == ' '){
                blanco = true;
                System.out.println("Error la contraseña no debe contener espacios en blanco");
            }
            i++;
        }
        if(cont == 0) System.out.println("Error la contraseña debe contener al menos un caracter especial (* _ - ¿ ¡ ? # $)");
        if(blanco && val) val =false;
        return val;
    }

    public static boolean validarTamano(char[] pass){
        boolean val = false;
        if(pass.length >= 8 &&  pass.length <= 15){
            val = true;
        }else System.out.println("Error la contraseña debe contener entre 8 y 15 caracteres");
        return val;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String word = sc.nextLine();
        char[] pass = word.toCharArray();
         
        boolean mayus = validarMayus(pass);
        boolean num = validarNumeros(pass);
        boolean carac =  validarCaracter(pass);
        boolean tam =  validarTamano(pass);
        if(mayus && num && carac && tam) System.out.println("Contraseña valida");

    }
}
