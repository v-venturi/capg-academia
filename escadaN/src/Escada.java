import java.util.Scanner;

/**
 * The type Escada.
 * Desafio: gerar uma 'escada' de * com [n] caracteres, preenchendo espaços à esquerda para alinhar à direita.
 */
public class Escada {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base;
        StringBuilder escada = new StringBuilder("*");
        System.out.println("Digite a base da escada: ");
        base = scan.nextInt();
        while (base <= 0 ) {
            System.out.println("Base deve ser maior que 0, digite novamente");
            base = scan.nextInt();
        }
        System.out.println(espacosEsquerda(escada, base));
        for (int i = 0; i < base - 1; i++) {
            escada.append(escada.charAt(i));
            System.out.println(espacosEsquerda(escada, base));
        }
    }
    /**
     * Espacos esquerda string.
     * Método para alinhar a escada adicionando espaços à esquerda
     * @param sb the sb
     * @param n  the n
     * @return the string
     */
    public static String espacosEsquerda(StringBuilder sb, int n) {
        return String.format("%" + n + "s", sb);
    }
}




