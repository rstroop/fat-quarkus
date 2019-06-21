package com.rstroop.fat;

/**
 * Combo
 */
public class Combo {

    Long id;
    Integer combo1;
    Integer combo2;
    Integer combo3;
    String secret;

    public Combo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCombo1() {
        return combo1;
    }

    public void setCombo1(Integer combo1) {
        this.combo1 = combo1;
    }

    public Integer getCombo2() {
        return combo2;
    }

    public void setCombo2(Integer combo2) {
        this.combo2 = combo2;
    }

    public Integer getCombo3() {
        return combo3;
    }

    public void setCombo3(Integer combo3) {
        this.combo3 = combo3;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((combo1 == null) ? 0 : combo1.hashCode());
        result = prime * result + ((combo2 == null) ? 0 : combo2.hashCode());
        result = prime * result + ((combo3 == null) ? 0 : combo3.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((secret == null) ? 0 : secret.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Combo other = (Combo) obj;
        if (combo1 == null) {
            if (other.combo1 != null)
                return false;
        } else if (!combo1.equals(other.combo1))
            return false;
        if (combo2 == null) {
            if (other.combo2 != null)
                return false;
        } else if (!combo2.equals(other.combo2))
            return false;
        if (combo3 == null) {
            if (other.combo3 != null)
                return false;
        } else if (!combo3.equals(other.combo3))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (secret == null) {
            if (other.secret != null)
                return false;
        } else if (!secret.equals(other.secret))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Combo [combo1=" + combo1 + ", combo2=" + combo2 + ", combo3=" + combo3 + ", id=" + id + ", secret="
                + secret + "]";
    }
}