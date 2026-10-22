package com.dsa.systemdesign.entity;



import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    private String customerEmail;

    private String status;

    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist(){
        this.status = "PENDING";
        this.createdAt = LocalDateTime.now();
    }

}
