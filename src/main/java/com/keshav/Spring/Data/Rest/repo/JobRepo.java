package com.keshav.Spring.Data.Rest.repo;
import com.keshav.Spring.Data.Rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository <JobPost, Integer> {
 // <JobPost , Integer> Here we can see it connect with jobRepo,
 // it will return Integer type List which contain all data

 }



