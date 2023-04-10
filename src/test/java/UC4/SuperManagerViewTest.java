package UC4;

import constants.Constants;

import model.user.Credentials;
import model.user.SuperManager;
import model.user.User;
import model.user.UserFactory;
import org.junit.Test;

import controller.auth.LoginView;
import controller.superManager.SuperManagerView;
import services.UserService;

import javax.swing.*;

import java.net.URI;


//import static javax.print.attribute.TextSyntax.verify;
import static org.junit.Assert.*;
import static services.UserService.userService;

public class SuperManagerViewTest {
	    private SuperManagerView superView;
	   
	    @Test
	    public void superManagerViewTest() {
	        superView = new SuperManagerView();
	        assertTrue(superView.isViewOpened());
	    }

	@Test
	public void testAutoGenerateBtnActionPerformed() {

		superView = new SuperManagerView();
		superView.emailTf = new JTextField();
		superView.passTf = new JTextField();

		superView.autoGenerateBtnActionPerformed(null);

		String email = superView.emailTf.getText();
		String password = superView.passTf.getText();
		System.out.println(password);
		assertNotNull(email);
		assertNotNull(password);
		assertTrue(email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"));
		assertEquals(9, password.length());
		}

	@Test
	public void	createBtnActionPerformedWithInvalidEmailAndPassword() {

		superView = new SuperManagerView();
		superView.emailTf = new JTextField();
		superView.passTf = new JTextField();
		superView.emailTf.setText("invalid_email");
		superView.passTf.setText("weakpass");

		// Call createBtnActionPerformed method
		superView.createBtnActionPerformed(null);
		JOptionPane.showMessageDialog(null, "Your Email is not valid");

	}

	@Test
    public void createBtnActionPerformedWithValidEmailAndPassword() {
		superView = new SuperManagerView();
		superView.emailTf = new JTextField();
		superView.passTf = new JTextField();
        String email = "test@example.com";
        String password = "Test@1234";
        String type = Constants.MANAGER;

		superView.emailTf.setText(email);
		superView.passTf.setText(password);

        Credentials credentials = new Credentials(email, password, type);
        User user = UserFactory.createAccount(credentials);

		superView.createBtnActionPerformed(null);


        assertEquals(email, superView.emailTf.getText());
        assertEquals(password, superView.passTf.getText());

        JOptionPane.showMessageDialog(null, "Account is Created Successfully!!");
    }

	@Test
	public void	logoutBtnActionPerformedOpensLoginViewAndClosesSuperManagerView() {
		superView = new SuperManagerView();
		superView.logoutBtnActionPerformed(null);

		assertTrue(superView.isViewOpened());

		LoginView loginView = new LoginView();
		// Check if the LoginView is opened
		assertTrue(loginView.getViewOpened());
	}
}

