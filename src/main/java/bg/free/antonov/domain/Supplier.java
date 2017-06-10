package bg.free.antonov.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Copyright (C) 2017-2027 antonov.free.bg.
 *
 * @author <a mailto:anton.tz.antonov@gmail.com>Anton Antonov</a>
 * @since 04.06.2017 г.
 */

@Entity
public class Supplier {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String companyName;

    @NotNull
    private String address;

    @NotNull
    private String telephone;

    @NotNull
    private String mainContactName;

    @NotNull
    private String contactEmail;

    @NotNull
    private String contactMobileNum;

    @NotNull
    private boolean preferred;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> productList;

    public Supplier() {
    }

    public Supplier(String companyName, String address, String telephone, String mainContactName, String contactEmail,
                    String contactMobileNum, boolean preferred) {

        this.companyName = companyName;
        this.address = address;
        this.telephone = telephone;
        this.mainContactName = mainContactName;
        this.contactEmail = contactEmail;
        this.contactMobileNum = contactMobileNum;
        this.preferred = preferred;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMainContactName() {
        return mainContactName;
    }

    public void setMainContactName(String mainContactName) {
        this.mainContactName = mainContactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactMobileNum() {
        return contactMobileNum;
    }

    public void setContactMobileNum(String contactMobileNum) {
        this.contactMobileNum = contactMobileNum;
    }

    public boolean isPreferred() {
        return preferred;
    }

    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        if (id != supplier.id) return false;
        if (preferred != supplier.preferred) return false;
        if (!companyName.equals(supplier.companyName)) return false;
        if (!address.equals(supplier.address)) return false;
        if (!telephone.equals(supplier.telephone)) return false;
        if (!mainContactName.equals(supplier.mainContactName)) return false;
        if (!contactEmail.equals(supplier.contactEmail)) return false;
        if (!contactMobileNum.equals(supplier.contactMobileNum)) return false;
        return productList != null ? productList.equals(supplier.productList) : supplier.productList == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + companyName.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + telephone.hashCode();
        result = 31 * result + mainContactName.hashCode();
        result = 31 * result + contactEmail.hashCode();
        result = 31 * result + contactMobileNum.hashCode();
        result = 31 * result + (preferred ? 1 : 0);
        result = 31 * result + (productList != null ? productList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mainContactName='" + mainContactName + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactMobileNum='" + contactMobileNum + '\'' +
                ", preferred=" + preferred +
                ", productList=" + productList +
                '}';
    }
}
