package services;

import model.parking.ParkingLot;
import repo.ParkingRepository;
import repo.RepositoryProvider;

import java.util.ArrayList;
import java.util.List;

public class ManagerServices {

    public static List<ParkingLot> parkingLots;
    private static ManagerServices managerServices = new ManagerServices();
    RepositoryProvider repositoryProvider = new RepositoryProvider();
    private ParkingRepository parkingRepository = repositoryProvider.getParkingRepository();

    private ManagerServices(){
        this.loadLots();
    }
    public static ManagerServices getInstance() {
        return managerServices;
    }

    public void loadLots() {
        parkingLots = getAllParkingLots();
    }

    public void updateParkingLots(List<ParkingLot> parkingLots) {
        parkingRepository.updateParkingLots(parkingLots);
    }

    public ArrayList<ParkingLot> getAllParkingLots() {
        return parkingRepository.getAllParkingLots();
    }


    public void addParkingLot(ParkingLot lot) {
        parkingLots.add(lot);
        parkingRepository.updateParkingLots(parkingLots);
    }
}
