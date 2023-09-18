package com.itb.mif3an.magictilogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.mif3an.magictilogin.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
   
}
