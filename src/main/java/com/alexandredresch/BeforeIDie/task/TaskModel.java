package com.alexandredresch.BeforeIDie.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private UUID userId;
    @Column(length = 50)
    private String title;
    private String description;
    private String motivation;
    private String priority;
    private Boolean finished;
    private Boolean isPublic;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
