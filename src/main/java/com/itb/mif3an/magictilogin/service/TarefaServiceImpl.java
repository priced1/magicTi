package com.itb.mif3an.magictilogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itb.mif3an.magictilogin.model.Tarefa;
import com.itb.mif3an.magictilogin.repository.TarefaRepository;



@Service
public class TarefaServiceImpl implements TarefaService {

	@Autowired
	private TarefaRepository tarefaRepository;

	@Override
	public Tarefa save(Tarefa tarefa) {

		return tarefaRepository.save(tarefa);
	}

	@Override
	public List<Tarefa> findAll() {

		return tarefaRepository.findAll();
	}

}