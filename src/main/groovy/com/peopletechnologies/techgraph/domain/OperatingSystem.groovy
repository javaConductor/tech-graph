package com.peopletechnologies.techgraph.domain

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by lee on 4/16/17.
 */
@NodeEntity
class OperatingSystem extends Platform implements Node {

    @GraphId
    String id

    String name;

    @Relationship(type = "OPERATINGSYSTEM_FOR_HARDWARE", direction = Relationship.UNDIRECTED)
    List<Hardware> hardwareList
}
