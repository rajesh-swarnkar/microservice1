package com.raj.limitservice.bean;

public class LimitConfiguraion {
	private Long max;
	private Long min;
	public LimitConfiguraion(Long max, Long min) {
		super();
		this.max = max;
		this.min = min;
	}
	public LimitConfiguraion() {
		super();
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
