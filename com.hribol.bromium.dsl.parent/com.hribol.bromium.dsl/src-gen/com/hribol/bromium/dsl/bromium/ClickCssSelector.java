/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Click Css Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ClickCssSelector#getCssSelector <em>Css Selector</em>}</li>
 * </ul>
 *
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getClickCssSelector()
 * @model
 * @generated
 */
public interface ClickCssSelector extends WebDriverAction
{
  /**
   * Returns the value of the '<em><b>Css Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Css Selector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Css Selector</em>' containment reference.
   * @see #setCssSelector(ParameterValue)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getClickCssSelector_CssSelector()
   * @model containment="true"
   * @generated
   */
  ParameterValue getCssSelector();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ClickCssSelector#getCssSelector <em>Css Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Css Selector</em>' containment reference.
   * @see #getCssSelector()
   * @generated
   */
  void setCssSelector(ParameterValue value);

} // ClickCssSelector
