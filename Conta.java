public class Conta {


        private String nome;
        private int nroConta;
        private double saldo = 5000.00;

        public Conta() {
        }

        public String GetNome() {
            return nome;
        }

        public String SetNome(String nome) {

            if(nome.length() <= 3) {
                return this.nome = "Padrão";
            }else {
                return this.nome = nome;
            }

        }

        public int getNroConta() {
            return nroConta;
        }

        public void setNroConta(int nroConta) {
            this.nroConta = nroConta;
        }

        public double getSaldo() {
            return saldo;
        }

        public void Sacar(double valor) {
            saldo = saldo - valor;
        }

        public void Depositar(double valor) {
            saldo = saldo + valor;
        }


    }

