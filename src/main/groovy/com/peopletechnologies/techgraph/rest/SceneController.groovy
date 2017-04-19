package com.peopletechnologies.techgraph.rest

import com.peopletechnologies.techgraph.services.SceneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by lee on 4/15/17.
 */
@RestController
class SceneController {
    SceneService sceneService

    @Autowired
    SceneController(SceneService sceneService){
        this.sceneService = sceneService
    }

    @RequestMapping("/ecosystem/language/{languageId}")
    public Map relatedNodes(String languageId) {

        sceneService.getLanguageEcoSystem(languageId);


        return "Greetings from Spring Boot!";

    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
