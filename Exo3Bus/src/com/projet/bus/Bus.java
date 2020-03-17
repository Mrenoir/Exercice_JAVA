package com.projet.bus;

import java.util.ArrayList;

public class Bus {
    private int numberLine;
    private String start;
    private String come;
    private int capacity;
    private String sens;
    private  int nbVoy;
    private  int nbstop;
    private int actualstop;
    private ArrayList<String> listStop;



    public Bus( int numberLine , String start , String come , int capacity , String sens , int nbstop ) {
       if(capacity> 0 ) {
           this.numberLine = numberLine;
           this.start = start;
           this.come = come;
           this.capacity = capacity;
           this.sens = sens;
           this.nbstop = nbstop;
           this.actualstop = 0;
           this.nbVoy = 0;
       }
    }

    public int getNumberLine() {
        return numberLine;
    }

    public void setNumberLine( int numberLine ) {
        this.numberLine = numberLine;
    }

    public String getStart() {
        return start;
    }

    public void setStart( String start ) {
        this.start = start;
    }

    public String getCome() {
        return come;
    }

    public void setCome( String come ) {
        this.come = come;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity( int capacity ) {
        this.capacity = capacity;
    }

    public String getSens() {
        return sens;
    }

    public void setSens( String sens ) {
        this.sens = sens;
    }

    public int getNbstop() {
        return nbstop;
    }

    public void setNbstop( int nbstop ) {
        this.nbstop = nbstop;
    }

    public int getActualstop() {
        return actualstop;
    }

    public void setActualstop( int actualstop ) {
        this.actualstop = actualstop;
    }
    public int getNbVoy() {
        return nbVoy;
    }

    public void setNbVoy( int nbVoy ) {
        this.nbVoy = nbVoy;
    }
    public void addTravellers(int number){
        int n = number + getNbVoy();
        if(n <= this.capacity){
            setNbVoy( n );
        }
    }
    public void removeTravellers(int number){
        Boolean isEmpty = getNbVoy( ) - number <= 0;
        if(!isEmpty){
            setNbVoy( getNbVoy() - number );

        }
    }
    public  void travel(){
        if(nbstop != 0) {
            actualstop++;
            nbstop--;
        }
    }
}
