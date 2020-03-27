package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Appointment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-03-27T04:51:41.387Z")
public abstract class AppointmentApiService {
    public abstract Response addAppointment(Appointment body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response calculateDeparture( @NotNull Integer appointmentId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteById(Long appointmentId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllAppointments(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAppointmentById(Long appointmentId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAppointment(Appointment body,SecurityContext securityContext) throws NotFoundException;
}
