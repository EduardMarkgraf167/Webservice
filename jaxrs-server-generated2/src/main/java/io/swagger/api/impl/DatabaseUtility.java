package io.swagger.api.impl;

import io.swagger.model.Appointment;

import java.util.ArrayList;

public enum DatabaseUtility
{
    instance;

    public ArrayList<Appointment> getAllAppointments()
    {

        return null;
    }

    public boolean addAppointment(Appointment body)
    {

        return true;
    }

    public boolean deleteByID(Long appointmentId)
    {

        return true;
    }

    public boolean updateAppointment(Appointment body)
    {

        return true;
    }

    public Appointment getAppointmentById(Long appointmentId)
    {

        return null;
    }
}
