package com.github.pfmiles.dropincc.impl.syntactical;

import java.util.List;

import com.github.pfmiles.dropincc.impl.llstar.PredictingGrule;
import com.github.pfmiles.dropincc.impl.llstar.PredictingKleene;

/**
 * @author pf-miles
 * 
 */
public class PredictingResult {

    private List<PredictingGrule> pgs;
    private List<PredictingKleene> pks;
    private String debugMsgs;
    private String warnings;

    public PredictingResult(List<PredictingGrule> pgs, List<PredictingKleene> pks, String debugMsgs, String warnings) {
        this.pgs = pgs;
        this.pks = pks;
        this.debugMsgs = debugMsgs;
        this.warnings = warnings;
    }

    public List<PredictingGrule> getPgs() {
        return pgs;
    }

    public void setPgs(List<PredictingGrule> pgs) {
        this.pgs = pgs;
    }

    public List<PredictingKleene> getPks() {
        return pks;
    }

    public void setPks(List<PredictingKleene> pks) {
        this.pks = pks;
    }

    public String getDebugMsgs() {
        return debugMsgs;
    }

    public void setDebugMsgs(String debugMsgs) {
        this.debugMsgs = debugMsgs;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }
}
