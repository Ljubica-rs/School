package computer;

public class Computer {
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;
    
    public Computer (){
        this.operatingSystem = "";
        this.processTact = 0.0;
        this.memory = 0.0;
        this.hardDrive = 0;
    }
    
    public Computer(String operatingSystem , double processTact, double memory, int hardDrive){
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive =hardDrive;
    }
    
    public void setOperatingSystem(String newOperatingSystem){
        this.operatingSystem = newOperatingSystem;
    } 
    
    public void setProcessTact(double newProcessTact){
        this.processTact = newProcessTact;
    } 
    
    public void setMemory(double newMemory){
        this.memory = newMemory;
    } 
    
    public void setHardDrive(int newHardDrive){
        this.hardDrive = newHardDrive;
    } 
    
    public String getOperatingSystem(){
        return this.operatingSystem;
    }
    
    public double getProcessTact(){
        return this.processTact;
    }
    
    public double getMemory(){
        return this.memory;
    }
    
    public int getHardDrive(){
        return this.hardDrive;
    }
}
