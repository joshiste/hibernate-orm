/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.envers.test.interfaces.hbm.propertiesAudited;

import org.junit.jupiter.api.Disabled;

/**
 * @author Hern&aacute;n Chanfreau
 */
@Disabled("NYI - Subclass inheritance support")
public class SubclassPropertiesAuditedTest extends AbstractPropertiesAuditedTest {
	@Override
	protected String[] getMappings() {
		return new String[] { "interfaces/subclassPropertiesAuditedMappings.hbm.xml" };
	}
}