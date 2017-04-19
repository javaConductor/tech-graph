package com.peopletechnologies.techgraph.domain

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by lee on 4/19/17.
 */
class Hardware implements Node {
    @GraphId
    String id

    String name;
    String manufacturer
    String model;

    @Relationship(type = "OPERATINGSYSTEM_FOR_HARDWARE", direction = Relationship.UNDIRECTED)
    List<OperatingSystem> operatingSystems
}
