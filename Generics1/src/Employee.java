public class Employee<T> {
    private boolean isWorking = false;
    public Employee(){}

    public void start(){
        isWorking = true;
        System.out.println("Start to working");
    }

    public void end(){
        isWorking = false;
        System.out.println("End of working");
    }

    public boolean isWorking(){
        if(isWorking) System.out.println("He is working");
        else System.out.println("He is not working");
        return isWorking;
    }
}
