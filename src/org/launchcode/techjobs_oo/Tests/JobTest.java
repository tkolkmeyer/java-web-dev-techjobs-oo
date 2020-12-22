package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.assertFalse;



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

}
