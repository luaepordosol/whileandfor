import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Acesso por código");

        int senha;
    System.out.println("Abertura de porta eletrônica");
    
    do{
        System.out.println("Informe a senha");
        senha = teclado.nextInt();
        if (senha<1000 || senha>9999){
            System.out.println("Não liberada, use 4 dígitos");}
        if (senha>9999){
            System.out.println("Não liberada, use menos de 5 dígitos");}
        if (senha == 1001 || senha == 2000 || senha == 4321){
            System.out.println("Acertou");}
        else {System.out.println("Senha incorreta, insira novamente");}
        } while (senha != 1001 && senha !=2000 && senha != 4321);
    }
}
