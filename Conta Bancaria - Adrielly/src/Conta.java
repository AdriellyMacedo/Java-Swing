
import java.util.List;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrielly.7257
 */
public class Conta {
    
    private Cliente cliente;
    private String numeroConta;
    private double saldo;
    private double limite;
    private ArrayList<String> extrato;

    public Conta(Cliente cliente, String numeroConta, double limite) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.limite = limite;
        this.extrato = new ArrayList<>();
    }
    
    public Conta() {

    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato.add("Depósito: R$ " + valor);
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            extrato.add("Saque: R$ " + valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }
    
}
