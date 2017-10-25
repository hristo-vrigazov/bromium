/**
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.bromium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Click On Element With Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ClickOnElementWithId#getCssSelector <em>Css Selector</em>}</li>
 * </ul>
 *
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getClickOnElementWithId()
 * @model
 * @generated
 */
public interface ClickOnElementWithId extends WebDriverAction
{
  /**
   * Returns the value of the '<em><b>Css Selector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Css Selector</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Css Selector</em>' attribute.
   * @see #setCssSelector(String)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getClickOnElementWithId_CssSelector()
   * @model
   * @generated
   */
  String getCssSelector();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ClickOnElementWithId#getCssSelector <em>Css Selector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Css Selector</em>' attribute.
   * @see #getCssSelector()
   * @generated
   */
  void setCssSelector(String value);

} // ClickOnElementWithId