/**
 */
package robotmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Grid Literal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see robotmodel.RobotmodelPackage#getGridLiteral()
 * @model
 * @generated
 */
public enum GridLiteral implements Enumerator {
	/**
	 * The '<em><b>Build Wall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUILD_WALL_VALUE
	 * @generated
	 * @ordered
	 */
	BUILD_WALL(0, "buildWall", "buildWall"),

	/**
	 * The '<em><b>Destroy Wall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROY_WALL_VALUE
	 * @generated
	 * @ordered
	 */
	DESTROY_WALL(0, "destroyWall", "destroyWall"),

	/**
	 * The '<em><b>Pick Mark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PICK_MARK_VALUE
	 * @generated
	 * @ordered
	 */
	PICK_MARK(0, "pickMark", "pickMark"),

	/**
	 * The '<em><b>Drop Mark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROP_MARK_VALUE
	 * @generated
	 * @ordered
	 */
	DROP_MARK(0, "dropMark", "dropMark");

	/**
	 * The '<em><b>Build Wall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Build Wall</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUILD_WALL
	 * @model name="buildWall"
	 * @generated
	 * @ordered
	 */
	public static final int BUILD_WALL_VALUE = 0;

	/**
	 * The '<em><b>Destroy Wall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Destroy Wall</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESTROY_WALL
	 * @model name="destroyWall"
	 * @generated
	 * @ordered
	 */
	public static final int DESTROY_WALL_VALUE = 0;

	/**
	 * The '<em><b>Pick Mark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pick Mark</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PICK_MARK
	 * @model name="pickMark"
	 * @generated
	 * @ordered
	 */
	public static final int PICK_MARK_VALUE = 0;

	/**
	 * The '<em><b>Drop Mark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drop Mark</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DROP_MARK
	 * @model name="dropMark"
	 * @generated
	 * @ordered
	 */
	public static final int DROP_MARK_VALUE = 0;

	/**
	 * An array of all the '<em><b>Grid Literal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GridLiteral[] VALUES_ARRAY =
		new GridLiteral[] {
			BUILD_WALL,
			DESTROY_WALL,
			PICK_MARK,
			DROP_MARK,
		};

	/**
	 * A public read-only list of all the '<em><b>Grid Literal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GridLiteral> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Grid Literal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GridLiteral get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GridLiteral result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grid Literal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GridLiteral getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GridLiteral result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grid Literal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GridLiteral get(int value) {
		switch (value) {
			case BUILD_WALL_VALUE: return BUILD_WALL;
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
	private GridLiteral(int value, String name, String literal) {
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
	
} //GridLiteral
