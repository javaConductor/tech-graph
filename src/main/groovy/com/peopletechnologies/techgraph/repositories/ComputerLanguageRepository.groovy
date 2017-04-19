package com.peopletechnologies.techgraph.repositories;

import com.peopletechnologies.techgraph.domain.ComputerLanguage;
import com.peopletechnologies.techgraph.domain.Node
import org.neo4j.ogm.annotation.Relationship
import org.neo4j.ogm.session.Session
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository
import org.springframework.data.neo4j.template.Neo4jOperations
import org.springframework.data.neo4j.template.Neo4jTemplate
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by lee on 4/17/17.
 */
public trait ComputerLanguageRepository implements GraphRepository<ComputerLanguage> {

    @Autowired
    Session neo4jSession

     // derived finder
    abstract ComputerLanguage findByName(String name);

    //@Query("MATCH (m:ComputerLanguage)<-[rating:RATED]-(user) WHERE id(movie)={movie} return rating")
    //List<Rating> getRatings(@Param("movie") Movie movie);


    List<Node> getRelatedNodes(Node node){

        neo4jSession.query()
    }

}
