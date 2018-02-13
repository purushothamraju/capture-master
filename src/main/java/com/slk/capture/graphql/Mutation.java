package com.slk.capture.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.slk.capture.model.Contact;
import com.slk.capture.model.Profile;
import com.slk.capture.model.Skill;
import com.slk.capture.repo.ContactRepository;
import com.slk.capture.repo.ProfileRepository;
import com.slk.capture.repo.SkillRepository;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private SkillRepository skillRepo;
	@Autowired
	private ProfileRepository profileRepo;
	
	@Autowired
	private ContactRepository contactRepo;

	public Skill writeSkill(String skillName, String skillDescription, String skillType) {
		Skill skill = new Skill();
		skill.setSkillName(skillName);
		skill.setSkillDescription(skillDescription);
		skill.setSkillType(skillType);
		return skillRepo.save(skill);
	}

    public Profile writeProfile(String profileName,String workstation, String profileDesignation) {
	     Profile profile = new Profile();
	     profile.setProfileName(profileName);
	     profile.setWorkstation(workstation);
	     profile.setProfileDesignation(profileDesignation);
	     return profileRepo.save(profile);	
    }

    public Contact writeContact(Long mobileNo,String emailId,Integer extension) {
    	   Contact contact = new Contact();
       contact.setEmailId(emailId);
       contact.setMobileNo(mobileNo);
       contact.setExtension(extension);
       return contactRepo.save(contact);
   
    	
    }



}
