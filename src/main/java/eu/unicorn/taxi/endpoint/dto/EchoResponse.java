package eu.unicorn.taxi.endpoint.dto;

public class EchoResponse {
	
	private String status;
	
	public EchoResponse(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}		
}
