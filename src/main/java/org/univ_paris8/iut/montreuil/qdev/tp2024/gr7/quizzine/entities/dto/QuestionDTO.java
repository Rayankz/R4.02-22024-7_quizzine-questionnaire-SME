package org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.entities.dto;

public class QuestionDTO {
    private String idQuestionnaire;
    private int numQuestionnaire;
    private String langue;
    private String loibelleQuestion;
    private String reponse;
    private int difficulte;
    private String explication;
    private String reference;
    public QuestionDTO(String idQuestionnaire, int numQuestionnaire, String langue, String loibelleQuestion, String reponse, int difficulte, String explication, String reference) {
        this.idQuestionnaire = idQuestionnaire;
        this.numQuestionnaire = numQuestionnaire;
        this.langue = langue;
        this.loibelleQuestion = loibelleQuestion;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.reference = reference;
    }

}
