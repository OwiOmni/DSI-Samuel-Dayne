import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Insira seu email: ");
        String email = scan.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = scan.nextInt();

        Usuario01 usuario = new Usuario01(nome, email, idade);

        usuario.exibirInfo();

        scan.close();
    }
}

class Usuario01 {
    private String nome01;
    private String email01;
    private int idade01;

    public Usuario01(String nome01, String email01, int idade01) {
        this.nome01 = nome01;
        this.email01 = email01;
        this.idade01 = idade01;
    }

    public String getNome01() {
        return nome01;
    }

    public void setNome01(String nome01) {
        this.nome01 = nome01;
    }

    public String getEmail01() {
        return email01;
    }

    public void setEmail01(String email01) {
        this.email01 = email01;
    }

    public int getIdade01() {
        return idade01;
    }

    public void setIdade01(int idade01) {
        this.idade01 = idade01;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + getNome01());
        System.out.println("Email: " + getEmail01());
        System.out.println("Idade: " + getIdade01());
    }
}