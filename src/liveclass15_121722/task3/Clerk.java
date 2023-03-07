package liveclass15_121722.task3;

public class Clerk extends Employee{

    @Override
    public int salary() {
        return super.salary() +10000;
    }
}
