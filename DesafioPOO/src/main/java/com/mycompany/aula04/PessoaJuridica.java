package com.mycompany.aula04;

import lombok.Data;

@Data
public class PessoaJuridica extends Pessoa implements I_Pessoa {

    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String email, String idade, String cnpj) {
        super();

        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() 
                + "\nCnpj: " + this.getCnpj();

    }

}
