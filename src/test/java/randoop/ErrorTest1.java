import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        java.lang.String str15 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        nonFacultyStaff17.setRole("\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff17", nonFacultyStaff7.equals(nonFacultyStaff17) ? nonFacultyStaff7.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        model.booking.Booking booking12 = new model.booking.Booking();
        booking12.setStatus("Success: Parking Space 100 has been disabled.");
        int int15 = booking12.getEndTime();
        booking12.setEmail("");
        java.lang.String str18 = booking12.getStatus();
        booking12.setStatus("Success: Parking Lot 10 has been enabled.");
        java.util.Date date21 = null;
        booking12.setEndDateTime(date21);
        java.lang.String str23 = booking12.getEmail();
        booking12.setEndTime(1);
        boolean boolean26 = facultyMember11.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember11", facultyMember7.equals(facultyMember11) ? facultyMember7.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        java.lang.String str9 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        java.lang.String str12 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        java.lang.String str11 = credentials3.getPassword();
        model.user.Client client12 = new model.user.Client(credentials3);
        model.user.Credentials credentials16 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials16);
        boolean boolean19 = credentials16.equals((java.lang.Object) (-250.0d));
        model.booking.Booking booking20 = new model.booking.Booking();
        booking20.setStatus("Success: Parking Space 100 has been disabled.");
        int int23 = booking20.getTotalHours();
        booking20.setStatus("NonFacultyStaff");
        java.lang.String str26 = booking20.getEmail();
        booking20.setLicensePlate("SuperManager");
        double double29 = booking20.getCost();
        java.lang.String str30 = booking20.toString();
        boolean boolean31 = credentials16.equals((java.lang.Object) booking20);
        model.user.FacultyMember facultyMember32 = new model.user.FacultyMember(credentials16);
        boolean boolean33 = client12.equals((java.lang.Object) credentials16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials16", credentials3.equals(credentials16) ? credentials3.hashCode() == credentials16.hashCode() : true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        java.lang.String str15 = credentials3.toString();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3);
        model.user.User user17 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember16", facultyMember12.equals(facultyMember16) ? facultyMember12.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "NonFacultyStaff", "Success: Parking Space 10 has been disabled.");
        java.lang.String str4 = credentials3.getType();
        model.user.Student student6 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user9 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        model.user.Student student20 = new model.user.Student(credentials18, "\nid             -32\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        student20.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student20", student5.equals(student20) ? student5.hashCode() == student20.hashCode() : true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        java.lang.String str14 = facultyMember13.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember13", facultyMember11.equals(facultyMember13) ? facultyMember11.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 32 is already disabled.", "Parking Space 10 is already enabled.", "Parking Space 97 is already enabled.");
        model.user.User user4 = new model.user.User(credentials3);
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.booking.Booking booking8 = new model.booking.Booking();
        booking8.setEmail("SuperManager");
        double double11 = booking8.getCost();
        java.util.Date date12 = null;
        booking8.setEndDateTime(date12);
        int int14 = booking8.getId();
        double double15 = booking8.getCost();
        booking8.setEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        booking8.setId((int) (byte) -1);
        java.util.Date date20 = null;
        booking8.setStartDateTime(date20);
        int int22 = booking8.getId();
        boolean boolean23 = credentials3.equals((java.lang.Object) int22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager5 and manager7", manager5.equals(manager7) ? manager5.hashCode() == manager7.hashCode() : true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.getLogin();
        model.user.Student student8 = new model.user.Student(credentials3, "");
        model.user.Credentials credentials12 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str13 = credentials12.toString();
        java.lang.String str14 = credentials12.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials12, "Success: Parking Space -1 has been enabled.");
        model.user.User user17 = new model.user.User(credentials12);
        boolean boolean18 = credentials3.equals((java.lang.Object) user17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials7);
        model.user.User user9 = model.user.UserFactory.createAccount(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "Success: Parking Space 97 has been disabled.");
        model.user.User user11 = model.user.UserFactory.createAccount(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        model.user.Credentials credentials15 = user14.getCredentials();
        model.user.Student student17 = new model.user.Student(credentials15, "Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 97 has been disabled.', type='Parking Space 97 is already enabled.'}");
        student17.setStudentId("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student17", student8.equals(student17) ? student8.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials4);
        model.user.Client client9 = new model.user.Client(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "NonFacultyStaff", "Success: Parking Space 10 has been disabled.");
        java.lang.String str4 = credentials3.getType();
        model.user.Student student6 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        java.lang.String str16 = credentials3.getType();
        java.lang.String str17 = credentials3.getPassword();
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials3, "Parking Space 35 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str21 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember20", facultyMember14.equals(facultyMember20) ? facultyMember14.hashCode() == facultyMember20.hashCode() : true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Credentials credentials9 = nonFacultyStaff8.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor10 and visitor12", visitor10.equals(visitor12) ? visitor10.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been enabled.");
        boolean boolean13 = student12.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        java.lang.String str9 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        java.lang.String str12 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
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
        model.user.Manager manager19 = new model.user.Manager(credentials17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember18", facultyMember9.equals(facultyMember18) ? facultyMember9.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        model.user.User user12 = new model.user.User(credentials3);
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user11 and user12", user11.equals(user12) ? user11.hashCode() == user12.hashCode() : true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        java.lang.String str16 = credentials3.getType();
        java.lang.String str17 = credentials3.getPassword();
        model.user.Student student19 = new model.user.Student(credentials3, "Parking Lot 0 is already disabled.");
        boolean boolean20 = student19.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student19", student5.equals(student19) ? student5.hashCode() == student19.hashCode() : true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        model.user.Credentials credentials3 = new model.user.Credentials("", "Success: Parking Lot 0 has been disabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        nonFacultyStaff5.setRole("\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Credentials credentials8 = nonFacultyStaff5.getCredentials();
        model.user.Visitor visitor9 = new model.user.Visitor(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials8);
        java.lang.String str11 = credentials8.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff10", nonFacultyStaff5.equals(nonFacultyStaff10) ? nonFacultyStaff5.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Parking Space 97 is already enabled.");
        facultyMember11.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember11", facultyMember6.equals(facultyMember11) ? facultyMember6.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        java.lang.String str14 = credentials3.getLogin();
        java.lang.String str15 = credentials3.getLogin();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 100 is already disabled.'\nemail        null");
        model.user.User user19 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember18", facultyMember13.equals(facultyMember18) ? facultyMember13.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null'\nemail        null");
        student8.setStudentId("Success: Parking Lot 10 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.toString();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str9 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        java.lang.String str14 = credentials3.getLogin();
        java.lang.String str15 = credentials3.getLogin();
        model.user.User user19 = new model.user.User("", "", "");
        model.user.Credentials credentials20 = user19.getCredentials();
        java.lang.String str21 = credentials20.getLogin();
        strategy.FacultyParkingRate facultyParkingRate22 = new strategy.FacultyParkingRate();
        double double24 = facultyParkingRate22.calculateRate((-5.0d));
        boolean boolean25 = credentials20.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager26 = new model.user.Manager(credentials20);
        boolean boolean27 = credentials3.equals((java.lang.Object) manager26);
        model.user.FacultyMember facultyMember28 = new model.user.FacultyMember(credentials3);
        model.parking.ParkingSpace parkingSpace30 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str31 = parkingSpace30.enableParkingSpace();
        parkingSpace30.setStatus(false);
        java.lang.String str34 = parkingSpace30.enableParkingSpace();
        java.lang.String str35 = parkingSpace30.enableParkingSpace();
        int int36 = parkingSpace30.getSpaceID();
        model.booking.Booking booking37 = parkingSpace30.getBooking();
        parkingSpace30.setStatus(true);
        java.lang.String str40 = parkingSpace30.disableParkingSpace();
        boolean boolean41 = credentials3.equals((java.lang.Object) parkingSpace30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember28", facultyMember11.equals(facultyMember28) ? facultyMember11.hashCode() == facultyMember28.hashCode() : true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        java.lang.String str16 = credentials3.getPassword();
        model.user.Student student17 = new model.user.Student(credentials3);
        model.user.Student student18 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student17", student5.equals(student17) ? student5.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        model.user.User user12 = new model.user.User(credentials3);
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user11 and user12", user11.equals(user12) ? user11.hashCode() == user12.hashCode() : true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Parking Space 100 is already disabled.", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.Student student14 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        java.lang.String str9 = credentials3.toString();
        model.user.Credentials credentials13 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials13, "Manager");
        model.user.Client client16 = new model.user.Client(credentials13);
        model.user.Student student18 = new model.user.Student(credentials13, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials13);
        facultyMember19.setFacultyId("Parking Space 32 is already enabled.");
        boolean boolean22 = credentials3.equals((java.lang.Object) facultyMember19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials13", credentials3.equals(credentials13) ? credentials3.hashCode() == credentials13.hashCode() : true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials7 = visitor6.getCredentials();
        model.user.Manager manager8 = new model.user.Manager(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student9", student5.equals(student9) ? student5.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.Credentials credentials16 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str17 = credentials16.toString();
        java.lang.String str18 = credentials16.getLogin();
        model.user.Manager manager19 = new model.user.Manager(credentials16);
        model.user.Student student20 = new model.user.Student(credentials16);
        boolean boolean21 = facultyMember12.equals((java.lang.Object) student20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember12", facultyMember11.equals(facultyMember12) ? facultyMember11.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Parking Space 100 is already disabled.", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.User user14 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
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
        model.user.User user19 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember18", facultyMember14.equals(facultyMember18) ? facultyMember14.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Parking Space 10 is already enabled.", "Parking Space 32 is already disabled.");
        model.user.User user4 = new model.user.User(credentials3);
        model.user.User user5 = new model.user.User(credentials3);
        java.lang.String str6 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user4 and user5", user4.equals(user5) ? user4.hashCode() == user5.hashCode() : true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        model.user.Student student17 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        java.lang.String str18 = student17.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student17", student5.equals(student17) ? student5.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 32 has been disabled.");
        java.lang.String str9 = nonFacultyStaff8.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.User user8 = new model.user.User(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials12);
        model.user.Student student15 = new model.user.Student(credentials12, "Parking Lot 35 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        java.lang.String str14 = credentials3.getLogin();
        java.lang.String str15 = credentials3.getLogin();
        model.user.User user19 = new model.user.User("", "", "");
        model.user.Credentials credentials20 = user19.getCredentials();
        java.lang.String str21 = credentials20.getLogin();
        strategy.FacultyParkingRate facultyParkingRate22 = new strategy.FacultyParkingRate();
        double double24 = facultyParkingRate22.calculateRate((-5.0d));
        boolean boolean25 = credentials20.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager26 = new model.user.Manager(credentials20);
        boolean boolean27 = credentials3.equals((java.lang.Object) manager26);
        model.user.FacultyMember facultyMember28 = new model.user.FacultyMember(credentials3);
        model.user.Client client29 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember28", facultyMember11.equals(facultyMember28) ? facultyMember11.hashCode() == facultyMember28.hashCode() : true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        model.user.User user3 = new model.user.User("Parking Space 10 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.Credentials credentials7 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7, "Manager");
        model.user.Client client10 = new model.user.Client(credentials7);
        model.user.Student student12 = new model.user.Student(credentials7, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7);
        model.booking.Booking booking14 = new model.booking.Booking();
        booking14.setStatus("Success: Parking Space 100 has been disabled.");
        booking14.setStatus("Parking Space 100 is already disabled.");
        int int19 = booking14.getEndTime();
        boolean boolean20 = facultyMember13.equals((java.lang.Object) booking14);
        model.user.Credentials credentials21 = facultyMember13.getCredentials();
        boolean boolean22 = user3.equals((java.lang.Object) credentials21);
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials21, "Parking Space 52 is already enabled.", "Success: Parking Lot 52 has been enabled.");
        java.lang.String str26 = facultyMember25.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember25", facultyMember13.equals(facultyMember25) ? facultyMember13.hashCode() == facultyMember25.hashCode() : true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = new model.user.User(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student9", student5.equals(student9) ? student5.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.booking.Booking booking9 = new model.booking.Booking();
        booking9.setStatus("Success: Parking Space 100 has been disabled.");
        int int12 = booking9.getEndTime();
        java.lang.String str13 = booking9.getStatus();
        java.lang.String str14 = booking9.toString();
        java.lang.Class<?> wildcardClass15 = booking9.getClass();
        boolean boolean16 = credentials7.equals((java.lang.Object) booking9);
        model.user.User user17 = new model.user.User(credentials7);
        model.user.Credentials credentials18 = user17.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials18);
        nonFacultyStaff19.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff19", nonFacultyStaff6.equals(nonFacultyStaff19) ? nonFacultyStaff6.hashCode() == nonFacultyStaff19.hashCode() : true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 0 has been enabled.");
        java.lang.String str10 = facultyMember9.getFacultyId();
        facultyMember9.validateAccount();
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials12);
        model.user.Visitor visitor14 = new model.user.Visitor(credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff13", nonFacultyStaff4.equals(nonFacultyStaff13) ? nonFacultyStaff4.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "Failure: Parking Space 52 has active bookings. Parking Space has not been disabled.");
        model.user.Client client12 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff11", nonFacultyStaff4.equals(nonFacultyStaff11) ? nonFacultyStaff4.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
        facultyMember13.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        student10.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials17, "Success: Parking Lot 32 has been enabled.");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff19", nonFacultyStaff5.equals(nonFacultyStaff19) ? nonFacultyStaff5.hashCode() == nonFacultyStaff19.hashCode() : true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user9 and user11", user9.equals(user11) ? user9.hashCode() == user11.hashCode() : true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "Failure: Parking Space -1 has active bookings. Parking Space has not been disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7, "", "Success: Parking Lot -1 has been disabled.");
        model.user.Manager manager14 = new model.user.Manager(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getSpaceId();
        java.lang.String str13 = booking11.toString();
        int int14 = booking11.getId();
        booking11.setId(52);
        booking11.setStatus("Credentials{login='', password='Success: Parking Lot 0 has been disabled.', type='\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager'}");
        boolean boolean19 = credentials7.equals((java.lang.Object) booking11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        student7.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        model.user.Student student16 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   users.json'\ncost           -1.0\nstatus         Parking Lot 0 is already disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student16", student7.equals(student16) ? student7.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Parking Space -10 is already enabled.", "Parking Lot 1 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9, "Parking Space 32 is already enabled.", "Success: Parking Lot 32 has been disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        model.user.Visitor visitor14 = new model.user.Visitor(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember13", facultyMember12.equals(facultyMember13) ? facultyMember12.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        java.lang.String str11 = credentials3.getPassword();
        model.user.User user12 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str14 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.toString();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Credentials credentials15 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials15);
        java.lang.String str17 = credentials15.getPassword();
        model.user.Manager manager18 = new model.user.Manager(credentials15);
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials15, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 0 has been enabled.");
        java.lang.String str22 = facultyMember21.getFacultyId();
        facultyMember21.validateAccount();
        java.lang.String str24 = facultyMember21.getFacultyId();
        boolean boolean25 = credentials3.equals((java.lang.Object) str24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str13 = credentials3.toString();
        model.user.Client client14 = new model.user.Client(credentials3);
        model.user.Credentials credentials18 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str19 = credentials18.toString();
        java.lang.String str20 = credentials18.toString();
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials18);
        model.user.Credentials credentials22 = nonFacultyStaff21.getCredentials();
        model.user.Client client23 = new model.user.Client(credentials22);
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials22, "Parking Lot 10 is already disabled.");
        boolean boolean26 = client14.equals((java.lang.Object) credentials22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials22", credentials3.equals(credentials22) ? credentials3.hashCode() == credentials22.hashCode() : true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff12.setRole("Failure: Parking Space 10 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3);
        model.user.Credentials credentials16 = facultyMember15.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember15", facultyMember13.equals(facultyMember15) ? facultyMember13.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        java.lang.String str13 = credentials3.getLogin();
        model.user.Client client14 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client14", client4.equals(client14) ? client4.hashCode() == client14.hashCode() : true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        boolean boolean11 = credentials3.equals((java.lang.Object) "Manager");
        java.lang.String str12 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials17 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client18 = new model.user.Client(credentials17);
        model.user.User user19 = model.user.UserFactory.createAccount(credentials17);
        model.user.Student student21 = new model.user.Student(credentials17, "users.json");
        model.user.Manager manager22 = new model.user.Manager(credentials17);
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials17, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff26 = new model.user.NonFacultyStaff(credentials17);
        java.lang.String str27 = credentials17.toString();
        java.lang.String str28 = credentials17.toString();
        boolean boolean29 = nonFacultyStaff13.equals((java.lang.Object) credentials17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials17", credentials3.equals(credentials17) ? credentials3.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials9, "Parking Space 35 is already enabled.");
        model.user.User user16 = model.user.UserFactory.createAccount(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff15", nonFacultyStaff11.equals(nonFacultyStaff15) ? nonFacultyStaff11.hashCode() == nonFacultyStaff15.hashCode() : true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        java.lang.String str11 = credentials9.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff14.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff13 and nonFacultyStaff14", nonFacultyStaff13.equals(nonFacultyStaff14) ? nonFacultyStaff13.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Lot 97 is already disabled.", "Success: Parking Space -1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Lot 10 has been enabled.'\nemail        Parking Lot 10 is already disabled.");
        java.lang.String str4 = credentials3.getType();
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client7", client6.equals(client7) ? client6.hashCode() == client7.hashCode() : true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 52 is already enabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        boolean boolean14 = student13.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student13", student5.equals(student13) ? student5.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Lot -1 has been disabled.");
        model.user.User user13 = new model.user.User(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        model.user.Student student16 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null");
        model.user.Student student18 = new model.user.Student(credentials3, "Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student16", student8.equals(student16) ? student8.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str14 = credentials3.toString();
        model.user.Student student16 = new model.user.Student(credentials3, "\nid             10\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str17 = student16.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student16", student8.equals(student16) ? student8.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Space -32 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      32\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember11", facultyMember9.equals(facultyMember11) ? facultyMember9.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str17 = credentials3.toString();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember18", facultyMember14.equals(facultyMember18) ? facultyMember14.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 1 has been disabled.");
        student13.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        java.lang.String str14 = credentials3.getLogin();
        java.lang.String str15 = credentials3.getLogin();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 100 is already disabled.'\nemail        null");
        model.user.Visitor visitor19 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember18", facultyMember13.equals(facultyMember18) ? facultyMember13.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials12 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str13 = credentials12.toString();
        model.user.Student student14 = new model.user.Student(credentials12);
        boolean boolean15 = nonFacultyStaff8.equals((java.lang.Object) student14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager10 = new model.user.Manager(credentials4);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials4);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials4);
        model.user.Student student14 = new model.user.Student(credentials4, "Success: Parking Space -1 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor11 and visitor12", visitor11.equals(visitor12) ? visitor11.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        java.lang.String str12 = facultyMember11.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember11", facultyMember8.equals(facultyMember11) ? facultyMember8.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Space 0 has been disabled.", "Manager");
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        boolean boolean6 = credentials3.equals((java.lang.Object) (-250.0d));
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 10 is already enabled.");
        java.lang.String str9 = credentials3.getLogin();
        model.user.Credentials credentials13 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str14 = credentials13.toString();
        java.lang.String str15 = credentials13.toString();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials13);
        model.user.Credentials credentials17 = nonFacultyStaff16.getCredentials();
        model.user.Client client18 = new model.user.Client(credentials17);
        java.lang.String str19 = credentials17.getPassword();
        model.user.Student student20 = new model.user.Student(credentials17);
        model.user.Student student22 = new model.user.Student(credentials17, "Success: Parking Space 1 has been disabled.");
        boolean boolean23 = credentials3.equals((java.lang.Object) credentials17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials17", credentials3.equals(credentials17) ? credentials3.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.booking.Booking booking11 = new model.booking.Booking();
        booking11.setEmail("SuperManager");
        java.util.Date date14 = booking11.getStartDateTime();
        booking11.setStartTime((int) (byte) -1);
        booking11.setStartTime((int) (byte) -1);
        java.util.Date date19 = booking11.getDate();
        boolean boolean20 = credentials3.equals((java.lang.Object) date19);
        java.lang.String str21 = credentials3.getPassword();
        java.lang.String str22 = credentials3.getType();
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials3);
        java.lang.String str24 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember23", facultyMember10.equals(facultyMember23) ? facultyMember10.hashCode() == facultyMember23.hashCode() : true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(100);
        parkingSpace8.setStatus(true);
        int int11 = parkingSpace8.getSpaceID();
        java.lang.String str12 = parkingSpace8.disableParkingSpace();
        parkingSpace8.setStatus(false);
        model.sensor.Sensor sensor15 = parkingSpace8.getSensor();
        java.lang.String str16 = parkingSpace8.disableParkingSpace();
        model.booking.Booking booking17 = new model.booking.Booking();
        booking17.setCost((-1.0d));
        int int20 = booking17.getTotalHours();
        parkingSpace8.setBooking(booking17);
        int int22 = booking17.getSpaceId();
        booking17.setLicensePlate("users.json");
        java.lang.String str25 = booking17.getEmail();
        boolean boolean26 = credentials3.equals((java.lang.Object) str25);
        model.user.Student student27 = new model.user.Student(credentials3);
        java.lang.String str28 = student27.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student27", student6.equals(student27) ? student6.hashCode() == student27.hashCode() : true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.toString();
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        java.lang.String str13 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 0 has been enabled.");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3, "Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 32 has been disabled.', type='Manager'}", "Parking Lot 97 is already disabled.");
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials3, "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember18", facultyMember11.equals(facultyMember18) ? facultyMember11.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "Success: Parking Lot 52 has been disabled.");
        java.lang.String str17 = facultyMember16.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember16", facultyMember13.equals(facultyMember16) ? facultyMember13.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials7 = visitor6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}'\ncost           -1.0\nstatus         null'\nemail        Parking Space 0 is already enabled.");
        model.user.User user11 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student12 = new model.user.Student(credentials7);
        model.user.Credentials credentials13 = student12.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student12", student5.equals(student12) ? student5.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 0 has been enabled.");
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 100 has been disabled.");
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   Success: Parking Lot 32 has been disabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        boolean boolean15 = student14.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student14", student11.equals(student14) ? student11.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Space 35 has been disabled.", "Parking Space 97 is already enabled.");
        java.lang.String str13 = credentials3.toString();
        model.user.Student student15 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str16 = student15.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student15", student6.equals(student15) ? student6.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 32 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str12 = facultyMember11.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember11", facultyMember6.equals(facultyMember11) ? facultyMember6.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Space 100 has been disabled.", "hi!");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Credentials credentials7 = student6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        java.lang.Class<?> wildcardClass9 = student8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
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
        model.user.Student student20 = new model.user.Student(credentials18, "\nid             -32\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str21 = credentials18.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student20", student5.equals(student20) ? student5.hashCode() == student20.hashCode() : true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager12", manager8.equals(manager12) ? manager8.hashCode() == manager12.hashCode() : true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3);
        student9.setStudentId("\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 1 has been disabled.");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        NonFacultyStaff", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -40.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Success: Parking Lot 97 has been disabled.");
        model.user.Student student14 = new model.user.Student(credentials3, "Success: Parking Space 0 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember12", facultyMember8.equals(facultyMember12) ? facultyMember8.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "\nid             -10\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        model.user.Client client14 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff13", nonFacultyStaff4.equals(nonFacultyStaff13) ? nonFacultyStaff4.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        java.lang.String str9 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff10.setRole("FacultyMember");
        nonFacultyStaff10.setRole("Success: Parking Space 10 has been enabled.");
        java.lang.String str15 = nonFacultyStaff10.getRole();
        model.user.Credentials credentials16 = nonFacultyStaff10.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials16);
        nonFacultyStaff17.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -35\nendTime        1\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 10 has been enabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff17", nonFacultyStaff10.equals(nonFacultyStaff17) ? nonFacultyStaff10.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Credentials credentials12 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials12, "Manager");
        model.user.User user15 = model.user.UserFactory.createAccount(credentials12);
        model.user.Client client16 = new model.user.Client(credentials12);
        boolean boolean17 = credentials3.equals((java.lang.Object) credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff12.setRole("Parking Lot 32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff12", nonFacultyStaff7.equals(nonFacultyStaff12) ? nonFacultyStaff7.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str15 = student14.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        java.lang.String str14 = credentials3.getLogin();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3);
        java.lang.String str16 = facultyMember15.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember15", facultyMember13.equals(facultyMember15) ? facultyMember13.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
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
        java.lang.String str19 = facultyMember18.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember18", facultyMember14.equals(facultyMember18) ? facultyMember14.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.User user11 = new model.user.User(credentials3);
        java.lang.String str12 = credentials3.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Parking Lot 1 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   Success: Parking Space 97 has been disabled.'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        facultyMember15.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember15", facultyMember10.equals(facultyMember15) ? facultyMember10.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials9 = nonFacultyStaff8.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor8", visitor6.equals(visitor8) ? visitor6.hashCode() == visitor8.hashCode() : true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9, "Parking Space 32 is already enabled.", "Success: Parking Lot 32 has been disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        java.lang.String str14 = facultyMember13.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember13", facultyMember12.equals(facultyMember13) ? facultyMember12.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "Success: Parking Lot 52 has been disabled.");
        model.user.User user17 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember16", facultyMember13.equals(facultyMember16) ? facultyMember13.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        java.lang.String str14 = credentials3.getLogin();
        java.lang.String str15 = credentials3.getLogin();
        model.user.Manager manager16 = new model.user.Manager(credentials3);
        model.user.User user17 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager16", manager8.equals(manager16) ? manager8.hashCode() == manager16.hashCode() : true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Parking Space 97 is already enabled.");
        java.lang.String str12 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember11", facultyMember6.equals(facultyMember11) ? facultyMember6.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials9, "Parking Space 35 is already enabled.");
        model.user.Credentials credentials19 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials19);
        java.lang.String str21 = credentials19.getPassword();
        model.user.Manager manager22 = new model.user.Manager(credentials19);
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials19, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 0 has been enabled.");
        model.user.Student student27 = new model.user.Student(credentials19, "Success: Parking Lot 100 has been disabled.");
        boolean boolean28 = nonFacultyStaff15.equals((java.lang.Object) "Success: Parking Lot 100 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials19", credentials3.equals(credentials19) ? credentials3.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = facultyMember9.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 100 is already disabled.'\nemail        null");
        java.lang.String str10 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Student student9 = new model.user.Student(credentials3, "hi!");
        student9.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager15", manager8.equals(manager15) ? manager8.hashCode() == manager15.hashCode() : true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager10 = new model.user.Manager(credentials4);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials4);
        model.user.Student student13 = new model.user.Student(credentials4, "users.json");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials4, "Success: Parking Space -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager'\nemail        SuperManager");
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials4, "Parking Lot 97 is already disabled.", "Success: Parking Space 10 has been disabled.");
        facultyMember19.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember16 and facultyMember19", facultyMember16.equals(facultyMember19) ? facultyMember16.hashCode() == facultyMember19.hashCode() : true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.User user8 = new model.user.User(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
        facultyMember13.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           750.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.booking.Booking booking11 = new model.booking.Booking();
        booking11.setEmail("SuperManager");
        java.util.Date date14 = booking11.getStartDateTime();
        booking11.setStartTime((int) (byte) -1);
        booking11.setStartTime((int) (byte) -1);
        java.util.Date date19 = booking11.getDate();
        boolean boolean20 = credentials3.equals((java.lang.Object) date19);
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 10 has been disabled.");
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials3, "Credentials{login='Success: Parking Lot 32 has been disabled.', password='Success: Parking Lot 100 has been disabled.', type='Success: Parking Lot 52 has been disabled.'}", "Success: Parking Space 1 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff22", nonFacultyStaff6.equals(nonFacultyStaff22) ? nonFacultyStaff6.hashCode() == nonFacultyStaff22.hashCode() : true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Success: Parking Space 0 has been disabled.");
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.booking.Booking booking11 = new model.booking.Booking();
        booking11.setStatus("Success: Parking Space 100 has been disabled.");
        int int14 = booking11.getTotalHours();
        booking11.setStatus("");
        int int17 = booking11.getSpaceId();
        java.util.Date date18 = null;
        booking11.setEndDateTime(date18);
        java.util.Date date20 = booking11.getDate();
        double double21 = booking11.getCost();
        boolean boolean22 = visitor10.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor10", visitor7.equals(visitor10) ? visitor7.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 97 has been disabled.', type='Parking Space 97 is already enabled.'}");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 32 has been enabled.", "Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 32 has been disabled.', type='Manager'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student14", student8.equals(student14) ? student8.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.getPassword();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        boolean boolean5 = credentials3.equals((java.lang.Object) (short) 10);
        java.lang.String str6 = credentials3.getPassword();
        model.user.User user7 = new model.user.User(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Parking Lot 100 is already enabled.");
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = student10.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student9 and student10", student9.equals(student10) ? student9.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        facultyMember12.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember12", facultyMember10.equals(facultyMember12) ? facultyMember10.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.User user9 = new model.user.User(credentials7);
        model.user.Credentials credentials10 = user9.getCredentials();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10);
        model.user.Credentials credentials16 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str17 = credentials16.toString();
        model.user.Student student18 = new model.user.Student(credentials16);
        model.user.Client client19 = new model.user.Client(credentials16);
        model.parking.ParkingSpace parkingSpace21 = new model.parking.ParkingSpace(10);
        boolean boolean22 = credentials16.equals((java.lang.Object) parkingSpace21);
        model.user.Manager manager23 = new model.user.Manager(credentials16);
        boolean boolean24 = credentials10.equals((java.lang.Object) credentials16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials10 and credentials16", credentials10.equals(credentials16) ? credentials10.hashCode() == credentials16.hashCode() : true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyId();
        facultyMember3.validateAccount();
        java.lang.String str9 = facultyMember3.getFacultyName();
        model.user.Credentials credentials13 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials13, "Manager");
        model.user.Client client16 = new model.user.Client(credentials13);
        model.user.Student student18 = new model.user.Student(credentials13, "Parking Space 100 is already disabled.");
        java.lang.String str19 = credentials13.getType();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials13, "FacultyMember", "Success: Parking Lot -1 has been disabled.");
        model.user.User user23 = new model.user.User(credentials13);
        boolean boolean24 = facultyMember3.equals((java.lang.Object) user23);
        model.user.Credentials credentials25 = user23.getCredentials();
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials25);
        model.user.Visitor visitor27 = new model.user.Visitor(credentials25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember22 and facultyMember26", facultyMember22.equals(facultyMember26) ? facultyMember22.hashCode() == facultyMember26.hashCode() : true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Student");
        model.user.Credentials credentials11 = facultyMember10.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials11);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember12", facultyMember10.equals(facultyMember12) ? facultyMember10.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        NonFacultyStaff", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff13", nonFacultyStaff4.equals(nonFacultyStaff13) ? nonFacultyStaff4.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3);
        student8.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student8", student7.equals(student8) ? student7.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.getLogin();
        model.user.Student student8 = new model.user.Student(credentials3, "");
        model.user.Student student9 = new model.user.Student(credentials3);
        student9.setStudentId("Parking Space 10 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student9", student8.equals(student9) ? student8.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        strategy.StudentParkingRate studentParkingRate11 = new strategy.StudentParkingRate();
        double double13 = studentParkingRate11.calculateRate((double) (-1.0f));
        boolean boolean14 = credentials9.equals((java.lang.Object) studentParkingRate11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        java.lang.String str4 = credentials3.getLogin();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           1.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.Client client13 = new model.user.Client(credentials3);
        model.user.Client client14 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client13", client4.equals(client13) ? client4.hashCode() == client13.hashCode() : true);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3);
        student9.setStudentId("Admin");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        model.user.Credentials credentials13 = visitor12.getCredentials();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials13, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Lot 52 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember16", facultyMember8.equals(facultyMember16) ? facultyMember8.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str14 = credentials3.toString();
        model.user.Student student16 = new model.user.Student(credentials3, "\nid             10\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        student16.setStudentId("Success: Parking Space 35 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student16", student8.equals(student16) ? student8.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Visitor", "Success: Parking Lot 52 has been disabled.");
        java.lang.String str10 = credentials3.getLogin();
        java.lang.String str11 = credentials3.getLogin();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        facultyMember12.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember12", facultyMember9.equals(facultyMember12) ? facultyMember9.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "Success: Parking Space 0 has been enabled.", "Success: Parking Lot 0 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember14", facultyMember8.equals(facultyMember14) ? facultyMember8.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        strategy.FacultyParkingRate facultyParkingRate8 = new strategy.FacultyParkingRate();
        double double10 = facultyParkingRate8.calculateRate((double) 0);
        double double12 = facultyParkingRate8.calculateRate((double) '#');
        boolean boolean13 = credentials4.equals((java.lang.Object) facultyParkingRate8);
        model.user.Student student15 = new model.user.Student(credentials4, "Credentials{login='Parking Space 97 is already enabled.', password='Manager', type=''}");
        student15.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student15", student6.equals(student15) ? student6.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = new model.user.User(credentials7);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials7);
        model.user.Student student10 = new model.user.Student(credentials7);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff9.setRole("Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff9", nonFacultyStaff5.equals(nonFacultyStaff9) ? nonFacultyStaff5.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Student");
        model.user.Credentials credentials11 = facultyMember10.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials11);
        facultyMember12.setFacultyName("Parking Lot 10 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember12", facultyMember10.equals(facultyMember12) ? facultyMember10.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        java.lang.String str13 = facultyMember12.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember12", facultyMember10.equals(facultyMember12) ? facultyMember10.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.User user5 = new model.user.User(credentials3);
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getType();
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Credentials credentials10 = null;
        model.user.Student student12 = new model.user.Student(credentials10, "Manager");
        java.lang.String str13 = student12.getStudentId();
        java.lang.String str14 = student12.getStudentId();
        model.parking.ParkingLot parkingLot17 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot17.setLocation("");
        parkingLot17.setLotID((int) 'a');
        parkingLot17.setLocation("");
        boolean boolean24 = parkingLot17.getStatus();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList25 = parkingLot17.getParkingSpaces();
        parkingLot17.setLocation("Parking Space 0 is already enabled.");
        boolean boolean28 = student12.equals((java.lang.Object) "Parking Space 0 is already enabled.");
        student12.setStudentId("Success: Parking Space 0 has been disabled.");
        student12.setStudentId("");
        java.lang.String str33 = student12.getStudentId();
        boolean boolean34 = user9.equals((java.lang.Object) student12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user5 and user9", user5.equals(user9) ? user5.hashCode() == user9.hashCode() : true);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 32 has been disabled.");
        model.user.Client client9 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        model.user.User user3 = new model.user.User("Parking Space 10 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.Credentials credentials7 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7, "Manager");
        model.user.Client client10 = new model.user.Client(credentials7);
        model.user.Student student12 = new model.user.Student(credentials7, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7);
        model.booking.Booking booking14 = new model.booking.Booking();
        booking14.setStatus("Success: Parking Space 100 has been disabled.");
        booking14.setStatus("Parking Space 100 is already disabled.");
        int int19 = booking14.getEndTime();
        boolean boolean20 = facultyMember13.equals((java.lang.Object) booking14);
        model.user.Credentials credentials21 = facultyMember13.getCredentials();
        boolean boolean22 = user3.equals((java.lang.Object) credentials21);
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials21, "Parking Space 52 is already enabled.", "Success: Parking Lot 52 has been enabled.");
        java.lang.String str26 = credentials21.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember25", facultyMember13.equals(facultyMember25) ? facultyMember13.hashCode() == facultyMember25.hashCode() : true);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str10 = nonFacultyStaff9.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff9", nonFacultyStaff5.equals(nonFacultyStaff9) ? nonFacultyStaff5.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 1 has been disabled.");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Student");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Student student11 = new model.user.Student(credentials3, "Credentials{login='Parking Space 97 is already enabled.', password='Manager', type=''}");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.Client client10 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.Credentials credentials15 = student14.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor12", visitor7.equals(visitor12) ? visitor7.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        model.user.Client client3 = new model.user.Client("Visitor", "Success: Parking Space 32 has been enabled.", "Success: Parking Space 100 has been disabled.");
        boolean boolean4 = client3.getValidationStatus();
        model.user.Credentials credentials5 = client3.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials5, "Success: Parking Lot 52 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ");
        java.lang.String str9 = credentials5.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials5);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials5);
        model.user.User user12 = new model.user.User(credentials5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember11", facultyMember8.equals(facultyMember11) ? facultyMember8.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.Visitor visitor8 = new model.user.Visitor(credentials4);
        model.user.Student student10 = new model.user.Student(credentials4, "Success: Parking Space 52 has been disabled.");
        model.user.User user11 = model.user.UserFactory.createAccount(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        java.lang.String str9 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        student11.setStudentId("Success: Parking Space 10 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Credentials{login='Parking Space 0 is already disabled.', password='Parking Lot 100 is already disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember11", facultyMember7.equals(facultyMember11) ? facultyMember7.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 52 has been disabled.");
        java.lang.String str9 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.toString();
        model.user.Credentials credentials14 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials14);
        java.lang.String str16 = credentials14.getPassword();
        java.lang.String str17 = credentials14.toString();
        model.user.User user18 = model.user.UserFactory.createAccount(credentials14);
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials14, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Student");
        java.lang.String str22 = facultyMember21.getFacultyId();
        model.user.Credentials credentials23 = facultyMember21.getCredentials();
        boolean boolean24 = facultyMember21.getValidationStatus();
        boolean boolean25 = credentials3.equals((java.lang.Object) facultyMember21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials14", credentials3.equals(credentials14) ? credentials3.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client9", client7.equals(client9) ? client7.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.User user12 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user9 and user11", user9.equals(user11) ? user9.hashCode() == user11.hashCode() : true);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.booking.Booking booking11 = new model.booking.Booking();
        booking11.setEmail("SuperManager");
        java.util.Date date14 = booking11.getStartDateTime();
        booking11.setStartTime((int) (byte) -1);
        booking11.setStartTime((int) (byte) -1);
        java.util.Date date19 = booking11.getDate();
        boolean boolean20 = credentials3.equals((java.lang.Object) date19);
        java.lang.String str21 = credentials3.getPassword();
        java.lang.String str22 = credentials3.getType();
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember23", facultyMember10.equals(facultyMember23) ? facultyMember10.hashCode() == facultyMember23.hashCode() : true);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client7", client6.equals(client7) ? client6.hashCode() == client7.hashCode() : true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.User user9 = new model.user.User(credentials7);
        model.user.Credentials credentials10 = user9.getCredentials();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10);
        nonFacultyStaff12.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        Parking Lot 10 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Student student11 = new model.user.Student(credentials9, "users.json");
        student11.setStudentId("Parking Lot 100 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        model.user.User user16 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor18 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember17", facultyMember14.equals(facultyMember17) ? facultyMember14.hashCode() == facultyMember17.hashCode() : true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials7);
        model.user.Client client9 = new model.user.Client(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str13 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff12 and nonFacultyStaff14", nonFacultyStaff12.equals(nonFacultyStaff14) ? nonFacultyStaff12.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 97 is already enabled.'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   Success: Parking Lot 32 has been disabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   Success: Parking Space 97 has been disabled.'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str13 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember12", facultyMember9.equals(facultyMember12) ? facultyMember9.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "Success: Parking Lot 52 has been disabled.");
        facultyMember16.setFacultyName("Success: Parking Space 32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember16", facultyMember13.equals(facultyMember16) ? facultyMember13.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.User user11 = new model.user.User(credentials3);
        java.lang.String str12 = credentials3.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Parking Lot 1 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   Success: Parking Space 97 has been disabled.'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        facultyMember15.setFacultyId("Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember15", facultyMember10.equals(facultyMember15) ? facultyMember10.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        java.lang.String str12 = credentials3.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Parking Lot 1 is already enabled.", "Parking Space -1 is already enabled.");
        model.user.Manager manager16 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        model.parking.ParkingSpace parkingSpace21 = new model.parking.ParkingSpace(100);
        parkingSpace21.setStatus(true);
        int int24 = parkingSpace21.getSpaceID();
        java.lang.String str25 = parkingSpace21.disableParkingSpace();
        parkingSpace21.setStatus(false);
        model.sensor.Sensor sensor28 = parkingSpace21.getSensor();
        java.lang.String str29 = parkingSpace21.disableParkingSpace();
        model.booking.Booking booking30 = new model.booking.Booking();
        booking30.setCost((-1.0d));
        int int33 = booking30.getTotalHours();
        parkingSpace21.setBooking(booking30);
        booking30.setEmail("");
        java.util.Date date37 = null;
        booking30.setStartDateTime(date37);
        booking30.setLicensePlate("Success: Parking Space 100 has been disabled.");
        int int41 = booking30.getId();
        double double42 = booking30.getCost();
        boolean boolean43 = nonFacultyStaff19.equals((java.lang.Object) booking30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff17 and nonFacultyStaff19", nonFacultyStaff17.equals(nonFacultyStaff19) ? nonFacultyStaff17.hashCode() == nonFacultyStaff19.hashCode() : true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        model.user.User user8 = new model.user.User("", "", "");
        model.user.Credentials credentials9 = user8.getCredentials();
        java.lang.String str10 = credentials9.getLogin();
        model.user.Student student11 = new model.user.Student(credentials9);
        model.user.Credentials credentials12 = student11.getCredentials();
        model.user.User user13 = new model.user.User(credentials12);
        boolean boolean14 = credentials4.equals((java.lang.Object) user13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user3 and user8", user3.equals(user8) ? user3.hashCode() == user8.hashCode() : true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        java.lang.String str11 = credentials3.getType();
        java.lang.String str12 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff13.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           97500.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "Parking Space -1 is already disabled.");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff7.setRole("Credentials{login='Success: Parking Lot 35 has been disabled.', password='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}'\ncost           -1.0\nstatus         null'\nemail        Parking Space 0 is already enabled.', type='Credentials{login='', password='', type=''}'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        facultyMember12.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember12", facultyMember11.equals(facultyMember12) ? facultyMember11.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        java.lang.String str12 = credentials3.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Parking Lot 1 is already enabled.", "Parking Space -1 is already enabled.");
        model.user.Manager manager16 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        model.user.Client client20 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff17 and nonFacultyStaff19", nonFacultyStaff17.equals(nonFacultyStaff19) ? nonFacultyStaff17.hashCode() == nonFacultyStaff19.hashCode() : true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.Client client12 = new model.user.Client(credentials3);
        boolean boolean13 = client12.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client12", client6.equals(client12) ? client6.hashCode() == client12.hashCode() : true);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.Student student11 = new model.user.Student(credentials9);
        model.user.User user15 = new model.user.User("Parking Space 100 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        boolean boolean16 = student11.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Space 100 has been disabled.", "hi!");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Credentials credentials7 = student6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        student8.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        java.lang.String str8 = credentials3.getType();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff10.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff10", nonFacultyStaff4.equals(nonFacultyStaff10) ? nonFacultyStaff4.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Credentials{login='Success: Parking Space 10 has been disabled.', password='FacultyMember', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null'}");
        java.lang.String str14 = student13.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.getType();
        model.user.User user8 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user8", user6.equals(user8) ? user6.hashCode() == user8.hashCode() : true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 32 has been disabled.");
        java.lang.String str9 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 100 is already disabled.'\nemail        null");
        model.user.Student student10 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff7.setRole("Parking Space 32 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff7", nonFacultyStaff5.equals(nonFacultyStaff7) ? nonFacultyStaff5.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user5 = new model.user.User(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Credentials credentials11 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str12 = credentials11.toString();
        java.lang.String str13 = credentials11.getPassword();
        java.lang.String str14 = credentials11.getLogin();
        model.user.Visitor visitor15 = new model.user.Visitor(credentials11);
        boolean boolean16 = student7.equals((java.lang.Object) credentials11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials11", credentials3.equals(credentials11) ? credentials3.hashCode() == credentials11.hashCode() : true);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Client client11 = new model.user.Client("Success: Parking Lot 10 has been disabled.", "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        client11.validateAccount();
        boolean boolean13 = credentials3.equals((java.lang.Object) client11);
        model.user.Client client17 = new model.user.Client("", "", "SuperManager");
        model.booking.Booking booking18 = new model.booking.Booking();
        booking18.setStatus("Success: Parking Space 100 has been disabled.");
        int int21 = booking18.getEndTime();
        java.util.Date date22 = booking18.getStartDateTime();
        booking18.setCost((double) (short) 1);
        int int25 = booking18.getId();
        boolean boolean26 = client17.equals((java.lang.Object) booking18);
        java.util.Date date27 = booking18.getEndDateTime();
        java.lang.String str28 = booking18.getEmail();
        boolean boolean29 = credentials3.equals((java.lang.Object) booking18);
        model.user.FacultyMember facultyMember32 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 32 has been disabled.");
        model.user.Visitor visitor33 = new model.user.Visitor(credentials3);
        model.user.Student student35 = new model.user.Student(credentials3, "Parking Lot -100 is already enabled.");
        model.user.NonFacultyStaff nonFacultyStaff37 = new model.user.NonFacultyStaff(credentials3, "Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student35", student6.equals(student35) ? student6.hashCode() == student35.hashCode() : true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials3);
        model.user.User user16 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str17 = credentials3.toString();
        model.user.User user18 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student20 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        student20.setStudentId("Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student20", student5.equals(student20) ? student5.hashCode() == student20.hashCode() : true);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        java.lang.String str8 = credentials3.getType();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff10", nonFacultyStaff4.equals(nonFacultyStaff10) ? nonFacultyStaff4.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Credentials{login='Success: Parking Space 10 has been disabled.', password='FacultyMember', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null'}");
        java.lang.String str14 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getType();
        model.user.Student student12 = new model.user.Student(credentials3, "Parking Space -32 is already disabled.");
        java.lang.String str13 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
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
        model.user.Student student20 = new model.user.Student(credentials18, "\nid             -32\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        student20.setStudentId("FacultyMember");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student20", student5.equals(student20) ? student5.hashCode() == student20.hashCode() : true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Visitor", "Success: Parking Lot 52 has been disabled.");
        model.user.Client client10 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        ");
        nonFacultyStaff13.setRole("Parking Space 100 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff13", nonFacultyStaff11.equals(nonFacultyStaff13) ? nonFacultyStaff11.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str10 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff9", nonFacultyStaff4.equals(nonFacultyStaff9) ? nonFacultyStaff4.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        java.lang.String str14 = credentials3.getLogin();
        java.lang.String str15 = credentials3.getLogin();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 100 is already disabled.'\nemail        null");
        java.lang.String str19 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember18", facultyMember13.equals(facultyMember18) ? facultyMember13.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        boolean boolean10 = nonFacultyStaff9.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 100 is already disabled.'\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials4);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials4, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   NonFacultyStaff'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        Parking Space 0 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        Parking Space -100 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.parking.ParkingSpace parkingSpace9 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str10 = parkingSpace9.enableParkingSpace();
        parkingSpace9.setStatus(false);
        java.lang.String str13 = parkingSpace9.enableParkingSpace();
        java.lang.String str14 = parkingSpace9.enableParkingSpace();
        model.booking.Booking booking15 = new model.booking.Booking();
        booking15.setStatus("Success: Parking Space 100 has been disabled.");
        int int18 = booking15.getEndTime();
        java.util.Date date19 = booking15.getStartDateTime();
        java.util.Date date20 = booking15.getStartDateTime();
        double double21 = booking15.getCost();
        parkingSpace9.setBooking(booking15);
        model.booking.Booking booking23 = parkingSpace9.getBooking();
        int int24 = booking23.getLotId();
        boolean boolean25 = credentials3.equals((java.lang.Object) int24);
        model.user.Client client26 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember29 = new model.user.FacultyMember(credentials3, "Parking Space 52 is already enabled.", "Success: Parking Space 1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff30 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember29", facultyMember5.equals(facultyMember29) ? facultyMember5.hashCode() == facultyMember29.hashCode() : true);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Space 35 has been disabled.", "Parking Space 97 is already enabled.");
        java.lang.String str13 = credentials3.toString();
        model.user.Client client14 = new model.user.Client(credentials3);
        model.user.Credentials credentials18 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        java.lang.String str19 = credentials18.getLogin();
        model.user.Student student20 = new model.user.Student(credentials18);
        model.user.Manager manager21 = new model.user.Manager(credentials18);
        model.user.Student student22 = new model.user.Student(credentials18);
        boolean boolean23 = credentials3.equals((java.lang.Object) credentials18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client14", client7.equals(client14) ? client7.hashCode() == client14.hashCode() : true);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getType();
        model.user.Client client13 = new model.user.Client(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client13", client4.equals(client13) ? client4.hashCode() == client13.hashCode() : true);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        java.lang.String str12 = credentials3.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Parking Lot 1 is already enabled.", "Parking Space -1 is already enabled.");
        model.user.Manager manager16 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -40.0\nstatus         Parking Lot 0 is already disabled.'\nemail        null", "Parking Space -1 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff17 and nonFacultyStaff19", nonFacultyStaff17.equals(nonFacultyStaff19) ? nonFacultyStaff17.hashCode() == nonFacultyStaff19.hashCode() : true);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Visitor visitor11 = new model.user.Visitor(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        java.lang.String str9 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client8", client4.equals(client8) ? client4.hashCode() == client8.hashCode() : true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getType();
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        java.lang.String str15 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        java.lang.String str9 = credentials3.toString();
        boolean boolean11 = credentials3.equals((java.lang.Object) 16640.0d);
        model.user.Student student13 = new model.user.Student(credentials3, "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str14 = student13.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3, "Credentials{login='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager', password='NonFacultyStaff', type='Success: Parking Space 10 has been disabled.'}");
        model.user.Credentials credentials14 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client15 = new model.user.Client(credentials14);
        model.user.User user16 = model.user.UserFactory.createAccount(credentials14);
        model.user.Student student18 = new model.user.Student(credentials14, "users.json");
        java.lang.String str19 = credentials14.getType();
        java.lang.String str20 = credentials14.getPassword();
        java.lang.String str21 = credentials14.getType();
        model.user.User user22 = model.user.UserFactory.createAccount(credentials14);
        java.lang.String str23 = credentials14.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials14);
        nonFacultyStaff24.validateAccount();
        boolean boolean26 = credentials3.equals((java.lang.Object) nonFacultyStaff24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials14", credentials3.equals(credentials14) ? credentials3.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.User user12 = new model.user.User(credentials9);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        java.lang.String str14 = credentials9.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember13", facultyMember8.equals(facultyMember13) ? facultyMember8.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        java.lang.String str12 = credentials3.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        model.user.User user16 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor13 and visitor15", visitor13.equals(visitor15) ? visitor13.hashCode() == visitor15.hashCode() : true);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.Credentials credentials7 = student6.getCredentials();
        model.user.User user8 = new model.user.User(credentials7);
        model.user.Credentials credentials9 = user8.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user3 and user8", user3.equals(user8) ? user3.hashCode() == user8.hashCode() : true);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = new model.user.User(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3);
        java.lang.String str10 = student9.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student9", student5.equals(student9) ? student5.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials3);
        model.user.User user16 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str17 = credentials3.toString();
        model.user.User user18 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -35\nendTime        1\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 10 has been enabled.'\nemail        null", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str22 = facultyMember21.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember21", facultyMember14.equals(facultyMember21) ? facultyMember14.hashCode() == facultyMember21.hashCode() : true);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        strategy.StudentParkingRate studentParkingRate12 = new strategy.StudentParkingRate();
        double double14 = studentParkingRate12.calculateRate((double) (short) -1);
        double double16 = studentParkingRate12.calculateRate((double) 52);
        double double18 = studentParkingRate12.calculateRate(78750.0d);
        double double20 = studentParkingRate12.calculateRate(1050000.0d);
        double double22 = studentParkingRate12.calculateRate(112000.0d);
        boolean boolean23 = nonFacultyStaff11.equals((java.lang.Object) studentParkingRate12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.User user5 = new model.user.User(credentials3);
        java.lang.String str6 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 35 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember11", facultyMember8.equals(facultyMember11) ? facultyMember8.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Visitor visitor4 = new model.user.Visitor(credentials3);
        java.lang.String str5 = credentials3.getType();
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 52 is already enabled.");
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        model.user.User user10 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor4 and visitor9", visitor4.equals(visitor9) ? visitor4.hashCode() == visitor9.hashCode() : true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "", "Success: Parking Space -1 has been enabled.");
        facultyMember13.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Lot 1 has been enabled.'\ncost           0.0\nstatus         Success: Parking Lot 10 has been enabled.'\nemail        ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        java.lang.String str9 = credentials3.toString();
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 0 is already enabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Credentials{login='Success: Parking Lot 32 has been disabled.', password='Success: Parking Lot 100 has been disabled.', type='Success: Parking Lot 52 has been disabled.'}");
        model.user.Client client14 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember13", facultyMember8.equals(facultyMember13) ? facultyMember8.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.booking.Booking booking7 = new model.booking.Booking();
        booking7.setCost((-1.0d));
        int int10 = booking7.getTotalHours();
        booking7.setCost((double) 0L);
        java.lang.String str13 = booking7.toString();
        booking7.setStatus("Parking Space 100 is already disabled.");
        booking7.setCost(5000.0d);
        booking7.setEmail("Parking Space 100 is already disabled.");
        boolean boolean20 = credentials3.equals((java.lang.Object) booking7);
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials3);
        facultyMember21.setFacultyId("Parking Space 10 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember21", facultyMember6.equals(facultyMember21) ? facultyMember6.hashCode() == facultyMember21.hashCode() : true);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials7 = visitor6.getCredentials();
        model.user.Manager manager8 = new model.user.Manager(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials10 = student9.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student9", student5.equals(student9) ? student5.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.getLogin();
        model.user.Student student8 = new model.user.Student(credentials3, "");
        model.user.Student student9 = new model.user.Student(credentials3);
        student9.setStudentId("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student9", student8.equals(student9) ? student8.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.Manager manager9 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student8", student7.equals(student8) ? student7.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.User user9 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.User user10 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "Student");
        model.user.Client client13 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff12", nonFacultyStaff7.equals(nonFacultyStaff12) ? nonFacultyStaff7.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        model.parking.ParkingSpace parkingSpace5 = new model.parking.ParkingSpace((int) (byte) 0);
        java.lang.String str6 = parkingSpace5.enableParkingSpace();
        java.lang.String str7 = parkingSpace5.disableParkingSpace();
        java.lang.String str8 = parkingSpace5.disableParkingSpace();
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace5);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   Success: Parking Space 97 has been disabled.'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Client client14 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student13", student10.equals(student13) ? student10.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff9.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        Parking Space -100 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff9", nonFacultyStaff4.equals(nonFacultyStaff9) ? nonFacultyStaff4.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        model.user.Client client3 = new model.user.Client("Visitor", "Success: Parking Space 32 has been enabled.", "Success: Parking Space 100 has been disabled.");
        boolean boolean4 = client3.getValidationStatus();
        model.user.Credentials credentials5 = client3.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials5, "Success: Parking Lot 52 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ");
        java.lang.String str9 = credentials5.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials5);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials5, "\nid             1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        nonFacultyStaff12.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        student11.setStudentId("Credentials{login='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager', password='NonFacultyStaff', type='Success: Parking Space 10 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3);
        java.lang.String str14 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student13", student5.equals(student13) ? student5.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff8.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Lot 1 has been enabled.'\ncost           0.0\nstatus         Success: Parking Lot 10 has been enabled.'\nemail        ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        java.lang.String str14 = credentials3.getLogin();
        java.lang.String str15 = credentials3.getLogin();
        model.user.Credentials credentials19 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials19);
        java.lang.String str21 = credentials19.getPassword();
        model.user.Manager manager22 = new model.user.Manager(credentials19);
        model.user.Credentials credentials23 = manager22.getCredentials();
        model.user.Student student24 = new model.user.Student(credentials23);
        model.user.Student student25 = new model.user.Student(credentials23);
        boolean boolean26 = credentials3.equals((java.lang.Object) credentials23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials23", credentials3.equals(credentials23) ? credentials3.hashCode() == credentials23.hashCode() : true);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 97 is already enabled.'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   Success: Parking Lot 32 has been disabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        model.parking.ParkingLot parkingLot13 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot13.setLocation("");
        parkingLot13.setLotID((int) 'a');
        parkingLot13.setLocation("");
        boolean boolean20 = parkingLot13.getStatus();
        java.lang.String str21 = parkingLot13.disableParkingLot();
        boolean boolean22 = parkingLot13.getStatus();
        parkingLot13.setLotID((-52));
        parkingLot13.setLotID((int) (byte) 100);
        boolean boolean27 = credentials3.equals((java.lang.Object) parkingLot13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager9 = new model.user.Manager(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        model.user.Student student12 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      32\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str13 = student12.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.User user11 = new model.user.User(credentials3);
        java.lang.String str12 = credentials3.toString();
        java.lang.String str13 = credentials3.getType();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials3, "Parking Space 97 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Lot 32 is already disabled.'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.toString();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7, "Success: Parking Space -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 0 is already enabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Parking Space 97 is already enabled.");
        java.lang.String str12 = credentials7.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials7, "Parking Lot 10 is already disabled.");
        model.user.Credentials credentials15 = nonFacultyStaff14.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff14", nonFacultyStaff6.equals(nonFacultyStaff14) ? nonFacultyStaff6.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        model.user.User user16 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials3);
        model.user.Student student18 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember17", facultyMember14.equals(facultyMember17) ? facultyMember14.hashCode() == facultyMember17.hashCode() : true);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.toString();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7, "Success: Parking Space -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 0 is already enabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Parking Space 97 is already enabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials7, "Success: Parking Space 52 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Space 52 has been enabled.");
        model.user.User user17 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember16", facultyMember13.equals(facultyMember16) ? facultyMember13.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             10\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor8", visitor6.equals(visitor8) ? visitor6.hashCode() == visitor8.hashCode() : true);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials7 = visitor6.getCredentials();
        model.user.Manager manager8 = new model.user.Manager(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.Student student10 = new model.user.Student(credentials7);
        model.user.Student student11 = new model.user.Student(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.User user13 = new model.user.User("", "", "");
        model.user.Credentials credentials14 = user13.getCredentials();
        java.lang.String str15 = credentials14.getLogin();
        strategy.FacultyParkingRate facultyParkingRate16 = new strategy.FacultyParkingRate();
        double double18 = facultyParkingRate16.calculateRate((-5.0d));
        boolean boolean19 = credentials14.equals((java.lang.Object) (-5.0d));
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials14, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        boolean boolean23 = credentials3.equals((java.lang.Object) facultyMember22);
        model.user.Student student24 = new model.user.Student(credentials3);
        model.user.User user25 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student24", student6.equals(student24) ? student6.hashCode() == student24.hashCode() : true);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null", "Success: Parking Lot 32 has been enabled.", "Parking Lot 97 is already enabled.");
        model.user.Visitor visitor4 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember8", facultyMember7.equals(facultyMember8) ? facultyMember7.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember11", facultyMember9.equals(facultyMember11) ? facultyMember9.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        java.lang.String str6 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 100 is already disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff7", nonFacultyStaff5.equals(nonFacultyStaff7) ? nonFacultyStaff5.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Lot 35 has been disabled.");
        model.user.Student student14 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student13", student6.equals(student13) ? student6.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
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
        model.user.Student student20 = new model.user.Student(credentials18, "\nid             -32\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Student student21 = new model.user.Student(credentials18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student20", student5.equals(student20) ? student5.hashCode() == student20.hashCode() : true);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.toString();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7, "Success: Parking Space -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 0 is already enabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Parking Space 97 is already enabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials7, "Success: Parking Space 52 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str15 = credentials7.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        java.lang.String str10 = nonFacultyStaff9.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Student");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Failure: Parking Space 0 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "");
        model.parking.ParkingSpace parkingSpace11 = new model.parking.ParkingSpace(100);
        parkingSpace11.setStatus(true);
        int int14 = parkingSpace11.getSpaceID();
        java.lang.String str15 = parkingSpace11.disableParkingSpace();
        java.lang.String str16 = parkingSpace11.enableParkingSpace();
        boolean boolean17 = parkingSpace11.getStatus();
        java.lang.String str18 = parkingSpace11.enableParkingSpace();
        boolean boolean19 = nonFacultyStaff9.equals((java.lang.Object) str18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff9", nonFacultyStaff7.equals(nonFacultyStaff9) ? nonFacultyStaff7.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials4);
        model.user.Manager manager9 = new model.user.Manager(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        java.lang.String str14 = credentials3.getLogin();
        java.lang.String str15 = credentials3.getLogin();
        model.user.User user19 = new model.user.User("", "", "");
        model.user.Credentials credentials20 = user19.getCredentials();
        java.lang.String str21 = credentials20.getLogin();
        strategy.FacultyParkingRate facultyParkingRate22 = new strategy.FacultyParkingRate();
        double double24 = facultyParkingRate22.calculateRate((-5.0d));
        boolean boolean25 = credentials20.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager26 = new model.user.Manager(credentials20);
        boolean boolean27 = credentials3.equals((java.lang.Object) manager26);
        model.user.FacultyMember facultyMember28 = new model.user.FacultyMember(credentials3);
        facultyMember28.setFacultyId("Parking Space -10 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember28", facultyMember11.equals(facultyMember28) ? facultyMember11.hashCode() == facultyMember28.hashCode() : true);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        java.lang.Object obj11 = null;
        boolean boolean12 = credentials3.equals(obj11);
        model.user.Manager manager13 = new model.user.Manager(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        model.user.Student student16 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager13 and manager14", manager13.equals(manager14) ? manager13.hashCode() == manager14.hashCode() : true);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        model.user.Credentials credentials3 = new model.user.Credentials("", "Success: Parking Lot 0 has been disabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        nonFacultyStaff5.setRole("\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Credentials credentials8 = nonFacultyStaff5.getCredentials();
        model.user.Visitor visitor9 = new model.user.Visitor(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials8);
        nonFacultyStaff10.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff10", nonFacultyStaff5.equals(nonFacultyStaff10) ? nonFacultyStaff5.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials4);
        model.user.Manager manager11 = new model.user.Manager(credentials4);
        model.user.User user12 = new model.user.User(credentials4);
        java.lang.String str13 = credentials4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user3 and user12", user3.equals(user12) ? user3.hashCode() == user12.hashCode() : true);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.", "Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user9 and user11", user9.equals(user11) ? user9.hashCode() == user11.hashCode() : true);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "");
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        model.parking.ParkingSpace parkingSpace13 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str14 = parkingSpace13.enableParkingSpace();
        parkingSpace13.setStatus(false);
        java.lang.String str17 = parkingSpace13.enableParkingSpace();
        parkingSpace13.setStatus(false);
        int int20 = parkingSpace13.getSpaceID();
        int int21 = parkingSpace13.getSpaceID();
        boolean boolean22 = facultyMember11.equals((java.lang.Object) int21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember11", facultyMember7.equals(facultyMember11) ? facultyMember7.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.User user5 = new model.user.User(credentials3);
        java.lang.String str6 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 35 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null");
        model.user.Client client12 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember11", facultyMember8.equals(facultyMember11) ? facultyMember8.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Client client11 = new model.user.Client("Success: Parking Lot 10 has been disabled.", "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        client11.validateAccount();
        boolean boolean13 = credentials3.equals((java.lang.Object) client11);
        model.user.Client client17 = new model.user.Client("", "", "SuperManager");
        model.booking.Booking booking18 = new model.booking.Booking();
        booking18.setStatus("Success: Parking Space 100 has been disabled.");
        int int21 = booking18.getEndTime();
        java.util.Date date22 = booking18.getStartDateTime();
        booking18.setCost((double) (short) 1);
        int int25 = booking18.getId();
        boolean boolean26 = client17.equals((java.lang.Object) booking18);
        java.util.Date date27 = booking18.getEndDateTime();
        java.lang.String str28 = booking18.getEmail();
        boolean boolean29 = credentials3.equals((java.lang.Object) booking18);
        model.user.FacultyMember facultyMember32 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 32 has been disabled.");
        java.lang.String str33 = credentials3.getPassword();
        java.lang.String str34 = credentials3.getLogin();
        model.user.FacultyMember facultyMember35 = new model.user.FacultyMember(credentials3);
        model.user.User user36 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember32 and facultyMember35", facultyMember32.equals(facultyMember35) ? facultyMember32.hashCode() == facultyMember35.hashCode() : true);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.Student student10 = new model.user.Student(credentials7);
        model.user.Student student12 = new model.user.Student(credentials7, "Success: Parking Space 1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student12", student10.equals(student12) ? student10.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Lot 97 is already disabled.", "Success: Parking Space -1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Lot 10 has been enabled.'\nemail        Parking Lot 10 is already disabled.");
        java.lang.String str4 = credentials3.getType();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager7", manager6.equals(manager7) ? manager6.hashCode() == manager7.hashCode() : true);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.User user11 = new model.user.User(credentials3);
        java.lang.String str12 = credentials3.toString();
        java.lang.String str13 = credentials3.getType();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        model.user.Student student16 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Client client11 = new model.user.Client("Success: Parking Lot 10 has been disabled.", "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        client11.validateAccount();
        boolean boolean13 = credentials3.equals((java.lang.Object) client11);
        model.user.Client client17 = new model.user.Client("", "", "SuperManager");
        model.booking.Booking booking18 = new model.booking.Booking();
        booking18.setStatus("Success: Parking Space 100 has been disabled.");
        int int21 = booking18.getEndTime();
        java.util.Date date22 = booking18.getStartDateTime();
        booking18.setCost((double) (short) 1);
        int int25 = booking18.getId();
        boolean boolean26 = client17.equals((java.lang.Object) booking18);
        java.util.Date date27 = booking18.getEndDateTime();
        java.lang.String str28 = booking18.getEmail();
        boolean boolean29 = credentials3.equals((java.lang.Object) booking18);
        model.user.FacultyMember facultyMember32 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 32 has been disabled.");
        model.user.Visitor visitor33 = new model.user.Visitor(credentials3);
        java.lang.String str34 = credentials3.getType();
        model.user.Client client35 = new model.user.Client(credentials3);
        java.lang.String str36 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client35", client7.equals(client35) ? client7.hashCode() == client35.hashCode() : true);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials15 = visitor14.getCredentials();
        model.user.Student student16 = new model.user.Student(credentials15);
        model.user.User user17 = new model.user.User(credentials15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student16", student7.equals(student16) ? student7.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Lot 10 has been enabled.'\nemail        Parking Lot 10 is already disabled.");
        java.lang.String str10 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff9", nonFacultyStaff5.equals(nonFacultyStaff9) ? nonFacultyStaff5.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9);
        model.user.Client client13 = new model.user.Client(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff12", nonFacultyStaff11.equals(nonFacultyStaff12) ? nonFacultyStaff11.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "Parking Lot -1 is already enabled.");
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Client client12 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials7 = visitor6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}'\ncost           -1.0\nstatus         null'\nemail        Parking Space 0 is already enabled.");
        model.user.User user11 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student12 = new model.user.Student(credentials7);
        java.lang.String str13 = credentials7.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student12", student5.equals(student12) ? student5.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        model.user.Credentials credentials15 = user14.getCredentials();
        model.user.Student student17 = new model.user.Student(credentials15, "Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 97 has been disabled.', type='Parking Space 97 is already enabled.'}");
        model.parking.ParkingLot parkingLot20 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot20.setLocation("");
        parkingLot20.setLotID((int) 'a');
        parkingLot20.setLocation("");
        boolean boolean27 = parkingLot20.getStatus();
        int int28 = parkingLot20.getLotID();
        java.lang.String str29 = parkingLot20.enableParkingLot();
        int int30 = parkingLot20.getLotID();
        boolean boolean31 = parkingLot20.getStatus();
        boolean boolean32 = credentials15.equals((java.lang.Object) parkingLot20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student17", student8.equals(student17) ? student8.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        java.lang.String str15 = credentials3.toString();
        model.user.Student student16 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student16", student8.equals(student16) ? student8.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        java.lang.String str9 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor8", visitor6.equals(visitor8) ? visitor6.hashCode() == visitor8.hashCode() : true);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getType();
        model.user.Student student12 = new model.user.Student(credentials3, "Parking Lot 1 is already disabled.");
        java.lang.String str13 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getPassword();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        java.lang.String str12 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student11", student6.equals(student11) ? student6.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "Success: Parking Lot 35 has been disabled.");
        model.user.Manager manager13 = new model.user.Manager(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials4, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   NonFacultyStaff'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        Parking Space 0 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Student student11 = new model.user.Student(credentials3, "Credentials{login='Parking Space 97 is already enabled.', password='Manager', type=''}");
        model.booking.Booking booking12 = new model.booking.Booking();
        booking12.setStatus("Success: Parking Space 100 has been disabled.");
        int int15 = booking12.getEndTime();
        booking12.setEmail("");
        java.util.Date date18 = booking12.getEndDateTime();
        booking12.setLicensePlate("NonFacultyStaff");
        int int21 = booking12.getTotalHours();
        booking12.setId(100);
        int int24 = booking12.getStartTime();
        boolean boolean25 = student11.equals((java.lang.Object) int24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        java.lang.String str12 = credentials3.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Parking Lot 1 is already enabled.", "Parking Space -1 is already enabled.");
        model.user.Manager manager16 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        java.lang.String str20 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff17 and nonFacultyStaff19", nonFacultyStaff17.equals(nonFacultyStaff19) ? nonFacultyStaff17.hashCode() == nonFacultyStaff19.hashCode() : true);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 10 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user9 and user11", user9.equals(user11) ? user9.hashCode() == user11.hashCode() : true);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        java.lang.String str4 = credentials3.getPassword();
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Client client10 = new model.user.Client(credentials3);
        client10.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client5 and client10", client5.equals(client10) ? client5.hashCode() == client10.hashCode() : true);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user10 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff9", nonFacultyStaff5.equals(nonFacultyStaff9) ? nonFacultyStaff5.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Success: Parking Space 0 has been disabled.");
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        87\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor10", visitor7.equals(visitor10) ? visitor7.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 0 has been enabled.");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3, "Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 32 has been disabled.', type='Manager'}", "Parking Lot 97 is already disabled.");
        java.lang.String str19 = facultyMember18.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember18", facultyMember11.equals(facultyMember18) ? facultyMember11.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        java.lang.String str11 = credentials3.getType();
        java.lang.String str12 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user14 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Lot -35 is already enabled.", "Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client7", client6.equals(client7) ? client6.hashCode() == client7.hashCode() : true);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getType();
        java.lang.String str13 = credentials3.getLogin();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        model.user.Credentials credentials18 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str19 = credentials18.toString();
        model.user.Student student20 = new model.user.Student(credentials18);
        model.user.Client client21 = new model.user.Client(credentials18);
        model.parking.ParkingSpace parkingSpace23 = new model.parking.ParkingSpace(10);
        boolean boolean24 = credentials18.equals((java.lang.Object) parkingSpace23);
        model.user.Visitor visitor25 = new model.user.Visitor(credentials18);
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials18);
        java.lang.String str27 = credentials18.getType();
        model.user.User user28 = new model.user.User(credentials18);
        model.user.Visitor visitor29 = new model.user.Visitor(credentials18);
        boolean boolean30 = credentials3.equals((java.lang.Object) visitor29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials18", credentials3.equals(credentials18) ? credentials3.hashCode() == credentials18.hashCode() : true);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        java.lang.String str12 = credentials3.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Parking Lot 1 is already enabled.", "Parking Space -1 is already enabled.");
        model.user.Manager manager16 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str18 = credentials3.getPassword();
        model.user.User user19 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student21 = new model.user.Student(credentials3, "");
        model.user.User user22 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student21", student5.equals(student21) ? student5.hashCode() == student21.hashCode() : true);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 10 has been disabled.", "Visitor");
        java.lang.String str15 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        java.lang.String str9 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "");
        model.user.User user14 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember13", facultyMember8.equals(facultyMember13) ? facultyMember8.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Space 100 has been disabled.", "hi!");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Credentials credentials7 = student6.getCredentials();
        model.user.Student student9 = new model.user.Student(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   '\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        java.lang.String str16 = credentials3.getType();
        java.lang.String str17 = credentials3.getPassword();
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials3, "Parking Space 35 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember20", facultyMember14.equals(facultyMember20) ? facultyMember14.hashCode() == facultyMember20.hashCode() : true);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student14", student5.equals(student14) ? student5.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        java.lang.String str11 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor10", visitor7.equals(visitor10) ? visitor7.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        java.lang.String str13 = credentials12.getLogin();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials12);
        java.lang.String str15 = facultyMember14.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember14", facultyMember9.equals(facultyMember14) ? facultyMember9.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        model.user.Student student16 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student16", student7.equals(student16) ? student7.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        java.lang.String str4 = credentials3.getLogin();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        boolean boolean8 = student7.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = new model.user.User(credentials7);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials7);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials7, "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Credentials{login='Success: Parking Space 100 has been disabled.', password='Success: Parking Space -1 has been enabled.', type='Success: Parking Space -1 has been enabled.'}");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials7);
        model.user.Manager manager14 = new model.user.Manager(credentials7);
        java.lang.String str15 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials7, "Parking Lot 97 is already disabled.");
        java.lang.String str18 = nonFacultyStaff17.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff17", nonFacultyStaff6.equals(nonFacultyStaff17) ? nonFacultyStaff6.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = new model.user.User(credentials7);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials7);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials7, "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Credentials{login='Success: Parking Space 100 has been disabled.', password='Success: Parking Space -1 has been enabled.', type='Success: Parking Space -1 has been enabled.'}");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials7);
        model.user.Manager manager14 = new model.user.Manager(credentials7);
        java.lang.String str15 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials7, "Parking Lot 97 is already disabled.");
        java.lang.String str18 = credentials7.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff17", nonFacultyStaff6.equals(nonFacultyStaff17) ? nonFacultyStaff6.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        model.user.User user12 = new model.user.User(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   Parking Space 100 is already disabled.'\ncost           6208.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user11 and user12", user11.equals(user12) ? user11.hashCode() == user12.hashCode() : true);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        model.user.Client client12 = new model.user.Client(credentials3);
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client12", client6.equals(client12) ? client6.hashCode() == client12.hashCode() : true);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 52 has been disabled.");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        facultyMember20.setFacultyName("Credentials{login='Parking Lot 10 is already enabled.', password='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        52\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember20", facultyMember14.equals(facultyMember20) ? facultyMember14.hashCode() == facultyMember20.hashCode() : true);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "Success: Parking Lot 35 has been disabled.");
        boolean boolean13 = nonFacultyStaff12.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        java.lang.String str4 = credentials3.getPassword();
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = facultyMember9.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember9", facultyMember6.equals(facultyMember9) ? facultyMember6.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.toString();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7, "Success: Parking Space -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 0 is already enabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Parking Space 97 is already enabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials7, "Success: Parking Space 52 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.parking.ParkingSpace parkingSpace16 = new model.parking.ParkingSpace(100);
        parkingSpace16.setStatus(true);
        int int19 = parkingSpace16.getSpaceID();
        java.lang.String str20 = parkingSpace16.disableParkingSpace();
        parkingSpace16.setStatus(false);
        int int23 = parkingSpace16.getSpaceID();
        model.sensor.Sensor sensor24 = parkingSpace16.getSensor();
        parkingSpace16.setStatus(true);
        parkingSpace16.setStatus(true);
        boolean boolean29 = credentials7.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9);
        model.user.Client client13 = new model.user.Client(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff12", nonFacultyStaff11.equals(nonFacultyStaff12) ? nonFacultyStaff11.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        student11.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials9, "Parking Space 35 is already enabled.");
        java.lang.String str16 = credentials9.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff15", nonFacultyStaff11.equals(nonFacultyStaff15) ? nonFacultyStaff11.hashCode() == nonFacultyStaff15.hashCode() : true);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        java.lang.String str15 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str18 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff17", nonFacultyStaff7.equals(nonFacultyStaff17) ? nonFacultyStaff7.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials4);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials4);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials4, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        52\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Parking Space -32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember11", facultyMember10.equals(facultyMember11) ? facultyMember10.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str13 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff14.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff12 and nonFacultyStaff14", nonFacultyStaff12.equals(nonFacultyStaff14) ? nonFacultyStaff12.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        java.lang.String str9 = credentials3.toString();
        boolean boolean11 = credentials3.equals((java.lang.Object) 16640.0d);
        model.user.Student student13 = new model.user.Student(credentials3, "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Space 100 has been disabled.", "hi!");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Credentials credentials7 = student6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        student8.setStudentId("Credentials{login='Parking Lot 10 is already enabled.', password='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        52\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str13 = credentials3.toString();
        model.user.Client client14 = new model.user.Client(credentials3);
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client14", client4.equals(client14) ? client4.hashCode() == client14.hashCode() : true);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials3);
        model.user.User user16 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str17 = credentials3.toString();
        model.user.User user18 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student20 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        student20.setStudentId("Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student20", student5.equals(student20) ? student5.hashCode() == student20.hashCode() : true);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor16 = new model.user.Visitor(credentials3);
        model.user.Student student18 = new model.user.Student(credentials3, "Success: Parking Space -100 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor15 and visitor16", visitor15.equals(visitor16) ? visitor15.hashCode() == visitor16.hashCode() : true);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        java.lang.String str9 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}'\ncost           -1.0\nstatus         null'\nemail        Parking Space 0 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -35\nendTime        1\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 10 has been enabled.'\nemail        null");
        java.lang.String str14 = facultyMember13.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember13", facultyMember8.equals(facultyMember13) ? facultyMember8.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials4, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str13 = credentials4.getLogin();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials4);
        java.lang.String str15 = credentials4.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember14", facultyMember12.equals(facultyMember14) ? facultyMember12.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        java.lang.String str12 = credentials3.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Parking Lot 1 is already enabled.", "Parking Space -1 is already enabled.");
        model.user.Manager manager16 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str18 = credentials3.getPassword();
        model.user.User user19 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student21 = new model.user.Student(credentials3, "");
        java.lang.String str22 = student21.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student21", student5.equals(student21) ? student5.hashCode() == student21.hashCode() : true);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        model.user.Client client3 = new model.user.Client("Visitor", "Success: Parking Space 32 has been enabled.", "Success: Parking Space 100 has been disabled.");
        boolean boolean4 = client3.getValidationStatus();
        model.user.Credentials credentials5 = client3.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials5, "Success: Parking Lot 52 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ");
        java.lang.String str9 = credentials5.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials5);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials5);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember11", facultyMember8.equals(facultyMember11) ? facultyMember8.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials13 = nonFacultyStaff12.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff12", nonFacultyStaff7.equals(nonFacultyStaff12) ? nonFacultyStaff7.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 32 is already disabled.", "Parking Space 10 is already enabled.", "Parking Space 97 is already enabled.");
        model.user.User user4 = new model.user.User(credentials3);
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager5 and manager7", manager5.equals(manager7) ? manager5.hashCode() == manager7.hashCode() : true);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Visitor", "Success: Parking Lot 52 has been disabled.");
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "", "Parking Space -1 is already enabled.");
        model.user.User user14 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Visitor", "Success: Parking Lot 52 has been disabled.");
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   NonFacultyStaff'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        Parking Space 0 is already enabled.");
        java.lang.String str14 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember11", facultyMember7.equals(facultyMember11) ? facultyMember7.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 52 has been disabled.");
        java.lang.Class<?> wildcardClass14 = nonFacultyStaff13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.User user5 = new model.user.User(credentials3);
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getType();
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Credentials credentials13 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ", "Success: Parking Space 52 has been disabled.", "Success: Parking Lot -1 has been disabled.");
        model.user.Client client14 = new model.user.Client(credentials13);
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials13);
        java.lang.String str16 = nonFacultyStaff15.getRole();
        boolean boolean17 = credentials3.equals((java.lang.Object) nonFacultyStaff15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user5 and user9", user5.equals(user9) ? user5.hashCode() == user9.hashCode() : true);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user5 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff6", nonFacultyStaff4.equals(nonFacultyStaff6) ? nonFacultyStaff4.hashCode() == nonFacultyStaff6.hashCode() : true);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials4, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str13 = credentials4.getLogin();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials4);
        model.user.Client client15 = new model.user.Client(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember14", facultyMember12.equals(facultyMember14) ? facultyMember12.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = new model.user.User(credentials3);
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.booking.Booking booking10 = new model.booking.Booking();
        booking10.setStatus("Success: Parking Space 100 has been disabled.");
        booking10.setStatus("Parking Space 100 is already disabled.");
        int int15 = booking10.getStartTime();
        boolean boolean16 = credentials3.equals((java.lang.Object) int15);
        model.user.Manager manager17 = new model.user.Manager(credentials3);
        manager17.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager17", manager8.equals(manager17) ? manager8.hashCode() == manager17.hashCode() : true);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        java.lang.String str4 = credentials3.getLogin();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Credentials credentials8 = student7.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.User user5 = new model.user.User(credentials3);
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getType();
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user5 and user9", user5.equals(user9) ? user5.hashCode() == user9.hashCode() : true);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = new model.user.User(credentials7);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials7);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials7, "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Credentials{login='Success: Parking Space 100 has been disabled.', password='Success: Parking Space -1 has been enabled.', type='Success: Parking Space -1 has been enabled.'}");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials7);
        model.user.Manager manager14 = new model.user.Manager(credentials7);
        java.lang.String str15 = credentials7.getPassword();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials7);
        model.user.Student student17 = new model.user.Student(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor9 and visitor16", visitor9.equals(visitor16) ? visitor9.hashCode() == visitor16.hashCode() : true);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = new model.user.User(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "Failure: Parking Space 0 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student9", student5.equals(student9) ? student5.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str15 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff14", nonFacultyStaff7.equals(nonFacultyStaff14) ? nonFacultyStaff7.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Space 100 has been disabled.", "hi!");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Credentials credentials7 = student6.getCredentials();
        model.user.Student student9 = new model.user.Student(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        student9.setStudentId("\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Client client11 = new model.user.Client("Success: Parking Lot 10 has been disabled.", "", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        client11.validateAccount();
        boolean boolean13 = credentials3.equals((java.lang.Object) client11);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        java.lang.String str15 = credentials3.toString();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3);
        facultyMember16.setFacultyName("Success: Parking Space 0 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember16", facultyMember14.equals(facultyMember16) ? facultyMember14.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Parking Space 97 is already enabled.", "Parking Lot -1 is already enabled.");
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        facultyMember7.setFacultyId("Failure: Parking Space 52 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        java.lang.String str15 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        nonFacultyStaff17.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff17", nonFacultyStaff7.equals(nonFacultyStaff17) ? nonFacultyStaff7.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client10 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff9", nonFacultyStaff5.equals(nonFacultyStaff9) ? nonFacultyStaff5.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        java.lang.String str14 = credentials3.getLogin();
        model.user.Student student15 = new model.user.Student(credentials3);
        model.user.User user16 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student15", student7.equals(student15) ? student7.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.Visitor visitor8 = new model.user.Visitor(credentials4);
        java.lang.String str9 = credentials4.getType();
        model.user.Student student10 = new model.user.Student(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.User user12 = new model.user.User(credentials9);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        model.user.Student student14 = new model.user.Student(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember13", facultyMember8.equals(facultyMember13) ? facultyMember8.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Space 35 has been disabled.", "Parking Space 97 is already enabled.");
        java.lang.String str13 = credentials3.toString();
        model.user.Student student15 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str16 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student15", student6.equals(student15) ? student6.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        java.lang.String str16 = credentials3.getPassword();
        model.user.Student student17 = new model.user.Student(credentials3);
        model.user.Student student19 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   Success: Parking Lot 32 has been disabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student17", student5.equals(student17) ? student5.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been enabled.");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Credentials{login='Success: Parking Space 52 has been enabled.', password='\nid             -35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        '}", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Lot 10 has been enabled.'\nemail        Parking Lot 10 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager9 = new model.user.Manager(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        model.user.Student student12 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      32\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str13 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
        model.user.Student student14 = new model.user.Student(credentials3, "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student12", student6.equals(student12) ? student6.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Space 100 has been disabled.", "hi!");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Credentials credentials7 = student6.getCredentials();
        java.lang.String str8 = credentials7.toString();
        java.lang.String str9 = credentials7.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials7);
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager4 and manager10", manager4.equals(manager10) ? manager4.hashCode() == manager10.hashCode() : true);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        model.user.Client client13 = new model.user.Client(credentials9);
        java.lang.String str14 = credentials9.getPassword();
        model.user.Student student16 = new model.user.Student(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   Success: Parking Space 97 has been disabled.'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str17 = credentials9.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student16", student5.equals(student16) ? student5.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Lot -1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str14 = nonFacultyStaff13.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been enabled.");
        student12.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(100);
        parkingSpace8.setStatus(true);
        int int11 = parkingSpace8.getSpaceID();
        java.lang.String str12 = parkingSpace8.disableParkingSpace();
        parkingSpace8.setStatus(false);
        model.sensor.Sensor sensor15 = parkingSpace8.getSensor();
        java.lang.String str16 = parkingSpace8.disableParkingSpace();
        model.booking.Booking booking17 = new model.booking.Booking();
        booking17.setCost((-1.0d));
        int int20 = booking17.getTotalHours();
        parkingSpace8.setBooking(booking17);
        int int22 = booking17.getSpaceId();
        booking17.setLicensePlate("users.json");
        java.lang.String str25 = booking17.getEmail();
        boolean boolean26 = credentials3.equals((java.lang.Object) str25);
        model.user.Student student27 = new model.user.Student(credentials3);
        model.user.Visitor visitor28 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student27", student6.equals(student27) ? student6.hashCode() == student27.hashCode() : true);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        1\nlicensePlate   Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}'\ncost           -1.0\nstatus         null'\nemail        Parking Space 0 is already enabled.");
        java.lang.String str9 = credentials3.getPassword();
        model.user.Credentials credentials13 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str14 = credentials13.toString();
        java.lang.String str15 = credentials13.toString();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials13);
        model.user.Credentials credentials17 = nonFacultyStaff16.getCredentials();
        model.user.Client client18 = new model.user.Client(credentials17);
        model.booking.Booking booking19 = new model.booking.Booking();
        booking19.setStatus("Success: Parking Space 100 has been disabled.");
        int int22 = booking19.getEndTime();
        java.lang.String str23 = booking19.getStatus();
        java.lang.String str24 = booking19.toString();
        java.lang.Class<?> wildcardClass25 = booking19.getClass();
        boolean boolean26 = credentials17.equals((java.lang.Object) booking19);
        model.user.User user27 = new model.user.User(credentials17);
        boolean boolean28 = credentials3.equals((java.lang.Object) user27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials13", credentials3.equals(credentials13) ? credentials3.hashCode() == credentials13.hashCode() : true);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "NonFacultyStaff", "Success: Parking Space 10 has been disabled.");
        java.lang.String str4 = credentials3.getType();
        model.user.Student student6 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Failure: Parking Space 32 has active bookings. Parking Space has not been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null");
        model.user.Credentials credentials15 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student17 = new model.user.Student(credentials15, "");
        model.user.Visitor visitor18 = new model.user.Visitor(credentials15);
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials15, "Success: Parking Space 32 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null'\nemail        null");
        boolean boolean22 = credentials3.equals((java.lang.Object) credentials15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user12 = new model.user.User(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Parking Space 32 is already disabled.', password='Parking Lot 100 is already enabled.', type='Success: Parking Space 0 has been enabled.'}");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 0 has been enabled.");
        model.user.Client client16 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Parking Lot 0 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client16", client4.equals(client16) ? client4.hashCode() == client16.hashCode() : true);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Lot 52 has been disabled.");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        model.user.Credentials credentials15 = user14.getCredentials();
        model.user.Student student17 = new model.user.Student(credentials15, "Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 97 has been disabled.', type='Parking Space 97 is already enabled.'}");
        model.user.Visitor visitor18 = new model.user.Visitor(credentials15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student17", student8.equals(student17) ? student8.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.User user8 = new model.user.User(credentials3);
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        java.lang.Class<?> wildcardClass11 = credentials3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        java.lang.String str14 = credentials3.getLogin();
        java.lang.String str15 = credentials3.getLogin();
        model.user.User user19 = new model.user.User("", "", "");
        model.user.Credentials credentials20 = user19.getCredentials();
        java.lang.String str21 = credentials20.getLogin();
        strategy.FacultyParkingRate facultyParkingRate22 = new strategy.FacultyParkingRate();
        double double24 = facultyParkingRate22.calculateRate((-5.0d));
        boolean boolean25 = credentials20.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager26 = new model.user.Manager(credentials20);
        boolean boolean27 = credentials3.equals((java.lang.Object) manager26);
        model.user.FacultyMember facultyMember28 = new model.user.FacultyMember(credentials3);
        java.lang.String str29 = facultyMember28.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember28", facultyMember11.equals(facultyMember28) ? facultyMember11.hashCode() == facultyMember28.hashCode() : true);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials9 = visitor8.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor8", visitor6.equals(visitor8) ? visitor6.hashCode() == visitor8.hashCode() : true);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.booking.Booking booking11 = new model.booking.Booking();
        booking11.setEmail("SuperManager");
        java.util.Date date14 = booking11.getStartDateTime();
        booking11.setStartTime((int) (byte) -1);
        booking11.setStartTime((int) (byte) -1);
        java.util.Date date19 = booking11.getDate();
        boolean boolean20 = credentials3.equals((java.lang.Object) date19);
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 10 has been disabled.");
        model.user.Credentials credentials23 = null;
        model.user.Student student25 = new model.user.Student(credentials23, "Manager");
        boolean boolean26 = nonFacultyStaff22.equals((java.lang.Object) "Manager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff22", nonFacultyStaff6.equals(nonFacultyStaff22) ? nonFacultyStaff6.hashCode() == nonFacultyStaff22.hashCode() : true);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Student");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "Credentials{login='Success: Parking Space 10 has been disabled.', password='FacultyMember', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null'}", "\nid             10\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.Student student7 = new model.user.Student(credentials4);
        model.user.Student student9 = new model.user.Student(credentials4, "Parking Lot 87 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           750.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.User user13 = new model.user.User(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user9 and user13", user9.equals(user13) ? user9.hashCode() == user13.hashCode() : true);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials4);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials4, "Credentials{login='Success: Parking Lot 35 has been disabled.', password='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}'\ncost           -1.0\nstatus         null'\nemail        Parking Space 0 is already enabled.', type='Credentials{login='', password='', type=''}'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember11", facultyMember10.equals(facultyMember11) ? facultyMember10.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        java.lang.String str11 = credentials3.getType();
        model.user.User user12 = new model.user.User(credentials3);
        model.user.Client client13 = new model.user.Client(credentials3);
        java.lang.String str14 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client13", client6.equals(client13) ? client6.hashCode() == client13.hashCode() : true);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        java.lang.String str4 = credentials3.getType();
        model.parking.ParkingLot parkingLot7 = new model.parking.ParkingLot((int) '4', "Student");
        java.lang.String str8 = parkingLot7.enableParkingLot();
        java.lang.String str9 = parkingLot7.disableParkingLot();
        boolean boolean10 = credentials3.equals((java.lang.Object) str9);
        model.user.Student student12 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3);
        model.user.Credentials credentials18 = new model.user.Credentials("Parking Lot 10 is already disabled.", "Success: Parking Space 100 has been disabled.", "");
        model.user.Visitor visitor19 = new model.user.Visitor(credentials18);
        boolean boolean20 = credentials3.equals((java.lang.Object) visitor19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Space 100 has been disabled.", "hi!");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Credentials credentials7 = student6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7, "", "Success: Parking Lot -35 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.getPassword();
        model.user.Student student9 = new model.user.Student(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.Manager manager13 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Client client17 = new model.user.Client(credentials3);
        model.user.Client client18 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client17", client4.equals(client17) ? client4.hashCode() == client17.hashCode() : true);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        java.lang.String str16 = credentials3.getPassword();
        model.user.Student student17 = new model.user.Student(credentials3);
        java.lang.String str18 = student17.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student17", student5.equals(student17) ? student5.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        model.user.Client client3 = new model.user.Client("Parking Lot 0 is already enabled.", "Success: Parking Lot 97 has been disabled.", "Parking Lot 0 is already enabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.Student student6 = new model.user.Student(credentials4, "Success: Parking Space 35 has been disabled.");
        model.user.Student student7 = new model.user.Student(credentials4);
        model.user.Student student8 = new model.user.Student(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 0 has been enabled.");
        model.user.Client client16 = new model.user.Client(credentials3);
        model.user.Credentials credentials17 = client16.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client16", client4.equals(client16) ? client4.hashCode() == client16.hashCode() : true);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager10 = new model.user.Manager(credentials4);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials4);
        model.user.User user12 = new model.user.User(credentials4);
        model.user.Client client13 = new model.user.Client(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user3 and user12", user3.equals(user12) ? user3.hashCode() == user12.hashCode() : true);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        java.lang.String str9 = credentials3.toString();
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 0 is already enabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Credentials{login='Success: Parking Lot 32 has been disabled.', password='Success: Parking Lot 100 has been disabled.', type='Success: Parking Lot 52 has been disabled.'}");
        java.lang.Class<?> wildcardClass14 = facultyMember13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember13", facultyMember8.equals(facultyMember13) ? facultyMember8.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = facultyMember11.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember11", facultyMember10.equals(facultyMember11) ? facultyMember10.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 0 has been enabled.");
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 100 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff12", nonFacultyStaff4.equals(nonFacultyStaff12) ? nonFacultyStaff4.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 52 has been disabled.");
        model.user.Student student9 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager10 = new model.user.Manager(credentials4);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials4);
        model.user.Student student13 = new model.user.Student(credentials4, "users.json");
        model.user.Student student14 = new model.user.Student(credentials4);
        student14.setStudentId("Success: Parking Space 52 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student13 and student14", student13.equals(student14) ? student13.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user5 = new model.user.User(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "Parking Space 100 is already enabled.");
        nonFacultyStaff9.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Lot 32 is already disabled.'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff9", nonFacultyStaff4.equals(nonFacultyStaff9) ? nonFacultyStaff4.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "\nid             10\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str18 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff17", nonFacultyStaff10.equals(nonFacultyStaff17) ? nonFacultyStaff10.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Parking Space 10 is already enabled.", "Parking Space 32 is already disabled.");
        model.user.User user4 = new model.user.User(credentials3);
        model.user.User user5 = new model.user.User(credentials3);
        java.lang.String str6 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user4 and user5", user4.equals(user5) ? user4.hashCode() == user5.hashCode() : true);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test903");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Student");
        java.lang.String str11 = credentials3.getType();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str14 = nonFacultyStaff13.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff13", nonFacultyStaff4.equals(nonFacultyStaff13) ? nonFacultyStaff4.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test904");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 10 has been disabled.", "Visitor");
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test905");
        model.user.Credentials credentials3 = new model.user.Credentials("", "Success: Parking Lot 0 has been disabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        nonFacultyStaff5.setRole("\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Credentials credentials8 = nonFacultyStaff5.getCredentials();
        model.user.Visitor visitor9 = new model.user.Visitor(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials8);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff10", nonFacultyStaff5.equals(nonFacultyStaff10) ? nonFacultyStaff5.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test906");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Parking Lot 0 is already disabled.");
        model.user.User user14 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test907");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Student student13 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   NonFacultyStaff'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test908");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager10 = new model.user.Manager(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials4);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials4, "Parking Space -100 is already disabled.");
        model.user.User user15 = model.user.UserFactory.createAccount(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff14", nonFacultyStaff11.equals(nonFacultyStaff14) ? nonFacultyStaff11.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test909");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Visitor", "Success: Parking Lot 52 has been disabled.");
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "", "Parking Space -1 is already enabled.");
        java.lang.String str14 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test910");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        java.lang.String str13 = credentials3.getLogin();
        model.user.Client client14 = new model.user.Client(credentials3);
        boolean boolean15 = client14.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client14", client4.equals(client14) ? client4.hashCode() == client14.hashCode() : true);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test911");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 52 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff9", nonFacultyStaff4.equals(nonFacultyStaff9) ? nonFacultyStaff4.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test912");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student10 = new model.user.Student(credentials3);
        student10.setStudentId("Credentials{login='Success: Parking Space 100 has been disabled.', password='Success: Parking Space -1 has been enabled.', type='Success: Parking Space -1 has been enabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test913");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Space 100 has been disabled.", "hi!");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Credentials credentials7 = student6.getCredentials();
        model.user.Student student9 = new model.user.Student(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   NonFacultyStaff'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        Parking Space 0 is already enabled.", "Success: Parking Lot -1 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test914");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 10 has been disabled.", "Visitor");
        strategy.NonFacultyParkingRate nonFacultyParkingRate15 = new strategy.NonFacultyParkingRate();
        double double17 = nonFacultyParkingRate15.calculateRate((double) 1L);
        double double19 = nonFacultyParkingRate15.calculateRate(50.0d);
        double double21 = nonFacultyParkingRate15.calculateRate((double) (byte) -1);
        double double23 = nonFacultyParkingRate15.calculateRate(520000.0d);
        double double25 = nonFacultyParkingRate15.calculateRate((double) 52);
        double double27 = nonFacultyParkingRate15.calculateRate(1600.0d);
        boolean boolean28 = credentials3.equals((java.lang.Object) nonFacultyParkingRate15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test915");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "Failure: Parking Space -1 has active bookings. Parking Space has not been disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7, "", "Success: Parking Lot -1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test916");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        facultyMember13.setFacultyName("Parking Lot 0 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember13", facultyMember8.equals(facultyMember13) ? facultyMember8.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test917");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Student");
        model.user.Credentials credentials11 = facultyMember10.getCredentials();
        java.lang.String str12 = credentials11.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials11, "Failure: Parking Space -1 has active bookings. Parking Space has not been disabled.");
        java.lang.String str15 = nonFacultyStaff14.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff14", nonFacultyStaff4.equals(nonFacultyStaff14) ? nonFacultyStaff4.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test918");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = facultyMember9.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test919");
        model.user.Credentials credentials3 = new model.user.Credentials("", "Success: Parking Lot 0 has been disabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        nonFacultyStaff5.setRole("\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Credentials credentials8 = nonFacultyStaff5.getCredentials();
        model.user.Visitor visitor9 = new model.user.Visitor(credentials8);
        java.lang.String str10 = credentials8.toString();
        model.user.Student student12 = new model.user.Student(credentials8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   Success: Parking Space 97 has been disabled.'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Student student14 = new model.user.Student(credentials8, "hi!");
        student14.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test920");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.booking.Booking booking9 = new model.booking.Booking();
        booking9.setStatus("Success: Parking Space 100 has been disabled.");
        int int12 = booking9.getTotalHours();
        booking9.setStatus("");
        java.lang.String str15 = booking9.toString();
        int int16 = booking9.getLotId();
        java.util.Date date17 = booking9.getDate();
        boolean boolean18 = credentials3.equals((java.lang.Object) date17);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student21 = new model.user.Student(credentials3, "Parking Lot -1 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff19", nonFacultyStaff5.equals(nonFacultyStaff19) ? nonFacultyStaff5.hashCode() == nonFacultyStaff19.hashCode() : true);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test921");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str15 = credentials3.getLogin();
        java.lang.String str16 = credentials3.getPassword();
        model.user.Student student17 = new model.user.Student(credentials3);
        boolean boolean18 = student17.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student17", student5.equals(student17) ? student5.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test922");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager10 = new model.user.Manager(credentials4);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials4);
        model.user.Student student13 = new model.user.Student(credentials4, "users.json");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials4, "Success: Parking Space -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager'\nemail        SuperManager");
        java.lang.String str17 = credentials4.getType();
        model.user.Student student19 = new model.user.Student(credentials4, "hi!");
        student19.setStudentId("Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 97 has been disabled.', type='Parking Space 97 is already enabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student13 and student19", student13.equals(student19) ? student13.hashCode() == student19.hashCode() : true);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test923");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        java.lang.String str9 = credentials3.toString();
        boolean boolean11 = credentials3.equals((java.lang.Object) 16640.0d);
        model.user.Student student13 = new model.user.Student(credentials3, "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.User user14 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test924");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.User user9 = new model.user.User(credentials7);
        model.user.Credentials credentials10 = user9.getCredentials();
        java.lang.String str11 = credentials10.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10);
        java.lang.String str13 = nonFacultyStaff12.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test925");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Lot 97 is already disabled.", "Success: Parking Space -1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Lot 10 has been enabled.'\nemail        Parking Lot 10 is already disabled.");
        java.lang.String str4 = credentials3.getType();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.user.User user8 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager7", manager6.equals(manager7) ? manager6.hashCode() == manager7.hashCode() : true);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test926");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str8 = nonFacultyStaff7.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff7", nonFacultyStaff5.equals(nonFacultyStaff7) ? nonFacultyStaff5.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test927");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyId();
        facultyMember3.validateAccount();
        java.lang.String str9 = facultyMember3.getFacultyName();
        model.user.Credentials credentials13 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials13, "Manager");
        model.user.Client client16 = new model.user.Client(credentials13);
        model.user.Student student18 = new model.user.Student(credentials13, "Parking Space 100 is already disabled.");
        java.lang.String str19 = credentials13.getType();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials13, "FacultyMember", "Success: Parking Lot -1 has been disabled.");
        model.user.User user23 = new model.user.User(credentials13);
        boolean boolean24 = facultyMember3.equals((java.lang.Object) user23);
        model.user.Credentials credentials25 = user23.getCredentials();
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials25);
        facultyMember26.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember22 and facultyMember26", facultyMember22.equals(facultyMember26) ? facultyMember22.hashCode() == facultyMember26.hashCode() : true);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test928");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials15 = visitor14.getCredentials();
        model.user.Student student16 = new model.user.Student(credentials15);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student16", student7.equals(student16) ? student7.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test929");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         SuperManager'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test930");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        model.user.User user13 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager12", manager8.equals(manager12) ? manager8.hashCode() == manager12.hashCode() : true);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test931");
        model.user.Client client3 = new model.user.Client("Parking Lot 0 is already enabled.", "Success: Parking Lot 97 has been disabled.", "Parking Lot 0 is already enabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.User user5 = model.user.UserFactory.createAccount(credentials4);
        model.user.Student student7 = new model.user.Student(credentials4, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        ");
        java.lang.String str8 = student7.getStudentId();
        model.user.Credentials credentials12 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student14 = new model.user.Student(credentials12, "");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials12);
        java.lang.String str16 = credentials12.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials12, "");
        boolean boolean19 = student7.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff15 and nonFacultyStaff18", nonFacultyStaff15.equals(nonFacultyStaff18) ? nonFacultyStaff15.hashCode() == nonFacultyStaff18.hashCode() : true);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test932");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.Credentials credentials12 = nonFacultyStaff11.getCredentials();
        model.user.Student student13 = new model.user.Student(credentials12);
        java.lang.String str14 = student13.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student13", student5.equals(student13) ? student5.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test933");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null", "Success: Parking Lot 32 has been enabled.", "Parking Lot 97 is already enabled.");
        model.user.Visitor visitor4 = new model.user.Visitor(credentials3);
        java.lang.String str5 = credentials3.getLogin();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor4 and visitor6", visitor4.equals(visitor6) ? visitor4.hashCode() == visitor6.hashCode() : true);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test934");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Space 0 has been disabled.", "Manager");
        strategy.FacultyParkingRate facultyParkingRate14 = new strategy.FacultyParkingRate();
        double double16 = facultyParkingRate14.calculateRate((double) 0);
        double double18 = facultyParkingRate14.calculateRate((double) (-32));
        double double20 = facultyParkingRate14.calculateRate(100.0d);
        double double22 = facultyParkingRate14.calculateRate((double) 'a');
        double double24 = facultyParkingRate14.calculateRate(525.0d);
        double double26 = facultyParkingRate14.calculateRate((double) 100L);
        double double28 = facultyParkingRate14.calculateRate(0.0d);
        boolean boolean29 = facultyMember13.equals((java.lang.Object) double28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test935");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9, "Parking Space 32 is already enabled.", "Success: Parking Lot 32 has been disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember13", facultyMember12.equals(facultyMember13) ? facultyMember12.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test936");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.getType();
        model.user.User user8 = new model.user.User(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user8", user6.equals(user8) ? user6.hashCode() == user8.hashCode() : true);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test937");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.User user12 = new model.user.User(credentials9);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        java.lang.String str14 = facultyMember13.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember13", facultyMember8.equals(facultyMember13) ? facultyMember8.hashCode() == facultyMember13.hashCode() : true);
    }
}

