package org.nk.webservices.producer;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.nk.webservices.producer.service.DataOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    public static final String ENDPOINT = "/data";
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(final DataOperation dataOperation) {
        EndpointImpl endpoint = new EndpointImpl(bus, dataOperation);
        endpoint.publish(ENDPOINT);
        return endpoint;
    }
}
