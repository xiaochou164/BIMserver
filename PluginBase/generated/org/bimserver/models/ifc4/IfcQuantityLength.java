/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc4;

/******************************************************************************
 * Copyright (C) 2009-2019  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

public interface IfcQuantityLength extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Length Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Value</em>' attribute.
	 * @see #setLengthValue(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcQuantityLength_LengthValue()
	 * @model
	 * @generated
	 */
	double getLengthValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcQuantityLength#getLengthValue <em>Length Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Value</em>' attribute.
	 * @see #getLengthValue()
	 * @generated
	 */
	void setLengthValue(double value);

	/**
	 * Returns the value of the '<em><b>Length Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Value As String</em>' attribute.
	 * @see #setLengthValueAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcQuantityLength_LengthValueAsString()
	 * @model annotation="asstring"
	 *        annotation="hidden"
	 * @generated
	 */
	String getLengthValueAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcQuantityLength#getLengthValueAsString <em>Length Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Value As String</em>' attribute.
	 * @see #getLengthValueAsString()
	 * @generated
	 */
	void setLengthValueAsString(String value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #isSetFormula()
	 * @see #unsetFormula()
	 * @see #setFormula(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcQuantityLength_Formula()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcQuantityLength#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #isSetFormula()
	 * @see #unsetFormula()
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcQuantityLength#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormula()
	 * @see #getFormula()
	 * @see #setFormula(String)
	 * @generated
	 */
	void unsetFormula();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcQuantityLength#getFormula <em>Formula</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Formula</em>' attribute is set.
	 * @see #unsetFormula()
	 * @see #getFormula()
	 * @see #setFormula(String)
	 * @generated
	 */
	boolean isSetFormula();

} // IfcQuantityLength
