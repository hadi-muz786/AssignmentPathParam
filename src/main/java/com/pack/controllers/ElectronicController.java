package com.pack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pack.dto.ElectronicDto;
import com.pack.service.ElectronicService;

@RestController
@RequestMapping("/electronic")
public class ElectronicController {

	@Autowired
	private ElectronicService electronicService;

	@GetMapping(value="")
	public String getElectronicByid(@RequestParam(value = "electronicId") Integer electronicId) {
		return "hello";
		//return electronicService.getElectronicById(electronicId);
	}

	@GetMapping(value = "/{id}")
	public ElectronicDto getElectronicByname(@PathVariable(value = "id") Integer electronicId) {

		return electronicService.getElectronicById(electronicId);
	}

	

}
