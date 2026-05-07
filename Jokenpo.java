import java.util.Scanner;
import java.util.Random;
public class Jokenpo {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random ();   
        System.out.println("*Jo Ken Po!*");

        char p1, p2, jogar; //players
        int sorteio;
        String Player2 = "jkp";

        sorteio = gerador.nextInt(3);
        p2 = Player2.charAt(sorteio);
    
        /*Lógica e Aritmética*/
        do{
            System.out.println("Escolha: ");
            System.out.println("j-Pedra;\nk-Papel\np-Tesoura\nPlayer 1: ");
            p1 = teclado.next().charAt(0);
            System.out.println("Player2 jogou:" + p2);
        if(p1==p2)
            System.out.println("Deu empate");
        else if(p1=='j' && p2=='k'){
            System.out.println("Player 2 ganhou: Papel cobre Pedra");}

            else if(p1=='k' && p2=='j'){
            System.out.println("Player 1 ganhou: Papel cobre Pedra");}

                else if(p1=='j' && p2=='p'){
                System.out.println("Player 1 ganhou: Pedra quebra Tesoura");}

                    else if(p1=='p' && p2=='j'){
                    System.out.println("Player 2 ganhou: Pedra quebra Tesoura");}

                        else if(p1=='k' && p2=='p'){
                        System.out.println("Player 2 ganhou: Tesoura corta Papel");}

                            else if(p1=='p' && p2=='k'){
                            System.out.println("Player 1 ganhou: Tesoura corta Papel");}

                else System.out.println("Jogada indeterminada!");
                System.out.println("Deseja jogar novamente?");
                jogar = teclado.next().charAt(0);
            }while(jogar == 's');
    }
}
