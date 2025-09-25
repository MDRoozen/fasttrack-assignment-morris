package com.airfranceklm.fasttrack.assignment.resources;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="HOLIDAY")
public final class Holiday {
    @Id
    @Column(name="HOLIDAY_ID")
    private String uuid;

    @Column(name="HOLIDAY_LABEl")
    private String label;

    @Column(name="EMPLOYEE_ID")
    private String employeeId;

    @Column(name="START_OF_HOLIDAY")
    private Date startOfHoliday;

    @Column(name="END_OF_HOLIDAY")
    private Date endOfHoliday;

    @Column(name="STATUS")
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    public Holiday() {
    }

    public Holiday(
            String uuid,
            String label,
            String employeeId,
            Date startOfHoliday,
            Date endOfHoliday,
            Status status
    ) {
        this.uuid = uuid;
        this.label = label;
        this.employeeId = employeeId;
        this.startOfHoliday = startOfHoliday;
        this.endOfHoliday = endOfHoliday;
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Date getStartOfHoliday() {
        return startOfHoliday;
    }

    public void setStartOfHoliday(Date startOfHoliday) {
        this.startOfHoliday = startOfHoliday;
    }

    public Date getEndOfHoliday() {
        return endOfHoliday;
    }

    public void setEndOfHoliday(Date endOfHoliday) {
        this.endOfHoliday = endOfHoliday;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "uuid='" + uuid + '\'' +
                ", label='" + label + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", startOfHoliday=" + startOfHoliday +
                ", endOfHoliday=" + endOfHoliday +
                ", status=" + status +
                '}';
    }
}
