package com.mycompany.Desafio21diasPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PessoaFisica fisica = new PessoaFisica();
        PessoaJuridica juridica = new PessoaJuridica();
        boolean quit = false;

        do {
            System.out.println(
                    "\n\n==================MENU===================\n"
                    + "Digite opcao : \n"
                    + "1 - Adicionar Pessoa\n"
                    + "2 - Remover Pessoa\n"
                    + "3 - Visualizar Pessoas Cadastradas\n"
                    + "=====================================\n"
                    + "4 - Adicionar Empresa\n"
                    + "5 - Remover Empresa\n"
                    + "6 - Visualizar Empresa Cadastradas\n"
                    + "7 - Sair\n"
            );

            int opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                try {
                    System.out.println("Nome: ");
                    fisica.setNome(sc.nextLine());

                    System.out.println("Cpf: ");
                    fisica.setCpf(sc.nextLine());

                    Servicos.Salvar(fisica);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

                case 2:

                    System.out.println("Nome: ");
                    fisica.setNome(sc.nextLine());

                    Servicos.DeletarUsuario(fisica);

                    break;

                case 3:
                    ArrayList<I_Pessoa> todasFisicas = Servicos.Buscar(new PessoaFisica());

                    System.out.println("Quantidade de pessoas: " + todasFisicas.size());
                    System.out.println("=====================");

                    for (int i = 0; i < todasFisicas.size(); i++) {
                        System.out.println(todasFisicas.get(i));
                        System.out.println("=====================");

                    }

                    break;

                case 4:
                try {
                    System.out.println("Nome: ");
                    juridica.setNome(sc.nextLine());

                    System.out.println("Cnpj: ");
                    juridica.setCnpj(sc.nextLine());

                    Servicos.Salvar(juridica);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
                case 5:
                    System.out.println("Nome: ");
                    juridica.setNome(sc.nextLine());

                    Servicos.DeletarUsuario(juridica);

                    break;

                case 6:
                    try{
                    ArrayList<I_Pessoa> todasJuridicas = Servicos.Buscar(new PessoaJuridica());

                    System.out.println("Quantidade de pessoas: " + todasJuridicas.size());
                    System.out.println("=====================");

                    for (int i = 0; i < todasJuridicas.size(); i++) {
                        System.out.println(todasJuridicas.get(i));
                        System.out.println("=====================");

                    }
                    }catch(Exception e){
                        System.out.println(e);
                    }

                    break;

                case 7:
                    quit = true;
                    break;
            }
        } while (!quit);
    }
}
