/*
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BromiumAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/hribol/bromium/dsl/parser/antlr/internal/InternalBromium.tokens");
	}
}