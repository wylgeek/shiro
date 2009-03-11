/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ki;

import java.io.Serializable;

/**
 * Root exception for all Apache Ki runtime exceptions.  This class is used as the root instead
 * of {@link java.lang.SecurityException} to remove the potential for conflicts;  many other
 * frameworks and products (such as J2EE containers) perform special operations when
 * encountering {@link java.lang.SecurityException}.
 *
 * @author Les Hazlewood
 * @since 0.1
 */
public class KiException extends RuntimeException implements Serializable {

    /**
     * Creates a new Apache KiException.
     */
    public KiException() {
        super();
    }

    /**
     * Constructs a new Apache KiException.
     *
     * @param message the reason for the exception
     */
    public KiException(String message) {
        super(message);
    }

    /**
     * Constructs a new Apache KiException.
     *
     * @param cause the underlying Throwable that caused this exception to be thrown.
     */
    public KiException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new Apache KiException.
     *
     * @param message the reason for the exception
     * @param cause   the underlying Throwable that caused this exception to be thrown.
     */
    public KiException(String message, Throwable cause) {
        super(message, cause);
    }

}
