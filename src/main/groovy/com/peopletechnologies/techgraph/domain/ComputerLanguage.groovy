package com.peopletechnologies.techgraph.domain

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by lee on 4/15/17.
 */
@NodeEntity
class ComputerLanguage implements  Node {

    @GraphId
    String id
    String name;

    @Relationship(type = "LANGUAGE_FOR_PLATFORM", direction = Relationship.UNDIRECTED)
    List<Platform> platforms

    @Relationship(type = "LIB_FOR_LANGUAGE", direction = Relationship.UNDIRECTED)
    List<Library> libraries

    @Relationship(type = "ORM_FOR_LANGUAGE", direction = Relationship.UNDIRECTED)
    List<Library> orms

}