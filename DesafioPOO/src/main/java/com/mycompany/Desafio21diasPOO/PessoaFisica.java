package com.mycompany.Desafio21diasPOO;

import lombok.Data;

@Data

public class PessoaFisica extends Pessoa implements I_Pessoa {

    private String cpf;

    public PessoaFisica() {
      
    }

    public PessoaFisica(String nome, String email, String idade, String cpf) {
        super();        
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return 
                "Nome: " + this.getNome() +
                "\nCpf: " + this.getCpf();
        
    }


}
