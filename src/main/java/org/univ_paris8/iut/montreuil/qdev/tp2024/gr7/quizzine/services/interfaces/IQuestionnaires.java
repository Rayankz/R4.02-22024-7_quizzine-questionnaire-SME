package org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.entities.bo.QuestionnairesBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.utiles.IntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.utiles.PasBonFormatFichierException;

public interface IQuestionnaires {

    public QuestionnairesBO chargerQuestionnaire(String url) throws IntrouvableException, PasBonFormatFichierException;

}
