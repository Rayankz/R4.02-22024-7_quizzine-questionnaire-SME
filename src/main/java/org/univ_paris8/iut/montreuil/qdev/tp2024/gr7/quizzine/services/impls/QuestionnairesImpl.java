package org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.services.impls;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.entities.bo.QuestionnairesBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.services.interfaces.IQuestionnaires;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr7.quizzine.utiles.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class QuestionnairesImpl implements IQuestionnaires{


    /*          QuestionnairesImpl a = new QuestionnairesImpl();
        a.chargerQuestionnaire("/home/vithu/IdeaProjects/questionnaire-sme/src/main/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr7/quizzine/questionsQuizz_V1.1.csv");
  */
    @Override
    public QuestionnairesBO chargerQuestionnaire(String url) throws ChargerCSVException {

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

    @Override
    public QuestionnaireDTO fournirListeQuestions(QuestionnairesBO questionnairesBO) throws FournirQuestionExeption {

        String questionListString = questionnairesBO.getQuestionnaires();

        ArrayList<QuestionDTO> questions = new ArrayList<>();

        String[] lignes = questionListString.split("\\r?\\n");


        for (String ligne : lignes) {
            String[] attributs = ligne.split(";");
            if (attributs.length == 8) {
                QuestionDTO question = new QuestionDTO(attributs[0], Integer.parseInt(attributs[1]), attributs[2], attributs[3], attributs[4], Integer.parseInt(attributs[5]), attributs[6], attributs[7]);
                questions.add(question);

            } else {
                throw new ErreurParcoursLigneExeption();
            }
        }

        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO();
        questionnaireDTO.setListe(questions);

        return questionnaireDTO;
    }


}
