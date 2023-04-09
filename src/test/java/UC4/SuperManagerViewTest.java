package UC4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import controller.auth.LoginView;
import controller.superManager.SuperManagerView;

public class SuperManagerViewTest {
	    private SuperManagerView superView;
	   
	    @Test
	    public void superManagerViewTest() {
	        superView = new SuperManagerView();
	        assertTrue(superView.isViewOpened());
	    }

}
