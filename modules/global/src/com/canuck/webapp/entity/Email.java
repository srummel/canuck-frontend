/*
 * Copyright Canuck Industries
 */
package com.canuck.webapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

/** 
* rummels
*/
@NamePattern("%s %s|dateReceived,sentBy")
@Table(name = "EMAIL_MESSAGES")
@Entity(name = "canuckwebapp$Email")
public class Email extends StandardEntity {
    private static final long serialVersionUID = 3141615271473089707L;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "DATE_RECEIVED", nullable = false, unique = true)
    protected Date dateReceived;

    @NotNull
    @Column(name = "SENT_BY", nullable = false)
    protected String sentBy;

    @Lob
    @Column(name = "OTHER_RECIPIENTS")
    protected String otherRecipients;

    @NotNull
    @Lob
    @Column(name = "CONTENT", nullable = false)
    protected String content;

    @Column(name = "ATTACHMENTS")
    protected byte[] attachments;

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setOtherRecipients(String otherRecipients) {
        this.otherRecipients = otherRecipients;
    }

    public String getOtherRecipients() {
        return otherRecipients;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }

    public byte[] getAttachments() {
        return attachments;
    }


}