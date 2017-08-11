package adapters;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

	public LocalDateTime unmarshal(String value) throws Exception {
		return(LocalDateTime.parse(value));
	}

	public String marshal(LocalDateTime value) throws Exception {
		return(value.toString());
	}

}