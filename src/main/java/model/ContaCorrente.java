/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lorenzo
 */
public class ContaCorrente extends Conta {

    private Double saldo;
    private Double taxadeservico;

    public ContaCorrente() {
        super("");
        this.saldo = 0.0;
        this.taxadeservico = 0.0;
    }

    public ContaCorrente(Double saldo, Double taxadeservico, String nome) {
        super(nome);
        this.saldo = saldo;
        this.taxadeservico = taxadeservico;
    }

    @Override
    public double getSaldo() {
        return saldo - (saldo * taxadeservico / 100);
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getTaxadeservico() {
        return taxadeservico;
    }

    public void setTaxadeservico(Double taxadeservico) {
        this.taxadeservico = taxadeservico;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setDeposito(double deposito) {
        this.saldo = this.saldo + deposito;
    }
}
