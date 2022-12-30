package io.type2write.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class UserEntity implements Serializable {

    @Id
    private String firstName;
    private String lastName;
    private Integer memberId;

    private String creationTime;

    public UserEntity() {

    }

    public UserEntity(String firstName, String lastName, Integer memberId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
    }

    public UserEntity(String firstName, String lastName, Integer memberId, String creationTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
        this.creationTime = creationTime;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}
