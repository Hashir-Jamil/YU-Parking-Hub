package repo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.booking.Booking;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements Repository {

    private static final String db2 = "src/doa/booking.json";

    public void updateBookings(List<Booking> bookings) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        try {
            FileWriter writer = new FileWriter(db2);
            writer.write(gson.toJson(bookings));
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Booking> getAllBookings() {
        Gson gson = new Gson();
        String jsonString = "";
        try {
            jsonString = new String(Files.readAllBytes(Paths.get(db2)));
            if (jsonString == null || jsonString.equals("")) {
                return new ArrayList<Booking>();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Booking>();

        }
        ArrayList<Booking> bookings = gson.fromJson(jsonString, new TypeToken<List<Booking>>() {
        }.getType());
        return bookings;
    }
}
