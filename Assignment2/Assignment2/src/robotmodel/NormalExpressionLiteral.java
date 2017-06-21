/**
 */
package robotmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Normal Expression Literal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see robotmodel.RobotmodelPackage#getNormalExpressionLiteral()
 * @model
 * @generated
 */
public enum NormalExpressionLiteral implements Enumerator {
	/**
	 * The '<em><b>Full</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_VALUE
	 * @generated
	 * @ordered
	 */
	FULL(0, "full", "full"),

	/**
	 * The '<em><b>Mark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARK_VALUE
	 * @generated
	 * @ordered
	 */
	MARK(1, "mark", "mark");

	/**
	 * The '<em><b>Full</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Full</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL
	 * @model name="full"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_VALUE = 0;

	/**
	 * The '<em><b>Mark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mark</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARK
	 * @model name="mark"
	 * @generated
	 * @ordered
	 */
	public static final int MARK_VALUE = 1;

	/**
	 * An array of all the '<em><b>Normal Expression Literal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NormalExpressionLiteral[] VALUES_ARRAY =
		new NormalExpressionLiteral[] {
			FULL,
			MARK,
		};

	/**
	 * A public read-only list of all the '<em><b>Normal Expression Literal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NormalExpressionLiteral> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Normal Expression Literal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NormalExpressionLiteral get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NormalExpressionLiteral result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Normal Expression Literal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NormalExpressionLiteral getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NormalExpressionLiteral result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Normal Expression Literal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NormalExpressionLiteral get(int value) {
		switch (value) {
			case FULL_VALUE: return FULL;
			case MARK_VALUE: return MARK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NormalExpressionLiteral(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NormalExpressionLiteral
