package repo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.parking.ParkingLot;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParkingRepository implements Repository {

    private static final String db2 = "src/main/java/doa/parkingLots.json";

    public void updateParkingLots(List<ParkingLot> parkingLots) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        try {
            FileWriter writer = new FileWriter(db2);
            writer.write(gson.toJson(parkingLots));
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<ParkingLot> getAllParkingLots() {
        Gson gson = new Gson();
        String jsonString = "";
        try {
            jsonString = new String(Files.readAllBytes(Paths.get(db2)));
            if (jsonString == null || jsonString.equals("")) {
                return new ArrayList<ParkingLot>();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<ParkingLot>();

        }
        ArrayList<ParkingLot> parkingLots = gson.fromJson(jsonString, new TypeToken<List<ParkingLot>>() {
        }.getType());
        return parkingLots;
    }
}
