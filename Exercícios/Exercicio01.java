import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    
    Scanner A1 = new Scanner (System.in);     ///// 1
    System.out.println("Nome Completo: ");
    String NOMEF = A1.next();

    Scanner A2 = new Scanner (System.in);     ///// 2
    System.out.println("Horas trabalhadas: ");
    int HORAST = A2.nextInt();


    Scanner A3 = new Scanner (System.in);     //// 3
    System.out.println("Valor recebido por hora trabalhada: ");
    Double VALORH = A3.nextDouble();


    Scanner A4 = new Scanner (System.in);     //// 4
    System.out.println("Filhos com idade abaixo de 14: ");
    int FILHO14 = A4.nextInt();


    Scanner A5 = new Scanner (System.in);     //// 5
    System.out.println("Idade: ");
    int IDADE = A5.nextInt();


    Scanner A6 = new Scanner (System.in);     //// 6
    System.out.println("Tempo de serviço: ");
    int TEMPOS = A6.nextInt();


    Scanner A7 = new Scanner (System.in);     //// 7
    System.out.println("Salário familia por filho: ");
    int SALARIOF = A7.nextInt();


    NOMEF.close();
    HORAST.close();
    VALORH.close();
    FILHO14.close();
    IDADE.close();
    TEMPOS.close();
    SALARIOF.close();

    double SB = (VALORH*HORAST) * 4;
    double SBd = SB + 0.085
    double SF = FILHO14 * SALARIOF
    double impostoR = 0;
    double ADD = 0;

    if (FILHO14 >= 1){
        double SB = SB ++65
    }

    if (SB > 1500) {
        SB = SB + 0.15
    } if else (SB < 1500 or SB > 500){
        SB = SB + 0.08
    }
    if (IDADE >=40) {
        SB = SB + 0.02
   
   
    } if (TEMPOS > 15) {
        SB = SB + 0.15
    } if else (TEMPOS <= 15 && TEMPOS > 5 && IDADE > 30) {
        SB = SB + 0.015
    }
    }
    