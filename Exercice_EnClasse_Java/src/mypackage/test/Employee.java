package mypackage.test;

public class Employee {
    private String name;
    private  double salary;
    private  static Integer numberEmployee;

    public Employee( String name , double salary ) {
        this.name = name;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary( double salary ) {
        this.salary = salary;
    }

    public static Integer getNumberEmployee() {
        return numberEmployee;
    }

    public static void setNumberEmployee( Integer numberEmployee ) {
        Employee.numberEmployee = numberEmployee;
    }

}
