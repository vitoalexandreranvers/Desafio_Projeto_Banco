package Banco;

import java.util.Objects;


public class Cliente {


public Banco banco;


private String nome;


public Cliente(String nome, Banco banco) {

this.nome = nome;

this.banco = banco;

this.banco.clientes.add(this);


}


public Cliente(String nome) {

this.nome = nome;

}


public String getNome() {

return nome;

}


public void setNome(String nome) {

this.nome = nome;


}

public void setBanco(Banco banco) {

this.banco = banco;

this.banco.clientes.add(this);

}


@Override

public String toString() {

return "Cliente [banco=" + banco.nome + ", nome=" + nome + "]";

}


}