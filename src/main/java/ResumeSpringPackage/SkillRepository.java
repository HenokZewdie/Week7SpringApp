package ResumeSpringPackage;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
    Skill findByEmail(String email);
    Skill findBySkills(String skill);


}
