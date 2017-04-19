package com.peopletechnologies.techgraph.domain

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship
import org.springframework.data.annotation.Id

/**
 * Created by lee on 4/15/17.
 */
@NodeEntity
class Scene implements Node{

    @GraphId
    String id
    String name
    String description

    @Relationship(type = "CONTAINS", direction = Relationship.OUTGOING)
    List<Node> nodes = []
}
