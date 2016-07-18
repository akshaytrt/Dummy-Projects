/**
 * 
 */
package com.sears.corps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * @author athora0
 *This class is read file operations
 */
public class FileReadOperation {
	//In this method we are reading the file and adding the result into List 
	public List<Products> readFile(BufferedReader reader, List<Products> productList) throws IOException {
		if (null == reader) {
			reader = new BufferedReader(new FileReader(FileHandelling.RECORDS_FILE));
		} else {
			String line;
			Products products = new Products();
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				products = new Products();
				products.setId(Integer.parseInt(temp[0]));
				products.setName(temp[1]);
				products.setBrand(temp[2]);
				products.setPrice(Float.parseFloat(temp[3]));
				productList.add(products);
			}

		}
		return productList;
	}
}
