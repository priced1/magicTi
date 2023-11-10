package com.itb.mif3an.magictilogin.service;


import java.util.List;

import com.itb.mif3an.magictilogin.model.Tarefa;

public interface TarefaService {

	Tarefa save(Tarefa tarefa);
	List<Tarefa> findAll();
	List<Tarefa> findTarefasByIdUser(Long idUsuario);

}