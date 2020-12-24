package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

    @Before
    public void createJobObject() {
        Job testJob = new Job();
        Job testJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        Job testJob = new Job();
        Job testJob2 = new Job();
        assertFalse(testJob.getId() == testJob2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob3 instanceof Job);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);


        assertTrue("ACME" == testJob3.getEmployer().getValue());
        assertTrue("Desert" == testJob3.getLocation().getValue());
        assertTrue("Quality control" == testJob3.getPositionType().getValue());
        assertTrue("Persistence" == testJob3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJob4.equals(testJob5));

    }

    @Test
    public void testToStringMethod() {
        Job emptyJob = new Job("",new Employer(""),new Location(""),new PositionType(""),new CoreCompetency(""));
        Job testJob6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job emptyEmpty = new Job();
        assertTrue(testJob6.toString().equals("ID: " + testJob6.getId() + "\n" + "Name: " + testJob6.getName() + "\n" + "Employer: " + testJob6.getEmployer().getValue() + "\n" + "Location: " + testJob6.getLocation().getValue() + "\n" + "Position Type: " + testJob6.getPositionType().getValue() + "\n" + "Core Competency: " + testJob6.getCoreCompetency().getValue() + "\n"));
        assertTrue(emptyJob.toString().equals("ID: " + emptyJob.getId() + "\n" + "Name: " + "Data not available\n" + "Employer: " + "Data not available\n" + "Location: " + "Data not available\n" + "Position Type: " + "Data not available\n" + "Core Competency: " + "Data not available\n"));
        assertTrue(emptyEmpty.toString().equals("OOPS! This job does not seem to exist."));
    }
}


