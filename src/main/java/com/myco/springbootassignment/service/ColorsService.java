/**
 * 
 */
package com.myco.springbootassignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author Ashwin
 *
 */
@Service
public class ColorsService {

	private static List<Color> colorList;

	static {
		colorList = new ArrayList<Color>();
		colorList.add(new Color("White", "#FFFFFF"));
		colorList.add(new Color("Blue", "#0000FF"));
		colorList.add(new Color("Red", "#FF0000"));		
		colorList.add(new Color("Green", "#00FF00"));
		colorList.add(new Color("Gray", "#808080"));
		colorList.add(new Color("Yellow", "#FFFF00"));
	}

	public List<Color> getColours() {

		return colorList;
	}

}
