package corp.acme.common.domain;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class Product extends BaseEntity {
    Classification classification;
    Double feePrct;
    BigDecimal insuredValue;
    BigDecimal premium;
    Boolean cancelled;
    Date insuredFrom;
    Boolean insured;
    // Some link to the customner should be here obviously, but not implemented

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Double getFeePrct() {
        return feePrct;
    }

    public void setFeePrct(Double feePrct) {
        this.feePrct = feePrct;
    }

    public BigDecimal getInsuredValue() {
        return insuredValue;
    }

    public void setInsuredValue(BigDecimal insuredValue) {
        this.insuredValue = insuredValue;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Date getInsuredFrom() {
        return insuredFrom;
    }

    public void setInsuredFrom(Date insuredFrom) {
        this.insuredFrom = insuredFrom;
    }

    public Boolean getInsured() {
        return insured;
    }

    public void setInsured(Boolean insured) {
        this.insured = insured;
    }
}
