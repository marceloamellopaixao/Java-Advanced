package br.com.fiap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PetOwner {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique=true)
    private String username;
    private String password;

    public PetOwner(String username, String encode) {
        this.username = username;
        this.password = encode;
    }

    public PetOwner() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}