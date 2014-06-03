/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ää extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.ÄäRecord> {

	private static final long serialVersionUID = -799540649;

	/**
	 * The singleton instance of <code>PUBLIC.Ää</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.Ää ÄÄ = new org.jooq.test.h2.generatedclasses.tables.Ää();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.ÄäRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.ÄäRecord.class;
	}

	/**
	 * The column <code>PUBLIC.Ää.Öö</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.ÄäRecord, java.lang.Integer> ÖÖ = createField("Öö", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>PUBLIC.Ää</code> table reference
	 */
	public Ää() {
		this("Ää", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.Ää</code> table reference
	 */
	public Ää(java.lang.String alias) {
		this(alias, org.jooq.test.h2.generatedclasses.tables.Ää.ÄÄ);
	}

	private Ää(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.ÄäRecord> aliased) {
		this(alias, aliased, null);
	}

	private Ää(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.ÄäRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.h2.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.h2.generatedclasses.tables.Ää as(java.lang.String alias) {
		return new org.jooq.test.h2.generatedclasses.tables.Ää(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.h2.generatedclasses.tables.Ää rename(java.lang.String name) {
		return new org.jooq.test.h2.generatedclasses.tables.Ää(name, null);
	}
}
