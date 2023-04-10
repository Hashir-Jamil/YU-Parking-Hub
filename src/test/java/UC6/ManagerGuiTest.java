package UC6;

import static java.lang.Integer.parseInt;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import controller.client.ClientView;
import controller.manager.ManagerGUI;
import model.booking.Booking;
import model.user.Credentials;
import model.user.Manager;
import model.user.User;
import services.ManagerServices;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ManagerGuiTest {

	    private ManagerGUI managerView;
	    private User user;
	    private ManagerServices pkManager = ManagerServices.getInstance();
	    
	    @Before
	    public void setUp() {
	        Credentials newCredentials = new Credentials("MANAGER2@MANAGER.COM", "MANAGER2@MANAGER.COM", "MANAGER");
	        user = new Manager(newCredentials);
	        managerView = new ManagerGUI(user);
	    }
	 
	    @Test 
	    public void disableAndEnableLotTest() {
	    	managerView.disableLot();
	    	assertTrue(managerView.isTriggered);
	    	
	    	managerView.enableLot();
	    	assertFalse(managerView.isTriggered);
	    }
		@Test
		public void addLotWithUniqueIDAndGivenLocation() {

			JTable lotTable = new JTable();
			String newLocation = "Test Location";

			Object[][] data = new Object[][]{{"10", "Test Location"}};
			String[] columnNames = new String[]{"ID", "Location"};
			DefaultTableModel model = new DefaultTableModel(data, columnNames);
			lotTable.setModel(model);
			int initialRowCount = lotTable.getRowCount();

			managerView.addLot();


			int actualRowCount = lotTable.getRowCount();
			assertEquals(initialRowCount, actualRowCount);

			assertTrue(pkManager.getAllParkingLots().stream()
					.anyMatch(l -> l.getLocation().equals(newLocation)));


			for (int i = 0; i < initialRowCount; i++) {
				int existingID = parseInt(lotTable.getValueAt(i, 0).toString());
				assertNotEquals(actualRowCount, existingID);
			}
		}
}
