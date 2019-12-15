/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dr M H B Ariyaratne<buddhika.ari@gmail.com>
 */
@Entity
@Table(name = "patientdemographic")
@XmlRootElement
public class Patientdemographic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "patientID")
    private String patientID;
    @Size(max = 10)
    @Column(name = "patientNIC")
    private String patientNIC;
    @Size(max = 10)
    @Column(name = "patientPassport")
    private String patientPassport;
    @Size(max = 10)
    @Column(name = "patientDrivingLicense")
    private String patientDrivingLicense;
    @Size(max = 10)
    @Column(name = "patientPersonalTitle")
    private String patientPersonalTitle;
    @Size(max = 50)
    @Column(name = "patientName")
    private String patientName;
    @Size(max = 10)
    @Column(name = "patientSex")
    private String patientSex;
    @Size(max = 10)
    @Column(name = "patientDateofbirth")
    private String patientDateofbirth;
    @Size(max = 30)
    @Column(name = "patientAge")
    private String patientAge;
    @Size(max = 20)
    @Column(name = "patientCitizenship")
    private String patientCitizenship;
    @Size(max = 20)
    @Column(name = "patientEthnicgroup")
    private String patientEthnicgroup;
    @Size(max = 20)
    @Column(name = "patientReligion")
    private String patientReligion;
    @Size(max = 20)
    @Column(name = "patientMaritalstatus")
    private String patientMaritalstatus;
    @Transient
    private String address;
    @Size(max = 50)
    @Column(name = "patientAddressLine01")
    private String patientAddressLine01;
    @Size(max = 50)
    @Column(name = "patientAddressLine02")
    private String patientAddressLine02;
    @Size(max = 50)
    @Column(name = "patientAddressLine03")
    private String patientAddressLine03;
    @Size(max = 50)
    @Column(name = "patientAddressDSdivision")
    private String patientAddressDSdivision;
    @Size(max = 50)
    @Column(name = "patientAddressDistrict")
    private String patientAddressDistrict;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "patientAddressPHMDivision")
    private String patientAddressPHMDivision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "patientAddressGNDivision")
    private String patientAddressGNDivision;
    @Size(max = 10)
    @Column(name = "patientContactLand01")
    private String patientContactLand01;
    @Size(max = 10)
    @Column(name = "patientContactLand02")
    private String patientContactLand02;
    @Size(max = 10)
    @Column(name = "patientContactMobile01")
    private String patientContactMobile01;
    @Size(max = 10)
    @Column(name = "patientContactMobile02")
    private String patientContactMobile02;
    @Size(max = 200)
    @Column(name = "patientContactEmail")
    private String patientContactEmail;
    @Column(name = "registrationDate")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
    @Column(name = "registrationTime")
    @Temporal(TemporalType.TIME)
    private Date registrationTime;
    @Column(name = "demographicinsertedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date demographicinsertedOn;
    @Size(max = 100)
    @Column(name = "demographiclastupdateBy")
    private String demographiclastupdateBy;
    @Column(name = "demographiclastupdateOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date demographiclastupdateOn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "recordCancelled")
    private String recordCancelled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registeredDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registeredDateTime;

    public Patientdemographic() {
    }

    public Patientdemographic(String patientID) {
        this.patientID = patientID;
    }

    @Transient
    Long pidCount=0l;
    @Transient
    private Long pid;
    
    
    
    
    public String getPatientID() {
        
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientNIC() {
        return patientNIC;
    }

    public void setPatientNIC(String patientNIC) {
        this.patientNIC = patientNIC;
    }

    public String getPatientPassport() {
        return patientPassport;
    }

    public void setPatientPassport(String patientPassport) {
        this.patientPassport = patientPassport;
    }

    public String getPatientDrivingLicense() {
        return patientDrivingLicense;
    }

    public void setPatientDrivingLicense(String patientDrivingLicense) {
        this.patientDrivingLicense = patientDrivingLicense;
    }

    public String getPatientPersonalTitle() {
        return patientPersonalTitle;
    }

    public void setPatientPersonalTitle(String patientPersonalTitle) {
        this.patientPersonalTitle = patientPersonalTitle;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public String getPatientDateofbirth() {
        return patientDateofbirth;
    }

    public void setPatientDateofbirth(String patientDateofbirth) {
        this.patientDateofbirth = patientDateofbirth;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientCitizenship() {
        return patientCitizenship;
    }

    public void setPatientCitizenship(String patientCitizenship) {
        this.patientCitizenship = patientCitizenship;
    }

    public String getPatientEthnicgroup() {
        return patientEthnicgroup;
    }

    public void setPatientEthnicgroup(String patientEthnicgroup) {
        this.patientEthnicgroup = patientEthnicgroup;
    }

    public String getPatientReligion() {
        return patientReligion;
    }

    public void setPatientReligion(String patientReligion) {
        this.patientReligion = patientReligion;
    }

    public String getPatientMaritalstatus() {
        return patientMaritalstatus;
    }

    public void setPatientMaritalstatus(String patientMaritalstatus) {
        this.patientMaritalstatus = patientMaritalstatus;
    }

    public String getPatientAddressLine01() {
        return patientAddressLine01;
    }

    public void setPatientAddressLine01(String patientAddressLine01) {
        this.patientAddressLine01 = patientAddressLine01;
    }

    public String getPatientAddressLine02() {
        return patientAddressLine02;
    }

    public void setPatientAddressLine02(String patientAddressLine02) {
        this.patientAddressLine02 = patientAddressLine02;
    }

    public String getPatientAddressLine03() {
        return patientAddressLine03;
    }

    public void setPatientAddressLine03(String patientAddressLine03) {
        this.patientAddressLine03 = patientAddressLine03;
    }

    public String getPatientAddressDSdivision() {
        return patientAddressDSdivision;
    }

    public void setPatientAddressDSdivision(String patientAddressDSdivision) {
        this.patientAddressDSdivision = patientAddressDSdivision;
    }

    public String getPatientAddressDistrict() {
        return patientAddressDistrict;
    }

    public void setPatientAddressDistrict(String patientAddressDistrict) {
        this.patientAddressDistrict = patientAddressDistrict;
    }

    public String getPatientAddressPHMDivision() {
        return patientAddressPHMDivision;
    }

    public void setPatientAddressPHMDivision(String patientAddressPHMDivision) {
        this.patientAddressPHMDivision = patientAddressPHMDivision;
    }

    public String getPatientAddressGNDivision() {
        return patientAddressGNDivision;
    }

    public void setPatientAddressGNDivision(String patientAddressGNDivision) {
        this.patientAddressGNDivision = patientAddressGNDivision;
    }

    public String getPatientContactLand01() {
        return patientContactLand01;
    }

    public void setPatientContactLand01(String patientContactLand01) {
        this.patientContactLand01 = patientContactLand01;
    }

    public String getPatientContactLand02() {
        return patientContactLand02;
    }

    public void setPatientContactLand02(String patientContactLand02) {
        this.patientContactLand02 = patientContactLand02;
    }

    public String getPatientContactMobile01() {
        return patientContactMobile01;
    }

    public void setPatientContactMobile01(String patientContactMobile01) {
        this.patientContactMobile01 = patientContactMobile01;
    }

    public String getPatientContactMobile02() {
        return patientContactMobile02;
    }

    public void setPatientContactMobile02(String patientContactMobile02) {
        this.patientContactMobile02 = patientContactMobile02;
    }

    public String getPatientContactEmail() {
        return patientContactEmail;
    }

    public void setPatientContactEmail(String patientContactEmail) {
        this.patientContactEmail = patientContactEmail;
    }


    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }


    public Date getDemographicinsertedOn() {
        return demographicinsertedOn;
    }

    public void setDemographicinsertedOn(Date demographicinsertedOn) {
        this.demographicinsertedOn = demographicinsertedOn;
    }

    public String getDemographiclastupdateBy() {
        return demographiclastupdateBy;
    }

    public void setDemographiclastupdateBy(String demographiclastupdateBy) {
        this.demographiclastupdateBy = demographiclastupdateBy;
    }

    public Date getDemographiclastupdateOn() {
        return demographiclastupdateOn;
    }

    public void setDemographiclastupdateOn(Date demographiclastupdateOn) {
        this.demographiclastupdateOn = demographiclastupdateOn;
    }

    public String getRecordCancelled() {
        return recordCancelled;
    }

    public void setRecordCancelled(String recordCancelled) {
        this.recordCancelled = recordCancelled;
    }

    public Date getRegisteredDateTime() {
        return registeredDateTime;
    }

    public void setRegisteredDateTime(Date registeredDateTime) {
        this.registeredDateTime = registeredDateTime;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientID != null ? patientID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patientdemographic)) {
            return false;
        }
        Patientdemographic other = (Patientdemographic) object;
        if ((this.patientID == null && other.patientID != null) || (this.patientID != null && !this.patientID.equals(other.patientID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Patientdemographic[ patientID=" + patientID + " ]";
    }

    public Long getPid() {
        try{
            pid = Long.parseLong(patientID);
        }catch(Exception e){
            pid = pidCount;
            pidCount++;
            patientID = pid + "";
        }
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getAddress() {
        address = patientAddressLine01 + ", " + patientAddressLine02 + ", " + patientAddressLine03 + ", " + patientAddressDSdivision + ", " + patientAddressDistrict + ".";
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    
}
