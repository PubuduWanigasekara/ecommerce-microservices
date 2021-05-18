package com.sliit.mtit.microservice.locationservice.dto;

import java.util.StringJoiner;

public class LocationRequest {

    private String no;
    private String city;
    private String district;
    private String province;
    private String country;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", LocationRequest.class.getSimpleName() + "[", "]")
                .add("no='" + no + "'")
                .add("city='" + city + "'")
                .add("district='" + district + "'")
                .add("province='" + province + "'")
                .add("country='" + country + "'")
                .toString();
    }
}
