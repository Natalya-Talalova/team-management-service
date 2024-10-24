package com.team8.team_management_service.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "teammate", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "team_id"})
})
public class Teammate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @ElementCollection(targetClass = TeammateRole.class)
    @CollectionTable(
            name = "teammate_role",
            joinColumns = @JoinColumn(name = "teammate_id")
    )
    @Enumerated(EnumType.STRING)
    @Column(name = "teammate_role", nullable = false)
    private Set<TeammateRole> roles;

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Set<TeammateRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<TeammateRole> roles) {
        this.roles = roles;
    }
}