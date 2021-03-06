package com.dubture.editor.sass.ui.editor;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class AntlrTokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		
		String calculateId = super.calculateId(tokenName, tokenType);
		
		System.err.println("token: " + tokenName);
		
		if ("RULE_WORD".equals(tokenName)) {
			return SassHighlightingConfiguration.WORD_ID;
		} else if ("RULE_VARIABLE".equals(tokenName)) {
			return SassHighlightingConfiguration.VARIABLE_ID;			
		}  else if ("RULE_SELECTOR".equals(tokenName)) {
			return SassHighlightingConfiguration.SELECTOR_ID;			
		}  else if ("RULE_BRACE_LEFT".equals(tokenName)) {
			return SassHighlightingConfiguration.BRACE_LEFT;			
		}  else if ("RULE_BRACE_RIGHT".equals(tokenName)) {
			return SassHighlightingConfiguration.BRACE_RIGHT;			
		}  else if ("RULE_HASH".equals(tokenName)) {
			return SassHighlightingConfiguration.HASH_ID;			
		}  else if ("RULE_MIXIN_ID".equals(tokenName)) {
			return SassHighlightingConfiguration.MIXIN_ID;			
		}  else if ("RULE_INCLUDE_ID".equals(tokenName)) {
			return SassHighlightingConfiguration.INCLUDE_ID;			
		}  else if ("RULE_HEX_COLOR".equals(tokenName)) {
			return SassHighlightingConfiguration.HEX_COLOR_ID;			
		}
		
		return calculateId;
	}
}
