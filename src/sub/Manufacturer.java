/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Sonu
 */
@Entity
@Table(name = "MANUFACTURER", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Manufacturer.findAll", query = "SELECT m FROM Manufacturer m")
    , @NamedQuery(name = "Manufacturer.findByManufacturerId", query = "SELECT m FROM Manufacturer m WHERE m.manufacturerId = :manufacturerId")
    , @NamedQuery(name = "Manufacturer.findByName", query = "SELECT m FROM Manufacturer m WHERE m.name = :name")
    , @NamedQuery(name = "Manufacturer.findByAddressline1", query = "SELECT m FROM Manufacturer m WHERE m.addressline1 = :addressline1")
    , @NamedQuery(name = "Manufacturer.findByAddressline2", query = "SELECT m FROM Manufacturer m WHERE m.addressline2 = :addressline2")
    , @NamedQuery(name = "Manufacturer.findByCity", query = "SELECT m FROM Manufacturer m WHERE m.city = :city")
    , @NamedQuery(name = "Manufacturer.findByState", query = "SELECT m FROM Manufacturer m WHERE m.state = :state")
    , @NamedQuery(name = "Manufacturer.findByZip", query = "SELECT m FROM Manufacturer m WHERE m.zip = :zip")
    , @NamedQuery(name = "Manufacturer.findByPhone", query = "SELECT m FROM Manufacturer m WHERE m.phone = :phone")
    , @NamedQuery(name = "Manufacturer.findByFax", query = "SELECT m FROM Manufacturer m WHERE m.fax = :fax")
    , @NamedQuery(name = "Manufacturer.findByEmail", query = "SELECT m FROM Manufacturer m WHERE m.email = :email")
    , @NamedQuery(name = "Manufacturer.findByRep", query = "SELECT m FROM Manufacturer m WHERE m.rep = :rep")})
public class Manufacturer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MANUFACTURER_ID")
    private Integer manufacturerId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ADDRESSLINE1")
    private String addressline1;
    @Column(name = "ADDRESSLINE2")
    private String addressline2;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "ZIP")
    private String zip;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "REP")
    private String rep;

    public Manufacturer() {
    }

    public Manufacturer(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        Integer oldManufacturerId = this.manufacturerId;
        this.manufacturerId = manufacturerId;
        changeSupport.firePropertyChange("manufacturerId", oldManufacturerId, manufacturerId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        String oldAddressline1 = this.addressline1;
        this.addressline1 = addressline1;
        changeSupport.firePropertyChange("addressline1", oldAddressline1, addressline1);
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        String oldAddressline2 = this.addressline2;
        this.addressline2 = addressline2;
        changeSupport.firePropertyChange("addressline2", oldAddressline2, addressline2);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        String oldZip = this.zip;
        this.zip = zip;
        changeSupport.firePropertyChange("zip", oldZip, zip);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        String oldFax = this.fax;
        this.fax = fax;
        changeSupport.firePropertyChange("fax", oldFax, fax);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        String oldRep = this.rep;
        this.rep = rep;
        changeSupport.firePropertyChange("rep", oldRep, rep);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manufacturerId != null ? manufacturerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manufacturer)) {
            return false;
        }
        Manufacturer other = (Manufacturer) object;
        if ((this.manufacturerId == null && other.manufacturerId != null) || (this.manufacturerId != null && !this.manufacturerId.equals(other.manufacturerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sub.Manufacturer[ manufacturerId=" + manufacturerId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
