package com.keisar.sistemaDeGerenciamentoEscolar.repository;


import com.keisar.sistemaDeGerenciamentoEscolar.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
