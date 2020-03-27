package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AppointmentApiService;
import io.swagger.api.factories.AppointmentApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Appointment;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/appointment")


@io.swagger.annotations.Api(description = "the appointment API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-03-27T04:51:41.387Z")
public class AppointmentApi  {
   private final AppointmentApiService delegate;

   public AppointmentApi(@Context ServletConfig servletContext) {
      AppointmentApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AppointmentApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AppointmentApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AppointmentApiServiceFactory.getAppointmentApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a new appointment to the database", notes = "", response = Void.class, tags={ "appointment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response addAppointment(@ApiParam(value = "Appointment object that needs to be added to the database" ,required=true) Appointment body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addAppointment(body,securityContext);
    }
    @GET
    @Path("/calculator")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "calculates left time for departure", notes = "You get the time you have left (seconds) for attending your appointment", response = Integer.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Time in seconds you have before start for appointment", response = Integer.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad input parameter", response = Void.class) })
    public Response calculateDeparture(@ApiParam(value = "id of appointment to check",required=true) @QueryParam("appointmentId") Integer appointmentId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.calculateDeparture(appointmentId,securityContext);
    }
    @DELETE
    @Path("/{appointmentId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete appointment by ID", notes = "Returns a boolean value if operation was successfull", response = Boolean.class, tags={ "appointment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Appointment not found", response = Void.class) })
    public Response deleteById(@ApiParam(value = "ID of appointment to return",required=true) @PathParam("appointmentId") Long appointmentId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteById(appointmentId,securityContext);
    }
    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all appointments in database", notes = "", response = Appointment.class, responseContainer = "List", tags={ "appointment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Time in seconds you have before start for appointment", response = Appointment.class, responseContainer = "List") })
    public Response getAllAppointments(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllAppointments(securityContext);
    }
    @GET
    @Path("/{appointmentId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find appointment by ID", notes = "Returns a single appointment", response = Appointment.class, tags={ "appointment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Appointment.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Appointment not found", response = Void.class) })
    public Response getAppointmentById(@ApiParam(value = "ID of appointment to return",required=true) @PathParam("appointmentId") Long appointmentId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAppointmentById(appointmentId,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing appointment", notes = "", response = Void.class, tags={ "appointment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Appointment not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    public Response updateAppointment(@ApiParam(value = "Appointment object that needs to be added to the database" ,required=true) Appointment body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAppointment(body,securityContext);
    }
}
