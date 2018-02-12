package com.slk.capture.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.slk.capture.model.Skill;
import com.slk.capture.repo.SkillRepository;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private SkillRepository skillRepository;

	public Skill getSkill(Long graphId) {
		return skillRepository.findOne(graphId);
	}

	public List<Skill> getAllSkill() {
		return (List<Skill>) skillRepository.findAll();
	}
}
