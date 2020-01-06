 package com.pack.utill;

import java.util.HashMap;
import java.util.Map;

import com.pack.dto.ElectronicDto;

public class InMemoryDatabase {

	public static Map<Integer, ElectronicDto> electronicList;

	static {
		electronicList = new HashMap<Integer, ElectronicDto>();

		ElectronicDto ed = new ElectronicDto();
		ed.setId(20);
		ed.setName("sdfsd");
		ed.setModel("sdfsd");
		ed.setColour("sdfs");
		ed.setSpecification("sdfsd");
		ed.setSerialNum("sdfsdf");
		electronicList.put(20, ed);

		ElectronicDto ed1 = new ElectronicDto();
		ed1.setId(30);
		ed1.setName("kfjiwe");
		ed1.setModel("kfwe");
		ed1.setColour("ekwn");
		ed1.setSerialNum("ekfnk");
		ed1.setSpecification("kewnk");
		electronicList.put(30, ed1);

		ElectronicDto ed2 = new ElectronicDto();
		ed2.setId(40);
		ed2.setName("eef");
		ed2.setModel("ejfew");
		ed2.setColour("ewkew");
		ed2.setSerialNum("ejfoew");
		ed2.setSpecification("jedjwe");
		electronicList.put(40, ed2);

	}

}
