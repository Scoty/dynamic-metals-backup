package bg.free.antonov.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Copyright (C) 2017-2027 antonov.free.bg.
 *
 * @author <a mailto:anton.tz.antonov@gmail.com>Anton Antonov</a>
 * @since 04.06.2017 г.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String material;

    @NotNull
    private String grade;

    @NotNull
    private String specification;

    @NotNull
    private String form;

    @NotNull
    private boolean stockItem;

    @NotNull
    private boolean ultrasonicTesting;

    @NotNull
    private boolean medicalGrade;

    @NotNull
    private boolean oilAndGas;

    private String productWarning;

    private String productWarningNotes;

    private String additionalDetails;

    public Product() {
    }

    public Product(String material, String grade, String specification, String form, boolean stockItem,
                   boolean ultrasonicTesting, boolean medicalGrade, boolean oilAndGas, String productWarning,
                   String productWarningNotes, String additionalDetails) {

        this.material = material;
        this.grade = grade;
        this.specification = specification;
        this.form = form;
        this.stockItem = stockItem;
        this.ultrasonicTesting = ultrasonicTesting;
        this.medicalGrade = medicalGrade;
        this.oilAndGas = oilAndGas;
        this.productWarning = productWarning;
        this.productWarningNotes = productWarningNotes;
        this.additionalDetails = additionalDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public boolean isStockItem() {
        return stockItem;
    }

    public void setStockItem(boolean stockItem) {
        this.stockItem = stockItem;
    }

    public boolean isUltrasonicTesting() {
        return ultrasonicTesting;
    }

    public void setUltrasonicTesting(boolean ultrasonicTesting) {
        this.ultrasonicTesting = ultrasonicTesting;
    }

    public boolean isMedicalGrade() {
        return medicalGrade;
    }

    public void setMedicalGrade(boolean medicalGrade) {
        this.medicalGrade = medicalGrade;
    }

    public boolean isOilAndGas() {
        return oilAndGas;
    }

    public void setOilAndGas(boolean oilAndGas) {
        this.oilAndGas = oilAndGas;
    }

    public String getProductWarning() {
        return productWarning;
    }

    public void setProductWarning(String productWarning) {
        this.productWarning = productWarning;
    }

    public String getProductWarningNotes() {
        return productWarningNotes;
    }

    public void setProductWarningNotes(String productWarningNotes) {
        this.productWarningNotes = productWarningNotes;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (stockItem != product.stockItem) return false;
        if (ultrasonicTesting != product.ultrasonicTesting) return false;
        if (medicalGrade != product.medicalGrade) return false;
        if (oilAndGas != product.oilAndGas) return false;
        if (!material.equals(product.material)) return false;
        if (!grade.equals(product.grade)) return false;
        if (!specification.equals(product.specification)) return false;
        if (!form.equals(product.form)) return false;
        if (productWarning != null ? !productWarning.equals(product.productWarning) : product.productWarning != null)
            return false;
        if (productWarningNotes != null ? !productWarningNotes.equals(product.productWarningNotes) :
                product.productWarningNotes != null)
            return false;
        return additionalDetails != null ? additionalDetails.equals(product.additionalDetails) :
                product.additionalDetails == null;
    }

    @Override
    public int hashCode() {
        int result = material.hashCode();
        result = 31 * result + grade.hashCode();
        result = 31 * result + specification.hashCode();
        result = 31 * result + form.hashCode();
        result = 31 * result + (stockItem ? 1 : 0);
        result = 31 * result + (ultrasonicTesting ? 1 : 0);
        result = 31 * result + (medicalGrade ? 1 : 0);
        result = 31 * result + (oilAndGas ? 1 : 0);
        result = 31 * result + (productWarning != null ? productWarning.hashCode() : 0);
        result = 31 * result + (productWarningNotes != null ? productWarningNotes.hashCode() : 0);
        result = 31 * result + (additionalDetails != null ? additionalDetails.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", material='" + material + '\'' +
                ", grade='" + grade + '\'' +
                ", specification='" + specification + '\'' +
                ", form='" + form + '\'' +
                ", stockItem=" + stockItem +
                ", ultrasonicTesting=" + ultrasonicTesting +
                ", medicalGrade=" + medicalGrade +
                ", oilAndGas=" + oilAndGas +
                ", productWarning='" + productWarning + '\'' +
                ", productWarningNotes='" + productWarningNotes + '\'' +
                ", additionalDetails='" + additionalDetails + '\'' +
                '}';
    }
}
