import java.util.Scanner;

public class SenhaAteAcertar {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Senha até acertar");

        String passe;


        do{
            System.out.println("Informe a palavra passe:");
            passe = teclado.next();
            System.out.println("Tamanho da palvra: " + passe.length());
            if(passe.length()<7)
            System.out.println("Faltaram letras");
            if(passe.length()>7)
            System.out.println("Sobraram letras");

            if(passe.equals("devjava")) 
            System.out.println("Bem vindo, devjava! Bora codar em JAVA!");
            else System.out.println("Tente outra vez");

        } while(!passe.equals("devjava")); 
    }
}
