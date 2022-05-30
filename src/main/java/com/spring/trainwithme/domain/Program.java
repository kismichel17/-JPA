package com.spring.trainwithme.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "programs")
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="user_id", nullable = false)
    private Long userId;

    private String name;

    private String description;

    @Column(name = "photo_url")
    private String photoURL;

    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private List<ProgramComposition> programComposition;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<ProgramComposition> getProgramComposition() {
        return programComposition;
    }

    public void setProgramComposition(List<ProgramComposition> programCompositions) {
        this.programComposition = programCompositions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", photoURL='" + photoURL + '\'' +
                '}';
    }
}
