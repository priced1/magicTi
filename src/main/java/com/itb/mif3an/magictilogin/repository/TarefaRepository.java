package com.itb.mif3an.magictilogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.itb.mif3an.magictilogin.model.Tarefa;


@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{



}