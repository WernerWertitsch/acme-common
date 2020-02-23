package corp.acme.common.domain;

import java.math.BigDecimal;

public class Fee extends BaseEntity  {
    Category category;
    BigDecimal ceiling;
    Double feePrct;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getCeiling() {
        return ceiling;
    }

    public void setCeiling(BigDecimal ceiling) {
        this.ceiling = ceiling;
    }

    public Double getFeePrct() {
        return feePrct;
    }

    public void setFeePrct(Double feePrct) {
        this.feePrct = feePrct;
    }

    public Fee() {
        super();
    }

    @Override
    public String toString() {
        return String.format("Fee: UpperLimit: %s, Category: %s, Fee: %s", this.ceiling.toString(), this.category.name, this.feePrct);
    }
}
