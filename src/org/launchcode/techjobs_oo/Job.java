package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String jobId = "";
        String jobName = "";
        String jobEmployer = "";
        String jobLocation = "";
        String jobPositionType = "";
        String jobCoreCompetency = "";
        String noData = "Data not available\n";

        jobId = this.getId() + "\n";

        if (this.getName() == null) {
            jobName = noData;
        } else {
            jobName = this.getName() + "\n";
        }
        if (this.getEmployer() == null) {
            jobEmployer = noData;
        } else {
            jobEmployer = this.getEmployer().getValue() + "\n";
        }
        if (this.getLocation() == null) {
            jobLocation = noData;
        } else {
            jobLocation = this.getLocation().getValue() + "\n";
        }
        if (this.getPositionType() == null) {
            jobPositionType = noData;
        } else {
            jobPositionType = this.getPositionType().getValue() + "\n";
        }
        if (this.getCoreCompetency() == null) {
            jobCoreCompetency = noData;
        } else {
            jobCoreCompetency = this.getCoreCompetency().getValue() + "\n";
        }
        return "ID: " + jobId + "Name: " + jobName + "Employer: " + jobEmployer + "Location: " + jobLocation + "Position Type: " + jobPositionType + "Core Competency: " + jobCoreCompetency;
    }


}
