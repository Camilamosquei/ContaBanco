import java.util.Locale;
import java.util.Scanner;
 
public class    ContaTerminal {
    public static void main(String[] args) throws Exception {
       

        Scanner scanner = new Scanner (System.in).useLocale (Locale.US);



System.out.println("Bem-vindo ao Banco! Por favor, digite o número da agencia:");
String Agencia = scanner.next();
System.out.print ("Agora digite o numero da sua conta:");
        int NumeroConta = scanner.nextInt ();
        System.out.print ("nome:");
 String NomeCliente = scanner.next();
 System.out.print("Sobrenome:");
 String Sobrenome = scanner.next();
                double Saldo = 237.48;
 System.out.print ("Olá," + NomeCliente +  " " + Sobrenome + " obrigado por criar uma conta em nosso banco de dados, sua agencia é, " + Agencia +" de conta, " + NumeroConta + " e seu saldo " + Saldo + "já está disponivel");
 








    }
}
