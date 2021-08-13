package Exercicio_03_b;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario implements Comparable<Funcionario> {
    private int id;
    private String nome;
    private double salario;
    private Date dataContratacao;

    public Funcionario(int id, String nome, double salario, Date dataContratacao) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Id = " + id + "\n" +
               "Nome = " + nome + "\n" +
               "Salário = R$" + salario + "\n" +
               "Data de contratação = " + dateFormat.format(dataContratacao) + "\n";
    }

    @Override
    public int compareTo(Funcionario f) {
        if (this.salario < f.salario)
            return -1;
        else if (this.salario > f.salario)
            return 1;
        else
            return 0;
    }
}
