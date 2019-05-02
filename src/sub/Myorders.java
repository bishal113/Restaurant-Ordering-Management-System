/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Sonu
 */
@Entity
@Table(name = "MYORDERS", catalog = "", schema = "SONU")
@NamedQueries({
    @NamedQuery(name = "Myorders.findAll", query = "SELECT m FROM Myorders m")
    , @NamedQuery(name = "Myorders.findByDrink", query = "SELECT m FROM Myorders m WHERE m.drink = :drink")
    , @NamedQuery(name = "Myorders.findByType", query = "SELECT m FROM Myorders m WHERE m.type = :type")
    , @NamedQuery(name = "Myorders.findByUnit", query = "SELECT m FROM Myorders m WHERE m.unit = :unit")
    , @NamedQuery(name = "Myorders.findBySize", query = "SELECT m FROM Myorders m WHERE m.size = :size")
    , @NamedQuery(name = "Myorders.findByQty", query = "SELECT m FROM Myorders m WHERE m.qty = :qty")
    , @NamedQuery(name = "Myorders.findByDateTime", query = "SELECT m FROM Myorders m WHERE m.dateTime = :dateTime")
    , @NamedQuery(name = "Myorders.findByPrice", query = "SELECT m FROM Myorders m WHERE m.price = :price")})
public class Myorders implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "DRINK")
    private String drink;
    @Basic(optional = false)
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @Column(name = "UNIT")
    private double unit;
    @Basic(optional = false)
    @Column(name = "SIZE")
    private String size;
    @Basic(optional = false)
    @Column(name = "QTY")
    private int qty;
    @Id
    @Basic(optional = false)
    @Column(name = "DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private double price;

    public Myorders() {
    }

    public Myorders(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Myorders(Date dateTime, String drink, String type, double unit, String size, int qty, double price) {
        this.dateTime = dateTime;
        this.drink = drink;
        this.type = type;
        this.unit = unit;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        String oldDrink = this.drink;
        this.drink = drink;
        changeSupport.firePropertyChange("drink", oldDrink, drink);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        double oldUnit = this.unit;
        this.unit = unit;
        changeSupport.firePropertyChange("unit", oldUnit, unit);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        String oldSize = this.size;
        this.size = size;
        changeSupport.firePropertyChange("size", oldSize, size);
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        int oldQty = this.qty;
        this.qty = qty;
        changeSupport.firePropertyChange("qty", oldQty, qty);
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        Date oldDateTime = this.dateTime;
        this.dateTime = dateTime;
        changeSupport.firePropertyChange("dateTime", oldDateTime, dateTime);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dateTime != null ? dateTime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Myorders)) {
            return false;
        }
        Myorders other = (Myorders) object;
        if ((this.dateTime == null && other.dateTime != null) || (this.dateTime != null && !this.dateTime.equals(other.dateTime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sub.Myorders[ dateTime=" + dateTime + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
