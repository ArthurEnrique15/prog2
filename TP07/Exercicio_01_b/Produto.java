package Exercicio_01_b;

import java.util.Objects;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "Id: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Preco: " + preco + "\n";
    }

    @Override
    public boolean equals(Object o) {
        Produto p = (Produto) o;
        if (this.id == p.getId())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
