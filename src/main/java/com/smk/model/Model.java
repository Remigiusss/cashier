package com.smk.model;

import java.util.Date;

public class Model {
    protected Date dateCreated;
    protected Date lastModified;
    protected Date createdBt;
    protected Date undateBy;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Date getCreatedBt() {
        return createdBt;
    }

    public void setCreatedBt(Date createdBt) {
        this.createdBt = createdBt;
    }

    public Date getUndateBy() {
        return undateBy;
    }

    public void setUndateBy(Date undateBy) {
        this.undateBy = undateBy;
    }
}
