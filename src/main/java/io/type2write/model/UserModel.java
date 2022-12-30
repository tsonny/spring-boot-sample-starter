package io.type2write.model;

public class UserModel {

    private String firstName;
    private String lastName;
    private Integer memberId;

    private String creationTime;

    public UserModel() {

    }

    public UserModel(String firstName, String lastName, Integer membershipId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = membershipId;
    }

    public UserModel(String firstName, String lastName, Integer memberId, String creationTime) {
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

}
