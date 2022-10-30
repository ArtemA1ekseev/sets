package homework3;

import java.util.Objects;

public class Michanic <T extends Transport>{

    private final String name;
    private final String surename;
    private final String company;

    public Michanic(String name, String surename, String company) {
        this.name = name;
        this.surename = surename;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public String getCompany() {
        return company;
    }

    public boolean service (T t) {
        return t.service();
    }

    public void repair(T t) {
        t.repair();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Michanic<?> michanic = (Michanic<?>) o;
        return Objects.equals(name, michanic.name) && Objects.equals(surename, michanic.surename) && Objects.equals(company, michanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, company);
    }
}
