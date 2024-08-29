package com.practice.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PartTimeWorkerSalary {

    public void calculateSalary(PartTimeWorkerSalaryCalculationStrategy partTimeWorkerSalaryCalculationStrategy) {
        Scanner scanner = new Scanner(System.in);

        // Take hourly pay rates as input
        int xYen = scanner.nextInt();
        int yYen = scanner.nextInt();
        int zYen = scanner.nextInt();

        // Take the total number of days worked as input
        int n = scanner.nextInt();
        
        // Take each day's work duration as input
        List<WorkDuration> workDaysList = new ArrayList<>();
        
        // Populate the workDaysList with each day's work duration input
        IntStream.rangeClosed(1, n).forEach(day -> { 
        	WorkDuration wd = new WorkDuration();
        	wd.setStartTime(scanner.nextInt());
        	wd.setEndTime(scanner.nextInt());
        	workDaysList.add(wd);
        });

        // Print total amount of money earned by part time worker
        System.out.println();
        System.out.println(partTimeWorkerSalaryCalculationStrategy.calculateAmountEarned(workDaysList, xYen, yYen, zYen, n));
        System.out.println();

        scanner.close();
    }
    
}
