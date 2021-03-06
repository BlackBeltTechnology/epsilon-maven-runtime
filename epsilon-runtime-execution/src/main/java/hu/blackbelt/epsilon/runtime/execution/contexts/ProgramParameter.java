package hu.blackbelt.epsilon.runtime.execution.contexts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder(builderMethodName = "programParameterBuilder")
public class ProgramParameter {

    String name;

    String value;
}
