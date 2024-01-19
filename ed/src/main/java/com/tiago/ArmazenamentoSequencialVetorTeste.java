package com.tiago;

public class ArmazenamentoSequencialVetorTeste {
    public static void main(String[] args) throws IllegalAccessException {
        Aluno a1 = new Aluno("Ximba");
        Aluno a2 = new Aluno("Tiririca");

        Vetor lista = new Vetor();

        //lista.adiciona(a1);
        //lista.adiciona(a2);
        System.out.println(lista.tamanho());
        lista.adicionaEficiente(a1);
        System.out.println(lista.tamanho());
        lista.adicionaEficiente(a2);
        System.out.println(lista.tamanho());
        System.out.println(lista);

        lista.contem(a1);

        Aluno a3 = new Aluno("Goiaba");
        System.out.println(lista.contem(a3));

       lista.adiciona(1, a3);
        System.out.println(lista);

    }
}