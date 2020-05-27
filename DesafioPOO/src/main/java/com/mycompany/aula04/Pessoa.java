package com.mycompany.aula04;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
public abstract class Pessoa implements I_Pessoa {
public static ArrayList<Pessoa> DataBase = new ArrayList<>();
    protected String nome;
    protected String email;
    protected String idade;

    public Pessoa() {

    }

    public Pessoa(String nome, String email, String idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
     
}
