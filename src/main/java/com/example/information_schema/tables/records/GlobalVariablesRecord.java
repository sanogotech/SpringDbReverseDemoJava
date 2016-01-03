/**
 * This class is generated by jOOQ
 */
package com.example.information_schema.tables.records;


import com.example.information_schema.tables.GlobalVariables;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GlobalVariablesRecord extends TableRecordImpl<GlobalVariablesRecord> implements Record2<String, String> {

	private static final long serialVersionUID = 569266187;

	/**
	 * Setter for <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
	 */
	public void setVariableName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
	 */
	public String getVariableName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
	 */
	public void setVariableValue(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
	 */
	public String getVariableValue() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return GlobalVariables.GLOBAL_VARIABLES.VARIABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return GlobalVariables.GLOBAL_VARIABLES.VARIABLE_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getVariableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getVariableValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobalVariablesRecord value1(String value) {
		setVariableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobalVariablesRecord value2(String value) {
		setVariableValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobalVariablesRecord values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GlobalVariablesRecord
	 */
	public GlobalVariablesRecord() {
		super(GlobalVariables.GLOBAL_VARIABLES);
	}

	/**
	 * Create a detached, initialised GlobalVariablesRecord
	 */
	public GlobalVariablesRecord(String variableName, String variableValue) {
		super(GlobalVariables.GLOBAL_VARIABLES);

		setValue(0, variableName);
		setValue(1, variableValue);
	}
}
