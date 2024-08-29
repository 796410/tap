package com.practice.code;

import java.util.List;

public interface PartTimeWorkerSalaryCalculationStrategy {
	
	public int calculateAmountEarned(List<WorkDuration> workDaysList, int xYen, int yYen, int zYen, int n);
	
}
