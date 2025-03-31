import java.util.Scanner;

public class Exercicio02 {
public static void main(String[] args) {
    
    Scanner CodigoF = new Scanner (System.in);     ///// 1
    System.out.println("Digite seu código de funcionário: ");
    int CodigoF = CodigoF.nextInt();

    Scanner genero = new Scanner (System.in);     ///// 2
    System.out.println("Digite seu gênero, H para homem e M para mulher: ");
    string genero = genero.next();

    Scanner TempoE = new Scanner (System.in);     ///// 3
    System.out.println("Digite o tempo de trabalho na empresa (em anos): ");
    Int TempoE = TempoE.nextInt();

    Scanner Salario = new Scanner (System.in);     ///// 4
    System.out.println("Por último informe seu salário: ");
    double Salario = Salario.nextDouble();

    double BonusNatal;
    double BonusNatalM;
    double BonusNatalH;
    double BonusNormalH;
    double BonusNormalM;

                ////////bonus////////
    if (genero = H && TempoE >= 15) {
        BonusNatalH = Salario * 0.20;
    }  
    System.out.println("Seu bonus de natal é: " + BonusNatalH )

    if (genero = M && TempoE >= 10) {
        BonusNatal = Salario * 0.20;
    }  
    System.out.println("Seu bonus de natal: " + BonusNatalM)
                                                        
                ///////Normal///////

    if (genero = H && TempoE < 15) {
        BonusNatalH = Salario + 100;
    }     System.out.println("Seu bonus de natal é: " + BonusNormalH )

    if (genero = M && TempoE < 10) {
        BonusNormalM = Salario + 100;
    }  
    System.out.println("Seu bonus de natal: " + BonusNormalM)
        

}
    }
