/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package try_database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author lance
 */
@Entity
@Table(name = "student_info")
@NamedQueries({
    @NamedQuery(name = "StudentInfo.findAll", query = "SELECT s FROM StudentInfo s"),
    @NamedQuery(name = "StudentInfo.findById", query = "SELECT s FROM StudentInfo s WHERE s.id = :id"),
    @NamedQuery(name = "StudentInfo.findBySurname", query = "SELECT s FROM StudentInfo s WHERE s.surname = :surname"),
    @NamedQuery(name = "StudentInfo.findByGivenName", query = "SELECT s FROM StudentInfo s WHERE s.givenName = :givenName"),
    @NamedQuery(name = "StudentInfo.findByAge", query = "SELECT s FROM StudentInfo s WHERE s.age = :age")})
public class StudentInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "SURNAME")
    private String surname;
    @Basic(optional = false)
    @Column(name = "GIVEN NAME")
    private String givenName;
    @Basic(optional = false)
    @Column(name = "AGE")
    private int age;

    public StudentInfo() {
    }

    public StudentInfo(String id) {
        this.id = id;
    }

    public StudentInfo(String id, String surname, String givenName, int age) {
        this.id = id;
        this.surname = surname;
        this.givenName = givenName;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        if (!(object instanceof StudentInfo)) {
            return false;
        }
        StudentInfo other = (StudentInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String result = null;
        int i = 0;
        for(i = 1; i < 5; i++){
            result += "try_database.StudentInfo[ id=" + id[1] + " ]";
        }
        return "try_database.StudentInfo[ id=" + id + " ]";
    }
    
}
