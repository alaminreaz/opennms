//
// This file is part of the OpenNMS(R) Application.
//
// OpenNMS(R) is Copyright (C) 2006 The OpenNMS Group, Inc.  All rights reserved.
// OpenNMS(R) is a derivative work, containing both original code, included code and modified
// code that was published under the GNU General Public License. Copyrights for modified 
// and included code are below.
//
// OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
//
// Original code base Copyright (C) 1999-2001 Oculan Corp.  All rights reserved.
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
//
// For more information contact:
// OpenNMS Licensing       <license@opennms.org>
//     http://www.opennms.org/
//     http://www.opennms.com/
//
package org.opennms.netmgt.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.core.style.ToStringCreator;


/** 
 *        @hibernate.class
 *         table="usersnotified"
 *     
*/
public class OnmsUserNotification extends OnmsEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1750912427062821742L;
    
    private Integer m_id;
    
    /** identifier field */
    private String m_userId;

    /** identifier field */
    private Date m_notifyTime;

    /** identifier field */
    private String m_media;

    /** identifier field */
    private String m_contactInfo;

    /** identifier field */
    private String m_autoNotify;

    /** persistent field */
    private OnmsNotification m_notification;

    /** full constructor */
    public OnmsUserNotification(String userId, Date notifyTime, String media, String contactInfo, String autoNotify, OnmsNotification notification, Integer id) {
        m_userId = userId;
        m_notifyTime = notifyTime;
        m_media = media;
        m_contactInfo = contactInfo;
        m_autoNotify = autoNotify;
        m_notification = notification;
        m_id = id;
    }

    /** default constructor */
    public OnmsUserNotification() {
    }
    
    /** 
     *                @hibernate.property
     *                 column="userId"
     *                 length="256"
     *             
     */
    public String getUserId() {
        return m_userId;
    }

    public void setUserId(String userId) {
        m_userId = userId;
    }

    /** 
     *                @hibernate.property
     *                 column="notifyTime"
     *                 length="8"
     *             
     */
    public Date getNotifyTime() {
        return m_notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        m_notifyTime = notifyTime;
    }

    /** 
     *                @hibernate.property
     *                 column="media"
     *                 length="32"
     *             
     */
    public String getMedia() {
        return m_media;
    }

    public void setMedia(String media) {
        m_media = media;
    }

    /** 
     *                @hibernate.property
     *                 column="contactInfo"
     *                 length="64"
     *             
     */
    public String getContactInfo() {
        return m_contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        m_contactInfo = contactInfo;
    }

    /** 
     *                @hibernate.property
     *                 column="autoNotify"
     *                 length="1"
     *             
     */
    public String getAutoNotify() {
        return m_autoNotify;
    }

    public void setAutoNotify(String autoNotify) {
        m_autoNotify = autoNotify;
    }

    /** 
     *            @hibernate.many-to-one
     *             not-null="true"
     *            @hibernate.column name="notifyid"         
     *         
     */
    public OnmsNotification getNotification() {
        return m_notification;
    }

    public void setNotification(OnmsNotification notification) {
        m_notification = notification;
    }

    public String toString() {
        return new ToStringCreator(this)
            .append("userId", getUserId())
            .append("notifyTime", getNotifyTime())
            .append("media", getMedia())
            .append("contactInfo", getContactInfo())
            .append("autoNotify", getAutoNotify())
            .append("id", getId())
            .toString();
    }

	public void visit(EntityVisitor visitor) {
		// TODO Auto-generated method stub
		throw new RuntimeException("visitor method not implemented");

	}

	/**
	 * @hibernate.id generator-class="assigned" type="java.lang.Integer"
	 *               column="id"
	 * @hibernate.generator-param name="sequence" value="userNotifNxtId"
	 */
    public Integer getId() {
        return m_id;
    }

    public void setId(Integer id) {
        m_id = id;
    }

}
