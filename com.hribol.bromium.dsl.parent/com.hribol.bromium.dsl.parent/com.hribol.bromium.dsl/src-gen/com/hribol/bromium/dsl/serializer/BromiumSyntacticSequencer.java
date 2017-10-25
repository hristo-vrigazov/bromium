/*
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.serializer;

import com.google.inject.Inject;
import com.hribol.bromium.dsl.services.BromiumGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BromiumSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BromiumGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ApplicationAction___DoKeyword_5_0_NotKeyword_5_1_q_ExpectKeyword_5_2_HttpKeyword_5_3_RequestKeyword_5_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BromiumGrammarAccess) access;
		match_ApplicationAction___DoKeyword_5_0_NotKeyword_5_1_q_ExpectKeyword_5_2_HttpKeyword_5_3_RequestKeyword_5_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getApplicationActionAccess().getDoKeyword_5_0()), new TokenAlias(false, true, grammarAccess.getApplicationActionAccess().getNotKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getApplicationActionAccess().getExpectKeyword_5_2()), new TokenAlias(false, false, grammarAccess.getApplicationActionAccess().getHttpKeyword_5_3()), new TokenAlias(false, false, grammarAccess.getApplicationActionAccess().getRequestKeyword_5_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ApplicationAction___DoKeyword_5_0_NotKeyword_5_1_q_ExpectKeyword_5_2_HttpKeyword_5_3_RequestKeyword_5_4__q.equals(syntax))
				emit_ApplicationAction___DoKeyword_5_0_NotKeyword_5_1_q_ExpectKeyword_5_2_HttpKeyword_5_3_RequestKeyword_5_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('do' 'not'? 'expect' 'http' 'request')?
	 *
	 * This ambiguous syntax occurs at:
	 *     postcondition=WebDriverAction (ambiguity) (rule end)
	 *     webDriverAction=WebDriverAction (ambiguity) (rule end)
	 */
	protected void emit_ApplicationAction___DoKeyword_5_0_NotKeyword_5_1_q_ExpectKeyword_5_2_HttpKeyword_5_3_RequestKeyword_5_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}