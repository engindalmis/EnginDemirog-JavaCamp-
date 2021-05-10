package engin.dalmis.odev.listjob.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import engin.dalmis.odev.listjob.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
