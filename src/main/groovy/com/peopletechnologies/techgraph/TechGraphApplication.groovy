package com.peopletechnologies.techgraph

import com.peopletechnologies.techgraph.repositories.SceneRepository
import com.peopletechnologies.techgraph.services.SceneService
import org.neo4j.ogm.session.Session
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories

@SpringBootApplication
@EnableNeo4jRepositories
@Configuration
class TechGraphApplication {

	static void main(String[] args) {
		SpringApplication.run TechGraphApplication, args
	}

	@Bean
	public SceneService sceneService(SceneRepository sceneRepository) {
		new SceneService(sceneRepository)
	}
}
