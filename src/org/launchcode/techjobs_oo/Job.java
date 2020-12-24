package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

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

        if (this.getName() == null && this.getEmployer() == null && this.getLocation() == null && this.getPositionType() == null && this.getCoreCompetency() == null) {
            return "OOPS! This job does not seem to exist.";
        }

        if (this.getName().isBlank()) {
            jobName = noData;
        } else {
            jobName = this.getName() + "\n";
        }
        if (this.getEmployer().getValue().isBlank()) {
            jobEmployer = noData;
        } else {
            jobEmployer = this.getEmployer().getValue() + "\n";
        }
        if (this.getLocation().getValue().isBlank()) {
            jobLocation = noData;
        } else {
            jobLocation = this.getLocation().getValue() + "\n";
        }
        if (this.getPositionType().getValue().isBlank()) {
            jobPositionType = noData;
        } else {
            jobPositionType = this.getPositionType().getValue() + "\n";
        }
        if (this.getCoreCompetency().getValue().isBlank()) {
            jobCoreCompetency = noData;
        } else {
            jobCoreCompetency = this.getCoreCompetency().getValue() + "\n";
        }
        return "ID: " + jobId + "Name: " + jobName + "Employer: " + jobEmployer + "Location: " + jobLocation + "Position Type: " + jobPositionType + "Core Competency: " + jobCoreCompetency;
    }
}
