import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Space 100 has been disabled.");
        model.user.Credentials credentials8 = null;
        model.user.Manager manager9 = new model.user.Manager(credentials8);
        manager9.validateAccount();
        model.user.Credentials credentials11 = manager9.getCredentials();
        boolean boolean12 = manager9.getValidationStatus();
        boolean boolean13 = credentials3.equals((java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        model.user.Student student9 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        student8.setStudentId("Parking Lot 10 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        facultyMember14.setFacultyId("Parking Space -1 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        model.user.Credentials credentials8 = null;
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials8, "Student", "");
        facultyMember11.setFacultyId("Student");
        facultyMember11.setFacultyName("NonFacultyStaff");
        boolean boolean16 = student7.equals((java.lang.Object) "NonFacultyStaff");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str15 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Space 100 has been disabled.");
        student7.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.booking.Booking booking15 = new model.booking.Booking();
        booking15.setStatus("Success: Parking Space 100 has been disabled.");
        int int18 = booking15.getTotalHours();
        int int19 = booking15.getStartTime();
        java.lang.String str20 = booking15.getEmail();
        boolean boolean21 = credentials3.equals((java.lang.Object) str20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff4.setRole("users.json");
        model.user.Credentials credentials10 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student12 = new model.user.Student(credentials10, "");
        java.lang.String str13 = credentials10.toString();
        model.user.User user14 = new model.user.User(credentials10);
        model.user.Manager manager15 = new model.user.Manager(credentials10);
        boolean boolean16 = nonFacultyStaff4.equals((java.lang.Object) manager15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials10", credentials3.equals(credentials10) ? credentials3.hashCode() == credentials10.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.Student student10 = new model.user.Student(credentials3, "Parking Space 32 is already enabled.");
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Space -1 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials10 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student12 = new model.user.Student(credentials10, "");
        model.user.User user13 = new model.user.User(credentials10);
        model.user.Student student14 = new model.user.Student(credentials10);
        boolean boolean15 = user6.equals((java.lang.Object) student14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials10", credentials3.equals(credentials10) ? credentials3.hashCode() == credentials10.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        java.lang.String str15 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager14", manager8.equals(manager14) ? manager8.hashCode() == manager14.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 100 has been disabled.");
        nonFacultyStaff10.setRole("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff10", nonFacultyStaff7.equals(nonFacultyStaff10) ? nonFacultyStaff7.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        java.lang.String str15 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager14", manager8.equals(manager14) ? manager8.hashCode() == manager14.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        student8.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        java.lang.String str10 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.User user10 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        java.lang.String str10 = student9.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
        model.user.Credentials credentials15 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials15);
        java.lang.String str17 = nonFacultyStaff16.getRole();
        java.lang.String str18 = nonFacultyStaff16.getRole();
        java.lang.String str19 = nonFacultyStaff16.getRole();
        boolean boolean20 = student11.equals((java.lang.Object) str19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        model.user.User user9 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 100 has been disabled.");
        model.user.Visitor visitor11 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff10", nonFacultyStaff7.equals(nonFacultyStaff10) ? nonFacultyStaff7.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 100 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff10", nonFacultyStaff7.equals(nonFacultyStaff10) ? nonFacultyStaff7.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Space 100 has been disabled.");
        model.booking.Booking booking8 = new model.booking.Booking();
        booking8.setStatus("Success: Parking Space 100 has been disabled.");
        int int11 = booking8.getEndTime();
        booking8.setEmail("");
        java.lang.String str14 = booking8.getStatus();
        booking8.setStatus("Success: Parking Lot 10 has been enabled.");
        java.util.Date date17 = null;
        booking8.setEndDateTime(date17);
        boolean boolean19 = credentials3.equals((java.lang.Object) date17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = facultyMember3.getFacultyName();
        model.user.Credentials credentials11 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str12 = credentials11.toString();
        model.user.Student student13 = new model.user.Student(credentials11);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials11);
        model.user.Student student16 = new model.user.Student(credentials11, "Success: Parking Space 52 has been disabled.");
        boolean boolean17 = facultyMember3.equals((java.lang.Object) student16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student13 and student16", student13.equals(student16) ? student13.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Credentials credentials12 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client13 = new model.user.Client(credentials12);
        model.user.User user14 = model.user.UserFactory.createAccount(credentials12);
        model.user.Student student16 = new model.user.Student(credentials12, "users.json");
        java.lang.String str17 = credentials12.getLogin();
        model.user.Student student18 = new model.user.Student(credentials12);
        boolean boolean19 = student8.equals((java.lang.Object) student18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Lot 0 has been enabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember12", facultyMember8.equals(facultyMember12) ? facultyMember8.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager7", manager6.equals(manager7) ? manager6.hashCode() == manager7.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Credentials credentials13 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials13);
        java.lang.String str15 = credentials13.toString();
        model.user.Student student17 = new model.user.Student(credentials13, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials13);
        boolean boolean19 = credentials3.equals((java.lang.Object) facultyMember18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials13", credentials3.equals(credentials13) ? credentials3.hashCode() == credentials13.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        student10.setStudentId("Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
        java.lang.String str8 = student7.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials3);
        model.user.Credentials credentials19 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client20 = new model.user.Client(credentials19);
        boolean boolean21 = client15.equals((java.lang.Object) credentials19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials19", credentials3.equals(credentials19) ? credentials3.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.User user10 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.Student student12 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 100 has been disabled.");
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff10", nonFacultyStaff7.equals(nonFacultyStaff10) ? nonFacultyStaff7.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
        boolean boolean12 = student11.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        student10.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        facultyMember7.setFacultyId("Parking Space 100 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 35 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Success: Parking Space 52 has been enabled.", "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been enabled.");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Success: Parking Space 10 has been enabled.", "Success: Parking Lot 10 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff4.setRole("Success: Parking Lot 97 has been disabled.");
        boolean boolean7 = nonFacultyStaff4.getValidationStatus();
        model.user.Credentials credentials11 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials11, "Manager");
        model.user.Client client14 = new model.user.Client(credentials11);
        model.user.Student student16 = new model.user.Student(credentials11, "Success: Parking Lot 0 has been disabled.");
        boolean boolean17 = nonFacultyStaff4.equals((java.lang.Object) "Success: Parking Lot 0 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials11", credentials3.equals(credentials11) ? credentials3.hashCode() == credentials11.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "", "Success: Parking Space -1 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getLogin();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        boolean boolean15 = facultyMember14.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Credentials credentials12 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student14 = new model.user.Student(credentials12, "");
        model.user.Student student16 = new model.user.Student(credentials12, "Success: Parking Space 100 has been disabled.");
        boolean boolean17 = credentials3.equals((java.lang.Object) credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "");
        java.lang.String str12 = student11.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials10 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client11 = new model.user.Client(credentials10);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials10);
        model.user.Student student14 = new model.user.Student(credentials10, "users.json");
        java.lang.String str15 = credentials10.getType();
        boolean boolean16 = credentials3.equals((java.lang.Object) str15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials10", credentials3.equals(credentials10) ? credentials3.hashCode() == credentials10.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str9 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        java.lang.String str9 = student8.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 1 has been disabled.");
        model.parking.ParkingLot parkingLot16 = new model.parking.ParkingLot((int) (short) 0, "hi!");
        parkingLot16.setLocation("");
        parkingLot16.setLotID((int) 'a');
        parkingLot16.setLocation("");
        boolean boolean23 = parkingLot16.getStatus();
        parkingLot16.setLotID((int) (byte) 10);
        parkingLot16.setLotID((int) (short) -1);
        boolean boolean28 = parkingLot16.getStatus();
        parkingLot16.setLocation("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        boolean boolean31 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        java.lang.String str9 = student8.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
        model.user.User user12 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        student10.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getLogin();
        model.user.Credentials credentials14 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials14);
        java.lang.String str16 = credentials14.getPassword();
        model.user.Manager manager17 = new model.user.Manager(credentials14);
        boolean boolean18 = credentials3.equals((java.lang.Object) manager17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials14", credentials3.equals(credentials14) ? credentials3.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        java.lang.String str14 = student13.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        java.lang.String str8 = student7.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Space 100 has been disabled.");
        boolean boolean8 = student7.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 1 has been disabled.");
        java.lang.Class<?> wildcardClass14 = student13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Lot 0 has been enabled.");
        model.user.Student student14 = new model.user.Student(credentials9, "Success: Parking Space 52 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember12", facultyMember8.equals(facultyMember12) ? facultyMember8.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.Student student15 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Space 100 has been disabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        student7.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        model.user.User user14 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.User user10 = new model.user.User(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student9", student8.equals(student9) ? student8.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        model.booking.Booking booking11 = new model.booking.Booking();
        booking11.setStatus("Success: Parking Space 100 has been disabled.");
        int int14 = booking11.getEndTime();
        java.lang.String str15 = booking11.getStatus();
        java.lang.String str16 = booking11.toString();
        java.lang.String str17 = booking11.getEmail();
        java.util.Date date18 = booking11.getStartDateTime();
        booking11.setStatus("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        boolean boolean21 = credentials9.equals((java.lang.Object) booking11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3, "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager14", manager8.equals(manager14) ? manager8.hashCode() == manager14.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str9 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager9", manager6.equals(manager9) ? manager6.hashCode() == manager9.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        java.lang.String str12 = student11.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        java.lang.String str10 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        model.user.Credentials credentials15 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str16 = credentials15.toString();
        model.user.Student student17 = new model.user.Student(credentials15);
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials15);
        facultyMember18.validateAccount();
        boolean boolean20 = credentials3.equals((java.lang.Object) facultyMember18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff8.setRole("Parking Lot 0 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        boolean boolean12 = user11.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user9 and user11", user9.equals(user11) ? user9.hashCode() == user11.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        model.user.Credentials credentials8 = student7.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        SuperManager");
        model.user.Student student13 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been enabled.");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Student");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff8.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "Success: Parking Space 97 has been disabled.");
        nonFacultyStaff10.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        model.user.User user9 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        model.user.Client client11 = new model.user.Client(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Client client13 = new model.user.Client("", "", "SuperManager");
        model.booking.Booking booking14 = new model.booking.Booking();
        booking14.setStatus("Success: Parking Space 100 has been disabled.");
        int int17 = booking14.getEndTime();
        java.util.Date date18 = booking14.getStartDateTime();
        booking14.setCost((double) (short) 1);
        int int21 = booking14.getId();
        boolean boolean22 = client13.equals((java.lang.Object) booking14);
        java.util.Date date23 = booking14.getEndDateTime();
        java.lang.String str24 = booking14.getStatus();
        booking14.setEndTime((int) (short) 1);
        int int27 = booking14.getLotId();
        boolean boolean28 = credentials7.equals((java.lang.Object) booking14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student9", student8.equals(student9) ? student8.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Lot 0 has been enabled.");
        java.lang.String str13 = credentials9.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember12", facultyMember8.equals(facultyMember12) ? facultyMember8.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials12);
        model.user.Visitor visitor14 = new model.user.Visitor(credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.Client client15 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        student14.setStudentId("Success: Parking Space 1 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "Success: Parking Space 97 has been disabled.");
        java.lang.String str11 = nonFacultyStaff10.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        model.user.Credentials credentials0 = null;
        model.user.Student student2 = new model.user.Student(credentials0, "FacultyMember");
        student2.setStudentId("Success: Parking Space 100 has been enabled.");
        model.user.Credentials credentials5 = null;
        model.user.Student student7 = new model.user.Student(credentials5, "hi!");
        student7.validateAccount();
        student7.setStudentId("");
        student7.setStudentId("Success: Parking Space 32 has been disabled.");
        boolean boolean13 = student2.equals((java.lang.Object) "Success: Parking Space 32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student2 and student7", student2.equals(student7) ? student2.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        java.lang.String str8 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        boolean boolean14 = student13.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.Object obj10 = null;
        boolean boolean11 = credentials7.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager9", manager6.equals(manager9) ? manager6.hashCode() == manager9.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        student8.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Credentials credentials12 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student14 = new model.user.Student(credentials12, "");
        strategy.VisitorParkingRate visitorParkingRate15 = new strategy.VisitorParkingRate();
        double double17 = visitorParkingRate15.calculateRate(1.0d);
        double double19 = visitorParkingRate15.calculateRate((double) (byte) 100);
        boolean boolean20 = credentials12.equals((java.lang.Object) visitorParkingRate15);
        java.lang.String str21 = credentials12.toString();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials12);
        boolean boolean23 = credentials3.equals((java.lang.Object) credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "Parking Lot 0 is already disabled.");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str9 = student8.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Parking Space 97 is already enabled.");
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember11", facultyMember6.equals(facultyMember11) ? facultyMember6.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        model.user.User user18 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff16 and nonFacultyStaff17", nonFacultyStaff16.equals(nonFacultyStaff17) ? nonFacultyStaff16.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 1 has been disabled.");
        java.lang.String str14 = student13.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff8.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.toString();
        model.user.Student student10 = new model.user.Student(credentials3);
        boolean boolean11 = student10.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getPassword();
        model.user.Student student15 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        student15.setStudentId("Parking Space 97 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student15", student7.equals(student15) ? student7.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        java.lang.String str12 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember11", facultyMember7.equals(facultyMember11) ? facultyMember7.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.User user10 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str15 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        facultyMember18.setFacultyName("Parking Space 100 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember18", facultyMember14.equals(facultyMember18) ? facultyMember14.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = student10.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        student18.setStudentId("Parking Lot -1 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student18", student5.equals(student18) ? student5.hashCode() == student18.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getLogin();
        model.user.Client client11 = new model.user.Client(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client11", client4.equals(client11) ? client4.hashCode() == client11.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17, "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember18", facultyMember9.equals(facultyMember18) ? facultyMember9.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Manager manager8 = new model.user.Manager(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager8", manager6.equals(manager8) ? manager6.hashCode() == manager8.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 10 has been disabled.", "Visitor");
        java.lang.String str15 = facultyMember14.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3);
        student7.setStudentId("Parking Lot 52 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 10 has been disabled.", "Visitor");
        model.booking.Booking booking15 = new model.booking.Booking();
        booking15.setStatus("Success: Parking Space 100 has been disabled.");
        int int18 = booking15.getEndTime();
        java.lang.String str19 = booking15.getStatus();
        java.lang.String str20 = booking15.toString();
        java.lang.String str21 = booking15.getEmail();
        java.util.Date date22 = booking15.getStartDateTime();
        booking15.setStartTime((int) (short) 10);
        java.lang.String str25 = booking15.toString();
        booking15.setId((-35));
        boolean boolean28 = credentials3.equals((java.lang.Object) (-35));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 97 is already enabled.", "Manager", "");
        model.user.Student student5 = new model.user.Student(credentials3, "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been disabled.");
        student7.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        java.lang.String str8 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor16 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor17 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor15 and visitor16", visitor15.equals(visitor16) ? visitor15.hashCode() == visitor16.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getPassword();
        model.user.Student student15 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Student student17 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student15", student7.equals(student15) ? student7.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials7);
        java.lang.String str9 = credentials7.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        model.user.User user8 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Space 100 has been disabled.", "Success: Parking Space 10 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Parking Space 97 is already enabled.");
        facultyMember11.setFacultyId("Visitor");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember11", facultyMember6.equals(facultyMember11) ? facultyMember6.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Parking Lot 52 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student8", student7.equals(student8) ? student7.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Lot 97 is already enabled.", "Success: Parking Space 97 has been disabled.", "Student");
        model.user.Student student5 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        SuperManager");
        model.user.Credentials credentials9 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client10 = new model.user.Client(credentials9);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials9);
        model.user.Student student13 = new model.user.Student(credentials9, "users.json");
        model.user.Student student15 = new model.user.Student(credentials9, "hi!");
        boolean boolean16 = student5.equals((java.lang.Object) credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student13 and student15", student13.equals(student15) ? student13.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 52 has been disabled.");
        student8.setStudentId("Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        student7.setStudentId("Success: Parking Space 52 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client7", client6.equals(client7) ? client6.hashCode() == client7.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Student student11 = new model.user.Student(credentials9, "users.json");
        java.lang.String str12 = credentials9.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 100 has been disabled.");
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff10", nonFacultyStaff7.equals(nonFacultyStaff10) ? nonFacultyStaff7.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        nonFacultyStaff8.setRole("Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Manager manager8 = new model.user.Manager(credentials7);
        model.booking.Booking booking9 = new model.booking.Booking();
        booking9.setStatus("Success: Parking Space 100 has been disabled.");
        int int12 = booking9.getEndTime();
        java.util.Date date13 = booking9.getStartDateTime();
        java.util.Date date14 = booking9.getStartDateTime();
        booking9.setStatus("hi!");
        double double17 = booking9.getCost();
        java.util.Date date18 = booking9.getEndDateTime();
        int int19 = booking9.getStartTime();
        java.lang.String str20 = booking9.toString();
        boolean boolean21 = manager8.equals((java.lang.Object) booking9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager8", manager6.equals(manager8) ? manager6.hashCode() == manager8.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 52 has been disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials7);
        nonFacultyStaff8.setRole("Parking Lot 10 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Parking Space 97 is already enabled.");
        strategy.VisitorParkingRate visitorParkingRate12 = new strategy.VisitorParkingRate();
        double double14 = visitorParkingRate12.calculateRate(1.0d);
        boolean boolean15 = credentials3.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember11", facultyMember6.equals(facultyMember11) ? facultyMember6.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        visitor12.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor10 and visitor12", visitor10.equals(visitor12) ? visitor10.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str13 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user9 and user11", user9.equals(user11) ? user9.hashCode() == user11.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        model.user.Student student15 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager14", manager8.equals(manager14) ? manager8.hashCode() == manager14.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor16 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials3, "Parking Space 52 is already enabled.", "Success: Parking Space 35 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor15 and visitor16", visitor15.equals(visitor16) ? visitor15.hashCode() == visitor16.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str8 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff7", nonFacultyStaff5.equals(nonFacultyStaff7) ? nonFacultyStaff5.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Student student12 = new model.user.Student(credentials3, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Success: Parking Space 52 has been disabled.");
        java.lang.String str9 = student8.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        model.user.User user21 = model.user.UserFactory.createAccount(credentials17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember20", facultyMember9.equals(facultyMember20) ? facultyMember9.hashCode() == facultyMember20.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "Success: Parking Space 52 has been enabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = facultyMember9.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 100 has been disabled.");
        nonFacultyStaff10.setRole("Success: Parking Lot -1 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff10", nonFacultyStaff7.equals(nonFacultyStaff10) ? nonFacultyStaff7.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Lot -1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.toString();
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 1 has been disabled.");
        student13.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student13", student7.equals(student13) ? student7.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        boolean boolean11 = credentials3.equals((java.lang.Object) "Manager");
        java.lang.String str12 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str14 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        student11.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        facultyMember18.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember18", facultyMember9.equals(facultyMember18) ? facultyMember9.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        model.user.Student student19 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff16 and nonFacultyStaff17", nonFacultyStaff16.equals(nonFacultyStaff17) ? nonFacultyStaff16.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        student14.setStudentId("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str9 = nonFacultyStaff8.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Visitor", "Success: Parking Lot 52 has been disabled.");
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "", "Parking Space -1 is already enabled.");
        facultyMember13.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 0 has been enabled.");
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 100 has been disabled.");
        model.user.Credentials credentials15 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student17 = new model.user.Student(credentials15, "");
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials15);
        boolean boolean19 = credentials3.equals((java.lang.Object) credentials15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str9 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials8 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials8, "Manager");
        model.user.Student student12 = new model.user.Student(credentials8, "Student");
        model.user.User user13 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user14 = new model.user.User(credentials8);
        model.user.Student student15 = new model.user.Student(credentials8);
        boolean boolean16 = credentials3.equals((java.lang.Object) credentials8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials8", credentials3.equals(credentials8) ? credentials3.hashCode() == credentials8.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot 97 is already enabled.");
        boolean boolean15 = student14.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        java.lang.String str8 = facultyMember7.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Parking Space 97 is already enabled.");
        facultyMember11.setFacultyId("Parking Lot 32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember11", facultyMember6.equals(facultyMember11) ? facultyMember6.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        java.lang.String str14 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember13", facultyMember11.equals(facultyMember13) ? facultyMember11.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        model.user.Manager manager9 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        model.user.Credentials credentials19 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str20 = credentials19.toString();
        model.user.Student student22 = new model.user.Student(credentials19, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        student22.setStudentId("Success: Parking Lot 100 has been disabled.");
        java.lang.String str25 = student22.getStudentId();
        boolean boolean26 = credentials3.equals((java.lang.Object) student22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials19", credentials3.equals(credentials19) ? credentials3.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getPassword();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        model.user.Credentials credentials12 = student11.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student11", student6.equals(student11) ? student6.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        student7.setStudentId("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getType();
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   Success: Parking Lot 32 has been disabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student9", student6.equals(student9) ? student6.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "Success: Parking Space 10 has been enabled.", "Visitor");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember11", facultyMember8.equals(facultyMember11) ? facultyMember8.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Visitor visitor11 = new model.user.Visitor(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Failure: Parking Space -1 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor11", visitor7.equals(visitor11) ? visitor7.hashCode() == visitor11.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "Success: Parking Space 52 has been enabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Student student11 = new model.user.Student(credentials9, "users.json");
        model.user.Student student13 = new model.user.Student(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        model.user.User user3 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 52 has been enabled.");
        model.user.Credentials credentials7 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student9 = new model.user.Student(credentials7, "");
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        nonFacultyStaff10.validateAccount();
        java.lang.String str12 = nonFacultyStaff10.getRole();
        model.user.Credentials credentials13 = nonFacultyStaff10.getCredentials();
        model.user.Student student14 = new model.user.Student(credentials13);
        boolean boolean15 = user3.equals((java.lang.Object) credentials13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student9 and student14", student9.equals(student14) ? student9.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.Credentials credentials12 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client13 = new model.user.Client(credentials12);
        model.user.User user14 = model.user.UserFactory.createAccount(credentials12);
        model.user.Student student16 = new model.user.Student(credentials12, "users.json");
        model.user.Manager manager17 = new model.user.Manager(credentials12);
        model.user.Visitor visitor18 = new model.user.Visitor(credentials12);
        boolean boolean19 = credentials3.equals((java.lang.Object) credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor10 and visitor12", visitor10.equals(visitor12) ? visitor10.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Student");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.parking.ParkingSpace parkingSpace15 = new model.parking.ParkingSpace(100);
        parkingSpace15.setStatus(true);
        int int18 = parkingSpace15.getSpaceID();
        java.lang.String str19 = parkingSpace15.disableParkingSpace();
        parkingSpace15.setStatus(false);
        model.sensor.Sensor sensor22 = parkingSpace15.getSensor();
        java.lang.String str23 = parkingSpace15.disableParkingSpace();
        boolean boolean24 = parkingSpace15.getStatus();
        model.booking.Booking booking25 = new model.booking.Booking();
        booking25.setStatus("Success: Parking Space 100 has been disabled.");
        int int28 = booking25.getEndTime();
        java.lang.String str29 = booking25.getStatus();
        int int30 = booking25.getTotalHours();
        booking25.setEndTime(10);
        parkingSpace15.setBooking(booking25);
        boolean boolean34 = facultyMember13.equals((java.lang.Object) parkingSpace15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 97 is already enabled.", "Manager", "");
        model.user.Student student5 = new model.user.Student(credentials3, "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been disabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        java.lang.String str10 = student9.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.Student student7 = new model.user.Student(credentials4);
        model.parking.ParkingLot parkingLot10 = new model.parking.ParkingLot((int) 'a', "Parking Lot 0 is already disabled.");
        boolean boolean11 = credentials4.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        java.lang.String str8 = facultyMember7.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        model.user.Student student20 = new model.user.Student(credentials17, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -40.0\nstatus         Parking Lot 0 is already disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember18", facultyMember9.equals(facultyMember18) ? facultyMember9.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Parking Lot 32 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   Success: Parking Lot 32 has been disabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client11", client6.equals(client11) ? client6.hashCode() == client11.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        java.lang.String str11 = credentials9.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor12", visitor7.equals(visitor12) ? visitor7.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        boolean boolean11 = credentials3.equals((java.lang.Object) "Manager");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client14 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        model.user.Client client8 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember11", facultyMember9.equals(facultyMember11) ? facultyMember9.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        model.user.Student student19 = new model.user.Student(credentials3, "Parking Space 97 is already enabled.");
        java.lang.String str20 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student19", student5.equals(student19) ? student5.hashCode() == student19.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 32 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str12 = facultyMember11.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember11", facultyMember6.equals(facultyMember11) ? facultyMember6.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        java.lang.String str12 = credentials9.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember11", facultyMember8.equals(facultyMember11) ? facultyMember8.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Visitor", "Visitor");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.Visitor visitor8 = new model.user.Visitor(credentials4);
        model.user.Student student10 = new model.user.Student(credentials4, "Success: Parking Space 52 has been disabled.");
        java.lang.String str11 = student10.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        model.user.User user25 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student24", student6.equals(student24) ? student6.hashCode() == student24.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.Student student9 = new model.user.Student(credentials3);
        student9.setStudentId("Parking Space 35 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        model.user.User user3 = new model.user.User("Parking Space 10 is already enabled.", "Success: Parking Space 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        model.user.Credentials credentials7 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7, "Manager");
        model.user.Student student11 = new model.user.Student(credentials7, "Student");
        java.lang.String str12 = credentials7.toString();
        model.user.Student student14 = new model.user.Student(credentials7, "Parking Space 32 is already enabled.");
        boolean boolean15 = user3.equals((java.lang.Object) "Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student14", student11.equals(student14) ? student11.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        nonFacultyStaff14.setRole("Success: Parking Lot -32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff13 and nonFacultyStaff14", nonFacultyStaff13.equals(nonFacultyStaff14) ? nonFacultyStaff13.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.String str10 = credentials7.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager9", manager6.equals(manager9) ? manager6.hashCode() == manager9.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.booking.Booking booking13 = new model.booking.Booking();
        booking13.setStatus("Success: Parking Space 100 has been disabled.");
        int int16 = booking13.getEndTime();
        java.util.Date date17 = booking13.getStartDateTime();
        booking13.setCost((double) (short) 1);
        int int20 = booking13.getId();
        java.util.Date date21 = booking13.getEndDateTime();
        double double22 = booking13.getCost();
        boolean boolean23 = credentials3.equals((java.lang.Object) double22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember12", facultyMember10.equals(facultyMember12) ? facultyMember10.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Success: Parking Space 0 has been disabled.");
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor10", visitor7.equals(visitor10) ? visitor7.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student10 = new model.user.Student(credentials3);
        student10.setStudentId("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.Student student11 = new model.user.Student(credentials9);
        model.user.Student student12 = new model.user.Student(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials9, "Success: Parking Space 35 has been disabled.", "Success: Parking Lot 0 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff12", nonFacultyStaff11.equals(nonFacultyStaff12) ? nonFacultyStaff11.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        student7.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials12);
        model.user.Student student14 = new model.user.Student(credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials12);
        model.user.User user14 = new model.user.User(credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Parking Space 32 is already enabled.", "Success: Parking Lot 32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff13 and nonFacultyStaff14", nonFacultyStaff13.equals(nonFacultyStaff14) ? nonFacultyStaff13.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        model.user.Credentials credentials13 = visitor12.getCredentials();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials13, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Lot 52 has been disabled.");
        facultyMember16.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -2560.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember16", facultyMember8.equals(facultyMember16) ? facultyMember8.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials3);
        model.user.Student student17 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        strategy.NonFacultyParkingRate nonFacultyParkingRate18 = new strategy.NonFacultyParkingRate();
        double double20 = nonFacultyParkingRate18.calculateRate((double) 1L);
        double double22 = nonFacultyParkingRate18.calculateRate((double) 100.0f);
        double double24 = nonFacultyParkingRate18.calculateRate((double) 1.0f);
        double double26 = nonFacultyParkingRate18.calculateRate((double) (byte) 100);
        double double28 = nonFacultyParkingRate18.calculateRate(0.0d);
        double double30 = nonFacultyParkingRate18.calculateRate(150.0d);
        double double32 = nonFacultyParkingRate18.calculateRate((double) 32);
        boolean boolean33 = credentials3.equals((java.lang.Object) nonFacultyParkingRate18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student17", student5.equals(student17) ? student5.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        visitor10.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor9 and visitor10", visitor9.equals(visitor10) ? visitor9.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been enabled.");
        java.lang.String str13 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Manager manager8 = new model.user.Manager(credentials7);
        model.user.Student student10 = new model.user.Student(credentials7, "Success: Parking Space 1 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager8", manager6.equals(manager8) ? manager6.hashCode() == manager8.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials16 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str17 = credentials16.toString();
        java.lang.String str18 = credentials16.getPassword();
        java.lang.String str19 = credentials16.getLogin();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials16, "Visitor", "Success: Parking Lot 52 has been disabled.");
        model.user.Client client23 = new model.user.Client(credentials16);
        java.lang.String str24 = credentials16.toString();
        boolean boolean25 = visitor12.equals((java.lang.Object) credentials16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials16", credentials3.equals(credentials16) ? credentials3.hashCode() == credentials16.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Lot 0 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client8 and client9", client8.equals(client9) ? client8.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Manager manager8 = new model.user.Manager(credentials7);
        java.lang.String str9 = credentials7.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager8", manager6.equals(manager8) ? manager6.hashCode() == manager8.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client13 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client13", client4.equals(client13) ? client4.hashCode() == client13.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        nonFacultyStaff9.setRole("Parking Lot 32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff9", nonFacultyStaff5.equals(nonFacultyStaff9) ? nonFacultyStaff5.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Space 100 has been disabled.");
        model.user.User user8 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        java.lang.String str9 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "Student");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.Student student10 = new model.user.Student(credentials3, "Parking Space 32 is already enabled.");
        model.user.User user11 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Credentials credentials10 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10, "Manager");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials10);
        java.lang.String str14 = credentials10.getLogin();
        model.user.Client client15 = new model.user.Client(credentials10);
        boolean boolean16 = facultyMember6.equals((java.lang.Object) credentials10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials10", credentials3.equals(credentials10) ? credentials3.hashCode() == credentials10.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.Student student10 = new model.user.Student(credentials3, "Parking Space 32 is already enabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "Failure: Parking Space 32 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getType();
        model.user.Client client13 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client13", client4.equals(client13) ? client4.hashCode() == client13.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        java.lang.String str9 = credentials3.toString();
        model.user.Client client10 = new model.user.Client(credentials3);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client10", client4.equals(client10) ? client4.hashCode() == client10.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.Student student8 = new model.user.Student(credentials4);
        model.user.Student student9 = new model.user.Student(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        boolean boolean11 = visitor10.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor9 and visitor10", visitor9.equals(visitor10) ? visitor9.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember12", facultyMember10.equals(facultyMember12) ? facultyMember10.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        model.user.Client client12 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client11", client6.equals(client11) ? client6.hashCode() == client11.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3);
        student9.setStudentId("Parking Lot 100 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Space 35 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        student14.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student14", student6.equals(student14) ? student6.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials3);
        model.user.Student student17 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        java.lang.String str18 = student17.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student17", student5.equals(student17) ? student5.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        java.lang.String str11 = credentials3.getPassword();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Space 97 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
        facultyMember14.setFacultyName("Success: Parking Space 35 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        java.lang.String str12 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Lot -1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Space 0 has been disabled.", "Manager");
        model.user.Client client14 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getType();
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        java.lang.String str15 = student14.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = facultyMember11.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember11", facultyMember9.equals(facultyMember11) ? facultyMember9.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
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
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials3, "Success: Parking Space 52 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student16", student8.equals(student16) ? student8.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "", "Success: Parking Space -1 has been enabled.");
        java.lang.String str14 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        java.lang.String str11 = credentials9.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        model.user.Visitor visitor21 = new model.user.Visitor(credentials17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember20", facultyMember9.equals(facultyMember20) ? facultyMember9.hashCode() == facultyMember20.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "Success: Parking Space 97 has been disabled.");
        model.user.Client client11 = new model.user.Client(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str13 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.booking.Booking booking9 = new model.booking.Booking();
        booking9.setStatus("Success: Parking Space 100 has been disabled.");
        int int12 = booking9.getEndTime();
        java.util.Date date13 = booking9.getStartDateTime();
        booking9.setCost((double) (short) 1);
        booking9.setLicensePlate("Success: Parking Space -1 has been enabled.");
        booking9.setEmail("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        booking9.setId((int) '4');
        boolean boolean22 = nonFacultyStaff8.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.Student student7 = new model.user.Student(credentials4);
        model.user.Visitor visitor8 = new model.user.Visitor(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.Student student7 = new model.user.Student(credentials4);
        model.user.Student student9 = new model.user.Student(credentials4, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        java.lang.String str19 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember18", facultyMember14.equals(facultyMember18) ? facultyMember14.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        java.lang.String str9 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str11 = credentials3.getType();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Success: Parking Lot 97 has been disabled.");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.Student student7 = new model.user.Student(credentials4);
        student7.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   '\ncost           0.0\nstatus         Success: Parking Lot 10 has been enabled.'\nemail        Parking Lot 10 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager9", manager6.equals(manager9) ? manager6.hashCode() == manager9.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Parking Space 100 is already disabled.", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str14 = facultyMember13.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null", "Success: Parking Space -32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager16", manager8.equals(manager16) ? manager8.hashCode() == manager16.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 0 has been enabled.");
        java.lang.String str10 = facultyMember9.getFacultyId();
        facultyMember9.validateAccount();
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials12);
        model.parking.ParkingLot parkingLot16 = new model.parking.ParkingLot((int) '4', "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        boolean boolean17 = nonFacultyStaff13.equals((java.lang.Object) parkingLot16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff13", nonFacultyStaff4.equals(nonFacultyStaff13) ? nonFacultyStaff4.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Space 35 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Client client13 = new model.user.Client(credentials3);
        model.user.User user14 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client13", client7.equals(client13) ? client7.hashCode() == client13.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Lot 0 has been enabled.");
        model.user.Client client13 = new model.user.Client(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember12", facultyMember8.equals(facultyMember12) ? facultyMember8.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
        model.user.User user14 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "Success: Parking Space 97 has been disabled.");
        java.lang.String str11 = credentials7.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = student10.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.Student student10 = new model.user.Student(credentials3, "Parking Space 32 is already enabled.");
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 100 has been disabled.");
        java.lang.String str11 = nonFacultyStaff10.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff7 and nonFacultyStaff10", nonFacultyStaff7.equals(nonFacultyStaff10) ? nonFacultyStaff7.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials4, "");
        model.user.Student student10 = new model.user.Student(credentials4);
        java.lang.String str11 = credentials4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        java.lang.String str12 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember11", facultyMember7.equals(facultyMember11) ? facultyMember7.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "Success: Parking Lot 0 has been enabled.");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 97 has been disabled.', type='Parking Space 97 is already enabled.'}", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Visitor'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Parking Space -1 is already disabled.");
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff10", nonFacultyStaff5.equals(nonFacultyStaff10) ? nonFacultyStaff5.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.User user8 = new model.user.User(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "Failure: Parking Space 52 has active bookings. Parking Space has not been disabled.");
        nonFacultyStaff11.setRole("Success: Parking Lot 97 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff11", nonFacultyStaff4.equals(nonFacultyStaff11) ? nonFacultyStaff4.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getType();
        model.user.Client client13 = new model.user.Client(credentials3);
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client13", client4.equals(client13) ? client4.hashCode() == client13.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        boolean boolean4 = facultyMember3.getValidationStatus();
        facultyMember3.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str7 = facultyMember3.getFacultyName();
        java.lang.String str8 = facultyMember3.getFacultyName();
        java.lang.String str9 = facultyMember3.getFacultyName();
        java.lang.String str10 = facultyMember3.getFacultyId();
        model.user.Credentials credentials14 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client15 = new model.user.Client(credentials14);
        model.user.User user16 = model.user.UserFactory.createAccount(credentials14);
        model.user.Student student18 = new model.user.Student(credentials14, "users.json");
        java.lang.String str19 = credentials14.getLogin();
        java.lang.String str20 = credentials14.getType();
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials14);
        model.user.Student student22 = new model.user.Student(credentials14);
        boolean boolean23 = facultyMember3.equals((java.lang.Object) student22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student18 and student22", student18.equals(student22) ? student18.hashCode() == student22.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.toString();
        model.user.Student student10 = new model.user.Student(credentials3);
        student10.setStudentId("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Manager manager7 = new model.user.Manager(credentials3);
        model.user.Credentials credentials11 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str12 = credentials11.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials11);
        boolean boolean14 = manager7.equals((java.lang.Object) credentials11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager6 and manager7", manager6.equals(manager7) ? manager6.hashCode() == manager7.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        java.lang.String str9 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "Student");
        java.lang.String str13 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Success: Parking Space 0 has been disabled.");
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor10", visitor7.equals(visitor10) ? visitor7.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.Student student8 = new model.user.Student(credentials4);
        student8.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        java.lang.String str11 = credentials9.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        boolean boolean5 = credentials3.equals((java.lang.Object) (short) 10);
        model.user.Credentials credentials9 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str10 = credentials9.toString();
        model.user.Student student11 = new model.user.Student(credentials9);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9);
        nonFacultyStaff12.setRole("Manager");
        boolean boolean15 = credentials3.equals((java.lang.Object) "Manager");
        model.user.Student student16 = new model.user.Student(credentials3);
        model.user.Student student18 = new model.user.Student(credentials3, "Failure: Parking Space -1 has active bookings. Parking Space has not been disabled.");
        java.lang.String str19 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student16 and student18", student16.equals(student18) ? student16.hashCode() == student18.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Space 0 has been disabled.", "Manager");
        facultyMember13.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      35\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Visitor'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials4, "Success: Parking Space -1 has been disabled.");
        model.parking.ParkingSpace parkingSpace10 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking11 = parkingSpace10.getBooking();
        boolean boolean12 = credentials4.equals((java.lang.Object) parkingSpace10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getLogin();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        nonFacultyStaff10.setRole("Parking Space 100 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff10", nonFacultyStaff5.equals(nonFacultyStaff10) ? nonFacultyStaff5.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        nonFacultyStaff9.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff9", nonFacultyStaff5.equals(nonFacultyStaff9) ? nonFacultyStaff5.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 97 has been disabled.");
        model.user.User user12 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Space 32 has been disabled.");
        model.user.Credentials credentials17 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str18 = credentials17.toString();
        model.user.Student student19 = new model.user.Student(credentials17);
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials17, "users.json", "");
        model.user.Credentials credentials23 = facultyMember22.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials23);
        java.lang.String str25 = nonFacultyStaff24.getRole();
        nonFacultyStaff24.setRole("Success: Parking Space 10 has been disabled.");
        boolean boolean28 = student13.equals((java.lang.Object) nonFacultyStaff24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials17", credentials3.equals(credentials17) ? credentials3.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.getPassword();
        model.user.Credentials credentials12 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str13 = credentials12.toString();
        model.user.Student student14 = new model.user.Student(credentials12);
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials12, "users.json", "");
        model.user.Credentials credentials18 = facultyMember17.getCredentials();
        java.lang.String str19 = facultyMember17.getFacultyId();
        java.lang.String str20 = facultyMember17.getFacultyId();
        model.user.Credentials credentials21 = facultyMember17.getCredentials();
        boolean boolean22 = credentials3.equals((java.lang.Object) facultyMember17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Failure: Parking Space -1 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        java.lang.String str9 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Parking Lot 52 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.Student student11 = new model.user.Student(credentials9);
        model.user.Manager manager12 = new model.user.Manager(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot 97 is already enabled.");
        java.lang.String str15 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client13 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client13", client4.equals(client13) ? client4.hashCode() == client13.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = student10.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        java.lang.String str11 = credentials3.getPassword();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Space 97 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
        java.lang.String str15 = facultyMember14.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials4, "Success: Parking Space -1 has been disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "Success: Parking Space 97 has been disabled.");
        java.lang.String str11 = credentials7.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str10 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff9", nonFacultyStaff5.equals(nonFacultyStaff9) ? nonFacultyStaff5.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Credentials{login='Parking Space 0 is already enabled.', password='Success: Parking Lot 52 has been disabled.', type='Success: Parking Space 100 has been disabled.'}", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember11", facultyMember6.equals(facultyMember11) ? facultyMember6.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str9 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials7, "Parking Space 10 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null");
        java.lang.String str20 = credentials7.toString();
        model.user.Credentials credentials24 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str25 = credentials24.toString();
        model.user.Student student26 = new model.user.Student(credentials24);
        model.user.FacultyMember facultyMember29 = new model.user.FacultyMember(credentials24, "users.json", "");
        model.user.Credentials credentials30 = facultyMember29.getCredentials();
        model.user.FacultyMember facultyMember33 = new model.user.FacultyMember(credentials30, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Lot 0 has been enabled.");
        boolean boolean34 = credentials7.equals((java.lang.Object) facultyMember33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials24", credentials7.equals(credentials24) ? credentials7.hashCode() == credentials24.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 32 has been disabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str13 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff12", nonFacultyStaff4.equals(nonFacultyStaff12) ? nonFacultyStaff4.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "Parking Space 35 is already disabled.");
        student11.setStudentId("Credentials{login='Success: Parking Lot 10 has been enabled.', password='Manager', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Lot -1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        java.lang.String str9 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "Student");
        java.lang.String str13 = nonFacultyStaff12.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "Success: Parking Space 52 has been enabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Lot -32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             -35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.Client client10 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        java.lang.String str9 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "Student");
        model.user.Student student14 = new model.user.Student(credentials3, "Success: Parking Lot 52 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getLogin();
        model.user.Student student12 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        SuperManager");
        java.lang.String str13 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.toString();
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.Credentials credentials14 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student16 = new model.user.Student(credentials14, "");
        strategy.VisitorParkingRate visitorParkingRate17 = new strategy.VisitorParkingRate();
        double double19 = visitorParkingRate17.calculateRate(1.0d);
        double double21 = visitorParkingRate17.calculateRate((double) (byte) 100);
        boolean boolean22 = credentials14.equals((java.lang.Object) visitorParkingRate17);
        model.user.User user23 = new model.user.User(credentials14);
        boolean boolean24 = credentials3.equals((java.lang.Object) user23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials14", credentials3.equals(credentials14) ? credentials3.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "Success: Parking Space 52 has been enabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Client client10 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Space 100 has been disabled.");
        java.lang.String str8 = student7.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        model.user.Credentials credentials16 = null;
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials16);
        nonFacultyStaff17.setRole("");
        boolean boolean20 = nonFacultyStaff17.getValidationStatus();
        nonFacultyStaff17.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   Success: Parking Lot 32 has been disabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        boolean boolean23 = manager15.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   Success: Parking Lot 32 has been disabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager15", manager8.equals(manager15) ? manager8.hashCode() == manager15.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Parking Space 10 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3);
        java.lang.String str8 = student7.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        facultyMember16.setFacultyId("\nid             -32\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember16", facultyMember14.equals(facultyMember16) ? facultyMember14.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot 97 is already enabled.");
        model.user.Client client15 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 0 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        java.lang.Class<?> wildcardClass12 = credentials3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember11", facultyMember8.equals(facultyMember11) ? facultyMember8.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        facultyMember11.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember11", facultyMember10.equals(facultyMember11) ? facultyMember10.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Parking Space 35 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        model.user.Credentials credentials0 = null;
        model.user.FacultyMember facultyMember3 = new model.user.FacultyMember(credentials0, "Student", "");
        facultyMember3.setFacultyId("Student");
        facultyMember3.setFacultyName("Parking Space 0 is already enabled.");
        model.user.Credentials credentials8 = null;
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials8, "Student", "");
        boolean boolean12 = facultyMember11.getValidationStatus();
        java.lang.String str13 = facultyMember11.getFacultyName();
        java.lang.String str14 = facultyMember11.getFacultyId();
        java.lang.String str15 = facultyMember11.getFacultyName();
        facultyMember11.setFacultyId("Student");
        java.lang.String str18 = facultyMember11.getFacultyId();
        boolean boolean19 = facultyMember3.equals((java.lang.Object) facultyMember11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember3 and facultyMember11", facultyMember3.equals(facultyMember11) ? facultyMember3.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        model.user.Client client13 = new model.user.Client(credentials9);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials9, "Credentials{login='Success: Parking Lot 32 has been disabled.', password='Success: Parking Lot 100 has been disabled.', type='Success: Parking Lot 52 has been disabled.'}", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember16", facultyMember8.equals(facultyMember16) ? facultyMember8.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Student student9 = new model.user.Student(credentials3, "hi!");
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Space 35 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already disabled.", "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student14", student6.equals(student14) ? student6.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "Success: Parking Space 97 has been disabled.");
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        model.user.Visitor visitor19 = new model.user.Visitor(credentials17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember18", facultyMember9.equals(facultyMember18) ? facultyMember9.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Space 35 has been disabled.", "Parking Space 97 is already enabled.");
        java.lang.String str13 = credentials3.toString();
        model.user.Student student15 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client16 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student15", student6.equals(student15) ? student6.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        java.lang.String str4 = credentials3.getLogin();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        java.lang.String str8 = student7.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 32 has been disabled.");
        java.lang.String str9 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = facultyMember11.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember11", facultyMember10.equals(facultyMember11) ? facultyMember10.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff17", nonFacultyStaff10.equals(nonFacultyStaff17) ? nonFacultyStaff10.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.User user8 = new model.user.User(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Parking Space -1 is already disabled.");
        model.user.Visitor visitor11 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff10", nonFacultyStaff5.equals(nonFacultyStaff10) ? nonFacultyStaff5.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        java.lang.String str12 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client6 and client11", client6.equals(client11) ? client6.hashCode() == client11.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        boolean boolean11 = credentials3.equals((java.lang.Object) "Manager");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -40.0\nstatus         Parking Lot 0 is already disabled.'\nemail        null", "Parking Lot -1 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        java.lang.String str5 = credentials3.getType();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        java.lang.Class<?> wildcardClass7 = facultyParkingRate6.getClass();
        boolean boolean8 = credentials3.equals((java.lang.Object) wildcardClass7);
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client9", client4.equals(client9) ? client4.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
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
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials15, "Credentials{login='Success: Parking Lot 32 has been disabled.', password='Success: Parking Lot 100 has been disabled.', type='Success: Parking Lot 52 has been disabled.'}", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student17", student8.equals(student17) ? student8.hashCode() == student17.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user13 = new model.user.User(credentials3);
        model.user.Student student15 = new model.user.Student(credentials3, "Credentials{login='Success: Parking Lot 10 has been enabled.', password='Manager', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null'}");
        student15.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 100 is already disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student15", student5.equals(student15) ? student5.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.Student student10 = new model.user.Student(credentials3, "NonFacultyStaff");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff8", nonFacultyStaff5.equals(nonFacultyStaff8) ? nonFacultyStaff5.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        java.lang.String str13 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor12", visitor7.equals(visitor12) ? visitor7.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      10\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember9", facultyMember8.equals(facultyMember9) ? facultyMember8.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.Student student11 = new model.user.Student(credentials9);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
        model.user.Visitor visitor17 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student16", student7.equals(student16) ? student7.hashCode() == student16.hashCode() : true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user5 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace((int) (short) 0);
        int int9 = parkingSpace8.getSpaceID();
        model.booking.Booking booking10 = new model.booking.Booking();
        booking10.setStatus("Success: Parking Space 100 has been disabled.");
        int int13 = booking10.getEndTime();
        java.util.Date date14 = booking10.getStartDateTime();
        booking10.setCost((double) (short) 1);
        booking10.setLicensePlate("Success: Parking Space -1 has been enabled.");
        booking10.setEmail("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str21 = booking10.toString();
        booking10.setId((int) (short) 10);
        booking10.setStartTime(10);
        parkingSpace8.setBooking(booking10);
        boolean boolean27 = nonFacultyStaff6.equals((java.lang.Object) parkingSpace8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff6", nonFacultyStaff4.equals(nonFacultyStaff6) ? nonFacultyStaff4.hashCode() == nonFacultyStaff6.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student10", student7.equals(student10) ? student7.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
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
        facultyMember18.setFacultyName("Success: Parking Space 35 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember18", facultyMember13.equals(facultyMember18) ? facultyMember13.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.Credentials credentials18 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str19 = credentials18.toString();
        java.lang.String str20 = credentials18.getPassword();
        java.lang.String str21 = credentials18.getLogin();
        model.user.FacultyMember facultyMember24 = new model.user.FacultyMember(credentials18, "Visitor", "Success: Parking Lot 52 has been disabled.");
        java.lang.String str25 = credentials18.toString();
        model.user.Client client26 = new model.user.Client(credentials18);
        boolean boolean27 = student14.equals((java.lang.Object) credentials18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials18", credentials3.equals(credentials18) ? credentials3.hashCode() == credentials18.hashCode() : true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot 97 is already enabled.");
        model.user.Student student16 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getType();
        model.user.Client client13 = new model.user.Client(credentials3);
        boolean boolean14 = client13.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client13", client4.equals(client13) ? client4.hashCode() == client13.hashCode() : true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        student8.setStudentId("\nid             1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Student");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Credentials credentials17 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials17);
        java.lang.String str19 = credentials17.getPassword();
        model.user.Manager manager20 = new model.user.Manager(credentials17);
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials17, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 0 has been enabled.");
        java.lang.String str24 = facultyMember23.getFacultyId();
        boolean boolean25 = facultyMember13.equals((java.lang.Object) str24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials17", credentials3.equals(credentials17) ? credentials3.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials4, "");
        model.user.Student student10 = new model.user.Student(credentials4);
        student10.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 0 has been disabled.", "Manager", "Success: Parking Space 52 has been disabled.");
        model.user.User user4 = model.user.UserFactory.createAccount(credentials3);
        model.user.Credentials credentials8 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials8);
        java.lang.String str10 = credentials8.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials8, "Success: Parking Space 52 has been enabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials8);
        boolean boolean15 = credentials3.equals((java.lang.Object) facultyMember14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember14", facultyMember13.equals(facultyMember14) ? facultyMember13.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        java.lang.String str10 = facultyMember8.getFacultyId();
        java.lang.String str11 = facultyMember8.getFacultyId();
        model.user.Credentials credentials12 = facultyMember8.getCredentials();
        model.user.Credentials credentials16 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials16, "Manager");
        model.user.Student student20 = new model.user.Student(credentials16, "Student");
        model.user.User user21 = model.user.UserFactory.createAccount(credentials16);
        model.user.User user22 = new model.user.User(credentials16);
        model.user.Visitor visitor23 = new model.user.Visitor(credentials16);
        model.booking.Booking booking24 = new model.booking.Booking();
        booking24.setEmail("SuperManager");
        double double27 = booking24.getCost();
        java.util.Date date28 = null;
        booking24.setEndDateTime(date28);
        java.lang.String str30 = booking24.toString();
        java.util.Date date31 = null;
        booking24.setEndDateTime(date31);
        boolean boolean33 = visitor23.equals((java.lang.Object) booking24);
        int int34 = booking24.getLotId();
        java.lang.String str35 = booking24.getStatus();
        java.lang.String str36 = booking24.getEmail();
        boolean boolean37 = credentials12.equals((java.lang.Object) str36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials12 and credentials16", credentials12.equals(credentials16) ? credentials12.hashCode() == credentials16.hashCode() : true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student11", student7.equals(student11) ? student7.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.getPassword();
        model.user.Student student15 = new model.user.Student(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str16 = student15.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student15", student5.equals(student15) ? student5.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        model.user.Credentials credentials13 = visitor12.getCredentials();
        model.user.Credentials credentials17 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student19 = new model.user.Student(credentials17, "");
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17);
        model.user.Credentials credentials21 = nonFacultyStaff20.getCredentials();
        model.user.User user22 = new model.user.User(credentials21);
        model.user.Visitor visitor23 = new model.user.Visitor(credentials21);
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials21, "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Credentials{login='Success: Parking Space 100 has been disabled.', password='Success: Parking Space -1 has been enabled.', type='Success: Parking Space -1 has been enabled.'}");
        java.lang.String str27 = credentials21.toString();
        boolean boolean28 = credentials13.equals((java.lang.Object) str27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials13 and credentials17", credentials13.equals(credentials17) ? credentials13.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
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
        model.booking.Booking booking21 = new model.booking.Booking();
        booking21.setStatus("Success: Parking Space 100 has been disabled.");
        int int24 = booking21.getTotalHours();
        booking21.setStatus("");
        java.lang.String str27 = booking21.toString();
        java.util.Date date28 = null;
        booking21.setStartDateTime(date28);
        java.lang.String str30 = booking21.getEmail();
        booking21.setStatus("SuperManager");
        int int33 = booking21.getLotId();
        java.util.Date date34 = booking21.getEndDateTime();
        boolean boolean35 = credentials17.equals((java.lang.Object) date34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember20", facultyMember9.equals(facultyMember20) ? facultyMember9.hashCode() == facultyMember20.hashCode() : true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials12);
        model.user.User user14 = model.user.UserFactory.createAccount(credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        model.user.Client client3 = new model.user.Client("Parking Space 97 is already enabled.", "Parking Space 0 is already enabled.", "Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials4 = client3.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials4);
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.User user7 = model.user.UserFactory.createAccount(credentials4);
        model.user.Student student8 = new model.user.Student(credentials4);
        java.lang.String str9 = student8.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials9, "Credentials{login='Success: Parking Lot 10 has been disabled.', password='hi!', type='Success: Parking Lot 10 has been enabled.'}", "Success: Parking Space 32 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember13", facultyMember8.equals(facultyMember13) ? facultyMember8.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student8", student7.equals(student8) ? student7.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials4, "");
        model.user.Student student10 = new model.user.Student(credentials4);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials9);
        model.user.Student student11 = new model.user.Student(credentials9);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials4, "");
        model.user.Student student10 = new model.user.Student(credentials4);
        java.lang.String str11 = student10.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str12 = nonFacultyStaff11.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        java.lang.String str13 = credentials12.getLogin();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials12);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember14", facultyMember9.equals(facultyMember14) ? facultyMember9.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff6.validateAccount();
        java.lang.String str8 = nonFacultyStaff6.getRole();
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials9, "Parking Space 32 is already enabled.", "Success: Parking Lot 32 has been disabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9);
        java.lang.String str14 = credentials9.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember13", facultyMember12.equals(facultyMember13) ? facultyMember12.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.User user15 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        facultyMember11.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember11", facultyMember7.equals(facultyMember11) ? facultyMember7.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        model.user.User user18 = new model.user.User(credentials16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff17", nonFacultyStaff10.equals(nonFacultyStaff17) ? nonFacultyStaff10.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Student student11 = new model.user.Student(credentials3);
        java.lang.String str12 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        facultyMember11.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember11", facultyMember9.equals(facultyMember11) ? facultyMember9.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
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
        student24.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student24", student6.equals(student24) ? student6.hashCode() == student24.hashCode() : true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        model.user.Student student19 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student18", student5.equals(student18) ? student5.hashCode() == student18.hashCode() : true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = student8.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student8", student7.equals(student8) ? student7.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getType();
        model.user.Student student12 = new model.user.Student(credentials3, "Parking Lot 1 is already disabled.");
        java.lang.String str13 = student12.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student12", student7.equals(student12) ? student7.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember7", facultyMember6.equals(facultyMember7) ? facultyMember6.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 0 is already disabled.");
        boolean boolean9 = student8.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.Student student9 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
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
        model.booking.Booking booking15 = new model.booking.Booking();
        booking15.setStatus("Success: Parking Space 100 has been disabled.");
        int int18 = booking15.getTotalHours();
        booking15.setStatus("");
        int int21 = booking15.getSpaceId();
        java.lang.String str22 = booking15.getStatus();
        java.lang.String str23 = booking15.getLicensePlate();
        int int24 = booking15.getEndTime();
        booking15.setStartTime((-35));
        double double27 = booking15.getCost();
        booking15.setLicensePlate("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        int int30 = booking15.getId();
        boolean boolean31 = manager14.equals((java.lang.Object) int30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager13 and manager14", manager13.equals(manager14) ? manager13.hashCode() == manager14.hashCode() : true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 10 has been disabled.", "hi!", "Success: Parking Lot 10 has been enabled.");
        java.lang.String str4 = credentials3.getLogin();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.Credentials credentials11 = new model.user.Credentials("Parking Space 97 is already enabled.", "Manager", "");
        model.user.Student student13 = new model.user.Student(credentials11, "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Student student15 = new model.user.Student(credentials11, "Success: Parking Lot 0 has been disabled.");
        boolean boolean16 = credentials3.equals((java.lang.Object) credentials11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student13 and student15", student13.equals(student15) ? student13.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials7);
        boolean boolean9 = nonFacultyStaff8.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 10 has been disabled.", "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        boolean boolean5 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 0 is already enabled.'\ncost           0.0\nstatus         null'\nemail        ");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         hi!'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client8 and client9", client8.equals(client9) ? client8.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        java.lang.String str8 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        model.booking.Booking booking9 = new model.booking.Booking();
        booking9.setStatus("Success: Parking Space 100 has been disabled.");
        int int12 = booking9.getEndTime();
        booking9.setEmail("");
        java.lang.String str15 = booking9.getStatus();
        booking9.setStatus("Success: Parking Lot 10 has been enabled.");
        java.util.Date date18 = null;
        booking9.setEndDateTime(date18);
        java.lang.String str20 = booking9.getEmail();
        booking9.setEndTime(1);
        java.lang.String str23 = booking9.getLicensePlate();
        boolean boolean24 = student8.equals((java.lang.Object) str23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        model.user.Student student15 = new model.user.Student(credentials3, "Success: Parking Space -10 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember13", facultyMember11.equals(facultyMember13) ? facultyMember11.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        java.lang.String str9 = student8.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student8", student5.equals(student8) ? student5.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Credentials credentials10 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student12 = new model.user.Student(credentials10, "");
        java.lang.String str13 = credentials10.toString();
        model.user.User user14 = model.user.UserFactory.createAccount(credentials10);
        boolean boolean15 = credentials3.equals((java.lang.Object) credentials10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials10", credentials3.equals(credentials10) ? credentials3.hashCode() == credentials10.hashCode() : true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
        java.lang.String str12 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null'\nemail        null");
        model.parking.ParkingLot parkingLot11 = new model.parking.ParkingLot((int) (byte) 100, "Success: Parking Space 52 has been enabled.");
        parkingLot11.setLocation("SuperManager");
        boolean boolean14 = credentials3.equals((java.lang.Object) parkingLot11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student10 = new model.user.Student(credentials3);
        student10.setStudentId("Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember11", facultyMember9.equals(facultyMember11) ? facultyMember9.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
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
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials3, "Success: Parking Space 10 has been disabled.", "Success: Parking Space 0 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff16 and nonFacultyStaff17", nonFacultyStaff16.equals(nonFacultyStaff17) ? nonFacultyStaff16.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Credentials credentials14 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client15 = new model.user.Client(credentials14);
        model.user.User user16 = model.user.UserFactory.createAccount(credentials14);
        model.user.Student student18 = new model.user.Student(credentials14, "users.json");
        model.user.Manager manager19 = new model.user.Manager(credentials14);
        java.lang.String str20 = credentials14.toString();
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials14);
        boolean boolean22 = student10.equals((java.lang.Object) nonFacultyStaff21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials14", credentials3.equals(credentials14) ? credentials3.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot 97 is already enabled.");
        student14.setStudentId("Parking Space 32 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        model.user.User user4 = new model.user.User(credentials3);
        model.user.User user8 = new model.user.User("", "", "");
        model.user.Credentials credentials9 = user8.getCredentials();
        java.lang.String str10 = credentials9.getLogin();
        model.user.Student student11 = new model.user.Student(credentials9);
        model.user.Student student12 = new model.user.Student(credentials9);
        boolean boolean13 = credentials3.equals((java.lang.Object) student12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student12", student11.equals(student12) ? student11.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        java.lang.String str12 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Success: Parking Space 0 has been disabled.");
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor10", visitor7.equals(visitor10) ? visitor7.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "Parking Space 97 is already enabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot 97 is already enabled.");
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student14", student7.equals(student14) ? student7.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getPassword();
        model.user.Student student15 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student15", student7.equals(student15) ? student7.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.Student student7 = new model.user.Student(credentials4);
        model.user.Client client8 = new model.user.Client(credentials4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str12 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        java.lang.String str11 = credentials3.getPassword();
        model.user.User user12 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        java.lang.String str11 = credentials3.getPassword();
        model.user.User user12 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Student student7 = new model.user.Student(credentials3, "Student");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        java.lang.String str11 = credentials3.getPassword();
        model.user.User user12 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        strategy.StudentParkingRate studentParkingRate14 = new strategy.StudentParkingRate();
        double double16 = studentParkingRate14.calculateRate((double) (-1.0f));
        double double18 = studentParkingRate14.calculateRate((double) '4');
        boolean boolean19 = nonFacultyStaff13.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.toString();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7, "Success: Parking Space -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 0 is already enabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Parking Space 97 is already enabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials7, "Success: Parking Space 52 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Credentials credentials15 = facultyMember14.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.User user8 = new model.user.User(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot -1 has been disabled.");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.getType();
        model.user.Client client11 = new model.user.Client(credentials3);
        java.lang.String str12 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client11", client4.equals(client11) ? client4.hashCode() == client11.hashCode() : true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Success: Parking Space 100 has been disabled.");
        student7.setStudentId("Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        java.lang.String str8 = credentials7.toString();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7, "Success: Parking Space -1 has been enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Space 0 is already enabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Parking Space 97 is already enabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials7, "Success: Parking Space 52 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        model.user.User user3 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -40.0\nstatus         Parking Lot 0 is already disabled.'\nemail        null", "\nid             52\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Parking Space 100 is already enabled.");
        model.user.Credentials credentials4 = null;
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials4, "Student", "");
        boolean boolean8 = facultyMember7.getValidationStatus();
        facultyMember7.setFacultyName("Success: Parking Lot 10 has been disabled.");
        facultyMember7.setFacultyName("Parking Space 32 is already enabled.");
        java.lang.String str13 = facultyMember7.getFacultyName();
        facultyMember7.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str16 = facultyMember7.getFacultyId();
        boolean boolean17 = user3.equals((java.lang.Object) facultyMember7);
        model.user.Credentials credentials21 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff23 = new model.user.NonFacultyStaff(credentials21, "Manager");
        model.user.Client client24 = new model.user.Client(credentials21);
        model.user.Student student26 = new model.user.Student(credentials21, "Parking Space 100 is already disabled.");
        java.lang.String str27 = credentials21.getType();
        model.user.Student student28 = new model.user.Student(credentials21);
        boolean boolean29 = facultyMember7.equals((java.lang.Object) student28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student26 and student28", student26.equals(student28) ? student26.hashCode() == student28.hashCode() : true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials14 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials14);
        java.lang.String str16 = credentials14.toString();
        model.user.Student student18 = new model.user.Student(credentials14, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str19 = credentials14.getPassword();
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials14);
        java.lang.String str21 = credentials14.getType();
        model.user.Student student23 = new model.user.Student(credentials14, "Parking Lot 1 is already disabled.");
        boolean boolean24 = credentials3.equals((java.lang.Object) credentials14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor9 and visitor10", visitor9.equals(visitor10) ? visitor9.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.Student student7 = new model.user.Student(credentials3, "Parking Lot 0 is already enabled.");
        java.lang.String str8 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
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
        nonFacultyStaff17.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff16 and nonFacultyStaff17", nonFacultyStaff16.equals(nonFacultyStaff17) ? nonFacultyStaff16.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
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
        model.user.User user21 = new model.user.User(credentials18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student20", student5.equals(student20) ? student5.hashCode() == student20.hashCode() : true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
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
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -35.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff16 and nonFacultyStaff17", nonFacultyStaff16.equals(nonFacultyStaff17) ? nonFacultyStaff16.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials12);
        nonFacultyStaff13.setRole("\nid             -32\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           32.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Student student9 = new model.user.Student(credentials3, "hi!");
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student7 and student9", student7.equals(student9) ? student7.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        boolean boolean11 = credentials3.equals((java.lang.Object) "Manager");
        java.lang.String str12 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        model.parking.ParkingLot parkingLot16 = new model.parking.ParkingLot(100, "Success: Parking Space 100 has been disabled.");
        boolean boolean17 = parkingLot16.getStatus();
        java.lang.String str18 = parkingLot16.enableParkingLot();
        boolean boolean19 = credentials3.equals((java.lang.Object) str18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        java.lang.String str12 = credentials3.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials17 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials17, "Manager");
        model.user.Client client20 = new model.user.Client(credentials17);
        model.user.Visitor visitor21 = new model.user.Visitor(credentials17);
        model.user.Student student22 = new model.user.Student(credentials17);
        java.lang.String str23 = credentials17.getType();
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials17, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null", "Parking Lot 52 is already enabled.");
        boolean boolean27 = credentials3.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   SuperManager'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials17", credentials3.equals(credentials17) ? credentials3.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        model.user.Student student13 = new model.user.Student(credentials3, "Parking Lot 97 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember11", facultyMember7.equals(facultyMember11) ? facultyMember7.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
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
        model.user.User user15 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff13 and nonFacultyStaff14", nonFacultyStaff13.equals(nonFacultyStaff14) ? nonFacultyStaff13.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        java.lang.String str6 = credentials3.getLogin();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Visitor", "Success: Parking Lot 52 has been disabled.");
        java.lang.String str10 = credentials3.getLogin();
        java.lang.String str11 = credentials3.getLogin();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        facultyMember12.setFacultyId("Failure: Parking Space 52 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember12", facultyMember9.equals(facultyMember12) ? facultyMember9.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        boolean boolean6 = credentials3.equals((java.lang.Object) (-250.0d));
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff7", nonFacultyStaff4.equals(nonFacultyStaff7) ? nonFacultyStaff4.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 100 is already disabled.");
        java.lang.String str9 = credentials3.getType();
        boolean boolean11 = credentials3.equals((java.lang.Object) "Manager");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "Success: Parking Space -10 has been disabled.", "Success: Parking Lot -1 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff13", nonFacultyStaff5.equals(nonFacultyStaff13) ? nonFacultyStaff5.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space -1 has been enabled.");
        model.user.Student student8 = new model.user.Student(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 10 has been enabled.");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student11", student8.equals(student11) ? student8.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Success: Parking Lot 32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.User user13 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember12", facultyMember11.equals(facultyMember12) ? facultyMember11.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.Student student10 = new model.user.Student(credentials9);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student10", student5.equals(student10) ? student5.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "", "Success: Parking Space -1 has been enabled.");
        java.lang.String str14 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "Manager");
        model.user.Client client6 = new model.user.Client(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Parking Space 0 is already enabled.");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           -1.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
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
        java.lang.String str20 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student19", student5.equals(student19) ? student5.hashCode() == student19.hashCode() : true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials13 = new model.user.Credentials("Parking Space 97 is already enabled.", "Manager", "");
        model.user.Student student15 = new model.user.Student(credentials13, "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        java.lang.String str16 = credentials13.toString();
        boolean boolean17 = student9.equals((java.lang.Object) credentials13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student9", student8.equals(student9) ? student8.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
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
        model.user.User user19 = new model.user.User(credentials17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember18", facultyMember9.equals(facultyMember18) ? facultyMember9.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Parking Lot 97 is already enabled.");
        java.lang.String str14 = student13.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student13", student5.equals(student13) ? student5.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "Parking Lot -1 is already enabled.");
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember10", facultyMember7.equals(facultyMember10) ? facultyMember7.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        facultyMember11.setFacultyName("Parking Space -1 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember11", facultyMember9.equals(facultyMember11) ? facultyMember9.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.toString();
        model.user.Client client11 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client11", client4.equals(client11) ? client4.hashCode() == client11.hashCode() : true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff12.setRole("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "FacultyMember", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null");
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        model.user.User user13 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor7 and visitor12", visitor7.equals(visitor12) ? visitor7.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.Credentials credentials7 = manager6.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.Student student10 = new model.user.Student(credentials7, "Success: Parking Space 97 has been disabled.");
        student10.setStudentId("Credentials{login='Success: Parking Lot 10 has been disabled.', password='Success: Parking Space 32 has been disabled.', type='Manager'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        java.lang.String str6 = credentials3.toString();
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Parking Lot 52 is already enabled.'\ncost           0.0\nstatus         NonFacultyStaff'\nemail        null");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student13", student5.equals(student13) ? student5.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Space 35 has been disabled.", "Parking Space 97 is already enabled.");
        java.lang.String str13 = credentials3.toString();
        model.user.Client client14 = new model.user.Client(credentials3);
        java.lang.String str15 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client14", client7.equals(client14) ? client7.hashCode() == client14.hashCode() : true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "users.json", "");
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials9, "Student");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials9, "", "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff11 and nonFacultyStaff12", nonFacultyStaff11.equals(nonFacultyStaff12) ? nonFacultyStaff11.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
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
        nonFacultyStaff17.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff17", nonFacultyStaff10.equals(nonFacultyStaff17) ? nonFacultyStaff10.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.getType();
        model.user.User user8 = new model.user.User(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user8", user6.equals(user8) ? user6.hashCode() == user8.hashCode() : true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "FacultyMember");
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials3, "Parking Space -100 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        -1\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.parking.ParkingSpace parkingSpace19 = new model.parking.ParkingSpace((int) ' ');
        java.lang.String str20 = parkingSpace19.enableParkingSpace();
        parkingSpace19.setStatus(false);
        java.lang.String str23 = parkingSpace19.enableParkingSpace();
        java.lang.String str24 = parkingSpace19.enableParkingSpace();
        int int25 = parkingSpace19.getSpaceID();
        model.booking.Booking booking26 = parkingSpace19.getBooking();
        parkingSpace19.setStatus(false);
        boolean boolean29 = parkingSpace19.hasBooking();
        model.user.Credentials credentials30 = null;
        model.user.FacultyMember facultyMember33 = new model.user.FacultyMember(credentials30, "Student", "");
        boolean boolean34 = facultyMember33.getValidationStatus();
        facultyMember33.setFacultyName("Success: Parking Lot 10 has been disabled.");
        java.lang.String str37 = facultyMember33.getFacultyId();
        java.lang.String str38 = facultyMember33.getFacultyName();
        model.booking.Booking booking39 = new model.booking.Booking();
        booking39.setEmail("SuperManager");
        double double42 = booking39.getCost();
        java.util.Date date43 = null;
        booking39.setEndDateTime(date43);
        int int45 = booking39.getId();
        int int46 = booking39.getStartTime();
        boolean boolean47 = facultyMember33.equals((java.lang.Object) booking39);
        parkingSpace19.setBooking(booking39);
        model.sensor.Sensor sensor49 = parkingSpace19.getSensor();
        model.booking.Booking booking50 = parkingSpace19.getBooking();
        boolean boolean51 = credentials3.equals((java.lang.Object) parkingSpace19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember17", facultyMember11.equals(facultyMember17) ? facultyMember11.hashCode() == facultyMember17.hashCode() : true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
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
        java.lang.String str19 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember14 and facultyMember18", facultyMember14.equals(facultyMember18) ? facultyMember14.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace(10);
        boolean boolean9 = credentials3.equals((java.lang.Object) parkingSpace8);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student11", student5.equals(student11) ? student5.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str11 = nonFacultyStaff10.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff10", nonFacultyStaff9.equals(nonFacultyStaff10) ? nonFacultyStaff9.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Success: Parking Lot 32 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        strategy.FacultyParkingRate facultyParkingRate6 = new strategy.FacultyParkingRate();
        double double8 = facultyParkingRate6.calculateRate((-5.0d));
        boolean boolean9 = credentials4.equals((java.lang.Object) (-5.0d));
        model.user.Manager manager10 = new model.user.Manager(credentials4);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials4);
        model.user.Client client12 = new model.user.Client(credentials4);
        java.lang.String str13 = credentials4.getType();
        model.user.Client client14 = new model.user.Client(credentials4);
        java.lang.String str15 = credentials4.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client12 and client14", client12.equals(client14) ? client12.hashCode() == client14.hashCode() : true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
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
        boolean boolean26 = facultyMember25.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember13 and facultyMember25", facultyMember13.equals(facultyMember25) ? facultyMember13.hashCode() == facultyMember25.hashCode() : true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getPassword();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      97\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null");
        model.user.Client client12 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student11", student6.equals(student11) ? student6.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.Student student7 = new model.user.Student(credentials3, "Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.toString();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "", "Success: Parking Space -1 has been enabled.");
        java.lang.String str14 = facultyMember13.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        model.user.User user3 = new model.user.User("", "", "");
        model.user.Credentials credentials4 = user3.getCredentials();
        java.lang.String str5 = credentials4.getLogin();
        model.user.Student student6 = new model.user.Student(credentials4);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials4);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials4, "");
        model.user.Student student10 = new model.user.Student(credentials4);
        student10.setStudentId("Parking Space 0 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student10", student6.equals(student10) ? student6.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.User user11 = new model.user.User(credentials3);
        model.user.User user12 = new model.user.User(credentials3);
        java.lang.String str13 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user11 and user12", user11.equals(user12) ? user11.hashCode() == user12.hashCode() : true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.toString();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3, "Success: Parking Space 35 has been disabled.", "Parking Space 97 is already enabled.");
        java.lang.String str13 = credentials3.toString();
        model.user.Student student15 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.User user16 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student15", student6.equals(student15) ? student6.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "");
        strategy.VisitorParkingRate visitorParkingRate6 = new strategy.VisitorParkingRate();
        double double8 = visitorParkingRate6.calculateRate(1.0d);
        double double10 = visitorParkingRate6.calculateRate((double) (byte) 100);
        boolean boolean11 = credentials3.equals((java.lang.Object) visitorParkingRate6);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "SuperManager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client15 = new model.user.Client(credentials3);
        model.user.Client client16 = new model.user.Client(credentials3);
        java.lang.Class<?> wildcardClass17 = client16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client15 and client16", client15.equals(client16) ? client15.hashCode() == client16.hashCode() : true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        -1\nlicensePlate   Parking Space 100 is already disabled.'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.User user9 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff8", nonFacultyStaff4.equals(nonFacultyStaff8) ? nonFacultyStaff4.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "Success: Parking Lot 0 has been enabled.");
        model.user.Student student11 = new model.user.Student(credentials3, "Success: Parking Lot 100 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff12", nonFacultyStaff4.equals(nonFacultyStaff12) ? nonFacultyStaff4.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Lot 10 has been disabled.'\nemail        ", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   Success: Parking Space -1 has been enabled.'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        Credentials{login='Visitor', password='Parking Space 32 is already enabled.', type='Success: Parking Lot 0 has been disabled.'}");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        facultyMember12.setFacultyId("Credentials{login='Success: Parking Space 10 has been disabled.', password='FacultyMember', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         '\nemail        null'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember12", facultyMember10.equals(facultyMember12) ? facultyMember10.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        model.user.Credentials credentials3 = new model.user.Credentials("SuperManager", "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "Success: Parking Space 10 has been enabled.");
        java.lang.String str7 = credentials3.getLogin();
        model.user.Client client8 = new model.user.Client(credentials3);
        boolean boolean9 = client8.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client8", client4.equals(client8) ? client4.hashCode() == client8.hashCode() : true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        model.user.Student student6 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Parking Space 0 is already enabled.", "Parking Lot 10 is already disabled.");
        model.user.User user11 = new model.user.User(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Success: Parking Lot 35 has been disabled.");
        java.lang.String str14 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student13", student6.equals(student13) ? student6.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 100 has been disabled.", "Success: Parking Space -1 has been enabled.", "Success: Parking Space -1 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           1.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null", "Success: Parking Space 10 has been enabled.");
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Parking Space 0 is already enabled.'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        model.user.Credentials credentials12 = facultyMember11.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember11", facultyMember7.equals(facultyMember11) ? facultyMember7.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
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
        model.user.Manager manager19 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student18", student5.equals(student18) ? student5.hashCode() == student18.hashCode() : true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 32 has been disabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      52\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         Success: Parking Space 100 has been disabled.'\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 100 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff12", nonFacultyStaff4.equals(nonFacultyStaff12) ? nonFacultyStaff4.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "users.json");
        java.lang.String str8 = credentials3.getType();
        java.lang.String str9 = credentials3.getPassword();
        java.lang.String str10 = credentials3.toString();
        model.user.Credentials credentials14 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials14, "Manager");
        model.user.Client client17 = new model.user.Client(credentials14);
        model.user.Student student19 = new model.user.Student(credentials14, "Parking Space 100 is already disabled.");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials14);
        java.lang.String str21 = facultyMember20.getFacultyId();
        facultyMember20.setFacultyName("NonFacultyStaff");
        facultyMember20.setFacultyName("Success: Parking Lot 10 has been disabled.");
        facultyMember20.setFacultyId("Success: Parking Lot -1 has been enabled.");
        boolean boolean28 = credentials3.equals((java.lang.Object) facultyMember20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials14", credentials3.equals(credentials14) ? credentials3.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        boolean boolean6 = credentials3.equals((java.lang.Object) (-250.0d));
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff7", nonFacultyStaff4.equals(nonFacultyStaff7) ? nonFacultyStaff4.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 0 is already enabled.", "Success: Parking Lot 52 has been disabled.", "Success: Parking Space 100 has been disabled.");
        java.lang.String str4 = credentials3.toString();
        java.lang.String str5 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "Parking Lot 0 is already disabled.");
        java.lang.String str9 = nonFacultyStaff8.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        model.user.Credentials credentials3 = new model.user.Credentials("Visitor", "Parking Space 32 is already enabled.", "Success: Parking Lot 0 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str5 = credentials3.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "Success: Parking Space 52 has been enabled.", "\nid             97\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        SuperManager");
        model.user.Visitor visitor9 = new model.user.Visitor(credentials3);
        java.lang.String str10 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           1.0\nstatus         null'\nemail        null");
        nonFacultyStaff12.setRole("Success: Parking Lot 10 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff12", nonFacultyStaff4.equals(nonFacultyStaff12) ? nonFacultyStaff4.hashCode() == nonFacultyStaff12.hashCode() : true);
    }
}

