package UC6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import controller.client.ClientView;
import controller.manager.ManagerGUI;
import model.booking.Booking;
import model.user.Credentials;
import model.user.Manager;
import model.user.User;


public class ManagerGuiTest {

	    private ManagerGUI managerView;
	    private User user;
	    
	    @Before
	    public void setUp() {
	        Credentials newCredentials = new Credentials("MANAGER2@MANAGER.COM", "MANAGER2@MANAGER.COM", "MANAGER");
	        user = new Manager(newCredentials);
	        managerView = new ManagerGUI(user);
	    }
	    @Test
	    public void superManagerViewTest() {
	    	assertEquals(user, managerView.currentManager);
	    }

}
