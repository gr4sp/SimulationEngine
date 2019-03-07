package core;

public interface ConsumptionActor {

     boolean consumptionOnly = true; // if the actor has on-site generation, then this will be set to false
     double computeConsumption(int month);


}
