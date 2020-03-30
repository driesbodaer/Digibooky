package com.teamawsome.domain.dto;

import com.teamawsome.domain.member.Member;

import java.util.Objects;

public class MemberDto {
    private  int id;
    private  String inss;
    private  String eMail;
    private  String firstName;
    private  String lastName;
    private String streetName;
    private int houseNumber;
    private int postalCode;
    private String city;

    public MemberDto(Member member) {
        this.id = member.getId();
        this.inss = member.getInss();
        this.eMail = member.geteMail();
        this.firstName = member.getFirstName();
        this.lastName = member.getLastName();
        this.streetName = member.getStreetName();
        this.houseNumber = member.getHouseNumber();
        this.postalCode = member.getPostalCode();
        this.city = member.getCity();
    }

    public int getId() {
        return id;
    }

    public String getInss() {
        return inss;
    }

    public String geteMail() {
        return eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDto memberDto = (MemberDto) o;
        return
                Objects.equals(inss, memberDto.inss) &&
                houseNumber == memberDto.houseNumber &&
                postalCode == memberDto.postalCode &&
                Objects.equals(eMail, memberDto.eMail) &&
                Objects.equals(firstName, memberDto.firstName) &&
                Objects.equals(lastName, memberDto.lastName) &&
                Objects.equals(streetName, memberDto.streetName) &&
                Objects.equals(city, memberDto.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inss, eMail, firstName, lastName, streetName, houseNumber, postalCode, city);
    }

    public MemberDto setInssToEmpty() {
        inss = "";
        return this;
    }
}