/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum T_959SpecialCharacters implements org.jooq.EnumType {

	enum_28("enum("),

	_28("("),

	_29(")"),

	_2c(","),

	_27("'"),

	_29enum(")enum");

	private final java.lang.String literal;

	private T_959SpecialCharacters(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "t_959_special_characters";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}