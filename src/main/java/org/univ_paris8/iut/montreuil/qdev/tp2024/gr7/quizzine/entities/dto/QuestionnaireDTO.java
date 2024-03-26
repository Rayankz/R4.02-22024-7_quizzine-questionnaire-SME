package org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.entities.dto;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireDTO {


    private ArrayList<QuestionDTO> liste;

    public QuestionnaireDTO() {
        liste = new ArrayList<QuestionDTO>();
    }

    public void setListe(ArrayList<QuestionDTO> liste) {
        this.liste = liste;
    }

    public void ajoutQuestion(QuestionDTO questionDTO){
        liste.add(questionDTO);
    }
}
