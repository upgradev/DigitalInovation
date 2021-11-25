package com.example.comparator;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        // TODO Auto-generated method stub
        return o2.getIdade() - o1.getIdade();
    }

}