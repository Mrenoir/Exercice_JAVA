package mypackage.test;

import java.util.ArrayList;

public class Service {
    private String name;
    private  ArrayList<Employee> ListOfEmpl;
    private Integer NbEmploye;

    public Service( String name , ArrayList<Employee> listOfEmpl  ) {
        this.name = name;
        ListOfEmpl = listOfEmpl;
        NbEmploye = listOfEmpl.size();
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
    public void addEmploye (Employee NewEmploye)
    {
        ListOfEmpl.add( NewEmploye );
        NbEmploye++;
    }

    public Employee getEmploye (int position){
        if(position < this.ListOfEmpl.size()){
            return  ListOfEmpl.get( position );
        }
        return null;
    }

}
