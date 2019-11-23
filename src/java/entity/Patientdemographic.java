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
@NamedQueries({
    @NamedQuery(name = "Patientdemographic.findAll", query = "SELECT p FROM Patientdemographic p")
    , @NamedQuery(name = "Patientdemographic.findByPatientID", query = "SELECT p FROM Patientdemographic p WHERE p.patientID = :patientID")
    , @NamedQuery(name = "Patientdemographic.findByPatientNIC", query = "SELECT p FROM Patientdemographic p WHERE p.patientNIC = :patientNIC")
    , @NamedQuery(name = "Patientdemographic.findByPatientPassport", query = "SELECT p FROM Patientdemographic p WHERE p.patientPassport = :patientPassport")
    , @NamedQuery(name = "Patientdemographic.findByPatientDrivingLicense", query = "SELECT p FROM Patientdemographic p WHERE p.patientDrivingLicense = :patientDrivingLicense")
    , @NamedQuery(name = "Patientdemographic.findByMotherBHT", query = "SELECT p FROM Patientdemographic p WHERE p.motherBHT = :motherBHT")
    , @NamedQuery(name = "Patientdemographic.findByPatientPersonalTitle", query = "SELECT p FROM Patientdemographic p WHERE p.patientPersonalTitle = :patientPersonalTitle")
    , @NamedQuery(name = "Patientdemographic.findByPatientName", query = "SELECT p FROM Patientdemographic p WHERE p.patientName = :patientName")
    , @NamedQuery(name = "Patientdemographic.findByPatientSex", query = "SELECT p FROM Patientdemographic p WHERE p.patientSex = :patientSex")
    , @NamedQuery(name = "Patientdemographic.findByPatientDateofbirth", query = "SELECT p FROM Patientdemographic p WHERE p.patientDateofbirth = :patientDateofbirth")
    , @NamedQuery(name = "Patientdemographic.findByPatientAge", query = "SELECT p FROM Patientdemographic p WHERE p.patientAge = :patientAge")
    , @NamedQuery(name = "Patientdemographic.findByPatientCitizenship", query = "SELECT p FROM Patientdemographic p WHERE p.patientCitizenship = :patientCitizenship")
    , @NamedQuery(name = "Patientdemographic.findByPatientEthnicgroup", query = "SELECT p FROM Patientdemographic p WHERE p.patientEthnicgroup = :patientEthnicgroup")
    , @NamedQuery(name = "Patientdemographic.findByPatientReligion", query = "SELECT p FROM Patientdemographic p WHERE p.patientReligion = :patientReligion")
    , @NamedQuery(name = "Patientdemographic.findByPatientMaritalstatus", query = "SELECT p FROM Patientdemographic p WHERE p.patientMaritalstatus = :patientMaritalstatus")
    , @NamedQuery(name = "Patientdemographic.findByPatientAddressLine01", query = "SELECT p FROM Patientdemographic p WHERE p.patientAddressLine01 = :patientAddressLine01")
    , @NamedQuery(name = "Patientdemographic.findByPatientAddressLine02", query = "SELECT p FROM Patientdemographic p WHERE p.patientAddressLine02 = :patientAddressLine02")
    , @NamedQuery(name = "Patientdemographic.findByPatientAddressLine03", query = "SELECT p FROM Patientdemographic p WHERE p.patientAddressLine03 = :patientAddressLine03")
    , @NamedQuery(name = "Patientdemographic.findByPatientAddressDSdivision", query = "SELECT p FROM Patientdemographic p WHERE p.patientAddressDSdivision = :patientAddressDSdivision")
    , @NamedQuery(name = "Patientdemographic.findByPatientAddressDistrict", query = "SELECT p FROM Patientdemographic p WHERE p.patientAddressDistrict = :patientAddressDistrict")
    , @NamedQuery(name = "Patientdemographic.findByPatientAddressPHMDivision", query = "SELECT p FROM Patientdemographic p WHERE p.patientAddressPHMDivision = :patientAddressPHMDivision")
    , @NamedQuery(name = "Patientdemographic.findByPatientAddressGNDivision", query = "SELECT p FROM Patientdemographic p WHERE p.patientAddressGNDivision = :patientAddressGNDivision")
    , @NamedQuery(name = "Patientdemographic.findByPatientContactLand01", query = "SELECT p FROM Patientdemographic p WHERE p.patientContactLand01 = :patientContactLand01")
    , @NamedQuery(name = "Patientdemographic.findByPatientContactLand02", query = "SELECT p FROM Patientdemographic p WHERE p.patientContactLand02 = :patientContactLand02")
    , @NamedQuery(name = "Patientdemographic.findByPatientContactMobile01", query = "SELECT p FROM Patientdemographic p WHERE p.patientContactMobile01 = :patientContactMobile01")
    , @NamedQuery(name = "Patientdemographic.findByPatientContactMobile02", query = "SELECT p FROM Patientdemographic p WHERE p.patientContactMobile02 = :patientContactMobile02")
    , @NamedQuery(name = "Patientdemographic.findByPatientContactEmail", query = "SELECT p FROM Patientdemographic p WHERE p.patientContactEmail = :patientContactEmail")
    , @NamedQuery(name = "Patientdemographic.findByPatientDeath", query = "SELECT p FROM Patientdemographic p WHERE p.patientDeath = :patientDeath")
    , @NamedQuery(name = "Patientdemographic.findByRegistrationDate", query = "SELECT p FROM Patientdemographic p WHERE p.registrationDate = :registrationDate")
    , @NamedQuery(name = "Patientdemographic.findByRegistrationTime", query = "SELECT p FROM Patientdemographic p WHERE p.registrationTime = :registrationTime")
    , @NamedQuery(name = "Patientdemographic.findByUser", query = "SELECT p FROM Patientdemographic p WHERE p.user = :user")
    , @NamedQuery(name = "Patientdemographic.findByDemographicinsertedOn", query = "SELECT p FROM Patientdemographic p WHERE p.demographicinsertedOn = :demographicinsertedOn")
    , @NamedQuery(name = "Patientdemographic.findByDemographiclastupdateBy", query = "SELECT p FROM Patientdemographic p WHERE p.demographiclastupdateBy = :demographiclastupdateBy")
    , @NamedQuery(name = "Patientdemographic.findByDemographiclastupdateOn", query = "SELECT p FROM Patientdemographic p WHERE p.demographiclastupdateOn = :demographiclastupdateOn")
    , @NamedQuery(name = "Patientdemographic.findByRecordCancelled", query = "SELECT p FROM Patientdemographic p WHERE p.recordCancelled = :recordCancelled")
    , @NamedQuery(name = "Patientdemographic.findByRegisteredDateTime", query = "SELECT p FROM Patientdemographic p WHERE p.registeredDateTime = :registeredDateTime")
    , @NamedQuery(name = "Patientdemographic.findByUpdateBy", query = "SELECT p FROM Patientdemographic p WHERE p.updateBy = :updateBy")
    , @NamedQuery(name = "Patientdemographic.findByUpdateDateTime", query = "SELECT p FROM Patientdemographic p WHERE p.updateDateTime = :updateDateTime")
    , @NamedQuery(name = "Patientdemographic.findByPatientBloodType", query = "SELECT p FROM Patientdemographic p WHERE p.patientBloodType = :patientBloodType")
    , @NamedQuery(name = "Patientdemographic.findByLastUpdate", query = "SELECT p FROM Patientdemographic p WHERE p.lastUpdate = :lastUpdate")
    , @NamedQuery(name = "Patientdemographic.findByLastUpdateUser", query = "SELECT p FROM Patientdemographic p WHERE p.lastUpdateUser = :lastUpdateUser")
    , @NamedQuery(name = "Patientdemographic.findByCreateDate", query = "SELECT p FROM Patientdemographic p WHERE p.createDate = :createDate")
    , @NamedQuery(name = "Patientdemographic.findByCreateUser", query = "SELECT p FROM Patientdemographic p WHERE p.createUser = :createUser")
    , @NamedQuery(name = "Patientdemographic.findBySessionRole", query = "SELECT p FROM Patientdemographic p WHERE p.sessionRole = :sessionRole")
    , @NamedQuery(name = "Patientdemographic.findBySessionDepartment", query = "SELECT p FROM Patientdemographic p WHERE p.sessionDepartment = :sessionDepartment")
    , @NamedQuery(name = "Patientdemographic.findBySessionUnit", query = "SELECT p FROM Patientdemographic p WHERE p.sessionUnit = :sessionUnit")
    , @NamedQuery(name = "Patientdemographic.findByPrintcount", query = "SELECT p FROM Patientdemographic p WHERE p.printcount = :printcount")})
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "motherBHT")
    private String motherBHT;
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
    @Size(max = 3)
    @Column(name = "patientDeath")
    private String patientDeath;
    @Lob
    @Size(max = 65535)
    @Column(name = "drugAllergies")
    private String drugAllergies;
    @Lob
    @Size(max = 65535)
    @Column(name = "foodAllergies")
    private String foodAllergies;
    @Lob
    @Size(max = 65535)
    @Column(name = "otherAllergies")
    private String otherAllergies;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registrationDate")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registrationTime")
    @Temporal(TemporalType.TIME)
    private Date registrationTime;
    @Size(max = 50)
    @Column(name = "user")
    private String user;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "updateBy")
    private String updateBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "updateDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
    @Size(max = 255)
    @Column(name = "patientBloodType")
    private String patientBloodType;
    @Column(name = "lastUpdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @Size(max = 255)
    @Column(name = "lastUpdateUser")
    private String lastUpdateUser;
    @Column(name = "createDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Size(max = 255)
    @Column(name = "createUser")
    private String createUser;
    @Size(max = 10)
    @Column(name = "sessionRole")
    private String sessionRole;
    @Size(max = 10)
    @Column(name = "sessionDepartment")
    private String sessionDepartment;
    @Size(max = 10)
    @Column(name = "sessionUnit")
    private String sessionUnit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "printcount")
    private int printcount;

    public Patientdemographic() {
    }

    public Patientdemographic(String patientID) {
        this.patientID = patientID;
    }

    public Patientdemographic(String patientID, String motherBHT, String patientAddressPHMDivision, String patientAddressGNDivision, Date registrationDate, Date registrationTime, String recordCancelled, Date registeredDateTime, String updateBy, Date updateDateTime, int printcount) {
        this.patientID = patientID;
        this.motherBHT = motherBHT;
        this.patientAddressPHMDivision = patientAddressPHMDivision;
        this.patientAddressGNDivision = patientAddressGNDivision;
        this.registrationDate = registrationDate;
        this.registrationTime = registrationTime;
        this.recordCancelled = recordCancelled;
        this.registeredDateTime = registeredDateTime;
        this.updateBy = updateBy;
        this.updateDateTime = updateDateTime;
        this.printcount = printcount;
    }

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

    public String getMotherBHT() {
        return motherBHT;
    }

    public void setMotherBHT(String motherBHT) {
        this.motherBHT = motherBHT;
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

    public String getPatientDeath() {
        return patientDeath;
    }

    public void setPatientDeath(String patientDeath) {
        this.patientDeath = patientDeath;
    }

    public String getDrugAllergies() {
        return drugAllergies;
    }

    public void setDrugAllergies(String drugAllergies) {
        this.drugAllergies = drugAllergies;
    }

    public String getFoodAllergies() {
        return foodAllergies;
    }

    public void setFoodAllergies(String foodAllergies) {
        this.foodAllergies = foodAllergies;
    }

    public String getOtherAllergies() {
        return otherAllergies;
    }

    public void setOtherAllergies(String otherAllergies) {
        this.otherAllergies = otherAllergies;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getPatientBloodType() {
        return patientBloodType;
    }

    public void setPatientBloodType(String patientBloodType) {
        this.patientBloodType = patientBloodType;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getSessionRole() {
        return sessionRole;
    }

    public void setSessionRole(String sessionRole) {
        this.sessionRole = sessionRole;
    }

    public String getSessionDepartment() {
        return sessionDepartment;
    }

    public void setSessionDepartment(String sessionDepartment) {
        this.sessionDepartment = sessionDepartment;
    }

    public String getSessionUnit() {
        return sessionUnit;
    }

    public void setSessionUnit(String sessionUnit) {
        this.sessionUnit = sessionUnit;
    }

    public int getPrintcount() {
        return printcount;
    }

    public void setPrintcount(int printcount) {
        this.printcount = printcount;
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
    
}
