/**
 * 
 */
package com.sears.corps.fileRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author athora0
 *
 */
public class CSVReader {

	public List<String[]> getCSVData(String path) {
		String line;
		String temp[] = null;
		List<String[]> list=new ArrayList<String[]>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			while ((line = reader.readLine()) != null) {
				temp = line.split(",");
				list.add(temp);
				
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
