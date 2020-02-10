package mypackage.test;

import java.util.ArrayList;

public class index {
    public static void main( String[] args ) {
        Employee e1 = new Employee( "Boby",2500 );
        Employee e2 = new Employee( "Robi", 2500 );
        Employee[] ListEmp  = {e1,e2};
        Service s1 = new Service( "BD",ListEmp );
        ArrayList<Employee> el = new ArrayList<Employee>(  );
        el.add( e1 );
        System.out.println(el.get( 0 ).getName());
    }
}
