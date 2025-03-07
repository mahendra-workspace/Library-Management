package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Borrower;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, String> {

}
