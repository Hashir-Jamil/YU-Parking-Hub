package UC1;

import org.junit.Before;
import org.junit.Test;
import repo.UserRepository;
import services.UserService;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserRepoTest {

    private UserService userService;

    private UserRepository userRepository;
    private String email1;
    private String password1;
    private String email2;
    private String password2;

    @Before
    public void setUp() {
        userService = new UserService();
        email1 = "fakeEmailFormat";
        password1 = "weakpassword";
        email2 = "real@email.com";
        password2 = "V3ry5tr0ngP@ssword";
    }

    @Test
    public void testRegex() {
        assertFalse(userService.isValidEmail(email1));
        assertTrue(userService.isValidEmail(email2));
        assertFalse(userService.isStrongPassword(password1));
        assertTrue(userService.isStrongPassword(password2));
    }

}
