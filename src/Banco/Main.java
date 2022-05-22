package Banco;

public class Main {


public static void main(String[] args) {

Banco primeiroBanco = new Banco();

primeiroBanco.setNome(" O primeiro banco");


Cliente vitor = new Cliente(" Vitor", primeiroBanco);

Conta cc = new ContaCorrente(vitor);

cc.depositar(10000);


Cliente emanuele = new Cliente(" Emanuele", primeiroBanco);

Conta poupanca = new ContaPoupanca(emanuele);


cc.imprimirExtrato();

poupanca.imprimirExtrato();


cc.transferir(1000, poupanca);


cc.imprimirExtrato();

poupanca.imprimirExtrato();

primeiroBanco.mostrarClientes();

Cliente bolt = new Cliente ("Bolt");

Conta ccj = new ContaCorrente(bolt);

ccj.imprimirExtrato();

bolt.setBanco(primeiroBanco);

primeiroBanco.mostrarClientes();


}


}