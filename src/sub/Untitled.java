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
@Table(name = "UNTITLED", catalog = "", schema = "SONU")
@NamedQueries({
    @NamedQuery(name = "Untitled.findAll", query = "SELECT u FROM Untitled u")
    , @NamedQuery(name = "Untitled.findByHgsd", query = "SELECT u FROM Untitled u WHERE u.hgsd = :hgsd")})
public class Untitled implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HGSD")
    private Boolean hgsd;

    public Untitled() {
    }

    public Untitled(Boolean hgsd) {
        this.hgsd = hgsd;
    }

    public Boolean getHgsd() {
        return hgsd;
    }

    public void setHgsd(Boolean hgsd) {
        Boolean oldHgsd = this.hgsd;
        this.hgsd = hgsd;
        changeSupport.firePropertyChange("hgsd", oldHgsd, hgsd);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hgsd != null ? hgsd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Untitled)) {
            return false;
        }
        Untitled other = (Untitled) object;
        if ((this.hgsd == null && other.hgsd != null) || (this.hgsd != null && !this.hgsd.equals(other.hgsd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sub.Untitled[ hgsd=" + hgsd + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
