import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Desafio: Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
 *
 * The type Contador de anagramas.
 */
public class ContadorDeAnagramas {

    /**
     * Conta pares anagramas.
     *
     * @param texto the texto
     */
    public static void contaParesAnagramas(String texto) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < texto.length(); i++) {
            for (int j = i; j < texto.length(); j++) {
                char[] aux = texto.substring(i, j + 1).toCharArray();
                Arrays.sort(aux);
                String str = new String(aux);
                if (map.containsKey(str))
                    map.put(str, map.get(str) + 1);
                else
                    map.put(str, 1);
            }
        }
        int paresDeAnagrama = 0;
        for (String key : map.keySet()) {
            int n = map.get(key);
            paresDeAnagrama += (n * (n - 1)) / 2;
        }
        System.out.println(paresDeAnagrama);
//        System.out.println(map); // testando a saída/contagem
    }
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite o texto");
        Scanner scan = new Scanner(System.in);
        String textoDigitado = scan.next();
        contaParesAnagramas(textoDigitado);
    }
    /* Obs: No primeiro exemplo  passado na questão 3 do Desafio (palavra "ovo") acredito que a saída esteja errada ("3")
     ou talvez eu não tenha entendido direito a questão, já que os pares de anagramas são [o, o] e [ov, vo],
     a saída correta não seria "2"?  */
}
