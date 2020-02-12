package com.company;
import java.util.Arrays;
import java.util.Objects;

public class Application {
    private String name;
    private Student Students[];

    public Application( String name  , Student[] students ) {
        this.name = name;
        Students = students;
    }
    public void print(){
        int length = this.Students.length;
        for(int i = 0; i<length ; i++){
            System.out.print( "Étudiant : "+Students[i].getStudentFirstName()+" "+Students[i].getStudentName() );
            for(int j = 0 ; j < Students[i].getMarks().length;j++){
                System.out.print("| " +Students[i].getMarks()[j].getSubject()+ " : "+ Students[i].getMarks()[j].getValue()+" | "  );
            }
            System.out.println(  );

        }
    }
    public void add(int position,String subject, float value){
        if(position>=0 && position < Students.length){
            Mark [] temp = new Mark[(Students[position].getMarks().length)+1];

            int len = Students[position].getMarks().length;
            for(int i = 0; i<Students[position].getMarks().length;i++) {
                temp[i] = Students[position].getMarks( )[i];
            }
            Mark m1 = new Mark( value,subject );
            temp[(temp.length)-1] = m1;
            Students[position].setMarks( temp );
        }

    }
    public float average(int position) {
        float avg = 0;
        int count = 0;
        if (position >= 0 && position < Students.length) {

            int len = Students[position].getMarks( ).length;
            for ( int i = 0 ; i < Students[position].getMarks( ).length ; i++ ) {
                avg += Students[position].getMarks()[i].getValue();
                count ++;
            }
            avg /= count;
            return avg;
        }
        return  -1;
    }
    public  int compute(){
        int max = 0;
        for ( int i = 0 ; i < Students.length ; i++ ) {
            max = Math.max( Students[i].getMarks( ).length , max );
        }
        return max;
    }
    public float[] avgs(){
        float[] studienAvgs = new float[Students.length];
        int [] test;
        for(int i = 0 ; i < studienAvgs.length;i++){
            studienAvgs[i] = average( i );
        }
        Arrays.sort( studienAvgs );
        return studienAvgs;
    }
    public void printArray(float[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Moyenne : "+  array[i] );
        }
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass( ) != o.getClass( )) return false;
        Application that = (Application) o;
        return Objects.equals( name , that.name ) &&
                Arrays.equals( Students , that.Students );
    }

    @Override
    public int hashCode() {
        int result = Objects.hash( name );
        result = 31 * result + Arrays.hashCode( Students );
        return result;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", Students=" + Arrays.toString( Students ) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone( );
    }

}