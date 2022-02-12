package it.unige.fdt.scriptablesensor.model.feature.systemsimulator.integrator.fixed;

import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemSimulatorMidpointIntegratorSettings extends SystemSimulatorFixedStepIntegratorSettings {

    public SystemSimulatorMidpointIntegratorSettings(@JsonProperty("stepSize") double stepSize,
	    @JsonProperty("checkTolerance") double checkTolerance,
	    @JsonProperty("checkMaxTimeBetween") double checkMaxTimeBetween,
	    @JsonProperty("checkMaxIterations") int checkMaxIterations) {
	super(stepSize, checkTolerance, checkMaxTimeBetween, checkMaxIterations);
    }

    @Override
    public FirstOrderIntegrator buildIntegrator() {
	return new MidpointIntegrator(stepSize);
    }

}
