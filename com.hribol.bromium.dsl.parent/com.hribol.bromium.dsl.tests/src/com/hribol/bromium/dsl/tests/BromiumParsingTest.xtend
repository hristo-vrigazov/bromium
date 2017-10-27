/*
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.tests

import com.google.inject.Inject
import com.hribol.bromium.dsl.bromium.Model
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(BromiumInjectorProvider)
class BromiumParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void scopingOfExposedParameters() {
		val result = parseHelper.parse('''
			name 'Example name'
			version '8.2.5'
			actions {
			    action 'Type ' content 'into username field'
				type content in element with css selector '#login' 
				do not expect http request
				
				action 'Click on login button'
				click on element with css selector content
				do not expect http request
				
			}
		''')
		
		Assert.assertNotNull(result)
		Assert.assertFalse(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			name 'Demo app'
			version '0.1.0'
			actions {
				action 'Load login page'
				load page '/login'
				do expect http request
			
				action 'Type username'
				type "admin" in element with css selector "#user"
				do not expect http request
			
				action 'Type password'
				type "admin" in element with css selector "#pass"
				do not expect http request
			
				action 'Click login button'
				click on element with css selector "#login"
				do expect http request
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
