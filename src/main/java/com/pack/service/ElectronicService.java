package com.pack.service;

import org.springframework.stereotype.Service;

import com.pack.dto.ElectronicDto;
import com.pack.utill.InMemoryDatabase;

@Service
public class ElectronicService {

	public ElectronicDto getElectronicById(Integer id) {

		return InMemoryDatabase.electronicList.get(id);
	}

}
