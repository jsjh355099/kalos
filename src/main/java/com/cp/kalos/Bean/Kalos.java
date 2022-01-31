package com.cp.kalos.Bean;

import lombok.Data;
import lombok.NonNull;

import java.util.Map;
import java.util.Set;

@Data
public class Kalos {
	private String syscode;

	private String account;

	private String password;

	@NonNull
	private Map<ScopeVector,Integer> scopeVectorIntegerMap;

}
