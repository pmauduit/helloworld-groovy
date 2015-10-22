//
// Generated from archetype; please customize.
//

package fr.beneth

import fr.beneth.Helper
import fr.beneth.Example

/**
 * Tests for the {@link Helper} class.
 */
class HelperTest
    extends GroovyTestCase
{
    void testHelp() {
        new Helper().help(new Example())
    }
}
