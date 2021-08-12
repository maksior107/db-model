package dbmodel.comms;

import dbmodel.models.Helper;

import java.util.List;

public class GetHelpersResponse {
    private List<Helper> helpers;

    public List<Helper> getHelpers() {
        return helpers;
    }

    void setHelpers(List<Helper> helpers) {
        this.helpers = helpers;
    }
}
