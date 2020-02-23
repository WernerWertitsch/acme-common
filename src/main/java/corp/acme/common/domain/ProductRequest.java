package corp.acme.common.domain;

import java.math.BigDecimal;

public class ProductRequest extends BaseEntity {
    Classification classification;
    BigDecimal value;

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
