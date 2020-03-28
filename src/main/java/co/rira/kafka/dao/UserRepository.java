package co.rira.kafka.dao;

import co.rira.kafka.model.org.opennms.netmgt.config.users.User;
import co.rira.kafka.model.org.opennms.netmgt.config.users.Userinfo;
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
@Getter
public class UserRepository {
    private static final String USERS_FILE_PATH = "users.xml";
    private List<User> users;

    private final XMLUtils xmlUtils;

    @Autowired
    public UserRepository(XMLUtils xmlUtils) {
        this.xmlUtils = xmlUtils;
    }

    @PostConstruct
    private void loadUsers() {
        try {
            this.users = xmlUtils.convertXMLToObject(USERS_FILE_PATH, Userinfo.class).getUsers();
        } catch (Exception e) {
            log.error("Unable to read from file {} ", USERS_FILE_PATH, e);
            this.users = new ArrayList<>();
        }
    }

    public User findUserById(String userId){
        return users.stream().filter(user -> userId.equals(user.getUserId()))
                .findFirst().orElse(null);
    }
}
