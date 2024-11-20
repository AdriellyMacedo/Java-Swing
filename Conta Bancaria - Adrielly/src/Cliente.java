/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrielly.7257
 */
public class Cliente {
    
    private String nome;
    private Agencia agencia;

    public Cliente(String nome, Agencia agencia) {
        this.nome = nome;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public Agencia getAgencia() {
        return agencia;
    }
    
}
