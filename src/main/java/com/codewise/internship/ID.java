package com.codewise.internship;

/**
 * Created by Kamil on 2016-06-20.
 */
public class ID {
    private String clientId;

    public ID(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() {
        return clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ID id = (ID) o;

        return getClientId() != null ? getClientId().equals(id.getClientId()) : id.getClientId() == null;

    }

    @Override
    public int hashCode() {
        return getClientId() != null ? getClientId().hashCode() : 0;
    }
}
