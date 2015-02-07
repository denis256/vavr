/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

import java.io.Serializable;

/**
 * Checked version of java.util.function.LongSupplier.
 * Essentially the same as {@code CheckedFunction0<Long>}, or short {@code X0<Long>}.
 */
@FunctionalInterface
public interface CheckedLongSupplier extends Serializable {

    long getAsLong() throws Throwable;
}