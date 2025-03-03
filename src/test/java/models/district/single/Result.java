package models.district.single;

import lombok.Data;

@Data
public class Result {
    private Object covidVaccinationTicketCount;
    private Object covidVaccinationTicketReceiveTime;
    private Integer id;
    private String description;
    private Integer district;
    private Integer districtId;
    private String districtName;
    private Boolean isActive;
    private String lpuFullName;
    private String lpuShortName;
    private String lpuType;
    private Object oid;
    private Object partOf;
    private String headOrganization;
    private String organization;
    private String address;
    private String phone;
    private String email;
    private String longitude;
    private String latitude;
    private Boolean covidVaccination;
    private Boolean inDepthExamination;
    private Object subdivision;
}