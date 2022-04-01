package com.TestingHW3;

public class Member {
    private String name;
    private String surname;
    private int memberID;
    private int membershipLength;

    public Member() {
    }

    public Member(String name, String surname, int memberID, int membershipLength) {
        this.name = name;
        this.surname = surname;
        this.memberID = memberID;
        this.membershipLength = membershipLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getMembershipLength() {
        return membershipLength;
    }

    public void setMembershipLength(int membershipLength) {
        this.membershipLength = membershipLength;
    }
}
