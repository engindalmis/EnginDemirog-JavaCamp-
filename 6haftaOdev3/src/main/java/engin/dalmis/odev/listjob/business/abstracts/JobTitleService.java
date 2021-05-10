package engin.dalmis.odev.listjob.business.abstracts;

import java.util.List;

import engin.dalmis.odev.listjob.entities.concretes.JobTitle;

public interface JobTitleService {
	
	List<JobTitle> getAll();
	JobTitle add(JobTitle jobTitle);
	Long count();
	void delete(Integer id);
	Integer get(Integer id);

}
