package com.raj.limitservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("limit-service")
public class Configuration {
	private Long max;
	private Long min;
	
	
	public Configuration() {
		super();
	}
	public Configuration(Long max, Long min) {
		super();
		this.max = max;
		this.min = min;
	}
	public Long getMax() {
		return max;
	}
	public void setMax(Long max) {
		this.max = max;
	}
	public Long getMin() {
		return min;
	}
	public void setMin(Long min) {
		this.min = min;
	}
	
	
}
