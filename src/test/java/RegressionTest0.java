import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = constants.Constants.NONFACULTYSTAFF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "NonFacultyStaff" + "'", str0, "NonFacultyStaff");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        services.UserService userService0 = new services.UserService();
        java.lang.Class<?> wildcardClass1 = userService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        model.user.UserFactory userFactory0 = new model.user.UserFactory();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str0 = constants.Constants.SUPERMANAGER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SuperManager" + "'", str0, "SuperManager");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        model.sensor.Sensor sensor0 = new model.sensor.Sensor();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = constants.Constants.STUDENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Student" + "'", str0, "Student");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str0 = constants.Constants.MANAGER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Manager" + "'", str0, "Manager");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        strategy.StrategyHandler strategyHandler0 = new strategy.StrategyHandler();
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str0 = constants.Constants.FACULTYMEMBER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FacultyMember" + "'", str0, "FacultyMember");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        model.user.User user3 = new model.user.User("NonFacultyStaff", "Success: Parking Space 97 has been enabled.", "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        strategy.StudentParkingRate studentParkingRate0 = new strategy.StudentParkingRate();
        java.lang.Class<?> wildcardClass1 = studentParkingRate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        model.user.Credentials credentials10 = null;
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10, "");
        // The following exception was thrown during execution in test generation
        try {
            userRepository3.updateUser((model.user.User) nonFacultyStaff12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.Credentials.getLogin()\" because the return value of \"model.user.User.getCredentials()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str3 = parkingLot2.enableParkingLot();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList4 = parkingLot2.getParkingSpaces();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Parking Lot 97 is already enabled." + "'", str3, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str0 = constants.Constants.VISITOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Visitor" + "'", str0, "Visitor");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        model.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = clientServices0.updateCompleteBooking(booking5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.booking.Booking.getId()\" because \"newbooking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        int int4 = parkingSpace1.getSpaceID();
        boolean boolean5 = parkingSpace1.hasBooking();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str0 = constants.Constants.USER_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "users.json" + "'", str0, "users.json");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getLogin();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str6, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = student9.getStudentId();
        student9.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        java.lang.String str13 = student9.getStudentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null" + "'", str13, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        java.lang.String str3 = clientServices0.enableParkingSpaceById((int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = clientServices0.getClass();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Give Id for parking Space is wrong" + "'", str3, "Give Id for parking Space is wrong");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        facultyMember5.setFacultyId("Success: Parking Space 97 has been enabled.");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((-1), "Success: Parking Lot 97 has been disabled.");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        java.lang.Class<?> wildcardClass4 = parkingSpaceList3.getClass();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.Class<?> wildcardClass8 = nonFacultyStaff6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        model.user.Client client3 = new model.user.Client("Parking Lot 100 is already enabled.", "hi!", "hi!");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Client client9 = new model.user.Client(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        model.user.Client client3 = new model.user.Client("", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager", "success");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) (byte) 100, (int) (short) 10);
        java.lang.String str6 = clientServices0.enableParkingSpaceById((int) (short) 10, 1);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        repo.BookingRepository bookingRepository0 = new repo.BookingRepository();
        model.booking.Booking booking1 = new model.booking.Booking();
        int int2 = booking1.getStartTime();
        booking1.setEndTime((int) (short) 10);
        java.lang.String str5 = booking1.getEmail();
        model.booking.Booking booking6 = new model.booking.Booking();
        int int7 = booking6.getStartTime();
        booking6.setEndTime((int) (short) 10);
        java.lang.String str10 = booking6.getEmail();
        booking6.setCost((double) (byte) 0);
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        int int15 = booking13.getId();
        booking13.setEndTime((int) 'a');
        model.booking.Booking booking18 = new model.booking.Booking();
        int int19 = booking18.getStartTime();
        booking18.setEndTime((int) (short) 10);
        java.lang.String str22 = booking18.getEmail();
        booking18.setCost((double) (byte) 0);
        int int25 = booking18.getLotId();
        booking18.setEmail("Manager");
        model.booking.Booking booking28 = new model.booking.Booking();
        int int29 = booking28.getStartTime();
        int int30 = booking28.getId();
        model.booking.Booking booking31 = new model.booking.Booking();
        int int32 = booking31.getStartTime();
        int int33 = booking31.getId();
        booking31.setEndTime((int) 'a');
        model.booking.Booking booking36 = new model.booking.Booking();
        int int37 = booking36.getStartTime();
        booking36.setEndTime((int) (short) 10);
        booking36.setCost((double) (short) 100);
        model.booking.Booking[] bookingArray42 = new model.booking.Booking[] { booking1, booking6, booking13, booking18, booking28, booking31, booking36 };
        java.util.ArrayList<model.booking.Booking> bookingList43 = new java.util.ArrayList<model.booking.Booking>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<model.booking.Booking>) bookingList43, bookingArray42);
        bookingRepository0.updateBookings((java.util.List<model.booking.Booking>) bookingList43);
        java.util.ArrayList<model.booking.Booking> bookingList46 = bookingRepository0.getAllBookings();
        java.lang.Class<?> wildcardClass47 = bookingRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(bookingArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(bookingList46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        int int17 = booking5.getStartTime();
        java.lang.String str18 = booking5.getEmail();
        booking5.setStatus("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null" + "'", str16, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.booking.Booking booking2 = clientServices0.getBookingById((int) (short) 1);
        model.booking.Booking booking4 = clientServices0.getBookingById((int) ' ');
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNull(booking4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        int int11 = booking4.getEndTime();
        booking4.setCost((double) (short) 100);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        java.lang.Class<?> wildcardClass12 = clientServices0.getClass();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        repo.BookingRepository bookingRepository0 = new repo.BookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        repo.BookingRepository bookingRepository2 = new repo.BookingRepository();
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        java.lang.String str7 = booking3.getEmail();
        model.booking.Booking booking8 = new model.booking.Booking();
        int int9 = booking8.getStartTime();
        booking8.setEndTime((int) (short) 10);
        java.lang.String str12 = booking8.getEmail();
        booking8.setCost((double) (byte) 0);
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        int int17 = booking15.getId();
        booking15.setEndTime((int) 'a');
        model.booking.Booking booking20 = new model.booking.Booking();
        int int21 = booking20.getStartTime();
        booking20.setEndTime((int) (short) 10);
        java.lang.String str24 = booking20.getEmail();
        booking20.setCost((double) (byte) 0);
        int int27 = booking20.getLotId();
        booking20.setEmail("Manager");
        model.booking.Booking booking30 = new model.booking.Booking();
        int int31 = booking30.getStartTime();
        int int32 = booking30.getId();
        model.booking.Booking booking33 = new model.booking.Booking();
        int int34 = booking33.getStartTime();
        int int35 = booking33.getId();
        booking33.setEndTime((int) 'a');
        model.booking.Booking booking38 = new model.booking.Booking();
        int int39 = booking38.getStartTime();
        booking38.setEndTime((int) (short) 10);
        booking38.setCost((double) (short) 100);
        model.booking.Booking[] bookingArray44 = new model.booking.Booking[] { booking3, booking8, booking15, booking20, booking30, booking33, booking38 };
        java.util.ArrayList<model.booking.Booking> bookingList45 = new java.util.ArrayList<model.booking.Booking>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<model.booking.Booking>) bookingList45, bookingArray44);
        bookingRepository2.updateBookings((java.util.List<model.booking.Booking>) bookingList45);
        bookingRepository0.updateBookings((java.util.List<model.booking.Booking>) bookingList45);
        services.ClientServices clientServices49 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot51 = clientServices49.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList52 = clientServices49.getAllLocations();
        java.util.List<model.booking.Booking> bookingList53 = clientServices49.getAllBookings();
        bookingRepository0.updateBookings(bookingList53);
        java.lang.Class<?> wildcardClass55 = bookingList53.getClass();
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bookingArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(clientServices49);
        org.junit.Assert.assertNull(parkingLot51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(bookingList53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        java.lang.String str14 = clientServices0.disableParkingSpaceById(100, (int) '#');
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Success: Parking Space 35 has been disabled." + "'", str14, "Success: Parking Space 35 has been disabled.");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        model.user.User user3 = new model.user.User("There is no Such Parking Lot", "Parking Space -1 is already enabled.", "Wm(OGK*DZ");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(bookingArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(clientServices56);
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(bookingList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        java.lang.Class<?> wildcardClass14 = booking0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        model.user.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = superManagerServices0.createAccount(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.User.getCredentials()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        client9.validateAccount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str6, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setCost((double) 10L);
        booking0.setEmail("Parking Space 35 is already enabled.");
        java.lang.String str7 = booking0.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled." + "'", str7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        model.user.User user3 = new model.user.User("Wm(OGK*DZ", "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.Class<?> wildcardClass10 = credentials7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        services.ClientServices clientServices5 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot7 = clientServices5.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList8 = clientServices5.getAllBookings();
        java.lang.String str11 = clientServices5.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean14 = clientServices5.updateBooking((int) '#', (int) (short) 0);
        boolean boolean15 = credentials3.equals((java.lang.Object) (short) 0);
        model.user.Client client16 = new model.user.Client(credentials3);
        org.junit.Assert.assertNotNull(clientServices5);
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "There is no Such Parking Lot" + "'", str11, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.toString();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str9, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str3 = parkingLot2.enableParkingLot();
        java.lang.String str4 = parkingLot2.disableParkingLot();
        java.lang.String str5 = parkingLot2.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Parking Lot 97 is already enabled." + "'", str3, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Lot 97 has been disabled." + "'", str4, "Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 97 is already disabled." + "'", str5, "Parking Lot 97 is already disabled.");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        int int4 = parkingLot2.getLotID();
        java.lang.String str5 = parkingLot2.disableParkingLot();
        parkingLot2.setLocation("SuperManager");
        java.lang.String str8 = parkingLot2.getLocation();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Lot 97 has been disabled." + "'", str5, "Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SuperManager" + "'", str8, "SuperManager");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = student9.getStudentId();
        student9.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        services.ClientServices clientServices13 = services.ClientServices.getInstance();
        model.booking.Booking booking15 = clientServices13.getBookingById((int) (short) 1);
        boolean boolean16 = student9.equals((java.lang.Object) clientServices13);
        boolean boolean19 = clientServices13.updateBooking(10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(clientServices13);
        org.junit.Assert.assertNull(booking15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        model.parking.ParkingLot parkingLot13 = clientServices0.getParkingLotByAddress("hi!");
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(parkingLot13);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        boolean boolean16 = clientServices0.updateBooking(10, (int) 'a');
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        model.user.Credentials credentials3 = null;
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = userService0.registerUser((model.user.User) nonFacultyStaff5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.Credentials.equals(Object)\" because the return value of \"model.user.User.getCredentials()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 1.0f);
        double double4 = facultyParkingRate0.calculateRate(15.0d);
        double double6 = facultyParkingRate0.calculateRate(100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 120.0d + "'", double4 == 120.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 800.0d + "'", double6 == 800.0d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) 0);
        parkingSpace1.setSpaceID(0);
        boolean boolean4 = parkingSpace1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        java.lang.Class<?> wildcardClass11 = credentials9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        model.user.Credentials credentials3 = new model.user.Credentials("Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str4 = credentials3.getLogin();
        java.lang.Class<?> wildcardClass5 = credentials3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str4, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.util.Date date5 = booking0.getDate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        boolean boolean10 = clientServices0.updateBooking((int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "There is no Such Parking Lot" + "'", str5, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        java.lang.String str5 = facultyMember4.getFacultyId();
        facultyMember4.setFacultyId("hi!");
        facultyMember4.setFacultyName("hi!");
        facultyMember4.setFacultyId("Parking Space 32 is already disabled.");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials10 = student9.getCredentials();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null", "Parking Space -1 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(credentials10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientServices0.bookParkingSpace(booking6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.booking.Booking.getLotId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "There is no Such Parking Lot" + "'", str5, "There is no Such Parking Lot");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        student9.validateAccount();
        java.lang.String str11 = student9.getStudentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        model.user.Client client3 = new model.user.Client("Student", "Give Id for parking Space is wrong", "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        model.user.User user3 = new model.user.User("Success: Parking Space 97 has been disabled.", "NonFacultyStaff", "pUdP465**");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList2 = managerServices0.getAllParkingLots();
        managerServices0.loadLots();
        repo.ParkingRepository parkingRepository4 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean8 = parkingLot7.getStatus();
        model.parking.ParkingLot parkingLot11 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean12 = parkingLot11.getStatus();
        boolean boolean13 = parkingLot11.getStatus();
        model.parking.ParkingLot parkingLot16 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean17 = parkingLot16.getStatus();
        boolean boolean18 = parkingLot16.getStatus();
        model.parking.ParkingLot parkingLot21 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean22 = parkingLot21.getStatus();
        boolean boolean23 = parkingLot21.getStatus();
        parkingLot21.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray26 = new model.parking.ParkingLot[] { parkingLot7, parkingLot11, parkingLot16, parkingLot21 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList27 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList27, parkingLotArray26);
        parkingRepository4.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList27);
        managerServices0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList27);
        model.parking.ParkingLot parkingLot33 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList34 = parkingLot33.getParkingSpaces();
        int int35 = parkingLot33.getLotID();
        managerServices0.addParkingLot(parkingLot33);
        model.parking.ParkingLot parkingLot39 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList40 = parkingLot39.getParkingSpaces();
        parkingLot39.setLotID((int) (byte) -1);
        managerServices0.addParkingLot(parkingLot39);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList44 = managerServices0.getAllParkingLots();
        repo.ParkingRepository parkingRepository45 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot48 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean49 = parkingLot48.getStatus();
        model.parking.ParkingLot parkingLot52 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean53 = parkingLot52.getStatus();
        boolean boolean54 = parkingLot52.getStatus();
        model.parking.ParkingLot parkingLot57 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean58 = parkingLot57.getStatus();
        boolean boolean59 = parkingLot57.getStatus();
        model.parking.ParkingLot parkingLot62 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean63 = parkingLot62.getStatus();
        boolean boolean64 = parkingLot62.getStatus();
        parkingLot62.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray67 = new model.parking.ParkingLot[] { parkingLot48, parkingLot52, parkingLot57, parkingLot62 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList68 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList68, parkingLotArray67);
        parkingRepository45.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList68);
        repo.ParkingRepository parkingRepository71 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot74 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean75 = parkingLot74.getStatus();
        model.parking.ParkingLot parkingLot78 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean79 = parkingLot78.getStatus();
        boolean boolean80 = parkingLot78.getStatus();
        model.parking.ParkingLot parkingLot83 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean84 = parkingLot83.getStatus();
        boolean boolean85 = parkingLot83.getStatus();
        model.parking.ParkingLot parkingLot88 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean89 = parkingLot88.getStatus();
        boolean boolean90 = parkingLot88.getStatus();
        parkingLot88.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray93 = new model.parking.ParkingLot[] { parkingLot74, parkingLot78, parkingLot83, parkingLot88 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList94 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList94, parkingLotArray93);
        parkingRepository71.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList94);
        parkingRepository45.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList94);
        services.ManagerServices.parkingLots = parkingLotList94;
        managerServices0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList94);
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertNotNull(parkingLotList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parkingLotArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(parkingSpaceList40);
        org.junit.Assert.assertNotNull(parkingLotList44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(parkingLotArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(parkingLotArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        repo.ParkingRepository parkingRepository1 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList2 = parkingRepository1.getAllParkingLots();
        services.ManagerServices.parkingLots = parkingLotList2;
        services.ManagerServices.parkingLots = parkingLotList2;
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList2);
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        boolean boolean2 = parkingSpace1.getStatus();
        java.lang.String str3 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Parking Space 35 is already enabled." + "'", str3, "Parking Space 35 is already enabled.");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.getType();
        model.user.Manager manager11 = new model.user.Manager(credentials8);
        services.ClientServices clientServices12 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot14 = clientServices12.getParkingLotByAddress("");
        boolean boolean15 = manager11.equals((java.lang.Object) parkingLot14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = userService0.registerUser((model.user.User) manager11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.Credentials.equals(Object)\" because the return value of \"model.user.User.getCredentials()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(clientServices12);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        model.user.Client client3 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null", "FacultyMember", "Parking Space 100 is already disabled.");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        java.util.List<model.user.User> userList10 = userRepository9.getUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userRepository9);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str6, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        model.user.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = userService0.registerUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.User.getCredentials()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userRepository5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((-1), "Success: Parking Lot 97 has been disabled.");
        boolean boolean3 = parkingLot2.getStatus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        model.booking.Booking booking6 = parkingSpace1.getBooking();
        int int7 = booking6.getId();
        java.lang.Class<?> wildcardClass8 = booking6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(booking6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        visitor6.validateAccount();
        java.lang.Class<?> wildcardClass8 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getSpaceId();
        int int3 = booking0.getEndTime();
        int int4 = booking0.getTotalHours();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str13 = facultyMember10.getFacultyId();
        java.lang.String str14 = facultyMember10.getFacultyName();
        facultyMember10.setFacultyName("Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student" + "'", str13, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        model.user.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = userService0.registerUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.User.getCredentials()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        double double3 = booking0.getCost();
        int int4 = booking0.getSpaceId();
        int int5 = booking0.getStartTime();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 1.0f);
        double double4 = facultyParkingRate0.calculateRate(15.0d);
        double double6 = facultyParkingRate0.calculateRate(8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 120.0d + "'", double4 == 120.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 64.0d + "'", double6 == 64.0d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Student student12 = new model.user.Student(credentials7, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student14 = new model.user.Student(credentials7, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        int int16 = booking5.getLotId();
        java.util.Date date17 = booking5.getStartDateTime();
        int int18 = booking5.getTotalHours();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        java.lang.String str12 = booking3.getLicensePlate();
        booking3.setCost(800.0d);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        boolean boolean2 = parkingSpace1.hasBooking();
        parkingSpace1.setStatus(false);
        model.booking.Booking booking5 = parkingSpace1.getBooking();
        java.lang.String str6 = parkingSpace1.disableParkingSpace();
        model.booking.Booking booking7 = parkingSpace1.getBooking();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Space 32 is already disabled." + "'", str6, "Parking Space 32 is already disabled.");
        org.junit.Assert.assertNull(booking7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot3 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean4 = parkingLot3.getStatus();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean8 = parkingLot7.getStatus();
        boolean boolean9 = parkingLot7.getStatus();
        model.parking.ParkingLot parkingLot12 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean13 = parkingLot12.getStatus();
        boolean boolean14 = parkingLot12.getStatus();
        model.parking.ParkingLot parkingLot17 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean18 = parkingLot17.getStatus();
        boolean boolean19 = parkingLot17.getStatus();
        parkingLot17.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray22 = new model.parking.ParkingLot[] { parkingLot3, parkingLot7, parkingLot12, parkingLot17 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList23 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList23, parkingLotArray22);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList23);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList26 = parkingRepository0.getAllParkingLots();
        services.ManagerServices.parkingLots = parkingLotList26;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingLotArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parkingLotList26);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (byte) 1);
        model.parking.ParkingLot parkingLot9 = clientServices0.getParkingLotByAddress("Success: Parking Lot 100 has been disabled.");
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "There is no Such Parking Lot" + "'", str7, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(parkingLot9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 100 is already disabled.", "success", "Wm(OGK*DZ");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        java.util.List<model.user.User> userList10 = userRepository0.getUsers();
        java.util.List<model.user.User> userList11 = userRepository0.getUsers();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        parkingSpace1.setBooking(booking2);
        booking2.setId((int) (byte) 10);
        booking2.setStartTime(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        booking3.setEndTime(0);
        int int14 = booking3.getEndTime();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        java.util.List<model.user.User> userList1 = userRepository0.getUsers();
        java.util.List<model.user.User> userList2 = userRepository0.getUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        java.util.List<model.user.User> userList2 = userRepository1.getUsers();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.getType();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials6, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        facultyMember11.setFacultyId("NonFacultyStaff");
        userRepository1.addUser((model.user.User) facultyMember11);
        model.user.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.updateUser(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.User.getCredentials()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Credentials credentials11 = student10.getCredentials();
        model.user.Student student13 = new model.user.Student(credentials11, "Parking Space 35 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(credentials11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "Parking Lot 100 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot10 = clientServices0.getParkingLotByAddress("Parking Lot 97 is already enabled.");
        java.lang.String str13 = clientServices0.enableParkingSpaceById(100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "There is no Such Parking Lot" + "'", str7, "There is no Such Parking Lot");
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(parkingLot10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Space 1 is already enabled." + "'", str13, "Parking Space 1 is already enabled.");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((-1), "Success: Parking Lot 97 has been disabled.");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        boolean boolean4 = parkingLot2.getStatus();
        int int5 = parkingLot2.getLotID();
        java.lang.String str6 = parkingLot2.getLocation();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList7 = parkingLot2.getParkingSpaces();
        java.lang.String str8 = parkingLot2.disableParkingLot();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Success: Parking Lot 97 has been disabled." + "'", str6, "Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot -1 has been disabled." + "'", str8, "Success: Parking Lot -1 has been disabled.");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        model.user.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = superManagerServices0.createAccount(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.User.getCredentials()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean3 = parkingLot2.getStatus();
        boolean boolean4 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 100);
        int int7 = parkingLot2.getLotID();
        boolean boolean8 = parkingLot2.getStatus();
        java.lang.String str9 = parkingLot2.enableParkingLot();
        java.lang.String str10 = parkingLot2.enableParkingLot();
        parkingLot2.setLotID((int) (byte) -1);
        java.lang.String str13 = parkingLot2.getLocation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Lot 100 is already enabled." + "'", str9, "Parking Lot 100 is already enabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Lot 100 is already enabled." + "'", str10, "Parking Lot 100 is already enabled.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NonFacultyStaff" + "'", str13, "NonFacultyStaff");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        booking0.setEndTime((int) (byte) 100);
        double double5 = booking0.getCost();
        java.util.Date date6 = booking0.getDate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        java.lang.String str13 = booking0.getStatus();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Visitor visitor4 = new model.user.Visitor(credentials3);
        visitor4.validateAccount();
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        parkingSpace1.setBooking(booking2);
        int int7 = parkingSpace1.getSpaceID();
        model.booking.Booking booking8 = parkingSpace1.getBooking();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(booking8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        model.booking.Booking booking4 = parkingSpace1.getBooking();
        model.booking.Booking booking5 = parkingSpace1.getBooking();
        parkingSpace1.setStatus(true);
        model.booking.Booking booking8 = parkingSpace1.getBooking();
        org.junit.Assert.assertNull(booking4);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllBookings();
        java.lang.Class<?> wildcardClass6 = clientServices0.getClass();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        model.parking.ParkingLot parkingLot4 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str5 = parkingLot4.enableParkingLot();
        java.lang.String str6 = parkingLot4.enableParkingLot();
        managerServices0.addParkingLot(parkingLot4);
        java.lang.String str8 = parkingLot4.getLocation();
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 97 is already enabled." + "'", str5, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Lot 97 is already enabled." + "'", str6, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "NonFacultyStaff" + "'", str8, "NonFacultyStaff");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean3 = parkingLot2.getStatus();
        java.lang.String str4 = parkingLot2.getLocation();
        java.lang.Class<?> wildcardClass5 = parkingLot2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NonFacultyStaff" + "'", str4, "NonFacultyStaff");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 97 is already disabled.");
        student8.setStudentId("Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str7 = credentials3.getLogin();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "", "Parking Space 97 is already disabled.");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        java.util.List<model.user.User> userList14 = userRepository3.getUsers();
        java.util.List<model.user.User> userList15 = userRepository3.getUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(credentials11);
        org.junit.Assert.assertNotNull(credentials12);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Success: Parking Space 1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        model.user.Client client3 = new model.user.Client("Success: Parking Space -1 has been disabled.", "Success: Parking Space -1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        java.util.ArrayList<model.booking.Booking> bookingList63 = bookingRepository7.getAllBookings();
        java.lang.Class<?> wildcardClass64 = bookingList63.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(bookingArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(clientServices56);
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(bookingList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(bookingList63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        boolean boolean10 = user9.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        boolean boolean10 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str11 = superManagerServices0.generateStrongPassword();
        boolean boolean13 = superManagerServices0.isStrongPassword("FacultyMember");
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "X?EhgrKDV" + "'", str11, "X?EhgrKDV");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = student9.getStudentId();
        student9.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        boolean boolean13 = student9.getValidationStatus();
        java.lang.String str14 = student9.getStudentId();
        student9.setStudentId("Parking Space 1 is already disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null" + "'", str14, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot10 = clientServices0.getParkingLotByAddress("Parking Lot 97 is already enabled.");
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        booking11.setEndTime((int) (short) 10);
        java.lang.String str15 = booking11.getEmail();
        booking11.setCost((double) (byte) 0);
        int int18 = booking11.getLotId();
        booking11.setEmail("Manager");
        java.lang.String str21 = booking11.getLicensePlate();
        java.lang.String str22 = booking11.toString();
        java.util.Date date23 = booking11.getEndDateTime();
        boolean boolean24 = clientServices0.updateCompleteBooking(booking11);
        java.util.Date date25 = booking11.getStartDateTime();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "There is no Such Parking Lot" + "'", str7, "There is no Such Parking Lot");
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(parkingLot10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager" + "'", str22, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(date25);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.getType();
        model.user.Manager manager9 = new model.user.Manager(credentials6);
        userRepository2.removeUser((model.user.User) manager9);
        org.junit.Assert.assertNotNull(userRepository1);
        org.junit.Assert.assertNotNull(userRepository2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot10 = clientServices0.getParkingLotByAddress("Parking Lot 97 is already enabled.");
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        booking11.setEndTime((int) (short) 10);
        java.lang.String str15 = booking11.getEmail();
        booking11.setCost((double) (byte) 0);
        int int18 = booking11.getLotId();
        booking11.setEmail("Manager");
        java.lang.String str21 = booking11.getLicensePlate();
        java.lang.String str22 = booking11.toString();
        java.util.Date date23 = booking11.getEndDateTime();
        boolean boolean24 = clientServices0.updateCompleteBooking(booking11);
        java.util.List<java.lang.String> strList25 = clientServices0.getAllLocations();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "There is no Such Parking Lot" + "'", str7, "There is no Such Parking Lot");
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(parkingLot10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager" + "'", str22, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        booking0.setEndTime((int) 'a');
        booking0.setEndTime((-1));
        java.lang.Class<?> wildcardClass7 = booking0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        model.user.Client client3 = new model.user.Client("Parking Space -1 is already enabled.", "Manager", "Parking Space 100 is already enabled.");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "There is no Such Parking Lot" + "'", str5, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "There is no Such Parking Lot" + "'", str27, "There is no Such Parking Lot");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        java.lang.String str15 = nonFacultyStaff14.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str15, "Success: Parking Space 100 has been disabled.");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        model.user.Client client3 = new model.user.Client("Parking Lot 97 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 1, "Visitor");
        java.lang.String str3 = parkingLot2.enableParkingLot();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Parking Lot 1 is already enabled." + "'", str3, "Parking Lot 1 is already enabled.");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean3 = parkingLot2.getStatus();
        boolean boolean4 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 100);
        int int7 = parkingLot2.getLotID();
        boolean boolean8 = parkingLot2.getStatus();
        boolean boolean9 = parkingLot2.getStatus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.lang.String str10 = booking0.getLicensePlate();
        java.lang.String str11 = booking0.toString();
        booking0.setLicensePlate("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager" + "'", str11, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateStrongPassword();
        boolean boolean4 = superManagerServices0.isValidEmail("Success: Parking Lot 97 has been disabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Parking Space 1 is already enabled.");
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9z6wsHuxQ" + "'", str2, "9z6wsHuxQ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        model.user.User user3 = new model.user.User("", "Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        java.util.List<java.lang.String> strList9 = clientServices0.getAllLocations();
        java.lang.String str12 = clientServices0.enableParkingSpaceById((int) ' ', 100);
        model.booking.Booking booking13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = clientServices0.bookParkingSpace(booking13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.booking.Booking.getLotId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "There is no Such Parking Lot" + "'", str7, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "There is no Such Parking Lot" + "'", str12, "There is no Such Parking Lot");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean6 = userService0.isValidEmail("Parking Space 100 is already disabled.");
        java.lang.Class<?> wildcardClass7 = userService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        java.util.List<model.user.User> userList2 = userRepository1.getUsers();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials6, "hi!");
        nonFacultyStaff9.validateAccount();
        java.lang.String str11 = nonFacultyStaff9.getRole();
        userRepository1.addUser((model.user.User) nonFacultyStaff9);
        org.junit.Assert.assertNotNull(userService0);
        org.junit.Assert.assertNotNull(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        model.parking.ParkingLot parkingLot4 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str5 = parkingLot4.enableParkingLot();
        java.lang.String str6 = parkingLot4.enableParkingLot();
        managerServices0.addParkingLot(parkingLot4);
        boolean boolean8 = parkingLot4.getStatus();
        java.lang.String str9 = parkingLot4.getLocation();
        java.lang.String str10 = parkingLot4.enableParkingLot();
        java.lang.String str11 = parkingLot4.enableParkingLot();
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 97 is already enabled." + "'", str5, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Lot 97 is already enabled." + "'", str6, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NonFacultyStaff" + "'", str9, "NonFacultyStaff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Lot 97 is already enabled." + "'", str10, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Lot 97 is already enabled." + "'", str11, "Parking Lot 97 is already enabled.");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Wm(OGK*DZ");
        java.lang.String str10 = credentials3.toString();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str10, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.Class<?> wildcardClass8 = credentials3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.toString();
        model.user.Manager manager9 = new model.user.Manager(credentials3);
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str6, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str8, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        java.lang.String str9 = facultyMember8.getFacultyId();
        facultyMember8.setFacultyId("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Space 97 has been disabled." + "'", str9, "Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Student student4 = new model.user.Student(credentials3);
        model.user.Student student5 = new model.user.Student(credentials3);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "users.json");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Success: Parking Space 97 has been enabled.");
        facultyMember9.setFacultyId("success");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "SuperManager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials10 = student9.getCredentials();
        java.lang.String str11 = credentials10.getLogin();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(credentials10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.String str10 = credentials7.getLogin();
        services.ClientServices clientServices11 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot13 = clientServices11.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList14 = clientServices11.getAllBookings();
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        booking15.setEndTime((int) (short) 10);
        java.lang.String str19 = booking15.getEmail();
        java.util.Date date20 = booking15.getStartDateTime();
        boolean boolean21 = clientServices11.bookParkingSpace(booking15);
        java.util.Date date22 = booking15.getEndDateTime();
        boolean boolean23 = credentials7.equals((java.lang.Object) booking15);
        java.util.Date date24 = booking15.getDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(clientServices11);
        org.junit.Assert.assertNull(parkingLot13);
        org.junit.Assert.assertNotNull(bookingList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials14, "X?EhgrKDV", "]82UgsU=G");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(credentials14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.getType();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space -1 is already enabled.", "Parking Lot 100 is already enabled.");
        java.lang.String str11 = facultyMember10.getFacultyName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Space -1 is already enabled." + "'", str11, "Parking Space -1 is already enabled.");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        int int11 = booking4.getEndTime();
        java.util.Date date12 = booking4.getStartDateTime();
        java.lang.String str13 = booking4.getStatus();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.util.Date date5 = booking0.getStartDateTime();
        booking0.setId((int) (byte) 100);
        booking0.setCost((double) (byte) -1);
        int int10 = booking0.getTotalHours();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials9);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        strategy.VisitorParkingRate visitorParkingRate0 = new strategy.VisitorParkingRate();
        double double2 = visitorParkingRate0.calculateRate((double) (-1L));
        double double4 = visitorParkingRate0.calculateRate((double) ' ');
        double double6 = visitorParkingRate0.calculateRate((double) (byte) 100);
        double double8 = visitorParkingRate0.calculateRate((double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-15.0d) + "'", double2 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 480.0d + "'", double4 == 480.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1500.0d + "'", double6 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 150.0d + "'", double8 == 150.0d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = nonFacultyStaff6.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        booking0.setStartTime((int) (short) 10);
        java.util.Date date12 = booking0.getDate();
        booking0.setId(10);
        int int15 = booking0.getEndTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        boolean boolean4 = parkingSpace1.getStatus();
        java.lang.String str5 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 100 is already enabled." + "'", str5, "Parking Space 100 is already enabled.");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        java.lang.String str14 = booking0.getEmail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        model.user.Credentials credentials16 = null;
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials16, "");
        // The following exception was thrown during execution in test generation
        try {
            userRepository5.updateUser((model.user.User) nonFacultyStaff18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.Credentials.getLogin()\" because the return value of \"model.user.User.getCredentials()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(bookingRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(parkingRepository4);
        org.junit.Assert.assertNotNull(userRepository5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        model.user.User user3 = new model.user.User("Success: Parking Space 35 has been disabled.", "l@=7Kn[?f", "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "Success: Parking Lot 97 has been disabled.");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials10 = student9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(credentials10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        model.user.Client client3 = new model.user.Client("Give Id for parking Space is wrong", "b0K0Td]sJ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("9z6wsHuxQ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        java.lang.Class<?> wildcardClass11 = manager10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str6, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean9 = superManagerServices0.isValidEmail("SuperManager");
        java.lang.String str10 = superManagerServices0.generateStrongPassword();
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "wMB&=eDYD" + "'", str10, "wMB&=eDYD");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        model.user.User user3 = new model.user.User("Wm(OGK*DZ", "Parking Space 100 is already disabled.", "Parking Space 1 is already enabled.");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        booking0.setCost((double) 100.0f);
        java.lang.String str9 = booking0.getLicensePlate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        model.user.Client client3 = new model.user.Client("Success: Parking Space -1 has been disabled.", "Manager", "FacultyMember");
        client3.validateAccount();
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        int int14 = booking0.getEndTime();
        int int15 = booking0.getSpaceId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        java.util.Date date27 = booking13.getEndDateTime();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "There is no Such Parking Lot" + "'", str7, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null" + "'", str24, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = student9.getStudentId();
        student9.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        services.ClientServices clientServices13 = services.ClientServices.getInstance();
        model.booking.Booking booking15 = clientServices13.getBookingById((int) (short) 1);
        boolean boolean16 = student9.equals((java.lang.Object) clientServices13);
        model.booking.Booking booking17 = new model.booking.Booking();
        int int18 = booking17.getStartTime();
        booking17.setEndTime((int) (short) 10);
        java.lang.String str21 = booking17.getEmail();
        booking17.setCost((double) (byte) 0);
        int int24 = booking17.getLotId();
        booking17.setEmail("Manager");
        java.lang.String str27 = booking17.getLicensePlate();
        booking17.setLicensePlate("(O3fsOXXJ");
        java.lang.String str30 = booking17.toString();
        java.util.Date date31 = booking17.getEndDateTime();
        booking17.setEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.util.Date date34 = booking17.getDate();
        boolean boolean35 = clientServices13.bookParkingSpace(booking17);
        int int36 = booking17.getTotalHours();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(clientServices13);
        org.junit.Assert.assertNull(booking15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager" + "'", str30, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        boolean boolean10 = manager9.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot3 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean4 = parkingLot3.getStatus();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean8 = parkingLot7.getStatus();
        boolean boolean9 = parkingLot7.getStatus();
        model.parking.ParkingLot parkingLot12 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean13 = parkingLot12.getStatus();
        boolean boolean14 = parkingLot12.getStatus();
        model.parking.ParkingLot parkingLot17 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean18 = parkingLot17.getStatus();
        boolean boolean19 = parkingLot17.getStatus();
        parkingLot17.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray22 = new model.parking.ParkingLot[] { parkingLot3, parkingLot7, parkingLot12, parkingLot17 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList23 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList23, parkingLotArray22);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList23);
        repo.ParkingRepository parkingRepository26 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot29 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean30 = parkingLot29.getStatus();
        model.parking.ParkingLot parkingLot33 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean34 = parkingLot33.getStatus();
        boolean boolean35 = parkingLot33.getStatus();
        model.parking.ParkingLot parkingLot38 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean39 = parkingLot38.getStatus();
        boolean boolean40 = parkingLot38.getStatus();
        model.parking.ParkingLot parkingLot43 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean44 = parkingLot43.getStatus();
        boolean boolean45 = parkingLot43.getStatus();
        parkingLot43.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray48 = new model.parking.ParkingLot[] { parkingLot29, parkingLot33, parkingLot38, parkingLot43 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList49 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList49, parkingLotArray48);
        parkingRepository26.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList49);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList49);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList53 = parkingRepository0.getAllParkingLots();
        services.ManagerServices.parkingLots = parkingLotList53;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingLotArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(parkingLotArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(parkingLotList53);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        model.user.Client client3 = new model.user.Client("", "Parking Space -1 is already enabled.", "]cT(-?mBj");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        student6.setStudentId("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        student6.setStudentId("NonFacultyStaff");
        student6.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = userService0.registerUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.User.getCredentials()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userRepository5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) 10);
        boolean boolean2 = parkingSpace1.getStatus();
        model.sensor.Sensor sensor3 = parkingSpace1.getSensor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(sensor3);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        model.user.Client client3 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null", "Parking Space 32 is already disabled.");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Client client11 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isValidEmail("X5G?ZJ!c@");
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        student9.validateAccount();
        student9.setStudentId("users.json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.Student student12 = new model.user.Student(credentials3, "Parking Space 35 is already disabled.");
        java.lang.String str13 = student12.getStudentId();
        java.lang.String str14 = student12.getStudentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str6, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Space 35 is already disabled." + "'", str13, "Parking Space 35 is already disabled.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Space 35 is already disabled." + "'", str14, "Parking Space 35 is already disabled.");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Student");
        model.user.Client client10 = new model.user.Client(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("success");
        boolean boolean5 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        java.lang.String str6 = superManagerServices0.generateStrongPassword();
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=K*eY67RK" + "'", str6, "=K*eY67RK");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setEmail("(O3fsOXXJ");
        booking0.setEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        int int14 = booking0.getEndTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        parkingSpace1.setStatus(false);
        boolean boolean6 = parkingSpace1.getStatus();
        int int7 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        model.booking.Booking booking4 = parkingSpace1.getBooking();
        model.booking.Booking booking5 = parkingSpace1.getBooking();
        parkingSpace1.setStatus(true);
        boolean boolean8 = parkingSpace1.hasBooking();
        model.sensor.Sensor sensor9 = parkingSpace1.getSensor();
        org.junit.Assert.assertNull(booking4);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sensor9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        parkingSpace1.setStatus(true);
        model.sensor.Sensor sensor6 = parkingSpace1.getSensor();
        boolean boolean7 = parkingSpace1.hasBooking();
        parkingSpace1.setStatus(true);
        org.junit.Assert.assertNotNull(sensor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Visitor visitor4 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor5 = new model.user.Visitor(credentials3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList2 = managerServices0.getAllParkingLots();
        managerServices0.loadLots();
        repo.ParkingRepository parkingRepository4 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean8 = parkingLot7.getStatus();
        model.parking.ParkingLot parkingLot11 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean12 = parkingLot11.getStatus();
        boolean boolean13 = parkingLot11.getStatus();
        model.parking.ParkingLot parkingLot16 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean17 = parkingLot16.getStatus();
        boolean boolean18 = parkingLot16.getStatus();
        model.parking.ParkingLot parkingLot21 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean22 = parkingLot21.getStatus();
        boolean boolean23 = parkingLot21.getStatus();
        parkingLot21.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray26 = new model.parking.ParkingLot[] { parkingLot7, parkingLot11, parkingLot16, parkingLot21 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList27 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList27, parkingLotArray26);
        parkingRepository4.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList27);
        managerServices0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList27);
        model.parking.ParkingLot parkingLot33 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList34 = parkingLot33.getParkingSpaces();
        int int35 = parkingLot33.getLotID();
        managerServices0.addParkingLot(parkingLot33);
        model.parking.ParkingLot parkingLot39 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList40 = parkingLot39.getParkingSpaces();
        parkingLot39.setLotID((int) (byte) -1);
        managerServices0.addParkingLot(parkingLot39);
        model.parking.ParkingLot parkingLot46 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean47 = parkingLot46.getStatus();
        boolean boolean48 = parkingLot46.getStatus();
        parkingLot46.setLotID((int) (byte) 100);
        int int51 = parkingLot46.getLotID();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList52 = parkingLot46.getParkingSpaces();
        managerServices0.addParkingLot(parkingLot46);
        model.parking.ParkingLot parkingLot56 = new model.parking.ParkingLot((-1), "Success: Parking Lot 97 has been disabled.");
        managerServices0.addParkingLot(parkingLot56);
        java.lang.String str58 = parkingLot56.enableParkingLot();
        java.lang.String str59 = parkingLot56.disableParkingLot();
        java.lang.String str60 = parkingLot56.enableParkingLot();
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertNotNull(parkingLotList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parkingLotArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(parkingSpaceList40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(parkingSpaceList52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Parking Lot -1 is already enabled." + "'", str58, "Parking Lot -1 is already enabled.");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Success: Parking Lot -1 has been disabled." + "'", str59, "Success: Parking Lot -1 has been disabled.");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Success: Parking Lot -1 has been enabled." + "'", str60, "Success: Parking Lot -1 has been enabled.");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository5 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(bookingRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(userRepository4);
        org.junit.Assert.assertNotNull(bookingRepository5);
        org.junit.Assert.assertNotNull(bookingRepository6);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.lang.String str10 = booking0.getLicensePlate();
        java.lang.String str11 = booking0.toString();
        int int12 = booking0.getLotId();
        java.lang.String str13 = booking0.getStatus();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager" + "'", str11, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Give Id for parking Space is wrong");
        boolean boolean8 = superManagerServices0.isStrongPassword("hi!");
        boolean boolean10 = superManagerServices0.isValidEmail("Parking Lot 1 is already enabled.");
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        boolean boolean14 = userService0.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setStatus(true);
        java.lang.String str4 = parkingSpace1.enableParkingSpace();
        java.lang.Class<?> wildcardClass5 = parkingSpace1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Space 35 is already enabled." + "'", str4, "Parking Space 35 is already enabled.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember10.setFacultyName("Parking Space 35 is already disabled.");
        facultyMember10.setFacultyName("Parking Lot 1 is already enabled.");
        java.lang.String str17 = facultyMember10.getFacultyId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student" + "'", str17, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean3 = parkingLot2.getStatus();
        java.lang.String str4 = parkingLot2.getLocation();
        parkingLot2.setLotID((-1));
        java.lang.String str7 = parkingLot2.getLocation();
        int int8 = parkingLot2.getLotID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NonFacultyStaff" + "'", str4, "NonFacultyStaff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NonFacultyStaff" + "'", str7, "NonFacultyStaff");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("Student");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        model.user.Manager manager12 = new model.user.Manager(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllBookings();
        model.booking.Booking booking7 = clientServices0.getBookingById(32);
        model.parking.ParkingLot parkingLot9 = clientServices0.getParkingLotByAddress("");
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertNull(parkingLot9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        int int15 = booking0.getSpaceId();
        booking0.setEmail("Y@mMCI7!u");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        facultyMember8.setFacultyId("NonFacultyStaff");
        facultyMember8.setFacultyId("success");
        java.lang.String str13 = facultyMember8.getFacultyId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "success" + "'", str13, "success");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setStatus(true);
        parkingSpace1.setSpaceID((int) (short) -1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.lang.String str14 = clientServices0.getParkingSpaceById(0, (-1));
        model.booking.Booking booking16 = clientServices0.getBookingById((int) (byte) -1);
        model.booking.Booking booking18 = clientServices0.getBookingById((int) ' ');
        java.lang.String str21 = clientServices0.enableParkingSpaceById(100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 100 is already disabled." + "'", str9, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "There is no Such Parking Lot" + "'", str14, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(booking16);
        org.junit.Assert.assertNull(booking18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Space 1 is already enabled." + "'", str21, "Parking Space 1 is already enabled.");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.util.Date date17 = booking0.getDate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList1 = parkingRepository0.getAllParkingLots();
        model.parking.ParkingLot parkingLot4 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str5 = parkingLot4.enableParkingLot();
        java.lang.String str6 = parkingLot4.enableParkingLot();
        model.parking.ParkingLot parkingLot9 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean10 = parkingLot9.getStatus();
        boolean boolean11 = parkingLot9.getStatus();
        parkingLot9.setLotID((int) (byte) 100);
        model.parking.ParkingLot parkingLot16 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean17 = parkingLot16.getStatus();
        java.lang.String str18 = parkingLot16.getLocation();
        model.parking.ParkingLot parkingLot21 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean22 = parkingLot21.getStatus();
        boolean boolean23 = parkingLot21.getStatus();
        parkingLot21.setLotID((int) (byte) 100);
        int int26 = parkingLot21.getLotID();
        boolean boolean27 = parkingLot21.getStatus();
        model.parking.ParkingLot parkingLot30 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList31 = parkingLot30.getParkingSpaces();
        int int32 = parkingLot30.getLotID();
        model.parking.ParkingLot parkingLot35 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean36 = parkingLot35.getStatus();
        boolean boolean37 = parkingLot35.getStatus();
        parkingLot35.setLotID((int) (byte) 100);
        int int40 = parkingLot35.getLotID();
        model.parking.ParkingLot[] parkingLotArray41 = new model.parking.ParkingLot[] { parkingLot4, parkingLot9, parkingLot16, parkingLot21, parkingLot30, parkingLot35 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList42 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList42, parkingLotArray41);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList42);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList45 = parkingRepository0.getAllParkingLots();
        repo.ParkingRepository parkingRepository46 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList47 = parkingRepository46.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList48 = parkingRepository46.getAllParkingLots();
        repo.RepositoryProvider repositoryProvider49 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository50 = repositoryProvider49.getBookingRepository();
        repo.BookingRepository bookingRepository51 = repositoryProvider49.getBookingRepository();
        repo.BookingRepository bookingRepository52 = repositoryProvider49.getBookingRepository();
        repo.ParkingRepository parkingRepository53 = repositoryProvider49.getParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList54 = parkingRepository53.getAllParkingLots();
        repo.ParkingRepository parkingRepository55 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot58 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean59 = parkingLot58.getStatus();
        model.parking.ParkingLot parkingLot62 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean63 = parkingLot62.getStatus();
        boolean boolean64 = parkingLot62.getStatus();
        model.parking.ParkingLot parkingLot67 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean68 = parkingLot67.getStatus();
        boolean boolean69 = parkingLot67.getStatus();
        model.parking.ParkingLot parkingLot72 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean73 = parkingLot72.getStatus();
        boolean boolean74 = parkingLot72.getStatus();
        parkingLot72.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray77 = new model.parking.ParkingLot[] { parkingLot58, parkingLot62, parkingLot67, parkingLot72 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList78 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList78, parkingLotArray77);
        parkingRepository55.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList78);
        services.ManagerServices.parkingLots = parkingLotList78;
        parkingRepository53.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList78);
        services.ManagerServices.parkingLots = parkingLotList78;
        parkingRepository46.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList78);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList78);
        org.junit.Assert.assertNotNull(parkingLotList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 97 is already enabled." + "'", str5, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Lot 97 is already enabled." + "'", str6, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NonFacultyStaff" + "'", str18, "NonFacultyStaff");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(parkingLotArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(parkingLotList45);
        org.junit.Assert.assertNotNull(parkingLotList47);
        org.junit.Assert.assertNotNull(parkingLotList48);
        org.junit.Assert.assertNotNull(bookingRepository50);
        org.junit.Assert.assertNotNull(bookingRepository51);
        org.junit.Assert.assertNotNull(bookingRepository52);
        org.junit.Assert.assertNotNull(parkingRepository53);
        org.junit.Assert.assertNotNull(parkingLotList54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(parkingLotArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        java.lang.String str10 = facultyMember5.getFacultyName();
        java.lang.String str11 = facultyMember5.getFacultyId();
        facultyMember5.setFacultyName("Student");
        model.parking.ParkingSpace parkingSpace15 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking16 = new model.booking.Booking();
        int int17 = booking16.getStartTime();
        booking16.setEndTime((int) (short) 10);
        java.lang.String str20 = booking16.getEmail();
        booking16.setCost((double) (byte) 0);
        parkingSpace15.setBooking(booking16);
        model.sensor.Sensor sensor24 = parkingSpace15.getSensor();
        boolean boolean25 = parkingSpace15.getStatus();
        boolean boolean26 = facultyMember5.equals((java.lang.Object) boolean25);
        facultyMember5.validateAccount();
        facultyMember5.setFacultyId("X5G?ZJ!c@");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Lot 97 is already enabled." + "'", str10, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(sensor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) (byte) 100, (int) (short) 10);
        java.util.List<java.lang.String> strList4 = clientServices0.getAllLocations();
        model.booking.Booking booking6 = clientServices0.getBookingById((int) ' ');
        java.lang.String str9 = clientServices0.getParkingSpaceById(100, (int) (byte) 10);
        java.util.List<model.booking.Booking> bookingList10 = clientServices0.getAllBookings();
        java.lang.String str13 = clientServices0.getParkingSpaceById((int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "success" + "'", str9, "success");
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "There is no Such Parking Lot" + "'", str13, "There is no Such Parking Lot");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        boolean boolean6 = facultyMember5.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        repo.ParkingRepository parkingRepository20 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList21 = parkingRepository20.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList22 = parkingRepository20.getAllParkingLots();
        boolean boolean23 = student18.equals((java.lang.Object) parkingLotList22);
        student18.setStudentId("Parking Space 100 is already disabled.");
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(userRepository2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str14, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(parkingLotList21);
        org.junit.Assert.assertNotNull(parkingLotList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        model.booking.Booking booking4 = parkingSpace1.getBooking();
        model.booking.Booking booking5 = new model.booking.Booking();
        int int6 = booking5.getStartTime();
        booking5.setEndTime((int) (short) 10);
        java.lang.String str9 = booking5.getEmail();
        booking5.setCost((double) (byte) 0);
        int int12 = booking5.getLotId();
        booking5.setId((int) '#');
        java.lang.String str15 = booking5.toString();
        parkingSpace1.setBooking(booking5);
        java.lang.String str17 = booking5.toString();
        org.junit.Assert.assertNull(booking4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str15, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str17, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        int int4 = parkingLot2.getLotID();
        java.lang.String str5 = parkingLot2.disableParkingLot();
        parkingLot2.setLotID(0);
        parkingLot2.setLocation("Av+-nN6Nu");
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Lot 97 has been disabled." + "'", str5, "Success: Parking Lot 97 has been disabled.");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository6 = userService0.userRepository;
        java.util.List<model.user.User> userList7 = userRepository6.getUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userRepository6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        parkingSpace1.setStatus(false);
        model.booking.Booking booking6 = parkingSpace1.getBooking();
        parkingSpace1.setSpaceID((int) '4');
        model.parking.ParkingSpace parkingSpace10 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        int int13 = booking11.getId();
        parkingSpace10.setBooking(booking11);
        parkingSpace1.setBooking(booking11);
        int int16 = booking11.getStartTime();
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "");
        java.lang.Class<?> wildcardClass12 = nonFacultyStaff11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str9, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getSpaceId();
        int int3 = booking0.getEndTime();
        double double4 = booking0.getCost();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate(1000.0d);
        double double4 = facultyParkingRate0.calculateRate((double) 'a');
        double double6 = facultyParkingRate0.calculateRate(1.0d);
        double double8 = facultyParkingRate0.calculateRate((double) '#');
        double double10 = facultyParkingRate0.calculateRate((double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8000.0d + "'", double2 == 8000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 776.0d + "'", double4 == 776.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 280.0d + "'", double8 == 280.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 776.0d + "'", double10 == 776.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        model.user.User user3 = new model.user.User("users.json", "T#NJctMi&", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        model.user.Client client3 = new model.user.Client("Y@mMCI7!u", "Success: Parking Lot -1 has been enabled.", "Success: Parking Space 100 has been enabled.");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        int int3 = booking0.getTotalHours();
        java.lang.String str4 = booking0.getEmail();
        int int5 = booking0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        model.parking.ParkingLot parkingLot3 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str4 = parkingLot3.enableParkingLot();
        managerServices0.addParkingLot(parkingLot3);
        model.parking.ParkingLot parkingLot8 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean9 = parkingLot8.getStatus();
        java.lang.String str10 = parkingLot8.getLocation();
        parkingLot8.setLotID((-1));
        managerServices0.addParkingLot(parkingLot8);
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Lot 97 is already enabled." + "'", str4, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NonFacultyStaff" + "'", str10, "NonFacultyStaff");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot3 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean4 = parkingLot3.getStatus();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean8 = parkingLot7.getStatus();
        boolean boolean9 = parkingLot7.getStatus();
        model.parking.ParkingLot parkingLot12 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean13 = parkingLot12.getStatus();
        boolean boolean14 = parkingLot12.getStatus();
        model.parking.ParkingLot parkingLot17 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean18 = parkingLot17.getStatus();
        boolean boolean19 = parkingLot17.getStatus();
        parkingLot17.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray22 = new model.parking.ParkingLot[] { parkingLot3, parkingLot7, parkingLot12, parkingLot17 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList23 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList23, parkingLotArray22);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList23);
        repo.ParkingRepository parkingRepository26 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot29 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean30 = parkingLot29.getStatus();
        model.parking.ParkingLot parkingLot33 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean34 = parkingLot33.getStatus();
        boolean boolean35 = parkingLot33.getStatus();
        model.parking.ParkingLot parkingLot38 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean39 = parkingLot38.getStatus();
        boolean boolean40 = parkingLot38.getStatus();
        model.parking.ParkingLot parkingLot43 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean44 = parkingLot43.getStatus();
        boolean boolean45 = parkingLot43.getStatus();
        parkingLot43.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray48 = new model.parking.ParkingLot[] { parkingLot29, parkingLot33, parkingLot38, parkingLot43 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList49 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList49, parkingLotArray48);
        parkingRepository26.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList49);
        repo.ParkingRepository parkingRepository52 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot55 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean56 = parkingLot55.getStatus();
        model.parking.ParkingLot parkingLot59 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean60 = parkingLot59.getStatus();
        boolean boolean61 = parkingLot59.getStatus();
        model.parking.ParkingLot parkingLot64 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean65 = parkingLot64.getStatus();
        boolean boolean66 = parkingLot64.getStatus();
        model.parking.ParkingLot parkingLot69 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean70 = parkingLot69.getStatus();
        boolean boolean71 = parkingLot69.getStatus();
        parkingLot69.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray74 = new model.parking.ParkingLot[] { parkingLot55, parkingLot59, parkingLot64, parkingLot69 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList75 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList75, parkingLotArray74);
        parkingRepository52.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList75);
        parkingRepository26.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList75);
        services.ManagerServices.parkingLots = parkingLotList75;
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList75);
        services.ManagerServices.parkingLots = parkingLotList75;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingLotArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(parkingLotArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(parkingLotArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.Student student5 = new model.user.Student(credentials3, "Success: Parking Space 97 has been enabled.");
        student5.setStudentId("Manager");
        student5.validateAccount();
        student5.setStudentId("Parking Space -1 is already enabled.");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str7 = credentials3.getLogin();
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        java.lang.String str9 = credentials3.getLogin();
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.User user4 = null;
        userRepository3.removeUser(user4);
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.User user12 = new model.user.User(credentials9);
        model.user.Credentials credentials13 = user12.getCredentials();
        java.lang.String str14 = credentials13.getPassword();
        model.user.Student student15 = new model.user.Student(credentials13);
        java.lang.String str16 = student15.getStudentId();
        java.lang.String str17 = student15.getStudentId();
        student15.setStudentId("(O3fsOXXJ");
        student15.validateAccount();
        userRepository3.addUser((model.user.User) student15);
        model.user.Credentials credentials25 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str26 = credentials25.getPassword();
        java.lang.String str27 = credentials25.getType();
        java.lang.String str28 = credentials25.toString();
        java.lang.String str29 = credentials25.getLogin();
        model.user.User user30 = model.user.UserFactory.createAccount(credentials25);
        java.lang.String str31 = credentials25.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff32 = new model.user.NonFacultyStaff(credentials25);
        // The following exception was thrown during execution in test generation
        try {
            userRepository3.updateUser((model.user.User) nonFacultyStaff32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.Credentials.getLogin()\" because the return value of \"model.user.User.getCredentials()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(credentials13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str28, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(user30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        booking0.setStatus("Student");
        java.util.Date date8 = booking0.getEndDateTime();
        booking0.setCost((double) 100);
        int int11 = booking0.getTotalHours();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember10.validateAccount();
        model.user.Credentials credentials14 = facultyMember10.getCredentials();
        model.user.Credentials credentials15 = facultyMember10.getCredentials();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(credentials14);
        org.junit.Assert.assertNotNull(credentials15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Credentials credentials9 = client8.getCredentials();
        model.user.User user10 = new model.user.User(credentials9);
        user10.validateAccount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        java.lang.Class<?> wildcardClass4 = credentials3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Give Id for parking Space is wrong");
        boolean boolean8 = superManagerServices0.isValidEmail("NonFacultyStaff");
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        boolean boolean14 = userService0.isStrongPassword("?qqRirU!a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        boolean boolean2 = parkingSpace1.hasBooking();
        parkingSpace1.setStatus(false);
        model.booking.Booking booking5 = parkingSpace1.getBooking();
        int int6 = parkingSpace1.getSpaceID();
        boolean boolean7 = parkingSpace1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(credentials8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        booking0.setStatus("Student");
        java.util.Date date8 = booking0.getEndDateTime();
        booking0.setEndTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository6 = repositoryProvider0.getParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList7 = parkingRepository6.getAllParkingLots();
        repo.ParkingRepository parkingRepository8 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot11 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean12 = parkingLot11.getStatus();
        model.parking.ParkingLot parkingLot15 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean16 = parkingLot15.getStatus();
        boolean boolean17 = parkingLot15.getStatus();
        model.parking.ParkingLot parkingLot20 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean21 = parkingLot20.getStatus();
        boolean boolean22 = parkingLot20.getStatus();
        model.parking.ParkingLot parkingLot25 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean26 = parkingLot25.getStatus();
        boolean boolean27 = parkingLot25.getStatus();
        parkingLot25.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray30 = new model.parking.ParkingLot[] { parkingLot11, parkingLot15, parkingLot20, parkingLot25 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList31 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList31, parkingLotArray30);
        parkingRepository8.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList31);
        repo.ParkingRepository parkingRepository34 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot37 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean38 = parkingLot37.getStatus();
        model.parking.ParkingLot parkingLot41 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean42 = parkingLot41.getStatus();
        boolean boolean43 = parkingLot41.getStatus();
        model.parking.ParkingLot parkingLot46 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean47 = parkingLot46.getStatus();
        boolean boolean48 = parkingLot46.getStatus();
        model.parking.ParkingLot parkingLot51 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean52 = parkingLot51.getStatus();
        boolean boolean53 = parkingLot51.getStatus();
        parkingLot51.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray56 = new model.parking.ParkingLot[] { parkingLot37, parkingLot41, parkingLot46, parkingLot51 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList57 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList57, parkingLotArray56);
        parkingRepository34.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList57);
        parkingRepository8.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList57);
        repo.RepositoryProvider repositoryProvider61 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository62 = repositoryProvider61.getBookingRepository();
        repo.BookingRepository bookingRepository63 = repositoryProvider61.getBookingRepository();
        repo.BookingRepository bookingRepository64 = repositoryProvider61.getBookingRepository();
        repo.ParkingRepository parkingRepository65 = repositoryProvider61.getParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList66 = parkingRepository65.getAllParkingLots();
        parkingRepository8.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList66);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList68 = parkingRepository8.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList69 = parkingRepository8.getAllParkingLots();
        services.ManagerServices.parkingLots = parkingLotList69;
        parkingRepository6.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList69);
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(bookingRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(parkingRepository4);
        org.junit.Assert.assertNotNull(userRepository5);
        org.junit.Assert.assertNotNull(parkingRepository6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(parkingLotArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(parkingLotArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(bookingRepository62);
        org.junit.Assert.assertNotNull(bookingRepository63);
        org.junit.Assert.assertNotNull(bookingRepository64);
        org.junit.Assert.assertNotNull(parkingRepository65);
        org.junit.Assert.assertNotNull(parkingLotList66);
        org.junit.Assert.assertNotNull(parkingLotList68);
        org.junit.Assert.assertNotNull(parkingLotList69);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        int int3 = parkingSpace1.getSpaceID();
        java.lang.String str4 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Space 32 is already enabled." + "'", str4, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.toString();
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "X?EhgrKDV");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str4, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        model.parking.ParkingLot parkingLot3 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str4 = parkingLot3.enableParkingLot();
        managerServices0.addParkingLot(parkingLot3);
        boolean boolean6 = parkingLot3.getStatus();
        parkingLot3.setLotID((int) (short) 10);
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Lot 97 is already enabled." + "'", str4, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        student9.setStudentId("hi!");
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        booking12.setCost((double) (short) 100);
        int int18 = booking12.getSpaceId();
        int int19 = booking12.getTotalHours();
        boolean boolean20 = student9.equals((java.lang.Object) int19);
        student9.setStudentId("Y@mMCI7!u");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        model.user.Credentials credentials0 = null;
        model.user.Client client1 = new model.user.Client(credentials0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        java.lang.String str4 = parkingLot2.getLocation();
        boolean boolean5 = parkingLot2.getStatus();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NonFacultyStaff" + "'", str4, "NonFacultyStaff");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.lang.String str10 = booking0.getLicensePlate();
        java.util.Date date11 = booking0.getEndDateTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking(35, (int) (byte) 0);
        java.lang.String str12 = clientServices0.getParkingSpaceById(0, (int) (short) 100);
        java.lang.String str15 = clientServices0.enableParkingSpaceById((int) (short) 0, (int) (short) -1);
        java.lang.String str18 = clientServices0.enableParkingSpaceById(35, 0);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "There is no Such Parking Lot" + "'", str12, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "There is no Such Parking Lot" + "'", str15, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "There is no Such Parking Lot" + "'", str18, "There is no Such Parking Lot");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.getType();
        java.lang.Class<?> wildcardClass8 = credentials3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList4 = bookingRepository3.getAllBookings();
        services.ClientServices clientServices5 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot7 = clientServices5.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList8 = clientServices5.getAllBookings();
        model.booking.Booking booking9 = new model.booking.Booking();
        int int10 = booking9.getStartTime();
        booking9.setEndTime((int) (short) 10);
        java.lang.String str13 = booking9.getEmail();
        java.util.Date date14 = booking9.getStartDateTime();
        boolean boolean15 = clientServices5.bookParkingSpace(booking9);
        java.lang.String str18 = clientServices5.getParkingSpaceById((int) (short) 0, (int) '#');
        java.util.List<model.booking.Booking> bookingList19 = clientServices5.getAllBookings();
        bookingRepository3.updateBookings(bookingList19);
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(userRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(clientServices5);
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "There is no Such Parking Lot" + "'", str18, "There is no Such Parking Lot");
        org.junit.Assert.assertNotNull(bookingList19);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        model.user.User user3 = new model.user.User("Parking Space 100 is already enabled.", "Parking Space 32 is already disabled.", "Y@mMCI7!u");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Parking Space 32 is already enabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "cZ=IAx!!l");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str17, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateStrongPassword();
        boolean boolean4 = superManagerServices0.isValidEmail("Success: Parking Lot 97 has been disabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        model.user.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = superManagerServices0.createAccount(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.User.getCredentials()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "*qcO+u6gW" + "'", str2, "*qcO+u6gW");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        facultyMember11.setFacultyId("wMB&=eDYD");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.lang.Class<?> wildcardClass15 = booking0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "There is no Such Parking Lot" + "'", str14, "There is no Such Parking Lot");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean6 = superManagerServices0.isStrongPassword("Success: Parking Lot 97 has been disabled.");
        boolean boolean8 = superManagerServices0.isValidEmail("");
        java.lang.String str9 = superManagerServices0.generateStrongPassword();
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "qS46Qm6yT" + "'", str9, "qS46Qm6yT");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        booking0.setCost(10.0d);
        int int9 = booking0.getSpaceId();
        java.lang.String str10 = booking0.getStatus();
        java.util.Date date11 = booking0.getDate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        java.lang.String str5 = facultyMember4.getFacultyId();
        facultyMember4.setFacultyId("hi!");
        facultyMember4.setFacultyName("hi!");
        java.lang.String str10 = facultyMember4.getFacultyId();
        java.lang.String str11 = facultyMember4.getFacultyName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        booking0.setStartTime((int) (byte) 0);
        double double12 = booking0.getCost();
        booking0.setLicensePlate("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        java.util.List<model.user.User> userList14 = userRepository3.getUsers();
        model.user.User user18 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.", "NonFacultyStaff", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        userRepository3.addUser(user18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(credentials11);
        org.junit.Assert.assertNotNull(credentials12);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        model.user.User user3 = new model.user.User("Parking Space 32 is already enabled.", "Parking Space 1 is already enabled.", "Parking Space 35 is already enabled.");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking(35, (int) (byte) 0);
        java.lang.String str12 = clientServices0.getParkingSpaceById(0, (int) (short) 100);
        java.lang.String str15 = clientServices0.enableParkingSpaceById((int) (short) 0, (int) (short) -1);
        model.booking.Booking booking17 = clientServices0.getBookingById((int) '#');
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "There is no Such Parking Lot" + "'", str12, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "There is no Such Parking Lot" + "'", str15, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(booking17);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        booking0.setEndTime(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean9 = superManagerServices0.isStrongPassword("T#NJctMi&");
        java.lang.String str10 = superManagerServices0.generateStrongPassword();
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "B7Q7?T8bL" + "'", str10, "B7Q7?T8bL");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Student");
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.parking.ParkingLot parkingLot13 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str14 = parkingLot13.enableParkingLot();
        java.lang.String str15 = parkingLot13.disableParkingLot();
        boolean boolean16 = parkingLot13.getStatus();
        java.lang.String str17 = parkingLot13.disableParkingLot();
        boolean boolean18 = nonFacultyStaff10.equals((java.lang.Object) str17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Lot 97 is already enabled." + "'", str14, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Success: Parking Lot 97 has been disabled." + "'", str15, "Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Lot 97 is already disabled." + "'", str17, "Parking Lot 97 is already disabled.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        facultyMember8.setFacultyName("Parking Space 32 is already enabled.");
        facultyMember8.validateAccount();
        facultyMember8.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        int int3 = booking0.getEndTime();
        booking0.setCost((-8.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        java.lang.String str5 = facultyMember4.getFacultyId();
        facultyMember4.setFacultyId("hi!");
        facultyMember4.setFacultyName("hi!");
        java.lang.String str10 = facultyMember4.getFacultyId();
        facultyMember4.validateAccount();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 1.0f);
        double double4 = facultyParkingRate0.calculateRate(15.0d);
        double double6 = facultyParkingRate0.calculateRate(1000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 120.0d + "'", double4 == 120.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8000.0d + "'", double6 == 8000.0d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        strategy.VisitorParkingRate visitorParkingRate0 = new strategy.VisitorParkingRate();
        double double2 = visitorParkingRate0.calculateRate((double) (-1L));
        double double4 = visitorParkingRate0.calculateRate((double) ' ');
        double double6 = visitorParkingRate0.calculateRate((double) (byte) 100);
        double double8 = visitorParkingRate0.calculateRate(75.0d);
        double double10 = visitorParkingRate0.calculateRate(500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-15.0d) + "'", double2 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 480.0d + "'", double4 == 480.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1500.0d + "'", double6 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1125.0d + "'", double8 == 1125.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        model.user.Client client3 = new model.user.Client("Success: Parking Lot -1 has been disabled.", "", "lWu#FFEES");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Space -1 is already enabled.", "X?EhgrKDV");
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean3 = parkingLot2.getStatus();
        boolean boolean4 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 100);
        int int7 = parkingLot2.getLotID();
        int int8 = parkingLot2.getLotID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        model.user.Client client3 = new model.user.Client("HcpxBjAE]", "Parking Space 35 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        java.lang.String str5 = facultyMember4.getFacultyId();
        facultyMember4.setFacultyName("pUdP465**");
        facultyMember4.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        boolean boolean10 = facultyMember4.getValidationStatus();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        booking0.setCost(15000.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager" + "'", str13, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        strategy.VisitorParkingRate visitorParkingRate63 = new strategy.VisitorParkingRate();
        double double65 = visitorParkingRate63.calculateRate((double) (-1L));
        double double67 = visitorParkingRate63.calculateRate((double) ' ');
        double double69 = visitorParkingRate63.calculateRate((double) (byte) 100);
        double double71 = visitorParkingRate63.calculateRate(1500.0d);
        boolean boolean72 = credentials3.equals((java.lang.Object) double71);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(bookingArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(clientServices56);
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(bookingList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-15.0d) + "'", double65 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 480.0d + "'", double67 == 480.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1500.0d + "'", double69 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 22500.0d + "'", double71 == 22500.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        model.booking.Booking booking9 = clientServices0.getBookingById(97);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot12 = clientServices10.getParkingLotByAddress("Student");
        model.booking.Booking booking14 = clientServices10.getBookingById((int) (short) 0);
        boolean boolean15 = clientServices0.updateCompleteBooking(booking14);
        model.booking.Booking booking17 = clientServices0.getBookingById((int) (byte) 10);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "There is no Such Parking Lot" + "'", str5, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertNull(booking9);
        org.junit.Assert.assertNotNull(clientServices10);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(booking14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(booking17);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str17, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        booking0.setCost(10.0d);
        int int9 = booking0.getSpaceId();
        booking0.setCost(776.0d);
        int int12 = booking0.getStartTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        java.util.Date date18 = booking0.getDate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager" + "'", str13, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        int int15 = booking13.getId();
        int int16 = booking13.getTotalHours();
        java.util.Date date17 = booking13.getEndDateTime();
        int int18 = booking13.getTotalHours();
        boolean boolean19 = clientServices0.updateCompleteBooking(booking13);
        double double20 = booking13.getCost();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str9, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getId();
        java.lang.String str8 = booking0.getLicensePlate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.util.List<model.user.User> userList14 = userRepository4.getUsers();
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(bookingRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(userRepository4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(credentials12);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        java.lang.String str9 = credentials3.getType();
        model.user.User user10 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        model.user.User user3 = new model.user.User("Y@mMCI7!u", "\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "success");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) -1);
        model.sensor.Sensor sensor2 = parkingSpace1.getSensor();
        java.lang.String str3 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setStatus(true);
        model.booking.Booking booking6 = parkingSpace1.getBooking();
        org.junit.Assert.assertNotNull(sensor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Parking Space -1 is already enabled." + "'", str3, "Parking Space -1 is already enabled.");
        org.junit.Assert.assertNull(booking6);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        model.booking.Booking booking0 = new model.booking.Booking();
        java.lang.String str1 = booking0.getEmail();
        java.util.Date date2 = booking0.getDate();
        booking0.setCost(6208.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        java.util.List<model.user.User> userList4 = userRepository3.getUsers();
        java.util.List<model.user.User> userList5 = userRepository3.getUsers();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.toString();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.toString();
        java.lang.String str14 = credentials9.getPassword();
        java.lang.String str15 = credentials9.getType();
        model.user.Student student16 = new model.user.Student(credentials9);
        model.user.Credentials credentials17 = student16.getCredentials();
        java.lang.String str18 = student16.getStudentId();
        userRepository3.removeUser((model.user.User) student16);
        java.lang.String str20 = student16.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str11, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str13, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        managerServices0.loadLots();
        services.ManagerServices managerServices3 = services.ManagerServices.getInstance();
        managerServices3.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList5 = managerServices3.getAllParkingLots();
        managerServices0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList5);
        model.parking.ParkingLot parkingLot9 = new model.parking.ParkingLot((-1), "Success: Parking Lot 97 has been disabled.");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList10 = parkingLot9.getParkingSpaces();
        boolean boolean11 = parkingLot9.getStatus();
        int int12 = parkingLot9.getLotID();
        int int13 = parkingLot9.getLotID();
        managerServices0.addParkingLot(parkingLot9);
        parkingLot9.setLocation("Parking Space 32 is already disabled.");
        java.lang.String str17 = parkingLot9.disableParkingLot();
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertNotNull(managerServices3);
        org.junit.Assert.assertNotNull(parkingLotList5);
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Success: Parking Lot -1 has been disabled." + "'", str17, "Success: Parking Lot -1 has been disabled.");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        java.lang.Class<?> wildcardClass12 = credentials3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str6, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "(O3fsOXXJ", "Success: Parking Space 100 has been disabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        int int4 = parkingLot2.getLotID();
        int int5 = parkingLot2.getLotID();
        java.lang.String str6 = parkingLot2.getLocation();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList7 = parkingLot2.getParkingSpaces();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "NonFacultyStaff" + "'", str6, "NonFacultyStaff");
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        java.lang.String str9 = credentials3.toString();
        model.user.Client client10 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "Credentials{login='Credentials{login='hi!', password='hi!', type='hi!'}', password='Success: Parking Lot 100 has been disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str9, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking(35, (int) (byte) 0);
        boolean boolean12 = clientServices0.updateBooking((int) (byte) 0, (int) (byte) -1);
        model.booking.Booking booking14 = clientServices0.getBookingById(1);
        java.lang.String str17 = clientServices0.enableParkingSpaceById((int) (byte) 1, 32);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "There is no Such Parking Lot" + "'", str17, "There is no Such Parking Lot");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.lang.String str5 = booking0.toString();
        java.lang.String str6 = booking0.getStatus();
        booking0.setCost((double) ' ');
        int int9 = booking0.getEndTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student" + "'", str5, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) 'a', 100);
        java.lang.String str14 = clientServices0.getParkingSpaceById((int) ' ', 100);
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        booking15.setEndTime((int) (short) 10);
        booking15.setCost((double) (short) 100);
        int int21 = booking15.getTotalHours();
        boolean boolean22 = clientServices0.bookParkingSpace(booking15);
        java.util.Date date23 = booking15.getEndDateTime();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "There is no Such Parking Lot" + "'", str14, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(date23);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot(35, "Success: Parking Space 100 has been enabled.");
        parkingLot2.setLotID((int) ' ');
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "=B3fAbMGq", "Parking Lot -1 is already enabled.");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        nonFacultyStaff6.validateAccount();
        nonFacultyStaff6.setRole("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean13 = nonFacultyStaff6.getValidationStatus();
        java.lang.String str14 = nonFacultyStaff6.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str14, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean9 = superManagerServices0.isStrongPassword("pUdP465**");
        java.lang.String str10 = superManagerServices0.generateStrongPassword();
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cgJd5wr]v" + "'", str10, "cgJd5wr]v");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "success", "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 1.0f);
        double double4 = facultyParkingRate0.calculateRate(15.0d);
        double double6 = facultyParkingRate0.calculateRate((-15.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 120.0d + "'", double4 == 120.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-120.0d) + "'", double6 == (-120.0d));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        strategy.NonFacultyParkingRate nonFacultyParkingRate0 = new strategy.NonFacultyParkingRate();
        double double2 = nonFacultyParkingRate0.calculateRate((double) (byte) 0);
        double double4 = nonFacultyParkingRate0.calculateRate(480.0d);
        double double6 = nonFacultyParkingRate0.calculateRate(15.0d);
        double double8 = nonFacultyParkingRate0.calculateRate(800.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4800.0d + "'", double4 == 4800.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 150.0d + "'", double6 == 150.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8000.0d + "'", double8 == 8000.0d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean6 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        java.lang.String str2 = booking0.getStatus();
        booking0.setEmail("DYp5a&9eU");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        nonFacultyStaff9.validateAccount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials6 = null;
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials6, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        userRepository5.addUser((model.user.User) nonFacultyStaff8);
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials13, "hi!");
        model.user.Credentials credentials17 = nonFacultyStaff16.getCredentials();
        model.user.Client client18 = new model.user.Client(credentials17);
        model.user.Student student19 = new model.user.Student(credentials17);
        java.lang.String str20 = student19.getStudentId();
        // The following exception was thrown during execution in test generation
        try {
            userRepository5.updateUser((model.user.User) student19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.Credentials.getLogin()\" because the return value of \"model.user.User.getCredentials()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userRepository5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(credentials17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList2 = managerServices0.getAllParkingLots();
        managerServices0.loadLots();
        repo.ParkingRepository parkingRepository4 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean8 = parkingLot7.getStatus();
        model.parking.ParkingLot parkingLot11 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean12 = parkingLot11.getStatus();
        boolean boolean13 = parkingLot11.getStatus();
        model.parking.ParkingLot parkingLot16 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean17 = parkingLot16.getStatus();
        boolean boolean18 = parkingLot16.getStatus();
        model.parking.ParkingLot parkingLot21 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean22 = parkingLot21.getStatus();
        boolean boolean23 = parkingLot21.getStatus();
        parkingLot21.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray26 = new model.parking.ParkingLot[] { parkingLot7, parkingLot11, parkingLot16, parkingLot21 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList27 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList27, parkingLotArray26);
        parkingRepository4.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList27);
        managerServices0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList27);
        model.parking.ParkingLot parkingLot33 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList34 = parkingLot33.getParkingSpaces();
        int int35 = parkingLot33.getLotID();
        managerServices0.addParkingLot(parkingLot33);
        java.lang.Class<?> wildcardClass37 = parkingLot33.getClass();
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertNotNull(parkingLotList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parkingLotArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        java.lang.String str12 = facultyMember11.getFacultyId();
        facultyMember11.setFacultyName("paJF3HN(W");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        model.user.User user3 = new model.user.User("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "There is no Such Parking Lot", "Visitor");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 97 is already disabled.");
        model.user.Student student9 = new model.user.Student(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getEndTime();
        int int2 = booking0.getSpaceId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        java.lang.String str8 = facultyMember7.getFacultyName();
        facultyMember7.validateAccount();
        java.lang.String str10 = facultyMember7.getFacultyId();
        java.lang.String str11 = facultyMember7.getFacultyId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Lot 97 is already enabled." + "'", str8, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Give Id for parking Space is wrong" + "'", str10, "Give Id for parking Space is wrong");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Give Id for parking Space is wrong" + "'", str11, "Give Id for parking Space is wrong");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        model.parking.ParkingSpace parkingSpace6 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking7 = new model.booking.Booking();
        int int8 = booking7.getStartTime();
        booking7.setEndTime((int) (short) 10);
        parkingSpace6.setBooking(booking7);
        int int12 = parkingSpace6.getSpaceID();
        model.parking.ParkingSpace parkingSpace14 = new model.parking.ParkingSpace((int) '#');
        parkingSpace14.setStatus(true);
        boolean boolean17 = parkingSpace14.getStatus();
        model.booking.Booking booking18 = new model.booking.Booking();
        int int19 = booking18.getStartTime();
        booking18.setEndTime((int) (short) 10);
        java.lang.String str22 = booking18.getEmail();
        booking18.setCost((double) (byte) 0);
        int int25 = booking18.getLotId();
        booking18.setCost((double) 100L);
        parkingSpace14.setBooking(booking18);
        java.lang.String str29 = booking18.toString();
        java.lang.String str30 = booking18.getStatus();
        int int31 = booking18.getId();
        parkingSpace6.setBooking(booking18);
        int int33 = booking18.getLotId();
        java.util.Date date34 = booking18.getEndDateTime();
        boolean boolean35 = clientServices0.bookParkingSpace(booking18);
        int int36 = booking18.getId();
        booking18.setStartTime((int) (short) 1);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null" + "'", str29, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(credentials11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) 'a', 100);
        java.lang.String str14 = clientServices0.getParkingSpaceById((int) ' ', 100);
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        booking15.setEndTime((int) (short) 10);
        booking15.setCost((double) (short) 100);
        int int21 = booking15.getTotalHours();
        boolean boolean22 = clientServices0.bookParkingSpace(booking15);
        booking15.setStartTime((int) (short) 100);
        java.lang.String str25 = booking15.getEmail();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "There is no Such Parking Lot" + "'", str14, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        boolean boolean9 = clientServices0.cancenlBooking(0);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "There is no Such Parking Lot" + "'", str7, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateRandomEmail();
        boolean boolean4 = superManagerServices0.isStrongPassword("(O3fsOXXJ");
        boolean boolean6 = superManagerServices0.isValidEmail("lWu#FFEES");
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        java.util.Date date11 = booking4.getEndDateTime();
        booking4.setStatus("Parking Space 100 is already disabled.");
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        model.user.Client client3 = new model.user.Client("Parking Space 32 is already disabled.", "Success: Parking Space 97 has been disabled.", "Success: Parking Space -1 has been disabled.");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(97);
        parkingSpace1.setStatus(true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((-1), "Success: Parking Lot 97 has been disabled.");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        boolean boolean4 = parkingLot2.getStatus();
        int int5 = parkingLot2.getLotID();
        java.lang.String str6 = parkingLot2.getLocation();
        parkingLot2.setLotID((int) (byte) 0);
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Success: Parking Lot 97 has been disabled." + "'", str6, "Success: Parking Lot 97 has been disabled.");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        services.SuperManagerServices superManagerServices9 = services.SuperManagerServices.getInstance();
        java.lang.String str10 = superManagerServices9.generateRandomEmail();
        boolean boolean12 = superManagerServices9.isValidEmail("FacultyMember");
        boolean boolean14 = superManagerServices9.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean16 = superManagerServices9.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean18 = superManagerServices9.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        boolean boolean19 = client8.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        boolean boolean20 = client8.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(superManagerServices9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        model.user.Client client3 = new model.user.Client("Success: Parking Space 97 has been enabled.", "", "pUdP465**");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setStatus(false);
        java.lang.String str4 = parkingSpace1.disableParkingSpace();
        int int5 = parkingSpace1.getSpaceID();
        boolean boolean6 = parkingSpace1.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Space 35 is already disabled." + "'", str4, "Parking Space 35 is already disabled.");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        int int27 = booking13.getLotId();
        java.util.Date date28 = booking13.getStartDateTime();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str9, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(date28);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.String str10 = credentials7.getLogin();
        services.ClientServices clientServices11 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot13 = clientServices11.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList14 = clientServices11.getAllBookings();
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        booking15.setEndTime((int) (short) 10);
        java.lang.String str19 = booking15.getEmail();
        java.util.Date date20 = booking15.getStartDateTime();
        boolean boolean21 = clientServices11.bookParkingSpace(booking15);
        java.util.Date date22 = booking15.getEndDateTime();
        boolean boolean23 = credentials7.equals((java.lang.Object) booking15);
        java.lang.String str24 = booking15.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(clientServices11);
        org.junit.Assert.assertNull(parkingLot13);
        org.junit.Assert.assertNotNull(bookingList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate(1000.0d);
        double double4 = facultyParkingRate0.calculateRate(15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8000.0d + "'", double2 == 8000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 120.0d + "'", double4 == 120.0d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        services.ClientServices clientServices5 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot7 = clientServices5.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList8 = clientServices5.getAllBookings();
        java.lang.String str11 = clientServices5.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean14 = clientServices5.updateBooking((int) '#', (int) (short) 0);
        boolean boolean15 = credentials3.equals((java.lang.Object) (short) 0);
        java.lang.String str16 = credentials3.getType();
        model.user.User user17 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertNotNull(clientServices5);
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "There is no Such Parking Lot" + "'", str11, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<java.lang.String> strList5 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllBookings();
        boolean boolean9 = clientServices0.updateBooking(0, 35);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        repo.UserRepository userRepository13 = userService0.userRepository;
        boolean boolean15 = userService0.isValidEmail("Success: Parking Space 35 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userRepository13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        java.lang.String str3 = clientServices0.enableParkingSpaceById((int) 'a', (int) (byte) 100);
        model.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = clientServices0.bookParkingSpace(booking4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.booking.Booking.getLotId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Success: Parking Space 100 has been enabled." + "'", str3, "Success: Parking Space 100 has been enabled.");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        java.lang.String str4 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setSpaceID((int) '#');
        parkingSpace1.setStatus(false);
        model.booking.Booking booking9 = new model.booking.Booking();
        booking9.setId(0);
        booking9.setEmail("Student");
        parkingSpace1.setBooking(booking9);
        java.lang.String str15 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 97 has been disabled." + "'", str4, "Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Success: Parking Space 35 has been enabled." + "'", str15, "Success: Parking Space 35 has been enabled.");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.util.List<model.user.User> userList16 = userRepository5.getUsers();
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(bookingRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(parkingRepository4);
        org.junit.Assert.assertNotNull(userRepository5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        managerServices0.loadLots();
        services.ManagerServices managerServices3 = services.ManagerServices.getInstance();
        managerServices3.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList5 = managerServices3.getAllParkingLots();
        managerServices0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList5);
        model.parking.ParkingLot parkingLot9 = new model.parking.ParkingLot((-1), "Success: Parking Lot 97 has been disabled.");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList10 = parkingLot9.getParkingSpaces();
        boolean boolean11 = parkingLot9.getStatus();
        int int12 = parkingLot9.getLotID();
        int int13 = parkingLot9.getLotID();
        managerServices0.addParkingLot(parkingLot9);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList15 = managerServices0.getAllParkingLots();
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertNotNull(managerServices3);
        org.junit.Assert.assertNotNull(parkingLotList5);
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(parkingLotList15);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        model.user.Credentials credentials3 = new model.user.Credentials("", "success", "cgJd5wr]v");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        java.lang.String str12 = booking3.getLicensePlate();
        java.lang.String str13 = booking3.toString();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         Student'\nemail        null" + "'", str13, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         Student'\nemail        null");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (short) 1);
        boolean boolean2 = parkingSpace1.hasBooking();
        int int3 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList2 = managerServices0.getAllParkingLots();
        managerServices0.loadLots();
        model.parking.ParkingLot parkingLot4 = null;
        managerServices0.addParkingLot(parkingLot4);
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate(150.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1200.0d + "'", double2 == 1200.0d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getSpaceId();
        int int3 = booking0.getEndTime();
        java.lang.String str4 = booking0.getLicensePlate();
        double double5 = booking0.getCost();
        java.lang.String str6 = booking0.getEmail();
        booking0.setStartTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        model.booking.Booking booking4 = parkingSpace1.getBooking();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        model.sensor.Sensor sensor6 = parkingSpace1.getSensor();
        java.lang.String str7 = parkingSpace1.disableParkingSpace();
        org.junit.Assert.assertNull(booking4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(sensor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Space 100 is already disabled." + "'", str7, "Parking Space 100 is already disabled.");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        model.booking.Booking booking6 = parkingSpace1.getBooking();
        int int7 = booking6.getSpaceId();
        java.lang.String str8 = booking6.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(booking6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 100, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isValidEmail("Parking Space 32 is already disabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        java.lang.String str8 = facultyMember7.getFacultyName();
        java.lang.String str9 = facultyMember7.getFacultyName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Lot 97 is already enabled." + "'", str8, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Lot 97 is already enabled." + "'", str9, "Parking Lot 97 is already enabled.");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.lang.String str16 = credentials12.toString();
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials12, "Student", "Manager");
        facultyMember19.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str22 = facultyMember19.getFacultyId();
        facultyMember19.setFacultyName("Give Id for parking Space is wrong");
        userRepository2.addUser((model.user.User) facultyMember19);
        java.util.List<model.user.User> userList26 = userRepository2.getUsers();
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(userRepository2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str14, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str16, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student" + "'", str22, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials10 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials11 = nonFacultyStaff6.getCredentials();
        java.lang.String str12 = credentials11.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials9);
        org.junit.Assert.assertNotNull(credentials10);
        org.junit.Assert.assertNotNull(credentials11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.util.Date date5 = booking0.getStartDateTime();
        java.lang.Class<?> wildcardClass6 = booking0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        boolean boolean14 = userService0.isValidEmail("[qIbnc7Xj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        facultyMember11.setFacultyName("Parking Space 1 is already disabled.");
        boolean boolean14 = facultyMember11.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        facultyMember4.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str7 = facultyMember4.getFacultyId();
        facultyMember4.setFacultyId("Success: Parking Space -1 has been disabled.");
        facultyMember4.setFacultyName("Success: Parking Space 100 has been enabled.");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        java.lang.String str8 = credentials3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        repo.UserRepository userRepository4 = userService0.userRepository;
        model.user.SuperManager superManager5 = model.user.SuperManager.getInstance();
        superManager5.validateAccount();
        model.user.Credentials credentials7 = superManager5.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.User user10 = new model.user.User(credentials7);
        userRepository4.removeUser(user10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
        org.junit.Assert.assertNotNull(userRepository4);
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList1 = parkingRepository0.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList2 = parkingRepository0.getAllParkingLots();
        services.ManagerServices.parkingLots = parkingLotList2;
        services.ManagerServices.parkingLots = parkingLotList2;
        org.junit.Assert.assertNotNull(parkingLotList1);
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        booking2.setCost((double) 0.0f);
        java.lang.String str8 = booking2.getStatus();
        int int9 = booking2.getLotId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot3 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean4 = parkingLot3.getStatus();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean8 = parkingLot7.getStatus();
        boolean boolean9 = parkingLot7.getStatus();
        model.parking.ParkingLot parkingLot12 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean13 = parkingLot12.getStatus();
        boolean boolean14 = parkingLot12.getStatus();
        model.parking.ParkingLot parkingLot17 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean18 = parkingLot17.getStatus();
        boolean boolean19 = parkingLot17.getStatus();
        parkingLot17.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray22 = new model.parking.ParkingLot[] { parkingLot3, parkingLot7, parkingLot12, parkingLot17 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList23 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList23, parkingLotArray22);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList23);
        repo.ParkingRepository parkingRepository26 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot29 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean30 = parkingLot29.getStatus();
        model.parking.ParkingLot parkingLot33 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean34 = parkingLot33.getStatus();
        boolean boolean35 = parkingLot33.getStatus();
        model.parking.ParkingLot parkingLot38 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean39 = parkingLot38.getStatus();
        boolean boolean40 = parkingLot38.getStatus();
        model.parking.ParkingLot parkingLot43 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean44 = parkingLot43.getStatus();
        boolean boolean45 = parkingLot43.getStatus();
        parkingLot43.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray48 = new model.parking.ParkingLot[] { parkingLot29, parkingLot33, parkingLot38, parkingLot43 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList49 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList49, parkingLotArray48);
        parkingRepository26.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList49);
        repo.ParkingRepository parkingRepository52 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot55 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean56 = parkingLot55.getStatus();
        model.parking.ParkingLot parkingLot59 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean60 = parkingLot59.getStatus();
        boolean boolean61 = parkingLot59.getStatus();
        model.parking.ParkingLot parkingLot64 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean65 = parkingLot64.getStatus();
        boolean boolean66 = parkingLot64.getStatus();
        model.parking.ParkingLot parkingLot69 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean70 = parkingLot69.getStatus();
        boolean boolean71 = parkingLot69.getStatus();
        parkingLot69.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray74 = new model.parking.ParkingLot[] { parkingLot55, parkingLot59, parkingLot64, parkingLot69 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList75 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList75, parkingLotArray74);
        parkingRepository52.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList75);
        parkingRepository26.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList75);
        services.ManagerServices.parkingLots = parkingLotList75;
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList75);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList81 = parkingRepository0.getAllParkingLots();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingLotArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(parkingLotArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(parkingLotArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(parkingLotList81);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 1 has been disabled.", "Parking Space 32 is already enabled.", "Parking Space -1 is already enabled.");
        model.user.User user4 = new model.user.User(credentials3);
        user4.validateAccount();
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(credentials14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot3 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean4 = parkingLot3.getStatus();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean8 = parkingLot7.getStatus();
        boolean boolean9 = parkingLot7.getStatus();
        model.parking.ParkingLot parkingLot12 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean13 = parkingLot12.getStatus();
        boolean boolean14 = parkingLot12.getStatus();
        model.parking.ParkingLot parkingLot17 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean18 = parkingLot17.getStatus();
        boolean boolean19 = parkingLot17.getStatus();
        parkingLot17.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray22 = new model.parking.ParkingLot[] { parkingLot3, parkingLot7, parkingLot12, parkingLot17 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList23 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList23, parkingLotArray22);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList23);
        repo.ParkingRepository parkingRepository26 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot29 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean30 = parkingLot29.getStatus();
        model.parking.ParkingLot parkingLot33 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean34 = parkingLot33.getStatus();
        boolean boolean35 = parkingLot33.getStatus();
        model.parking.ParkingLot parkingLot38 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean39 = parkingLot38.getStatus();
        boolean boolean40 = parkingLot38.getStatus();
        model.parking.ParkingLot parkingLot43 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean44 = parkingLot43.getStatus();
        boolean boolean45 = parkingLot43.getStatus();
        parkingLot43.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray48 = new model.parking.ParkingLot[] { parkingLot29, parkingLot33, parkingLot38, parkingLot43 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList49 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList49, parkingLotArray48);
        parkingRepository26.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList49);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList49);
        services.ManagerServices.parkingLots = parkingLotList49;
        services.ManagerServices.parkingLots = parkingLotList49;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingLotArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(parkingLotArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.util.Date date5 = booking0.getStartDateTime();
        java.lang.String str6 = booking0.getStatus();
        int int7 = booking0.getLotId();
        java.util.Date date8 = booking0.getEndDateTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        model.user.Client client3 = new model.user.Client("Parking Space 1 is already enabled.", "Parking Space 32 is already enabled.", "b0K0Td]sJ");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        boolean boolean16 = parkingSpace1.getStatus();
        boolean boolean17 = parkingSpace1.hasBooking();
        java.lang.String str18 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Space 35 is already enabled." + "'", str18, "Parking Space 35 is already enabled.");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        model.user.Credentials credentials3 = new model.user.Credentials("tZectvKdt", "9z6wsHuxQ", "FacultyMember");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember10.setFacultyName("Parking Space 35 is already disabled.");
        facultyMember10.setFacultyName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        double double3 = booking0.getCost();
        int int4 = booking0.getSpaceId();
        booking0.setCost((double) 0L);
        java.lang.String str7 = booking0.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) (byte) 100, (int) (short) 10);
        java.util.List<java.lang.String> strList4 = clientServices0.getAllLocations();
        model.booking.Booking booking5 = new model.booking.Booking();
        int int6 = booking5.getStartTime();
        booking5.setEndTime((int) (short) 10);
        java.lang.String str9 = booking5.getEmail();
        booking5.setCost((double) (byte) 0);
        int int12 = booking5.getLotId();
        booking5.setEmail("Manager");
        double double15 = booking5.getCost();
        java.util.Date date16 = booking5.getDate();
        java.lang.String str17 = booking5.getStatus();
        boolean boolean18 = clientServices0.updateCompleteBooking(booking5);
        java.lang.String str21 = clientServices0.enableParkingSpaceById((int) (short) 100, 0);
        boolean boolean24 = clientServices0.updateBooking((int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Give Id for parking Space is wrong" + "'", str21, "Give Id for parking Space is wrong");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Give Id for parking Space is wrong");
        boolean boolean8 = superManagerServices0.isStrongPassword("success");
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        boolean boolean11 = superManagerServices0.isValidEmail("");
        java.lang.String str12 = superManagerServices0.generateStrongPassword();
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ")CAoHm8t(" + "'", str12, ")CAoHm8t(");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        java.lang.String str16 = booking0.getLicensePlate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        booking0.setCost((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        java.lang.String str9 = superManagerServices0.generateStrongPassword();
        boolean boolean11 = superManagerServices0.isStrongPassword("Parking Space 35 is already enabled.");
        boolean boolean13 = superManagerServices0.isValidEmail("Success: Parking Space 35 has been disabled.");
        java.lang.String str14 = superManagerServices0.generateRandomEmail();
        java.lang.String str15 = superManagerServices0.generateStrongPassword();
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "R14et$0r@" + "'", str9, "R14et$0r@");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "&eLd?)dY$" + "'", str15, "&eLd?)dY$");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "users.json");
        java.lang.String str9 = student8.getStudentId();
        student8.setStudentId("HcpxBjAE]");
        student8.setStudentId("Parking Space 35 is already disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "users.json" + "'", str9, "users.json");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.lang.String str5 = booking0.toString();
        booking0.setLicensePlate("Visitor");
        java.lang.String str8 = booking0.getLicensePlate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str5, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor" + "'", str8, "Visitor");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        java.lang.String str12 = clientServices0.disableParkingSpaceById(1, (int) (short) 0);
        java.util.List<java.lang.String> strList13 = clientServices0.getAllLocations();
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str9, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "There is no Such Parking Lot" + "'", str12, "There is no Such Parking Lot");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str6, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        java.lang.String str4 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setSpaceID((int) '#');
        parkingSpace1.setStatus(false);
        model.booking.Booking booking9 = new model.booking.Booking();
        booking9.setId(0);
        booking9.setEmail("Student");
        parkingSpace1.setBooking(booking9);
        booking9.setStatus("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 97 has been disabled." + "'", str4, "Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        model.user.Credentials credentials0 = null;
        model.user.Student student1 = new model.user.Student(credentials0);
        student1.validateAccount();
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        java.lang.Class<?> wildcardClass6 = repositoryProvider0.getClass();
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(bookingRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(userRepository4);
        org.junit.Assert.assertNotNull(userRepository5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager10 = new model.user.Manager(credentials7);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7, "HcpxBjAE]", "4]z?3Qs%M");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        int int4 = parkingLot2.getLotID();
        java.lang.String str5 = parkingLot2.disableParkingLot();
        parkingLot2.setLotID(0);
        boolean boolean8 = parkingLot2.getStatus();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Lot 97 has been disabled." + "'", str5, "Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        java.lang.String str7 = student6.getStudentId();
        student6.validateAccount();
        java.lang.String str9 = student6.getStudentId();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        int int6 = booking0.getSpaceId();
        java.util.Date date7 = booking0.getStartDateTime();
        booking0.setCost((double) '4');
        java.lang.String str10 = booking0.toString();
        java.util.Date date11 = booking0.getStartDateTime();
        booking0.setId((int) (byte) -1);
        java.lang.String str14 = booking0.getStatus();
        java.lang.String str15 = booking0.getLicensePlate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null" + "'", str10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        booking0.setEndTime((int) 'a');
        int int5 = booking0.getSpaceId();
        booking0.setEmail("");
        double double8 = booking0.getCost();
        booking0.setEndTime((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Student student10 = new model.user.Student(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        booking0.setStatus("Student");
        java.util.Date date8 = booking0.getEndDateTime();
        int int9 = booking0.getTotalHours();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.util.Date date5 = booking0.getStartDateTime();
        booking0.setId((int) (byte) 100);
        booking0.setCost((double) (byte) -1);
        booking0.setLicensePlate("Parking Lot 1 is already enabled.");
        booking0.setEndTime((-1));
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        java.lang.String str11 = facultyMember10.getFacultyName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        model.user.Client client3 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager", "pUdP465**", "Success: Parking Lot 100 has been disabled.");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        managerServices0.loadLots();
        services.ManagerServices managerServices3 = services.ManagerServices.getInstance();
        managerServices3.loadLots();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str8 = parkingLot7.enableParkingLot();
        java.lang.String str9 = parkingLot7.enableParkingLot();
        managerServices3.addParkingLot(parkingLot7);
        boolean boolean11 = parkingLot7.getStatus();
        java.lang.String str12 = parkingLot7.getLocation();
        parkingLot7.setLotID((int) ' ');
        managerServices0.addParkingLot(parkingLot7);
        services.ManagerServices managerServices16 = services.ManagerServices.getInstance();
        managerServices16.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList18 = managerServices16.getAllParkingLots();
        managerServices0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList18);
        services.ManagerServices.parkingLots = parkingLotList18;
        services.ManagerServices.parkingLots = parkingLotList18;
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertNotNull(managerServices3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Lot 97 is already enabled." + "'", str8, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Lot 97 is already enabled." + "'", str9, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NonFacultyStaff" + "'", str12, "NonFacultyStaff");
        org.junit.Assert.assertNotNull(managerServices16);
        org.junit.Assert.assertNotNull(parkingLotList18);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot3 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean4 = parkingLot3.getStatus();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean8 = parkingLot7.getStatus();
        boolean boolean9 = parkingLot7.getStatus();
        model.parking.ParkingLot parkingLot12 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean13 = parkingLot12.getStatus();
        boolean boolean14 = parkingLot12.getStatus();
        model.parking.ParkingLot parkingLot17 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean18 = parkingLot17.getStatus();
        boolean boolean19 = parkingLot17.getStatus();
        parkingLot17.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray22 = new model.parking.ParkingLot[] { parkingLot3, parkingLot7, parkingLot12, parkingLot17 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList23 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList23, parkingLotArray22);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList23);
        repo.ParkingRepository parkingRepository26 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot29 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean30 = parkingLot29.getStatus();
        model.parking.ParkingLot parkingLot33 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean34 = parkingLot33.getStatus();
        boolean boolean35 = parkingLot33.getStatus();
        model.parking.ParkingLot parkingLot38 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean39 = parkingLot38.getStatus();
        boolean boolean40 = parkingLot38.getStatus();
        model.parking.ParkingLot parkingLot43 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean44 = parkingLot43.getStatus();
        boolean boolean45 = parkingLot43.getStatus();
        parkingLot43.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray48 = new model.parking.ParkingLot[] { parkingLot29, parkingLot33, parkingLot38, parkingLot43 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList49 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList49, parkingLotArray48);
        parkingRepository26.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList49);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList49);
        repo.RepositoryProvider repositoryProvider53 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository54 = repositoryProvider53.getBookingRepository();
        repo.BookingRepository bookingRepository55 = repositoryProvider53.getBookingRepository();
        repo.BookingRepository bookingRepository56 = repositoryProvider53.getBookingRepository();
        repo.ParkingRepository parkingRepository57 = repositoryProvider53.getParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList58 = parkingRepository57.getAllParkingLots();
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList58);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList60 = parkingRepository0.getAllParkingLots();
        services.ManagerServices managerServices61 = services.ManagerServices.getInstance();
        managerServices61.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList63 = managerServices61.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList64 = managerServices61.getAllParkingLots();
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingLotArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(parkingLotArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(bookingRepository54);
        org.junit.Assert.assertNotNull(bookingRepository55);
        org.junit.Assert.assertNotNull(bookingRepository56);
        org.junit.Assert.assertNotNull(parkingRepository57);
        org.junit.Assert.assertNotNull(parkingLotList58);
        org.junit.Assert.assertNotNull(parkingLotList60);
        org.junit.Assert.assertNotNull(managerServices61);
        org.junit.Assert.assertNotNull(parkingLotList63);
        org.junit.Assert.assertNotNull(parkingLotList64);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setStatus(true);
        boolean boolean4 = parkingSpace1.getStatus();
        boolean boolean5 = parkingSpace1.hasBooking();
        boolean boolean6 = parkingSpace1.hasBooking();
        java.lang.String str7 = parkingSpace1.enableParkingSpace();
        boolean boolean8 = parkingSpace1.hasBooking();
        boolean boolean9 = parkingSpace1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Space 35 is already enabled." + "'", str7, "Parking Space 35 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate(22500.0d);
        double double4 = facultyParkingRate0.calculateRate((double) 1.0f);
        double double6 = facultyParkingRate0.calculateRate(180000.0d);
        double double8 = facultyParkingRate0.calculateRate(100.0d);
        double double10 = facultyParkingRate0.calculateRate((double) 10);
        double double12 = facultyParkingRate0.calculateRate(776.0d);
        double double14 = facultyParkingRate0.calculateRate(2500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 180000.0d + "'", double2 == 180000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1440000.0d + "'", double6 == 1440000.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 800.0d + "'", double8 == 800.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 80.0d + "'", double10 == 80.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6208.0d + "'", double12 == 6208.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20000.0d + "'", double14 == 20000.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.RepositoryProvider repositoryProvider6 = new repo.RepositoryProvider();
        repo.UserRepository userRepository7 = repositoryProvider6.getUserRepository();
        repo.UserRepository userRepository8 = repositoryProvider6.getUserRepository();
        repo.ParkingRepository parkingRepository9 = repositoryProvider6.getParkingRepository();
        repo.RepositoryProvider repositoryProvider10 = new repo.RepositoryProvider();
        repo.UserRepository userRepository11 = repositoryProvider10.getUserRepository();
        repo.UserRepository userRepository12 = repositoryProvider10.getUserRepository();
        repo.ParkingRepository parkingRepository13 = repositoryProvider10.getParkingRepository();
        repo.ParkingRepository parkingRepository14 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot17 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean18 = parkingLot17.getStatus();
        model.parking.ParkingLot parkingLot21 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean22 = parkingLot21.getStatus();
        boolean boolean23 = parkingLot21.getStatus();
        model.parking.ParkingLot parkingLot26 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean27 = parkingLot26.getStatus();
        boolean boolean28 = parkingLot26.getStatus();
        model.parking.ParkingLot parkingLot31 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean32 = parkingLot31.getStatus();
        boolean boolean33 = parkingLot31.getStatus();
        parkingLot31.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray36 = new model.parking.ParkingLot[] { parkingLot17, parkingLot21, parkingLot26, parkingLot31 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList37 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList37, parkingLotArray36);
        parkingRepository14.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList37);
        services.ManagerServices.parkingLots = parkingLotList37;
        parkingRepository13.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList37);
        parkingRepository9.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList37);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList43 = parkingRepository9.getAllParkingLots();
        parkingRepository5.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList43);
        services.ManagerServices.parkingLots = parkingLotList43;
        org.junit.Assert.assertNotNull(userRepository1);
        org.junit.Assert.assertNotNull(bookingRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(userRepository4);
        org.junit.Assert.assertNotNull(parkingRepository5);
        org.junit.Assert.assertNotNull(userRepository7);
        org.junit.Assert.assertNotNull(userRepository8);
        org.junit.Assert.assertNotNull(parkingRepository9);
        org.junit.Assert.assertNotNull(userRepository11);
        org.junit.Assert.assertNotNull(userRepository12);
        org.junit.Assert.assertNotNull(parkingRepository13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parkingLotArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(parkingLotList43);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        booking0.setLicensePlate("Success: Parking Space 1 has been disabled.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        java.lang.String str27 = clientServices0.enableParkingSpaceById(97, (int) (byte) 100);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "There is no Such Parking Lot" + "'", str5, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Space 100 is already enabled." + "'", str27, "Parking Space 100 is already enabled.");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        model.user.Credentials credentials3 = new model.user.Credentials("Credentials{login='Credentials{login='hi!', password='hi!', type='hi!'}', password='Success: Parking Lot 100 has been disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student'}", "Av+-nN6Nu", "HcpxBjAE]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Student student9 = new model.user.Student(credentials7, "There is no Such Parking Lot");
        java.lang.Class<?> wildcardClass10 = student9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(credentials14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList1 = parkingRepository0.getAllParkingLots();
        model.parking.ParkingLot parkingLot4 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str5 = parkingLot4.enableParkingLot();
        java.lang.String str6 = parkingLot4.enableParkingLot();
        model.parking.ParkingLot parkingLot9 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean10 = parkingLot9.getStatus();
        boolean boolean11 = parkingLot9.getStatus();
        parkingLot9.setLotID((int) (byte) 100);
        model.parking.ParkingLot parkingLot16 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean17 = parkingLot16.getStatus();
        java.lang.String str18 = parkingLot16.getLocation();
        model.parking.ParkingLot parkingLot21 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean22 = parkingLot21.getStatus();
        boolean boolean23 = parkingLot21.getStatus();
        parkingLot21.setLotID((int) (byte) 100);
        int int26 = parkingLot21.getLotID();
        boolean boolean27 = parkingLot21.getStatus();
        model.parking.ParkingLot parkingLot30 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList31 = parkingLot30.getParkingSpaces();
        int int32 = parkingLot30.getLotID();
        model.parking.ParkingLot parkingLot35 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean36 = parkingLot35.getStatus();
        boolean boolean37 = parkingLot35.getStatus();
        parkingLot35.setLotID((int) (byte) 100);
        int int40 = parkingLot35.getLotID();
        model.parking.ParkingLot[] parkingLotArray41 = new model.parking.ParkingLot[] { parkingLot4, parkingLot9, parkingLot16, parkingLot21, parkingLot30, parkingLot35 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList42 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList42, parkingLotArray41);
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList42);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList45 = parkingRepository0.getAllParkingLots();
        java.util.List<model.parking.ParkingLot> parkingLotList46 = null;
        parkingRepository0.updateParkingLots(parkingLotList46);
        repo.RepositoryProvider repositoryProvider48 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository49 = repositoryProvider48.getBookingRepository();
        repo.BookingRepository bookingRepository50 = repositoryProvider48.getBookingRepository();
        repo.BookingRepository bookingRepository51 = repositoryProvider48.getBookingRepository();
        repo.ParkingRepository parkingRepository52 = repositoryProvider48.getParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList53 = parkingRepository52.getAllParkingLots();
        repo.ParkingRepository parkingRepository54 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot57 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean58 = parkingLot57.getStatus();
        model.parking.ParkingLot parkingLot61 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean62 = parkingLot61.getStatus();
        boolean boolean63 = parkingLot61.getStatus();
        model.parking.ParkingLot parkingLot66 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean67 = parkingLot66.getStatus();
        boolean boolean68 = parkingLot66.getStatus();
        model.parking.ParkingLot parkingLot71 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean72 = parkingLot71.getStatus();
        boolean boolean73 = parkingLot71.getStatus();
        parkingLot71.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray76 = new model.parking.ParkingLot[] { parkingLot57, parkingLot61, parkingLot66, parkingLot71 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList77 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList77, parkingLotArray76);
        parkingRepository54.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList77);
        services.ManagerServices.parkingLots = parkingLotList77;
        parkingRepository52.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList77);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList82 = parkingRepository52.getAllParkingLots();
        parkingRepository0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList82);
        org.junit.Assert.assertNotNull(parkingLotList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 97 is already enabled." + "'", str5, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Lot 97 is already enabled." + "'", str6, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NonFacultyStaff" + "'", str18, "NonFacultyStaff");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(parkingLotArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(parkingLotList45);
        org.junit.Assert.assertNotNull(bookingRepository49);
        org.junit.Assert.assertNotNull(bookingRepository50);
        org.junit.Assert.assertNotNull(bookingRepository51);
        org.junit.Assert.assertNotNull(parkingRepository52);
        org.junit.Assert.assertNull(parkingLotList53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(parkingLotArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(parkingLotList82);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        booking16.setLicensePlate("=K*eY67RK");
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "There is no Such Parking Lot" + "'", str5, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertNull(booking9);
        org.junit.Assert.assertNotNull(clientServices10);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(booking14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.sensor.Sensor sensor2 = parkingSpace1.getSensor();
        boolean boolean3 = parkingSpace1.hasBooking();
        org.junit.Assert.assertNotNull(sensor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        model.user.User user3 = new model.user.User("SBu-sSijR", "", "taSI0*=tM");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        repo.UserRepository userRepository4 = userService0.userRepository;
        model.user.Credentials credentials5 = null;
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials5);
        facultyMember6.validateAccount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = userService0.registerUser((model.user.User) facultyMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.Credentials.equals(Object)\" because the return value of \"model.user.User.getCredentials()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
        org.junit.Assert.assertNotNull(userRepository4);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = student9.getStudentId();
        java.lang.String str11 = student9.getStudentId();
        student9.setStudentId("Parking Space 35 is already enabled.");
        student9.setStudentId("Wm(OGK*DZ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        java.lang.String str10 = facultyMember5.getFacultyName();
        java.lang.String str11 = facultyMember5.getFacultyId();
        facultyMember5.setFacultyName("Student");
        model.parking.ParkingSpace parkingSpace15 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking16 = new model.booking.Booking();
        int int17 = booking16.getStartTime();
        booking16.setEndTime((int) (short) 10);
        java.lang.String str20 = booking16.getEmail();
        booking16.setCost((double) (byte) 0);
        parkingSpace15.setBooking(booking16);
        model.sensor.Sensor sensor24 = parkingSpace15.getSensor();
        boolean boolean25 = parkingSpace15.getStatus();
        boolean boolean26 = facultyMember5.equals((java.lang.Object) boolean25);
        facultyMember5.validateAccount();
        facultyMember5.setFacultyName("\nid             1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   Success: Parking Space 100 has been disabled.'\ncost           100.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Lot 97 is already enabled." + "'", str10, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(sensor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.util.Date date5 = booking0.getStartDateTime();
        int int6 = booking0.getTotalHours();
        java.util.Date date7 = booking0.getDate();
        java.lang.String str8 = booking0.getStatus();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        java.util.Date date15 = booking0.getEndDateTime();
        int int16 = booking0.getEndTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        java.lang.String str6 = booking2.getEmail();
        booking2.setCost((double) (byte) 0);
        parkingSpace1.setBooking(booking2);
        java.lang.String str10 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setStatus(false);
        parkingSpace1.setSpaceID(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Space 32 is already enabled." + "'", str10, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Space -1 has been enabled.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) '#', (int) (short) 10);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        student18.validateAccount();
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(userRepository2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str14, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.String str34 = clientServices0.enableParkingSpaceById((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str9, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(booking28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Give Id for parking Space is wrong" + "'", str34, "Give Id for parking Space is wrong");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        model.user.User user3 = new model.user.User("Success: Parking Space 97 has been enabled.", "Success: Parking Space 100 has been enabled.", "Success: Parking Space 1 has been disabled.");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        java.util.Date date13 = booking0.getStartDateTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        model.user.Client client3 = new model.user.Client("R14et$0r@", "lWu#FFEES", "9z6wsHuxQ");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        model.user.Student student14 = new model.user.Student(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str13, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        managerServices0.loadLots();
        managerServices0.loadLots();
        services.ManagerServices managerServices3 = services.ManagerServices.getInstance();
        managerServices3.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList5 = managerServices3.getAllParkingLots();
        managerServices0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList5);
        repo.ParkingRepository parkingRepository7 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot10 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean11 = parkingLot10.getStatus();
        model.parking.ParkingLot parkingLot14 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean15 = parkingLot14.getStatus();
        boolean boolean16 = parkingLot14.getStatus();
        model.parking.ParkingLot parkingLot19 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean20 = parkingLot19.getStatus();
        boolean boolean21 = parkingLot19.getStatus();
        model.parking.ParkingLot parkingLot24 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean25 = parkingLot24.getStatus();
        boolean boolean26 = parkingLot24.getStatus();
        parkingLot24.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray29 = new model.parking.ParkingLot[] { parkingLot10, parkingLot14, parkingLot19, parkingLot24 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList30 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList30, parkingLotArray29);
        parkingRepository7.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList30);
        managerServices0.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList30);
        model.parking.ParkingLot parkingLot36 = new model.parking.ParkingLot((int) (byte) 1, "(O3fsOXXJ");
        java.lang.String str37 = parkingLot36.getLocation();
        managerServices0.addParkingLot(parkingLot36);
        managerServices0.loadLots();
        managerServices0.loadLots();
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertNotNull(managerServices3);
        org.junit.Assert.assertNotNull(parkingLotList5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parkingLotArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(O3fsOXXJ" + "'", str37, "(O3fsOXXJ");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "9z6wsHuxQ");
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        java.lang.String str6 = facultyMember5.getFacultyName();
        facultyMember5.setFacultyId("pUdP465**");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("Student");
        java.lang.String str4 = superManagerServices0.generateRandomEmail();
        boolean boolean6 = superManagerServices0.isValidEmail("JoNIi]ebC");
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.lang.String str13 = credentials11.getLogin();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str5, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str7, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(credentials11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.lang.String str37 = clientServices0.enableParkingSpaceById(32, (int) (byte) 10);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "success" + "'", str6, "success");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str23, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingList34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Space 10 is already enabled." + "'", str37, "Parking Space 10 is already enabled.");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.util.List<model.booking.Booking> bookingList15 = clientServices0.getAllBookings();
        java.lang.String str18 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "There is no Such Parking Lot" + "'", str18, "There is no Such Parking Lot");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        java.lang.String str6 = booking2.getEmail();
        booking2.setCost((double) (byte) 0);
        parkingSpace1.setBooking(booking2);
        java.lang.String str10 = parkingSpace1.enableParkingSpace();
        boolean boolean11 = parkingSpace1.getStatus();
        java.lang.String str12 = parkingSpace1.enableParkingSpace();
        java.lang.String str13 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Space 32 is already enabled." + "'", str10, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Space 32 is already enabled." + "'", str12, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Space 32 is already enabled." + "'", str13, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        java.lang.String str12 = clientServices0.getParkingSpaceById(100, 100);
        java.lang.String str15 = clientServices0.disableParkingSpaceById((int) (short) 10, (int) (byte) 100);
        boolean boolean18 = clientServices0.updateBooking((int) 'a', (int) ' ');
        model.booking.Booking booking20 = clientServices0.getBookingById((int) (byte) 1);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str9, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "success" + "'", str12, "success");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "There is no Such Parking Lot" + "'", str15, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(booking20);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        int int14 = booking3.getId();
        booking3.setEmail("Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        services.ManagerServices managerServices0 = services.ManagerServices.getInstance();
        model.parking.ParkingLot parkingLot3 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str4 = parkingLot3.enableParkingLot();
        managerServices0.addParkingLot(parkingLot3);
        boolean boolean6 = parkingLot3.getStatus();
        parkingLot3.setLocation("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList9 = parkingLot3.getParkingSpaces();
        org.junit.Assert.assertNotNull(managerServices0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Lot 97 is already enabled." + "'", str4, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        int int4 = parkingLot2.getLotID();
        int int5 = parkingLot2.getLotID();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList6 = parkingLot2.getParkingSpaces();
        parkingLot2.setLotID((int) (short) 100);
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.booking.Booking booking1 = new model.booking.Booking();
        int int2 = booking1.getStartTime();
        int int3 = booking1.getId();
        java.util.Date date4 = booking1.getStartDateTime();
        boolean boolean5 = clientServices0.bookParkingSpace(booking1);
        boolean boolean8 = clientServices0.updateBooking((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 1, "Visitor");
        int int3 = parkingLot2.getLotID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        java.util.Date date3 = booking0.getStartDateTime();
        int int4 = booking0.getLotId();
        int int5 = booking0.getId();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.RepositoryProvider repositoryProvider4 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository5 = repositoryProvider4.getBookingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider4.getBookingRepository();
        repo.BookingRepository bookingRepository7 = repositoryProvider4.getBookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList8 = bookingRepository7.getAllBookings();
        bookingRepository3.updateBookings((java.util.List<model.booking.Booking>) bookingList8);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        boolean boolean13 = clientServices10.updateBooking((int) (byte) 100, (int) (short) 10);
        java.util.List<java.lang.String> strList14 = clientServices10.getAllLocations();
        model.booking.Booking booking16 = clientServices10.getBookingById((int) ' ');
        java.lang.String str19 = clientServices10.getParkingSpaceById(100, (int) (byte) 10);
        java.util.List<model.booking.Booking> bookingList20 = clientServices10.getAllBookings();
        bookingRepository3.updateBookings(bookingList20);
        services.ClientServices clientServices22 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot24 = clientServices22.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList25 = clientServices22.getAllBookings();
        model.booking.Booking booking26 = new model.booking.Booking();
        int int27 = booking26.getStartTime();
        booking26.setEndTime((int) (short) 10);
        java.lang.String str30 = booking26.getEmail();
        java.util.Date date31 = booking26.getStartDateTime();
        boolean boolean32 = clientServices22.bookParkingSpace(booking26);
        boolean boolean35 = clientServices22.updateBooking((int) (byte) 1, (int) '4');
        java.util.List<java.lang.String> strList36 = clientServices22.getAllLocations();
        java.util.List<model.booking.Booking> bookingList37 = clientServices22.getAllBookings();
        bookingRepository3.updateBookings(bookingList37);
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(userRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(bookingRepository5);
        org.junit.Assert.assertNotNull(bookingRepository6);
        org.junit.Assert.assertNotNull(bookingRepository7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(clientServices10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNull(booking16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "success" + "'", str19, "success");
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNotNull(clientServices22);
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(bookingList37);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getSpaceId();
        int int3 = booking0.getEndTime();
        java.lang.String str4 = booking0.getLicensePlate();
        double double5 = booking0.getCost();
        java.lang.String str6 = booking0.getEmail();
        booking0.setCost(1440000.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setId((-1));
        booking0.setCost((double) (short) 100);
        booking0.setLicensePlate("Success: Parking Space 100 has been disabled.");
        booking0.setId((int) (byte) 1);
        int int18 = booking0.getTotalHours();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        booking2.setCost((double) 0.0f);
        java.lang.String str8 = booking2.getEmail();
        int int9 = booking2.getStartTime();
        java.util.Date date10 = booking2.getDate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        facultyMember4.setFacultyName("Parking Lot 97 is already enabled.");
        facultyMember4.setFacultyId("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials10 = student9.getCredentials();
        java.lang.String str11 = student9.getStudentId();
        java.lang.String str12 = student9.getStudentId();
        java.lang.String str13 = student9.getStudentId();
        model.user.Credentials credentials14 = student9.getCredentials();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNotNull(credentials10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(credentials14);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 1.0f);
        double double4 = facultyParkingRate0.calculateRate(15.0d);
        java.lang.Class<?> wildcardClass5 = facultyParkingRate0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 120.0d + "'", double4 == 120.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) '4', "Parking Lot -1 is already enabled.");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        model.user.Client client3 = new model.user.Client("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.", "Success: Parking Space 97 has been enabled.", "Success: Parking Space 35 has been disabled.");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isValidEmail("=B3fAbMGq");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userRepository5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        boolean boolean16 = visitor8.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userRepository14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        booking0.setEndTime((int) 'a');
        booking0.setEndTime((-1));
        int int7 = booking0.getId();
        java.util.Date date8 = booking0.getStartDateTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        parkingSpace1.setStatus(true);
        model.booking.Booking booking6 = parkingSpace1.getBooking();
        int int7 = parkingSpace1.getSpaceID();
        java.lang.String str8 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Space 97 is already enabled." + "'", str8, "Parking Space 97 is already enabled.");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.lang.String str17 = booking5.getStatus();
        int int18 = booking5.getId();
        booking5.setEndTime(35);
        java.util.Date date21 = booking5.getStartDateTime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null" + "'", str16, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials6 = null;
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials6, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        userRepository5.addUser((model.user.User) nonFacultyStaff8);
        java.lang.Class<?> wildcardClass10 = userRepository5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userRepository5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str3 = parkingLot2.enableParkingLot();
        java.lang.String str4 = parkingLot2.enableParkingLot();
        java.lang.String str5 = parkingLot2.getLocation();
        java.lang.String str6 = parkingLot2.enableParkingLot();
        int int7 = parkingLot2.getLotID();
        int int8 = parkingLot2.getLotID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Parking Lot 97 is already enabled." + "'", str3, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Lot 97 is already enabled." + "'", str4, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NonFacultyStaff" + "'", str5, "NonFacultyStaff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Lot 97 is already enabled." + "'", str6, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        model.user.User user3 = new model.user.User("B7Q7?T8bL", "users.json", "Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 100, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        int int6 = booking0.getTotalHours();
        int int7 = booking0.getSpaceId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository6 = userService0.userRepository;
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        java.lang.String str14 = credentials10.toString();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials10, "Student", "Manager");
        userRepository6.removeUser((model.user.User) facultyMember17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userRepository3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userRepository6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str12, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str14, "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList4 = bookingRepository3.getAllBookings();
        services.ClientServices clientServices5 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot7 = clientServices5.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList8 = clientServices5.getAllBookings();
        java.lang.String str11 = clientServices5.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str14 = clientServices5.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking16 = clientServices5.getBookingById(100);
        java.util.List<java.lang.String> strList17 = clientServices5.getAllLocations();
        model.booking.Booking booking18 = new model.booking.Booking();
        int int19 = booking18.getStartTime();
        booking18.setEndTime((int) (short) 10);
        java.lang.String str22 = booking18.getEmail();
        booking18.setCost((double) (byte) 0);
        int int25 = booking18.getLotId();
        booking18.setEndTime((int) (short) 100);
        java.lang.String str28 = booking18.getEmail();
        java.util.Date date29 = booking18.getStartDateTime();
        java.lang.String str30 = booking18.getLicensePlate();
        boolean boolean31 = clientServices5.bookParkingSpace(booking18);
        java.util.List<model.booking.Booking> bookingList32 = clientServices5.getAllBookings();
        bookingRepository3.updateBookings(bookingList32);
        java.util.ArrayList<model.booking.Booking> bookingList34 = bookingRepository3.getAllBookings();
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(userRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(clientServices5);
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "There is no Such Parking Lot" + "'", str11, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Space 100 is already disabled." + "'", str14, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertNull(booking16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertNotNull(bookingList34);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        boolean boolean31 = clientServices0.updateBooking((int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str9, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(booking28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        booking2.setCost((double) 0.0f);
        java.lang.String str8 = booking2.getStatus();
        int int9 = booking2.getTotalHours();
        booking2.setCost((double) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-87), (int) (byte) 0);
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "There is no Such Parking Lot" + "'", str5, "There is no Such Parking Lot");
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "There is no Such Parking Lot" + "'", str10, "There is no Such Parking Lot");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.lang.String str5 = booking0.toString();
        booking0.setStatus("wMB&=eDYD");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student" + "'", str5, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7);
        facultyMember11.setFacultyName("Parking Space 97 is already disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 10, "fnoK1s5im");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        services.UserService userService12 = new services.UserService();
        boolean boolean14 = userService12.isStrongPassword("NonFacultyStaff");
        boolean boolean16 = userService12.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository17 = userService12.userRepository;
        model.user.Credentials credentials18 = null;
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials18, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        userRepository17.addUser((model.user.User) nonFacultyStaff20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = userService0.registerUser((model.user.User) nonFacultyStaff20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.Credentials.equals(Object)\" because the return value of \"model.user.User.getCredentials()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userRepository5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userRepository17);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        strategy.NonFacultyParkingRate nonFacultyParkingRate0 = new strategy.NonFacultyParkingRate();
        double double2 = nonFacultyParkingRate0.calculateRate((double) (byte) 0);
        double double4 = nonFacultyParkingRate0.calculateRate(480.0d);
        double double6 = nonFacultyParkingRate0.calculateRate(15.0d);
        double double8 = nonFacultyParkingRate0.calculateRate((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4800.0d + "'", double4 == 4800.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 150.0d + "'", double6 == 150.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository5 = repositoryProvider0.getBookingRepository();
        repo.RepositoryProvider repositoryProvider6 = new repo.RepositoryProvider();
        repo.UserRepository userRepository7 = repositoryProvider6.getUserRepository();
        repo.BookingRepository bookingRepository8 = repositoryProvider6.getBookingRepository();
        repo.BookingRepository bookingRepository9 = repositoryProvider6.getBookingRepository();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.User user16 = new model.user.User(credentials13);
        repo.BookingRepository bookingRepository17 = new repo.BookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList18 = bookingRepository17.getAllBookings();
        repo.BookingRepository bookingRepository19 = new repo.BookingRepository();
        model.booking.Booking booking20 = new model.booking.Booking();
        int int21 = booking20.getStartTime();
        booking20.setEndTime((int) (short) 10);
        java.lang.String str24 = booking20.getEmail();
        model.booking.Booking booking25 = new model.booking.Booking();
        int int26 = booking25.getStartTime();
        booking25.setEndTime((int) (short) 10);
        java.lang.String str29 = booking25.getEmail();
        booking25.setCost((double) (byte) 0);
        model.booking.Booking booking32 = new model.booking.Booking();
        int int33 = booking32.getStartTime();
        int int34 = booking32.getId();
        booking32.setEndTime((int) 'a');
        model.booking.Booking booking37 = new model.booking.Booking();
        int int38 = booking37.getStartTime();
        booking37.setEndTime((int) (short) 10);
        java.lang.String str41 = booking37.getEmail();
        booking37.setCost((double) (byte) 0);
        int int44 = booking37.getLotId();
        booking37.setEmail("Manager");
        model.booking.Booking booking47 = new model.booking.Booking();
        int int48 = booking47.getStartTime();
        int int49 = booking47.getId();
        model.booking.Booking booking50 = new model.booking.Booking();
        int int51 = booking50.getStartTime();
        int int52 = booking50.getId();
        booking50.setEndTime((int) 'a');
        model.booking.Booking booking55 = new model.booking.Booking();
        int int56 = booking55.getStartTime();
        booking55.setEndTime((int) (short) 10);
        booking55.setCost((double) (short) 100);
        model.booking.Booking[] bookingArray61 = new model.booking.Booking[] { booking20, booking25, booking32, booking37, booking47, booking50, booking55 };
        java.util.ArrayList<model.booking.Booking> bookingList62 = new java.util.ArrayList<model.booking.Booking>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<model.booking.Booking>) bookingList62, bookingArray61);
        bookingRepository19.updateBookings((java.util.List<model.booking.Booking>) bookingList62);
        bookingRepository17.updateBookings((java.util.List<model.booking.Booking>) bookingList62);
        services.ClientServices clientServices66 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot68 = clientServices66.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList69 = clientServices66.getAllLocations();
        java.util.List<model.booking.Booking> bookingList70 = clientServices66.getAllBookings();
        bookingRepository17.updateBookings(bookingList70);
        boolean boolean72 = credentials13.equals((java.lang.Object) bookingRepository17);
        java.util.ArrayList<model.booking.Booking> bookingList73 = bookingRepository17.getAllBookings();
        bookingRepository9.updateBookings((java.util.List<model.booking.Booking>) bookingList73);
        bookingRepository5.updateBookings((java.util.List<model.booking.Booking>) bookingList73);
        java.util.ArrayList<model.booking.Booking> bookingList76 = bookingRepository5.getAllBookings();
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(bookingRepository2);
        org.junit.Assert.assertNotNull(bookingRepository3);
        org.junit.Assert.assertNotNull(userRepository4);
        org.junit.Assert.assertNotNull(bookingRepository5);
        org.junit.Assert.assertNotNull(userRepository7);
        org.junit.Assert.assertNotNull(bookingRepository8);
        org.junit.Assert.assertNotNull(bookingRepository9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credentials{login='hi!', password='hi!', type='hi!'}" + "'", str15, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(bookingArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(clientServices66);
        org.junit.Assert.assertNull(parkingLot68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(bookingList70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(bookingList73);
        org.junit.Assert.assertNotNull(bookingList76);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.User user1 = null;
        userRepository0.removeUser(user1);
        model.user.User user3 = null;
        userRepository0.removeUser(user3);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        strategy.StudentParkingRate studentParkingRate0 = new strategy.StudentParkingRate();
        double double2 = studentParkingRate0.calculateRate(100.0d);
        double double4 = studentParkingRate0.calculateRate((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 500.0d + "'", double2 == 500.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        boolean boolean2 = parkingSpace1.hasBooking();
        parkingSpace1.setStatus(false);
        model.booking.Booking booking5 = parkingSpace1.getBooking();
        java.lang.String str6 = parkingSpace1.disableParkingSpace();
        int int7 = parkingSpace1.getSpaceID();
        boolean boolean8 = parkingSpace1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Space 32 is already disabled." + "'", str6, "Parking Space 32 is already disabled.");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        model.user.Client client3 = new model.user.Client("HGL)]pX%+", "Success: Parking Lot -1 has been enabled.", "Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        boolean boolean2 = parkingSpace1.hasBooking();
        parkingSpace1.setSpaceID((int) '#');
        java.lang.String str5 = parkingSpace1.enableParkingSpace();
        boolean boolean6 = parkingSpace1.getStatus();
        model.sensor.Sensor sensor7 = parkingSpace1.getSensor();
        parkingSpace1.setSpaceID((int) (short) 0);
        java.lang.String str10 = parkingSpace1.disableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 35 is already enabled." + "'", str5, "Parking Space 35 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sensor7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Success: Parking Space 0 has been disabled." + "'", str10, "Success: Parking Space 0 has been disabled.");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("qS46Qm6yT");
        boolean boolean13 = superManagerServices0.isStrongPassword("Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(superManagerServices0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.Student student12 = new model.user.Student(credentials9);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(0);
        boolean boolean2 = parkingSpace1.hasBooking();
        boolean boolean3 = parkingSpace1.hasBooking();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        model.parking.ParkingLot parkingLot14 = clientServices0.getParkingLotByAddress("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        boolean boolean17 = clientServices0.updateBooking(10, 97);
        java.lang.String str20 = clientServices0.getParkingSpaceById((int) '#', (-87));
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "There is no Such Parking Lot" + "'", str6, "There is no Such Parking Lot");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 100 is already disabled." + "'", str9, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "There is no Such Parking Lot" + "'", str20, "There is no Such Parking Lot");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        boolean boolean7 = clientServices0.updateBooking(100, 97);
        model.parking.ParkingLot parkingLot9 = clientServices0.getParkingLotByAddress("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.parking.ParkingLot parkingLot11 = clientServices0.getParkingLotByAddress("HGL)]pX%+");
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(parkingLot9);
        org.junit.Assert.assertNull(parkingLot11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        nonFacultyStaff6.setRole("Qw$TanXAv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        nonFacultyStaff6.setRole("Parking Lot 97 is already enabled.");
        nonFacultyStaff6.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        boolean boolean13 = clientServices0.updateBooking((int) (byte) 100, 97);
        java.lang.String str16 = clientServices0.disableParkingSpaceById((int) (byte) 0, 97);
        model.parking.ParkingLot parkingLot18 = clientServices0.getParkingLotByAddress("(O3fsOXXJ");
        org.junit.Assert.assertNotNull(clientServices0);
        org.junit.Assert.assertNull(parkingLot2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Give Id for parking Space is wrong" + "'", str7, "Give Id for parking Space is wrong");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "There is no Such Parking Lot" + "'", str10, "There is no Such Parking Lot");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Success: Parking Space 97 has been disabled." + "'", str16, "Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertNull(parkingLot18);
    }
}

