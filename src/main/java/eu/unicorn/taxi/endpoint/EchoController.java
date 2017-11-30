package eu.unicorn.taxi.endpoint;

import org.springframework.web.bind.annotation.RestController;

import eu.unicorn.taxi.dao.CustomerRepository;
import eu.unicorn.taxi.endpoint.dto.EchoResponse;
import eu.unicorn.taxi.endpoint.dto.EchoSampleInput;
import eu.unicorn.taxi.service.EchoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class EchoController {
	
	private EchoService echoService;
	
	@Autowired
	public EchoController(EchoService echoService) {
		this.echoService = echoService;
	}
	
    @RequestMapping(value = "/echo", method = RequestMethod.GET,
    		produces="application/json")
    public ResponseEntity<EchoResponse> echo() {
    	EchoResponse response = new EchoResponse("Taxi application is running");       	
    	return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/echo", method = RequestMethod.POST,
    		produces="application/json", consumes="application/json")
    public ResponseEntity<EchoResponse> postExample(EchoSampleInput echoInput) {
    	EchoResponse response = new EchoResponse("Hello" + echoInput.getName());  
    	
    	return new ResponseEntity<>(response, HttpStatus.OK);
    }

}