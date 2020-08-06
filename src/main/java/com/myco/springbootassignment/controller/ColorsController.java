/**
 * 
 */
package com.myco.springbootassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myco.springbootassignment.service.Color;
import com.myco.springbootassignment.service.ColorsService;

/**
 * @author Ashwin
 *
 */

@RestController
public class ColorsController {

	@Autowired
	private ColorsService colorsService;

	@GetMapping("/colors")
	public List<Color> getEmployees() {
		
		return colorsService.getColours();
	}
}
