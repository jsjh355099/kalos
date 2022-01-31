package com.cp.kalos.Bean;

import lombok.Data;
import lombok.Generated;
import java.util.Map;

@Data
public class ScopeVector {
	@Generated
	private String scopeName;

	private Map<Sequins,Integer> sequinsIntegerMap;

}
