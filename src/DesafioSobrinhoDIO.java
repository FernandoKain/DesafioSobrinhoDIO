import java.util.Scanner;

public class DesafioSobrinhoDIO {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;

        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada
        int total = entrada * mesada;
        System.out.println("Voce tera " + total + " reais"); //Porém no bootcamp só exigia o total, sem as Strings

    }
}
