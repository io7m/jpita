/*
 * Copyright © 2016 <code@io7m.com> http://io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.jpita.core;

import com.io7m.jnull.NullCheck;

/**
 * Actions to take when overflow cannot be avoided.
 */

public enum JPOverflowBehaviour
{
  /**
   * Truncate overflowing strings.
   */

  OVERFLOW_TRUNCATE("truncate"),

  /**
   * Allow strings to overflow.
   */

  OVERFLOW_ANYWAY("overflow");


  private final String name;

  JPOverflowBehaviour(final String in_name)
  {
    this.name = NullCheck.notNull(in_name);
  }

  /**
   * @return The value as a humanly-readable string
   */

  public String getName()
  {
    return this.name;
  }

  @Override
  public String toString()
  {
    return this.name;
  }
}