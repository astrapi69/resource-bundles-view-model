/**
 * The MIT License
 *
 * Copyright (C) 2021 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.db.resource.bundles.domain;

import static org.testng.AssertJUnit.assertNotNull;

import org.testng.annotations.Test;

import io.github.astrapi69.evaluate.object.verifier.ContractVerifier;

/**
 * The unit test class for the class {@link PropertiesValue}
 */
public class PropertiesValueTest
{

	/**
	 * Test method for {@link PropertiesValue} constructors and builders
	 */
	@Test
	public final void testConstructors()
	{
		PropertiesValue model = new PropertiesValue();
		assertNotNull(model);
		model = PropertiesValue.builder().build();
		assertNotNull(model);
	}

	/**
	 * Test method for {@link PropertiesValue#equals(Object)} , {@link PropertiesValue#hashCode()}
	 * and {@link PropertiesValue#toString()}
	 */
	@Test
	public void verifyEqualsHashcodeAndToStringContracts()
	{
		ContractVerifier.of(PropertiesValue.class).verify();
	}
}
