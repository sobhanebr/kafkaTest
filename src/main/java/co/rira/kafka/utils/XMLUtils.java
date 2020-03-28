package co.rira.kafka.utils;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

@Component
public class XMLUtils {

    public <T> T convertXMLToObject(String src, Class<T> clazz) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
        return clazz.cast(jaxbUnmarshaller
                .unmarshal(new ClassPathResource(src).getInputStream()));
    }

    public <T> void convertObjectToXML(T xmlObject, String des, Class<T> clazz) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(xmlObject, new File(des));
    }
}
