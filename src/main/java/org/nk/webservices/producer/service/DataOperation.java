
package org.nk.webservices.producer.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


//@WebService
//(
    //targetNamespace = DataOperationPortImpl.HOST,
    //name = "createData"
//)

@WebService(
    //targetNamespace = "http://service.ws.sample/",
    //name = "charly"
)
public interface DataOperation {

//    @WebResult(name = "contenido", targetNamespace = "")
//    @RequestWrapper(localName = "createData",
//                    targetNamespace = DataOperationPortImpl.HOST,
//                    className = "sample.ws.service.SayHello")
//    @WebMethod(action = "urn:action")
//    @ResponseWrapper(localName = "response",
//                     targetNamespace = DataOperationPortImpl.HOST,
//                     className = "sample.ws.service.SayHelloResponse")


    @WebResult(
        //name = "return",
        //targetNamespace = ""
    )
    @RequestWrapper(
        //localName = "sayHello",
        //targetNamespace = "http://service.ws.sample/",
        //className = "sample.ws.service.SayHello"
    )
    @WebMethod(
        //action = "urn:SayHello"
    )
    @ResponseWrapper(
        //localName = "sayHelloResponse",
        //targetNamespace = "http://service.ws.sample/",
        //className = "sample.ws.service.SayHelloResponse"
    )
    Data createData(@WebParam(
        //name = "data"
        //    , targetNamespace = ""
    ) Data data);




    @WebResult
// (name = "contenidoR", targetNamespace = "")
    @RequestWrapper
        //(localName = "createDataR",
//        targetNamespace = DataOperationPortImpl.HOST,
//        className = "sample.ws.service.SayHelloR")
    @WebMethod
        //(action = "urn:actionR")
    @ResponseWrapper
// (localName = "responseR",
//        targetNamespace = DataOperationPortImpl.HOST,
//        className = "sample.ws.service.SayHelloResponseR")
    Data readData(@WebParam(name = "data") Data data);
}
