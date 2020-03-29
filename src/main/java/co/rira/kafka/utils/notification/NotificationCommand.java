package co.rira.kafka.utils.notification;

import lombok.Getter;

public enum NotificationCommand {

    JAVA_EMAIL("javaEmail"),
    BROWSER("browser"),
    CALL_HOME_PHONE("HomePhone"),
    CALL_MOBILE_PHONE("callMobilePhone"),
    CALL_WORK_PHONE("callWorkPhone"),
    XMPP_GROUP_MESSAGE("xmppGroupMessage"),
    XMPP_MESSAGE("xmppMessage"),
    NUMERIC_PAGE("numericPage"),
    TEXT_PAGE("textPage"),
    IRC_CAT("ircCat"),
    MICROBLOG_UPDATE("microblogUpdate"),
    MICROBLOG_REPLY("microblogReply"),
    MICROBLOG_DM("microblogDM");

    @Getter
    private String command;

    NotificationCommand(String command) {
        this.command = command;
    }

}
