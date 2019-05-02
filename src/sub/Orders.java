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
import javax.persistence.Lob;
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
@Table(name = "ORDERS", catalog = "", schema = "SONU")
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o")
    , @NamedQuery(name = "Orders.findByUnit", query = "SELECT o FROM Orders o WHERE o.unit = :unit")
    , @NamedQuery(name = "Orders.findByQty", query = "SELECT o FROM Orders o WHERE o.qty = :qty")
    , @NamedQuery(name = "Orders.findByPrice", query = "SELECT o FROM Orders o WHERE o.price = :price")
    , @NamedQuery(name = "Orders.findByDate", query = "SELECT o FROM Orders o WHERE o.date = :date")})
public class Orders implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "DRINK")
    private String drink;
    @Basic(optional = false)
    @Lob
    @Column(name = "TYPE")
    private String type;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "UNIT")
    private Double unit;
    @Basic(optional = false)
    @Column(name = "QTY")
    private int qty;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private double price;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Orders() {
    }

    public Orders(Double unit) {
        this.unit = unit;
    }

    public Orders(Double unit, String drink, String type, int qty, double price) {
        this.unit = unit;
        this.drink = drink;
        this.type = type;
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

    public Double getUnit() {
        return unit;
    }

    public void setUnit(Double unit) {
        Double oldUnit = this.unit;
        this.unit = unit;
        changeSupport.firePropertyChange("unit", oldUnit, unit);
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        int oldQty = this.qty;
        this.qty = qty;
        changeSupport.firePropertyChange("qty", oldQty, qty);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unit != null ? unit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.unit == null && other.unit != null) || (this.unit != null && !this.unit.equals(other.unit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sub.Orders[ unit=" + unit + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
