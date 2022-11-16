package com.genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author santu
 **/
public class FileProperty {

	/**
	 * its is used get common data from property file
	 */
	public String getPropertKeyValue(String key) throws Throwable{
		FileInputStream fileInputStream = null;

		fileInputStream = new FileInputStream(Paths.filepaths);
		Properties pres=new Properties();
		pres.load(fileInputStream);
		String value = pres.getProperty(key);
		return value;

	}
}
