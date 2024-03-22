package org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.entities.bo;

import java.util.Objects;

public class QuestionnairesBO {

    private String Questionnaires;

    public QuestionnairesBO() {
        this.Questionnaires = "";
    }

    public String getQuestionnaires() {
        return Questionnaires;
    }

    public void setQuestionnaires(String questionnaires) {
        Questionnaires = questionnaires;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionnairesBO that = (QuestionnairesBO) o;
        return Objects.equals(Questionnaires, that.Questionnaires);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Questionnaires);
    }

    @Override
    public String toString() {
        return "QuestionnairesBO{" +
                "Questionnaires='" + Questionnaires + '\'' +
                '}';
    }
}

