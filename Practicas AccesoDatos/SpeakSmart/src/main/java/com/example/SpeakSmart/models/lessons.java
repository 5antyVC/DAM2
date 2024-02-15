
package com.example.SpeakSmart.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.security.Timestamp;

public class lessons {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lesson_uri;
    private String description;
    private Timestamp created_at;
    private Timestamp updated_at;

    @Override
    public String toString() {
        return "lessons{" + "id=" + id + ", name=" + name + ", lesson_uri=" + lesson_uri + ", description=" + description + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson_uri() {
        return lesson_uri;
    }

    public void setLesson_uri(String lesson_uri) {
        this.lesson_uri = lesson_uri;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
