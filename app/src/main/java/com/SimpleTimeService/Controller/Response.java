package com.SimpleTimeService.Controller;

public class Response {

	public String timeStamp;
	public String ip;

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Response [timeStamp=" + timeStamp + ", ip=" + ip + "]";
	}
}
