package com.api.gamestore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.api.gamestore.repositories.CategoriaRepository;

@RestController
public class CategoriaController {

	@Autowired
	CategoriaRepository categoriaRepository;
}
