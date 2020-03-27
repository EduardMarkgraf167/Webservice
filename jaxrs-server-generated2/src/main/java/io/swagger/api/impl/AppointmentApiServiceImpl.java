package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Appointment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-03-27T04:51:41.387Z")
public class AppointmentApiServiceImpl extends AppointmentApiService {
    @Override
    public Response getAllAppointments(SecurityContext securityContext) throws NotFoundException {
        List<Appointment> appointments = DatabaseUtility.instance.getAllAppointments();
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response addAppointment(Appointment body, SecurityContext securityContext) throws NotFoundException {
        if(DatabaseUtility.instance.addAppointment(body))
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "success")).build();

        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "error")).build();
    }
    @Override
    public Response calculateDeparture( @NotNull Integer appointmentId, SecurityContext securityContext) throws NotFoundException {
        Appointment appointment = DatabaseUtility.instance.getAppointmentById(Long.valueOf(appointmentId));
        if(appointment.getDuration().equals("in 5 Minuten")){
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Start")).build();
        }

        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Relax")).build();
    }
    @Override
    public Response deleteById(Long appointmentId, SecurityContext securityContext) throws NotFoundException {
        if(DatabaseUtility.instance.deleteByID(appointmentId))
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "success")).build();

        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "error")).build();
    }
    @Override
    public Response getAppointmentById(Long appointmentId, SecurityContext securityContext) throws NotFoundException {
        Appointment appointment = DatabaseUtility.instance.getAppointmentById(appointmentId);

        if(appointment == null)
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "error")).build();

        return Response.ok().entity(appointment).build();
    }
    @Override
    public Response updateAppointment(Appointment body, SecurityContext securityContext) throws NotFoundException {
        if(DatabaseUtility.instance.updateAppointment(body))
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "success")).build();

        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "error")).build();
    }
}