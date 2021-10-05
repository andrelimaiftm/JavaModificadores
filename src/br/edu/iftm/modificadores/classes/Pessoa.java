package br.edu.iftm.modificadores.classes;

import java.util.GregorianCalendar;

public class Pessoa{
    //public String nome;
    private String nome;
    private GregorianCalendar dataNascimento;
    //public final String author = "André Chaves Lima";
    public static String author = "André Chaves Lima";
    ///private int idade;
    //outro operador protected, será melhor explicado no capitulo de herança

    /**
     * Metodo responsavel por inicializar o objeto da Classe Pessoa
     * @param nome
     * @param dataNascimento
     */
    public Pessoa(String nome, GregorianCalendar dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    /*public String mostrarNome(){
        return this.nome;
    }*/

    /**
     * Método responsavel por realizar o calcula da idade em tempo de execução.
     * @return valor da idade corrente do objeto pessoa
     */
    private int calculaIdade(){
        GregorianCalendar datahoje = new GregorianCalendar();
        int anoAtual = datahoje.get(GregorianCalendar.YEAR);              
        int anoNasc = dataNascimento.get(GregorianCalendar.YEAR);
        int idade = anoAtual - anoNasc;
        return idade; 
    }

    /**
     * Metodo responsavel por retornar o valor referente a idade do Objeto da classe Pessoa.
     * @return int que corresponde ao valor da idade
     */
    public int mostrarIdade(){        
        return this.calculaIdade();
    }

    //metodo get fica responsavel por buscar o valor do atributo
    public String getNome(){
        return this.nome;
    }

    //metodo set fica responsavel por atualizar o valor do atributo
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * @return GregorianCalendar return the dataNascimento
     */
    public GregorianCalendar getDataNascimento() {
        return this.dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(GregorianCalendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}