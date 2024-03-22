package org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.services.impls;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.entities.bo.QuestionnairesBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.services.interfaces.IQuestionnaires;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.utiles.ChargerCSVException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.utiles.IntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.utiles.PasBonFormatFichierException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QuestionnairesImpl implements IQuestionnaires{


    /*          QuestionnairesImpl a = new QuestionnairesImpl();
        a.chargerQuestionnaire("/home/vithu/IdeaProjects/questionnaire-sme/src/main/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr7/quizzine/questionsQuizz_V1.1.csv");
  */
    @Override
    public QuestionnairesBO chargerQuestionnaire(String url) throws IntrouvableException, PasBonFormatFichierException {

        QuestionnairesBO contenu = new QuestionnairesBO();

        File fichierCsv = new File(url);

        if(!fichierCsv.exists()){
            throw new IntrouvableException();
        }

        if (!url.endsWith(".csv")){
            throw new PasBonFormatFichierException();
        }

        try {
            contenu.setQuestionnaires(new String(Files.readAllBytes(Paths.get(url))));
        } catch (IOException e) {
            System.err.println("Erreur dans la lecture du fichier");
        }
        System.out.println(contenu);
        return contenu;
    }



}
