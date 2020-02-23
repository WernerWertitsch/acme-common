package corp.acme.common.domain;

public abstract class BaseEntity {
    protected String id;

    public BaseEntity() {
        this.id = Util.createUUID();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
