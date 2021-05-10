package engin.dalmis.odev.listjob.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import engin.dalmis.odev.listjob.business.abstracts.JobTitleService;
import engin.dalmis.odev.listjob.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobTitle")
public class JobTitlesControllers {

	
	private JobTitleService jobTitleService;
	@Autowired
	public JobTitlesControllers(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		
		return this.jobTitleService.getAll();
	}
	@GetMapping("/add")
	public JobTitle add(){
		JobTitle jobTitle=new JobTitle();
		jobTitle.setTitle("Deneme add");
		return this.jobTitleService.add(jobTitle);
	}
	@GetMapping("/count")
	public Long count(){
		return this.jobTitleService.count();
	}
	@GetMapping("/delete")
	public void delete() {
		 this.jobTitleService.delete(2);
	}
	@GetMapping("/get")
	public Integer get() {
		 
		return this.jobTitleService.get(4);
		 
	}
	
	
}
