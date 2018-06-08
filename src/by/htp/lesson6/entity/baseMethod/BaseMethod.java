package by.htp.lesson6.entity.baseMethod;

import by.htp.lesson6.entity.mainClass.Transport;
import by.htp.lesson6.entity.air.*;
import by.htp.lesson6.entity.ground.*;
import by.htp.lesson6.entity.teleportation.Teleport;
import by.htp.lesson6.entity.underground.*;
import by.htp.lesson6.entity.water.*;

public class BaseMethod {
    private double dCost;

    private double cost(Transport transport){
        switch (transport.getMainPart()){
            case "wings":
                if(transport.getClass().equals(MiniPlane.class)){
                    dCost = transport.getCost();
                    break;
                }
            case "backpack":
                if(transport.getClass().equals(Jetpack.class)){
                    dCost = transport.getCost();
                    break;
                }
            case "ball":
                if(transport.getClass().equals(Slingshot.class)){
                    dCost = transport.getCost();
                    break;
                }
            case "air cushion":
                if(transport.getClass().equals(TaxiOnAirCushion.class)){
                    dCost = transport.getCost();
                    break;
                }
            case "pipe":
                if(transport.getClass().equals(TransportPipe.class)){
                    dCost = transport.getCost();
                    break;
                }
            case "сabin":
                if(transport.getClass().equals(Teleport.class)){
                    dCost = transport.getCost();
                    break;
                }
            case "drill blades":
                if(transport.getClass().equals(DrillingCar.class)){
                    dCost = transport.getCost();
                    break;
                }
            case "rails":
                if(transport.getClass().equals(UndergroundTrolley.class)){
                    dCost = transport.getCost();
                    break;
                }
            case "propellers":
                if(transport.getClass().equals(Submarine.class)){
                    dCost = transport.getCost();
                    break;
                }
            case "aerodynamic tube":
                if(transport.getClass().equals(UnderwaterTrain.class)){
                    dCost = transport.getCost();
                    break;
                }
            default:
                System.out.println("Error");
                break;
        }
        return dCost;
    }

    public void filterTransportByTime(Transport[] transport, Transport[] filterTransport, double iMaxTime) {
        int j=0;
        for (Transport aTransport : transport) {
            if (aTransport.getTime() <= iMaxTime) {
                filterTransport[j] = aTransport;
                j++;
            }
        }
        printTransport(filterTransport);
    }

    public void filterTransportByPrice(Transport[] transport, Transport[] filterTransport, double iMaxPrice) {
        int j=0;
        for (Transport aTransport : transport) {
            if (aTransport.getCost() <= iMaxPrice) {
                filterTransport[j] = aTransport;
                j++;
            }
        }
        printTransport(filterTransport);
    }

    public void printTransport(double iDistance, Transport[] transport) {
        System.out.println("Here you can see list of variants:");
        System.out.println(String.format("Distance: %.2f km", iDistance));
        for (Transport aTransport : transport) {
            if(aTransport != null){
            System.out.println(String.format("Name of transport: %s, Travel time: %.2f, Fare: %.2f$", aTransport.getName(),aTransport.getTime(), cost(aTransport)));
            }
        }
        System.out.println();
    }

    private void printTransport(Transport[] transport) {
        System.out.println("Here you can see list of variants:");
        for (Transport aTransport : transport) {
            if(aTransport != null){
                System.out.println(String.format("Name of transport: %s, Travel time: %.2f, Fare: %.2f$", aTransport.getName(),aTransport.getTime(), cost(aTransport)));
            }
        }
        System.out.println();
    }

}
