import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        model.booking.Booking booking4 = parkingSpace1.getBooking();
        model.booking.Booking booking5 = parkingSpace1.getBooking();
        parkingSpace1.setStatus(true);
        model.booking.Booking booking8 = new model.booking.Booking();
        int int9 = booking8.getStartTime();
        booking8.setEndTime((int) (short) 10);
        booking8.setCost((double) (short) 100);
        int int14 = booking8.getSpaceId();
        java.lang.String str15 = booking8.getStatus();
        parkingSpace1.setBooking(booking8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = booking8.getTotalCost();
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        java.lang.String str12 = clientServices0.getParkingSpaceById(100, 100);
        java.lang.String str15 = clientServices0.disableParkingSpaceById((int) (short) 10, (int) (byte) 100);
        java.lang.String str18 = clientServices0.getParkingSpaceById(1, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = clientServices0.cancenlBooking(100);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        java.util.List<model.user.User> userList10 = userRepository9.getUsers();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials14, "hi!");
        nonFacultyStaff17.setRole("");
        model.user.Credentials credentials20 = nonFacultyStaff17.getCredentials();
        model.user.Credentials credentials21 = nonFacultyStaff17.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) nonFacultyStaff17);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str13 = facultyMember10.getFacultyId();
        repo.RepositoryProvider repositoryProvider14 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository15 = repositoryProvider14.getBookingRepository();
        repo.UserRepository userRepository16 = repositoryProvider14.getUserRepository();
        boolean boolean17 = facultyMember10.equals((java.lang.Object) userRepository16);
        model.user.Client client21 = new model.user.Client("Success: Parking Lot 97 has been enabled.", "Parking Space 1 is already enabled.", "Success: Parking Lot -1 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository16.updateUser((model.user.User) client21);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        model.parking.ParkingSpace parkingSpace9 = new model.parking.ParkingSpace((int) '#');
        parkingSpace9.setStatus(true);
        boolean boolean12 = parkingSpace9.getStatus();
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        booking13.setEndTime((int) (short) 10);
        java.lang.String str17 = booking13.getEmail();
        booking13.setCost((double) (byte) 0);
        int int20 = booking13.getLotId();
        booking13.setCost((double) 100L);
        parkingSpace9.setBooking(booking13);
        java.lang.String str24 = booking13.toString();
        int int25 = booking13.getStartTime();
        boolean boolean26 = clientServices0.updateCompleteBooking(booking13);
        booking13.setEmail("fnoK1s5im");
        booking13.setEmail("cmB$K&uw+");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double31 = booking13.getTotalCost();
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) ' ', (int) ' ');
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        boolean boolean16 = clientServices0.bookParkingSpace(booking12);
        model.parking.ParkingLot parkingLot18 = clientServices0.getParkingLotByAddress("Parking Space 35 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = clientServices0.cancenlBooking(100);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Parking Space 1 is already enabled.");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials11, "hi!");
        nonFacultyStaff14.setRole("");
        model.user.Credentials credentials17 = nonFacultyStaff14.getCredentials();
        model.user.Credentials credentials18 = nonFacultyStaff14.getCredentials();
        java.lang.String str19 = nonFacultyStaff14.getRole();
        boolean boolean20 = nonFacultyStaff14.getValidationStatus();
        java.lang.String str21 = nonFacultyStaff14.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = userService0.registerUser((model.user.User) nonFacultyStaff14);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str7 = credentials3.getLogin();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "", "Parking Space 97 is already disabled.");
        java.lang.String str11 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember10", facultyMember4.equals(facultyMember10) ? facultyMember4.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        boolean boolean7 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("users.json", "");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("R3$W[qgE=");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.lang.String str5 = booking0.toString();
        java.lang.String str6 = booking0.getStatus();
        booking0.setCost((double) ' ');
        double double9 = booking0.getCost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = booking0.getTotalCost();
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Parking Space 32 is already enabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "cZ=IAx!!l");
        model.user.Client client16 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff13 and nonFacultyStaff15", nonFacultyStaff13.equals(nonFacultyStaff15) ? nonFacultyStaff13.hashCode() == nonFacultyStaff15.hashCode() : true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("taSI0*=tM");
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.toString();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.toString();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials9, "Student", "Manager");
        facultyMember16.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str19 = facultyMember16.getFacultyId();
        java.lang.String str20 = facultyMember16.getFacultyName();
        java.lang.String str21 = facultyMember16.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = userService0.registerUser((model.user.User) facultyMember16);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        java.lang.String str16 = booking12.getEmail();
        java.lang.String str17 = booking12.toString();
        boolean boolean18 = credentials3.equals((java.lang.Object) booking12);
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials3, "There is no Such Parking Lot", "Av+-nN6Nu");
        facultyMember21.setFacultyId("Wm(OGK*DZ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember21", facultyMember11.equals(facultyMember21) ? facultyMember11.hashCode() == facultyMember21.hashCode() : true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials6, "hi!");
        nonFacultyStaff9.setRole("");
        nonFacultyStaff9.setRole("hi!");
        boolean boolean14 = nonFacultyStaff9.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = userService0.registerUser((model.user.User) nonFacultyStaff9);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        java.lang.String str12 = booking3.getLicensePlate();
        java.lang.String str13 = booking3.getLicensePlate();
        java.lang.String str14 = booking3.getStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking3.getTotalCost();
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        repo.UserRepository userRepository13 = userService0.userRepository;
        repo.UserRepository userRepository14 = userService0.userRepository;
        repo.UserRepository userRepository15 = userService0.userRepository;
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.toString();
        model.user.Manager manager21 = new model.user.Manager(credentials19);
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials19);
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials19, "X?EhgrKDV");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = userService0.registerUser((model.user.User) nonFacultyStaff24);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.getUserByEmail("?bCwuuL2=");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        java.util.List<model.user.User> userList10 = userRepository0.getUsers();
        model.user.User user14 = new model.user.User("", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "Credentials{login='hi!', password='hi!', type='hi!'}");
        userRepository0.removeUser(user14);
        services.UserService userService16 = new services.UserService();
        boolean boolean18 = userService16.isValidEmail("SuperManager");
        repo.UserRepository userRepository19 = userService16.userRepository;
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember24 = new model.user.FacultyMember(credentials23);
        userRepository19.addUser((model.user.User) facultyMember24);
        facultyMember24.setFacultyName("Parking Space 32 is already enabled.");
        userRepository0.removeUser((model.user.User) facultyMember24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials4 and credentials23", credentials4.equals(credentials23) ? credentials4.hashCode() == credentials23.hashCode() : true);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.getType();
        java.lang.String str12 = credentials9.toString();
        java.lang.String str13 = credentials9.getLogin();
        model.user.User user14 = model.user.UserFactory.createAccount(credentials9);
        java.lang.String str15 = credentials9.getPassword();
        model.user.Student student17 = new model.user.Student(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Manager manager18 = new model.user.Manager(credentials9);
        model.user.Student student20 = new model.user.Student(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        (O3fsOXXJ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) student20);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Give Id for parking Space is wrong");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client12 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 32 has been disabled.");
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getPassword();
        java.lang.String str20 = credentials18.getType();
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials18, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        facultyMember23.setFacultyId("NonFacultyStaff");
        facultyMember23.setFacultyId("");
        boolean boolean28 = nonFacultyStaff14.equals((java.lang.Object) facultyMember23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials18", credentials3.equals(credentials18) ? credentials3.hashCode() == credentials18.hashCode() : true);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.loginUser("Wm(OGK*DZ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         Student'\nemail        null");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Student");
        java.lang.String str10 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str13 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff12", nonFacultyStaff11.equals(nonFacultyStaff12) ? nonFacultyStaff11.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials12, "hi!");
        nonFacultyStaff15.setRole("");
        model.user.Credentials credentials18 = nonFacultyStaff15.getCredentials();
        nonFacultyStaff15.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = userService0.registerUser((model.user.User) nonFacultyStaff15);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isStrongPassword("9z6wsHuxQ");
        model.user.Credentials credentials17 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials17, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client21 = new model.user.Client(credentials17);
        client21.validateAccount();
        model.user.Credentials credentials23 = client21.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = userService0.registerUser((model.user.User) client21);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        java.lang.String str3 = clientServices0.enableParkingSpaceById((int) 'a', (int) (byte) 100);
        java.util.List<java.lang.String> strList4 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllUsersBookings("Parking Space -1 is already enabled.");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace((int) (short) 1);
        model.booking.Booking booking9 = new model.booking.Booking();
        int int10 = booking9.getStartTime();
        booking9.setEndTime((int) (short) 10);
        java.lang.String str13 = booking9.getEmail();
        booking9.setCost((double) (byte) 0);
        int int16 = booking9.getLotId();
        booking9.setEndTime((int) (short) 100);
        java.lang.String str19 = booking9.toString();
        int int20 = booking9.getId();
        booking9.setEndTime((int) (short) 10);
        java.util.Date date23 = booking9.getDate();
        int int24 = booking9.getId();
        booking9.setStartTime((int) (short) 100);
        java.util.Date date27 = booking9.getEndDateTime();
        parkingSpace8.setBooking(booking9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = clientServices0.updateCompleteBooking(booking9);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        int int13 = booking11.getId();
        int int14 = booking11.getTotalHours();
        booking11.setId((int) 'a');
        boolean boolean17 = clientServices0.bookParkingSpace(booking11);
        booking11.setId((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = booking11.getTotalCost();
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        repo.UserRepository userRepository13 = userService0.userRepository;
        repo.UserRepository userRepository14 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user17 = userService0.loginUser("_0OsrHq9&", "hLihvheFq");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        java.lang.String str9 = credentials8.getType();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials13);
        model.user.User user16 = new model.user.User(credentials13);
        model.user.Credentials credentials17 = user16.getCredentials();
        java.lang.String str18 = credentials17.getPassword();
        model.user.Student student19 = new model.user.Student(credentials17);
        java.lang.String str20 = student19.getStudentId();
        student19.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        services.ClientServices clientServices23 = services.ClientServices.getInstance();
        model.booking.Booking booking25 = clientServices23.getBookingById((int) (short) 1);
        boolean boolean26 = student19.equals((java.lang.Object) clientServices23);
        java.lang.String str27 = student19.getStudentId();
        boolean boolean28 = credentials8.equals((java.lang.Object) student19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials8 and credentials13", credentials8.equals(credentials13) ? credentials8.hashCode() == credentials13.hashCode() : true);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("L2C@FUe6G");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("fnoK1s5im", "?bCwuuL2=");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository3 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials7);
        model.user.User user10 = new model.user.User(credentials7);
        model.user.Credentials credentials11 = user10.getCredentials();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials11);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials11);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) nonFacultyStaff14);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        model.booking.Booking booking9 = clientServices0.getBookingById(97);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot12 = clientServices10.getParkingLotByAddress("Student");
        model.booking.Booking booking14 = clientServices10.getBookingById((int) (short) 0);
        boolean boolean15 = clientServices0.updateCompleteBooking(booking14);
        model.booking.Booking booking16 = new model.booking.Booking();
        booking16.setId(0);
        double double19 = booking16.getCost();
        booking16.setEmail("Parking Lot 100 is already enabled.");
        boolean boolean22 = clientServices0.updateCompleteBooking(booking16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = booking16.getTotalCost();
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        boolean boolean13 = clientServices0.updateBooking((int) (byte) 1, (int) '4');
        model.parking.ParkingLot parkingLot15 = clientServices0.getParkingLotByAddress("Success: Parking Space 97 has been enabled.");
        java.util.List<model.booking.Booking> bookingList16 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot18 = clientServices0.getParkingLotByAddress(")CAoHm8t(");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList20 = clientServices0.getAllUsersBookings("success");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) ' ', (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList13 = clientServices0.getAllUsersBookings("tG+it%4Xp");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Success: Parking Space -1 has been enabled.");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        java.lang.String str13 = clientServices0.getParkingSpaceById((int) (short) 0, (int) '#');
        java.lang.String str16 = clientServices0.enableParkingSpaceById(100, (-87));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList18 = clientServices0.getAllUsersBookings("6!yglfcy=");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = superManagerServices0.isStrongPassword("=B3fAbMGq");
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.toString();
        model.user.Visitor visitor20 = new model.user.Visitor(credentials17);
        java.lang.String str21 = credentials17.toString();
        model.user.FacultyMember facultyMember24 = new model.user.FacultyMember(credentials17, "Student", "Manager");
        facultyMember24.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str27 = facultyMember24.getFacultyId();
        java.lang.String str28 = facultyMember24.getFacultyName();
        model.user.Credentials credentials29 = facultyMember24.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = superManagerServices0.createAccount((model.user.User) facultyMember24);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str11 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.toString();
        model.user.Visitor visitor9 = new model.user.Visitor(credentials6);
        java.lang.String str10 = credentials6.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials6, "Student", "Manager");
        facultyMember13.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember13.validateAccount();
        model.user.Credentials credentials17 = facultyMember13.getCredentials();
        model.user.Client client18 = new model.user.Client(credentials17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) client18);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean6 = userService0.isStrongPassword("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.getUserByEmail("]cT(-?mBj");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setEmail("(O3fsOXXJ");
        booking0.setEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        booking0.setStartTime((int) (short) -1);
        int int16 = booking0.getStartTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = booking0.getTotalCost();
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        boolean boolean12 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository13 = userService0.userRepository;
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17, "hi!");
        model.user.Credentials credentials21 = nonFacultyStaff20.getCredentials();
        model.user.Client client22 = new model.user.Client(credentials21);
        model.user.Credentials credentials23 = client22.getCredentials();
        model.user.User user24 = new model.user.User(credentials23);
        user24.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = userService0.registerUser(user24);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "SuperManager");
        java.lang.String str14 = nonFacultyStaff13.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff13", nonFacultyStaff10.equals(nonFacultyStaff13) ? nonFacultyStaff10.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean7 = userService0.isStrongPassword("Visitor");
        boolean boolean9 = userService0.isValidEmail("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("Parking Space 1 is already disabled.", "1bR(76zCD");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Give Id for parking Space is wrong");
        boolean boolean8 = superManagerServices0.isStrongPassword("success");
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        boolean boolean11 = superManagerServices0.isValidEmail("");
        java.lang.String str12 = superManagerServices0.generateStrongPassword();
        repo.UserRepository userRepository13 = new repo.UserRepository();
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials17);
        facultyMember18.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str21 = facultyMember18.getFacultyId();
        userRepository13.addUser((model.user.User) facultyMember18);
        java.lang.String str23 = facultyMember18.getFacultyName();
        java.lang.String str24 = facultyMember18.getFacultyId();
        facultyMember18.setFacultyName("Student");
        model.parking.ParkingSpace parkingSpace28 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking29 = new model.booking.Booking();
        int int30 = booking29.getStartTime();
        booking29.setEndTime((int) (short) 10);
        java.lang.String str33 = booking29.getEmail();
        booking29.setCost((double) (byte) 0);
        parkingSpace28.setBooking(booking29);
        model.sensor.Sensor sensor37 = parkingSpace28.getSensor();
        boolean boolean38 = parkingSpace28.getStatus();
        boolean boolean39 = facultyMember18.equals((java.lang.Object) boolean38);
        facultyMember18.setFacultyName("Success: Parking Space 100 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = superManagerServices0.createAccount((model.user.User) facultyMember18);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        booking0.setCost((double) 100.0f);
        java.lang.String str9 = booking0.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = booking0.getTotalCost();
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = clientServices0.cancenlBooking((int) (byte) 1);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllUsersBookings("Credentials{login='Credentials{login='hi!', password='hi!', type='hi!'}', password='Success: Parking Lot 100 has been disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student'}");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        boolean boolean8 = credentials3.equals((java.lang.Object) true);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "Parking Lot 100 is already enabled.");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials15);
        java.lang.String str17 = facultyMember16.getFacultyId();
        facultyMember16.validateAccount();
        model.user.Credentials credentials19 = facultyMember16.getCredentials();
        java.lang.String str20 = facultyMember16.getFacultyName();
        boolean boolean21 = credentials3.equals((java.lang.Object) facultyMember16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.toString();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        services.ClientServices clientServices11 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot13 = clientServices11.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList14 = clientServices11.getAllBookings();
        java.lang.String str17 = clientServices11.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking19 = clientServices11.getBookingById(100);
        boolean boolean22 = clientServices11.updateBooking((int) 'a', 100);
        java.lang.String str25 = clientServices11.getParkingSpaceById((int) ' ', 100);
        java.lang.String str28 = clientServices11.getParkingSpaceById(0, (int) (short) 1);
        model.parking.ParkingLot parkingLot30 = clientServices11.getParkingLotByAddress("cmB$K&uw+");
        boolean boolean31 = credentials3.equals((java.lang.Object) parkingLot30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor10", visitor6.equals(visitor10) ? visitor6.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user7 = new model.user.User(credentials6);
        userRepository2.addUser(user7);
        services.UserService userService9 = new services.UserService();
        boolean boolean11 = userService9.isValidEmail("SuperManager");
        repo.UserRepository userRepository12 = userService9.userRepository;
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials16);
        userRepository12.addUser((model.user.User) facultyMember17);
        facultyMember17.setFacultyName("Parking Space 32 is already enabled.");
        facultyMember17.validateAccount();
        boolean boolean22 = user7.equals((java.lang.Object) facultyMember17);
        model.user.Credentials credentials26 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str27 = credentials26.getPassword();
        java.lang.String str28 = credentials26.getType();
        java.lang.String str29 = credentials26.toString();
        java.lang.String str30 = credentials26.getLogin();
        java.lang.String str31 = credentials26.getType();
        model.user.User user32 = model.user.UserFactory.createAccount(credentials26);
        model.user.Visitor visitor33 = new model.user.Visitor(credentials26);
        model.user.FacultyMember facultyMember36 = new model.user.FacultyMember(credentials26, "Parking Space 35 is already enabled.", "NgoLYmWc!");
        boolean boolean37 = facultyMember17.equals((java.lang.Object) "NgoLYmWc!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials16 and credentials26", credentials16.equals(credentials26) ? credentials16.hashCode() == credentials26.hashCode() : true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        (O3fsOXXJ");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials3);
        model.user.Student student12 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor11", visitor6.equals(visitor11) ? visitor6.hashCode() == visitor11.hashCode() : true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        booking0.setStartTime((int) (short) 10);
        booking0.setEndTime((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking0.getTotalCost();
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        java.lang.String str5 = facultyMember4.getFacultyId();
        java.lang.String str6 = facultyMember4.getFacultyId();
        java.lang.String str7 = facultyMember4.getFacultyName();
        facultyMember4.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.Credentials credentials10 = facultyMember4.getCredentials();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        facultyMember11.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember11", facultyMember4.equals(facultyMember11) ? facultyMember4.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("HGL)]pX%+");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials15, "hi!");
        model.user.Visitor visitor19 = new model.user.Visitor(credentials15);
        model.user.Client client20 = new model.user.Client(credentials15);
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials15, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff22);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Parking Space 97 is already enabled.");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.toString();
        model.user.Visitor visitor9 = new model.user.Visitor(credentials6);
        java.lang.String str10 = credentials6.toString();
        java.lang.String str11 = credentials6.getPassword();
        java.lang.String str12 = credentials6.getType();
        model.user.Student student13 = new model.user.Student(credentials6);
        model.user.Credentials credentials14 = student13.getCredentials();
        java.lang.String str15 = student13.getStudentId();
        userRepository2.removeUser((model.user.User) student13);
        services.UserService userService17 = new services.UserService();
        boolean boolean19 = userService17.isValidEmail("SuperManager");
        repo.UserRepository userRepository20 = userService17.userRepository;
        model.user.User user21 = null;
        userRepository20.removeUser(user21);
        model.user.Credentials credentials26 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str27 = credentials26.getPassword();
        model.user.FacultyMember facultyMember28 = new model.user.FacultyMember(credentials26);
        model.user.User user29 = new model.user.User(credentials26);
        model.user.Credentials credentials30 = user29.getCredentials();
        java.lang.String str31 = credentials30.getPassword();
        model.user.Student student32 = new model.user.Student(credentials30);
        java.lang.String str33 = student32.getStudentId();
        java.lang.String str34 = student32.getStudentId();
        student32.setStudentId("(O3fsOXXJ");
        student32.validateAccount();
        userRepository20.addUser((model.user.User) student32);
        userRepository2.addUser((model.user.User) student32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials6 and credentials26", credentials6.equals(credentials26) ? credentials6.hashCode() == credentials26.hashCode() : true);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        model.parking.ParkingSpace parkingSpace6 = new model.parking.ParkingSpace((int) '#');
        parkingSpace6.setStatus(true);
        boolean boolean9 = parkingSpace6.getStatus();
        model.booking.Booking booking10 = new model.booking.Booking();
        int int11 = booking10.getStartTime();
        booking10.setEndTime((int) (short) 10);
        java.lang.String str14 = booking10.getEmail();
        booking10.setCost((double) (byte) 0);
        int int17 = booking10.getLotId();
        booking10.setCost((double) 100L);
        parkingSpace6.setBooking(booking10);
        java.lang.String str21 = booking10.toString();
        int int22 = booking10.getId();
        boolean boolean23 = clientServices0.bookParkingSpace(booking10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList25 = clientServices0.getAllUsersBookings("Success: Parking Space 35 has been enabled.");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("8hXCtaT!&");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.UserRepository userRepository6 = userService0.userRepository;
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials10, "hi!");
        model.user.Credentials credentials14 = nonFacultyStaff13.getCredentials();
        model.user.Credentials credentials15 = nonFacultyStaff13.getCredentials();
        model.user.User user16 = model.user.UserFactory.createAccount(credentials15);
        model.user.User user17 = new model.user.User(credentials15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = userService0.registerUser(user17);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        java.lang.String str15 = credentials11.toString();
        java.lang.String str16 = credentials11.getPassword();
        java.lang.String str17 = credentials11.toString();
        model.user.Visitor visitor18 = new model.user.Visitor(credentials11);
        userRepository7.removeUser((model.user.User) visitor18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor14 and visitor18", visitor14.equals(visitor18) ? visitor14.hashCode() == visitor18.hashCode() : true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user5 = new model.user.User(credentials4);
        userRepository0.addUser(user5);
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials10, "hi!");
        model.user.Credentials credentials14 = nonFacultyStaff13.getCredentials();
        model.user.Client client15 = new model.user.Client(credentials14);
        model.user.Manager manager16 = new model.user.Manager(credentials14);
        userRepository0.addUser((model.user.User) manager16);
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials21, "hi!");
        model.user.Credentials credentials25 = nonFacultyStaff24.getCredentials();
        model.user.Credentials credentials26 = nonFacultyStaff24.getCredentials();
        boolean boolean27 = nonFacultyStaff24.getValidationStatus();
        java.lang.String str28 = nonFacultyStaff24.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository0.updateUser((model.user.User) nonFacultyStaff24);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository2 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository4 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials9);
        java.lang.String str11 = facultyMember10.getFacultyId();
        java.lang.String str12 = facultyMember10.getFacultyId();
        java.lang.String str13 = facultyMember10.getFacultyName();
        java.lang.String str14 = facultyMember10.getFacultyId();
        facultyMember10.setFacultyName("Success: Parking Space 97 has been enabled.");
        facultyMember10.setFacultyName("There is no Such Parking Lot");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) facultyMember10);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("L2C@FUe6G");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("*#q!ZetoF");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Student student12 = new model.user.Student(credentials7, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student14 = new model.user.Student(credentials7, "Parking Lot 97 is already enabled.");
        student14.setStudentId("cGhuW_WL=");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager10 = new model.user.Manager(credentials7);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7, "HcpxBjAE]", "4]z?3Qs%M");
        java.lang.String str14 = credentials7.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        model.booking.Booking booking9 = clientServices0.getBookingById(97);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot12 = clientServices10.getParkingLotByAddress("Student");
        model.booking.Booking booking14 = clientServices10.getBookingById((int) (short) 0);
        boolean boolean15 = clientServices0.updateCompleteBooking(booking14);
        model.booking.Booking booking16 = new model.booking.Booking();
        booking16.setId(0);
        double double19 = booking16.getCost();
        booking16.setEmail("Parking Lot 100 is already enabled.");
        boolean boolean22 = clientServices0.updateCompleteBooking(booking16);
        java.lang.String str25 = clientServices0.getParkingSpaceById(100, 0);
        java.lang.String str28 = clientServices0.getParkingSpaceById(32, (int) (byte) 10);
        java.lang.String str31 = clientServices0.enableParkingSpaceById((int) '#', 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList33 = clientServices0.getAllUsersBookings("?bCwuuL2=");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getEndTime();
        int int2 = booking0.getStartTime();
        booking0.setStatus("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = booking0.getTotalCost();
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("*#q!ZetoF", "Parking Space 32 is already disabled.");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        java.lang.String str4 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.toString();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        java.lang.String str12 = credentials8.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials8, "Student", "Manager");
        java.lang.String str16 = facultyMember15.getFacultyName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = superManagerServices0.createAccount((model.user.User) facultyMember15);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        boolean boolean13 = clientServices0.updateBooking((int) (byte) 1, (int) '4');
        java.util.List<java.lang.String> strList14 = clientServices0.getAllLocations();
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        booking15.setEndTime((int) (short) 10);
        booking15.setCost((double) (short) 100);
        int int21 = booking15.getStartTime();
        boolean boolean22 = clientServices0.bookParkingSpace(booking15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList24 = clientServices0.getAllUsersBookings("Failure: Parking Space 32 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking(35, (int) (byte) 0);
        java.lang.String str12 = clientServices0.getParkingSpaceById(0, (int) (short) 100);
        java.lang.String str15 = clientServices0.enableParkingSpaceById((int) (short) 0, (int) (short) -1);
        java.lang.String str18 = clientServices0.enableParkingSpaceById(35, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList20 = clientServices0.getAllUsersBookings("Parking Space 35 is already disabled.");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str15 = facultyMember14.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        model.parking.ParkingSpace parkingSpace6 = new model.parking.ParkingSpace((int) '#');
        parkingSpace6.setStatus(true);
        boolean boolean9 = parkingSpace6.getStatus();
        model.booking.Booking booking10 = new model.booking.Booking();
        int int11 = booking10.getStartTime();
        booking10.setEndTime((int) (short) 10);
        java.lang.String str14 = booking10.getEmail();
        booking10.setCost((double) (byte) 0);
        int int17 = booking10.getLotId();
        booking10.setCost((double) 100L);
        parkingSpace6.setBooking(booking10);
        java.lang.String str21 = booking10.toString();
        int int22 = booking10.getId();
        boolean boolean23 = clientServices0.bookParkingSpace(booking10);
        java.util.List<java.lang.String> strList24 = clientServices0.getAllLocations();
        boolean boolean27 = clientServices0.updateBooking((int) 'a', 32);
        java.util.List<model.booking.Booking> bookingList28 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList30 = clientServices0.getAllUsersBookings("Visitor");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean11 = facultyMember10.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        double double10 = booking0.getCost();
        java.util.Date date11 = booking0.getDate();
        java.lang.String str12 = booking0.getStatus();
        booking0.setEmail("Success: Parking Lot 97 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking0.getTotalCost();
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user12 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        java.lang.String str14 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember13", facultyMember11.equals(facultyMember13) ? facultyMember11.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        repo.UserRepository userRepository9 = userService0.userRepository;
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials13);
        model.user.User user16 = new model.user.User(credentials13);
        model.user.Credentials credentials17 = user16.getCredentials();
        java.lang.String str18 = credentials17.getPassword();
        model.user.Student student20 = new model.user.Student(credentials17, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) student20);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        java.lang.String str9 = credentials3.toString();
        model.user.Client client10 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "Credentials{login='Credentials{login='hi!', password='hi!', type='hi!'}', password='Success: Parking Lot 100 has been disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student'}");
        java.lang.String str13 = nonFacultyStaff12.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("2g]O0QGM)");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("]82UgsU=G");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = credentials3.getType();
        services.UserService userService12 = new services.UserService();
        boolean boolean14 = userService12.isStrongPassword("NonFacultyStaff");
        boolean boolean16 = userService12.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository17 = userService12.userRepository;
        model.user.Credentials credentials18 = null;
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials18, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        userRepository17.addUser((model.user.User) nonFacultyStaff20);
        model.user.Credentials credentials25 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str26 = credentials25.getPassword();
        java.lang.String str27 = credentials25.toString();
        model.user.Visitor visitor28 = new model.user.Visitor(credentials25);
        java.lang.String str29 = credentials25.toString();
        model.user.FacultyMember facultyMember32 = new model.user.FacultyMember(credentials25, "Student", "Manager");
        facultyMember32.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str35 = facultyMember32.getFacultyId();
        java.lang.String str36 = facultyMember32.getFacultyName();
        model.user.Credentials credentials37 = facultyMember32.getCredentials();
        userRepository17.addUser((model.user.User) facultyMember32);
        boolean boolean39 = credentials3.equals((java.lang.Object) userRepository17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials25", credentials3.equals(credentials25) ? credentials3.hashCode() == credentials25.hashCode() : true);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        java.lang.Class<?> wildcardClass9 = facultyMember8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember8", facultyMember5.equals(facultyMember8) ? facultyMember5.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Manager");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository7 = userService0.userRepository;
        boolean boolean9 = userService0.isStrongPassword("wMB&=eDYD");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("Success: Parking Space 52 has been disabled.", "Success: Parking Space -1 has been disabled.");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllBookings();
        java.util.List<java.lang.String> strList7 = clientServices0.getAllLocations();
        java.lang.String str10 = clientServices0.disableParkingSpaceById((int) (byte) 0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = clientServices0.cancenlBooking(32);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        services.UserService userService0 = services.UserService.getInstance();
        boolean boolean2 = userService0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.toString();
        model.user.User user9 = new model.user.User(credentials6);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials6, "Parking Lot 97 is already enabled.", "Wm(OGK*DZ");
        java.lang.String str13 = credentials6.toString();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials6);
        model.user.Student student16 = new model.user.Student(credentials6, "JOS[]AzcP");
        model.user.Client client17 = new model.user.Client(credentials6);
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) nonFacultyStaff18);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        boolean boolean13 = userService0.isStrongPassword("taSI0*=tM");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.getUserByEmail("_0OsrHq9&");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("vU3-I3w?4");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.lang.String str13 = clientServices0.enableParkingSpaceById((int) 'a', 0);
        java.lang.String str16 = clientServices0.disableParkingSpaceById(35, (int) (short) 0);
        java.lang.String str19 = clientServices0.getParkingSpaceById((int) ' ', 32);
        java.lang.String str22 = clientServices0.enableParkingSpaceById((int) (short) -1, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList24 = clientServices0.getAllUsersBookings("Parking Space 32 is already enabled.");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Credentials credentials11 = student10.getCredentials();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials11);
        model.user.User user13 = new model.user.User(credentials11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor12", visitor6.equals(visitor12) ? visitor6.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getSpaceId();
        int int3 = booking0.getEndTime();
        java.lang.String str4 = booking0.getLicensePlate();
        double double5 = booking0.getCost();
        java.lang.String str6 = booking0.getEmail();
        booking0.setStartTime((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking0.getTotalCost();
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.getType();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        userRepository5.addUser((model.user.User) facultyMember14);
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        java.lang.String str21 = credentials19.toString();
        model.user.User user22 = new model.user.User(credentials19);
        java.lang.String str23 = credentials19.getType();
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials19, "Parking Space -1 is already enabled.", "Parking Lot 100 is already enabled.");
        facultyMember26.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        userRepository5.addUser((model.user.User) facultyMember26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials9 and credentials19", credentials9.equals(credentials19) ? credentials9.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        boolean boolean13 = userService0.isStrongPassword("taSI0*=tM");
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.toString();
        model.user.Visitor visitor20 = new model.user.Visitor(credentials17);
        java.lang.String str21 = credentials17.toString();
        java.lang.String str22 = credentials17.getPassword();
        java.lang.String str23 = credentials17.getType();
        model.user.Student student24 = new model.user.Student(credentials17);
        java.lang.String str25 = credentials17.getLogin();
        java.lang.String str26 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff28 = new model.user.NonFacultyStaff(credentials17, "Success: Parking Space 100 has been disabled.");
        java.lang.String str29 = nonFacultyStaff28.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = userService0.registerUser((model.user.User) nonFacultyStaff28);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        parkingSpace1.setStatus(true);
        java.lang.String str6 = parkingSpace1.disableParkingSpace();
        java.lang.String str7 = parkingSpace1.disableParkingSpace();
        model.booking.Booking booking8 = new model.booking.Booking();
        booking8.setId(0);
        double double11 = booking8.getCost();
        booking8.setEmail("Parking Lot 100 is already enabled.");
        java.util.Date date14 = booking8.getStartDateTime();
        double double15 = booking8.getCost();
        parkingSpace1.setBooking(booking8);
        java.util.Date date17 = booking8.getDate();
        booking8.setStartTime((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = booking8.getTotalCost();
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        model.user.User user13 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Credentials{login='hi!', password='hi!', type='hi!'}", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        userRepository3.removeUser(user13);
        java.util.List<model.user.User> userList15 = userRepository3.getUsers();
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        java.lang.String str21 = credentials19.toString();
        model.user.Visitor visitor22 = new model.user.Visitor(credentials19);
        java.lang.String str23 = credentials19.toString();
        java.lang.String str24 = credentials19.getPassword();
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials19);
        model.user.Manager manager26 = new model.user.Manager(credentials19);
        userRepository3.addUser((model.user.User) manager26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials19", credentials7.equals(credentials19) ? credentials7.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        model.user.User user12 = new model.user.User(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials7);
        model.user.User user14 = new model.user.User(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff13", nonFacultyStaff6.equals(nonFacultyStaff13) ? nonFacultyStaff6.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.getUserByEmail("Y@mMCI7!u");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        boolean boolean10 = superManagerServices0.isValidEmail("");
        boolean boolean12 = superManagerServices0.isStrongPassword("B7Q7?T8bL");
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials16);
        java.lang.String str18 = facultyMember17.getFacultyId();
        java.lang.String str19 = facultyMember17.getFacultyId();
        java.lang.String str20 = facultyMember17.getFacultyName();
        facultyMember17.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        facultyMember17.setFacultyId("Y%XCkmT1Q");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = superManagerServices0.createAccount((model.user.User) facultyMember17);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        model.user.Credentials credentials3 = new model.user.Credentials("There is no Such Parking Lot", "", "Visitor");
        model.user.Client client4 = new model.user.Client(credentials3);
        repo.RepositoryProvider repositoryProvider5 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository6 = repositoryProvider5.getBookingRepository();
        repo.BookingRepository bookingRepository7 = repositoryProvider5.getBookingRepository();
        repo.BookingRepository bookingRepository8 = repositoryProvider5.getBookingRepository();
        repo.ParkingRepository parkingRepository9 = repositoryProvider5.getParkingRepository();
        repo.UserRepository userRepository10 = repositoryProvider5.getUserRepository();
        repo.ParkingRepository parkingRepository11 = repositoryProvider5.getParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList12 = parkingRepository11.getAllParkingLots();
        boolean boolean13 = credentials3.equals((java.lang.Object) parkingLotList12);
        model.user.Client client14 = new model.user.Client(credentials3);
        model.user.Credentials credentials15 = client14.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client14", client4.equals(client14) ? client4.hashCode() == client14.hashCode() : true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        services.UserService userService11 = services.UserService.getInstance();
        repo.UserRepository userRepository12 = userService11.userRepository;
        boolean boolean13 = visitor10.equals((java.lang.Object) userService11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor10", visitor6.equals(visitor10) ? visitor6.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        java.util.List<model.user.User> userList10 = userRepository3.getUsers();
        java.util.List<model.user.User> userList11 = userRepository3.getUsers();
        java.util.List<model.user.User> userList12 = userRepository3.getUsers();
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        java.lang.String str18 = credentials16.toString();
        model.user.Visitor visitor19 = new model.user.Visitor(credentials16);
        java.lang.String str20 = credentials16.toString();
        java.lang.String str21 = credentials16.getPassword();
        model.user.Client client22 = new model.user.Client(credentials16);
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials16, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) facultyMember25);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        model.user.Credentials credentials3 = new model.user.Credentials("Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str4 = credentials3.getLogin();
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "ZIt(w3LM]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember8", facultyMember6.equals(facultyMember8) ? facultyMember6.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Success: Parking Space 1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        facultyMember9.setFacultyName("+O3S!#50S");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember9", facultyMember5.equals(facultyMember9) ? facultyMember5.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isStrongPassword("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.loginUser("Parking Space 0 is already enabled.", "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        repo.BookingRepository bookingRepository7 = new repo.BookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList8 = bookingRepository7.getAllBookings();
        repo.BookingRepository bookingRepository9 = new repo.BookingRepository();
        model.booking.Booking booking10 = new model.booking.Booking();
        int int11 = booking10.getStartTime();
        booking10.setEndTime((int) (short) 10);
        java.lang.String str14 = booking10.getEmail();
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        booking15.setEndTime((int) (short) 10);
        java.lang.String str19 = booking15.getEmail();
        booking15.setCost((double) (byte) 0);
        model.booking.Booking booking22 = new model.booking.Booking();
        int int23 = booking22.getStartTime();
        int int24 = booking22.getId();
        booking22.setEndTime((int) 'a');
        model.booking.Booking booking27 = new model.booking.Booking();
        int int28 = booking27.getStartTime();
        booking27.setEndTime((int) (short) 10);
        java.lang.String str31 = booking27.getEmail();
        booking27.setCost((double) (byte) 0);
        int int34 = booking27.getLotId();
        booking27.setEmail("Manager");
        model.booking.Booking booking37 = new model.booking.Booking();
        int int38 = booking37.getStartTime();
        int int39 = booking37.getId();
        model.booking.Booking booking40 = new model.booking.Booking();
        int int41 = booking40.getStartTime();
        int int42 = booking40.getId();
        booking40.setEndTime((int) 'a');
        model.booking.Booking booking45 = new model.booking.Booking();
        int int46 = booking45.getStartTime();
        booking45.setEndTime((int) (short) 10);
        booking45.setCost((double) (short) 100);
        model.booking.Booking[] bookingArray51 = new model.booking.Booking[] { booking10, booking15, booking22, booking27, booking37, booking40, booking45 };
        java.util.ArrayList<model.booking.Booking> bookingList52 = new java.util.ArrayList<model.booking.Booking>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<model.booking.Booking>) bookingList52, bookingArray51);
        bookingRepository9.updateBookings((java.util.List<model.booking.Booking>) bookingList52);
        bookingRepository7.updateBookings((java.util.List<model.booking.Booking>) bookingList52);
        services.ClientServices clientServices56 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot58 = clientServices56.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList59 = clientServices56.getAllLocations();
        java.util.List<model.booking.Booking> bookingList60 = clientServices56.getAllBookings();
        bookingRepository7.updateBookings(bookingList60);
        boolean boolean62 = credentials3.equals((java.lang.Object) bookingRepository7);
        model.user.User user63 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember64 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user63", user6.equals(user63) ? user6.hashCode() == user63.hashCode() : true);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        java.lang.String str4 = superManagerServices0.generateRandomEmail();
        java.lang.String str5 = superManagerServices0.generateRandomEmail();
        java.lang.String str6 = superManagerServices0.generateStrongPassword();
        java.lang.String str7 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials11);
        java.lang.String str13 = facultyMember12.getFacultyId();
        facultyMember12.validateAccount();
        model.user.Credentials credentials15 = facultyMember12.getCredentials();
        java.lang.String str16 = facultyMember12.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = superManagerServices0.createAccount((model.user.User) facultyMember12);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials10 = nonFacultyStaff6.getCredentials();
        services.ClientServices clientServices11 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot13 = clientServices11.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList14 = clientServices11.getAllBookings();
        java.lang.String str17 = clientServices11.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str20 = clientServices11.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking22 = clientServices11.getBookingById(100);
        java.util.List<java.lang.String> strList23 = clientServices11.getAllLocations();
        java.util.List<model.booking.Booking> bookingList24 = clientServices11.getAllBookings();
        boolean boolean25 = credentials10.equals((java.lang.Object) clientServices11);
        model.parking.ParkingLot parkingLot27 = clientServices11.getParkingLotByAddress("&eLd?)dY$");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList29 = clientServices11.getAllUsersBookings("_0OsrHq9&");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        booking11.setEndTime((int) (short) 10);
        java.lang.String str15 = booking11.getEmail();
        java.util.Date date16 = booking11.getStartDateTime();
        int int17 = booking11.getTotalHours();
        booking11.setEndTime((int) ' ');
        boolean boolean20 = clientServices0.updateCompleteBooking(booking11);
        java.lang.String str23 = clientServices0.disableParkingSpaceById((int) (byte) 0, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList25 = clientServices0.getAllUsersBookings("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.getUserByEmail("hLihvheFq");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 1 is already disabled.", "X?EhgrKDV", "Success: Parking Lot -1 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "&jn[e]&j%");
        model.user.Student student6 = new model.user.Student(credentials3);
        java.lang.String str7 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student6", student5.equals(student6) ? student5.hashCode() == student6.hashCode() : true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client12 = new model.user.Client(credentials3);
        java.lang.String str13 = credentials3.getType();
        model.user.Client client14 = new model.user.Client(credentials3);
        java.lang.String str15 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client12 and client14", client12.equals(client14) ? client12.hashCode() == client14.hashCode() : true);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        model.booking.Booking booking7 = new model.booking.Booking();
        int int8 = booking7.getStartTime();
        booking7.setEndTime((int) (short) 10);
        java.lang.String str11 = booking7.getEmail();
        java.util.Date date12 = booking7.getStartDateTime();
        boolean boolean13 = clientServices0.bookParkingSpace(booking7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = clientServices0.updateBooking((int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        model.user.Client client8 = new model.user.Client("Success: Parking Lot -1 has been disabled.", "", "lWu#FFEES");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = userService0.registerUser((model.user.User) client8);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        java.util.List<model.user.User> userList6 = userRepository5.getUsers();
        java.util.List<model.user.User> userList7 = userRepository5.getUsers();
        model.user.User user11 = new model.user.User("lWu#FFEES", "Success: Parking Space 10 has been disabled.", "Credentials{login='Success: Parking Lot 100 has been disabled.', password='X5G?ZJ!c@', type='Parking Lot 97 is already enabled.'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser(user11);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository3 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.User user12 = new model.user.User(credentials9);
        model.user.Credentials credentials13 = user12.getCredentials();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials13);
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials13);
        nonFacultyStaff15.setRole("Success: Parking Lot 32 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) nonFacultyStaff15);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        java.util.List<model.user.User> userList4 = userRepository3.getUsers();
        services.UserService userService5 = new services.UserService();
        boolean boolean7 = userService5.isValidEmail("SuperManager");
        boolean boolean9 = userService5.isStrongPassword("SuperManager");
        boolean boolean11 = userService5.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean13 = userService5.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository14 = userService5.userRepository;
        java.util.List<model.user.User> userList15 = userRepository14.getUsers();
        java.util.List<model.user.User> userList16 = userRepository14.getUsers();
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        java.lang.String str22 = credentials20.toString();
        model.user.User user23 = new model.user.User(credentials20);
        java.lang.String str24 = credentials20.getType();
        model.user.FacultyMember facultyMember27 = new model.user.FacultyMember(credentials20, "Parking Space -1 is already enabled.", "Parking Lot 100 is already enabled.");
        facultyMember27.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        userRepository14.removeUser((model.user.User) facultyMember27);
        java.lang.String str31 = facultyMember27.getFacultyId();
        userRepository3.removeUser((model.user.User) facultyMember27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on userList4 and userList15", userList4.equals(userList15) ? userList4.hashCode() == userList15.hashCode() : true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking6 = new model.booking.Booking();
        int int7 = booking6.getStartTime();
        booking6.setEndTime((int) (short) 10);
        java.lang.String str10 = booking6.getEmail();
        booking6.setCost((double) (byte) 0);
        int int13 = booking6.getLotId();
        booking6.setEndTime((int) (short) 100);
        booking6.setId((-1));
        booking6.setCost((double) (short) 100);
        booking6.setLicensePlate("Success: Parking Space 100 has been disabled.");
        booking6.setId((int) (byte) 1);
        boolean boolean24 = clientServices0.bookParkingSpace(booking6);
        java.lang.String str27 = clientServices0.disableParkingSpaceById((int) (byte) 1, (int) '#');
        model.booking.Booking booking28 = new model.booking.Booking();
        int int29 = booking28.getStartTime();
        int int30 = booking28.getSpaceId();
        int int31 = booking28.getEndTime();
        java.lang.String str32 = booking28.getLicensePlate();
        double double33 = booking28.getCost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = clientServices0.updateCompleteBooking(booking28);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = superManagerServices0.isStrongPassword("=B3fAbMGq");
        boolean boolean15 = superManagerServices0.isValidEmail("&jn[e]&j%");
        java.lang.String str16 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials20);
        model.user.User user23 = new model.user.User(credentials20);
        model.user.Credentials credentials24 = user23.getCredentials();
        java.lang.String str25 = credentials24.getPassword();
        model.user.Student student26 = new model.user.Student(credentials24);
        java.lang.String str27 = student26.getStudentId();
        java.lang.String str28 = student26.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = superManagerServices0.createAccount((model.user.User) student26);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("", "There is no Such Parking Lot");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.getUserByEmail("&jn[e]&j%");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user7 = new model.user.User(credentials6);
        userRepository2.addUser(user7);
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        java.lang.String str14 = credentials12.toString();
        model.user.Visitor visitor15 = new model.user.Visitor(credentials12);
        model.user.Client client16 = new model.user.Client(credentials12);
        model.user.Student student18 = new model.user.Student(credentials12, "Student");
        userRepository2.addUser((model.user.User) student18);
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff26 = new model.user.NonFacultyStaff(credentials23, "hi!");
        model.user.Credentials credentials27 = nonFacultyStaff26.getCredentials();
        model.user.User user28 = model.user.UserFactory.createAccount(credentials27);
        model.user.Student student29 = new model.user.Student(credentials27);
        model.user.Visitor visitor30 = new model.user.Visitor(credentials27);
        model.user.FacultyMember facultyMember31 = new model.user.FacultyMember(credentials27);
        model.user.Credentials credentials32 = facultyMember31.getCredentials();
        userRepository2.removeUser((model.user.User) facultyMember31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials12 and credentials23", credentials12.equals(credentials23) ? credentials12.hashCode() == credentials23.hashCode() : true);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.getUserByEmail("Qw$TanXAv");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllUsersBookings("2g]O0QGM)");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor12", visitor6.equals(visitor12) ? visitor6.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Student student12 = new model.user.Student(credentials7, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student14 = new model.user.Student(credentials7, "Parking Lot 97 is already enabled.");
        model.user.Client client15 = new model.user.Client(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        boolean boolean8 = user7.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user7", user6.equals(user7) ? user6.hashCode() == user7.hashCode() : true);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        java.lang.String str10 = booking0.toString();
        java.util.Date date11 = booking0.getDate();
        int int12 = booking0.getSpaceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking0.getTotalCost();
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.booking.Booking booking2 = clientServices0.getBookingById((int) (short) 1);
        model.booking.Booking booking4 = clientServices0.getBookingById((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllUsersBookings("]82UgsU=G");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Credentials{login='Manager', password='Success: Parking Space 0 has been disabled.', type='Success: Parking Lot 32 has been disabled.'}");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.lang.String str10 = booking0.getLicensePlate();
        booking0.setLicensePlate("(O3fsOXXJ");
        java.lang.String str13 = booking0.toString();
        java.util.Date date14 = booking0.getEndDateTime();
        booking0.setEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.util.Date date17 = booking0.getDate();
        booking0.setEndTime((int) (short) 10);
        java.util.Date date20 = booking0.getDate();
        booking0.setCost((double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = booking0.getTotalCost();
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        java.lang.String str4 = superManagerServices0.generateRandomEmail();
        java.lang.String str5 = superManagerServices0.generateRandomEmail();
        java.lang.String str6 = superManagerServices0.generateStrongPassword();
        java.lang.String str7 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        visitor14.validateAccount();
        boolean boolean16 = visitor14.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = superManagerServices0.createAccount((model.user.User) visitor14);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        repo.UserRepository userRepository12 = userService0.userRepository;
        java.util.List<model.user.User> userList13 = userRepository12.getUsers();
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.toString();
        model.user.Visitor visitor20 = new model.user.Visitor(credentials17);
        java.lang.String str21 = credentials17.toString();
        java.lang.String str22 = credentials17.getPassword();
        java.lang.String str23 = credentials17.toString();
        model.user.Client client24 = new model.user.Client(credentials17);
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials17);
        userRepository12.addUser((model.user.User) nonFacultyStaff25);
        repo.RepositoryProvider repositoryProvider27 = new repo.RepositoryProvider();
        repo.UserRepository userRepository28 = repositoryProvider27.getUserRepository();
        repo.UserRepository userRepository29 = repositoryProvider27.getUserRepository();
        model.user.Credentials credentials33 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str34 = credentials33.getPassword();
        java.lang.String str35 = credentials33.getType();
        model.user.Manager manager36 = new model.user.Manager(credentials33);
        userRepository29.removeUser((model.user.User) manager36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository12.updateUser((model.user.User) manager36);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("=K*eY67RK");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        java.lang.String str10 = booking0.getEmail();
        java.util.Date date11 = booking0.getStartDateTime();
        int int12 = booking0.getId();
        int int13 = booking0.getTotalHours();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking0.getTotalCost();
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.loginUser("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null", "");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setEmail("(O3fsOXXJ");
        booking0.setEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.util.Date date14 = booking0.getEndDateTime();
        booking0.setStartTime(0);
        int int17 = booking0.getTotalHours();
        int int18 = booking0.getStartTime();
        booking0.setEndTime((int) '#');
        booking0.setCost(75000.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = booking0.getTotalCost();
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("?qqRirU!a");
        boolean boolean7 = userService0.isValidEmail("1bR(76zCD");
        boolean boolean9 = userService0.isStrongPassword("");
        boolean boolean11 = userService0.isStrongPassword("tpQo&#L]V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.getUserByEmail("xQ)b!n)sD");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Visitor visitor4 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor5 = new model.user.Visitor(credentials3);
        java.lang.String str6 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor4 and visitor5", visitor4.equals(visitor5) ? visitor4.hashCode() == visitor5.hashCode() : true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        user7.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user7", user6.equals(user7) ? user6.hashCode() == user7.hashCode() : true);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        repo.UserRepository userRepository12 = new repo.UserRepository();
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials16);
        facultyMember17.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str20 = facultyMember17.getFacultyId();
        userRepository12.addUser((model.user.User) facultyMember17);
        java.lang.String str22 = facultyMember17.getFacultyName();
        java.lang.String str23 = facultyMember17.getFacultyId();
        facultyMember17.setFacultyName("Student");
        model.parking.ParkingSpace parkingSpace27 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking28 = new model.booking.Booking();
        int int29 = booking28.getStartTime();
        booking28.setEndTime((int) (short) 10);
        java.lang.String str32 = booking28.getEmail();
        booking28.setCost((double) (byte) 0);
        parkingSpace27.setBooking(booking28);
        model.sensor.Sensor sensor36 = parkingSpace27.getSensor();
        boolean boolean37 = parkingSpace27.getStatus();
        boolean boolean38 = facultyMember17.equals((java.lang.Object) boolean37);
        facultyMember17.validateAccount();
        facultyMember17.setFacultyId("X5G?ZJ!c@");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = userService0.registerUser((model.user.User) facultyMember17);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "(O3fsOXXJ", "Success: Parking Space 100 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Manager manager13 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        model.parking.ParkingLot parkingLot14 = clientServices0.getParkingLotByAddress("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        boolean boolean17 = clientServices0.updateBooking(10, 97);
        model.booking.Booking booking18 = new model.booking.Booking();
        int int19 = booking18.getStartTime();
        booking18.setEndTime((int) (short) 10);
        java.lang.String str22 = booking18.getEmail();
        java.util.Date date23 = booking18.getStartDateTime();
        boolean boolean24 = clientServices0.updateCompleteBooking(booking18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList26 = clientServices0.getAllUsersBookings("Credentials{login='Manager', password='Success: Parking Space 0 has been disabled.', type='Success: Parking Lot 32 has been disabled.'}");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((-90), 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList11 = clientServices0.getAllUsersBookings("wF_bj[=yL");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        booking11.setEndTime((int) (short) 10);
        java.lang.String str15 = booking11.getEmail();
        java.util.Date date16 = booking11.getStartDateTime();
        int int17 = booking11.getTotalHours();
        booking11.setEndTime((int) ' ');
        boolean boolean20 = clientServices0.updateCompleteBooking(booking11);
        java.lang.String str23 = clientServices0.disableParkingSpaceById((int) (short) 100, (int) (byte) 100);
        model.booking.Booking booking24 = new model.booking.Booking();
        int int25 = booking24.getEndTime();
        int int26 = booking24.getStartTime();
        booking24.setStatus("");
        int int29 = booking24.getId();
        java.util.Date date30 = booking24.getStartDateTime();
        booking24.setEndTime(100);
        boolean boolean33 = clientServices0.bookParkingSpace(booking24);
        java.util.List<model.booking.Booking> bookingList34 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean36 = clientServices0.cancenlBooking((-87));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        facultyMember7.setFacultyName("Credentials{login='Credentials{login='hi!', password='hi!', type='hi!'}', password='Success: Parking Lot 100 has been disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember7", facultyMember5.equals(facultyMember7) ? facultyMember5.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.lang.String str10 = booking0.getLicensePlate();
        booking0.setLicensePlate("(O3fsOXXJ");
        java.lang.String str13 = booking0.toString();
        java.util.Date date14 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking0.getTotalCost();
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        booking0.setEndTime((int) (byte) 100);
        booking0.setId((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = booking0.getTotalCost();
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials8, "cjn@voHRz");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.User user8 = new model.user.User("Parking Space 1 is already disabled.", "cgJd5wr]v", "#m2s(PF$O");
        userRepository4.removeUser(user8);
        model.user.User user13 = new model.user.User("Parking Space 0 is already enabled.", "Parking Space 35 is already enabled.", "Parking Lot 97 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository4.updateUser(user13);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        repo.ParkingRepository parkingRepository9 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList10 = parkingRepository9.getAllParkingLots();
        model.parking.ParkingLot parkingLot13 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str14 = parkingLot13.enableParkingLot();
        java.lang.String str15 = parkingLot13.enableParkingLot();
        model.parking.ParkingLot parkingLot18 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean19 = parkingLot18.getStatus();
        boolean boolean20 = parkingLot18.getStatus();
        parkingLot18.setLotID((int) (byte) 100);
        model.parking.ParkingLot parkingLot25 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean26 = parkingLot25.getStatus();
        java.lang.String str27 = parkingLot25.getLocation();
        model.parking.ParkingLot parkingLot30 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean31 = parkingLot30.getStatus();
        boolean boolean32 = parkingLot30.getStatus();
        parkingLot30.setLotID((int) (byte) 100);
        int int35 = parkingLot30.getLotID();
        boolean boolean36 = parkingLot30.getStatus();
        model.parking.ParkingLot parkingLot39 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList40 = parkingLot39.getParkingSpaces();
        int int41 = parkingLot39.getLotID();
        model.parking.ParkingLot parkingLot44 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean45 = parkingLot44.getStatus();
        boolean boolean46 = parkingLot44.getStatus();
        parkingLot44.setLotID((int) (byte) 100);
        int int49 = parkingLot44.getLotID();
        model.parking.ParkingLot[] parkingLotArray50 = new model.parking.ParkingLot[] { parkingLot13, parkingLot18, parkingLot25, parkingLot30, parkingLot39, parkingLot44 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList51 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList51, parkingLotArray50);
        parkingRepository9.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList51);
        services.ManagerServices managerServices54 = services.ManagerServices.getInstance();
        managerServices54.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList56 = managerServices54.getAllParkingLots();
        managerServices54.loadLots();
        java.util.List<model.parking.ParkingLot> parkingLotList58 = services.ManagerServices.parkingLots;
        managerServices54.updateParkingLots(parkingLotList58);
        parkingRepository9.updateParkingLots(parkingLotList58);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList61 = parkingRepository9.getAllParkingLots();
        services.ManagerServices.parkingLots = parkingLotList61;
        boolean boolean63 = nonFacultyStaff8.equals((java.lang.Object) parkingLotList61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        model.user.Credentials credentials3 = new model.user.Credentials("Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str4 = credentials3.getLogin();
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        facultyMember8.setFacultyName("1Uy3Mwvq6");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember8", facultyMember6.equals(facultyMember8) ? facultyMember6.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.util.Date date5 = booking0.getStartDateTime();
        int int6 = booking0.getTotalHours();
        booking0.setEndTime((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking0.getTotalCost();
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Client client11 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials7);
        model.user.Client client13 = new model.user.Client(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        model.user.User user13 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Credentials{login='hi!', password='hi!', type='hi!'}", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        userRepository3.removeUser(user13);
        java.util.List<model.user.User> userList15 = userRepository3.getUsers();
        java.util.List<model.user.User> userList16 = userRepository3.getUsers();
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        java.lang.String str22 = credentials20.toString();
        model.user.Visitor visitor23 = new model.user.Visitor(credentials20);
        visitor23.validateAccount();
        boolean boolean25 = visitor23.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) visitor23);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        java.lang.String str12 = clientServices0.getParkingSpaceById(100, 100);
        java.lang.String str15 = clientServices0.disableParkingSpaceById((int) (short) 10, (int) (byte) 100);
        boolean boolean18 = clientServices0.updateBooking((int) 'a', (int) ' ');
        boolean boolean21 = clientServices0.updateBooking((int) (short) 0, 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = clientServices0.cancenlBooking(97);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "(O3fsOXXJ", "Success: Parking Space 100 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Client client13 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        model.booking.Booking booking9 = clientServices0.getBookingById(97);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot12 = clientServices10.getParkingLotByAddress("Student");
        model.booking.Booking booking14 = clientServices10.getBookingById((int) (short) 0);
        boolean boolean15 = clientServices0.updateCompleteBooking(booking14);
        java.lang.String str18 = clientServices0.enableParkingSpaceById((int) (byte) 1, (int) (short) 10);
        java.lang.String str21 = clientServices0.getParkingSpaceById(32, (int) '4');
        model.parking.ParkingLot parkingLot23 = clientServices0.getParkingLotByAddress("\nid             1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   Success: Parking Space 100 has been disabled.'\ncost           100.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList25 = clientServices0.getAllUsersBookings("nAVofek+=");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        repo.UserRepository userRepository11 = userService0.userRepository;
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials15);
        facultyMember16.setFacultyName("Parking Lot 97 is already enabled.");
        facultyMember16.setFacultyId("Success: Parking Space 97 has been enabled.");
        boolean boolean21 = facultyMember16.getValidationStatus();
        userRepository11.removeUser((model.user.User) facultyMember16);
        model.user.Credentials credentials26 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str27 = credentials26.getLogin();
        strategy.StudentParkingRate studentParkingRate28 = new strategy.StudentParkingRate();
        double double30 = studentParkingRate28.calculateRate((double) 1.0f);
        boolean boolean31 = credentials26.equals((java.lang.Object) 1.0f);
        model.user.User user32 = new model.user.User(credentials26);
        model.user.Student student33 = new model.user.Student(credentials26);
        model.user.FacultyMember facultyMember34 = new model.user.FacultyMember(credentials26);
        java.lang.String str35 = credentials26.getPassword();
        model.user.FacultyMember facultyMember38 = new model.user.FacultyMember(credentials26, "", "A%v5&YzsA");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository11.updateUser((model.user.User) facultyMember38);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.getPassword();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.User user8 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        java.lang.String str14 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student13", student11.equals(student13) ? student11.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        java.lang.String str16 = booking12.getEmail();
        java.lang.String str17 = booking12.toString();
        boolean boolean18 = credentials3.equals((java.lang.Object) booking12);
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials3);
        facultyMember19.setFacultyId("]cT(-?mBj");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember19", facultyMember11.equals(facultyMember19) ? facultyMember11.hashCode() == facultyMember19.hashCode() : true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        booking2.setCost((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = booking2.getTotalCost();
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        java.util.List<model.booking.Booking> bookingList12 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = clientServices0.cancenlBooking(10);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        repo.UserRepository userRepository12 = userService0.userRepository;
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        java.lang.String str18 = credentials16.getType();
        java.lang.String str19 = credentials16.toString();
        java.lang.String str20 = credentials16.getLogin();
        model.user.User user21 = model.user.UserFactory.createAccount(credentials16);
        model.user.Client client22 = new model.user.Client(credentials16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository12.updateUser((model.user.User) client22);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean7 = userService0.isStrongPassword("Visitor");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("Y%XCkmT1Q", "*#q!ZetoF");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("R14et$0r@", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.parking.ParkingLot parkingLot4 = clientServices0.getParkingLotByAddress("Parking Space 35 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllUsersBookings("YEu*&Uy])");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        java.lang.String str4 = superManagerServices0.generateStrongPassword();
        boolean boolean6 = superManagerServices0.isValidEmail("Parking Lot 100 is already enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        java.lang.String str12 = facultyMember11.getFacultyId();
        java.lang.String str13 = facultyMember11.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = superManagerServices0.createAccount((model.user.User) facultyMember11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "&eLd?)dY$", "Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.");
        model.user.User user16 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember15", facultyMember12.equals(facultyMember15) ? facultyMember12.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Student");
        java.lang.String str10 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        booking13.setEndTime((int) (short) 10);
        java.lang.String str17 = booking13.getEmail();
        booking13.setCost((double) (byte) 0);
        int int20 = booking13.getLotId();
        booking13.setEndTime((int) (short) 100);
        booking13.setEmail("(O3fsOXXJ");
        booking13.setEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.util.Date date27 = booking13.getEndDateTime();
        int int28 = booking13.getSpaceId();
        boolean boolean29 = nonFacultyStaff12.equals((java.lang.Object) booking13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff12", nonFacultyStaff11.equals(nonFacultyStaff12) ? nonFacultyStaff11.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Space -1 has been disabled.");
        model.user.Client client19 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember18", facultyMember11.equals(facultyMember18) ? facultyMember11.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 97 is already disabled.");
        model.user.Student student9 = new model.user.Student(credentials3);
        java.lang.String str10 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student9", student8.equals(student9) ? student8.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials8, "t3=jyxeE5", "#m2s(PF$O");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        java.lang.String str13 = clientServices0.getParkingSpaceById((int) (short) 0, (int) '#');
        java.util.List<model.booking.Booking> bookingList14 = clientServices0.getAllBookings();
        java.lang.String str17 = clientServices0.disableParkingSpaceById(52, (int) '#');
        services.ClientServices clientServices18 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot20 = clientServices18.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList21 = clientServices18.getAllBookings();
        java.lang.String str24 = clientServices18.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str27 = clientServices18.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking29 = clientServices18.getBookingById(100);
        java.util.List<java.lang.String> strList30 = clientServices18.getAllLocations();
        model.booking.Booking booking31 = new model.booking.Booking();
        int int32 = booking31.getStartTime();
        int int33 = booking31.getId();
        int int34 = booking31.getTotalHours();
        java.util.Date date35 = booking31.getEndDateTime();
        int int36 = booking31.getTotalHours();
        boolean boolean37 = clientServices18.updateCompleteBooking(booking31);
        boolean boolean38 = clientServices0.updateCompleteBooking(booking31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList40 = clientServices0.getAllUsersBookings("lWu#FFEES");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isValidEmail("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean8 = superManagerServices0.isValidEmail("Success: Parking Space -1 has been enabled.");
        model.user.Client client12 = new model.user.Client("b0K0Td]sJ", "Success: Parking Space 97 has been enabled.", "Parking Lot 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = superManagerServices0.createAccount((model.user.User) client12);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("qS46Qm6yT");
        boolean boolean13 = superManagerServices0.isStrongPassword("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials17);
        model.user.User user20 = new model.user.User(credentials17);
        model.user.Credentials credentials21 = user20.getCredentials();
        model.user.Client client22 = new model.user.Client(credentials21);
        services.SuperManagerServices superManagerServices23 = services.SuperManagerServices.getInstance();
        java.lang.String str24 = superManagerServices23.generateRandomEmail();
        boolean boolean26 = superManagerServices23.isValidEmail("FacultyMember");
        boolean boolean28 = superManagerServices23.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean30 = superManagerServices23.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean32 = superManagerServices23.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        boolean boolean33 = client22.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        boolean boolean34 = client22.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = superManagerServices0.createAccount((model.user.User) client22);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setId((-1));
        java.util.Date date12 = booking0.getDate();
        java.util.Date date13 = booking0.getEndDateTime();
        java.lang.String str14 = booking0.toString();
        java.util.Date date15 = booking0.getStartDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = booking0.getTotalCost();
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Client client11 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials7);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("Student");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = clientServices0.cancenlBooking((int) (byte) 100);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("HGL)]pX%+");
        java.lang.String str12 = superManagerServices0.generateStrongPassword();
        boolean boolean14 = superManagerServices0.isStrongPassword("%PKSxWW&U");
        boolean boolean16 = superManagerServices0.isValidEmail("SuperManager");
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        java.lang.String str22 = credentials20.toString();
        model.user.Visitor visitor23 = new model.user.Visitor(credentials20);
        model.user.Client client24 = new model.user.Client(credentials20);
        model.user.Student student26 = new model.user.Student(credentials20, "Student");
        student26.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = superManagerServices0.createAccount((model.user.User) student26);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials9);
        java.lang.String str11 = facultyMember10.getFacultyId();
        java.lang.String str12 = facultyMember10.getFacultyId();
        java.lang.String str13 = facultyMember10.getFacultyName();
        java.lang.String str14 = facultyMember10.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) facultyMember10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("#m2s(PF$O");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(10, (int) '4');
        model.parking.ParkingLot parkingLot8 = clientServices0.getParkingLotByAddress("9z6wsHuxQ");
        model.booking.Booking booking10 = clientServices0.getBookingById(52);
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = clientServices0.cancenlBooking(100);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Student student12 = new model.user.Student(credentials7, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student14 = new model.user.Student(credentials7, "Parking Lot 97 is already enabled.");
        model.user.User user15 = model.user.UserFactory.createAccount(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean10 = superManagerServices0.isValidEmail("cgJd5wr]v");
        services.UserService userService11 = new services.UserService();
        boolean boolean13 = userService11.isValidEmail("SuperManager");
        boolean boolean15 = userService11.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository16 = userService11.userRepository;
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff23 = new model.user.NonFacultyStaff(credentials20, "hi!");
        model.user.Credentials credentials24 = nonFacultyStaff23.getCredentials();
        nonFacultyStaff23.setRole("Parking Lot 97 is already enabled.");
        userRepository16.addUser((model.user.User) nonFacultyStaff23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff23);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        model.booking.Booking booking8 = new model.booking.Booking();
        booking8.setId(0);
        booking8.setEmail("Student");
        java.util.Date date13 = booking8.getStartDateTime();
        boolean boolean14 = clientServices0.updateCompleteBooking(booking8);
        booking8.setStartTime((int) (short) 10);
        booking8.setStartTime((int) (byte) -1);
        java.lang.String str19 = booking8.getStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = booking8.getTotalCost();
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.toString();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        java.lang.Class<?> wildcardClass11 = credentials3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor10", visitor6.equals(visitor10) ? visitor6.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository8 = repositoryProvider0.getUserRepository();
        model.user.Client client12 = new model.user.Client("Success: Parking Space 97 has been disabled.", "Success: Parking Space 100 has been disabled.", "Parking Space 35 is already enabled.");
        client12.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository8.updateUser((model.user.User) client12);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        model.user.User user8 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.lang.String str11 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff8 and nonFacultyStaff10", nonFacultyStaff8.equals(nonFacultyStaff10) ? nonFacultyStaff8.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        repo.BookingRepository bookingRepository7 = new repo.BookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList8 = bookingRepository7.getAllBookings();
        repo.BookingRepository bookingRepository9 = new repo.BookingRepository();
        model.booking.Booking booking10 = new model.booking.Booking();
        int int11 = booking10.getStartTime();
        booking10.setEndTime((int) (short) 10);
        java.lang.String str14 = booking10.getEmail();
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        booking15.setEndTime((int) (short) 10);
        java.lang.String str19 = booking15.getEmail();
        booking15.setCost((double) (byte) 0);
        model.booking.Booking booking22 = new model.booking.Booking();
        int int23 = booking22.getStartTime();
        int int24 = booking22.getId();
        booking22.setEndTime((int) 'a');
        model.booking.Booking booking27 = new model.booking.Booking();
        int int28 = booking27.getStartTime();
        booking27.setEndTime((int) (short) 10);
        java.lang.String str31 = booking27.getEmail();
        booking27.setCost((double) (byte) 0);
        int int34 = booking27.getLotId();
        booking27.setEmail("Manager");
        model.booking.Booking booking37 = new model.booking.Booking();
        int int38 = booking37.getStartTime();
        int int39 = booking37.getId();
        model.booking.Booking booking40 = new model.booking.Booking();
        int int41 = booking40.getStartTime();
        int int42 = booking40.getId();
        booking40.setEndTime((int) 'a');
        model.booking.Booking booking45 = new model.booking.Booking();
        int int46 = booking45.getStartTime();
        booking45.setEndTime((int) (short) 10);
        booking45.setCost((double) (short) 100);
        model.booking.Booking[] bookingArray51 = new model.booking.Booking[] { booking10, booking15, booking22, booking27, booking37, booking40, booking45 };
        java.util.ArrayList<model.booking.Booking> bookingList52 = new java.util.ArrayList<model.booking.Booking>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<model.booking.Booking>) bookingList52, bookingArray51);
        bookingRepository9.updateBookings((java.util.List<model.booking.Booking>) bookingList52);
        bookingRepository7.updateBookings((java.util.List<model.booking.Booking>) bookingList52);
        services.ClientServices clientServices56 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot58 = clientServices56.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList59 = clientServices56.getAllLocations();
        java.util.List<model.booking.Booking> bookingList60 = clientServices56.getAllBookings();
        bookingRepository7.updateBookings(bookingList60);
        boolean boolean62 = credentials3.equals((java.lang.Object) bookingRepository7);
        model.user.User user63 = new model.user.User(credentials3);
        services.ClientServices clientServices64 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot66 = clientServices64.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList67 = clientServices64.getAllBookings();
        java.lang.String str70 = clientServices64.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str73 = clientServices64.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking75 = clientServices64.getBookingById(100);
        java.util.List<java.lang.String> strList76 = clientServices64.getAllLocations();
        model.booking.Booking booking77 = new model.booking.Booking();
        int int78 = booking77.getStartTime();
        int int79 = booking77.getId();
        int int80 = booking77.getTotalHours();
        java.util.Date date81 = booking77.getEndDateTime();
        int int82 = booking77.getTotalHours();
        boolean boolean83 = clientServices64.updateCompleteBooking(booking77);
        java.util.Date date84 = booking77.getDate();
        booking77.setLicensePlate("cZ=IAx!!l");
        boolean boolean87 = credentials3.equals((java.lang.Object) "cZ=IAx!!l");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user63", user6.equals(user63) ? user6.hashCode() == user63.hashCode() : true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        booking11.setEndTime((int) (short) 10);
        java.lang.String str15 = booking11.getEmail();
        java.util.Date date16 = booking11.getStartDateTime();
        int int17 = booking11.getTotalHours();
        booking11.setEndTime((int) ' ');
        boolean boolean20 = clientServices0.updateCompleteBooking(booking11);
        java.lang.String str23 = clientServices0.disableParkingSpaceById((int) (short) 100, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList25 = clientServices0.getAllUsersBookings("Manager");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        model.user.Student student8 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        boolean boolean13 = clientServices0.updateBooking((int) (byte) 1, (int) '4');
        model.parking.ParkingLot parkingLot15 = clientServices0.getParkingLotByAddress("Success: Parking Space 97 has been enabled.");
        java.util.List<model.booking.Booking> bookingList16 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = clientServices0.cancenlBooking((int) (short) 100);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.booking.Booking booking1 = new model.booking.Booking();
        int int2 = booking1.getStartTime();
        int int3 = booking1.getId();
        java.util.Date date4 = booking1.getStartDateTime();
        boolean boolean5 = clientServices0.bookParkingSpace(booking1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList7 = clientServices0.getAllUsersBookings("Success: Parking Lot -1 has been enabled.");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        double double3 = booking0.getCost();
        int int4 = booking0.getSpaceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = booking0.getTotalCost();
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("Student");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = clientServices0.cancenlBooking(32);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.loginUser("wC0@&+)[5", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 97 is already disabled.'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("fnoK1s5im", "=B3fAbMGq");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        int int3 = booking0.getEndTime();
        int int4 = booking0.getEndTime();
        int int5 = booking0.getTotalHours();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = booking0.getTotalCost();
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        java.lang.String str10 = booking0.toString();
        int int11 = booking0.getId();
        booking0.setEndTime((int) (short) 10);
        java.util.Date date14 = booking0.getDate();
        int int15 = booking0.getId();
        booking0.setStartTime((int) (short) 100);
        java.util.Date date18 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = booking0.getTotalCost();
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository7 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("%PKSxWW&U", "HcpxBjAE]");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("Ss!n_uj18");
        boolean boolean13 = superManagerServices0.isValidEmail("lWu#FFEES");
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.toString();
        model.user.Client client20 = new model.user.Client(credentials17);
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials17, "Parking Space 97 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff22);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        java.lang.String str12 = clientServices0.getParkingSpaceById(100, 100);
        java.lang.String str15 = clientServices0.disableParkingSpaceById((int) (short) 10, (int) (byte) 100);
        boolean boolean18 = clientServices0.updateBooking((int) 'a', (int) ' ');
        java.lang.String str21 = clientServices0.enableParkingSpaceById((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList23 = clientServices0.getAllUsersBookings("wC0@&+)[5");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = facultyMember9.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember9", facultyMember7.equals(facultyMember9) ? facultyMember7.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        boolean boolean7 = userService0.isValidEmail("&jn[e]&j%");
        boolean boolean9 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.getUserByEmail("paJF3HN(W");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember6", facultyMember4.equals(facultyMember6) ? facultyMember4.hashCode() == facultyMember6.hashCode() : true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        repo.RepositoryProvider repositoryProvider11 = new repo.RepositoryProvider();
        repo.UserRepository userRepository12 = repositoryProvider11.getUserRepository();
        java.util.List<model.user.User> userList13 = userRepository12.getUsers();
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.getType();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials17, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        facultyMember22.setFacultyId("NonFacultyStaff");
        userRepository12.addUser((model.user.User) facultyMember22);
        boolean boolean26 = credentials3.equals((java.lang.Object) facultyMember22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials17", credentials3.equals(credentials17) ? credentials3.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "hi!");
        model.user.Credentials credentials13 = nonFacultyStaff12.getCredentials();
        nonFacultyStaff12.setRole("Parking Lot 97 is already enabled.");
        userRepository5.addUser((model.user.User) nonFacultyStaff12);
        model.user.Credentials credentials20 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Student student21 = new model.user.Student(credentials20);
        java.lang.String str22 = credentials20.toString();
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials20, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}", "Parking Space 52 is already enabled.");
        model.user.Student student26 = new model.user.Student(credentials20);
        userRepository5.addUser((model.user.User) student26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student21 and student26", student21.equals(student26) ? student21.hashCode() == student26.hashCode() : true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        boolean boolean7 = userService0.isValidEmail("&jn[e]&j%");
        boolean boolean9 = userService0.isValidEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean11 = userService0.isValidEmail("ZZUPGbwnh");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials15);
        model.user.User user18 = new model.user.User(credentials15);
        model.user.Credentials credentials19 = user18.getCredentials();
        model.user.Student student21 = new model.user.Student(credentials19, "There is no Such Parking Lot");
        java.lang.String str22 = student21.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = userService0.registerUser((model.user.User) student21);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        java.lang.String str9 = superManagerServices0.generateStrongPassword();
        boolean boolean11 = superManagerServices0.isStrongPassword("Parking Space 35 is already enabled.");
        java.lang.String str12 = superManagerServices0.generateRandomEmail();
        java.lang.String str13 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.getType();
        java.lang.String str20 = credentials17.toString();
        java.lang.String str21 = credentials17.getLogin();
        model.user.User user22 = model.user.UserFactory.createAccount(credentials17);
        java.lang.String str23 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials17);
        nonFacultyStaff24.setRole("users.json");
        nonFacultyStaff24.setRole("NonFacultyStaff");
        nonFacultyStaff24.setRole("Parking Space 97 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff24);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        java.lang.String str9 = credentials8.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials8);
        model.user.User user11 = new model.user.User(credentials8);
        model.user.Manager manager12 = new model.user.Manager(credentials8);
        boolean boolean13 = manager12.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager10 and manager12", manager10.equals(manager12) ? manager10.hashCode() == manager12.hashCode() : true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        model.user.User user13 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Credentials{login='hi!', password='hi!', type='hi!'}", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        userRepository3.removeUser(user13);
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.Student student20 = new model.user.Student(credentials18, "Success: Parking Space 97 has been enabled.");
        student20.setStudentId("Parking Lot 97 is already enabled.");
        java.lang.String str23 = student20.getStudentId();
        java.lang.String str24 = student20.getStudentId();
        student20.setStudentId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) student20);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("users.json");
        boolean boolean6 = userService0.isValidEmail("HGL)]pX%+");
        repo.UserRepository userRepository7 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("l=PztP**d", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   '\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) (short) 100, (int) ' ');
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        boolean boolean16 = clientServices0.updateCompleteBooking(booking12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = clientServices0.cancenlBooking(100);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials10 = student9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str13 = credentials10.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student13", student11.equals(student13) ? student11.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        java.lang.String str10 = booking0.getEmail();
        java.util.Date date11 = booking0.getStartDateTime();
        java.lang.String str12 = booking0.getLicensePlate();
        int int13 = booking0.getTotalHours();
        java.lang.String str14 = booking0.getStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking0.getTotalCost();
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("fnoK1s5im");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("9z6wsHuxQ");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.lang.String str13 = nonFacultyStaff12.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("x_M_*Q!wD");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        boolean boolean8 = userService0.isValidEmail("Av+-nN6Nu");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.loginUser("2g]O0QGM)", "ZZUPGbwnh");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository6 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository8 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository9 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository10 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials14, "hi!");
        java.lang.String str18 = credentials14.getPassword();
        model.user.User user19 = new model.user.User(credentials14);
        repo.RepositoryProvider repositoryProvider20 = new repo.RepositoryProvider();
        repo.UserRepository userRepository21 = repositoryProvider20.getUserRepository();
        repo.BookingRepository bookingRepository22 = repositoryProvider20.getBookingRepository();
        boolean boolean23 = credentials14.equals((java.lang.Object) bookingRepository22);
        model.user.User user24 = new model.user.User(credentials14);
        userRepository10.addUser(user24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user19 and user24", user19.equals(user24) ? user19.hashCode() == user24.hashCode() : true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.loginUser("J=P4i&KFN", "Success: Parking Space 1 has been disabled.");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Credentials credentials11 = student10.getCredentials();
        java.lang.String str12 = credentials11.getLogin();
        model.user.Student student13 = new model.user.Student(credentials11);
        java.lang.String str14 = credentials11.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student13", student10.equals(student13) ? student10.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean6 = superManagerServices0.isValidEmail("Success: Parking Space 100 has been enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        java.lang.String str12 = facultyMember11.getFacultyId();
        facultyMember11.validateAccount();
        model.user.Credentials credentials14 = facultyMember11.getCredentials();
        model.user.Student student15 = new model.user.Student(credentials14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = superManagerServices0.createAccount((model.user.User) student15);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "hi!");
        model.user.Credentials credentials12 = nonFacultyStaff11.getCredentials();
        userRepository4.addUser((model.user.User) nonFacultyStaff11);
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getLogin();
        strategy.StudentParkingRate studentParkingRate19 = new strategy.StudentParkingRate();
        double double21 = studentParkingRate19.calculateRate((double) 1.0f);
        boolean boolean22 = credentials17.equals((java.lang.Object) 1.0f);
        java.lang.String str23 = credentials17.getType();
        model.user.Visitor visitor24 = new model.user.Visitor(credentials17);
        model.user.Student student26 = new model.user.Student(credentials17, "Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
        userRepository4.addUser((model.user.User) student26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials8 and credentials17", credentials8.equals(credentials17) ? credentials8.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Credentials credentials9 = client8.getCredentials();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.User user16 = new model.user.User(credentials13);
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials13, "Parking Lot 97 is already enabled.", "Wm(OGK*DZ");
        java.lang.String str20 = credentials13.toString();
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials13);
        boolean boolean22 = credentials9.equals((java.lang.Object) facultyMember21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials9 and credentials13", credentials9.equals(credentials13) ? credentials9.hashCode() == credentials13.hashCode() : true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "wMB&=eDYD", "Parking Space 1 is already disabled.");
        java.lang.String str16 = facultyMember15.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember15", facultyMember11.equals(facultyMember15) ? facultyMember11.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(10, (int) '4');
        model.parking.ParkingLot parkingLot8 = clientServices0.getParkingLotByAddress("9z6wsHuxQ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList10 = clientServices0.getAllUsersBookings("Parking Space 100 is already enabled.");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        boolean boolean8 = userService0.isValidEmail("");
        boolean boolean10 = userService0.isStrongPassword("Parking Lot 97 is already disabled.");
        boolean boolean12 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository13 = userService0.userRepository;
        model.user.Client client17 = new model.user.Client("", "Parking Space -1 is already enabled.", "]cT(-?mBj");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository13.updateUser((model.user.User) client17);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client9", client7.equals(client9) ? client7.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("[qIbnc7Xj");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember9", facultyMember7.equals(facultyMember9) ? facultyMember7.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Wm(OGK*DZ");
        java.lang.String str10 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "JOS[]AzcP");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "Parking Space 35 is already enabled.");
        java.lang.String str16 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff15", nonFacultyStaff11.equals(nonFacultyStaff15) ? nonFacultyStaff11.hashCode() == nonFacultyStaff15.hashCode() : true);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        java.lang.String str8 = facultyMember7.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("Credentials{login='Manager', password='Success: Parking Space 0 has been disabled.', type='Success: Parking Lot 32 has been disabled.'}", "WsR_[hRm]");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        model.booking.Booking booking9 = clientServices0.getBookingById(97);
        model.booking.Booking booking11 = clientServices0.getBookingById((int) 'a');
        model.booking.Booking booking13 = clientServices0.getBookingById(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = clientServices0.cancenlBooking((-90));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isValidEmail("Student");
        java.lang.String str10 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        java.lang.String str16 = credentials14.toString();
        model.user.Visitor visitor17 = new model.user.Visitor(credentials14);
        java.lang.String str18 = credentials14.toString();
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials14, "Student", "Manager");
        java.lang.String str22 = facultyMember21.getFacultyName();
        java.lang.String str23 = facultyMember21.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = superManagerServices0.createAccount((model.user.User) facultyMember21);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        boolean boolean10 = clientServices0.updateBooking(0, 0);
        java.util.List<model.booking.Booking> bookingList11 = clientServices0.getAllBookings();
        model.booking.Booking booking12 = new model.booking.Booking();
        java.lang.String str13 = booking12.getEmail();
        boolean boolean14 = clientServices0.bookParkingSpace(booking12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = clientServices0.cancenlBooking(100);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        java.lang.String str14 = clientServices0.enableParkingSpaceById(1, (int) (byte) 10);
        java.lang.String str17 = clientServices0.getParkingSpaceById(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = clientServices0.cancenlBooking((int) '#');
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Student student9 = new model.user.Student(credentials3, ")CAoHm8t(");
        model.user.Student student11 = new model.user.Student(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student9 and student11", student9.equals(student11) ? student9.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "X?EhgrKDV");
        java.lang.String str10 = credentials3.getType();
        model.user.Student student12 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3, "ngy(gkqsc");
        model.user.Credentials credentials15 = nonFacultyStaff14.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff14", nonFacultyStaff9.equals(nonFacultyStaff14) ? nonFacultyStaff9.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        java.lang.String str9 = superManagerServices0.generateStrongPassword();
        java.lang.String str10 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        java.lang.String str16 = credentials14.toString();
        model.user.Visitor visitor17 = new model.user.Visitor(credentials14);
        java.lang.String str18 = credentials14.toString();
        java.lang.String str19 = credentials14.getPassword();
        java.lang.String str20 = credentials14.getType();
        model.user.Student student21 = new model.user.Student(credentials14);
        java.lang.String str22 = credentials14.getLogin();
        model.user.Manager manager23 = new model.user.Manager(credentials14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = superManagerServices0.createAccount((model.user.User) manager23);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.lang.String str14 = facultyMember13.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        boolean boolean11 = userService0.isStrongPassword("JoNIi]ebC");
        model.user.Credentials credentials15 = new model.user.Credentials("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "]cT(-?mBj");
        model.user.Student student16 = new model.user.Student(credentials15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = userService0.registerUser((model.user.User) student16);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyName("Parking Space -1 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember9", facultyMember7.equals(facultyMember9) ? facultyMember7.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean6 = superManagerServices0.isStrongPassword("Success: Parking Lot 97 has been disabled.");
        boolean boolean8 = superManagerServices0.isValidEmail("");
        boolean boolean10 = superManagerServices0.isStrongPassword("");
        boolean boolean12 = superManagerServices0.isValidEmail("Rg2)djJx]");
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials16, "hi!");
        model.user.Credentials credentials20 = nonFacultyStaff19.getCredentials();
        model.user.User user21 = model.user.UserFactory.createAccount(credentials20);
        model.user.Student student22 = new model.user.Student(credentials20);
        model.user.Visitor visitor23 = new model.user.Visitor(credentials20);
        model.user.FacultyMember facultyMember24 = new model.user.FacultyMember(credentials20);
        facultyMember24.setFacultyName("Parking Space 97 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = superManagerServices0.createAccount((model.user.User) facultyMember24);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = student9.getStudentId();
        java.lang.String str11 = student9.getStudentId();
        student9.setStudentId("(O3fsOXXJ");
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.toString();
        model.user.User user20 = new model.user.User(credentials17);
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials17, "Parking Lot 97 is already enabled.", "Wm(OGK*DZ");
        java.lang.String str24 = credentials17.toString();
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials17);
        model.user.Student student27 = new model.user.Student(credentials17, "JOS[]AzcP");
        boolean boolean28 = student9.equals((java.lang.Object) student27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials17", credentials3.equals(credentials17) ? credentials3.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "Parking Space 32 is already enabled.");
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.getLogin();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        java.lang.Object obj13 = null;
        boolean boolean14 = facultyMember12.equals(obj13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember12", facultyMember7.equals(facultyMember12) ? facultyMember7.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("Parking Lot 100 is already enabled.");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 35 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("HGL)]pX%+", "Success: Parking Space 1 has been disabled.");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("O*Ctm)%!R");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("xQ)b!n)sD");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) 0);
        parkingSpace1.setSpaceID(0);
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        booking4.setCost((double) (short) 100);
        int int10 = booking4.getStartTime();
        double double11 = booking4.getCost();
        parkingSpace1.setBooking(booking4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking4.getTotalCost();
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "", "Student");
        java.lang.String str4 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "There is no Such Parking Lot");
        boolean boolean8 = nonFacultyStaff7.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff7", nonFacultyStaff5.equals(nonFacultyStaff7) ? nonFacultyStaff5.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        repo.UserRepository userRepository9 = userService0.userRepository;
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        model.user.User user18 = model.user.UserFactory.createAccount(credentials13);
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials13, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client22 = new model.user.Client(credentials13);
        java.lang.String str23 = credentials13.getType();
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials13, "Parking Lot 97 is already disabled.");
        userRepository9.addUser((model.user.User) nonFacultyStaff25);
        model.user.Credentials credentials30 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str31 = credentials30.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff33 = new model.user.NonFacultyStaff(credentials30, "hi!");
        model.user.Credentials credentials34 = nonFacultyStaff33.getCredentials();
        model.user.Client client35 = new model.user.Client(credentials34);
        model.user.Client client36 = new model.user.Client(credentials34);
        userRepository9.removeUser((model.user.User) client36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials13 and credentials30", credentials13.equals(credentials30) ? credentials13.hashCode() == credentials30.hashCode() : true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials10 = student9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client13 = new model.user.Client(credentials10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("%PKSxWW&U");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Client client7 = new model.user.Client("Parking Lot 100 is already enabled.", "(O3fsOXXJ", "HGL)]pX%+");
        userRepository3.addUser((model.user.User) client7);
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials12, "hi!");
        nonFacultyStaff15.setRole("");
        model.user.Credentials credentials18 = nonFacultyStaff15.getCredentials();
        model.user.Credentials credentials19 = nonFacultyStaff15.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) nonFacultyStaff15);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = credentials3.getLogin();
        java.lang.String str12 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 100 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user16 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff14 and nonFacultyStaff15", nonFacultyStaff14.equals(nonFacultyStaff15) ? nonFacultyStaff14.hashCode() == nonFacultyStaff15.hashCode() : true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        java.util.Date date3 = booking0.getDate();
        int int4 = booking0.getEndTime();
        java.util.Date date5 = booking0.getDate();
        booking0.setEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = booking0.getTotalCost();
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("]82UgsU=G");
        boolean boolean4 = userService0.isValidEmail("Av+-nN6Nu");
        model.user.Client client8 = new model.user.Client("Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "");
        boolean boolean9 = client8.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = userService0.registerUser((model.user.User) client8);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "(O3fsOXXJ", "Success: Parking Space 100 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str13 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        java.util.Date date3 = booking0.getDate();
        int int4 = booking0.getEndTime();
        java.util.Date date5 = booking0.getDate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = booking0.getTotalCost();
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.util.Date date5 = booking0.getStartDateTime();
        java.lang.String str6 = booking0.getStatus();
        int int7 = booking0.getLotId();
        java.util.Date date8 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking0.getTotalCost();
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.toString();
        java.lang.String str10 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "There is no Such Parking Lot");
        model.user.Student student13 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        nonFacultyStaff15.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff12 and nonFacultyStaff15", nonFacultyStaff12.equals(nonFacultyStaff15) ? nonFacultyStaff12.hashCode() == nonFacultyStaff15.hashCode() : true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user12 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember13", facultyMember11.equals(facultyMember13) ? facultyMember11.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.Student student12 = new model.user.Student(credentials7, "Success: Parking Lot 10 has been disabled.");
        java.lang.String str13 = credentials7.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student9 and student12", student9.equals(student12) ? student9.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "Rg2)djJx]", "wl(koPNa!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.toString();
        model.user.Visitor visitor18 = new model.user.Visitor(credentials15);
        java.lang.String str19 = credentials15.toString();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials15, "Student", "Manager");
        facultyMember22.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str25 = facultyMember22.getFacultyId();
        model.user.Credentials credentials26 = facultyMember22.getCredentials();
        java.lang.String str27 = facultyMember22.getFacultyName();
        java.lang.String str28 = facultyMember22.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = userService0.registerUser((model.user.User) facultyMember22);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        repo.UserRepository userRepository9 = userService0.userRepository;
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        model.user.User user18 = model.user.UserFactory.createAccount(credentials13);
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials13, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client22 = new model.user.Client(credentials13);
        java.lang.String str23 = credentials13.getType();
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials13, "Parking Lot 97 is already disabled.");
        userRepository9.addUser((model.user.User) nonFacultyStaff25);
        model.user.Credentials credentials30 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str31 = credentials30.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff33 = new model.user.NonFacultyStaff(credentials30, "hi!");
        nonFacultyStaff33.setRole("");
        model.user.Credentials credentials36 = nonFacultyStaff33.getCredentials();
        nonFacultyStaff33.validateAccount();
        nonFacultyStaff33.setRole("Credentials{login='hi!', password='hi!', type='hi!'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) nonFacultyStaff33);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "%Xsf91eG]");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.getType();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials11, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        java.lang.String str17 = facultyMember16.getFacultyId();
        facultyMember16.setFacultyName("Success: Parking Space -1 has been disabled.");
        facultyMember16.validateAccount();
        boolean boolean21 = credentials3.equals((java.lang.Object) facultyMember16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials11", credentials3.equals(credentials11) ? credentials3.hashCode() == credentials11.hashCode() : true);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.util.Date date5 = booking0.getStartDateTime();
        int int6 = booking0.getTotalHours();
        booking0.setLicensePlate("Success: Parking Space -1 has been disabled.");
        java.lang.String str9 = booking0.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = booking0.getTotalCost();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("YAFUIs1L_");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getPassword();
        strategy.StudentParkingRate studentParkingRate10 = new strategy.StudentParkingRate();
        double double12 = studentParkingRate10.calculateRate((double) 1.0f);
        double double14 = studentParkingRate10.calculateRate((double) 1.0f);
        double double16 = studentParkingRate10.calculateRate(0.0d);
        double double18 = studentParkingRate10.calculateRate(0.0d);
        double double20 = studentParkingRate10.calculateRate(22500.0d);
        double double22 = studentParkingRate10.calculateRate(800.0d);
        boolean boolean23 = credentials3.equals((java.lang.Object) 800.0d);
        model.user.User user24 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember27 = new model.user.FacultyMember(credentials3, "DYp5a&9eU", "Parking Space 1 is already enabled.");
        model.user.Credentials credentials31 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str32 = credentials31.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff34 = new model.user.NonFacultyStaff(credentials31, "hi!");
        model.user.Credentials credentials35 = nonFacultyStaff34.getCredentials();
        model.user.Client client36 = new model.user.Client(credentials35);
        model.user.FacultyMember facultyMember37 = new model.user.FacultyMember(credentials35);
        boolean boolean38 = facultyMember27.equals((java.lang.Object) facultyMember37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials31", credentials3.equals(credentials31) ? credentials3.hashCode() == credentials31.hashCode() : true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("]82UgsU=G");
        boolean boolean4 = userService0.isValidEmail("Av+-nN6Nu");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.toString();
        model.user.User user11 = new model.user.User(credentials8);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials8, "Parking Lot 97 is already enabled.", "Wm(OGK*DZ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = userService0.registerUser((model.user.User) facultyMember14);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user7 = new model.user.User(credentials6);
        userRepository2.addUser(user7);
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        java.lang.String str14 = credentials12.toString();
        model.user.Visitor visitor15 = new model.user.Visitor(credentials12);
        model.user.Client client16 = new model.user.Client(credentials12);
        model.user.Student student18 = new model.user.Student(credentials12, "Student");
        userRepository2.addUser((model.user.User) student18);
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getLogin();
        strategy.StudentParkingRate studentParkingRate25 = new strategy.StudentParkingRate();
        double double27 = studentParkingRate25.calculateRate((double) 1.0f);
        boolean boolean28 = credentials23.equals((java.lang.Object) 1.0f);
        model.user.User user29 = new model.user.User(credentials23);
        model.user.Student student30 = new model.user.Student(credentials23);
        model.user.FacultyMember facultyMember31 = new model.user.FacultyMember(credentials23);
        facultyMember31.setFacultyId("wMB&=eDYD");
        userRepository2.removeUser((model.user.User) facultyMember31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials12 and credentials23", credentials12.equals(credentials23) ? credentials12.hashCode() == credentials23.hashCode() : true);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Parking Space 32 is already enabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "cZ=IAx!!l");
        java.lang.String str16 = nonFacultyStaff15.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff13 and nonFacultyStaff15", nonFacultyStaff13.equals(nonFacultyStaff15) ? nonFacultyStaff13.hashCode() == nonFacultyStaff15.hashCode() : true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("t3=jyxeE5", "+O3S!#50S");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.UserRepository userRepository6 = userService0.userRepository;
        repo.UserRepository userRepository7 = userService0.userRepository;
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials11);
        model.user.Client client13 = new model.user.Client(credentials11);
        model.user.User user14 = model.user.UserFactory.createAccount(credentials11);
        java.lang.String str15 = credentials11.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials11, "X?EhgrKDV");
        java.lang.String str18 = credentials11.getType();
        model.user.Visitor visitor19 = new model.user.Visitor(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) visitor19);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Student student9 = new model.user.Student(credentials3, ")CAoHm8t(");
        model.user.Student student11 = new model.user.Student(credentials3, "hi!");
        java.lang.Class<?> wildcardClass12 = credentials3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student9 and student11", student9.equals(student11) ? student9.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isValidEmail("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.getUserByEmail("l=PztP**d");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Student student12 = new model.user.Student(credentials3);
        java.lang.String str13 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student12", student11.equals(student12) ? student11.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository6 = userService0.userRepository;
        java.util.List<model.user.User> userList7 = userRepository6.getUsers();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        java.lang.String str15 = credentials11.toString();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials11, "Student", "Manager");
        facultyMember18.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember18.setFacultyName("Parking Space 35 is already disabled.");
        facultyMember18.setFacultyName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository6.updateUser((model.user.User) facultyMember18);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        boolean boolean7 = userService0.isValidEmail("&jn[e]&j%");
        boolean boolean9 = userService0.isValidEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.getUserByEmail("YEu*&Uy])");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        java.util.List<java.lang.String> strList7 = clientServices0.getAllLocations();
        model.parking.ParkingSpace parkingSpace9 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking10 = new model.booking.Booking();
        int int11 = booking10.getStartTime();
        int int12 = booking10.getId();
        parkingSpace9.setBooking(booking10);
        booking10.setCost((double) 0.0f);
        java.lang.String str16 = booking10.getEmail();
        boolean boolean17 = clientServices0.bookParkingSpace(booking10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList19 = clientServices0.getAllUsersBookings("Success: Parking Lot -87 has been enabled.");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("9IG1CMQkh");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isValidEmail("qS46Qm6yT");
        boolean boolean11 = userService0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = userService0.isStrongPassword("Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.loginUser("GmnB8A3OL", "Credentials{login='Manager', password='Success: Parking Space 0 has been disabled.', type='Success: Parking Lot 32 has been disabled.'}");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.getType();
        java.lang.String str9 = credentials6.toString();
        java.lang.String str10 = credentials6.getLogin();
        java.lang.String str11 = credentials6.toString();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials6, "\nid             1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   Success: Parking Space 100 has been disabled.'\ncost           100.0\nstatus         null'\nemail        null", "R14et$0r@");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) facultyMember14);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.getType();
        model.user.Manager manager9 = new model.user.Manager(credentials6);
        userRepository2.removeUser((model.user.User) manager9);
        services.UserService userService11 = new services.UserService();
        boolean boolean13 = userService11.isValidEmail("SuperManager");
        repo.UserRepository userRepository14 = userService11.userRepository;
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials18);
        userRepository14.addUser((model.user.User) facultyMember19);
        facultyMember19.setFacultyName("Parking Space 32 is already enabled.");
        facultyMember19.setFacultyId("Manager");
        facultyMember19.setFacultyName("-hW9I6iG0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) facultyMember19);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        java.lang.String str16 = booking12.getEmail();
        java.lang.String str17 = booking12.toString();
        boolean boolean18 = credentials3.equals((java.lang.Object) booking12);
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember19", facultyMember11.equals(facultyMember19) ? facultyMember11.hashCode() == facultyMember19.hashCode() : true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = credentials3.getLogin();
        java.lang.String str12 = credentials3.getPassword();
        model.user.Student student13 = new model.user.Student(credentials3);
        java.lang.String str14 = student13.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student13", student10.equals(student13) ? student10.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.toString();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        model.user.Student student13 = new model.user.Student(credentials8, "users.json");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials8);
        facultyMember14.setFacultyId("Success: Parking Space 97 has been enabled.");
        userRepository4.removeUser((model.user.User) facultyMember14);
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "", "Student");
        java.lang.String str22 = credentials21.getType();
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials21, "JoNIi]ebC", "Success: Parking Lot -1 has been disabled.");
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials21);
        userRepository4.addUser((model.user.User) facultyMember26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember25 and facultyMember26", facultyMember25.equals(facultyMember26) ? facultyMember25.hashCode() == facultyMember26.hashCode() : true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials7);
        services.UserService userService9 = new services.UserService();
        boolean boolean11 = userService9.isValidEmail("SuperManager");
        boolean boolean13 = userService9.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository14 = userService9.userRepository;
        boolean boolean15 = visitor8.equals((java.lang.Object) userService9);
        repo.RepositoryProvider repositoryProvider16 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository17 = repositoryProvider16.getBookingRepository();
        repo.UserRepository userRepository18 = repositoryProvider16.getUserRepository();
        model.user.Credentials credentials22 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user23 = new model.user.User(credentials22);
        userRepository18.addUser(user23);
        model.user.Credentials credentials28 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str29 = credentials28.getPassword();
        java.lang.String str30 = credentials28.toString();
        model.user.Visitor visitor31 = new model.user.Visitor(credentials28);
        model.user.Client client32 = new model.user.Client(credentials28);
        model.user.Student student34 = new model.user.Student(credentials28, "Student");
        userRepository18.addUser((model.user.User) student34);
        repo.ParkingRepository parkingRepository36 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList37 = parkingRepository36.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList38 = parkingRepository36.getAllParkingLots();
        boolean boolean39 = student34.equals((java.lang.Object) parkingLotList38);
        student34.setStudentId(")CAoHm8t(");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = userService9.registerUser((model.user.User) student34);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot6 = clientServices0.getParkingLotByAddress("");
        model.parking.ParkingLot parkingLot8 = clientServices0.getParkingLotByAddress("4]z?3Qs%M");
        java.util.List<model.booking.Booking> bookingList9 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList11 = clientServices0.getAllUsersBookings("Success: Parking Space 32 has been disabled.");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        java.lang.String str16 = booking12.getEmail();
        java.lang.String str17 = booking12.toString();
        boolean boolean18 = credentials3.equals((java.lang.Object) booking12);
        model.user.Visitor visitor19 = new model.user.Visitor(credentials3);
        java.lang.String str20 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor19", visitor6.equals(visitor19) ? visitor6.hashCode() == visitor19.hashCode() : true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        services.UserService userService8 = new services.UserService();
        boolean boolean10 = userService8.isStrongPassword("There is no Such Parking Lot");
        boolean boolean12 = userService8.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository13 = userService8.userRepository;
        boolean boolean15 = userService8.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean17 = userService8.isValidEmail("qS46Qm6yT");
        boolean boolean19 = userService8.isStrongPassword("HGL)]pX%+");
        boolean boolean21 = userService8.isStrongPassword("Visitor");
        boolean boolean22 = credentials3.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Space -1 is already enabled.", "X?EhgrKDV");
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "b0K0Td]sJ");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 97 is already disabled.'\ncost           0.0\nstatus         null'\nemail        Student");
        nonFacultyStaff12.setRole("(j1+k0)lO");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        services.UserService userService11 = new services.UserService();
        boolean boolean13 = userService11.isValidEmail("SuperManager");
        boolean boolean15 = userService11.isValidEmail("There is no Such Parking Lot");
        boolean boolean17 = userService11.isStrongPassword("Success: Parking Space 35 has been disabled.");
        boolean boolean19 = userService11.isStrongPassword("Success: Parking Space 10 has been disabled.");
        boolean boolean20 = credentials3.equals((java.lang.Object) userService11);
        model.user.Client client21 = new model.user.Client(credentials3);
        java.lang.String str22 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client9 and client21", client9.equals(client21) ? client9.hashCode() == client21.hashCode() : true);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Space -1 is already enabled.", "X?EhgrKDV");
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "b0K0Td]sJ");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 97 is already disabled.'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str13 = nonFacultyStaff12.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("qS46Qm6yT");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials15, "hi!");
        model.user.Credentials credentials19 = nonFacultyStaff18.getCredentials();
        model.user.Client client20 = new model.user.Client(credentials19);
        model.user.Manager manager21 = new model.user.Manager(credentials19);
        boolean boolean22 = manager21.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = superManagerServices0.createAccount((model.user.User) manager21);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str9 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        model.user.User user18 = model.user.UserFactory.createAccount(credentials13);
        java.lang.String str19 = credentials13.getType();
        model.user.Manager manager20 = new model.user.Manager(credentials13);
        model.user.Student student21 = new model.user.Student(credentials13);
        java.lang.String str22 = credentials13.getLogin();
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials13, "YAFUIs1L_", "pUdP465**");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = superManagerServices0.createAccount((model.user.User) facultyMember25);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        services.SuperManagerServices superManagerServices9 = services.SuperManagerServices.getInstance();
        boolean boolean11 = superManagerServices9.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str12 = superManagerServices9.generateRandomEmail();
        java.lang.String str13 = superManagerServices9.generateStrongPassword();
        boolean boolean15 = superManagerServices9.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean17 = superManagerServices9.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean19 = superManagerServices9.isValidEmail("Parking Lot 1 is already enabled.");
        boolean boolean20 = credentials3.equals((java.lang.Object) "Parking Lot 1 is already enabled.");
        model.user.Client client21 = new model.user.Client(credentials3);
        model.user.Student student22 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client21", client7.equals(client21) ? client7.hashCode() == client21.hashCode() : true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean7 = userService0.isStrongPassword("Visitor");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("Credentials{login='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.', password='AAwYnzN!e', type='Rg2)djJx]'}", "Parking Space 10 is already enabled.");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.parking.ParkingSpace parkingSpace9 = new model.parking.ParkingSpace((int) '#');
        parkingSpace9.setSpaceID((int) 'a');
        parkingSpace9.setStatus(true);
        boolean boolean14 = user7.equals((java.lang.Object) parkingSpace9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user7", user6.equals(user7) ? user6.hashCode() == user7.hashCode() : true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials8, "Qw$TanXAv");
        model.user.Student student15 = new model.user.Student(credentials8, "gH7ICSj!r");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff13", nonFacultyStaff6.equals(nonFacultyStaff13) ? nonFacultyStaff6.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8);
        java.lang.String str12 = credentials8.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Client client9 = new model.user.Client(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client8 and client9", client8.equals(client9) ? client8.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("nZ!X]L6?(");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        java.lang.String str9 = facultyMember8.getFacultyId();
        facultyMember8.setFacultyId("hi!");
        facultyMember8.setFacultyName("hi!");
        java.lang.String str14 = facultyMember8.getFacultyId();
        userRepository3.addUser((model.user.User) facultyMember8);
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        java.lang.String str21 = credentials19.getType();
        model.user.FacultyMember facultyMember24 = new model.user.FacultyMember(credentials19, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        facultyMember24.setFacultyId("NonFacultyStaff");
        facultyMember24.setFacultyId("");
        userRepository3.removeUser((model.user.User) facultyMember24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials19", credentials7.equals(credentials19) ? credentials7.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.lang.String str10 = booking0.getLicensePlate();
        booking0.setLicensePlate("(O3fsOXXJ");
        java.lang.String str13 = booking0.toString();
        java.util.Date date14 = booking0.getEndDateTime();
        booking0.setEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.util.Date date17 = booking0.getDate();
        java.lang.String str18 = booking0.toString();
        booking0.setId((-87));
        booking0.setId(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = booking0.getTotalCost();
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("?qqRirU!a");
        boolean boolean7 = userService0.isValidEmail("1bR(76zCD");
        boolean boolean9 = userService0.isStrongPassword("");
        boolean boolean11 = userService0.isStrongPassword("tpQo&#L]V");
        repo.UserRepository userRepository12 = new repo.UserRepository();
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials16);
        facultyMember17.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str20 = facultyMember17.getFacultyId();
        userRepository12.addUser((model.user.User) facultyMember17);
        java.lang.String str22 = facultyMember17.getFacultyName();
        java.lang.String str23 = facultyMember17.getFacultyId();
        facultyMember17.setFacultyName("Student");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = userService0.registerUser((model.user.User) facultyMember17);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("Parking Lot 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("nZ!X]L6?(");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("J=P4i&KFN");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        java.lang.String str4 = superManagerServices0.generateStrongPassword();
        boolean boolean6 = superManagerServices0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = superManagerServices0.isValidEmail("Parking Lot 1 is already enabled.");
        java.lang.String str11 = superManagerServices0.generateRandomEmail();
        boolean boolean13 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.Client client17 = new model.user.Client("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.", "Parking Lot 1 is already enabled.", "Parking Space 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = superManagerServices0.createAccount((model.user.User) client17);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.booking.Booking booking2 = clientServices0.getBookingById((int) (short) 1);
        model.booking.Booking booking4 = clientServices0.getBookingById((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = clientServices0.getParkingSpaceById((int) (byte) -1, (int) 'a');
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 35 has been disabled.");
        repo.UserRepository userRepository7 = userService0.userRepository;
        model.user.Credentials credentials11 = new model.user.Credentials("", "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) visitor12);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student15 = new model.user.Student(credentials3);
        java.lang.String str16 = student15.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student15", student10.equals(student15) ? student10.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 97 is already disabled.");
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getType();
        model.user.Student student12 = new model.user.Student(credentials3, "%Xsf91eG]");
        student12.setStudentId("Parking Space 97 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student12", student8.equals(student12) ? student8.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Success: Parking Lot 100 has been disabled.', password='X5G?ZJ!c@', type='Parking Lot 97 is already enabled.'}");
        java.lang.String str15 = student14.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student14", student11.equals(student14) ? student11.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        boolean boolean10 = userService0.isValidEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.getUserByEmail("DYp5a&9eU");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = superManagerServices0.isStrongPassword("=B3fAbMGq");
        boolean boolean15 = superManagerServices0.isValidEmail("&jn[e]&j%");
        java.lang.String str16 = superManagerServices0.generateStrongPassword();
        java.lang.String str17 = superManagerServices0.generateRandomEmail();
        boolean boolean19 = superManagerServices0.isValidEmail("?WmF)ske8");
        services.UserService userService20 = new services.UserService();
        boolean boolean22 = userService20.isValidEmail("SuperManager");
        repo.UserRepository userRepository23 = userService20.userRepository;
        java.util.List<model.user.User> userList24 = userRepository23.getUsers();
        java.util.List<model.user.User> userList25 = userRepository23.getUsers();
        model.user.Client client29 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        userRepository23.addUser((model.user.User) client29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = superManagerServices0.createAccount((model.user.User) client29);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Space -1 has been enabled.");
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials16, "hi!");
        java.lang.String str20 = credentials16.getPassword();
        model.user.Student student22 = new model.user.Student(credentials16, ")CAoHm8t(");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = userService0.registerUser((model.user.User) student22);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository8 = repositoryProvider0.getUserRepository();
        java.util.List<model.user.User> userList9 = userRepository8.getUsers();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials13);
        model.user.Client client15 = new model.user.Client(credentials13);
        model.user.Student student16 = new model.user.Student(credentials13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository8.updateUser((model.user.User) student16);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking(35, (int) (byte) 0);
        boolean boolean12 = clientServices0.updateBooking((int) (byte) 0, (int) (byte) -1);
        model.booking.Booking booking14 = clientServices0.getBookingById(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = clientServices0.cancenlBooking((-90));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        repo.UserRepository userRepository13 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.getUserByEmail("2g]O0QGM)");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.Class<?> wildcardClass11 = facultyMember10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = credentials3.getLogin();
        java.lang.String str12 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 100 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str16 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff14 and nonFacultyStaff15", nonFacultyStaff14.equals(nonFacultyStaff15) ? nonFacultyStaff14.hashCode() == nonFacultyStaff15.hashCode() : true);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8);
        nonFacultyStaff11.setRole("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember10.validateAccount();
        model.user.Credentials credentials14 = facultyMember10.getCredentials();
        java.lang.String str15 = credentials14.getType();
        model.user.Student student17 = new model.user.Student(credentials14, "X?EhgrKDV");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials14);
        model.user.Client client19 = new model.user.Client(credentials14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember18", facultyMember10.equals(facultyMember18) ? facultyMember10.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        services.UserService userService0 = services.UserService.getInstance();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str5 = credentials4.getPassword();
        java.lang.String str6 = credentials4.toString();
        model.user.User user7 = new model.user.User(credentials4);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials4, "Parking Lot 97 is already enabled.", "Wm(OGK*DZ");
        java.lang.String str11 = credentials4.toString();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = userService0.registerUser((model.user.User) nonFacultyStaff12);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setEmail("(O3fsOXXJ");
        int int12 = booking0.getSpaceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking0.getTotalCost();
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 35 has been enabled.");
        boolean boolean8 = userService0.isStrongPassword("Y%XCkmT1Q");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.getUserByEmail("Success: Parking Lot -87 has been disabled.");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Student student12 = new model.user.Student(credentials3);
        model.user.Client client13 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student12", student11.equals(student12) ? student11.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.toString();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        model.user.Client client12 = new model.user.Client(credentials8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = userService0.registerUser((model.user.User) client12);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 97 is already disabled.");
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getType();
        model.user.Student student12 = new model.user.Student(credentials3, "%Xsf91eG]");
        java.lang.String str13 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student12", student8.equals(student12) ? student8.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.Student student12 = new model.user.Student(credentials9);
        model.user.Student student14 = new model.user.Student(credentials9, "l@=7Kn[?f");
        java.lang.String str15 = student14.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        model.user.User user16 = new model.user.User("b0K0Td]sJ", "Parking Space 97 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        (O3fsOXXJ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository12.updateUser(user16);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("L2C@FUe6G");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        boolean boolean12 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.getUserByEmail("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "X5G?ZJ!c@", "Parking Lot 97 is already enabled.");
        model.user.User user4 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "Credentials{login='Credentials{login='hi!', password='hi!', type='hi!'}', password='Success: Parking Lot 100 has been disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student'}");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        model.user.Client client14 = new model.user.Client(credentials10);
        model.user.Visitor visitor15 = new model.user.Visitor(credentials10);
        boolean boolean16 = credentials3.equals((java.lang.Object) visitor15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor13 and visitor15", visitor13.equals(visitor15) ? visitor13.hashCode() == visitor15.hashCode() : true);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("Parking Lot 100 is already enabled.");
        boolean boolean6 = userService0.isValidEmail("Parking Space 1 is already enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getLogin();
        strategy.StudentParkingRate studentParkingRate12 = new strategy.StudentParkingRate();
        double double14 = studentParkingRate12.calculateRate((double) 1.0f);
        boolean boolean15 = credentials10.equals((java.lang.Object) 1.0f);
        model.user.User user16 = new model.user.User(credentials10);
        model.user.Manager manager17 = new model.user.Manager(credentials10);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials10, "Parking Space 97 is already enabled.");
        java.lang.String str20 = nonFacultyStaff19.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = userService0.registerUser((model.user.User) nonFacultyStaff19);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        java.lang.String str6 = booking2.getEmail();
        booking2.setCost((double) (byte) 0);
        parkingSpace1.setBooking(booking2);
        java.lang.String str10 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setSpaceID((int) (byte) -1);
        model.booking.Booking booking13 = new model.booking.Booking();
        booking13.setId(0);
        booking13.setEmail("Student");
        java.util.Date date18 = booking13.getStartDateTime();
        parkingSpace1.setBooking(booking13);
        parkingSpace1.setStatus(false);
        model.booking.Booking booking22 = parkingSpace1.getBooking();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = booking22.getTotalCost();
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean7 = userService0.isStrongPassword("4]z?3Qs%M");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("Success: Parking Lot 10 has been disabled.");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository3 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "hi!");
        nonFacultyStaff11.setRole("");
        nonFacultyStaff11.setRole("NonFacultyStaff");
        java.lang.String str16 = nonFacultyStaff11.getRole();
        java.lang.String str17 = nonFacultyStaff11.getRole();
        nonFacultyStaff11.setRole("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository4.updateUser((model.user.User) nonFacultyStaff11);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        boolean boolean11 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        (O3fsOXXJ");
        repo.UserRepository userRepository12 = new repo.UserRepository();
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials16);
        facultyMember17.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str20 = facultyMember17.getFacultyId();
        userRepository12.addUser((model.user.User) facultyMember17);
        java.lang.String str22 = facultyMember17.getFacultyName();
        facultyMember17.setFacultyName("J=P4i&KFN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = superManagerServices0.createAccount((model.user.User) facultyMember17);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("U?Jo754ut");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user12 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember13", facultyMember11.equals(facultyMember13) ? facultyMember11.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        int int3 = booking0.getEndTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = booking0.getTotalCost();
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        facultyMember8.setFacultyName("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember8.getCredentials();
        java.lang.String str13 = credentials12.toString();
        model.parking.ParkingSpace parkingSpace15 = new model.parking.ParkingSpace((int) (byte) 0);
        model.sensor.Sensor sensor16 = parkingSpace15.getSensor();
        boolean boolean17 = credentials12.equals((java.lang.Object) parkingSpace15);
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials12, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         There is no Such Parking Lot'\nemail        Manager", "Success: Parking Space 100 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials12, "Parking Lot -1 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember20", facultyMember8.equals(facultyMember20) ? facultyMember8.hashCode() == facultyMember20.hashCode() : true);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("l&mV$cHtu");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff11", nonFacultyStaff9.equals(nonFacultyStaff11) ? nonFacultyStaff9.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isStrongPassword("9z6wsHuxQ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.getUserByEmail("#m2s(PF$O");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) ' ', (int) ' ');
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        boolean boolean16 = clientServices0.bookParkingSpace(booking12);
        model.parking.ParkingLot parkingLot18 = clientServices0.getParkingLotByAddress("Parking Space 35 is already enabled.");
        model.booking.Booking booking19 = new model.booking.Booking();
        int int20 = booking19.getStartTime();
        booking19.setEndTime((int) (short) 10);
        java.lang.String str23 = booking19.getEmail();
        booking19.setCost((double) (byte) 0);
        int int26 = booking19.getLotId();
        booking19.setEmail("Manager");
        booking19.setStartTime((int) (byte) 0);
        double double31 = booking19.getCost();
        java.lang.String str32 = booking19.toString();
        java.lang.String str33 = booking19.toString();
        booking19.setEndTime((int) (byte) 1);
        boolean boolean36 = clientServices0.bookParkingSpace(booking19);
        boolean boolean39 = clientServices0.updateBooking((int) (byte) 0, 0);
        java.lang.String str42 = clientServices0.getParkingSpaceById((-90), (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList44 = clientServices0.getAllUsersBookings("Success: Parking Space 10 has been disabled.");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "hi!");
        model.user.Credentials credentials13 = nonFacultyStaff12.getCredentials();
        nonFacultyStaff12.setRole("Parking Lot 97 is already enabled.");
        userRepository5.addUser((model.user.User) nonFacultyStaff12);
        java.util.List<model.user.User> userList17 = userRepository5.getUsers();
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getPassword();
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials21, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        java.lang.String str26 = credentials21.toString();
        model.user.Client client27 = new model.user.Client(credentials21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) client27);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("S]m%3gy#D", "Parking Lot -1 is already enabled.");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isValidEmail("qS46Qm6yT");
        boolean boolean11 = userService0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = userService0.isStrongPassword("9z6wsHuxQ");
        boolean boolean15 = userService0.isStrongPassword("QhLFPQ#PO");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user18 = userService0.loginUser("Success: Parking Lot 100 has been disabled.", "Failure: Parking Space -1 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        model.user.Client client6 = new model.user.Client("J=P4i&KFN", "Parking Lot 10 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         There is no Such Parking Lot'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = userService0.registerUser((model.user.User) client6);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isValidEmail("Success: Parking Lot -1 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.loginUser("R3$W[qgE=", "l)d9[%+Se");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        boolean boolean10 = clientServices0.cancenlBooking((int) (byte) 0);
        model.booking.Booking booking12 = clientServices0.getBookingById((int) (byte) 0);
        model.parking.ParkingLot parkingLot14 = clientServices0.getParkingLotByAddress("]Q8Qq1gv4");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = clientServices0.cancenlBooking((-1));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.parking.ParkingSpace parkingSpace12 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str13 = parkingSpace12.enableParkingSpace();
        java.lang.String str14 = parkingSpace12.enableParkingSpace();
        model.sensor.Sensor sensor15 = parkingSpace12.getSensor();
        boolean boolean16 = credentials3.equals((java.lang.Object) parkingSpace12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff8 and nonFacultyStaff10", nonFacultyStaff8.equals(nonFacultyStaff10) ? nonFacultyStaff8.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository6 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        java.util.List<model.user.User> userList8 = userRepository7.getUsers();
        model.user.Credentials credentials12 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Manager manager13 = new model.user.Manager(credentials12);
        model.user.Visitor visitor14 = new model.user.Visitor(credentials12);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials12);
        model.user.Credentials credentials16 = facultyMember15.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) facultyMember15);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        booking3.setEndTime(0);
        int int14 = booking3.getId();
        booking3.setId(0);
        java.util.Date date17 = booking3.getStartDateTime();
        java.lang.String str18 = booking3.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = booking3.getTotalCost();
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        model.booking.Booking booking7 = new model.booking.Booking();
        int int8 = booking7.getStartTime();
        booking7.setEndTime((int) (short) 10);
        java.lang.String str11 = booking7.getEmail();
        java.util.Date date12 = booking7.getStartDateTime();
        boolean boolean13 = clientServices0.bookParkingSpace(booking7);
        java.lang.String str16 = clientServices0.getParkingSpaceById(0, 35);
        boolean boolean19 = clientServices0.updateBooking((int) (byte) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = clientServices0.cancenlBooking(97);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository6 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        java.util.List<model.user.User> userList8 = userRepository7.getUsers();
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials12, "hi!");
        model.user.Visitor visitor16 = new model.user.Visitor(credentials12);
        model.user.Client client17 = new model.user.Client(credentials12);
        userRepository7.removeUser((model.user.User) client17);
        model.user.Credentials credentials22 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials22);
        facultyMember23.setFacultyName("Parking Lot 97 is already enabled.");
        facultyMember23.setFacultyId("Success: Parking Space 97 has been enabled.");
        facultyMember23.validateAccount();
        java.lang.String str29 = facultyMember23.getFacultyId();
        facultyMember23.setFacultyName("hi!");
        userRepository7.removeUser((model.user.User) facultyMember23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials12 and credentials22", credentials12.equals(credentials22) ? credentials12.hashCode() == credentials22.hashCode() : true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (short) 1);
        boolean boolean2 = parkingSpace1.hasBooking();
        model.parking.ParkingSpace parkingSpace4 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking5 = new model.booking.Booking();
        int int6 = booking5.getStartTime();
        booking5.setEndTime((int) (short) 10);
        parkingSpace4.setBooking(booking5);
        java.lang.String str10 = booking5.getEmail();
        java.util.Date date11 = booking5.getEndDateTime();
        java.util.Date date12 = booking5.getStartDateTime();
        int int13 = booking5.getStartTime();
        parkingSpace1.setBooking(booking5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking5.getTotalCost();
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember8", facultyMember5.equals(facultyMember8) ? facultyMember5.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "SuperManager");
        java.lang.Object obj14 = null;
        boolean boolean15 = credentials3.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff13", nonFacultyStaff10.equals(nonFacultyStaff13) ? nonFacultyStaff10.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("?qqRirU!a");
        boolean boolean7 = userService0.isValidEmail("1bR(76zCD");
        boolean boolean9 = userService0.isStrongPassword("");
        repo.UserRepository userRepository10 = userService0.userRepository;
        boolean boolean12 = userService0.isStrongPassword("Success: Parking Space 1 has been enabled.");
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials16);
        model.user.User user19 = new model.user.User(credentials16);
        model.user.Credentials credentials20 = user19.getCredentials();
        java.lang.String str21 = credentials20.getPassword();
        model.user.Student student22 = new model.user.Student(credentials20);
        java.lang.String str23 = student22.getStudentId();
        student22.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = userService0.registerUser((model.user.User) student22);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember8", facultyMember5.equals(facultyMember8) ? facultyMember5.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user4 = new model.user.User(credentials3);
        java.lang.String str5 = credentials3.getLogin();
        services.UserService userService6 = new services.UserService();
        boolean boolean8 = userService6.isValidEmail("SuperManager");
        boolean boolean10 = userService6.isStrongPassword("SuperManager");
        boolean boolean12 = userService6.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean14 = userService6.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository15 = userService6.userRepository;
        repo.RepositoryProvider repositoryProvider16 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository17 = repositoryProvider16.getBookingRepository();
        repo.UserRepository userRepository18 = repositoryProvider16.getUserRepository();
        model.user.Credentials credentials22 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user23 = new model.user.User(credentials22);
        userRepository18.addUser(user23);
        java.util.List<model.user.User> userList25 = userRepository18.getUsers();
        model.user.Credentials credentials29 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "Parking Space 35 is already disabled.", "users.json");
        model.user.Client client30 = new model.user.Client(credentials29);
        userRepository18.addUser((model.user.User) client30);
        userRepository15.removeUser((model.user.User) client30);
        boolean boolean33 = credentials3.equals((java.lang.Object) userRepository15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials22", credentials3.equals(credentials22) ? credentials3.hashCode() == credentials22.hashCode() : true);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("S]m%3gy#D");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        facultyMember7.setFacultyId("Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember7", facultyMember5.equals(facultyMember7) ? facultyMember5.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("#Kj&+e6wv");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.toString();
        model.user.Manager manager9 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "WsR_[hRm]", "(j1+k0)lO");
        java.lang.String str15 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        booking0.setStatus("There is no Such Parking Lot");
        int int12 = booking0.getStartTime();
        java.lang.String str13 = booking0.getLicensePlate();
        java.lang.String str14 = booking0.getStatus();
        java.lang.String str15 = booking0.getLicensePlate();
        double double16 = booking0.getCost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = booking0.getTotalCost();
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.getType();
        model.user.Manager manager20 = new model.user.Manager(credentials17);
        model.user.Student student21 = new model.user.Student(credentials17);
        java.lang.String str22 = student21.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) student21);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        java.lang.String str12 = credentials7.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff11", nonFacultyStaff9.equals(nonFacultyStaff11) ? nonFacultyStaff9.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.toString();
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        java.lang.String str8 = student7.getStudentId();
        repo.RepositoryProvider repositoryProvider9 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository10 = repositoryProvider9.getBookingRepository();
        repo.ParkingRepository parkingRepository11 = repositoryProvider9.getParkingRepository();
        repo.BookingRepository bookingRepository12 = repositoryProvider9.getBookingRepository();
        repo.BookingRepository bookingRepository13 = repositoryProvider9.getBookingRepository();
        repo.ParkingRepository parkingRepository14 = repositoryProvider9.getParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList15 = parkingRepository14.getAllParkingLots();
        boolean boolean16 = student7.equals((java.lang.Object) parkingLotList15);
        repo.RepositoryProvider repositoryProvider17 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository18 = repositoryProvider17.getBookingRepository();
        repo.BookingRepository bookingRepository19 = repositoryProvider17.getBookingRepository();
        repo.BookingRepository bookingRepository20 = repositoryProvider17.getBookingRepository();
        repo.ParkingRepository parkingRepository21 = repositoryProvider17.getParkingRepository();
        repo.ParkingRepository parkingRepository22 = repositoryProvider17.getParkingRepository();
        repo.UserRepository userRepository23 = repositoryProvider17.getUserRepository();
        repo.ParkingRepository parkingRepository24 = repositoryProvider17.getParkingRepository();
        repo.UserRepository userRepository25 = repositoryProvider17.getUserRepository();
        boolean boolean26 = student7.equals((java.lang.Object) userRepository25);
        model.user.Credentials credentials30 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Student student31 = new model.user.Student(credentials30);
        java.lang.String str32 = credentials30.toString();
        model.user.FacultyMember facultyMember35 = new model.user.FacultyMember(credentials30, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}", "Parking Space 52 is already enabled.");
        model.user.Student student36 = new model.user.Student(credentials30);
        boolean boolean37 = student7.equals((java.lang.Object) credentials30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student31 and student36", student31.equals(student36) ? student31.hashCode() == student36.hashCode() : true);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.getType();
        java.lang.String str14 = credentials11.toString();
        java.lang.String str15 = credentials11.getLogin();
        model.user.User user16 = model.user.UserFactory.createAccount(credentials11);
        model.user.Client client17 = new model.user.Client(credentials11);
        model.user.Manager manager18 = new model.user.Manager(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = superManagerServices0.createAccount((model.user.User) manager18);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        java.lang.String str12 = clientServices0.getParkingSpaceById(100, 100);
        java.lang.String str15 = clientServices0.disableParkingSpaceById((int) (short) 10, (int) (byte) 100);
        java.lang.String str18 = clientServices0.getParkingSpaceById(1, 97);
        boolean boolean21 = clientServices0.updateBooking((int) (short) -1, (int) (byte) 1);
        model.parking.ParkingLot parkingLot23 = clientServices0.getParkingLotByAddress("Parking Space 1 is already enabled.");
        java.lang.String str26 = clientServices0.getParkingSpaceById(97, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList28 = clientServices0.getAllUsersBookings("Success: Parking Lot 100 has been disabled.");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "=B3fAbMGq", "Parking Lot -1 is already enabled.");
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        HcpxBjAE]", "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user3 = userService0.getUserByEmail("B7Q7?T8bL");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("users.json");
        boolean boolean6 = userService0.isValidEmail("HGL)]pX%+");
        repo.UserRepository userRepository7 = userService0.userRepository;
        model.user.Client client11 = new model.user.Client("Success: Parking Lot 97 has been enabled.", "R14et$0r@", "Failure: Parking Space -1 has active bookings. Parking Space has not been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) client11);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "", "Student");
        java.lang.String str4 = credentials3.getType();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "JoNIi]ebC", "Success: Parking Lot -1 has been disabled.");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        java.lang.String str9 = facultyMember8.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember8", facultyMember7.equals(facultyMember8) ? facultyMember7.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.lang.String str14 = clientServices0.disableParkingSpaceById(32, 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = clientServices0.cancenlBooking((int) (byte) 10);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList9 = clientServices0.getAllUsersBookings("#Kj&+e6wv");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        int int3 = booking0.getEndTime();
        int int4 = booking0.getSpaceId();
        java.lang.String str5 = booking0.getStatus();
        java.util.Date date6 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = booking0.getTotalCost();
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = new model.user.User(credentials3);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot12 = clientServices10.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList13 = clientServices10.getAllBookings();
        java.util.List<model.booking.Booking> bookingList14 = clientServices10.getAllBookings();
        java.lang.String str17 = clientServices10.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str20 = clientServices10.enableParkingSpaceById((-1), (int) 'a');
        java.lang.String str23 = clientServices10.enableParkingSpaceById((int) 'a', 0);
        boolean boolean24 = credentials3.equals((java.lang.Object) clientServices10);
        java.lang.String str27 = clientServices10.disableParkingSpaceById((int) (short) -1, 100);
        services.ClientServices clientServices28 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot30 = clientServices28.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList31 = clientServices28.getAllBookings();
        model.booking.Booking booking32 = new model.booking.Booking();
        int int33 = booking32.getStartTime();
        booking32.setEndTime((int) (short) 10);
        java.lang.String str36 = booking32.getEmail();
        java.util.Date date37 = booking32.getStartDateTime();
        boolean boolean38 = clientServices28.bookParkingSpace(booking32);
        java.util.Date date39 = booking32.getEndDateTime();
        booking32.setId(32);
        double double42 = booking32.getCost();
        boolean boolean43 = clientServices10.updateCompleteBooking(booking32);
        model.booking.Booking booking44 = new model.booking.Booking();
        int int45 = booking44.getStartTime();
        booking44.setEndTime((int) (short) 10);
        booking44.setCost((double) (short) 100);
        booking44.setStatus("Student");
        boolean boolean52 = clientServices10.bookParkingSpace(booking44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean54 = clientServices10.cancenlBooking((int) (short) 100);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str13 = facultyMember10.getFacultyId();
        model.user.Credentials credentials14 = facultyMember10.getCredentials();
        facultyMember10.validateAccount();
        facultyMember10.setFacultyId("Parking Space 97 is already enabled.");
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getPassword();
        java.lang.String str23 = credentials21.getType();
        java.lang.String str24 = credentials21.toString();
        java.lang.String str25 = credentials21.getLogin();
        model.user.User user26 = model.user.UserFactory.createAccount(credentials21);
        java.lang.String str27 = credentials21.getPassword();
        model.user.Student student29 = new model.user.Student(credentials21, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Manager manager30 = new model.user.Manager(credentials21);
        boolean boolean31 = facultyMember10.equals((java.lang.Object) manager30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials21", credentials3.equals(credentials21) ? credentials3.hashCode() == credentials21.hashCode() : true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("ZZUPGbwnh");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        java.lang.String str8 = superManagerServices0.generateStrongPassword();
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        model.user.User user18 = model.user.UserFactory.createAccount(credentials13);
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials13, "hi!", "Success: Parking Lot 32 has been disabled.");
        facultyMember21.setFacultyName("Parking Space 1 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = superManagerServices0.createAccount((model.user.User) facultyMember21);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.User user10 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff14.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff14", nonFacultyStaff11.equals(nonFacultyStaff14) ? nonFacultyStaff11.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        repo.RepositoryProvider repositoryProvider13 = new repo.RepositoryProvider();
        repo.UserRepository userRepository14 = repositoryProvider13.getUserRepository();
        repo.UserRepository userRepository15 = repositoryProvider13.getUserRepository();
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        java.lang.String str21 = credentials19.getType();
        model.user.Manager manager22 = new model.user.Manager(credentials19);
        userRepository15.removeUser((model.user.User) manager22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = userService0.registerUser((model.user.User) manager22);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        java.util.List<model.user.User> userList1 = userRepository0.getUsers();
        model.user.Credentials credentials5 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str6 = credentials5.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials5);
        model.user.Student student8 = new model.user.Student(credentials5);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository0.updateUser((model.user.User) nonFacultyStaff9);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setId((int) '#');
        booking0.setStartTime(0);
        java.util.Date date12 = booking0.getDate();
        int int13 = booking0.getStartTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking0.getTotalCost();
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        boolean boolean8 = facultyMember7.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember7", facultyMember5.equals(facultyMember7) ? facultyMember5.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean6 = superManagerServices0.isValidEmail("Success: Parking Space 100 has been enabled.");
        java.lang.String str7 = superManagerServices0.generateStrongPassword();
        model.user.Client client11 = new model.user.Client("Success: Parking Space 97 has been disabled.", "Success: Parking Space 100 has been disabled.", "Parking Space 35 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = superManagerServices0.createAccount((model.user.User) client11);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.Student student12 = new model.user.Student(credentials9);
        model.user.Student student14 = new model.user.Student(credentials9, "l@=7Kn[?f");
        student14.setStudentId("Rg2)djJx]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        parkingSpace1.setBooking(booking2);
        java.lang.String str7 = parkingSpace1.disableParkingSpace();
        java.lang.String str8 = parkingSpace1.disableParkingSpace();
        java.lang.String str9 = parkingSpace1.enableParkingSpace();
        model.booking.Booking booking10 = parkingSpace1.getBooking();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = booking10.getTotalCost();
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "hi!");
        java.lang.String str13 = credentials9.getPassword();
        model.user.User user14 = new model.user.User(credentials9);
        userRepository5.addUser(user14);
        java.util.List<model.user.User> userList16 = userRepository5.getUsers();
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        java.lang.String str22 = credentials20.getType();
        java.lang.String str23 = credentials20.toString();
        java.lang.String str24 = credentials20.getLogin();
        model.user.User user25 = model.user.UserFactory.createAccount(credentials20);
        java.lang.String str26 = credentials20.getPassword();
        model.user.Student student28 = new model.user.Student(credentials20, "\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str29 = student28.getStudentId();
        userRepository5.addUser((model.user.User) student28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials9 and credentials20", credentials9.equals(credentials20) ? credentials9.hashCode() == credentials20.hashCode() : true);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.User user4 = null;
        userRepository3.removeUser(user4);
        java.util.List<model.user.User> userList6 = userRepository3.getUsers();
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials10, "hi!");
        model.user.Credentials credentials14 = nonFacultyStaff13.getCredentials();
        model.user.Credentials credentials15 = nonFacultyStaff13.getCredentials();
        java.lang.String str16 = credentials15.getType();
        model.user.Manager manager17 = new model.user.Manager(credentials15);
        model.user.User user18 = new model.user.User(credentials15);
        userRepository3.addUser(user18);
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff26 = new model.user.NonFacultyStaff(credentials23, "hi!");
        java.lang.String str27 = credentials23.getPassword();
        model.user.Student student28 = new model.user.Student(credentials23);
        student28.setStudentId("pUdP465**");
        student28.setStudentId("Parking Space 100 is already disabled.");
        userRepository3.removeUser((model.user.User) student28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials10 and credentials23", credentials10.equals(credentials23) ? credentials10.hashCode() == credentials23.hashCode() : true);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials7);
        model.user.User user9 = model.user.UserFactory.createAccount(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        nonFacultyStaff10.setRole("4]z?3Qs%M");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.SuperManager superManager6 = model.user.SuperManager.getInstance();
        model.user.Credentials credentials7 = superManager6.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) superManager6);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        int int6 = booking0.getSpaceId();
        java.lang.String str7 = booking0.getStatus();
        booking0.setEndTime(97);
        int int10 = booking0.getEndTime();
        double double11 = booking0.getCost();
        java.lang.String str12 = booking0.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking0.getTotalCost();
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "users.json");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "b0K0Td]sJ");
        java.lang.String str13 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student12", student8.equals(student12) ? student8.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        java.lang.String str12 = facultyMember11.getFacultyId();
        facultyMember11.setFacultyName("Parking Lot 97 is already disabled.");
        repo.RepositoryProvider repositoryProvider15 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository16 = repositoryProvider15.getBookingRepository();
        repo.UserRepository userRepository17 = repositoryProvider15.getUserRepository();
        repo.UserRepository userRepository18 = repositoryProvider15.getUserRepository();
        boolean boolean19 = facultyMember11.equals((java.lang.Object) userRepository18);
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff26 = new model.user.NonFacultyStaff(credentials23, "hi!");
        model.user.Credentials credentials27 = nonFacultyStaff26.getCredentials();
        model.user.User user28 = model.user.UserFactory.createAccount(credentials27);
        java.lang.String str29 = credentials27.getLogin();
        model.user.User user30 = model.user.UserFactory.createAccount(credentials27);
        model.user.NonFacultyStaff nonFacultyStaff31 = new model.user.NonFacultyStaff(credentials27);
        userRepository18.removeUser((model.user.User) nonFacultyStaff31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials23", credentials3.equals(credentials23) ? credentials3.hashCode() == credentials23.hashCode() : true);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        boolean boolean7 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean9 = userService0.isValidEmail("Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.");
        services.UserService userService10 = new services.UserService();
        boolean boolean12 = userService10.isValidEmail("SuperManager");
        repo.UserRepository userRepository13 = userService10.userRepository;
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials17);
        userRepository13.addUser((model.user.User) facultyMember18);
        facultyMember18.setFacultyName("Parking Space 32 is already enabled.");
        facultyMember18.validateAccount();
        facultyMember18.setFacultyName("NonFacultyStaff");
        facultyMember18.setFacultyName("3AJB9R!TA");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = userService0.registerUser((model.user.User) facultyMember18);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        repo.UserRepository userRepository4 = userService0.userRepository;
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("A%v5&YzsA", "ZUkfmjuS]");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        boolean boolean10 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str11 = superManagerServices0.generateStrongPassword();
        java.lang.String str12 = superManagerServices0.generateRandomEmail();
        java.lang.String str13 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.toString();
        model.user.Manager manager19 = new model.user.Manager(credentials17);
        java.lang.String str20 = credentials17.getType();
        model.user.Visitor visitor21 = new model.user.Visitor(credentials17);
        model.user.Credentials credentials25 = new model.user.Credentials("hi!", "", "Student");
        model.user.Student student27 = new model.user.Student(credentials25, "Success: Parking Lot 100 has been disabled.");
        java.lang.String str28 = credentials25.getType();
        boolean boolean29 = credentials17.equals((java.lang.Object) credentials25);
        model.user.Manager manager30 = new model.user.Manager(credentials17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = superManagerServices0.createAccount((model.user.User) manager30);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "X5G?ZJ!c@", "Parking Lot 97 is already enabled.");
        model.user.User user4 = new model.user.User(credentials3);
        model.user.User user5 = new model.user.User(credentials3);
        java.lang.String str6 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user4 and user5", user4.equals(user5) ? user4.hashCode() == user5.hashCode() : true);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("users.json");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Lot -1 has been enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        facultyMember11.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str14 = facultyMember11.getFacultyName();
        java.lang.String str15 = facultyMember11.getFacultyId();
        java.lang.String str16 = facultyMember11.getFacultyId();
        java.lang.String str17 = facultyMember11.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = userService0.registerUser((model.user.User) facultyMember11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isValidEmail("Success: Parking Lot -1 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.loginUser("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           10.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager", "Success: Parking Lot 10 has been disabled.");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        facultyMember4.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str7 = facultyMember4.getFacultyName();
        java.lang.String str8 = facultyMember4.getFacultyId();
        java.lang.String str9 = facultyMember4.getFacultyId();
        services.ManagerServices managerServices10 = services.ManagerServices.getInstance();
        managerServices10.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList12 = managerServices10.getAllParkingLots();
        managerServices10.loadLots();
        repo.ParkingRepository parkingRepository14 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList15 = parkingRepository14.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList16 = parkingRepository14.getAllParkingLots();
        repo.RepositoryProvider repositoryProvider17 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository18 = repositoryProvider17.getBookingRepository();
        repo.UserRepository userRepository19 = repositoryProvider17.getUserRepository();
        model.user.Credentials credentials23 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user24 = new model.user.User(credentials23);
        userRepository19.addUser(user24);
        model.user.Credentials credentials29 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str30 = credentials29.getPassword();
        java.lang.String str31 = credentials29.toString();
        model.user.Visitor visitor32 = new model.user.Visitor(credentials29);
        model.user.Client client33 = new model.user.Client(credentials29);
        model.user.Student student35 = new model.user.Student(credentials29, "Student");
        userRepository19.addUser((model.user.User) student35);
        repo.ParkingRepository parkingRepository37 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList38 = parkingRepository37.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList39 = parkingRepository37.getAllParkingLots();
        boolean boolean40 = student35.equals((java.lang.Object) parkingLotList39);
        parkingRepository14.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList39);
        managerServices10.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList39);
        managerServices10.loadLots();
        managerServices10.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList45 = managerServices10.getAllParkingLots();
        boolean boolean46 = facultyMember4.equals((java.lang.Object) managerServices10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials29", credentials3.equals(credentials29) ? credentials3.hashCode() == credentials29.hashCode() : true);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isValidEmail("Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("iqmrymciB");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        model.user.Manager manager12 = new model.user.Manager(credentials7);
        services.ClientServices clientServices13 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot15 = clientServices13.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList16 = clientServices13.getAllBookings();
        java.lang.String str19 = clientServices13.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking21 = clientServices13.getBookingById(100);
        boolean boolean24 = clientServices13.updateBooking((int) ' ', (int) ' ');
        model.booking.Booking booking25 = new model.booking.Booking();
        int int26 = booking25.getStartTime();
        booking25.setEndTime((int) (short) 10);
        boolean boolean29 = clientServices13.bookParkingSpace(booking25);
        boolean boolean30 = credentials7.equals((java.lang.Object) booking25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager11 and manager12", manager11.equals(manager12) ? manager11.hashCode() == manager12.hashCode() : true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.Student student12 = new model.user.Student(credentials9);
        model.user.Student student14 = new model.user.Student(credentials9, "l@=7Kn[?f");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials9, "*a[AnW&Y-", "AAwYnzN!e");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isValidEmail("Y%XCkmT1Q");
        model.user.Client client11 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        (O3fsOXXJ", "(O3fsOXXJ", "2g]O0QGM)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = userService0.registerUser((model.user.User) client11);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 35 has been disabled.");
        boolean boolean8 = userService0.isValidEmail("Success: Parking Space -90 has been disabled.");
        model.user.Client client12 = new model.user.Client("", "Parking Space -1 is already enabled.", "]cT(-?mBj");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = userService0.registerUser((model.user.User) client12);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.loginUser("?qqRirU!a", "Success: Parking Space 1 has been enabled.");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.User user10 = model.user.UserFactory.createAccount(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setEmail("(O3fsOXXJ");
        double double12 = booking0.getCost();
        int int13 = booking0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking0.getTotalCost();
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isValidEmail("Student");
        boolean boolean11 = superManagerServices0.isStrongPassword("Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        boolean boolean13 = superManagerServices0.isStrongPassword("t3=jyxeE5");
        model.user.Credentials credentials17 = new model.user.Credentials("Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str18 = credentials17.getLogin();
        model.user.User user19 = model.user.UserFactory.createAccount(credentials17);
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials17);
        facultyMember20.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = superManagerServices0.createAccount((model.user.User) facultyMember20);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        java.lang.String str4 = superManagerServices0.generateRandomEmail();
        java.lang.String str5 = superManagerServices0.generateRandomEmail();
        java.lang.String str6 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        java.lang.String str14 = credentials10.toString();
        model.user.User user15 = model.user.UserFactory.createAccount(credentials10);
        model.booking.Booking booking16 = new model.booking.Booking();
        int int17 = booking16.getStartTime();
        booking16.setEndTime((int) (short) 10);
        java.lang.String str20 = booking16.getEmail();
        booking16.setCost((double) (byte) 0);
        int int23 = booking16.getLotId();
        booking16.setEndTime((int) (short) 100);
        java.lang.String str26 = booking16.getEmail();
        booking16.setLicensePlate("Give Id for parking Space is wrong");
        boolean boolean29 = credentials10.equals((java.lang.Object) booking16);
        model.user.Student student30 = new model.user.Student(credentials10);
        model.user.User user31 = new model.user.User(credentials10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = superManagerServices0.createAccount(user31);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setStatus(true);
        boolean boolean4 = parkingSpace1.getStatus();
        model.booking.Booking booking5 = new model.booking.Booking();
        int int6 = booking5.getStartTime();
        booking5.setEndTime((int) (short) 10);
        java.lang.String str9 = booking5.getEmail();
        booking5.setCost((double) (byte) 0);
        int int12 = booking5.getLotId();
        booking5.setCost((double) 100L);
        parkingSpace1.setBooking(booking5);
        java.lang.String str16 = booking5.toString();
        java.lang.String str17 = booking5.getLicensePlate();
        booking5.setId(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = booking5.getTotalCost();
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(10, (int) '4');
        model.parking.ParkingLot parkingLot8 = clientServices0.getParkingLotByAddress("9z6wsHuxQ");
        model.booking.Booking booking10 = clientServices0.getBookingById(52);
        java.util.List<model.booking.Booking> bookingList11 = clientServices0.getAllBookings();
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        booking12.setCost((double) (short) 100);
        int int18 = booking12.getSpaceId();
        int int19 = booking12.getTotalHours();
        boolean boolean20 = clientServices0.bookParkingSpace(booking12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = clientServices0.cancenlBooking((int) (short) -1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "hi!");
        model.user.Credentials credentials13 = nonFacultyStaff12.getCredentials();
        nonFacultyStaff12.setRole("Parking Lot 97 is already enabled.");
        userRepository5.addUser((model.user.User) nonFacultyStaff12);
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        java.lang.String str22 = credentials20.getType();
        java.lang.String str23 = credentials20.toString();
        java.lang.String str24 = credentials20.getLogin();
        model.user.User user25 = model.user.UserFactory.createAccount(credentials20);
        model.user.NonFacultyStaff nonFacultyStaff27 = new model.user.NonFacultyStaff(credentials20, "]82UgsU=G");
        nonFacultyStaff27.setRole("l@=7Kn[?f");
        nonFacultyStaff27.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        nonFacultyStaff27.validateAccount();
        nonFacultyStaff27.setRole("Wm(OGK*DZ");
        userRepository5.addUser((model.user.User) nonFacultyStaff27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials9 and credentials20", credentials9.equals(credentials20) ? credentials9.hashCode() == credentials20.hashCode() : true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot8 = clientServices0.getParkingLotByAddress("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        model.parking.ParkingLot parkingLot10 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        model.parking.ParkingSpace parkingSpace13 = new model.parking.ParkingSpace((int) (short) 1);
        model.booking.Booking booking14 = new model.booking.Booking();
        int int15 = booking14.getStartTime();
        booking14.setEndTime((int) (short) 10);
        java.lang.String str18 = booking14.getEmail();
        booking14.setCost((double) (byte) 0);
        int int21 = booking14.getLotId();
        booking14.setEndTime((int) (short) 100);
        java.lang.String str24 = booking14.toString();
        int int25 = booking14.getId();
        booking14.setEndTime((int) (short) 10);
        java.util.Date date28 = booking14.getDate();
        int int29 = booking14.getId();
        booking14.setStartTime((int) (short) 100);
        java.util.Date date32 = booking14.getEndDateTime();
        parkingSpace13.setBooking(booking14);
        model.booking.Booking booking34 = parkingSpace13.getBooking();
        boolean boolean35 = clientServices0.bookParkingSpace(booking34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList37 = clientServices0.getAllUsersBookings("#m2s(PF$O");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "", "A%v5&YzsA");
        model.user.Credentials credentials16 = facultyMember15.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember15", facultyMember11.equals(facultyMember15) ? facultyMember11.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        boolean boolean7 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean9 = userService0.isValidEmail("Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.");
        boolean boolean11 = userService0.isValidEmail("Parking Lot 97 is already enabled.");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.toString();
        model.user.Visitor visitor18 = new model.user.Visitor(credentials15);
        model.user.Student student20 = new model.user.Student(credentials15, "users.json");
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials15);
        facultyMember21.setFacultyId("Success: Parking Space 97 has been enabled.");
        facultyMember21.validateAccount();
        java.lang.String str25 = facultyMember21.getFacultyName();
        java.lang.String str26 = facultyMember21.getFacultyName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = userService0.registerUser((model.user.User) facultyMember21);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 1 has been enabled.");
        boolean boolean8 = userService0.isStrongPassword("Wd_kK(d(K");
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        java.lang.String str14 = credentials12.toString();
        model.user.Visitor visitor15 = new model.user.Visitor(credentials12);
        model.user.Client client16 = new model.user.Client(credentials12);
        model.user.Student student18 = new model.user.Student(credentials12, "Student");
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials12);
        model.parking.ParkingLot parkingLot22 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str23 = parkingLot22.enableParkingLot();
        java.lang.String str24 = parkingLot22.disableParkingLot();
        boolean boolean25 = parkingLot22.getStatus();
        java.lang.String str26 = parkingLot22.disableParkingLot();
        boolean boolean27 = nonFacultyStaff19.equals((java.lang.Object) str26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = userService0.registerUser((model.user.User) nonFacultyStaff19);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.booking.Booking booking2 = clientServices0.getBookingById((int) (short) 1);
        model.booking.Booking booking4 = clientServices0.getBookingById((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = clientServices0.cancenlBooking((-87));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("B7Q7?T8bL");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 1 is already disabled.", "X?EhgrKDV", "Success: Parking Lot -1 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "&jn[e]&j%");
        model.user.Student student6 = new model.user.Student(credentials3);
        student6.setStudentId("gH7ICSj!r");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student6", student5.equals(student6) ? student5.hashCode() == student6.hashCode() : true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository6 = userService0.userRepository;
        model.user.User user7 = null;
        userRepository6.removeUser(user7);
        model.user.Client client12 = new model.user.Client("(j1+k0)lO", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null", "740DtnjCF");
        userRepository6.removeUser((model.user.User) client12);
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17, "hi!");
        model.user.Credentials credentials21 = nonFacultyStaff20.getCredentials();
        model.user.User user22 = model.user.UserFactory.createAccount(credentials21);
        model.user.Student student23 = new model.user.Student(credentials21);
        java.lang.String str24 = credentials21.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials21);
        userRepository6.addUser((model.user.User) nonFacultyStaff25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff20 and nonFacultyStaff25", nonFacultyStaff20.equals(nonFacultyStaff25) ? nonFacultyStaff20.hashCode() == nonFacultyStaff25.hashCode() : true);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getLogin();
        strategy.StudentParkingRate studentParkingRate11 = new strategy.StudentParkingRate();
        double double13 = studentParkingRate11.calculateRate((double) 1.0f);
        boolean boolean14 = credentials9.equals((java.lang.Object) 1.0f);
        model.user.User user15 = new model.user.User(credentials9);
        model.user.User user16 = model.user.UserFactory.createAccount(credentials9);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = userService0.registerUser((model.user.User) nonFacultyStaff17);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("FacultyMember");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        boolean boolean3 = userService0.isValidEmail("]Q8Qq1gv4");
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        java.lang.String str9 = credentials7.toString();
        model.user.User user10 = new model.user.User(credentials7);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7, "Parking Lot 97 is already enabled.", "Wm(OGK*DZ");
        java.lang.String str14 = facultyMember13.getFacultyName();
        facultyMember13.setFacultyName("Success: Parking Space 1 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = userService0.registerUser((model.user.User) facultyMember13);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Success: Parking Lot 97 has been enabled.");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        model.user.Credentials credentials5 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str6 = credentials5.getPassword();
        java.lang.String str7 = credentials5.getType();
        java.lang.String str8 = credentials5.toString();
        java.lang.String str9 = credentials5.getLogin();
        model.user.User user10 = model.user.UserFactory.createAccount(credentials5);
        java.lang.String str11 = credentials5.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials5);
        nonFacultyStaff12.setRole("Success: Parking Lot 100 has been disabled.");
        java.lang.String str15 = nonFacultyStaff12.getRole();
        nonFacultyStaff12.setRole("Parking Space 97 is already enabled.");
        userRepository1.removeUser((model.user.User) nonFacultyStaff12);
        nonFacultyStaff12.setRole("Parking Space 100 is already enabled.");
        java.lang.String str21 = nonFacultyStaff12.getRole();
        java.lang.String str22 = nonFacultyStaff12.getRole();
        model.user.Credentials credentials23 = nonFacultyStaff12.getCredentials();
        model.user.Visitor visitor24 = new model.user.Visitor(credentials23);
        model.user.Visitor visitor25 = new model.user.Visitor(credentials23);
        model.user.Student student27 = new model.user.Student(credentials23, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor24 and visitor25", visitor24.equals(visitor25) ? visitor24.hashCode() == visitor25.hashCode() : true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        boolean boolean14 = userService0.isValidEmail("tpQo&#L]V");
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getLogin();
        strategy.StudentParkingRate studentParkingRate20 = new strategy.StudentParkingRate();
        double double22 = studentParkingRate20.calculateRate((double) 1.0f);
        boolean boolean23 = credentials18.equals((java.lang.Object) 1.0f);
        model.user.FacultyMember facultyMember24 = new model.user.FacultyMember(credentials18);
        facultyMember24.setFacultyId("Parking Lot 32 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = userService0.registerUser((model.user.User) facultyMember24);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        booking13.setEndTime((int) (short) 10);
        java.lang.String str17 = booking13.getEmail();
        booking13.setCost((double) (byte) 0);
        int int20 = booking13.getLotId();
        booking13.setEndTime((int) (short) 100);
        java.lang.String str23 = booking13.getEmail();
        java.util.Date date24 = booking13.getStartDateTime();
        java.lang.String str25 = booking13.getLicensePlate();
        boolean boolean26 = clientServices0.bookParkingSpace(booking13);
        model.booking.Booking booking28 = clientServices0.getBookingById(35);
        boolean boolean31 = clientServices0.updateBooking((int) '#', (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = clientServices0.cancenlBooking((int) ' ');
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        repo.UserRepository userRepository13 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.loginUser("Success: Parking Space 97 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.getUserByEmail("Success: Parking Lot 10 has been disabled.");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.loginUser("JA4?OBm[J", "xQ)b!n)sD");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        model.user.Client client11 = new model.user.Client(credentials3);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client9 and client11", client9.equals(client11) ? client9.hashCode() == client11.hashCode() : true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager10 = new model.user.Manager(credentials7);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7, "HcpxBjAE]", "4]z?3Qs%M");
        java.lang.String str14 = facultyMember13.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        booking11.setEndTime((int) (short) 10);
        java.lang.String str15 = booking11.getEmail();
        java.util.Date date16 = booking11.getStartDateTime();
        int int17 = booking11.getTotalHours();
        booking11.setEndTime((int) ' ');
        boolean boolean20 = clientServices0.updateCompleteBooking(booking11);
        java.lang.String str23 = clientServices0.disableParkingSpaceById((int) (short) 100, (int) (byte) 100);
        model.parking.ParkingLot parkingLot25 = clientServices0.getParkingLotByAddress("?bCwuuL2=");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList27 = clientServices0.getAllUsersBookings("=syRIr=H*");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("success");
        boolean boolean5 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        java.lang.String str7 = superManagerServices0.generateRandomEmail();
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials12);
        model.user.Client client14 = new model.user.Client(credentials12);
        model.user.Student student15 = new model.user.Student(credentials12);
        java.lang.String str16 = student15.getStudentId();
        student15.validateAccount();
        java.lang.String str18 = student15.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = superManagerServices0.createAccount((model.user.User) student15);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Success: Parking Space 1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        facultyMember9.setFacultyId("iqmrymciB");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember9", facultyMember5.equals(facultyMember9) ? facultyMember5.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "hi!");
        java.lang.String str13 = credentials9.getPassword();
        model.user.User user14 = new model.user.User(credentials9);
        userRepository5.addUser(user14);
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials19);
        java.lang.String str21 = facultyMember20.getFacultyId();
        java.lang.String str22 = facultyMember20.getFacultyId();
        facultyMember20.setFacultyName("");
        facultyMember20.setFacultyName("Parking Lot 97 is already disabled.");
        facultyMember20.setFacultyName("OZs%xojGf");
        userRepository5.removeUser((model.user.User) facultyMember20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials9 and credentials19", credentials9.equals(credentials19) ? credentials9.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        facultyMember8.setFacultyName("Parking Space 32 is already enabled.");
        facultyMember8.validateAccount();
        facultyMember8.setFacultyName("NonFacultyStaff");
        model.user.Credentials credentials15 = facultyMember8.getCredentials();
        java.lang.String str16 = credentials15.getLogin();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials15);
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember17", facultyMember8.equals(facultyMember17) ? facultyMember8.hashCode() == facultyMember17.hashCode() : true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        java.lang.String str12 = clientServices0.getParkingSpaceById(100, 100);
        java.lang.String str15 = clientServices0.disableParkingSpaceById((int) (short) 10, (int) (byte) 100);
        java.lang.String str18 = clientServices0.getParkingSpaceById(1, 97);
        boolean boolean21 = clientServices0.updateBooking((int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList23 = clientServices0.getAllUsersBookings("cZ=IAx!!l");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = clientServices0.cancenlBooking((int) '#');
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials9 = new model.user.Credentials("Wm(OGK*DZ", "(O3fsOXXJ", "tZectvKdt");
        model.user.Student student11 = new model.user.Student(credentials9, "tpQo&#L]V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) student11);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<java.lang.String> strList5 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = clientServices0.cancenlBooking((int) ' ');
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str7 = credentials3.getLogin();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "", "Parking Space 97 is already disabled.");
        model.user.Student student12 = new model.user.Student(credentials3, "Parking Space 10 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember10", facultyMember4.equals(facultyMember10) ? facultyMember4.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository8 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository9 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        model.user.Student student18 = new model.user.Student(credentials13, "users.json");
        java.lang.String str19 = student18.getStudentId();
        student18.setStudentId("Success: Parking Lot 100 has been disabled.");
        userRepository9.addUser((model.user.User) student18);
        model.user.Credentials credentials26 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember27 = new model.user.FacultyMember(credentials26);
        facultyMember27.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str30 = facultyMember27.getFacultyName();
        facultyMember27.setFacultyName("8hXCtaT!&");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) facultyMember27);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember10.validateAccount();
        model.user.Credentials credentials14 = facultyMember10.getCredentials();
        java.lang.String str15 = credentials14.getType();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials14);
        model.user.Student student18 = new model.user.Student(credentials14, "1Uy3Mwvq6");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor16", visitor6.equals(visitor16) ? visitor6.hashCode() == visitor16.hashCode() : true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking(35, (int) (byte) 0);
        boolean boolean12 = clientServices0.updateBooking((int) (byte) 0, (int) (byte) -1);
        model.booking.Booking booking14 = clientServices0.getBookingById(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList16 = clientServices0.getAllUsersBookings("Success: Parking Lot -87 has been disabled.");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) ' ', (int) ' ');
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        boolean boolean16 = clientServices0.bookParkingSpace(booking12);
        model.parking.ParkingLot parkingLot18 = clientServices0.getParkingLotByAddress("Parking Space 35 is already enabled.");
        model.booking.Booking booking19 = new model.booking.Booking();
        int int20 = booking19.getStartTime();
        booking19.setEndTime((int) (short) 10);
        java.lang.String str23 = booking19.getEmail();
        booking19.setCost((double) (byte) 0);
        int int26 = booking19.getLotId();
        booking19.setEmail("Manager");
        booking19.setStartTime((int) (byte) 0);
        double double31 = booking19.getCost();
        java.lang.String str32 = booking19.toString();
        java.lang.String str33 = booking19.toString();
        booking19.setEndTime((int) (byte) 1);
        boolean boolean36 = clientServices0.bookParkingSpace(booking19);
        boolean boolean39 = clientServices0.updateBooking((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = clientServices0.cancenlBooking((int) '#');
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        model.user.Student student13 = new model.user.Student(credentials7, "pUdP465**");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean6 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember10.validateAccount();
        model.user.Credentials credentials14 = facultyMember10.getCredentials();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials14, "Manager", "(j1+k0)lO");
        model.user.Manager manager18 = new model.user.Manager(credentials14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember17", facultyMember10.equals(facultyMember17) ? facultyMember10.hashCode() == facultyMember17.hashCode() : true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository8 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository9 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials13, "hi!");
        model.user.Credentials credentials17 = nonFacultyStaff16.getCredentials();
        model.user.Credentials credentials18 = nonFacultyStaff16.getCredentials();
        boolean boolean19 = nonFacultyStaff16.getValidationStatus();
        java.lang.String str20 = nonFacultyStaff16.getRole();
        java.lang.String str21 = nonFacultyStaff16.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) nonFacultyStaff16);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.getUserByEmail("Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = new model.user.User(credentials3);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot12 = clientServices10.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList13 = clientServices10.getAllBookings();
        java.util.List<model.booking.Booking> bookingList14 = clientServices10.getAllBookings();
        java.lang.String str17 = clientServices10.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str20 = clientServices10.enableParkingSpaceById((-1), (int) 'a');
        java.lang.String str23 = clientServices10.enableParkingSpaceById((int) 'a', 0);
        boolean boolean24 = credentials3.equals((java.lang.Object) clientServices10);
        model.parking.ParkingLot parkingLot26 = clientServices10.getParkingLotByAddress("Credentials{login='hi!', password='hi!', type='hi!'}");
        model.parking.ParkingLot parkingLot28 = clientServices10.getParkingLotByAddress("Credentials{login='hi!', password='', type='Student'}");
        java.lang.String str31 = clientServices10.getParkingSpaceById(1, 99);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList33 = clientServices10.getAllUsersBookings("K#3J1MLbd");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        model.booking.Booking booking7 = new model.booking.Booking();
        int int8 = booking7.getStartTime();
        booking7.setEndTime((int) (short) 10);
        java.lang.String str11 = booking7.getEmail();
        java.util.Date date12 = booking7.getStartDateTime();
        boolean boolean13 = clientServices0.bookParkingSpace(booking7);
        model.parking.ParkingSpace parkingSpace15 = new model.parking.ParkingSpace((int) '#');
        parkingSpace15.setStatus(true);
        boolean boolean18 = parkingSpace15.getStatus();
        model.booking.Booking booking19 = new model.booking.Booking();
        int int20 = booking19.getStartTime();
        booking19.setEndTime((int) (short) 10);
        java.lang.String str23 = booking19.getEmail();
        booking19.setCost((double) (byte) 0);
        int int26 = booking19.getLotId();
        booking19.setCost((double) 100L);
        parkingSpace15.setBooking(booking19);
        java.lang.String str30 = booking19.toString();
        java.lang.String str31 = booking19.getStatus();
        boolean boolean32 = clientServices0.bookParkingSpace(booking19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.booking.Booking booking34 = clientServices0.getBookingById((int) (byte) 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        repo.UserRepository userRepository7 = userService0.userRepository;
        model.user.Client client11 = new model.user.Client("FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null", "Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = userService0.registerUser((model.user.User) client11);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        repo.UserRepository userRepository13 = userService0.userRepository;
        repo.UserRepository userRepository14 = userService0.userRepository;
        repo.UserRepository userRepository15 = new repo.UserRepository();
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials19);
        facultyMember20.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str23 = facultyMember20.getFacultyId();
        userRepository15.addUser((model.user.User) facultyMember20);
        java.lang.String str25 = facultyMember20.getFacultyName();
        java.lang.String str26 = facultyMember20.getFacultyId();
        java.lang.String str27 = facultyMember20.getFacultyName();
        facultyMember20.setFacultyId("DYp5a&9eU");
        userRepository14.addUser((model.user.User) facultyMember20);
        model.user.Client client34 = new model.user.Client("Success: Parking Lot 97 has been disabled.", "Success: Parking Lot 97 has been disabled.", "Credentials{login='hi!', password='hi!', type='hi!'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository14.updateUser((model.user.User) client34);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        services.UserService userService0 = services.UserService.getInstance();
        boolean boolean2 = userService0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository6 = userService0.userRepository;
        java.util.List<model.user.User> userList7 = userRepository6.getUsers();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials11);
        java.lang.String str13 = facultyMember12.getFacultyId();
        java.lang.String str14 = facultyMember12.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository6.updateUser((model.user.User) facultyMember12);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.util.Date date5 = booking0.getStartDateTime();
        booking0.setId((int) (byte) 100);
        booking0.setCost((double) (byte) -1);
        booking0.setLicensePlate("Parking Lot 1 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = booking0.getTotalCost();
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.User user6 = null;
        userRepository5.removeUser(user6);
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials11);
        model.user.User user14 = new model.user.User(credentials11);
        java.lang.String str15 = credentials11.toString();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials11);
        userRepository5.addUser((model.user.User) facultyMember16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember16", facultyMember13.equals(facultyMember16) ? facultyMember13.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        repo.UserRepository userRepository11 = userService0.userRepository;
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.getType();
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials15, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        facultyMember20.setFacultyId("NonFacultyStaff");
        facultyMember20.setFacultyId("");
        model.user.Credentials credentials25 = facultyMember20.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = userService0.registerUser((model.user.User) facultyMember20);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        services.UserService userService7 = new services.UserService();
        boolean boolean9 = userService7.isValidEmail("SuperManager");
        boolean boolean11 = userService7.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository12 = userService7.userRepository;
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials16, "hi!");
        model.user.Credentials credentials20 = nonFacultyStaff19.getCredentials();
        nonFacultyStaff19.setRole("Parking Lot 97 is already enabled.");
        userRepository12.addUser((model.user.User) nonFacultyStaff19);
        boolean boolean24 = credentials3.equals((java.lang.Object) userRepository12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials16", credentials3.equals(credentials16) ? credentials3.hashCode() == credentials16.hashCode() : true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student10 = new model.user.Student(credentials7, "");
        services.UserService userService11 = new services.UserService();
        boolean boolean13 = userService11.isValidEmail("SuperManager");
        repo.UserRepository userRepository14 = userService11.userRepository;
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials18, "hi!");
        model.user.Credentials credentials22 = nonFacultyStaff21.getCredentials();
        model.user.Credentials credentials23 = nonFacultyStaff21.getCredentials();
        userRepository14.removeUser((model.user.User) nonFacultyStaff21);
        java.util.List<model.user.User> userList25 = userRepository14.getUsers();
        model.user.User user29 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.", "NonFacultyStaff", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        userRepository14.addUser(user29);
        boolean boolean31 = credentials7.equals((java.lang.Object) user29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials18", credentials7.equals(credentials18) ? credentials7.hashCode() == credentials18.hashCode() : true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember6", facultyMember4.equals(facultyMember6) ? facultyMember4.hashCode() == facultyMember6.hashCode() : true);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("nypNgo#ar");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        repo.UserRepository userRepository13 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.loginUser("l=PztP**d", "Parking Space 1 is already disabled.");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("success");
        boolean boolean5 = superManagerServices0.isStrongPassword("");
        boolean boolean7 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getLogin();
        strategy.StudentParkingRate studentParkingRate14 = new strategy.StudentParkingRate();
        double double16 = studentParkingRate14.calculateRate((double) 1.0f);
        boolean boolean17 = credentials12.equals((java.lang.Object) 1.0f);
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials12);
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials12, "");
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = superManagerServices0.createAccount((model.user.User) facultyMember21);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.util.Date date5 = booking0.getStartDateTime();
        int int6 = booking0.getTotalHours();
        int int7 = booking0.getId();
        int int8 = booking0.getStartTime();
        java.util.Date date9 = booking0.getStartDateTime();
        java.lang.String str10 = booking0.getStatus();
        java.util.Date date11 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = booking0.getTotalCost();
    }
}

