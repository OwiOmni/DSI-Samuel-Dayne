import java.util.Scanner;

public class Condicao {
  public static void main(String[] args) {
    
    Scanner V1 = new Scanner (System.in);
    System.out.println("Escolha um numero: ");
    int N1 = V1.nextInt();
    V1.close();

    Scanner V2 = new Scanner (System.in);
    System.out.println("Escolha outro numero: ");
    int N2 = V2.nextInt();
    V2.close();

 
        if (N1 > N2) {
        System.out.println(V1 + "V1 é maior que V2"+ V2); 
    }   
    
         else  if (N1 == N2){
         System.out.println(V1 + "V1 é menor que V2" + V2);
    }   
         else {
        System.out.println("Os números são iguais: ");
    }
    }
    }

