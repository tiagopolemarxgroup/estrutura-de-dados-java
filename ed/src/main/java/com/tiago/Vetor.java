package com.tiago;

import java.util.Arrays;

public class Vetor {
    //armazenamento sequencial
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adicionaEficiente(Aluno aluno){
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    private boolean posicaoInvalida(int posicao){
        return posicao >= 0 && posicao <= totalDeAlunos;
    }

    public void adiciona(int posicao, Aluno aluno) throws IllegalAccessException {
        if(posicaoInvalida(posicao)){
            throw new IllegalAccessException("Posião inválida");
        }
        for(int i = totalDeAlunos -1; i >= posicao; i -= 1){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;
    }

    public void adiciona(Aluno aluno){
        for(int i = 0; i < alunos.length; i++){
            if (alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        }

    }
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }
    public  Aluno pega(int posicao) throws IllegalAccessException {
        if(!posicaoOcupada(posicao)){
            throw new IllegalAccessException("Posição inválida");
        }
        return alunos[posicao];
    }

    public void remover(int posicao){
        for(int i= posicao;  i < this.totalDeAlunos - 1; i++){
            this.alunos[i] = alunos[+1];
        }
    }

    public boolean contem(Aluno aluno){
        for(int i = 0; i < totalDeAlunos; i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return totalDeAlunos;
    }

    public String toString(){
        return Arrays.toString(alunos);
    }
}
