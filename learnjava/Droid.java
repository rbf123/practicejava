public class Droid{
  String name;
  int batteryLevel;

public String toString(){
  return "Hello, I'm the droid: " + name;
}

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  public void energyReport(){
    System.out.println(name + "'s battery level is: " + batteryLevel);
  }

  public void energyTransfer(Droid otherDroid, int amount){
    if (this.batteryLevel >= amount) {
      this.batteryLevel -= amount;
      otherDroid.batteryLevel += amount;
      System.out.println(this.name + " transferred " + amount + " energy to " + otherDroid.name);
        } else {
            System.out.println(this.name + " does not have enough energy to transfer.");
    }
  }

    public static void main(String[] args){
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    
    codey.performTask("singing");
    codey.performTask("coding");
  

    codey.energyReport();
        
    Droid bobby = new Droid("Bobby");
    System.out.println(bobby);
        
    codey.energyReport();
    bobby.energyReport();
        
    codey.energyTransfer(bobby, 20);
        
    codey.energyReport();
    bobby.energyReport();
  }
}

/* this will print out the following:
Hello, I'm the droid: Codey
Codey is performing task: singing
Codey is performing task: coding
Codey's battery level is: 80
Hello, I'm the droid: Bobby
Codey's battery level is: 80
Bobby's battery level is: 100
Codey transferred 20 energy to Bobby
Codey's battery level is: 60
Bobby's battery level is: 120
*/
