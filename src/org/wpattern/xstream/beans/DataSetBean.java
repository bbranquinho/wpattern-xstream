package org.wpattern.xstream.beans;

import java.util.ArrayList;
import java.util.List;

public class DataSetBean {

	private List<RecordBean> records;

	public DataSetBean() {
		records = new ArrayList<>();
	}

	public void addRecord(RecordBean record) {
		this.records.add(record);
	}

	public  List<RecordBean> getRecords() {
		return this.records;
	}

}
