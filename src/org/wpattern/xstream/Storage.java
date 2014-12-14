package org.wpattern.xstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.wpattern.xstream.beans.DataSetBean;

import com.thoughtworks.xstream.XStream;

public class Storage {

	private static Storage storageInstance;

	private static String fileName;

	private XStream xStream;

	private DataSetBean dataSet;

	private Storage() {
		this.xStream = new XStream();
		this.xStream.alias("DataSetBean", DataSetBean.class);
		this.dataSet = loadDataSet();
	}

	public static void setFileName(String fileName) {
		Storage.fileName = fileName;
	}

	public static Storage getInstance() {
		if ((storageInstance == null) && (fileName != null)) {
			storageInstance = new Storage();
		}

		return storageInstance;
	}

	public void saveDataSet() {
		String xmlFile = xStream.toXML(dataSet);

		try {
			FileWriter outFile = new FileWriter(fileName);

			outFile.write(xmlFile);

			outFile.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public DataSetBean getDataSet() {
		return dataSet;
	}

	private DataSetBean loadDataSet() {
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));

			String line;
			String allLines = "";

			while((line = in.readLine()) != null)
			{
				allLines += line + "\n";
			}

			in.close();

			dataSet = (DataSetBean) xStream.fromXML(allLines);

			return dataSet;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
