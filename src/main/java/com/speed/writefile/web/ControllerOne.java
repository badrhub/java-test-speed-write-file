package com.speed.writefile.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.speed.writefile.test.SpeedWriteFile;

@RestController
public class ControllerOne {

	
	@GetMapping("/test/{nbr}")
	public String testWrite(@PathVariable("nbr") int nbr) {
		return SpeedWriteFile.wInFile(nbr);
	}
}
