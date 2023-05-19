package com.belajarspringboot.resto.audit;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public class Audit {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreationTimestamp
    @Column(name = "dibuat")
    private Date Dibuat;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @UpdateTimestamp
    @Column(name = "diupdate")
    private Date Diupdate;

    public Date getDibuat() {
        return Dibuat;
    }

    public void setDibuat(Date dibuat) {
        Dibuat = dibuat;
    }

    public Date getDiupdate() {
        return Diupdate;
    }

    public void setDiupdate(Date diupdate) {
        Diupdate = diupdate;
    }
}
