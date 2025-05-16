package com.docLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctlogin.entity.Medicine;

@Repository
public interface MedicinesRepository extends JpaRepository<Medicine,Long> {

}
