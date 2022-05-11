import java.util.Scanner;

public class App {


     

        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);
            Conta conta = new Conta();


            double valor;

            System.out.println("Entre com o nome do titular da conta: ");
            String nome = leia.nextLine();
            conta.SetNome(nome);

            System.out.println("Entre com o numero da conta: ");
            int nroConta = leia.nextInt();
            conta.setNroConta(nroConta);
            System.out.println("Digite 1 para sacar, 2 para depositar: ");
            int opcao = leia.nextInt();
            switch (opcao) {
                case 1: {

                    System.out.println("Quer sacar quanto: ");
                    valor = leia.nextDouble();
                    conta.Sacar(valor);
                    break;
                }
                case 2:{
                    System.out.println("Quer depositar quanto: ");
                    valor = leia.nextDouble();
                    conta.Depositar(valor);
                    break;
                }
                default:
                    System.out.println("valor invalido!");
            }

            System.out.println("Nome do titular: " + conta.GetNome()
                    +"\nNumero conta: " + conta.getNroConta()
                    +"\nSaldo: " + conta.getSaldo());

            leia.close();
        }

    }

