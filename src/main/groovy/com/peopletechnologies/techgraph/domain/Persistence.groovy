package com.peopletechnologies.techgraph.domain

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by lee on 4/19/17.
 */
@NodeEntity
class Persistence {

    @GraphId
    String id

    String name;

    @Relationship(type = "PERSISTENCE_FOR_PLATFORM", direction = Relationship.UNDIRECTED)
    List<Platform> platforms
}
