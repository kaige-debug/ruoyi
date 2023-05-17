package com.ruoyi.common.core.domain.model;

import java.util.Objects;

public class ShuJuJianKongLogin {

    private String loginUsername;

    private String loginPassword;

    public String getLoginUsername() {
        return loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Override
    public String toString() {
        return "ShuJuJianKongLogin{" +
                "loginUsername='" + loginUsername + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShuJuJianKongLogin that = (ShuJuJianKongLogin) o;
        return Objects.equals(loginUsername, that.loginUsername) && Objects.equals(loginPassword, that.loginPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginUsername, loginPassword);
    }
}
