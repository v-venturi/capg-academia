import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The type Testa senha.
 * Obs: No desafio só pedia a saída da quantidade de caracteres pra completar a senha, mas como estavam presentes outros
 * parâmetros na descrição, fiz todas as validações.
 */
public class TestaSenha {
    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua senha");
        String senhaDigitada = scan.next();
        Pattern digito = Pattern.compile("[0-9]");
        Pattern maiuscula = Pattern.compile("[A-Z]");
        Pattern minuscula = Pattern.compile("[a-z]");
        Pattern caracterEspecial = Pattern.compile("[!@#$%¨&*()-+]");
        Matcher temMaiuscula = maiuscula.matcher(senhaDigitada);
        Matcher temMinuscula = minuscula.matcher(senhaDigitada);
        Matcher temDigito = digito.matcher(senhaDigitada);
        Matcher temCaracterEspecial = caracterEspecial.matcher(senhaDigitada);

        if (senhaDigitada.length() < 6) {
            int caracteresRestantes = 6 - senhaDigitada.length();
            System.out.println("Faltam " + caracteresRestantes + " caracteres");
        }
        else if (temMaiuscula.find() && temMinuscula.find() && temDigito.find() && temCaracterEspecial.find()){
            System.out.println("Senha cadastrada com sucesso!");
        }
        else
            System.out.println("A senha precisa conter mínúsculas, maiúsculas, números e caracteres especiais");
    }
}
