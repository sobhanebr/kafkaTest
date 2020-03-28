/*******************************************************************************
 * This file is part of OpenNMS(R).
 * 
 * Copyright (C) 2017 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2017 The OpenNMS Group, Inc.
 * 
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 * 
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *     http://www.gnu.org/licenses/
 * 
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package co.rira.kafka.model.org.opennms.netmgt.config.notifications;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Top-level element for the notifications.xml configuration file.
 */
@XmlRootElement(name = "notifications")
@XmlAccessorType(XmlAccessType.FIELD)
public class Notifications implements Serializable {
    private static final long serialVersionUID = 2L;

    /**
     * Header containing information about this configuration file.
     */
    @XmlElement(name = "header", required = true)
    private Header m_header;

    @XmlElement(name = "notification", required = true)
    private List<Notification> m_notifications = new ArrayList<>();

    public Notifications() { }

    public Header getHeader() {
        return m_header;
    }

    public void setHeader(final Header header) {
        m_header = header;
    }

    public List<Notification> getNotifications() {
        return m_notifications;
    }

    public void setNotifications(final List<Notification> notifications) {
        if (notifications == m_notifications) return;
        m_notifications.clear();
        if (notifications != null) m_notifications.addAll(notifications);
    }

    public void addNotification(final Notification notification) {
        m_notifications.add(notification);
    }

    public boolean removeNotification(final Notification notification) {
        return m_notifications.remove(notification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_header, m_notifications);
    }

    @Override
    public boolean equals(final Object obj) {
        if ( this == obj ) {
            return true;
        }

        if (obj instanceof Notifications) {
            final Notifications that = (Notifications)obj;
            return Objects.equals(this.m_header, that.m_header)
                    && Objects.equals(this.m_notifications, that.m_notifications);
        }
        return false;
    }

}
