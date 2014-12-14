package org.wpattern.xstream;

import java.util.Date;
import java.util.Random;

import org.wpattern.xstream.beans.DataSetBean;
import org.wpattern.xstream.beans.RecordBean;

public class Main {

	public static void main(String[] args) {
		// 1. Get path of file.
		String fileName = System.getProperty("user.dir") + "\\files\\dataSet.xml";

		// 2. Load the data.
		Storage.setFileName(fileName);
		Storage storage = Storage.getInstance();

		DataSetBean dataSet = storage.getDataSet();

		// 3. Print all values of data set.
		for (int i = 0; i < dataSet.getRecords().size(); i++) {
			System.out.println(dataSet.getRecords().get(i));
		}

		// 4. Save a new record.
		RecordBean record = new RecordBean();

		Long currentTime = System.currentTimeMillis();
		Random random = new Random(currentTime);
		int age = random.nextInt(50) + 18;

		record.setAddress("Address " + currentTime);
		record.setAge(age);
		record.setFirstName("First name " + currentTime);
		record.setLastName("Last name " + currentTime);
		record.setRegisterDate(new Date());

		dataSet.getRecords().add(record);

		storage.saveDataSet();
	}

}
