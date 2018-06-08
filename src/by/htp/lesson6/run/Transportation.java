package by.htp.lesson6.run;

import by.htp.lesson6.entity.mainClass.Transport;
import by.htp.lesson6.entity.air.*;
import by.htp.lesson6.entity.baseMethod.BaseMethod;
import by.htp.lesson6.entity.ground.*;
import by.htp.lesson6.entity.teleportation.Teleport;
import by.htp.lesson6.entity.underground.*;
import by.htp.lesson6.entity.water.*;

public class Transportation {

    public static void main(String[] args) {
        double dDistance = 2000;
        double dMaxTime = 17, iMaxPrice = 12;
        Transport[] transport = new Transport[]{
                new MiniPlane(dDistance),
                new Jetpack(dDistance),
                new Slingshot(dDistance),
                new TaxiOnAirСushion(dDistance),
                new TransportPipe(dDistance),
                new Teleport(dDistance),
                new DrillingCar(dDistance),
                new UndergroundTrolley(dDistance),
                new Submarine(dDistance),
                new UnderwaterTrain(dDistance)
        };

        BaseMethod bm = new BaseMethod();
        bm.printTransport(dDistance,transport);

        Transport[] filterTransportByTime = new Transport[transport.length];
        bm.filterTransportByTime(transport,filterTransportByTime,dMaxTime);

        Transport[] filterTransportByPrice = new Transport[transport.length];
        bm.filterTransportByPrice(transport,filterTransportByPrice,iMaxPrice);
    }
}
