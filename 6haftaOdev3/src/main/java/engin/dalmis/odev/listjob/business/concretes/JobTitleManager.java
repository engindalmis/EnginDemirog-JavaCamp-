package engin.dalmis.odev.listjob.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import engin.dalmis.odev.listjob.business.abstracts.JobTitleService;
import engin.dalmis.odev.listjob.dataAccess.abstracts.JobTitleDao;
import engin.dalmis.odev.listjob.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	
	private JobTitleDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}


	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return this.jobTitleDao.findAll();
	}

	@Override
	public JobTitle add(JobTitle jobTitle) {
		System.out.println(jobTitle.getTitle() + " veri tabanına Eklendi");
		return this.jobTitleDao.save(jobTitle);
	}


	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return this.jobTitleDao.count();
	}


	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.jobTitleDao.deleteById(id);
		System.out.println(id +" numarasına sahip jobtitle silinmiştir.");
		
	}


	@Override
	public Integer get(Integer id) {
		this.jobTitleDao.getOne(id);
		System.out.println(id+ "numarasına sahip jobtitle getirilmiştir.");
		return id;
		
	}








}
