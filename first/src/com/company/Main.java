package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Employee employee = new Employee();
	    employee.setName("John Doe");
	    employee.setDateHired(new Date(2012,12,20));

	    System.out.println(employee);
    }
}

class Employee {
    private String name;
    private Date dateHired;

    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }

    protected Date getDateHired() {
        return dateHired;
    }

    protected void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
}

