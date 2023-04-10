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
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) -1, date1, (int) '#', (int) (short) 1, (int) 'a', (int) 'a', "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        model.sensor.Sensor sensor0 = new model.sensor.Sensor();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = constants.Constants.FACULTYMEMBER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FacultyMember" + "'", str0, "FacultyMember");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        model.user.Credentials credentials0 = null;
        model.user.Manager manager1 = new model.user.Manager(credentials0);
        manager1.validateAccount();
        java.lang.Class<?> wildcardClass3 = manager1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 0, date1, (int) (short) 0, (int) (byte) 10, (int) (short) 10, (int) (short) 10, "FacultyMember", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = constants.Constants.USER_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "users.json" + "'", str0, "users.json");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str0 = constants.Constants.SUPERMANAGER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SuperManager" + "'", str0, "SuperManager");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = constants.Constants.STUDENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Student" + "'", str0, "Student");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        strategy.NonFacultyParkingRate nonFacultyParkingRate0 = new strategy.NonFacultyParkingRate();
        java.lang.Class<?> wildcardClass1 = nonFacultyParkingRate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str0 = constants.Constants.NONFACULTYSTAFF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "NonFacultyStaff" + "'", str0, "NonFacultyStaff");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        java.lang.Class<?> wildcardClass4 = parkingSpace1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) 'a', date1, (int) (byte) 100, (int) ' ', (int) (byte) -1, (int) (byte) 1, "FacultyMember", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        repo.ParkingRepository parkingRepository0 = new repo.ParkingRepository();
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        strategy.StrategyHandler strategyHandler0 = new strategy.StrategyHandler();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str0 = constants.Constants.MANAGER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Manager" + "'", str0, "Manager");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "hi!");
        student2.setStudentId("FacultyMember");
        java.lang.String str5 = student2.getStudentId();
        student2.setStudentId("NonFacultyStaff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FacultyMember" + "'", str5, "FacultyMember");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        model.user.Credentials credentials0 = null;
        model.user.Student student1 = new model.user.Student(credentials0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        model.user.Credentials credentials0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.user.User user1 = model.user.UserFactory.createAccount(credentials0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.user.Credentials.getType()\" because \"credentials\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        model.user.Credentials credentials0 = null;
        model.user.Manager manager1 = new model.user.Manager(credentials0);
        model.user.Credentials credentials2 = manager1.getCredentials();
        boolean boolean3 = manager1.getValidationStatus();
        org.junit.Assert.assertNull(credentials2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (byte) 10, date1, (int) '#', (int) (short) 100, (int) (byte) -1, 0, "", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        model.user.Credentials credentials0 = null;
        model.user.Visitor visitor1 = new model.user.Visitor(credentials0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str0 = constants.Constants.VISITOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Visitor" + "'", str0, "Visitor");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("");
        java.util.Date date6 = null;
        booking0.setEndDateTime(date6);
        java.lang.String str8 = booking0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null" + "'", str8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(100, date1, 32, 32, 1, (int) ' ', "Success: Parking Space 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.Class<?> wildcardClass5 = parkingSpace1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        model.user.Client client3 = new model.user.Client("Visitor", "", "Success: Parking Space 100 has been disabled.");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        model.user.User user3 = new model.user.User("hi!", "hi!", "Student");
        java.lang.Class<?> wildcardClass4 = user3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(52, date1, 32, (int) ' ', (int) 'a', (int) 'a', "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null", "NonFacultyStaff");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(97, date1, 97, (int) (byte) 1, (int) '4', (int) (short) -1, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        facultyMember3.setFacultyId("Student");
        facultyMember3.setFacultyName("NonFacultyStaff");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        model.user.Client client3 = new model.user.Client("Success: Parking Space 32 has been enabled.", "Success: Parking Space 10 has been disabled.", "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        int int6 = booking0.getId();
        java.lang.Class<?> wildcardClass7 = booking0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (byte) 10, date1, 0, 100, 1, (int) (short) -1, "Parking Lot 10 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        model.user.Client client3 = new model.user.Client("NonFacultyStaff", "Visitor", "hi!");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        model.user.User user3 = new model.user.User("Parking Space 100 is already disabled.", "Parking Lot 10 is already disabled.", "NonFacultyStaff");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str6, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = nonFacultyStaff4.getRole();
        java.lang.String str6 = nonFacultyStaff4.getRole();
        java.lang.String str7 = nonFacultyStaff4.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getLotId();
        java.util.Date date4 = null;
        booking0.setStartDateTime(date4);
        int int6 = booking0.getStartTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Space 100 has been disabled.");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot(0, "users.json");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getParkingSpaces();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(32, date1, (int) (short) 100, (int) (short) 0, 32, 1, "Success: Parking Space 100 has been disabled.", "Parking Space 97 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 10, date1, 97, 32, 32, (int) (byte) -1, "", "Parking Lot 0 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        model.user.Credentials credentials0 = null;
        model.user.Manager manager1 = new model.user.Manager(credentials0);
        manager1.validateAccount();
        model.user.Credentials credentials3 = manager1.getCredentials();
        boolean boolean4 = manager1.getValidationStatus();
        model.user.Credentials credentials5 = manager1.getCredentials();
        org.junit.Assert.assertNull(credentials3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(credentials5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(false);
        int int8 = parkingSpace1.getSpaceID();
        java.lang.String str9 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Space 100 has been enabled." + "'", str9, "Success: Parking Space 100 has been enabled.");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.Student student10 = new model.user.Student(credentials3, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str8, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        model.user.User user3 = new model.user.User("Student", "users.json", "Manager");
        java.lang.Class<?> wildcardClass4 = user3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        java.lang.String str5 = facultyMember3.getFacultyName();
        facultyMember3.setFacultyId("SuperManager");
        boolean boolean8 = facultyMember3.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) ' ', date1, 97, (int) (byte) 100, 1, (int) (byte) 1, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}", "Success: Parking Lot 10 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Space 32 is already enabled." + "'", str12, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Visitor" + "'", str13, "Visitor");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str8, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        model.user.Credentials credentials3 = new model.user.Credentials("SuperManager", "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        boolean boolean5 = client4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        model.user.User user3 = new model.user.User("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}", "Success: Parking Space 32 has been disabled.", "Manager");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) '4', date1, 32, (int) (byte) 10, (int) (short) 1, (int) 'a', "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str8, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) '4', date1, 1, (int) (byte) 1, (int) '4', (int) (short) 100, "Success: Parking Lot 0 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        model.user.Client client3 = new model.user.Client("Student", "NonFacultyStaff", "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        booking0.setStartTime((int) '4');
        double double5 = booking0.getCost();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Space 32 is already enabled." + "'", str12, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        model.user.Credentials credentials0 = null;
        model.user.Manager manager1 = new model.user.Manager(credentials0);
        manager1.validateAccount();
        model.user.Credentials credentials3 = manager1.getCredentials();
        manager1.validateAccount();
        model.user.Credentials credentials5 = manager1.getCredentials();
        org.junit.Assert.assertNull(credentials3);
        org.junit.Assert.assertNull(credentials5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("");
        int int6 = booking0.getTotalHours();
        booking0.setId((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        model.user.Client client3 = new model.user.Client("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}", "Success: Parking Space 32 has been enabled.", "Parking Space 97 is already enabled.");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        model.user.UserFactory userFactory0 = new model.user.UserFactory();
        java.lang.Class<?> wildcardClass1 = userFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = nonFacultyStaff4.getRole();
        model.booking.Booking booking6 = new model.booking.Booking();
        booking6.setStatus("Success: Parking Space 100 has been disabled.");
        int int9 = booking6.getTotalHours();
        booking6.setStatus("NonFacultyStaff");
        booking6.setLicensePlate("NonFacultyStaff");
        java.util.Date date14 = null;
        booking6.setStartDateTime(date14);
        boolean boolean16 = nonFacultyStaff4.equals((java.lang.Object) booking6);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        model.user.Client client3 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "Success: Parking Lot -1 has been disabled.", "users.json");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        strategy.VisitorParkingRate visitorParkingRate0 = new strategy.VisitorParkingRate();
        double double2 = visitorParkingRate0.calculateRate(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str7, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "hi!");
        student2.validateAccount();
        student2.setStudentId("");
        student2.setStudentId("Success: Parking Space 32 has been disabled.");
        java.lang.Class<?> wildcardClass8 = student2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        booking0.setEmail("");
        int int6 = booking0.getLotId();
        java.util.Date date7 = booking0.getStartDateTime();
        java.util.Date date8 = null;
        booking0.setStartDateTime(date8);
        java.util.Date date10 = booking0.getEndDateTime();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) -1, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str3 = parkingLot2.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Success: Parking Lot -1 has been disabled." + "'", str3, "Success: Parking Lot -1 has been disabled.");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(1, date1, 52, 0, (int) '4', (-32), "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 32 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.Student student9 = new model.user.Student(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor" + "'", str8, "Visitor");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        facultyMember3.setFacultyId("Student");
        java.lang.String str6 = facultyMember3.getFacultyId();
        facultyMember3.setFacultyId("Parking Space 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        model.user.Client client3 = new model.user.Client("NonFacultyStaff", "Success: Parking Space 100 has been enabled.", "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str9, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        model.user.User user3 = new model.user.User("Success: Parking Space 10 has been disabled.", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}", "Parking Space -1 is already enabled.");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = facultyMember3.getFacultyName();
        facultyMember3.setFacultyName("Parking Space -1 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        model.user.Client client3 = new model.user.Client("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}", "", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        strategy.NonFacultyParkingRate nonFacultyParkingRate0 = new strategy.NonFacultyParkingRate();
        double double2 = nonFacultyParkingRate0.calculateRate((double) 1L);
        double double4 = nonFacultyParkingRate0.calculateRate(50.0d);
        double double6 = nonFacultyParkingRate0.calculateRate((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        java.lang.String str6 = booking0.getLicensePlate();
        int int7 = booking0.getSpaceId();
        java.util.Date date8 = booking0.getStartDateTime();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (byte) -1, date1, (int) (byte) 0, 52, (-35), 100, "Success: Parking Space 100 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        client7.validateAccount();
        boolean boolean9 = client7.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((-35), date1, 100, (-35), 32, (int) 'a', "Success: Parking Space 52 has been disabled.", "Success: Parking Space 10 has been enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(0, date1, 1, (int) (short) -1, (int) 'a', 0, "Parking Lot 52 is already enabled.", "Success: Parking Space 0 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 52 has been disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.util.Date date4 = booking0.getStartDateTime();
        int int5 = booking0.getEndTime();
        booking0.setStartTime(52);
        java.util.Date date8 = booking0.getDate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        model.user.Client client3 = new model.user.Client("Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "FacultyMember", "Visitor");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str5, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 0, date1, 52, (int) (byte) 100, (int) (byte) 100, 10, "Success: Parking Lot 10 has been disabled.", "Parking Space 0 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        model.user.Client client3 = new model.user.Client("Manager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 32 is already enabled." + "'", str9, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        java.lang.String str5 = parkingLot2.enableParkingLot();
        parkingLot2.setLocation("Success: Parking Space 10 has been enabled.");
        java.lang.String str8 = parkingLot2.enableParkingLot();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 0 is already enabled." + "'", str5, "Parking Lot 0 is already enabled.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Lot 0 is already enabled." + "'", str8, "Parking Lot 0 is already enabled.");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.Client client14 = new model.user.Client(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Space 32 is already enabled." + "'", str12, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(false);
        model.sensor.Sensor sensor8 = parkingSpace1.getSensor();
        java.lang.String str9 = parkingSpace1.disableParkingSpace();
        model.booking.Booking booking10 = new model.booking.Booking();
        booking10.setCost((-1.0d));
        int int13 = booking10.getTotalHours();
        parkingSpace1.setBooking(booking10);
        int int15 = booking10.getSpaceId();
        java.util.Date date16 = booking10.getDate();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(sensor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 100 is already disabled." + "'", str9, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        visitor10.validateAccount();
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        model.user.Client client3 = new model.user.Client("Parking Space 100 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ", "Success: Parking Lot 100 has been disabled.");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "hi!");
        student2.setStudentId("FacultyMember");
        java.lang.String str5 = student2.getStudentId();
        student2.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FacultyMember" + "'", str5, "FacultyMember");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Lot 0 has been enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        nonFacultyStaff6.setRole("FacultyMember");
        nonFacultyStaff6.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(false);
        model.sensor.Sensor sensor8 = parkingSpace1.getSensor();
        model.sensor.Sensor sensor9 = parkingSpace1.getSensor();
        java.lang.String str10 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(sensor8);
        org.junit.Assert.assertNotNull(sensor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Success: Parking Space 100 has been enabled." + "'", str10, "Success: Parking Space 100 has been enabled.");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        model.user.User user3 = new model.user.User("SuperManager", "Parking Lot 0 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        java.lang.String str2 = parkingSpace1.disableParkingSpace();
        model.sensor.Sensor sensor3 = parkingSpace1.getSensor();
        parkingSpace1.setStatus(true);
        parkingSpace1.setSpaceID((-32));
        java.lang.Class<?> wildcardClass8 = parkingSpace1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str2, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(sensor3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        model.user.Client client3 = new model.user.Client("Success: Parking Lot 0 has been enabled.", "Success: Parking Lot 100 has been disabled.", "Parking Lot 1 is already enabled.");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been enabled.");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Visitor" + "'", str10, "Visitor");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        java.lang.String str7 = credentials3.getType();
        java.lang.Class<?> wildcardClass8 = credentials3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str7, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Client client11 = new model.user.Client("Success: Parking Lot 10 has been disabled.", "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        client11.validateAccount();
        boolean boolean13 = credentials3.equals((java.lang.Object) client11);
        boolean boolean14 = client11.getValidationStatus();
        boolean boolean15 = client11.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 1, date1, 100, (-1), (int) (short) 0, 52, "Success: Parking Space 10 has been enabled.", "Success: Parking Space 32 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        model.user.User user3 = new model.user.User("NonFacultyStaff", "Parking Space 100 is already disabled.", "Success: Parking Lot 0 has been disabled.");
        boolean boolean4 = user3.getValidationStatus();
        boolean boolean6 = user3.equals((java.lang.Object) "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        int int6 = booking0.getId();
        java.util.Date date7 = null;
        booking0.setStartDateTime(date7);
        int int9 = booking0.getId();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        repo.BookingRepository bookingRepository0 = new repo.BookingRepository();
        java.lang.Class<?> wildcardClass1 = bookingRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        java.util.Date date3 = booking0.getStartDateTime();
        booking0.setStartTime((int) (byte) -1);
        booking0.setStartTime((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = booking0.getClass();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(false);
        model.sensor.Sensor sensor8 = parkingSpace1.getSensor();
        java.lang.String str9 = parkingSpace1.disableParkingSpace();
        boolean boolean10 = parkingSpace1.getStatus();
        java.lang.String str11 = parkingSpace1.enableParkingSpace();
        int int12 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(sensor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 100 is already disabled." + "'", str9, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Success: Parking Space 100 has been enabled." + "'", str11, "Success: Parking Space 100 has been enabled.");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) 10);
        parkingSpace1.setSpaceID((int) ' ');
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        java.lang.Class<?> wildcardClass9 = nonFacultyStaff6.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = nonFacultyStaff4.getRole();
        java.lang.String str6 = nonFacultyStaff4.getRole();
        nonFacultyStaff4.setRole("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 10);
        parkingLot2.setLotID((int) (short) -1);
        boolean boolean14 = parkingLot2.getStatus();
        java.lang.String str15 = parkingLot2.disableParkingLot();
        parkingLot2.setLotID((int) (byte) -1);
        java.lang.String str18 = parkingLot2.getLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Success: Parking Lot -1 has been disabled." + "'", str15, "Success: Parking Lot -1 has been disabled.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        model.user.Client client3 = new model.user.Client("", "", "SuperManager");
        model.booking.Booking booking4 = new model.booking.Booking();
        booking4.setStatus("Success: Parking Space 100 has been disabled.");
        int int7 = booking4.getEndTime();
        java.util.Date date8 = booking4.getStartDateTime();
        booking4.setCost((double) (short) 1);
        int int11 = booking4.getId();
        boolean boolean12 = client3.equals((java.lang.Object) booking4);
        int int13 = booking4.getTotalHours();
        booking4.setEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str16 = booking4.getStatus();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str16, "Success: Parking Space 100 has been disabled.");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setSpaceID((-1));
        model.sensor.Sensor sensor5 = parkingSpace1.getSensor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 32 is already enabled." + "'", str2, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertNotNull(sensor5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "hi!");
        student2.validateAccount();
        student2.setStudentId("NonFacultyStaff");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        model.user.User user3 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("NonFacultyStaff");
        java.lang.String str6 = booking0.getEmail();
        booking0.setLicensePlate("SuperManager");
        java.lang.String str9 = booking0.toString();
        java.lang.String str10 = booking0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null" + "'", str9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null" + "'", str10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 0, date1, 10, (int) '#', (-35), (int) (byte) 100, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str8, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 32 is already enabled." + "'", str9, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str10, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Space 100 has been disabled.", "hi!");
        model.user.User user4 = model.user.UserFactory.createAccount(credentials3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = user4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        model.user.Client client3 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 10 has been disabled.", "Parking Lot 1 is already enabled.");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((-35), "Parking Lot 1 is already enabled.");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(10, date1, (int) (byte) -1, (int) (short) 100, (int) (byte) 100, 52, "Success: Parking Space 97 has been disabled.", "Success: Parking Lot -1 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        model.user.User user3 = new model.user.User("Success: Parking Lot 10 has been enabled.", "Parking Lot 10 is already disabled.", "Success: Parking Space 10 has been disabled.");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("");
        int int6 = booking0.getTotalHours();
        booking0.setStatus("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        booking0.setEndTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(97, date1, (int) (short) 0, (-35), 100, (int) '#', "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setCost((-1.0d));
        int int3 = booking0.getTotalHours();
        booking0.setCost((double) 0L);
        java.lang.Class<?> wildcardClass6 = booking0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        facultyMember6.validateAccount();
        java.lang.String str8 = facultyMember6.getFacultyName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getLotId();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        booking0.setStartTime(0);
        int int8 = booking0.getEndTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = facultyMember11.getFacultyId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyName();
        java.lang.String str8 = facultyMember3.getFacultyId();
        facultyMember3.setFacultyId("Manager");
        boolean boolean11 = facultyMember3.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str7, "Success: Parking Lot 10 has been disabled.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials3);
        client15.validateAccount();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        model.user.SuperManager superManager0 = model.user.SuperManager.getInstance();
        java.lang.Object obj1 = null;
        boolean boolean2 = superManager0.equals(obj1);
        superManager0.validateAccount();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        java.lang.String str5 = parkingLot2.enableParkingLot();
        boolean boolean6 = parkingLot2.getStatus();
        java.lang.String str7 = parkingLot2.disableParkingLot();
        parkingLot2.setLocation("Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 0 is already enabled." + "'", str5, "Parking Lot 0 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str7, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "Success: Parking Lot 0 has been disabled.");
        model.user.Credentials credentials3 = null;
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Student", "");
        boolean boolean7 = facultyMember6.getValidationStatus();
        facultyMember6.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str10 = facultyMember6.getFacultyId();
        java.lang.String str11 = facultyMember6.getFacultyId();
        boolean boolean12 = student2.equals((java.lang.Object) str11);
        student2.setStudentId("Parking Lot -1 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        model.user.User user3 = new model.user.User("users.json", "Parking Lot 0 is already enabled.", "Parking Space 100 is already disabled.");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyId();
        facultyMember3.validateAccount();
        facultyMember3.setFacultyId("hi!");
        facultyMember3.setFacultyName("Manager");
        facultyMember3.setFacultyId("Success: Parking Space -1 has been enabled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 10);
        parkingLot2.setLotID((int) (short) -1);
        java.util.List<model.parking.ParkingSpace> parkingSpaceList14 = parkingLot2.getParkingSpaces();
        java.lang.String str15 = parkingLot2.enableParkingLot();
        java.lang.String str16 = parkingLot2.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Lot -1 is already enabled." + "'", str15, "Parking Lot -1 is already enabled.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Lot -1 is already enabled." + "'", str16, "Parking Lot -1 is already enabled.");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 10);
        java.lang.String str12 = parkingLot2.disableParkingLot();
        parkingLot2.setLocation("Success: Parking Space 32 has been disabled.");
        boolean boolean15 = parkingLot2.getStatus();
        parkingLot2.setLotID(10);
        java.lang.String str18 = parkingLot2.getLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str12, "Success: Parking Lot 10 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Success: Parking Space 32 has been disabled." + "'", str18, "Success: Parking Space 32 has been disabled.");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "Visitor");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        java.lang.String str5 = parkingLot2.enableParkingLot();
        boolean boolean6 = parkingLot2.getStatus();
        parkingLot2.setLotID((-32));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 0 is already enabled." + "'", str5, "Parking Lot 0 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "Success: Parking Lot 0 has been disabled.");
        java.lang.String str3 = student2.getStudentId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str3, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 52 has been disabled.");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Visitor" + "'", str15, "Visitor");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        model.user.User user3 = new model.user.User("Parking Space 10 is already enabled.", "Success: Parking Space -1 has been enabled.", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(32, date1, (int) (byte) 100, 0, (int) (byte) 10, (int) 'a', "Success: Parking Lot 97 has been disabled.", "Manager");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        model.user.Client client3 = new model.user.Client("Success: Parking Space 32 has been enabled.", "hi!", "Parking Lot 1 is already enabled.");
        model.user.Credentials credentials7 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student9 = new model.user.Student(credentials7, "");
        strategy.VisitorParkingRate visitorParkingRate10 = new strategy.VisitorParkingRate();
        double double12 = visitorParkingRate10.calculateRate(1.0d);
        double double14 = visitorParkingRate10.calculateRate((double) (byte) 100);
        boolean boolean15 = credentials7.equals((java.lang.Object) visitorParkingRate10);
        java.lang.String str16 = credentials7.toString();
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials7, "Parking Lot 1 is already enabled.", "Parking Space -1 is already enabled.");
        boolean boolean20 = client3.equals((java.lang.Object) "Parking Lot 1 is already enabled.");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1500.0d + "'", double14 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str16, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 0, date1, (-35), 100, (int) '4', (int) '4', "Success: Parking Space 100 has been enabled.", "Parking Space 0 is already disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) '#', date1, (int) (short) 0, 52, (int) '#', (int) 'a', "Parking Space 97 is already enabled.", "Success: Parking Lot 10 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("NonFacultyStaff");
        java.lang.String str6 = booking0.getEmail();
        java.util.Date date7 = null;
        booking0.setStartDateTime(date7);
        booking0.setEndTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        model.user.User user3 = new model.user.User("FacultyMember", "NonFacultyStaff", "Student");
        user3.validateAccount();
        java.lang.Class<?> wildcardClass5 = user3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.lang.String str4 = booking0.getStatus();
        java.lang.String str5 = booking0.toString();
        java.lang.String str6 = booking0.getEmail();
        int int7 = booking0.getTotalHours();
        java.util.Date date8 = booking0.getStartDateTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str4, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null" + "'", str5, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) 0);
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        boolean boolean3 = parkingSpace1.getStatus();
        model.booking.Booking booking4 = parkingSpace1.getBooking();
        boolean boolean5 = parkingSpace1.getStatus();
        model.sensor.Sensor sensor6 = parkingSpace1.getSensor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 0 is already enabled." + "'", str2, "Parking Space 0 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(booking4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sensor6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot(0, "users.json");
        java.lang.String str3 = parkingLot2.enableParkingLot();
        parkingLot2.setLocation("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Parking Lot 0 is already enabled." + "'", str3, "Parking Lot 0 is already enabled.");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList10 = parkingLot2.getParkingSpaces();
        parkingLot2.setLocation("Parking Space 0 is already enabled.");
        parkingLot2.setLocation("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        int int15 = parkingLot2.getLotID();
        java.lang.String str16 = parkingLot2.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Success: Parking Lot 97 has been disabled." + "'", str16, "Success: Parking Lot 97 has been disabled.");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user15 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        double double6 = booking0.getCost();
        java.lang.String str7 = booking0.getLicensePlate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        java.lang.String str6 = facultyMember5.getFacultyName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}" + "'", str4, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (byte) -1, date1, (-1), 1, (int) (byte) -1, (-32), "Parking Lot 0 is already enabled.", "Parking Space 32 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        java.lang.String str10 = parkingLot2.getLocation();
        parkingLot2.setLocation("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) 'a');
        parkingSpace1.setStatus(true);
        java.lang.String str4 = parkingSpace1.enableParkingSpace();
        model.booking.Booking booking5 = new model.booking.Booking();
        booking5.setEmail("SuperManager");
        double double8 = booking5.getCost();
        java.util.Date date9 = booking5.getEndDateTime();
        java.lang.String str10 = booking5.getEmail();
        java.util.Date date11 = null;
        booking5.setStartDateTime(date11);
        int int13 = booking5.getStartTime();
        int int14 = booking5.getTotalHours();
        parkingSpace1.setBooking(booking5);
        java.util.Date date16 = booking5.getEndDateTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Space 97 is already enabled." + "'", str4, "Parking Space 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = facultyMember9.getFacultyId();
        facultyMember9.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        java.lang.String str6 = booking0.getLicensePlate();
        int int7 = booking0.getSpaceId();
        int int8 = booking0.getId();
        int int9 = booking0.getStartTime();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.lang.String str4 = booking0.getStatus();
        int int5 = booking0.getTotalHours();
        double double6 = booking0.getCost();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str4, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStartTime(0);
        java.util.Date date3 = booking0.getStartDateTime();
        int int4 = booking0.getLotId();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setCost((-1.0d));
        int int3 = booking0.getTotalHours();
        booking0.setEndTime((int) 'a');
        booking0.setLicensePlate("Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(false);
        model.sensor.Sensor sensor8 = parkingSpace1.getSensor();
        java.lang.String str9 = parkingSpace1.disableParkingSpace();
        model.booking.Booking booking10 = new model.booking.Booking();
        booking10.setCost((-1.0d));
        int int13 = booking10.getTotalHours();
        parkingSpace1.setBooking(booking10);
        int int15 = booking10.getSpaceId();
        booking10.setLicensePlate("users.json");
        booking10.setEndTime((-1));
        int int20 = booking10.getTotalHours();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(sensor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 100 is already disabled." + "'", str9, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "Parking Lot 0 is already disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}" + "'", str4, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 0 is already enabled." + "'", str5, "Parking Space 0 is already enabled.");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        model.user.Client client3 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        facultyMember3.setFacultyId("Student");
        facultyMember3.setFacultyName("Parking Space 0 is already enabled.");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        model.user.User user3 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ", "Success: Parking Space 10 has been enabled.", "Parking Space 0 is already enabled.");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        strategy.StudentParkingRate studentParkingRate0 = new strategy.StudentParkingRate();
        double double2 = studentParkingRate0.calculateRate((double) (-1.0f));
        double double4 = studentParkingRate0.calculateRate((double) '4');
        double double6 = studentParkingRate0.calculateRate(1000.0d);
        double double8 = studentParkingRate0.calculateRate((double) 97);
        double double10 = studentParkingRate0.calculateRate((double) (byte) 1);
        double double12 = studentParkingRate0.calculateRate(150.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.0d) + "'", double2 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 260.0d + "'", double4 == 260.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5000.0d + "'", double6 == 5000.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 485.0d + "'", double8 == 485.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 750.0d + "'", double12 == 750.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        nonFacultyStaff6.setRole("FacultyMember");
        nonFacultyStaff6.setRole("Parking Lot -1 is already enabled.");
        java.lang.String str12 = nonFacultyStaff6.getRole();
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Lot -1 is already enabled." + "'", str12, "Parking Lot -1 is already enabled.");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        boolean boolean6 = parkingSpace1.hasBooking();
        boolean boolean7 = parkingSpace1.hasBooking();
        java.lang.String str8 = parkingSpace1.disableParkingSpace();
        java.lang.Class<?> wildcardClass9 = parkingSpace1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Space 100 is already disabled." + "'", str8, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        java.util.Date date3 = booking0.getStartDateTime();
        booking0.setStartTime((int) (byte) -1);
        booking0.setStartTime((int) (byte) -1);
        java.util.Date date8 = booking0.getDate();
        java.lang.String str9 = booking0.getEmail();
        int int10 = booking0.getId();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SuperManager" + "'", str9, "SuperManager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(10);
        boolean boolean2 = parkingSpace1.getStatus();
        boolean boolean3 = parkingSpace1.hasBooking();
        java.lang.String str4 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Space 10 is already enabled." + "'", str4, "Parking Space 10 is already enabled.");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (byte) 100, date1, 0, 32, (int) 'a', 10, "Success: Parking Space 100 has been enabled.", "Success: Parking Lot -1 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot(100, "Parking Space 97 is already enabled.");
        java.lang.String str3 = parkingLot2.disableParkingLot();
        java.lang.String str4 = parkingLot2.getLocation();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList5 = parkingLot2.getParkingSpaces();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Success: Parking Lot 100 has been disabled." + "'", str3, "Success: Parking Lot 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Space 97 is already enabled." + "'", str4, "Parking Space 97 is already enabled.");
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Visitor visitor11 = new model.user.Visitor(credentials3);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 1 has been disabled.");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str8, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 32 is already enabled." + "'", str9, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str10, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str11, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        java.lang.String str2 = parkingSpace1.disableParkingSpace();
        model.sensor.Sensor sensor3 = parkingSpace1.getSensor();
        boolean boolean4 = parkingSpace1.hasBooking();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str2, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(sensor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(0, date1, (int) (short) 10, 100, 32, (int) (byte) 0, "Success: Parking Lot 0 has been disabled.", "Success: Parking Space 52 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 0, date1, (int) (byte) 100, (int) '#', (-1), (int) (byte) 10, "Parking Space 32 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str5, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setSpaceID((-1));
        int int5 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 32 is already enabled." + "'", str2, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str8, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 32 is already enabled." + "'", str9, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str10, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 1, date1, (int) (byte) 1, (int) (byte) 1, (int) '#', 32, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}", "Success: Parking Space 1 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        booking0.setEmail("");
        java.lang.String str6 = booking0.getStatus();
        booking0.setStatus("Success: Parking Lot 10 has been enabled.");
        booking0.setLicensePlate("");
        int int11 = booking0.getLotId();
        java.util.Date date12 = booking0.getStartDateTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str6, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) '#', date1, (int) (byte) 100, (int) '#', (-1), 100, "Success: Parking Space 100 has been enabled.", "Parking Lot 52 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        model.user.Credentials credentials3 = new model.user.Credentials("", "Success: Parking Lot 0 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        SuperManager");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getSpaceId();
        booking0.setStartTime((-35));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        java.lang.String str5 = facultyMember3.getFacultyName();
        facultyMember3.setFacultyId("Success: Parking Space 52 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        double double6 = booking0.getCost();
        java.util.Date date7 = null;
        booking0.setEndDateTime(date7);
        java.lang.String str9 = booking0.toString();
        java.lang.Class<?> wildcardClass10 = booking0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager" + "'", str9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        booking0.setEmail("");
        booking0.setEndTime((int) 'a');
        booking0.setStartTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Manager manager8 = new model.user.Manager(credentials7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 0);
        double double4 = facultyParkingRate0.calculateRate((double) (-32));
        double double6 = facultyParkingRate0.calculateRate(100.0d);
        double double8 = facultyParkingRate0.calculateRate(40000.0d);
        double double10 = facultyParkingRate0.calculateRate((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-256.0d) + "'", double4 == (-256.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 800.0d + "'", double6 == 800.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 320000.0d + "'", double8 == 320000.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        model.user.Credentials credentials0 = null;
        model.user.NonFacultyStaff nonFacultyStaff1 = new model.user.NonFacultyStaff(credentials0);
        nonFacultyStaff1.setRole("Success: Parking Space 100 has been enabled.");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) '4', "Parking Space 0 is already enabled.");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (byte) 1, date1, (int) (short) -1, 1, (int) (byte) 0, 100, "Success: Parking Space 32 has been enabled.", "Success: Parking Space -1 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        model.user.Credentials credentials3 = new model.user.Credentials("Student", "Parking Space -1 is already enabled.", "Parking Lot -1 is already enabled.");
        model.user.User user4 = new model.user.User(credentials3);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(false);
        int int8 = parkingSpace1.getSpaceID();
        boolean boolean9 = parkingSpace1.hasBooking();
        java.lang.String str10 = parkingSpace1.disableParkingSpace();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Space 100 is already disabled." + "'", str10, "Parking Space 100 is already disabled.");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setStatus(false);
        java.lang.String str5 = parkingSpace1.enableParkingSpace();
        java.lang.String str6 = parkingSpace1.enableParkingSpace();
        model.booking.Booking booking7 = new model.booking.Booking();
        booking7.setStatus("Success: Parking Space 100 has been disabled.");
        int int10 = booking7.getEndTime();
        java.util.Date date11 = booking7.getStartDateTime();
        java.util.Date date12 = booking7.getStartDateTime();
        double double13 = booking7.getCost();
        parkingSpace1.setBooking(booking7);
        booking7.setEmail("Success: Parking Lot 97 has been disabled.");
        java.lang.String str17 = booking7.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 32 is already enabled." + "'", str2, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 32 has been enabled." + "'", str5, "Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Space 32 is already enabled." + "'", str6, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str17, "Success: Parking Space 100 has been disabled.");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setStatus(false);
        java.lang.String str5 = parkingSpace1.enableParkingSpace();
        java.lang.String str6 = parkingSpace1.enableParkingSpace();
        int int7 = parkingSpace1.getSpaceID();
        boolean boolean8 = parkingSpace1.hasBooking();
        model.sensor.Sensor sensor9 = parkingSpace1.getSensor();
        boolean boolean10 = parkingSpace1.hasBooking();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 32 is already enabled." + "'", str2, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 32 has been enabled." + "'", str5, "Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Space 32 is already enabled." + "'", str6, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sensor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(false);
        model.sensor.Sensor sensor8 = parkingSpace1.getSensor();
        java.lang.String str9 = parkingSpace1.disableParkingSpace();
        boolean boolean10 = parkingSpace1.getStatus();
        boolean boolean11 = parkingSpace1.getStatus();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(sensor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 100 is already disabled." + "'", str9, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str8, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("");
        java.lang.String str6 = booking0.toString();
        int int7 = booking0.getLotId();
        java.util.Date date8 = booking0.getDate();
        java.lang.Class<?> wildcardClass9 = booking0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null" + "'", str6, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getLogin();
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str8, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 32 is already enabled." + "'", str9, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Visitor" + "'", str10, "Visitor");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        java.lang.String str10 = parkingLot2.getLocation();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList11 = parkingLot2.getParkingSpaces();
        int int12 = parkingLot2.getLotID();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        java.lang.String str11 = credentials3.getLogin();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Visitor" + "'", str11, "Visitor");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Visitor" + "'", str10, "Visitor");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (byte) 100, date1, (int) 'a', 10, 0, (int) (byte) -1, "Success: Parking Space 52 has been enabled.", "Parking Lot 97 is already disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) -1, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str3 = parkingLot2.getLocation();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager" + "'", str3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        facultyMember3.setFacultyId("Student");
        java.lang.String str6 = facultyMember3.getFacultyId();
        facultyMember3.validateAccount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(false);
        parkingSpace1.setSpaceID((int) (byte) -1);
        java.lang.String str10 = parkingSpace1.enableParkingSpace();
        model.sensor.Sensor sensor11 = parkingSpace1.getSensor();
        java.lang.Class<?> wildcardClass12 = sensor11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Success: Parking Space -1 has been enabled." + "'", str10, "Success: Parking Space -1 has been enabled.");
        org.junit.Assert.assertNotNull(sensor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        model.user.User user3 = new model.user.User("Manager", "Success: Parking Lot 0 has been enabled.", "Visitor");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        model.user.Client client3 = new model.user.Client("Success: Parking Space 10 has been enabled.", "Parking Space 10 is already enabled.", "Parking Lot 52 is already enabled.");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        strategy.StudentParkingRate studentParkingRate0 = new strategy.StudentParkingRate();
        double double2 = studentParkingRate0.calculateRate((double) (-1.0f));
        double double4 = studentParkingRate0.calculateRate((double) 0L);
        double double6 = studentParkingRate0.calculateRate((double) (short) 10);
        double double8 = studentParkingRate0.calculateRate(1300.0d);
        double double10 = studentParkingRate0.calculateRate((double) 0);
        double double12 = studentParkingRate0.calculateRate(3328.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.0d) + "'", double2 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6500.0d + "'", double8 == 6500.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 16640.0d + "'", double12 == 16640.0d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyName();
        java.lang.String str8 = facultyMember3.getFacultyId();
        facultyMember3.setFacultyId("Manager");
        facultyMember3.setFacultyName("Success: Parking Space 100 has been enabled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str7, "Success: Parking Lot 10 has been disabled.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("NonFacultyStaff");
        booking0.setLicensePlate("NonFacultyStaff");
        java.util.Date date8 = null;
        booking0.setStartDateTime(date8);
        booking0.setEmail("Parking Space 0 is already enabled.");
        int int12 = booking0.getLotId();
        java.lang.String str13 = booking0.getLicensePlate();
        booking0.setStartTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NonFacultyStaff" + "'", str13, "NonFacultyStaff");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("");
        java.lang.String str6 = booking0.toString();
        int int7 = booking0.getLotId();
        int int8 = booking0.getSpaceId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null" + "'", str6, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        strategy.StudentParkingRate studentParkingRate0 = new strategy.StudentParkingRate();
        double double2 = studentParkingRate0.calculateRate(0.0d);
        double double4 = studentParkingRate0.calculateRate((double) (short) 10);
        double double6 = studentParkingRate0.calculateRate((-2560.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-12800.0d) + "'", double6 == (-12800.0d));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        java.lang.String str5 = facultyMember4.getFacultyId();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(32, date1, 0, (int) (short) 1, (-32), (int) (byte) 10, "Parking Lot -1 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "Success: Parking Space 32 has been enabled.");
        parkingLot2.setLotID(0);
        java.lang.String str5 = parkingLot2.getLocation();
        parkingLot2.setLotID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 32 has been enabled." + "'", str5, "Success: Parking Space 32 has been enabled.");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        double double6 = booking0.getCost();
        java.util.Date date7 = null;
        booking0.setEndDateTime(date7);
        booking0.setId(97);
        java.lang.String str11 = booking0.getLicensePlate();
        java.lang.String str12 = booking0.getLicensePlate();
        booking0.setEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "hi!");
        student2.setStudentId("FacultyMember");
        model.user.Credentials credentials5 = student2.getCredentials();
        java.lang.String str6 = student2.getStudentId();
        student2.setStudentId("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FacultyMember" + "'", str6, "FacultyMember");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setSpaceID((-1));
        model.booking.Booking booking5 = parkingSpace1.getBooking();
        java.lang.String str6 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 32 is already enabled." + "'", str2, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Space -1 is already enabled." + "'", str6, "Parking Space -1 is already enabled.");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.util.Date date4 = booking0.getStartDateTime();
        java.util.Date date5 = booking0.getStartDateTime();
        booking0.setStatus("hi!");
        double double8 = booking0.getCost();
        java.util.Date date9 = booking0.getEndDateTime();
        int int10 = booking0.getStartTime();
        java.util.Date date11 = booking0.getDate();
        booking0.setStartTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyId();
        java.lang.String str8 = facultyMember3.getFacultyId();
        java.lang.String str9 = facultyMember3.getFacultyName();
        facultyMember3.setFacultyId("Success: Parking Space 100 has been enabled.");
        java.lang.String str12 = facultyMember3.getFacultyName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str9, "Success: Parking Lot 10 has been disabled.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str12, "Success: Parking Lot 10 has been disabled.");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (byte) 10, date1, 32, (-32), (int) ' ', 0, "Parking Lot 0 is already disabled.", "Parking Lot 100 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        model.user.Client client3 = new model.user.Client("Visitor", "Student", "NonFacultyStaff");
        client3.validateAccount();
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        java.lang.String str9 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor" + "'", str8, "Visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str9, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Parking Space 100 is already disabled.", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        java.lang.String str12 = credentials3.getType();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor" + "'", str8, "Visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str12, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 10, date1, 10, (-1), (-1), (int) (byte) 0, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Success: Parking Space 32 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 1, date1, 52, (int) '4', 10, (int) (byte) 10, "Parking Space 100 is already enabled.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str6, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        strategy.StudentParkingRate studentParkingRate0 = new strategy.StudentParkingRate();
        double double2 = studentParkingRate0.calculateRate((double) (-1.0f));
        double double4 = studentParkingRate0.calculateRate((double) 0L);
        double double6 = studentParkingRate0.calculateRate(12500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.0d) + "'", double2 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 62500.0d + "'", double6 == 62500.0d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        model.user.Client client3 = new model.user.Client("Parking Lot 0 is already enabled.", "Parking Space 32 is already disabled.", "Parking Lot 10 is already disabled.");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) ' ', date1, (int) (byte) -1, (-35), 1, 0, "Student", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}'\ncost           -1.0\nstatus         null'\nemail        Parking Space 0 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str6, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((-32), "Parking Space 32 is already enabled.");
        parkingLot2.setLotID(10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.util.Date date4 = booking0.getStartDateTime();
        java.util.Date date5 = booking0.getStartDateTime();
        booking0.setStatus("hi!");
        booking0.setEmail("Parking Space 32 is already enabled.");
        booking0.setEndTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 10, "Success: Parking Space 32 has been disabled.");
        java.lang.Class<?> wildcardClass3 = parkingLot2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        model.user.Client client3 = new model.user.Client("", "", "SuperManager");
        model.booking.Booking booking4 = new model.booking.Booking();
        booking4.setStatus("Success: Parking Space 100 has been disabled.");
        int int7 = booking4.getEndTime();
        java.util.Date date8 = booking4.getStartDateTime();
        booking4.setCost((double) (short) 1);
        int int11 = booking4.getId();
        boolean boolean12 = client3.equals((java.lang.Object) booking4);
        java.util.Date date13 = booking4.getEndDateTime();
        java.lang.String str14 = booking4.getEmail();
        java.lang.String str15 = booking4.toString();
        java.lang.String str16 = booking4.getLicensePlate();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null" + "'", str15, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = facultyMember9.getFacultyId();
        facultyMember9.setFacultyName("Success: Parking Space 52 has been enabled.");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        java.lang.String str10 = credentials9.getPassword();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(credentials9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Space 32 is already enabled." + "'", str10, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Client client7 = new model.user.Client(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str6, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        model.user.Credentials credentials3 = new model.user.Credentials("FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 35 has been disabled.");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) 'a', "Success: Parking Space 32 has been disabled.");
        parkingLot2.setLotID((int) ' ');
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        SuperManager");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str8, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 32 is already enabled." + "'", str9, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Visitor" + "'", str10, "Visitor");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        booking0.setId((int) (byte) 0);
        booking0.setCost((-40.0d));
        java.util.Date date7 = booking0.getEndDateTime();
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        model.user.User user3 = new model.user.User("Success: Parking Space 35 has been disabled.", "Success: Parking Lot 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str5, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 52 has been disabled.");
        java.lang.String str18 = nonFacultyStaff17.getRole();
        java.lang.String str19 = nonFacultyStaff17.getRole();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Visitor" + "'", str15, "Visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Success: Parking Space 52 has been disabled." + "'", str18, "Success: Parking Space 52 has been disabled.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Success: Parking Space 52 has been disabled." + "'", str19, "Success: Parking Space 52 has been disabled.");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        strategy.VisitorParkingRate visitorParkingRate0 = new strategy.VisitorParkingRate();
        double double2 = visitorParkingRate0.calculateRate(1.0d);
        double double4 = visitorParkingRate0.calculateRate((double) 0);
        double double6 = visitorParkingRate0.calculateRate((-40.0d));
        double double8 = visitorParkingRate0.calculateRate((double) 52);
        double double10 = visitorParkingRate0.calculateRate(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-600.0d) + "'", double6 == (-600.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 780.0d + "'", double8 == 780.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.Student student7 = new model.user.Student(credentials4);
        org.junit.Assert.assertNotNull(credentials4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        java.lang.String str9 = credentials3.toString();
        model.user.Client client10 = new model.user.Client(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str9, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 10 has been disabled.", "Visitor");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str8, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 32 is already enabled." + "'", str9, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str10, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot(0, "users.json");
        parkingLot2.setLocation("Success: Parking Lot -1 has been disabled.");
        parkingLot2.setLocation("Success: Parking Space -1 has been disabled.");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        model.user.Client client3 = new model.user.Client("Success: Parking Lot 100 has been disabled.", "Parking Space 32 is already disabled.", "Manager");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        boolean boolean6 = parkingSpace1.hasBooking();
        java.lang.String str7 = parkingSpace1.enableParkingSpace();
        java.lang.String str8 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Space 100 has been enabled." + "'", str7, "Success: Parking Space 100 has been enabled.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Space 100 is already enabled." + "'", str8, "Parking Space 100 is already enabled.");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        student7.setStudentId("Parking Lot -1 is already enabled.");
        java.lang.String str10 = student7.getStudentId();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Lot -1 is already enabled." + "'", str10, "Parking Lot -1 is already enabled.");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 100, date1, (-10), (int) (byte) 1, (-35), (int) (byte) 100, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str6, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.lang.String str4 = booking0.getStatus();
        java.lang.String str5 = booking0.toString();
        int int6 = booking0.getTotalHours();
        double double7 = booking0.getCost();
        booking0.setEndTime((-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str4, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null" + "'", str5, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        model.booking.Booking booking3 = new model.booking.Booking();
        booking3.setCost((-1.0d));
        int int6 = booking3.getTotalHours();
        booking3.setCost((double) (-1.0f));
        parkingSpace1.setBooking(booking3);
        int int10 = booking3.getEndTime();
        booking3.setStatus("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        SuperManager");
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.toString();
        model.user.Student student10 = new model.user.Student(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str8, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str9, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.util.Date date4 = booking0.getStartDateTime();
        int int5 = booking0.getEndTime();
        booking0.setStatus("Success: Parking Space 100 has been enabled.");
        double double8 = booking0.getCost();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        boolean boolean3 = parkingSpace1.getStatus();
        java.lang.String str4 = parkingSpace1.disableParkingSpace();
        model.sensor.Sensor sensor5 = parkingSpace1.getSensor();
        model.booking.Booking booking6 = new model.booking.Booking();
        booking6.setStatus("Success: Parking Space 100 has been disabled.");
        int int9 = booking6.getLotId();
        java.util.Date date10 = null;
        booking6.setEndDateTime(date10);
        booking6.setLicensePlate("Parking Space 0 is already enabled.");
        parkingSpace1.setBooking(booking6);
        java.lang.String str15 = parkingSpace1.enableParkingSpace();
        java.lang.String str16 = parkingSpace1.disableParkingSpace();
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 52 has been disabled." + "'", str4, "Success: Parking Space 52 has been disabled.");
        org.junit.Assert.assertNotNull(sensor5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Success: Parking Space 52 has been enabled." + "'", str15, "Success: Parking Space 52 has been enabled.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failure: Parking Space 52 has active bookings. Parking Space has not been disabled." + "'", str16, "Failure: Parking Space 52 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 0);
        double double4 = facultyParkingRate0.calculateRate((double) (-32));
        double double6 = facultyParkingRate0.calculateRate((double) 0);
        double double8 = facultyParkingRate0.calculateRate((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-256.0d) + "'", double4 == (-256.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        model.user.User user3 = new model.user.User("Success: Parking Lot 10 has been disabled.", "", "Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.disableParkingSpace();
        java.lang.String str3 = parkingSpace1.enableParkingSpace();
        boolean boolean4 = parkingSpace1.hasBooking();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Success: Parking Space 32 has been disabled." + "'", str2, "Success: Parking Space 32 has been disabled.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Success: Parking Space 32 has been enabled." + "'", str3, "Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        java.lang.String str6 = booking0.getLicensePlate();
        int int7 = booking0.getSpaceId();
        int int8 = booking0.getId();
        int int9 = booking0.getSpaceId();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((-10), date1, 0, (int) (byte) 0, 32, (-35), "Success: Parking Lot 10 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str9, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str10, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        boolean boolean8 = visitor7.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str6, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("NonFacultyStaff");
        booking0.setLicensePlate("NonFacultyStaff");
        java.util.Date date8 = null;
        booking0.setStartDateTime(date8);
        booking0.setEmail("Parking Space 0 is already enabled.");
        int int12 = booking0.getLotId();
        java.lang.String str13 = booking0.getEmail();
        booking0.setCost((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Space 0 is already enabled." + "'", str13, "Parking Space 0 is already enabled.");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(35, date1, (-35), (int) 'a', (int) (short) 0, (int) '4', "Success: Parking Space -1 has been enabled.", "Success: Parking Space 0 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Client client11 = new model.user.Client("Success: Parking Lot 10 has been disabled.", "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        client11.validateAccount();
        boolean boolean13 = credentials3.equals((java.lang.Object) client11);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyId();
        java.lang.String str8 = facultyMember3.getFacultyId();
        facultyMember3.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str11 = facultyMember3.getFacultyName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null" + "'", str11, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(35, date1, (int) (short) 0, (int) (short) 10, 100, (int) (short) -1, "NonFacultyStaff", "Success: Parking Lot 0 has been disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        java.lang.String str16 = credentials3.getPassword();
        model.user.Student student18 = new model.user.Student(credentials3, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Visitor" + "'", str15, "Visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Space 32 is already enabled." + "'", str16, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        model.sensor.Sensor sensor3 = parkingSpace1.getSensor();
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(sensor3);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Student student9 = new model.user.Student(credentials3, "hi!");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        java.util.Date date3 = booking0.getStartDateTime();
        booking0.setStartTime((int) (byte) -1);
        java.lang.String str6 = booking0.getLicensePlate();
        java.lang.String str7 = booking0.toString();
        booking0.setEmail("Parking Lot -1 is already enabled.");
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager" + "'", str7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        java.util.Date date3 = booking0.getStartDateTime();
        booking0.setStartTime((int) (byte) -1);
        booking0.setStartTime((int) (byte) -1);
        java.util.Date date8 = booking0.getDate();
        booking0.setEndTime((int) ' ');
        java.util.Date date11 = booking0.getStartDateTime();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        parkingSpace1.setSpaceID((int) (byte) 10);
        java.lang.String str7 = parkingSpace1.disableParkingSpace();
        java.lang.String str8 = parkingSpace1.enableParkingSpace();
        java.lang.Class<?> wildcardClass9 = parkingSpace1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Space 10 has been disabled." + "'", str7, "Success: Parking Space 10 has been disabled.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Space 10 has been enabled." + "'", str8, "Success: Parking Space 10 has been enabled.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 0);
        double double4 = facultyParkingRate0.calculateRate((double) (-32));
        double double6 = facultyParkingRate0.calculateRate((double) 0);
        java.lang.Class<?> wildcardClass7 = facultyParkingRate0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-256.0d) + "'", double4 == (-256.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setCost((-1.0d));
        int int3 = booking0.getTotalHours();
        booking0.setEndTime((int) 'a');
        booking0.setEmail("Parking Space 0 is already enabled.");
        booking0.setLicensePlate("Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}");
        java.lang.String str10 = booking0.toString();
        java.util.Date date11 = booking0.getStartDateTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}'\ncost           -1.0\nstatus         null'\nemail        Parking Space 0 is already enabled." + "'", str10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}'\ncost           -1.0\nstatus         null'\nemail        Parking Space 0 is already enabled.");
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (byte) 1, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "FacultyMember", "");
        facultyMember3.setFacultyId("Parking Space 32 is already enabled.");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) 0);
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        boolean boolean3 = parkingSpace1.hasBooking();
        parkingSpace1.setSpaceID(1);
        int int6 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 0 is already enabled." + "'", str2, "Parking Space 0 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        strategy.StudentParkingRate studentParkingRate0 = new strategy.StudentParkingRate();
        double double2 = studentParkingRate0.calculateRate((double) (-1.0f));
        double double4 = studentParkingRate0.calculateRate((double) '4');
        double double6 = studentParkingRate0.calculateRate(10.0d);
        double double8 = studentParkingRate0.calculateRate((double) 1.0f);
        double double10 = studentParkingRate0.calculateRate(5000.0d);
        double double12 = studentParkingRate0.calculateRate(2500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.0d) + "'", double2 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 260.0d + "'", double4 == 260.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25000.0d + "'", double10 == 25000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12500.0d + "'", double12 == 12500.0d);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        int int4 = booking0.getStartTime();
        java.lang.String str5 = booking0.getEmail();
        java.lang.String str6 = booking0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null" + "'", str6, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        model.user.User user3 = new model.user.User("Parking Lot 0 is already enabled.", "Parking Space -1 is already enabled.", "Success: Parking Lot 1 has been disabled.");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(32, date1, (int) (byte) 1, 10, (int) (byte) 0, (int) '#', "Success: Parking Lot 10 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 10);
        parkingLot2.setLotID((int) (short) -1);
        java.util.List<model.parking.ParkingSpace> parkingSpaceList14 = parkingLot2.getParkingSpaces();
        parkingLot2.setLocation("Success: Parking Lot 0 has been disabled.");
        parkingLot2.setLocation("Success: Parking Space 52 has been enabled.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList14);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("NonFacultyStaff");
        java.lang.String str6 = booking0.getEmail();
        java.util.Date date7 = booking0.getDate();
        java.util.Date date8 = booking0.getEndDateTime();
        java.lang.String str9 = booking0.getStatus();
        java.lang.String str10 = booking0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NonFacultyStaff" + "'", str9, "NonFacultyStaff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null" + "'", str10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 32 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FacultyMember" + "'", str7, "FacultyMember");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        model.user.User user3 = new model.user.User("Credentials{login='', password='', type=''}", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Space 52 has been enabled.");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) -1, date1, (-1), (int) (byte) -1, (int) (byte) 10, (int) (byte) 1, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Parking Space 32 is already disabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getType();
        model.user.Client client13 = new model.user.Client(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str12, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        student5.validateAccount();
        java.lang.String str7 = student5.getStudentId();
        student5.setStudentId("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = facultyMember6.getFacultyId();
        facultyMember6.setFacultyId("Parking Lot 10 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.lang.String str4 = booking0.getStatus();
        java.lang.String str5 = booking0.toString();
        java.lang.String str6 = booking0.getEmail();
        java.util.Date date7 = booking0.getStartDateTime();
        booking0.setStartTime((int) (short) 10);
        java.lang.String str10 = booking0.toString();
        booking0.setId((-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str4, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null" + "'", str5, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null" + "'", str10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getPassword();
        model.user.Student student15 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Space 32 is already enabled." + "'", str12, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Space 32 is already enabled." + "'", str13, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.booking.Booking booking10 = new model.booking.Booking();
        booking10.setStatus("Success: Parking Space 100 has been disabled.");
        booking10.setStatus("Parking Space 100 is already disabled.");
        int int15 = booking10.getEndTime();
        boolean boolean16 = facultyMember9.equals((java.lang.Object) booking10);
        model.user.Credentials credentials17 = facultyMember9.getCredentials();
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials17, "Parking Space 100 is already disabled.", "Success: Parking Lot 32 has been enabled.");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(credentials17);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 1, "Success: Parking Space -1 has been enabled.");
        java.lang.String str3 = parkingLot2.getLocation();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Success: Parking Space -1 has been enabled." + "'", str3, "Success: Parking Space -1 has been enabled.");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 10);
        parkingLot2.setLotID((int) (short) -1);
        java.util.List<model.parking.ParkingSpace> parkingSpaceList14 = parkingLot2.getParkingSpaces();
        parkingLot2.setLotID(1);
        boolean boolean17 = parkingLot2.getStatus();
        java.lang.String str18 = parkingLot2.getLocation();
        parkingLot2.setLocation("Success: Parking Space 100 has been enabled.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor16 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials12);
        org.junit.Assert.assertNotNull(credentials12);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStartTime(0);
        java.util.Date date3 = booking0.getStartDateTime();
        double double4 = booking0.getCost();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Visitor", "Success: Parking Lot 52 has been disabled.");
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "", "Parking Space -1 is already enabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor" + "'", str6, "Visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str10, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff4.setRole("Success: Parking Lot 97 has been disabled.");
        nonFacultyStaff4.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        nonFacultyStaff4.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        int int10 = parkingLot2.getLotID();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList11 = parkingLot2.getParkingSpaces();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(parkingSpaceList11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setStatus(false);
        java.lang.String str5 = parkingSpace1.enableParkingSpace();
        java.lang.String str6 = parkingSpace1.enableParkingSpace();
        java.lang.String str7 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(true);
        parkingSpace1.setStatus(false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 32 is already enabled." + "'", str2, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 32 has been enabled." + "'", str5, "Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Space 32 is already enabled." + "'", str6, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Space 32 has been disabled." + "'", str7, "Success: Parking Space 32 has been disabled.");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.lang.String str4 = booking0.getStatus();
        java.lang.String str5 = booking0.toString();
        java.lang.String str6 = booking0.getEmail();
        java.util.Date date7 = booking0.getStartDateTime();
        booking0.setStatus("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        booking0.setEndTime(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str4, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null" + "'", str5, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        model.user.Credentials credentials3 = new model.user.Credentials("", "users.json", "Student");
        model.user.Student student4 = new model.user.Student(credentials3);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Lot -1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str9, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "Success: Parking Lot -1 has been disabled.", "Parking Lot 0 is already enabled.");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials4, "Success: Parking Space -1 has been disabled.");
        org.junit.Assert.assertNotNull(credentials4);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "Failure: Parking Space 52 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str5, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Space 32 is already enabled." + "'", str8, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.booking.Booking booking10 = parkingSpace8.getBooking();
        model.booking.Booking booking11 = new model.booking.Booking();
        booking11.setCost((-1.0d));
        int int14 = booking11.getTotalHours();
        booking11.setCost((double) 0L);
        java.lang.String str17 = booking11.toString();
        booking11.setStatus("Parking Space 100 is already disabled.");
        booking11.setCost(5000.0d);
        booking11.setEndTime(10);
        parkingSpace8.setBooking(booking11);
        java.lang.String str25 = booking11.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(booking10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str17, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Space 100 is already disabled." + "'", str25, "Parking Space 100 is already disabled.");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 10 has been disabled.");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        double double6 = booking0.getCost();
        java.util.Date date7 = null;
        booking0.setEndDateTime(date7);
        int int9 = booking0.getTotalHours();
        java.lang.String str10 = booking0.getEmail();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        java.lang.String str3 = parkingSpace1.disableParkingSpace();
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Success: Parking Space 52 has been disabled." + "'", str3, "Success: Parking Space 52 has been disabled.");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((-35), date1, 10, 10, (int) (byte) 1, 0, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        model.user.Client client3 = new model.user.Client("Parking Lot 97 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null", "Success: Parking Space 35 has been disabled.");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        model.user.Client client3 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Parking Space 10 is already enabled.", "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Parking Space 97 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FacultyMember" + "'", str7, "FacultyMember");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str6, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        model.user.User user3 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Success: Parking Space 52 has been disabled.");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 0);
        double double4 = facultyParkingRate0.calculateRate((double) (-32));
        double double6 = facultyParkingRate0.calculateRate(100.0d);
        double double8 = facultyParkingRate0.calculateRate(0.0d);
        double double10 = facultyParkingRate0.calculateRate(500.0d);
        double double12 = facultyParkingRate0.calculateRate(6208.0d);
        double double14 = facultyParkingRate0.calculateRate(2400.0d);
        double double16 = facultyParkingRate0.calculateRate(225.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-256.0d) + "'", double4 == (-256.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 800.0d + "'", double6 == 800.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4000.0d + "'", double10 == 4000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 49664.0d + "'", double12 == 49664.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 19200.0d + "'", double14 == 19200.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1800.0d + "'", double16 == 1800.0d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 10);
        java.lang.String str12 = parkingLot2.disableParkingLot();
        parkingLot2.setLocation("Success: Parking Space 32 has been disabled.");
        java.lang.Class<?> wildcardClass15 = parkingLot2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str12, "Success: Parking Lot 10 has been disabled.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) '4', "Student");
        boolean boolean3 = parkingLot2.getStatus();
        java.lang.String str4 = parkingLot2.getLocation();
        parkingLot2.setLotID((-32));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        booking0.setEmail("");
        java.lang.String str6 = booking0.getStatus();
        booking0.setStatus("Success: Parking Lot 10 has been enabled.");
        java.util.Date date9 = null;
        booking0.setEndDateTime(date9);
        java.lang.String str11 = booking0.getEmail();
        booking0.setEndTime(1);
        java.lang.String str14 = booking0.getLicensePlate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str6, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        model.user.User user3 = new model.user.User("Parking Space 10 is already enabled.", "Success: Parking Space 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Student student11 = new model.user.Student(credentials3);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        strategy.NonFacultyParkingRate nonFacultyParkingRate0 = new strategy.NonFacultyParkingRate();
        double double2 = nonFacultyParkingRate0.calculateRate(2400.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24000.0d + "'", double2 == 24000.0d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor" + "'", str8, "Visitor");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 0);
        double double4 = facultyParkingRate0.calculateRate((double) (-32));
        double double6 = facultyParkingRate0.calculateRate(100.0d);
        double double8 = facultyParkingRate0.calculateRate((-5.0d));
        double double10 = facultyParkingRate0.calculateRate((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-256.0d) + "'", double4 == (-256.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 800.0d + "'", double6 == 800.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-40.0d) + "'", double8 == (-40.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 80.0d + "'", double10 == 80.0d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        java.lang.String str7 = student6.getStudentId();
        org.junit.Assert.assertNotNull(credentials4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        boolean boolean5 = parkingLot2.getStatus();
        java.lang.String str6 = parkingLot2.enableParkingLot();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList7 = parkingLot2.getParkingSpaces();
        int int8 = parkingLot2.getLotID();
        boolean boolean9 = parkingLot2.getStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Lot 0 is already enabled." + "'", str6, "Parking Lot 0 is already enabled.");
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        boolean boolean11 = credentials3.equals((java.lang.Object) "Manager");
        java.lang.String str12 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str9, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Space 32 is already enabled." + "'", str12, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(10, date1, (-32), (int) (short) 100, 97, (-1), "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Parking Space 0 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) (short) 100);
        java.lang.String str7 = parkingLot2.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Lot 100 has been disabled." + "'", str7, "Success: Parking Lot 100 has been disabled.");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        java.lang.String str6 = credentials3.getLogin();
        java.lang.Class<?> wildcardClass7 = credentials3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor" + "'", str6, "Visitor");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        model.user.User user3 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}", "Parking Lot 10 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Visitor", "Success: Parking Lot 52 has been disabled.");
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        manager10.validateAccount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor" + "'", str6, "Visitor");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(0);
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        model.booking.Booking booking3 = new model.booking.Booking();
        booking3.setStatus("Success: Parking Space 100 has been disabled.");
        int int6 = booking3.getEndTime();
        java.util.Date date7 = booking3.getStartDateTime();
        booking3.setCost((double) (short) 1);
        int int10 = booking3.getId();
        booking3.setEmail("Success: Parking Lot 10 has been enabled.");
        parkingSpace1.setBooking(booking3);
        parkingSpace1.setStatus(true);
        java.lang.String str16 = parkingSpace1.enableParkingSpace();
        model.booking.Booking booking17 = parkingSpace1.getBooking();
        java.util.Date date18 = null;
        booking17.setEndDateTime(date18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 0 is already enabled." + "'", str2, "Parking Space 0 is already enabled.");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Space 0 is already enabled." + "'", str16, "Parking Space 0 is already enabled.");
        org.junit.Assert.assertNotNull(booking17);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        java.util.Date date3 = booking0.getStartDateTime();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        java.lang.String str6 = booking0.getStatus();
        int int7 = booking0.getSpaceId();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager10 = new model.user.Manager(credentials4);
        boolean boolean11 = manager10.getValidationStatus();
        boolean boolean12 = manager10.getValidationStatus();
        org.junit.Assert.assertNotNull(credentials4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-40.0d) + "'", double8 == (-40.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("");
        int int6 = booking0.getSpaceId();
        java.lang.String str7 = booking0.getStatus();
        java.lang.String str8 = booking0.getLicensePlate();
        int int9 = booking0.getEndTime();
        booking0.setStartTime((-35));
        int int12 = booking0.getTotalHours();
        java.util.Date date13 = booking0.getDate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        boolean boolean11 = credentials3.equals((java.lang.Object) "Manager");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str9, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setStatus(false);
        java.lang.String str5 = parkingSpace1.enableParkingSpace();
        java.lang.String str6 = parkingSpace1.enableParkingSpace();
        int int7 = parkingSpace1.getSpaceID();
        model.booking.Booking booking8 = parkingSpace1.getBooking();
        parkingSpace1.setStatus(false);
        model.booking.Booking booking11 = parkingSpace1.getBooking();
        boolean boolean12 = parkingSpace1.hasBooking();
        parkingSpace1.setSpaceID(100);
        model.booking.Booking booking15 = new model.booking.Booking();
        booking15.setStatus("Success: Parking Space 100 has been disabled.");
        booking15.setStatus("Parking Space 100 is already disabled.");
        int int20 = booking15.getSpaceId();
        parkingSpace1.setBooking(booking15);
        java.util.Date date22 = booking15.getDate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 32 is already enabled." + "'", str2, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 32 has been enabled." + "'", str5, "Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Space 32 is already enabled." + "'", str6, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        strategy.VisitorParkingRate visitorParkingRate0 = new strategy.VisitorParkingRate();
        double double2 = visitorParkingRate0.calculateRate(1.0d);
        double double4 = visitorParkingRate0.calculateRate((double) 0);
        double double6 = visitorParkingRate0.calculateRate(0.0d);
        double double8 = visitorParkingRate0.calculateRate((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-15.0d) + "'", double8 == (-15.0d));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        int int6 = booking0.getId();
        double double7 = booking0.getCost();
        java.lang.String str8 = booking0.getEmail();
        java.util.Date date9 = null;
        booking0.setEndDateTime(date9);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SuperManager" + "'", str8, "SuperManager");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        model.user.Client client3 = new model.user.Client("Success: Parking Space 52 has been disabled.", "SuperManager", "Success: Parking Space 32 has been enabled.");
        model.booking.Booking booking4 = new model.booking.Booking();
        booking4.setStatus("Success: Parking Space 100 has been disabled.");
        int int7 = booking4.getTotalHours();
        booking4.setStatus("NonFacultyStaff");
        java.lang.String str10 = booking4.getEmail();
        java.util.Date date11 = booking4.getDate();
        java.util.Date date12 = booking4.getEndDateTime();
        java.lang.String str13 = booking4.getStatus();
        boolean boolean14 = client3.equals((java.lang.Object) str13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NonFacultyStaff" + "'", str13, "NonFacultyStaff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        model.user.User user3 = new model.user.User("Parking Lot 100 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ", "Parking Space 100 is already enabled.");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        java.util.Date date3 = booking0.getStartDateTime();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        booking0.setId(0);
        booking0.setStartTime(0);
        int int10 = booking0.getStartTime();
        int int11 = booking0.getTotalHours();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "FacultyMember");
        model.user.Credentials credentials3 = student2.getCredentials();
        student2.setStudentId("Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertNull(credentials3);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "Success: Parking Space 52 has been enabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = booking0.getEndDateTime();
        java.lang.String str5 = booking0.getEmail();
        booking0.setId((-1));
        int int8 = booking0.getStartTime();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SuperManager" + "'", str5, "SuperManager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        strategy.VisitorParkingRate visitorParkingRate0 = new strategy.VisitorParkingRate();
        double double2 = visitorParkingRate0.calculateRate(1.0d);
        double double4 = visitorParkingRate0.calculateRate((double) 0);
        double double6 = visitorParkingRate0.calculateRate((-40.0d));
        double double8 = visitorParkingRate0.calculateRate((-1.0d));
        double double10 = visitorParkingRate0.calculateRate((double) (byte) 100);
        double double12 = visitorParkingRate0.calculateRate(50.0d);
        double double14 = visitorParkingRate0.calculateRate((double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-600.0d) + "'", double6 == (-600.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-15.0d) + "'", double8 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 750.0d + "'", double12 == 750.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 525.0d + "'", double14 == 525.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("NonFacultyStaff");
        booking0.setLicensePlate("NonFacultyStaff");
        java.util.Date date8 = null;
        booking0.setStartDateTime(date8);
        int int10 = booking0.getTotalHours();
        booking0.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(97);
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        boolean boolean3 = parkingSpace1.getStatus();
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking(0, date1, 52, 35, 97, (-32), "Manager", "Parking Lot 100 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        model.user.User user3 = new model.user.User("Parking Space 100 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null", "Parking Lot 0 is already enabled.");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.User user12 = new model.user.User(credentials9);
        model.user.Client client16 = new model.user.Client("Visitor", "Success: Parking Space 32 has been enabled.", "Success: Parking Space 100 has been disabled.");
        boolean boolean17 = client16.getValidationStatus();
        model.user.Credentials credentials18 = client16.getCredentials();
        java.lang.String str19 = credentials18.getLogin();
        model.user.Student student21 = new model.user.Student(credentials18, "Success: Parking Space 10 has been disabled.");
        boolean boolean22 = user12.equals((java.lang.Object) "Success: Parking Space 10 has been disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNotNull(credentials9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(credentials18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Visitor" + "'", str19, "Visitor");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Student student9 = new model.user.Student(credentials3, "Success: Parking Lot 32 has been disabled.");
        java.lang.String str10 = student9.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Space 32 is already enabled." + "'", str7, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Success: Parking Lot 32 has been disabled." + "'", str10, "Success: Parking Lot 32 has been disabled.");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) '4', "Student");
        int int3 = parkingLot2.getLotID();
        int int4 = parkingLot2.getLotID();
        java.lang.String str5 = parkingLot2.enableParkingLot();
        java.lang.String str6 = parkingLot2.getLocation();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList7 = parkingLot2.getParkingSpaces();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 52 is already enabled." + "'", str5, "Parking Lot 52 is already enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getType();
        model.user.Manager manager13 = new model.user.Manager(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str12, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) 0, date1, (int) (byte) 0, (-100), (-10), 1, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.util.Date date4 = booking0.getStartDateTime();
        java.lang.String str5 = booking0.getEmail();
        booking0.setLicensePlate("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   Success: Parking Lot 32 has been disabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        java.util.Date date8 = null;
        booking0.setEndDateTime(date8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Student student11 = new model.user.Student(credentials9, "users.json");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = facultyMember9.getFacultyName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str8, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.booking.Booking booking10 = new model.booking.Booking();
        booking10.setStatus("Success: Parking Space 100 has been disabled.");
        booking10.setStatus("Parking Space 100 is already disabled.");
        int int15 = booking10.getEndTime();
        boolean boolean16 = facultyMember9.equals((java.lang.Object) booking10);
        model.user.Credentials credentials17 = facultyMember9.getCredentials();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(credentials17);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = booking0.getEndDateTime();
        java.lang.String str5 = booking0.getEmail();
        java.util.Date date6 = null;
        booking0.setStartDateTime(date6);
        int int8 = booking0.getStartTime();
        java.util.Date date9 = booking0.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = date9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SuperManager" + "'", str5, "SuperManager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) 0);
        boolean boolean2 = parkingSpace1.hasBooking();
        int int3 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.User user12 = new model.user.User("Student", "users.json", "Manager");
        boolean boolean13 = credentials3.equals((java.lang.Object) "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("NonFacultyStaff");
        java.util.Date date6 = booking0.getStartDateTime();
        booking0.setCost(12500.0d);
        int int9 = booking0.getSpaceId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        boolean boolean3 = parkingSpace1.getStatus();
        java.lang.String str4 = parkingSpace1.disableParkingSpace();
        model.sensor.Sensor sensor5 = parkingSpace1.getSensor();
        model.booking.Booking booking6 = new model.booking.Booking();
        booking6.setStatus("Success: Parking Space 100 has been disabled.");
        int int9 = booking6.getLotId();
        java.util.Date date10 = null;
        booking6.setEndDateTime(date10);
        booking6.setLicensePlate("Parking Space 0 is already enabled.");
        parkingSpace1.setBooking(booking6);
        java.lang.String str15 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setSpaceID((int) (byte) 100);
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 52 has been disabled." + "'", str4, "Success: Parking Space 52 has been disabled.");
        org.junit.Assert.assertNotNull(sensor5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Success: Parking Space 52 has been enabled." + "'", str15, "Success: Parking Space 52 has been enabled.");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setCost((-1.0d));
        int int3 = booking0.getTotalHours();
        booking0.setCost((double) (-1.0f));
        java.lang.String str6 = booking0.getEmail();
        int int7 = booking0.getSpaceId();
        java.lang.String str8 = booking0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null" + "'", str8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 1, "Success: Parking Lot 1 has been disabled.");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyId();
        java.lang.String str8 = facultyMember3.getFacultyName();
        java.lang.String str9 = facultyMember3.getFacultyName();
        facultyMember3.setFacultyName("Parking Lot 0 is already enabled.");
        facultyMember3.setFacultyId("Parking Space 32 is already enabled.");
        facultyMember3.setFacultyId("Parking Space 100 is already enabled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str8, "Success: Parking Lot 10 has been disabled.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str9, "Success: Parking Lot 10 has been disabled.");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        student8.setStudentId("users.json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        java.util.Date date6 = booking0.getDate();
        int int7 = booking0.getStartTime();
        int int8 = booking0.getId();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 97 is already enabled.", "Manager", "");
        model.user.Student student5 = new model.user.Student(credentials3, "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        double double13 = visitorParkingRate6.calculateRate(50.0d);
        double double15 = visitorParkingRate6.calculateRate((-40.0d));
        double double17 = visitorParkingRate6.calculateRate((-2560.0d));
        double double19 = visitorParkingRate6.calculateRate(3328.0d);
        double double21 = visitorParkingRate6.calculateRate((double) '4');
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 750.0d + "'", double13 == 750.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-600.0d) + "'", double15 == (-600.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-38400.0d) + "'", double17 == (-38400.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 49920.0d + "'", double19 == 49920.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 780.0d + "'", double21 == 780.0d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(10);
        parkingSpace1.setStatus(false);
        java.lang.String str4 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 10 has been enabled." + "'", str4, "Success: Parking Space 10 has been enabled.");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        nonFacultyStaff6.setRole("Success: Parking Space -1 has been enabled.");
        nonFacultyStaff6.setRole("");
        java.lang.String str14 = nonFacultyStaff6.getRole();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(credentials9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        java.lang.Class<?> wildcardClass6 = credentials3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.lang.String str4 = booking0.getStatus();
        java.lang.String str5 = booking0.toString();
        int int6 = booking0.getTotalHours();
        java.util.Date date7 = null;
        booking0.setStartDateTime(date7);
        int int9 = booking0.getEndTime();
        java.util.Date date10 = null;
        booking0.setEndDateTime(date10);
        int int12 = booking0.getTotalHours();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str4, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null" + "'", str5, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        double double13 = visitorParkingRate6.calculateRate((double) '#');
        double double15 = visitorParkingRate6.calculateRate((-5.0d));
        double double17 = visitorParkingRate6.calculateRate((double) 1);
        double double19 = visitorParkingRate6.calculateRate((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 525.0d + "'", double13 == 525.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-75.0d) + "'", double15 == (-75.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-15.0d) + "'", double19 == (-15.0d));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setStatus(false);
        java.lang.String str5 = parkingSpace1.enableParkingSpace();
        java.lang.String str6 = parkingSpace1.enableParkingSpace();
        int int7 = parkingSpace1.getSpaceID();
        model.booking.Booking booking8 = parkingSpace1.getBooking();
        parkingSpace1.setSpaceID(10);
        parkingSpace1.setStatus(false);
        model.booking.Booking booking13 = parkingSpace1.getBooking();
        int int14 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 32 is already enabled." + "'", str2, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 32 has been enabled." + "'", str5, "Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Space 32 is already enabled." + "'", str6, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.disableParkingSpace();
        java.lang.String str3 = parkingSpace1.enableParkingSpace();
        boolean boolean4 = parkingSpace1.getStatus();
        boolean boolean5 = parkingSpace1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Success: Parking Space 32 has been disabled." + "'", str2, "Success: Parking Space 32 has been disabled.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Success: Parking Space 32 has been enabled." + "'", str3, "Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        parkingLot2.setLocation("Success: Parking Space 32 has been enabled.");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager10 = new model.user.Manager(credentials4);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials4);
        org.junit.Assert.assertNotNull(credentials4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-40.0d) + "'", double8 == (-40.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) 100);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 1, "Parking Space 32 is already enabled.");
        boolean boolean3 = parkingLot2.getStatus();
        java.lang.String str4 = parkingLot2.enableParkingLot();
        int int5 = parkingLot2.getLotID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Lot 1 is already enabled." + "'", str4, "Parking Lot 1 is already enabled.");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStartTime(0);
        java.util.Date date3 = booking0.getStartDateTime();
        int int4 = booking0.getStartTime();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 32 has been disabled.", "", "Success: Parking Space 1 has been enabled.");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        java.lang.Class<?> wildcardClass8 = user7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) -1);
        int int2 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setSpaceID((-1));
        model.booking.Booking booking5 = parkingSpace1.getBooking();
        java.lang.String str6 = parkingSpace1.disableParkingSpace();
        boolean boolean7 = parkingSpace1.hasBooking();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 32 is already enabled." + "'", str2, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Success: Parking Space -1 has been disabled." + "'", str6, "Success: Parking Space -1 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        strategy.FacultyParkingRate facultyParkingRate0 = new strategy.FacultyParkingRate();
        double double2 = facultyParkingRate0.calculateRate((double) 0);
        double double4 = facultyParkingRate0.calculateRate((double) '#');
        double double6 = facultyParkingRate0.calculateRate(1600.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 280.0d + "'", double4 == 280.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 12800.0d + "'", double6 == 12800.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Lot -1 has been disabled.");
        facultyMember12.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str9, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        parkingSpace1.setSpaceID((int) (byte) 10);
        java.lang.String str7 = parkingSpace1.disableParkingSpace();
        model.user.Client client11 = new model.user.Client("", "", "SuperManager");
        model.booking.Booking booking12 = new model.booking.Booking();
        booking12.setStatus("Success: Parking Space 100 has been disabled.");
        int int15 = booking12.getEndTime();
        java.util.Date date16 = booking12.getStartDateTime();
        booking12.setCost((double) (short) 1);
        int int19 = booking12.getId();
        boolean boolean20 = client11.equals((java.lang.Object) booking12);
        java.util.Date date21 = booking12.getEndDateTime();
        java.lang.String str22 = booking12.getStatus();
        booking12.setEndTime((int) (short) 1);
        java.util.Date date25 = booking12.getEndDateTime();
        parkingSpace1.setBooking(booking12);
        int int27 = booking12.getSpaceId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Space 10 has been disabled." + "'", str7, "Success: Parking Space 10 has been disabled.");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str22, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setCost((-1.0d));
        int int3 = booking0.getTotalHours();
        booking0.setCost((double) 0L);
        java.lang.String str6 = booking0.toString();
        java.util.Date date7 = booking0.getStartDateTime();
        java.lang.String str8 = booking0.getLicensePlate();
        booking0.setEndTime((int) (short) 0);
        booking0.setStatus("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str6, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 10);
        java.lang.String str12 = parkingLot2.disableParkingLot();
        parkingLot2.setLocation("Success: Parking Space 32 has been disabled.");
        boolean boolean15 = parkingLot2.getStatus();
        parkingLot2.setLotID(10);
        parkingLot2.setLotID(10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str12, "Success: Parking Lot 10 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 10, "hi!");
        parkingLot2.setLocation("Parking Space 32 is already enabled.");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        int int3 = parkingLot2.getLotID();
        java.lang.String str4 = parkingLot2.enableParkingLot();
        int int5 = parkingLot2.getLotID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Lot 0 is already enabled." + "'", str4, "Parking Lot 0 is already enabled.");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        model.user.User user3 = new model.user.User("Success: Parking Lot 0 has been disabled.", "Parking Lot 52 is already disabled.", "Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.User user11 = new model.user.User("FacultyMember", "NonFacultyStaff", "Student");
        boolean boolean12 = user11.getValidationStatus();
        boolean boolean13 = visitor7.equals((java.lang.Object) user11);
        boolean boolean14 = visitor7.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str6, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.Class<?> wildcardClass9 = credentials3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Visitor" + "'", str7, "Visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Space 32 is already enabled." + "'", str8, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("");
        int int6 = booking0.getSpaceId();
        booking0.setStartTime((int) ' ');
        java.lang.String str9 = booking0.getLicensePlate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials3);
        model.user.Student student17 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        java.lang.String str5 = parkingSpace1.disableParkingSpace();
        parkingSpace1.setStatus(false);
        model.sensor.Sensor sensor8 = parkingSpace1.getSensor();
        java.lang.String str9 = parkingSpace1.disableParkingSpace();
        model.booking.Booking booking10 = new model.booking.Booking();
        booking10.setCost((-1.0d));
        int int13 = booking10.getTotalHours();
        parkingSpace1.setBooking(booking10);
        boolean boolean15 = parkingSpace1.hasBooking();
        boolean boolean16 = parkingSpace1.hasBooking();
        parkingSpace1.setStatus(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str5, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertNotNull(sensor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Space 100 is already disabled." + "'", str9, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((-35), date1, 35, (int) 'a', 100, (-32), "Success: Parking Lot 32 has been disabled.", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        parkingLot2.setLotID((int) 'a');
        parkingLot2.setLocation("");
        boolean boolean9 = parkingLot2.getStatus();
        parkingLot2.setLotID((int) (byte) 10);
        java.lang.String str12 = parkingLot2.disableParkingLot();
        parkingLot2.setLocation("Success: Parking Space 32 has been disabled.");
        boolean boolean15 = parkingLot2.getStatus();
        java.lang.String str16 = parkingLot2.disableParkingLot();
        boolean boolean17 = parkingLot2.getStatus();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Success: Parking Lot 10 has been disabled." + "'", str12, "Success: Parking Lot 10 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Lot 10 is already disabled." + "'", str16, "Parking Lot 10 is already disabled.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff4.setRole("");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        parkingSpace1.setSpaceID((int) (byte) 10);
        boolean boolean7 = parkingSpace1.hasBooking();
        model.sensor.Sensor sensor8 = parkingSpace1.getSensor();
        parkingSpace1.setStatus(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sensor8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.Student student11 = new model.user.Student(credentials9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        strategy.NonFacultyParkingRate nonFacultyParkingRate0 = new strategy.NonFacultyParkingRate();
        double double2 = nonFacultyParkingRate0.calculateRate((double) 1L);
        double double4 = nonFacultyParkingRate0.calculateRate((double) 100.0f);
        double double6 = nonFacultyParkingRate0.calculateRate((double) 1.0f);
        double double8 = nonFacultyParkingRate0.calculateRate((double) (byte) 100);
        double double10 = nonFacultyParkingRate0.calculateRate(0.0d);
        double double12 = nonFacultyParkingRate0.calculateRate(150.0d);
        double double14 = nonFacultyParkingRate0.calculateRate((-64.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1000.0d + "'", double8 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1500.0d + "'", double12 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-640.0d) + "'", double14 == (-640.0d));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot2.setLocation("");
        java.lang.String str5 = parkingLot2.enableParkingLot();
        parkingLot2.setLocation("Success: Parking Space 10 has been enabled.");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList8 = parkingLot2.getParkingSpaces();
        java.lang.String str9 = parkingLot2.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Lot 0 is already enabled." + "'", str5, "Parking Lot 0 is already enabled.");
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str9, "Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        model.user.Client client3 = new model.user.Client("Success: Parking Lot 10 has been enabled.", "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Success: Parking Lot 10 has been enabled.");
        client3.validateAccount();
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        boolean boolean2 = parkingSpace1.getStatus();
        java.lang.String str3 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setStatus(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Parking Space 100 is already enabled." + "'", str3, "Parking Space 100 is already enabled.");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        java.lang.String str8 = facultyMember7.getFacultyId();
        java.lang.Class<?> wildcardClass9 = facultyMember7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Space 10 has been enabled." + "'", str8, "Success: Parking Space 10 has been enabled.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) 0);
        java.lang.String str2 = parkingSpace1.enableParkingSpace();
        java.lang.String str3 = parkingSpace1.disableParkingSpace();
        java.lang.String str4 = parkingSpace1.disableParkingSpace();
        boolean boolean5 = parkingSpace1.getStatus();
        parkingSpace1.setSpaceID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Parking Space 0 is already enabled." + "'", str2, "Parking Space 0 is already enabled.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Success: Parking Space 0 has been disabled." + "'", str3, "Success: Parking Space 0 has been disabled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Space 0 is already disabled." + "'", str4, "Parking Space 0 is already disabled.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        strategy.StudentParkingRate studentParkingRate0 = new strategy.StudentParkingRate();
        double double2 = studentParkingRate0.calculateRate((double) (-1.0f));
        double double4 = studentParkingRate0.calculateRate((double) '4');
        double double6 = studentParkingRate0.calculateRate(1000.0d);
        double double8 = studentParkingRate0.calculateRate(260.0d);
        double double10 = studentParkingRate0.calculateRate(500.0d);
        double double12 = studentParkingRate0.calculateRate((double) (short) 10);
        double double14 = studentParkingRate0.calculateRate(2500.0d);
        double double16 = studentParkingRate0.calculateRate(4200.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.0d) + "'", double2 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 260.0d + "'", double4 == 260.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5000.0d + "'", double6 == 5000.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1300.0d + "'", double8 == 1300.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2500.0d + "'", double10 == 2500.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12500.0d + "'", double14 == 12500.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 21000.0d + "'", double16 == 21000.0d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 52 has been disabled.");
        model.user.Credentials credentials18 = nonFacultyStaff17.getCredentials();
        nonFacultyStaff17.setRole("Parking Space -1 is already enabled.");
        java.lang.String str21 = nonFacultyStaff17.getRole();
        nonFacultyStaff17.setRole("Success: Parking Space 10 has been disabled.");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Visitor" + "'", str15, "Visitor");
        org.junit.Assert.assertNotNull(credentials18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Space -1 is already enabled." + "'", str21, "Parking Space -1 is already enabled.");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str7, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        boolean boolean3 = parkingSpace1.getStatus();
        java.lang.Class<?> wildcardClass4 = parkingSpace1.getClass();
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        parkingSpace1.setSpaceID((int) (byte) 10);
        boolean boolean7 = parkingSpace1.hasBooking();
        parkingSpace1.setSpaceID((int) (short) 0);
        boolean boolean10 = parkingSpace1.hasBooking();
        boolean boolean11 = parkingSpace1.hasBooking();
        int int12 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        parkingSpace1.setStatus(true);
        int int4 = parkingSpace1.getSpaceID();
        parkingSpace1.setSpaceID((int) (byte) 10);
        java.lang.String str7 = parkingSpace1.disableParkingSpace();
        java.lang.String str8 = parkingSpace1.enableParkingSpace();
        int int9 = parkingSpace1.getSpaceID();
        model.booking.Booking booking10 = parkingSpace1.getBooking();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Success: Parking Space 10 has been disabled." + "'", str7, "Success: Parking Space 10 has been disabled.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Success: Parking Space 10 has been enabled." + "'", str8, "Success: Parking Space 10 has been enabled.");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        org.junit.Assert.assertNotNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Space 32 is already enabled." + "'", str8, "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str13 = credentials3.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str13, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Lot 97 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("");
        java.lang.String str6 = booking0.toString();
        java.util.Date date7 = booking0.getStartDateTime();
        booking0.setStartTime((int) (short) -1);
        java.util.Date date10 = booking0.getEndDateTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null" + "'", str6, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}" + "'", str4, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        booking0.setEmail("");
        int int6 = booking0.getLotId();
        java.util.Date date7 = booking0.getStartDateTime();
        java.util.Date date8 = null;
        booking0.setStartDateTime(date8);
        java.lang.String str10 = booking0.getEmail();
        booking0.setEmail("SuperManager");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "Success: Parking Space 32 has been disabled.", "Manager");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getLotId();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        int int6 = booking0.getLotId();
        booking0.setLicensePlate("Success: Parking Lot 32 has been disabled.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyId();
        java.lang.String str8 = facultyMember3.getFacultyId();
        facultyMember3.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        facultyMember3.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Lot 10 has been enabled.'\nemail        Parking Lot 10 is already disabled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = parkingSpace1.getBooking();
        boolean boolean3 = parkingSpace1.getStatus();
        java.lang.String str4 = parkingSpace1.disableParkingSpace();
        model.sensor.Sensor sensor5 = parkingSpace1.getSensor();
        model.booking.Booking booking6 = new model.booking.Booking();
        booking6.setStatus("Success: Parking Space 100 has been disabled.");
        int int9 = booking6.getLotId();
        java.util.Date date10 = null;
        booking6.setEndDateTime(date10);
        booking6.setLicensePlate("Parking Space 0 is already enabled.");
        parkingSpace1.setBooking(booking6);
        model.booking.Booking booking15 = parkingSpace1.getBooking();
        booking15.setEmail("Parking Space 97 is already enabled.");
        booking15.setId((-10));
        int int20 = booking15.getStartTime();
        java.util.Date date21 = booking15.getEndDateTime();
        java.lang.String str22 = booking15.getStatus();
        booking15.setEmail("Credentials{login='', password='', type=''}");
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 52 has been disabled." + "'", str4, "Success: Parking Space 52 has been disabled.");
        org.junit.Assert.assertNotNull(sensor5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(booking15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str22, "Success: Parking Space 100 has been disabled.");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client13 = new model.user.Client(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyId();
        facultyMember3.validateAccount();
        facultyMember3.setFacultyId("hi!");
        facultyMember3.setFacultyName("Manager");
        facultyMember3.setFacultyName("");
        facultyMember3.setFacultyName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot 97 is already enabled.");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor" + "'", str8, "Visitor");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot((int) '4', "Student");
        boolean boolean3 = parkingLot2.getStatus();
        java.lang.String str4 = parkingLot2.getLocation();
        java.lang.String str5 = parkingLot2.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Lot 52 has been disabled." + "'", str5, "Success: Parking Lot 52 has been disabled.");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor" + "'", str8, "Visitor");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.util.Date date4 = booking0.getStartDateTime();
        booking0.setCost((double) (short) 1);
        int int7 = booking0.getId();
        java.util.Date date8 = booking0.getEndDateTime();
        int int9 = booking0.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        model.user.Client client3 = new model.user.Client("Parking Space 0 is already enabled.", "Parking Lot 1 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        SuperManager");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (byte) -1);
        parkingSpace1.setSpaceID(97);
        java.lang.String str4 = parkingSpace1.disableParkingSpace();
        java.lang.String str5 = parkingSpace1.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Success: Parking Space 97 has been disabled." + "'", str4, "Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Success: Parking Space 97 has been enabled." + "'", str5, "Success: Parking Space 97 has been enabled.");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        model.parking.ParkingLot parkingLot2 = new model.parking.ParkingLot(10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        SuperManager");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((int) (short) -1, date1, 0, (int) '#', (int) (byte) 10, 10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Parking Space 10 is already enabled.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(0);
        parkingSpace1.setSpaceID(100);
        parkingSpace1.setStatus(false);
        model.booking.Booking booking6 = new model.booking.Booking();
        booking6.setCost((-1.0d));
        int int9 = booking6.getTotalHours();
        booking6.setCost((double) 0L);
        java.lang.String str12 = booking6.toString();
        booking6.setStatus("Parking Space 100 is already disabled.");
        parkingSpace1.setBooking(booking6);
        int int16 = parkingSpace1.getSpaceID();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null" + "'", str12, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 97 has been disabled.", "Success: Parking Lot 32 has been enabled.", "Parking Space 97 is already enabled.");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.booking.Booking booking8 = new model.booking.Booking((-35), date1, (-35), 0, (int) '#', 32, "Success: Parking Lot 1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.util.Date date4 = booking0.getStartDateTime();
        int int5 = booking0.getEndTime();
        booking0.setStartTime(52);
        java.util.Date date8 = booking0.getEndDateTime();
        booking0.setEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        java.lang.String str11 = booking0.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Success: Parking Space 100 has been disabled." + "'", str11, "Success: Parking Space 100 has been disabled.");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        facultyMember3.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Space 32 is already enabled." + "'", str5, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertNotNull(credentials7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        booking0.setStartTime((int) '4');
        java.util.Date date5 = booking0.getDate();
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getTotalHours();
        booking0.setStatus("NonFacultyStaff");
        java.lang.String str6 = booking0.getEmail();
        booking0.setLicensePlate("SuperManager");
        double double9 = booking0.getCost();
        java.lang.String str10 = booking0.getLicensePlate();
        booking0.setLicensePlate("Parking Space 97 is already enabled.");
        java.lang.String str13 = booking0.getEmail();
        booking0.setStatus("Parking Lot 0 is already disabled.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStatus("Success: Parking Space 100 has been disabled.");
        int int3 = booking0.getEndTime();
        java.util.Date date4 = booking0.getStartDateTime();
        booking0.setCost((double) (short) 1);
        int int7 = booking0.getId();
        java.util.Date date8 = booking0.getDate();
        booking0.setStartTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        java.lang.String str9 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff10.setRole("FacultyMember");
        nonFacultyStaff10.setRole("");
        boolean boolean15 = nonFacultyStaff10.getValidationStatus();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor" + "'", str8, "Visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Success: Parking Lot 0 has been disabled." + "'", str9, "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("SuperManager");
        double double3 = booking0.getCost();
        java.util.Date date4 = null;
        booking0.setEndDateTime(date4);
        java.lang.String str6 = booking0.getLicensePlate();
        java.util.Date date7 = booking0.getStartDateTime();
        booking0.setLicensePlate("Success: Parking Space 35 has been disabled.");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
    }
}

