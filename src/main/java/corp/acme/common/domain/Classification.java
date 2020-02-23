package corp.acme.common.domain;

public class Classification extends BaseEntity {
    String name;
    Category category;

    public Classification() {
        this.id = Util.createUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
