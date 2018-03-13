/*
 * Kill Bill
 * Kill Bill is an open-source billing and payments platform
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.killbill.billing.catalog.api.PhaseType;
import org.killbill.billing.client.model.gen.Duration;
import org.killbill.billing.client.model.gen.Fixed;
import org.killbill.billing.client.model.gen.Recurring;
import org.killbill.billing.client.model.gen.Usage;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class PlanPhase extends KillBillObject {

    private Recurring recurring = null;

    private List<Usage> usages = null;

    private Fixed fixed = null;

    private Duration duration = null;

    private PhaseType phaseType = null;

    private String name = null;

    private String prettyName = null;

    public PlanPhase recurring(Recurring recurring) {
        this.recurring = recurring;
        return this;
    }

    
    public Recurring getRecurring() {
        return recurring;
    }

    public void setRecurring(Recurring recurring) {
        this.recurring = recurring;
    }

    public PlanPhase usages(List<Usage> usages) {
        this.usages = usages;
        return this;
    }

    public PlanPhase addUsagesItem(Usage usagesItem) {
        if (this.usages == null) {
            this.usages = new ArrayList<Usage>();
        }
        this.usages.add(usagesItem);
        return this;
    }

    
    public List<Usage> getUsages() {
        return usages;
    }

    public void setUsages(List<Usage> usages) {
        this.usages = usages;
    }

    public PlanPhase fixed(Fixed fixed) {
        this.fixed = fixed;
        return this;
    }

    
    public Fixed getFixed() {
        return fixed;
    }

    public void setFixed(Fixed fixed) {
        this.fixed = fixed;
    }

    public PlanPhase duration(Duration duration) {
        this.duration = duration;
        return this;
    }

    
    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public PlanPhase phaseType(PhaseType phaseType) {
        this.phaseType = phaseType;
        return this;
    }

    
    public PhaseType getPhaseType() {
        return phaseType;
    }

    public void setPhaseType(PhaseType phaseType) {
        this.phaseType = phaseType;
    }

    public PlanPhase name(String name) {
        this.name = name;
        return this;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlanPhase prettyName(String prettyName) {
        this.prettyName = prettyName;
        return this;
    }

    
    public String getPrettyName() {
        return prettyName;
    }

    public void setPrettyName(String prettyName) {
        this.prettyName = prettyName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanPhase planPhase = (PlanPhase) o;
        return Objects.equals(this.recurring, planPhase.recurring) &&
        Objects.equals(this.usages, planPhase.usages) &&
        Objects.equals(this.fixed, planPhase.fixed) &&
        Objects.equals(this.duration, planPhase.duration) &&
        Objects.equals(this.phaseType, planPhase.phaseType) &&
        Objects.equals(this.name, planPhase.name) &&
        Objects.equals(this.prettyName, planPhase.prettyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recurring, usages, fixed, duration, phaseType, name, prettyName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanPhase {\n");
        
        sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
        sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
        sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    phaseType: ").append(toIndentedString(phaseType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prettyName: ").append(toIndentedString(prettyName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

