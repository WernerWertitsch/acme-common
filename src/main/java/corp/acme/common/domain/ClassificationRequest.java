package corp.acme.common.domain;

import java.util.List;

public class ClassificationRequest {

    List<String> substanceNames;

    public List<String> getSubstanceNames() {
        return substanceNames;
    }

    public void setSubstanceNames(List<String> substanceNames) {
        this.substanceNames = substanceNames;
    }


}
