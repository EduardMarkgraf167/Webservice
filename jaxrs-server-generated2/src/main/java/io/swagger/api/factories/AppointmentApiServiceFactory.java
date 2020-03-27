package io.swagger.api.factories;

import io.swagger.api.AppointmentApiService;
import io.swagger.api.impl.AppointmentApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-03-27T04:51:41.387Z")
public class AppointmentApiServiceFactory {
    private final static AppointmentApiService service = new AppointmentApiServiceImpl();

    public static AppointmentApiService getAppointmentApi() {
        return service;
    }
}
