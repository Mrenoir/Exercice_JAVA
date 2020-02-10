package mypackage.test;

import java.util.Date;

public class Project {
    private  String name;
    private Date dateStart;
    private  Date dateEnd;
    private Employee [] Employees;
    private Service [] services;

    public Project( String name , Date dateStart , Date dateEnd , Employee[] employees , Service[] services ) {
        this.name = name;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        Employees = employees;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart( Date dateStart ) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd( Date dateEnd ) {
        this.dateEnd = dateEnd;
    }

    public Employee[] getEmployees() {
        return Employees;
    }

    public void setEmployees( Employee[] employees ) {
        Employees = employees;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices( Service[] services ) {
        this.services = services;
    }
}
