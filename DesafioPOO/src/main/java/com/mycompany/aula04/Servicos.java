package com.mycompany.aula04;

import static com.mycompany.aula04.I_Pessoa.nome;
import java.util.ArrayList;

public class Servicos {

    public static ArrayList<I_Pessoa> TabelaFisica = new ArrayList<I_Pessoa>();
    public static ArrayList<I_Pessoa> TabelaJuridica = new ArrayList<I_Pessoa>();
    private I_Pessoa pessoa;

    public Servicos() {

    }

    public Servicos(I_Pessoa iPessoa) {
        this.pessoa = iPessoa;

    }

    public ArrayList<I_Pessoa> Todos() {

        ArrayList lista = new ArrayList<I_Pessoa>();
        try {
            if (pessoa.getClass() == PessoaFisica.class) {
                lista.add(new PessoaFisica());
            } else {
                lista.add(new PessoaJuridica());

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public static void Salvar(I_Pessoa iPessoa) { //Adiciona uma pessoa fisica ou juridica

        try {
            if (iPessoa.getClass() == PessoaFisica.class) {
                Servicos.TabelaFisica.add((PessoaFisica) iPessoa);
                System.out.println("Pessoa fisica adicionada com sucesso!");
            } else if (iPessoa.getClass() == PessoaJuridica.class) {
                Servicos.TabelaJuridica.add((PessoaJuridica) iPessoa);
                System.out.println("Pessoa juridica adicionada com sucesso!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void DeletarUsuario(I_Pessoa iPessoa) { //deleta uma pessoa fisica ou juridica

        try {
            if (Servicos.TabelaFisica.contains(iPessoa)) {
                if (iPessoa.nome.equals(nome)) {
                    Servicos.TabelaFisica.remove(iPessoa);
                } else if (Servicos.TabelaJuridica.contains(iPessoa)) {
                    if (iPessoa.nome.equals(nome)) {
                        Servicos.TabelaJuridica.remove(iPessoa);
                    }
                } else {
                    System.out.println("Pessoa nao encontrada!");

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ArrayList<I_Pessoa> Buscar(I_Pessoa iPessoa) { //retorna todos os usuarios das tabelas
        try {

            if (iPessoa.getClass() == PessoaFisica.class) {
                return Servicos.TabelaFisica;
            } else if (iPessoa.getClass() == PessoaJuridica.class) {
                return Servicos.TabelaJuridica;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

//     static ArrayList<Pessoa> Todas() {
//        return Pessoa.DataBase;
//    }
//
//    public static void AdicionarUsuario(Pessoa obj) {
//        Pessoa.DataBase.add(obj);
//
//    }
//
//    }
}
