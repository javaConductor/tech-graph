package com.peopletechnologies.techgraph.domain

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by lee on 4/16/17.
 */
@NodeEntity
class Platform implements Node {
    @GraphId
    String id

    String name;

    String description

    @org.neo4j.ogm.annotation.Labels
    List<String> labels

    @Relationship(type = "LANGUAGE_FOR_PLATFORM", direction = Relationship.UNDIRECTED)
    List<ComputerLanguage> languages
}