package org.assertj.core.api.shortarray;

import org.assertj.core.api.ShortArrayAssert;
import org.assertj.core.api.ShortArrayAssertBaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
import static org.assertj.core.test.ShortArrays.arrayOf;
import static org.mockito.Mockito.verify;

/**
 * Tests for <code>{@link ShortArrayAssert#containsExactly(Short[])}</code>.
 *
 * @author Lucero Garcia
 */
@DisplayName("ShortArrayAssert containsExactly(Short[])")
public class ShortArrayAssert_containsExactlyInAnyOrder_with_Short_array_Test extends ShortArrayAssertBaseTest {

  @Test
  void should_fail_if_values_is_null() {
    // GIVEN
    Short[] values = null;
    // WHEN
    Throwable thrown = catchThrowable(() -> assertions.containsExactly(values));
    // THEN
    then(thrown).isInstanceOf(NullPointerException.class)
                .hasMessage(shouldNotBeNull("values").create());
  }

  @Override
  protected ShortArrayAssert invoke_api_method() {
    return assertions.containsExactly(new Short[] { 1, 2 });
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertContainsExactly(getInfo(assertions), getActual(assertions), arrayOf(1, 2));
  }

}