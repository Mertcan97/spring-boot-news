package com.sha.dernek.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "activities")
public class Activities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject", length = 100)
    private String subject;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "validity_date")
    private LocalDateTime validityDate;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Announcement announcement;

    @ManyToOne(cascade = {CascadeType.ALL})
    private News news;
}
