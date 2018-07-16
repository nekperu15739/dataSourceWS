package org.nk.webservices.producer.service;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement
    //(name = "Person", namespace = "urn:com:bbva:zic:canonic:dto")
@XmlType
    //(name = "Person", namespace = "urn:com:bbva:zic:canonic:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Data implements Serializable {

    //@ApiModelProperty("")

    //@XmlJavaTypeAdapter()
    //@XmlSchemaType(name = "id")
    private String id;
    private String name;
    private String email;
    private String salary;
    private String dni;
    private String fecnac;
    private String direccion;
    private String ctacte;
    private String estadocivil;
    private String sexo;
    private String fecalta;
    private String categoria;
    private String tipocontrato;
    private String nsegsoc;
    private String numtel;
    private String fecbaja;

}
