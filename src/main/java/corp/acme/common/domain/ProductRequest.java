package corp.acme.common.domain;

import java.math.BigDecimal;

public class ProductRequest {
    String categoryId;
    BigDecimal value;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
