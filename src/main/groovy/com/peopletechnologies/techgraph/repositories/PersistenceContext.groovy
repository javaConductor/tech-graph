package com.peopletechnologies.techgraph.repositories

import org.neo4j.ogm.session.SessionFactory
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * Created by lee on 4/17/17.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("org.neo4j.cineasts")
@EnableNeo4jRepositories("org.neo4j.cineasts.repository")
public class PersistenceContext implements Neo4jConfiguration {

    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory("org.neo4j.cineasts.domain");
    }
}
