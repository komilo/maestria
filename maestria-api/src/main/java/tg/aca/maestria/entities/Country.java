/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.aca.maestria.entities;

import java.util.Objects;
import tg.komilo.kore.entities.BaseEntity;

/**
 *
 * @author abdel.nambiema
 */
public class Country extends BaseEntity {

    private Integer id;

    private String phoneCode;

    private String label;

    private String nationalityLabel;

    public Country() {
    }

    public Country(String phoneCode, String label, String nationalityLabel) {
        this.phoneCode = phoneCode;
        this.label = label;
        this.nationalityLabel = nationalityLabel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getNationalityLabel() {
        return nationalityLabel;
    }

    public void setNationalityLabel(String nationalityLabel) {
        this.nationalityLabel = nationalityLabel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", phoneCode=" + phoneCode + ", label=" + label + ", nationalityLabel=" + nationalityLabel + '}';
    }
}
