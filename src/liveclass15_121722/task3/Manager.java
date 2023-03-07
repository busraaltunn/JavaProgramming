package liveclass15_121722.task3;

public class Manager extends Employee {

    @Override
    public int salary() {
        //I am getting the base salary from parent class +2000
        return super.salary() +  2000;
    }
}
