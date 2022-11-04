package entities;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    // associations
    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); // init as empty list

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();       // create an instance of a calendar
        // iterate through the contracts of the specific year and adding to the base salary
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());                // grab the date from the contract and set on the Calendar
            int c_year = cal.get(Calendar.YEAR);     // grab the year from the Calendar
            int c_month = 1 + cal.get(Calendar.MONTH);   // grab the month from the Calendar
            if(year == c_year && month == c_month) { // check whether the month and year are correct
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
