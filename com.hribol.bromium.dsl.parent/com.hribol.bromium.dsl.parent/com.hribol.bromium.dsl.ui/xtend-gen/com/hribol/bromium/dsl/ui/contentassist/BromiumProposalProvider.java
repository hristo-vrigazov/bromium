/**
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.ui.contentassist;

import com.hribol.bromium.dsl.ui.contentassist.AbstractBromiumProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class BromiumProposalProvider extends AbstractBromiumProposalProvider {
  @Override
  public void complete_WebDriverAction(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    acceptor.accept(this.createCompletionProposal("click on element with css selector", context));
    acceptor.accept(this.createCompletionProposal("type \'text\' in element with css selector \'selector\'", context));
    super.complete_WebDriverAction(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void complete_ApplicationAction(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    acceptor.accept(this.createCompletionProposal("do not expect http request", context));
    acceptor.accept(this.createCompletionProposal("do expect http request", context));
    super.complete_ApplicationAction(model, ruleCall, context, acceptor);
  }
}