package org.example;

import java.util.Arrays;

public class Heroi {
    // Atributos
    private int id;
    private String nome;
    private int nivel;
    private String poderPrincipal;
    private int pontosVida;
    private int pontosMana;
    private double forca;
    private int destreza;
    private int inteligencia;
    private int resistenciaFogo;
    private int resistenciaGelo;
    private int resistenciaEletricidade;
    private String[] habilidadesEspeciais;
    private String[] inventario;
    private String[] aliados;

    public Heroi(int id, String nome, int nivel, String poderPrincipal, int pontosVida, int pontosMana, double forca, int destreza, int inteligencia, int resistenciaFogo, int resistenciaGelo, int resistenciaEletricidade, String[] habilidadesEspeciais, String[] inventario, String[] aliados) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.poderPrincipal = poderPrincipal;
        this.pontosVida = pontosVida;
        this.pontosMana = pontosMana;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.resistenciaFogo = resistenciaFogo;
        this.resistenciaGelo = resistenciaGelo;
        this.resistenciaEletricidade = resistenciaEletricidade;
        this.habilidadesEspeciais = habilidadesEspeciais;
        this.inventario = inventario;
        this.aliados = aliados;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPoderPrincipal() {
        return poderPrincipal;
    }

    public void setPoderPrincipal(String poderPrincipal) {
        this.poderPrincipal = poderPrincipal;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(int pontosMana) {
        this.pontosMana = pontosMana;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getResistenciaFogo() {
        return resistenciaFogo;
    }

    public void setResistenciaFogo(int resistenciaFogo) {
        this.resistenciaFogo = resistenciaFogo;
    }

    public int getResistenciaGelo() {
        return resistenciaGelo;
    }

    public void setResistenciaGelo(int resistenciaGelo) {
        this.resistenciaGelo = resistenciaGelo;
    }

    public int getResistenciaEletricidade() {
        return resistenciaEletricidade;
    }

    public void setResistenciaEletricidade(int resistenciaEletricidade) {
        this.resistenciaEletricidade = resistenciaEletricidade;
    }

    public String[] getHabilidadesEspeciais() {
        return habilidadesEspeciais;
    }

    public void setHabilidadesEspeciais(String[] habilidadesEspeciais) {
        this.habilidadesEspeciais = habilidadesEspeciais;
    }

    public String[] getInventario() {
        return inventario;
    }

    public void setInventario(String[] inventario) {
        this.inventario = inventario;
    }

    public String[] getAliados() {
        return aliados;
    }

    public void setAliados(String[] aliados) {
        this.aliados = aliados;
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", poderPrincipal='" + poderPrincipal + '\'' +
                ", pontosVida=" + pontosVida +
                ", pontosMana=" + pontosMana +
                ", forca=" + forca +
                ", destreza=" + destreza +
                ", inteligencia=" + inteligencia +
                ", resistenciaFogo=" + resistenciaFogo +
                ", resistenciaGelo=" + resistenciaGelo +
                ", resistenciaEletricidade=" + resistenciaEletricidade +
                ", habilidadesEspeciais=" + Arrays.toString(habilidadesEspeciais) +
                ", inventario=" + Arrays.toString(inventario) +
                ", aliados=" + Arrays.toString(aliados) +
                '}';
    }
}
