package org.example;

public class Profissao {
    private double salario;
    private String cargo;
    private int idFuncionario;
    private String setor;
    private String beneficios;
    private int idSquad;

    public Profissao() {
    }

    public Profissao(double salario, String cargo, int idFuncionario, String setor, String beneficios, int idSquad) {
        this.salario = salario;
        this.cargo = cargo;
        this.idFuncionario = idFuncionario;
        this.setor = setor;
        this.beneficios = beneficios;
        this.idSquad = idSquad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public int getIdSquad() {
        return idSquad;
    }

    public void setIdSquad(int idSquad) {
        this.idSquad = idSquad;
    }
}
