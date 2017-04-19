package com.peopletechnologies.techgraph.domain

import org.neo4j.cypher.internal.compiler.v2_2.planner.logical.cardinality.NodeCardinalityEstimator
import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by lee on 4/19/17.
 */
@NodeEntity
class ORM extends Library {

    @GraphId
    String id

    String name;

    @Relationship(type = "LIB_FOR_LANGUAGE", direction = Relationship.UNDIRECTED)
    List<ComputerLanguage> computerLanguages

    @Relationship(type = "ORM_FOR_DB", direction = Relationship.UNDIRECTED)
    List<Persistence> compatibleDatastores


}
