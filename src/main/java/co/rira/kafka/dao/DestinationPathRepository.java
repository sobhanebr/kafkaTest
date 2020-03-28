package co.rira.kafka.dao;

import co.rira.kafka.model.org.opennms.netmgt.config.destinationPaths.DestinationPaths;
import co.rira.kafka.model.org.opennms.netmgt.config.destinationPaths.Path;
import co.rira.kafka.utils.XMLUtils;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Component
@Log4j2
public class DestinationPathRepository {
    private static final String DESTINATION_FILE_PATH = "destinationPaths.xml";

    private final XMLUtils xmlUtils;
    @Getter
    private List<Path> destinationPaths;

    @Autowired
    public DestinationPathRepository(XMLUtils xmlUtils) {
        this.xmlUtils = xmlUtils;
    }

    @PostConstruct
    private void loadDestinationPaths() {
        try {
            this.destinationPaths = xmlUtils.convertXMLToObject(DESTINATION_FILE_PATH, DestinationPaths.class).getPaths();
        } catch (Exception e) {
            log.error("Cant load file {} ", DESTINATION_FILE_PATH, e);
            this.destinationPaths = new ArrayList<>();
        }
    }

    public Path findDestinationPathByName(String destinationPathName) {
        return destinationPaths.stream().filter(path -> destinationPathName.equals(path.getName()))
                .findFirst().orElse(null);
    }
}
