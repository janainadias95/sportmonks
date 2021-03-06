package com.kete.sportmonks.library.model.stats;

public class Passes 
{
	private Integer total = 0;
	private Integer accurate = 0;

	public Passes() {}

	public Integer getTotal() {
		return total;
	}

	public Integer getAccurate() {
		return accurate;
	}

	public Double getPercentage() {
		return (Double.valueOf(accurate) / Double.valueOf(total)) * 100;
	}
}
