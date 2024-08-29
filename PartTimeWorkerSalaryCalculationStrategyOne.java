package com.practice.code;

import java.util.List;

public class PartTimeWorkerSalaryCalculationStrategyOne implements PartTimeWorkerSalaryCalculationStrategy {
	
	private int time1;
	private int time2;
	private int time3;
	
	
	public PartTimeWorkerSalaryCalculationStrategyOne(int time1, int time2, int time3) {
		this.time1 = time1;
		this.time2 = time2;
		this.time3 = time3;
	}

	// Calculate total amount earned
	@Override
	public int calculateAmountEarned(List<WorkDuration> workDaysList, int xYen, int yYen, int zYen, int n) {
        
        return workDaysList.stream().mapToInt(wd -> calculateDailyAmountEarned(wd.getStartTime(), wd.getEndTime(), xYen, yYen, zYen)).sum();
        
	}

	// Calculate daily amount earned
	private int calculateDailyAmountEarned(int startTime, int endTime, int xYen, int yYen, int zYen) {
		
		// Initialize daily amount of money earned
        int dailyAmountEarned = 0;

        for (int hour = startTime; hour < endTime; hour++) {
            if (hour < time1) {
            	dailyAmountEarned += zYen;
            } else if (hour < time2) {
            	dailyAmountEarned += xYen;
            } else if (hour < time3) {
            	dailyAmountEarned += yYen;
            } else {
            	dailyAmountEarned += zYen;
            }
        }

        return dailyAmountEarned;
	}

}
