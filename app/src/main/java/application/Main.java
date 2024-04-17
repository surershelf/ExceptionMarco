package application;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        int [] valores = new int [5];

        for (int cont = 0;cont < valores.length;cont++){
            try{
                System.out.print("Digite um número inteiro:");
                Scanner sc = new Scanner(System.in);
                valores[cont] =sc.nextInt();
            } catch(InputMismatchException ex){
                System.out.println("Tipo Inválido");
                cont--;
            }
            
        }
        System.out.println("Valores: ");
        for (int val:valores){
            System.out.println(val + " ");
        
        }
    }
}

