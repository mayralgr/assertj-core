/*
 * Created on Sep 30, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.error;

import static org.junit.Assert.*;

import org.fest.assertions.core.Condition;
import org.fest.assertions.core.TestCondition;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for <code>{@link WhenConditionMetErrorFactory#errorWhenConditionMet(Object, Condition)}</code>.
 *
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class WhenConditionMetErrorFactory_errorWhenConditionMet_Test {

  private static Object actual;
  private static Condition<?> condition;

  @BeforeClass public static void setUpOnce() {
    actual = new Object();
    condition = new TestCondition<Object>();
  }

  @Test public void should_create_new_AssertionErrorFactory() {
    AssertionErrorFactory factory = WhenConditionMetErrorFactory.errorWhenConditionMet(actual, condition);
    assertEquals(WhenConditionMetErrorFactory.class, factory.getClass());
  }

  @Test public void should_pass_actual_and_Condition() {
    WhenConditionMetErrorFactory factory =
      (WhenConditionMetErrorFactory) WhenConditionMetErrorFactory.errorWhenConditionMet(actual, condition);
    assertSame(actual, factory.actual);
    assertSame(condition, factory.condition);
  }
}
