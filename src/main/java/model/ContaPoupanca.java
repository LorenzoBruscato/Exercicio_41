/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lorenzo
 */
public class ContaPoupanca extends Conta {

    private double saldo;
    private double juros;

    public ContaPoupanca() {
        super("");
        this.saldo = 0.0;
        this.juros = 0.0;
    }

    public ContaPoupanca(double saldo, double juros, String nome) {
        super(nome);
        this.saldo = saldo;
        this.juros = juros;
    }

    @Override
    public double getSaldo() {
        return saldo - (saldo * juros / 100);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public void setDeposito(double deposito) {
        this.saldo = this.saldo + deposito;
    }
}
