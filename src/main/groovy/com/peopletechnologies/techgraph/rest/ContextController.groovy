package com.peopletechnologies.techgraph.rest

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by lee on 4/15/17.
 */
@RestController
class ContextController {

    @RequestMapping("/relatedNodes/{nodeId}")
    public Map relatedNodes() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
