package ex04.entities;

public class Student {
    public String name;
    public double q1;
    public double q2;
    public double q3;

    public double finalQ(){
        return q1 + q2 + q3;
    }
    public boolean pass(){
        return finalQ() >= 60;
    }
    public double missingPoints(){
        return 60 - finalQ();
    }
}
