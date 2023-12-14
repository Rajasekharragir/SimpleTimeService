package com.SimpleTimeService.Controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeServiceController {

	@GetMapping("/getTime")
	public Response getTimeResponse() {
		Response response = new Response();
		response.setIp("127.0.0.1");
		response.setTimeStamp(new Date().toLocaleString());
		return response;
	}
}
