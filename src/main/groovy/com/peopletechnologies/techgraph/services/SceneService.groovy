package com.peopletechnologies.techgraph.services

import com.peopletechnologies.techgraph.domain.ComputerLanguage
import com.peopletechnologies.techgraph.domain.Scene
import com.peopletechnologies.techgraph.repositories.SceneRepository
import org.neo4j.ogm.session.Session
import org.springframework.stereotype.Service


/**
 * Created by lee on 4/15/17.
 */
@Service
class SceneService {
    SceneRepository sceneRepository
    def SceneService(SceneRepository sceneRepository){
        this.sceneRepository = sceneRepository
    }

    Scene getScene(String sceneId){
        neo4jSession.load(Scene, sceneId, 2)
    }

    Map getLanguageEcoSystem(String languageId) {
        ComputerLanguage lang = sceneRepository.getLanguage(languageId)
        lang.
    }
}
