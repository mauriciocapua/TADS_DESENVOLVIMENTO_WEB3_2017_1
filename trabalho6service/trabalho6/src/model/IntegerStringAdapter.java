package model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class IntegerStringAdapter extends XmlAdapter<Integer, String> {

	public String unmarshal(Integer value) throws Exception {
		return (String.valueOf(value));
	}

	public Integer marshal(String value) throws Exception {
		return (new Integer(Integer.parseInt(value)));
	}

}