import model.parking.ParkingLot;
import model.parking.ParkingSpace;
import org.junit.Test;
import services.ManagerServices;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TesterUseCaseSix {
    //Testing managers adding/enabling/disabling parking spaces/lots

    @Test
    public void parkingLotTest1(){

        ParkingLot lot1 = new ParkingLot(1, "11 Arboretum Ln, North York, ON M3J 2S5");

        assertTrue(lot1.getLotID()==1);
        assertEquals(lot1.getLocation(), "11 Arboretum Ln, North York, ON M3J 2S5");

        assertTrue(lot1.getStatus()); //Check Status

        lot1.disableParkingLot();
        assertFalse(lot1.getStatus());
        lot1.enableParkingLot();
        assertTrue(lot1.getStatus());

        List<ParkingSpace> spaces= lot1.getParkingSpaces();
        assertTrue(spaces.size()==100);

        for(int i = 0; i<100; i++){
            ParkingSpace currentSpace = spaces.get(i);
            assertNotNull(currentSpace);
            assertTrue(currentSpace.getStatus());
            assertTrue(currentSpace.getSpaceID()==i+1);
            assertFalse(currentSpace.hasBooking());
            assertNull(currentSpace.getBooking());
            assertNotNull(currentSpace.getSensor());

            currentSpace.disableParkingSpace();
            assertFalse(currentSpace.getStatus());

            currentSpace.enableParkingSpace();
            assertTrue(currentSpace.getStatus());
        }
    }

    @Test
    public void parkingSpaceTest(){

        ParkingSpace currentSpace = new ParkingSpace(1);
        assertNotNull(currentSpace);
        assertTrue(currentSpace.getStatus());
        assertTrue(currentSpace.getSpaceID()==1);
        assertFalse(currentSpace.hasBooking());
        assertNull(currentSpace.getBooking());
        assertNotNull(currentSpace.getSensor());

        currentSpace.disableParkingSpace();
        assertFalse(currentSpace.getStatus());

        currentSpace.enableParkingSpace();
        assertTrue(currentSpace.getStatus());
    }

    @Test
    public void parkingManagerTest1(){

        ManagerServices parkingLotManager = ManagerServices.getInstance();
        assertNotNull(parkingLotManager);

        ArrayList<ParkingLot> parkingLots = parkingLotManager.getAllParkingLots();
        int originalSize = parkingLots.size();

        ParkingLot newParkingLot = new ParkingLot(1000, "Paradis");

        parkingLotManager.addParkingLot(newParkingLot);

        parkingLots = parkingLotManager.getAllParkingLots();

        //Find if newly added parking lot was successfully added
        boolean foundParkingLot = false;
        for(int i = 0; i<parkingLots.size();i++){
            if(parkingLots.get(i).getLotID()==newParkingLot.getLotID()){
                foundParkingLot=true;

                //Now remove the parking lot
                parkingLots.remove(i);
                parkingLotManager.updateParkingLots(parkingLots);
                break;
            }
        }
        assertTrue(foundParkingLot);

        //Now testing if the parking lot was removed
        parkingLots = parkingLotManager.getAllParkingLots();
        foundParkingLot = false;
        for(int i = 0; i<parkingLots.size();i++){
            if(parkingLots.get(i).getLotID()==newParkingLot.getLotID()){
                foundParkingLot=true;
                break;
            }
        }
        assertFalse(foundParkingLot);

        assertTrue(originalSize == parkingLots.size());
    }
}
