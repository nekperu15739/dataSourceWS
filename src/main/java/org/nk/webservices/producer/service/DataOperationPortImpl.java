package org.nk.webservices.producer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

//@WebService(
//    //targetNamespace = DataOperationPortImpl.HOST,
//    name = "createData",
//
//    serviceName = DataOperationPortImpl.CREATE_DATA_SERVICE_NAME,
//    portName = DataOperationPortImpl.CREATE_DATA_PORT_NAME,
//    targetNamespace = DataOperationPortImpl.HOST,
//    endpointInterface = "sample.ws.service.DataOperation")


@WebService(
    //serviceName = CREATE_DATA_SERVICE_NAME,
    //portName = CREATE_DATA_PORT_NAME,
    //targetNamespace = "http://service.ws.samplew/",
    //endpointInterface = "sample.ws.service.DataOperation"
)
@Service
@Slf4j
public class DataOperationPortImpl implements DataOperation {

    public static final String CREATE_DATA_SERVICE_NAME = "createDataService";

    public static final String HOST = "http://equifax.datasource/";
    public static final String CREATE_DATA_PORT_NAME = "createDataServicePort";

    public Data createData(final Data data) {
        log.info("data:{}", data);
        return data;
    }

    @Override
    public Data readData(final Data data) {
        return Data.builder().dni("xxxx").build();
    }


}
