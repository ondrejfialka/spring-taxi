package eu.unicorn.taxi.endpoint.dto;

import java.util.Date;

public class EchoSampleInput {

	private String name;
	
	private Date dateTime;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	
}
