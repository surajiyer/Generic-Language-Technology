/**
 */
package robotmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Keyword</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see robotmodel.RobotmodelPackage#getKeyword()
 * @model
 * @generated
 */
public enum Keyword implements Enumerator {
	/**
	 * The '<em><b>Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SCRIPT(0, "Script", "Script"),

	/**
	 * The '<em><b>Runs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNS_VALUE
	 * @generated
	 * @ordered
	 */
	RUNS(1, "runs", "runs"),

	/**
	 * The '<em><b>As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS_VALUE
	 * @generated
	 * @ordered
	 */
	AS(2, "as", "as"),

	/**
	 * The '<em><b>End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_VALUE
	 * @generated
	 * @ordered
	 */
	END(3, "end", "end"),

	/**
	 * The '<em><b>Step</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEP_VALUE
	 * @generated
	 * @ordered
	 */
	STEP(4, "step", "step"),

	/**
	 * The '<em><b>Turn Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURN_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TURN_LEFT(5, "turnLeft", "turnLeft"),

	/**
	 * The '<em><b>Drop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROP_VALUE
	 * @generated
	 * @ordered
	 */
	DROP(6, "drop", "drop"),

	/**
	 * The '<em><b>Pick</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PICK_VALUE
	 * @generated
	 * @ordered
	 */
	PICK(7, "pick", "pick"),

	/**
	 * The '<em><b>Trace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACE_VALUE
	 * @generated
	 * @ordered
	 */
	TRACE(8, "trace", "trace"),

	/**
	 * The '<em><b>Full</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_VALUE
	 * @generated
	 * @ordered
	 */
	FULL(9, "full", "full"),

	/**
	 * The '<em><b>Heading</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADING_VALUE
	 * @generated
	 * @ordered
	 */
	HEADING(10, "heading", "heading"),

	/**
	 * The '<em><b>North</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH(11, "north", "north"),

	/**
	 * The '<em><b>If</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF_VALUE
	 * @generated
	 * @ordered
	 */
	IF(12, "if", "if"),

	/**
	 * The '<em><b>Do</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DO_VALUE
	 * @generated
	 * @ordered
	 */
	DO(13, "do", "do"),

	/**
	 * The '<em><b>Else</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELSE_VALUE
	 * @generated
	 * @ordered
	 */
	ELSE(14, "else", "else"),

	/**
	 * The '<em><b>While</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE_VALUE
	 * @generated
	 * @ordered
	 */
	WHILE(15, "while", "while"),

	/**
	 * The '<em><b>Repeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT(16, "repeat", "repeat"),

	/**
	 * The '<em><b>Times</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMES_VALUE
	 * @generated
	 * @ordered
	 */
	TIMES(17, "times", "times");

	/**
	 * The '<em><b>Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Script</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCRIPT
	 * @model name="Script"
	 * @generated
	 * @ordered
	 */
	public static final int SCRIPT_VALUE = 0;

	/**
	 * The '<em><b>Runs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Runs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUNS
	 * @model name="runs"
	 * @generated
	 * @ordered
	 */
	public static final int RUNS_VALUE = 1;

	/**
	 * The '<em><b>As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>As</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AS
	 * @model name="as"
	 * @generated
	 * @ordered
	 */
	public static final int AS_VALUE = 2;

	/**
	 * The '<em><b>End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END
	 * @model name="end"
	 * @generated
	 * @ordered
	 */
	public static final int END_VALUE = 3;

	/**
	 * The '<em><b>Step</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Step</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEP
	 * @model name="step"
	 * @generated
	 * @ordered
	 */
	public static final int STEP_VALUE = 4;

	/**
	 * The '<em><b>Turn Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Turn Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TURN_LEFT
	 * @model name="turnLeft"
	 * @generated
	 * @ordered
	 */
	public static final int TURN_LEFT_VALUE = 5;

	/**
	 * The '<em><b>Drop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DROP
	 * @model name="drop"
	 * @generated
	 * @ordered
	 */
	public static final int DROP_VALUE = 6;

	/**
	 * The '<em><b>Pick</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pick</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PICK
	 * @model name="pick"
	 * @generated
	 * @ordered
	 */
	public static final int PICK_VALUE = 7;

	/**
	 * The '<em><b>Trace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trace</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRACE
	 * @model name="trace"
	 * @generated
	 * @ordered
	 */
	public static final int TRACE_VALUE = 8;

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
	public static final int FULL_VALUE = 9;

	/**
	 * The '<em><b>Heading</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Heading</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADING
	 * @model name="heading"
	 * @generated
	 * @ordered
	 */
	public static final int HEADING_VALUE = 10;

	/**
	 * The '<em><b>North</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>North</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH
	 * @model name="north"
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_VALUE = 11;

	/**
	 * The '<em><b>If</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>If</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IF
	 * @model name="if"
	 * @generated
	 * @ordered
	 */
	public static final int IF_VALUE = 12;

	/**
	 * The '<em><b>Do</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Do</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DO
	 * @model name="do"
	 * @generated
	 * @ordered
	 */
	public static final int DO_VALUE = 13;

	/**
	 * The '<em><b>Else</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Else</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELSE
	 * @model name="else"
	 * @generated
	 * @ordered
	 */
	public static final int ELSE_VALUE = 14;

	/**
	 * The '<em><b>While</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>While</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHILE
	 * @model name="while"
	 * @generated
	 * @ordered
	 */
	public static final int WHILE_VALUE = 15;

	/**
	 * The '<em><b>Repeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repeat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEAT
	 * @model name="repeat"
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_VALUE = 16;

	/**
	 * The '<em><b>Times</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Times</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMES
	 * @model name="times"
	 * @generated
	 * @ordered
	 */
	public static final int TIMES_VALUE = 17;

	/**
	 * An array of all the '<em><b>Keyword</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Keyword[] VALUES_ARRAY =
		new Keyword[] {
			SCRIPT,
			RUNS,
			AS,
			END,
			STEP,
			TURN_LEFT,
			DROP,
			PICK,
			TRACE,
			FULL,
			HEADING,
			NORTH,
			IF,
			DO,
			ELSE,
			WHILE,
			REPEAT,
			TIMES,
		};

	/**
	 * A public read-only list of all the '<em><b>Keyword</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Keyword> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Keyword</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Keyword get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Keyword result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Keyword</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Keyword getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Keyword result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Keyword</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Keyword get(int value) {
		switch (value) {
			case SCRIPT_VALUE: return SCRIPT;
			case RUNS_VALUE: return RUNS;
			case AS_VALUE: return AS;
			case END_VALUE: return END;
			case STEP_VALUE: return STEP;
			case TURN_LEFT_VALUE: return TURN_LEFT;
			case DROP_VALUE: return DROP;
			case PICK_VALUE: return PICK;
			case TRACE_VALUE: return TRACE;
			case FULL_VALUE: return FULL;
			case HEADING_VALUE: return HEADING;
			case NORTH_VALUE: return NORTH;
			case IF_VALUE: return IF;
			case DO_VALUE: return DO;
			case ELSE_VALUE: return ELSE;
			case WHILE_VALUE: return WHILE;
			case REPEAT_VALUE: return REPEAT;
			case TIMES_VALUE: return TIMES;
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
	private Keyword(int value, String name, String literal) {
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
	
} //Keyword
