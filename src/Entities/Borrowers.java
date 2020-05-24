/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manso
 */
@Entity
@Table(name = "borrowers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Borrowers.findAll", query = "SELECT b FROM Borrowers b")
    , @NamedQuery(name = "Borrowers.findById", query = "SELECT b FROM Borrowers b WHERE b.id = :id")
    , @NamedQuery(name = "Borrowers.findByFirstName", query = "SELECT b FROM Borrowers b WHERE b.firstName = :firstName")
    , @NamedQuery(name = "Borrowers.findByLastName", query = "SELECT b FROM Borrowers b WHERE b.lastName = :lastName")
    , @NamedQuery(name = "Borrowers.findByMobile", query = "SELECT b FROM Borrowers b WHERE b.mobile = :mobile")
    , @NamedQuery(name = "Borrowers.findByEmail", query = "SELECT b FROM Borrowers b WHERE b.email = :email")
    , @NamedQuery(name = "Borrowers.findByAddress", query = "SELECT b FROM Borrowers b WHERE b.address = :address")
    , @NamedQuery(name = "Borrowers.findByGender", query = "SELECT b FROM Borrowers b WHERE b.gender = :gender")})
public class Borrowers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "First_Name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "Mobile")
    private int mobile;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;

    public Borrowers() {
    }

    public Borrowers(Integer id) {
        this.id = id;
    }

    public Borrowers(Integer id, String firstName, String lastName, int mobile, String email, String address, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Borrowers)) {
            return false;
        }
        Borrowers other = (Borrowers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkgfinal.Borrowers[ id=" + id + " ]";
    }
    
}
