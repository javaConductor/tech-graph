package com.peopletechnologies.techgraph.domain

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by lee on 4/16/17.
 */
@NodeEntity
class Runtime extends Platform implements Node {
    @GraphId
    String id

    @Relationship(type = "RUNS_ON", direction = Relationship.UNDIRECTED)
    List<OperatingSystem> operatingSystems

}
